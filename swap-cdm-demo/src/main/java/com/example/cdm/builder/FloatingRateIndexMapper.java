package com.example.cdm.builder;

import cdm.base.staticdata.asset.rates.FloatingRateIndexEnum;
import java.util.HashMap;
import java.util.Map;

/**
 * Practical mapper for floating rate indices to CDM enums.
 * Uses a fallback strategy that tries exact matching and then uses valueOf with enum naming conventions.
 */
public class FloatingRateIndexMapper {

    private static final Map<String, FloatingRateIndexEnum> INDEX_MAP = new HashMap<>();

    static {
        initializeCommonIndices();
    }

    /**
     * Get the CDM enum for a given floating rate index string
     * Returns null if not found rather than throwing exceptions
     */
    public static FloatingRateIndexEnum getEnum(String index) {
        if (index == null) {
            return null;
        }

        // Try exact match first
        FloatingRateIndexEnum exact = INDEX_MAP.get(index);
        if (exact != null) {
            return exact;
        }

        // Try uppercase match
        String upperIndex = index.toUpperCase();
        FloatingRateIndexEnum upper = INDEX_MAP.get(upperIndex);
        if (upper != null) {
            return upper;
        }

        // Try with spaces replaced by hyphens
        String normalized = upperIndex.replace(" ", "-");
        FloatingRateIndexEnum normalizedMatch = INDEX_MAP.get(normalized);
        if (normalizedMatch != null) {
            return normalizedMatch;
        }

        // Try with hyphens replaced by spaces
        String spaced = upperIndex.replace("-", " ");
        FloatingRateIndexEnum spacedMatch = INDEX_MAP.get(spaced);
        if (spacedMatch != null) {
            return spacedMatch;
        }

        // Use valueOf to try the exact enum constant name from CDM documentation
        try {
            // Replace spaces and hyphens with underscores and make uppercase
            String enumConstant = index.toUpperCase()
                .replace("-", "_")
                .replace(" ", "_")
                .replace("(", "")
                .replace(")", "")
                .replace(".", "_")
                .replace(":", "_");

            // Handle the special case where CDM uses an extra underscore before D, M, Y suffixes
            enumConstant = enumConstant.replaceAll("(\\d+)([DMY])$", "$1_$2");

            return FloatingRateIndexEnum.valueOf(enumConstant);
        } catch (IllegalArgumentException e) {
            // If enum constant doesn't exist, return null
            return null;
        }
    }

    private static void initializeCommonIndices() {
        // Only add the indices we know work from existing codebase

        // USD indices - confirmed working
        INDEX_MAP.put("USD-SOFR", FloatingRateIndexEnum.USD_SOFR);
        INDEX_MAP.put("USD-SOFR-COMPOUND", FloatingRateIndexEnum.USD_SOFR_COMPOUND);
        INDEX_MAP.put("USD-LIBOR", FloatingRateIndexEnum.USD_LIBOR);
        INDEX_MAP.put("USD-LIBOR-BBA", FloatingRateIndexEnum.USD_LIBOR_BBA);
        INDEX_MAP.put("USD-Federal Funds", FloatingRateIndexEnum.USD_FEDERAL_FUNDS);
        INDEX_MAP.put("USD-AMERIBOR", FloatingRateIndexEnum.USD_AMERIBOR);
        INDEX_MAP.put("USD-BSBY", FloatingRateIndexEnum.USD_BSBY);
        INDEX_MAP.put("USD-CMT", FloatingRateIndexEnum.USD_CMT);
        INDEX_MAP.put("USD-Prime", FloatingRateIndexEnum.USD_PRIME);

        // Chilean indices - confirmed working
        INDEX_MAP.put("CLP-TNA", FloatingRateIndexEnum.CLP_TNA);
        INDEX_MAP.put("CLP-ICP", FloatingRateIndexEnum.CLP_ICP);

        // EUR indices - confirmed working
        INDEX_MAP.put("EUR-EURIBOR", FloatingRateIndexEnum.EUR_EURIBOR);
        INDEX_MAP.put("EUR-EONIA", FloatingRateIndexEnum.EUR_EONIA);

        // GBP indices - confirmed working
        INDEX_MAP.put("GBP-LIBOR", FloatingRateIndexEnum.GBP_LIBOR);
        INDEX_MAP.put("GBP-LIBOR-BBA", FloatingRateIndexEnum.GBP_LIBOR_BBA);
        INDEX_MAP.put("GBP-SONIA", FloatingRateIndexEnum.GBP_SONIA);

        // JPY indices - confirmed working
        INDEX_MAP.put("JPY-LIBOR", FloatingRateIndexEnum.JPY_LIBOR);
        INDEX_MAP.put("JPY-LIBOR-BBA", FloatingRateIndexEnum.JPY_LIBOR_BBA);
        INDEX_MAP.put("JPY-TIBOR", FloatingRateIndexEnum.JPY_TIBOR);
        INDEX_MAP.put("JPY-TONA", FloatingRateIndexEnum.JPY_TONA);

        // CHF indices - confirmed working
        INDEX_MAP.put("CHF-LIBOR", FloatingRateIndexEnum.CHF_LIBOR);
        INDEX_MAP.put("CHF-LIBOR-BBA", FloatingRateIndexEnum.CHF_LIBOR_BBA);
        INDEX_MAP.put("CHF-SARON", FloatingRateIndexEnum.CHF_SARON);

        // AUD indices - confirmed working
        INDEX_MAP.put("AUD-AONIA", FloatingRateIndexEnum.AUD_AONIA);
        INDEX_MAP.put("AUD-BBSW", FloatingRateIndexEnum.AUD_BBSW);
        INDEX_MAP.put("AUD-BBR-BBSW", FloatingRateIndexEnum.AUD_BBR_BBSW);

        // CAD indices - confirmed working
        INDEX_MAP.put("CAD-CORRA", FloatingRateIndexEnum.CAD_CORRA);
        INDEX_MAP.put("CAD-CDOR", FloatingRateIndexEnum.CAD_CDOR);
        INDEX_MAP.put("CAD-BA-CDOR", FloatingRateIndexEnum.CAD_BA_CDOR);
    }
}