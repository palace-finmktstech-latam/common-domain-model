package com.example.cdm;

import java.io.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import com.rosetta.model.lib.RosettaModelObject;
import com.rosetta.model.lib.annotations.RosettaClass;
import com.rosetta.model.lib.annotations.RosettaAttribute;
import com.rosetta.model.lib.meta.RosettaMetaData;

/**
 * Comprehensive CDM Explorer that recursively analyzes CDM classes and generates documentation
 */
public class CDMExplorer {
    
    private final Set<String> exploredClasses = new HashSet<>();
    private final Map<String, ClassInfo> classInfoMap = new HashMap<>();
    private final Set<String> cdmPackages = Set.of(
        "cdm.event",
        "cdm.product", 
        "cdm.base",
        "cdm.observable",
        "cdm.legaldocumentation",
        "cdm.legalagreement"
    );
    
    private static final int MAX_DEPTH = 5; // Prevent infinite recursion
    private static final Set<String> SKIP_PACKAGES = Set.of(
        "java.",
        "javax.",
        "com.sun.",
        "sun.",
        "com.rosetta.model.lib.",
        "com.rosetta.util.",
        "com.fasterxml.",
        "org.slf4j."
    );
    
    public static class ClassInfo {
        String fullName;
        String simpleName;
        String packageName;
        String description;
        boolean isEnum;
        boolean isInterface;
        boolean isAbstract;
        boolean isBuilder;
        List<FieldInfo> fields = new ArrayList<>();
        List<MethodInfo> methods = new ArrayList<>();
        List<String> enumValues = new ArrayList<>();
        List<String> superClasses = new ArrayList<>();
        List<String> interfaces = new ArrayList<>();
        List<String> subClasses = new ArrayList<>();
        Map<String, String> annotations = new HashMap<>();
    }
    
    public static class FieldInfo {
        String name;
        String type;
        String genericType;
        boolean isRequired;
        boolean isList;
        String description;
        Map<String, String> annotations = new HashMap<>();
    }
    
    public static class MethodInfo {
        String name;
        String returnType;
        List<String> parameters = new ArrayList<>();
        String description;
        boolean isBuilder;
        boolean isSetter;
        boolean isGetter;
        boolean isAdder;
    }
    
    public void explorePackage(String packageName) {
        System.out.println("Exploring package: " + packageName);
        
        try {
            // Get all classes in the package using classpath scanning
            Set<Class<?>> classes = findClassesInPackage(packageName);
            
            for (Class<?> clazz : classes) {
                if (!shouldSkipClass(clazz)) {
                    exploreClass(clazz, 0);
                }
            }
        } catch (Exception e) {
            System.err.println("Error exploring package " + packageName + ": " + e.getMessage());
        }
    }
    
