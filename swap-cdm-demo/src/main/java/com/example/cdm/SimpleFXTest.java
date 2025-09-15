package com.example.cdm;

import java.io.IOException;
import java.math.BigDecimal;
import java.lang.reflect.Method;
import cdm.observable.asset.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Simple test to find working FX Observable patterns in CDM 6.0.0
 */
public class SimpleFXTest {
    
    private final ObjectMapper objectMapper;
    
    public SimpleFXTest() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        SimpleFXTest test = new SimpleFXTest();
        test.runTests();
    }

    public void runTests() {
        System.out.println("====================================");
        System.out.println("SIMPLE FX OBSERVABLE TESTS");
        System.out.println("====================================\n");

        // Test 1: Check QuoteBasisEnum values
        testQuoteBasisEnum();
        
        // Test 2: Check Observable builder methods
        testObservableBuilder();
        
        // Test 3: Try simple QuotedCurrencyPair
        testBasicQuotedCurrencyPair();
        
        // Test 4: Try basic FxRate
        testBasicFxRate();
    }

    private void testQuoteBasisEnum() {
        System.out.println("1. QUOTE BASIS ENUM VALUES:");
        System.out.println("===========================");
        try {
            QuoteBasisEnum[] values = QuoteBasisEnum.values();
            for (QuoteBasisEnum value : values) {
                System.out.println("- " + value.name());
            }
            System.out.println("✓ Found " + values.length + " QuoteBasisEnum values\n");
        } catch (Exception e) {
            System.out.println("✗ Error getting QuoteBasisEnum values: " + e.getMessage() + "\n");
        }
    }

    private void testObservableBuilder() {
        System.out.println("2. OBSERVABLE BUILDER METHODS:");
        System.out.println("===============================");
        try {
            Observable.ObservableBuilder builder = Observable.builder();
            Method[] methods = builder.getClass().getMethods();
            
            System.out.println("Available setter methods:");
            for (Method method : methods) {
                if (method.getName().startsWith("set")) {
                    System.out.println("- " + method.getName() + "(" + getParameterTypes(method) + ")");
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("✗ Error exploring Observable builder: " + e.getMessage() + "\n");
        }
    }

    private void testBasicQuotedCurrencyPair() {
        System.out.println("3. BASIC QUOTED CURRENCY PAIR:");
        System.out.println("===============================");
        try {
            QuotedCurrencyPair.QuotedCurrencyPairBuilder builder = QuotedCurrencyPair.builder();
            
            // Try to find the correct method names
            Method[] methods = builder.getClass().getMethods();
            System.out.println("Available QuotedCurrencyPair builder methods:");
            for (Method method : methods) {
                if (method.getName().startsWith("set") || method.getName().startsWith("build")) {
                    System.out.println("- " + method.getName() + "(" + getParameterTypes(method) + ")");
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("✗ Error exploring QuotedCurrencyPair builder: " + e.getMessage() + "\n");
        }
    }

    private void testBasicFxRate() {
        System.out.println("4. BASIC FX RATE:");
        System.out.println("==================");
        try {
            FxRate.FxRateBuilder builder = FxRate.builder();
            
            Method[] methods = builder.getClass().getMethods();
            System.out.println("Available FxRate builder methods:");
            for (Method method : methods) {
                if (method.getName().startsWith("set") || method.getName().startsWith("build")) {
                    System.out.println("- " + method.getName() + "(" + getParameterTypes(method) + ")");
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("✗ Error exploring FxRate builder: " + e.getMessage() + "\n");
        }
    }

    private String getParameterTypes(Method method) {
        Class<?>[] paramTypes = method.getParameterTypes();
        if (paramTypes.length == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paramTypes.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(paramTypes[i].getSimpleName());
        }
        return sb.toString();
    }
}