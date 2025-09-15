package com.example.cdm;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Simple utility to explore what's available in the CDM 6.0.0 API
 */
public class CDMApiExplorer {
    
    public static void main(String[] args) {
        System.out.println("=".repeat(80));
        System.out.println("Exploring FINOS CDM 6.0.0 API Structure");
        System.out.println("=".repeat(80));
        
        // Try to find basic CDM classes that should exist
        String[] potentialClasses = {
            "cdm.event.common.TradeState",
            "cdm.event.common.Trade", 
            "cdm.base.datetime.Date",
            "cdm.base.staticdata.party.Party",
            "cdm.product.asset.InterestRatePayout",
            "cdm.product.template.TradableProduct",
            "cdm.product.template.Product",
            "org.finos.cdm.CdmRuntimeModule",
            // Try some alternative package structures
            "org.isda.cdm.Trade",
            "org.isda.cdm.TradeState"
        };
        
        for (String className : potentialClasses) {
            try {
                Class<?> clazz = Class.forName(className);
                System.out.println("✓ Found: " + className);
                
                // Show some methods for the first few classes we find
                if (className.contains("TradeState") || className.contains("Trade")) {
                    System.out.println("  Methods:");
                    Method[] methods = clazz.getDeclaredMethods();
                    Arrays.stream(methods)
                        .limit(5)
                        .forEach(method -> System.out.println("    - " + method.getName()));
                    System.out.println("    ... (showing first 5 methods)");
                }
                System.out.println();
                
            } catch (ClassNotFoundException e) {
                System.out.println("✗ Not found: " + className);
            }
        }
        
        // Try to explore the CDM package structure
        System.out.println("\n" + "=".repeat(80));
        System.out.println("Trying to explore available packages...");
        System.out.println("=".repeat(80));
        
        // This approach might work to see what packages are available
        try {
            Package[] packages = Package.getPackages();
            Arrays.stream(packages)
                .filter(pkg -> pkg.getName().contains("cdm") || pkg.getName().contains("finos"))
                .forEach(pkg -> System.out.println("Package: " + pkg.getName()));
        } catch (Exception e) {
            System.out.println("Could not enumerate packages: " + e.getMessage());
        }
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("CDM API exploration complete");
        System.out.println("=".repeat(80));
    }
}