    private Set<Class<?>> findClassesInPackage(String packageName) {
        Set<Class<?>> classes = new HashSet<>();
        String path = packageName.replace('.', '/');
        
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            var resources = classLoader.getResources(path);
            
            while (resources.hasMoreElements()) {
                var resource = resources.nextElement();
                if (resource.getProtocol().equals("jar")) {
                    // Handle JAR files
                    String jarPath = resource.getPath().substring(5, resource.getPath().indexOf("!"));
                    try (var jar = new java.util.jar.JarFile(jarPath)) {
                        var entries = jar.entries();
                        while (entries.hasMoreElements()) {
                            var entry = entries.nextElement();
                            String name = entry.getName();
                            if (name.startsWith(path) && name.endsWith(".class")) {
                                String className = name.substring(0, name.length() - 6).replace('/', '.');
                                try {
                                    Class<?> clazz = Class.forName(className);
                                    classes.add(clazz);
                                } catch (Throwable t) {
                                    // Skip classes that can't be loaded
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error scanning package " + packageName + ": " + e.getMessage());
        }
        
        return classes;
    }
    
    public ClassInfo exploreClass(Class<?> clazz, int depth) {
        if (depth > MAX_DEPTH || exploredClasses.contains(clazz.getName())) {
            return classInfoMap.get(clazz.getName());
        }
        
        exploredClasses.add(clazz.getName());
        ClassInfo info = new ClassInfo();
        info.fullName = clazz.getName();
        info.simpleName = clazz.getSimpleName();
        info.packageName = clazz.getPackage() != null ? clazz.getPackage().getName() : "";
        info.isEnum = clazz.isEnum();
        info.isInterface = clazz.isInterface();
        info.isAbstract = Modifier.isAbstract(clazz.getModifiers());
        info.isBuilder = clazz.getName().contains("Builder");
        
        // Get annotations
        extractAnnotations(clazz, info.annotations);
        
        // Get description from RosettaClass annotation if available
        RosettaClass rosettaClass = clazz.getAnnotation(RosettaClass.class);
        if (rosettaClass != null) {
            info.description = "CDM Class: " + info.simpleName;
        }
        
        // Handle enums
        if (info.isEnum) {
            Object[] constants = clazz.getEnumConstants();
            if (constants != null) {
                for (Object constant : constants) {
                    info.enumValues.add(constant.toString());
                }
            }
        }
        
        // Get superclass and interfaces
        Class<?> superclass = clazz.getSuperclass();
        if (superclass != null && !superclass.equals(Object.class)) {
            info.superClasses.add(superclass.getName());
        }
        
        for (Class<?> iface : clazz.getInterfaces()) {
            if (!iface.getName().startsWith("java.")) {
                info.interfaces.add(iface.getName());
            }
        }
        
        // Explore fields
        exploreFields(clazz, info, depth);
        
        // Explore methods
        exploreMethods(clazz, info, depth);
        
        classInfoMap.put(clazz.getName(), info);
        return info;
    }
    
    private void exploreFields(Class<?> clazz, ClassInfo info, int depth) {
        for (Field field : clazz.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) || 
                Modifier.isFinal(field.getModifiers()) ||
                field.isSynthetic()) {
                continue;
            }
            
            FieldInfo fieldInfo = new FieldInfo();
            fieldInfo.name = field.getName();
            fieldInfo.type = field.getType().getSimpleName();
            
            // Handle generic types
            Type genericType = field.getGenericType();
            if (genericType instanceof ParameterizedType) {
                ParameterizedType pt = (ParameterizedType) genericType;
                fieldInfo.genericType = pt.toString();
                fieldInfo.isList = Collection.class.isAssignableFrom(field.getType());
            }
            
            // Get field annotations
            extractFieldAnnotations(field, fieldInfo);
            
            info.fields.add(fieldInfo);
            
            // Recursively explore field type if it's a CDM class
            if (shouldExploreType(field.getType()) && depth < MAX_DEPTH) {
                exploreClass(field.getType(), depth + 1);
            }
        }
    }
    
    private void exploreMethods(Class<?> clazz, ClassInfo info, int depth) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (Modifier.isStatic(method.getModifiers()) || 
                method.isSynthetic() ||
                method.getName().contains("$")) {
                continue;
            }
            
            MethodInfo methodInfo = new MethodInfo();
            methodInfo.name = method.getName();
            methodInfo.returnType = method.getReturnType().getSimpleName();
            
            // Categorize method type
            String name = method.getName();
            methodInfo.isGetter = name.startsWith("get") || name.startsWith("is");
            methodInfo.isSetter = name.startsWith("set");
            methodInfo.isAdder = name.startsWith("add");
            methodInfo.isBuilder = name.equals("builder") || name.equals("build");
            
            // Get parameters
            for (Parameter param : method.getParameters()) {
                methodInfo.parameters.add(param.getType().getSimpleName() + " " + param.getName());
            }
            
            info.methods.add(methodInfo);
            
            // Recursively explore return type if it's a CDM class
            if (shouldExploreType(method.getReturnType()) && depth < MAX_DEPTH) {
                exploreClass(method.getReturnType(), depth + 1);
            }
        }
    }
    
    private void extractAnnotations(Class<?> clazz, Map<String, String> annotations) {
        for (var annotation : clazz.getAnnotations()) {
            String name = annotation.annotationType().getSimpleName();
            annotations.put(name, annotation.toString());
        }
    }
    
    private void extractFieldAnnotations(Field field, FieldInfo fieldInfo) {
        for (var annotation : field.getAnnotations()) {
            String name = annotation.annotationType().getSimpleName();
            fieldInfo.annotations.put(name, annotation.toString());
            
            if (annotation instanceof RosettaAttribute) {
                RosettaAttribute attr = (RosettaAttribute) annotation;
                fieldInfo.description = "Rosetta Attribute";
            }
        }
    }
    
    private boolean shouldSkipClass(Class<?> clazz) {
        String className = clazz.getName();
        return SKIP_PACKAGES.stream().anyMatch(className::startsWith);
    }
    
    private boolean shouldExploreType(Class<?> type) {
        if (type == null || type.isPrimitive() || type.isArray()) {
            return false;
        }
        String typeName = type.getName();
        return cdmPackages.stream().anyMatch(typeName::startsWith) && 
               !exploredClasses.contains(typeName);
    }
    
    public void generateMarkdownDocumentation(String outputDir) throws IOException {
        System.out.println("Generating documentation for " + classInfoMap.size() + " classes...");
        
        Path outputPath = Paths.get(outputDir);
        Files.createDirectories(outputPath);
        
        // Generate overview document
        generateOverviewDocument(outputPath);
        
        // Generate package-specific documents
        Map<String, List<ClassInfo>> packageGroups = classInfoMap.values().stream()
            .collect(Collectors.groupingBy(c -> c.packageName));
        
        for (Map.Entry<String, List<ClassInfo>> entry : packageGroups.entrySet()) {
            generatePackageDocument(outputPath, entry.getKey(), entry.getValue());
        }
        
        // Generate detailed class documentation
        generateDetailedClassDocs(outputPath);
    }
    
    private void generateOverviewDocument(Path outputPath) throws IOException {
        StringBuilder md = new StringBuilder();
        md.append("# CDM (Common Domain Model) Complete Documentation\n\n");
        md.append("## Overview\n\n");
        md.append("This documentation provides a comprehensive exploration of the FINOS CDM 6.0.0 structure.\n\n");
        
        md.append("## Statistics\n\n");
        md.append("- Total Classes Explored: ").append(classInfoMap.size()).append("\n");
        md.append("- Enums: ").append(classInfoMap.values().stream().filter(c -> c.isEnum).count()).append("\n");
        md.append("- Interfaces: ").append(classInfoMap.values().stream().filter(c -> c.isInterface).count()).append("\n");
        md.append("- Abstract Classes: ").append(classInfoMap.values().stream().filter(c -> c.isAbstract).count()).append("\n");
        md.append("- Concrete Classes: ").append(classInfoMap.values().stream().filter(c -> !c.isAbstract && !c.isInterface && !c.isEnum).count()).append("\n\n");
        
        md.append("## Package Structure\n\n");
        Map<String, List<ClassInfo>> packageGroups = classInfoMap.values().stream()
            .collect(Collectors.groupingBy(c -> c.packageName));
        
        for (String pkg : packageGroups.keySet().stream().sorted().collect(Collectors.toList())) {
            List<ClassInfo> classes = packageGroups.get(pkg);
            md.append("### ").append(pkg).append("\n");
            md.append("- Classes: ").append(classes.size()).append("\n");
            md.append("- [Detailed Documentation](").append(pkg.replace('.', '_')).append(".md)\n\n");
        }
        
        Files.writeString(outputPath.resolve("CDM_Overview.md"), md.toString());
    }
    
    private void generatePackageDocument(Path outputPath, String packageName, List<ClassInfo> classes) throws IOException {
        StringBuilder md = new StringBuilder();
        md.append("# Package: ").append(packageName).append("\n\n");
        
        // Group by type
        List<ClassInfo> enums = classes.stream().filter(c -> c.isEnum).sorted(Comparator.comparing(c -> c.simpleName)).collect(Collectors.toList());
        List<ClassInfo> interfaces = classes.stream().filter(c -> c.isInterface).sorted(Comparator.comparing(c -> c.simpleName)).collect(Collectors.toList());
        List<ClassInfo> abstractClasses = classes.stream().filter(c -> c.isAbstract && !c.isInterface).sorted(Comparator.comparing(c -> c.simpleName)).collect(Collectors.toList());
        List<ClassInfo> concreteClasses = classes.stream().filter(c -> !c.isAbstract && !c.isInterface && !c.isEnum).sorted(Comparator.comparing(c -> c.simpleName)).collect(Collectors.toList());
        
        if (!enums.isEmpty()) {
            md.append("## Enums\n\n");
            for (ClassInfo info : enums) {
                md.append("### ").append(info.simpleName).append("\n");
                if (!info.enumValues.isEmpty()) {
                    md.append("**Values:**\n");
                    for (String value : info.enumValues) {
                        md.append("- `").append(value).append("`\n");
                    }
                }
                md.append("\n");
            }
        }
        
        if (!interfaces.isEmpty()) {
            md.append("## Interfaces\n\n");
            for (ClassInfo info : interfaces) {
                md.append("### ").append(info.simpleName).append("\n");
                appendClassDetails(md, info);
            }
        }
        
        if (!abstractClasses.isEmpty()) {
            md.append("## Abstract Classes\n\n");
            for (ClassInfo info : abstractClasses) {
                md.append("### ").append(info.simpleName).append("\n");
                appendClassDetails(md, info);
            }
        }
        
        if (!concreteClasses.isEmpty()) {
            md.append("## Concrete Classes\n\n");
            for (ClassInfo info : concreteClasses) {
                md.append("### ").append(info.simpleName).append("\n");
                appendClassDetails(md, info);
            }
        }
        
        String fileName = packageName.replace('.', '_') + ".md";
        Files.writeString(outputPath.resolve(fileName), md.toString());
    }
    
    private void appendClassDetails(StringBuilder md, ClassInfo info) {
        if (!info.superClasses.isEmpty()) {
            md.append("**Extends:** ");
            for (String superClass : info.superClasses) {
                md.append("`").append(superClass.substring(superClass.lastIndexOf('.') + 1)).append("` ");
            }
            md.append("\n");
        }
        
        if (!info.interfaces.isEmpty()) {
            md.append("**Implements:** ");
            for (String iface : info.interfaces) {
                md.append("`").append(iface.substring(iface.lastIndexOf('.') + 1)).append("` ");
            }
            md.append("\n");
        }
        
        if (!info.fields.isEmpty()) {
            md.append("\n**Fields:**\n");
            for (FieldInfo field : info.fields) {
                md.append("- `").append(field.type);
                if (field.isList) {
                    md.append(" (List)");
                }
                md.append(" ").append(field.name).append("`");
                if (field.description != null) {
                    md.append(" - ").append(field.description);
                }
                md.append("\n");
            }
        }
        
        // Show key methods (builders, setters, getters)
        List<MethodInfo> keyMethods = info.methods.stream()
            .filter(m -> m.isBuilder || m.isSetter || (m.isGetter && !m.name.equals("getClass")))
            .collect(Collectors.toList());
        
        if (!keyMethods.isEmpty()) {
            md.append("\n**Key Methods:**\n");
            for (MethodInfo method : keyMethods.stream().limit(10).collect(Collectors.toList())) {
                md.append("- `").append(method.name).append("(");
                md.append(String.join(", ", method.parameters));
                md.append(")` → `").append(method.returnType).append("`");
                if (method.isBuilder) md.append(" [Builder]");
                if (method.isSetter) md.append(" [Setter]");
                if (method.isGetter) md.append(" [Getter]");
                if (method.isAdder) md.append(" [Adder]");
                md.append("\n");
            }
        }
        
        md.append("\n");
    }
    
    private void generateDetailedClassDocs(Path outputPath) throws IOException {
        Path classesDir = outputPath.resolve("classes");
        Files.createDirectories(classesDir);
        
        // Generate index
        StringBuilder index = new StringBuilder();
        index.append("# CDM Class Index\n\n");
        
        List<String> sortedClasses = classInfoMap.keySet().stream()
            .sorted()
            .collect(Collectors.toList());
        
        for (String className : sortedClasses) {
            ClassInfo info = classInfoMap.get(className);
            String fileName = className.replace('.', '_') + ".md";
            index.append("- [").append(info.simpleName).append("](classes/").append(fileName).append(")");
            if (info.isEnum) index.append(" [Enum]");
            if (info.isInterface) index.append(" [Interface]");
            if (info.isAbstract) index.append(" [Abstract]");
            index.append("\n");
            
            // Generate individual class file
            generateClassFile(classesDir, info);
        }
        
        Files.writeString(outputPath.resolve("CDM_Class_Index.md"), index.toString());
    }
    
    private void generateClassFile(Path classesDir, ClassInfo info) throws IOException {
        StringBuilder md = new StringBuilder();
        md.append("# ").append(info.simpleName).append("\n\n");
        md.append("**Full Name:** `").append(info.fullName).append("`\n\n");
        md.append("**Package:** `").append(info.packageName).append("`\n\n");
        
        if (info.isEnum) {
            md.append("## Type: Enum\n\n");
            if (!info.enumValues.isEmpty()) {
                md.append("### Values\n\n");
                for (String value : info.enumValues) {
                    md.append("- `").append(value).append("`\n");
                }
            }
        } else {
            if (info.isInterface) md.append("## Type: Interface\n\n");
            else if (info.isAbstract) md.append("## Type: Abstract Class\n\n");
            else md.append("## Type: Concrete Class\n\n");
            
            if (!info.superClasses.isEmpty()) {
                md.append("### Inheritance\n\n");
                md.append("**Extends:**\n");
                for (String superClass : info.superClasses) {
                    md.append("- `").append(superClass).append("`\n");
                }
                md.append("\n");
            }
            
            if (!info.interfaces.isEmpty()) {
                md.append("### Implemented Interfaces\n\n");
                for (String iface : info.interfaces) {
                    md.append("- `").append(iface).append("`\n");
                }
                md.append("\n");
            }
            
            if (!info.fields.isEmpty()) {
                md.append("### Fields\n\n");
                md.append("| Name | Type | Description |\n");
                md.append("|------|------|-------------|\n");
                for (FieldInfo field : info.fields) {
                    md.append("| ").append(field.name);
                    md.append(" | `").append(field.genericType != null ? field.genericType : field.type).append("`");
                    md.append(" | ").append(field.description != null ? field.description : "");
                    md.append(" |\n");
                }
                md.append("\n");
            }
            
            if (!info.methods.isEmpty()) {
                md.append("### Methods\n\n");
                
                // Group methods by type
                List<MethodInfo> builders = info.methods.stream().filter(m -> m.isBuilder).collect(Collectors.toList());
                List<MethodInfo> setters = info.methods.stream().filter(m -> m.isSetter).collect(Collectors.toList());
                List<MethodInfo> getters = info.methods.stream().filter(m -> m.isGetter && !m.name.equals("getClass")).collect(Collectors.toList());
                List<MethodInfo> adders = info.methods.stream().filter(m -> m.isAdder).collect(Collectors.toList());
                List<MethodInfo> others = info.methods.stream()
                    .filter(m -> !m.isBuilder && !m.isSetter && !m.isGetter && !m.isAdder)
                    .collect(Collectors.toList());
                
                if (!builders.isEmpty()) {
                    md.append("#### Builder Methods\n\n");
                    for (MethodInfo method : builders) {
                        appendMethodSignature(md, method);
                    }
                    md.append("\n");
                }
                
                if (!setters.isEmpty()) {
                    md.append("#### Setter Methods\n\n");
                    for (MethodInfo method : setters) {
                        appendMethodSignature(md, method);
                    }
                    md.append("\n");
                }
                
                if (!getters.isEmpty()) {
                    md.append("#### Getter Methods\n\n");
                    for (MethodInfo method : getters) {
                        appendMethodSignature(md, method);
                    }
                    md.append("\n");
                }
                
                if (!adders.isEmpty()) {
                    md.append("#### Adder Methods\n\n");
                    for (MethodInfo method : adders) {
                        appendMethodSignature(md, method);
                    }
                    md.append("\n");
                }
                
                if (!others.isEmpty() && others.size() <= 20) {
                    md.append("#### Other Methods\n\n");
                    for (MethodInfo method : others) {
                        appendMethodSignature(md, method);
                    }
                    md.append("\n");
                }
            }
        }
        
        if (!info.annotations.isEmpty()) {
            md.append("### Annotations\n\n");
            for (Map.Entry<String, String> entry : info.annotations.entrySet()) {
                md.append("- **").append(entry.getKey()).append("**\n");
            }
            md.append("\n");
        }
        
        String fileName = info.fullName.replace('.', '_') + ".md";
        Files.writeString(classesDir.resolve(fileName), md.toString());
    }
    
    private void appendMethodSignature(StringBuilder md, MethodInfo method) {
        md.append("- `").append(method.returnType).append(" ");
        md.append(method.name).append("(");
        if (!method.parameters.isEmpty()) {
            md.append(String.join(", ", method.parameters));
        }
        md.append(")`\n");
    }
    
    public static void main(String[] args) {
        CDMExplorer explorer = new CDMExplorer();
        
        System.out.println("Starting CDM exploration...\n");
        
        // Explore key CDM packages
        String[] packagesToExplore = {
            "cdm.event.common",
            "cdm.event.position", 
            "cdm.event.workflow",
            "cdm.product.template",
            "cdm.product.asset",
            "cdm.product.common.schedule",
            "cdm.product.common.settlement",
            "cdm.base.staticdata.party",
            "cdm.base.staticdata.identifier",
            "cdm.base.staticdata.asset.common",
            "cdm.base.staticdata.asset.rates",
            "cdm.base.datetime",
            "cdm.base.math",
            "cdm.observable.asset",
            "cdm.observable.event",
            "cdm.legaldocumentation.common",
            "cdm.legaldocumentation.master",
            "cdm.legalagreement.common",
            "cdm.legalagreement.master"
        };
        
        for (String pkg : packagesToExplore) {
            explorer.explorePackage(pkg);
        }
        
        // Generate documentation
        try {
            String outputDir = "cdm-documentation";
            explorer.generateMarkdownDocumentation(outputDir);
            System.out.println("\nDocumentation generated successfully in: " + outputDir);
            System.out.println("Total classes documented: " + explorer.classInfoMap.size());
        } catch (IOException e) {
            System.err.println("Error generating documentation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}