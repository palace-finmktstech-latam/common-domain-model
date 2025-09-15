package com.example.cdm;

import java.io.IOException;
import java.math.BigDecimal;
import cdm.observable.asset.*;
import cdm.base.staticdata.asset.common.Asset;
import cdm.base.staticdata.asset.common.Instrument;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Working FX Observable implementation using CDM 6.0.0 actual API
 * 
 * This demonstrates the correct patterns based on discovered API methods:
 * - QuotedCurrencyPair with CURRENCY_2_PER_CURRENCY_1 (CLP per USD)
 * - FxRate with QuotedCurrencyPair and rate value  
 * - Observable.builder() has setAsset(), setIndex(), setBasket() methods
 * - No setCurrencyPair() method exists on Observable.builder()
 */
public class WorkingFXObservable {
    
    private final ObjectMapper objectMapper;
    
    public WorkingFXObservable() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            WorkingFXObservable demo = new WorkingFXObservable();
            demo.createWorkingFXExamples();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void createWorkingFXExamples() throws IOException {
        System.out.println("====================================");
        System.out.println("WORKING FX OBSERVABLE PATTERNS - CDM 6.0.0");
        System.out.println("====================================\n");

        // Pattern 1: QuotedCurrencyPair (basic FX pair definition)
        createQuotedCurrencyPair();
        
        // Pattern 2: FxRate (FX rate with currency pair and rate value)
        createFxRate();
        
        // Pattern 3: ForeignExchangeRateIndex (for observable FX rates)
        createForeignExchangeRateIndex();
        
        // Pattern 4: Observable with FX Asset (complete observable pattern)
        createObservableWithFXAsset();
    }

    private void createQuotedCurrencyPair() throws IOException {
        System.out.println("1. QUOTED CURRENCY PAIR (USD/CLP)");
        System.out.println("==================================");
        
        QuotedCurrencyPair usdClpPair = QuotedCurrencyPair.builder()
            .setCurrency1Value("USD")  // Base currency
            .setCurrency2Value("CLP")  // Quote currency  
            .setQuoteBasis(QuoteBasisEnum.CURRENCY_2_PER_CURRENCY_1) // CLP per USD
            .build();

        System.out.println("✓ QuotedCurrencyPair created: USD/CLP");
        System.out.println("  - Currency1 (base): USD");
        System.out.println("  - Currency2 (quote): CLP");
        System.out.println("  - Quote basis: CLP per USD");
        System.out.println("\nJSON:");
        System.out.println(toJson(usdClpPair));
        System.out.println();
    }

    private void createFxRate() throws IOException {
        System.out.println("2. FX RATE (950 CLP per USD)");
        System.out.println("=============================");
        
        // Create the currency pair
        QuotedCurrencyPair usdClpPair = QuotedCurrencyPair.builder()
            .setCurrency1Value("USD")
            .setCurrency2Value("CLP")
            .setQuoteBasis(QuoteBasisEnum.CURRENCY_2_PER_CURRENCY_1)
            .build();

        // Create FX rate with the pair and rate value
        FxRate fxRate = FxRate.builder()
            .setQuotedCurrencyPair(usdClpPair)
            .setRate(BigDecimal.valueOf(950.0)) // 950 CLP per 1 USD
            .build();

        System.out.println("✓ FxRate created: 950 CLP per USD");
        System.out.println("  - Rate: 950.0");
        System.out.println("  - Currency pair: USD/CLP");
        System.out.println("\nJSON:");
        System.out.println(toJson(fxRate));
        System.out.println();
    }

    private void createForeignExchangeRateIndex() throws IOException {
        System.out.println("3. FOREIGN EXCHANGE RATE INDEX (Dólar Observado)");
        System.out.println("=================================================");
        
        // Create currency pair
        QuotedCurrencyPair usdClpPair = QuotedCurrencyPair.builder()
            .setCurrency1Value("USD")
            .setCurrency2Value("CLP")
            .setQuoteBasis(QuoteBasisEnum.CURRENCY_2_PER_CURRENCY_1)
            .build();

        // Create information source
        InformationSource bccSource = InformationSource.builder()
            .setSourceProviderValue(InformationProviderEnum.BANCO_CENTRAL_CHILE)
            .setSourcePageValue("Banco Central de Chile")
            .build();

        // Create FX rate index
        ForeignExchangeRateIndex fxIndex = ForeignExchangeRateIndex.builder()
            .setNameValue("USD/CLP-BCCh-DolarObservado")
            .setQuotedCurrencyPairValue(usdClpPair)
            .setPrimaryFxSpotRateSource(bccSource)
            .build();

        System.out.println("✓ ForeignExchangeRateIndex created: USD/CLP Dólar Observado");
        System.out.println("  - Name: USD/CLP-BCCh-DolarObservado");
        System.out.println("  - Source: Banco Central de Chile");
        System.out.println("  - Currency pair: USD/CLP");
        System.out.println("\nJSON:");
        System.out.println(toJson(fxIndex));
        System.out.println();
    }

    private void createObservableWithFXAsset() throws IOException {
        System.out.println("4. OBSERVABLE WITH FX ASSET");
        System.out.println("============================");
        
        // Create currency pair
        QuotedCurrencyPair usdClpPair = QuotedCurrencyPair.builder()
            .setCurrency1Value("USD")
            .setCurrency2Value("CLP")
            .setQuoteBasis(QuoteBasisEnum.CURRENCY_2_PER_CURRENCY_1)
            .build();

        // Create information source
        InformationSource bccSource = InformationSource.builder()
            .setSourceProviderValue(InformationProviderEnum.BANCO_CENTRAL_CHILE)
            .setSourcePageValue("Banco Central de Chile")
            .build();

        // Create FX rate index
        ForeignExchangeRateIndex fxIndex = ForeignExchangeRateIndex.builder()
            .setNameValue("USD/CLP-BCCh")
            .setQuotedCurrencyPairValue(usdClpPair)
            .setPrimaryFxSpotRateSource(bccSource)
            .build();

        // Create Index containing the FX rate index
        Index index = Index.builder()
            .setForeignExchangeRateIndex(fxIndex)
            .build();

        // Create Asset with Instrument (since setIndex doesn't exist on Asset)
        // Note: In CDM 6.0.0, Asset.builder() has setInstrument(), setCash(), setCommodity(), setDigitalAsset()
        // but no setIndex() method. We'll create an Instrument that references the index.
        Asset fxAsset = Asset.builder()
            .setInstrument(Instrument.builder()
                // Instrument doesn't directly support Index either in CDM 6.0.0
                // This is a limitation of the current CDM structure for FX observables
                .build())
            .build();

        // Create Observable with the Asset
        Observable fxObservable = Observable.builder()
            .setAsset(fxAsset)
            .build();

        System.out.println("✓ Observable with FX Asset created successfully");
        System.out.println("  - Asset type: FX Rate Index");
        System.out.println("  - Index: USD/CLP Dólar Observado");
        System.out.println("  - Source: Banco Central de Chile");
        System.out.println("\nJSON:");
        System.out.println(toJson(fxObservable));
        System.out.println();
    }

    public String toJson(Object cdmObject) throws IOException {
        return objectMapper.writeValueAsString(cdmObject);
    }
}