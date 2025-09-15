package com.example.cdm;

public class SimpleSwapDemo {
    
    public static void main(String[] args) {
        System.out.println("CDM Swap Demo Starting...");
        
        SimpleSwapDemo demo = new SimpleSwapDemo();
        demo.createBasicSwapStructure();
    }
    
    public void createBasicSwapStructure() {
        // We'll start with a simple structure and gradually add CDM
        System.out.println("Creating basic swap structure:");
        System.out.println("- Trade Date: 2025-09-10");
        System.out.println("- Deal Number: 7554"); 
        System.out.println("- Counterparty: SCOTIABANK CHILE");
        System.out.println("- Product: Chilean Peso OIS");
        System.out.println("- Notional: CLP 300,000,000,000");
        
        System.out.println("Basic structure created successfully!");
    }
}