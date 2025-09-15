package com.example.cdm;

import cdm.product.common.settlement.TransferSettlementEnum;

/**
 * Quick test to see what enum values are available
 */
public class EnumExplorer {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("TRANSFER SETTLEMENT ENUM VALUES");
        System.out.println("====================================");

        try {
            TransferSettlementEnum[] values = TransferSettlementEnum.values();
            for (TransferSettlementEnum value : values) {
                System.out.println("- " + value.name());
            }
            System.out.println("Found " + values.length + " total values");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}