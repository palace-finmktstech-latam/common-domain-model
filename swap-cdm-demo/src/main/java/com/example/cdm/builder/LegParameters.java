package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.math.BigDecimal;
import java.util.List;

@JsonDeserialize(builder = LegParameters.Builder.class)
public class LegParameters {
    private final String legId;
    private final String payerPartyReference;
    private final String receiverPartyReference;
    private final BigDecimal notionalAmount;
    private final String notionalCurrency;
    private final String rateType;
    private final BigDecimal fixedRate;
    private final String floatingRateIndex;
    private final BigDecimal spread;
    private final String resetFrequency;
    private final String resetDayConvention;
    private final List<String> resetBusinessCenters;
    private final Integer resetDateOffset;
    private final String paymentFrequency;
    private final String dayCountFraction;
    private final String paymentDayConvention;
    private final List<String> paymentBusinessCenters;
    private final Integer paymentDateOffset;
    private final PrincipalExchange initialExchange;
    private final PrincipalExchange finalExchange;
    private final List<PrincipalExchange> intermediateExchanges;
    private final String settlementCurrency;
    private final String settlementType;
    private final FxFixingParameters fxFixing;
    private final String rollConvention;

    private LegParameters(Builder builder) {
        this.legId = builder.legId;
        this.payerPartyReference = builder.payerPartyReference;
        this.receiverPartyReference = builder.receiverPartyReference;
        this.notionalAmount = builder.notionalAmount;
        this.notionalCurrency = builder.notionalCurrency;
        this.rateType = builder.rateType;
        this.fixedRate = builder.fixedRate;
        this.floatingRateIndex = builder.floatingRateIndex;
        this.spread = builder.spread;
        this.resetFrequency = builder.resetFrequency;
        this.resetDayConvention = builder.resetDayConvention;
        this.resetBusinessCenters = builder.resetBusinessCenters;
        this.resetDateOffset = builder.resetDateOffset;
        this.paymentFrequency = builder.paymentFrequency;
        this.dayCountFraction = builder.dayCountFraction;
        this.paymentDayConvention = builder.paymentDayConvention;
        this.paymentBusinessCenters = builder.paymentBusinessCenters;
        this.paymentDateOffset = builder.paymentDateOffset;
        this.initialExchange = builder.initialExchange;
        this.finalExchange = builder.finalExchange;
        this.intermediateExchanges = builder.intermediateExchanges;
        this.settlementCurrency = builder.settlementCurrency;
        this.settlementType = builder.settlementType;
        this.fxFixing = builder.fxFixing;
        this.rollConvention = builder.rollConvention;
    }

    // Getters for all fields
    public String getLegId() { return legId; }
    public String getPayerPartyReference() { return payerPartyReference; }
    public String getReceiverPartyReference() { return receiverPartyReference; }
    public BigDecimal getNotionalAmount() { return notionalAmount; }
    public String getNotionalCurrency() { return notionalCurrency; }
    public String getRateType() { return rateType; }
    public BigDecimal getFixedRate() { return fixedRate; }
    public String getFloatingRateIndex() { return floatingRateIndex; }
    public BigDecimal getSpread() { return spread; }
    public String getResetFrequency() { return resetFrequency; }
    public String getResetDayConvention() { return resetDayConvention; }
    public List<String> getResetBusinessCenters() { return resetBusinessCenters; }
    public Integer getResetDateOffset() { return resetDateOffset; }
    public String getPaymentFrequency() { return paymentFrequency; }
    public String getDayCountFraction() { return dayCountFraction; }
    public String getPaymentDayConvention() { return paymentDayConvention; }
    public List<String> getPaymentBusinessCenters() { return paymentBusinessCenters; }
    public Integer getPaymentDateOffset() { return paymentDateOffset; }
    public PrincipalExchange getInitialExchange() { return initialExchange; }
    public PrincipalExchange getFinalExchange() { return finalExchange; }
    public List<PrincipalExchange> getIntermediateExchanges() { return intermediateExchanges; }
    public String getSettlementCurrency() { return settlementCurrency; }
    public String getSettlementType() { return settlementType; }
    public FxFixingParameters getFxFixing() { return fxFixing; }
    public String getRollConvention() { return rollConvention; }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        private String legId;
        private String payerPartyReference;
        private String receiverPartyReference;
        private BigDecimal notionalAmount;
        private String notionalCurrency;
        private String rateType;
        private BigDecimal fixedRate;
        private String floatingRateIndex;
        private BigDecimal spread;
        private String resetFrequency;
        private String resetDayConvention;
        private List<String> resetBusinessCenters;
        private Integer resetDateOffset;
        private String paymentFrequency;
        private String dayCountFraction;
        private String paymentDayConvention;
        private List<String> paymentBusinessCenters;
        private Integer paymentDateOffset;
        private PrincipalExchange initialExchange;
        private PrincipalExchange finalExchange;
        private List<PrincipalExchange> intermediateExchanges;
        private String settlementCurrency;
        private String settlementType;
        private FxFixingParameters fxFixing;
        private String rollConvention;

        @JsonProperty("legId")
        public Builder legId(String legId) { this.legId = legId; return this; }

        @JsonProperty("payerPartyReference")
        public Builder payerPartyReference(String payerPartyReference) {
            this.payerPartyReference = payerPartyReference; return this;
        }

        @JsonProperty("receiverPartyReference")
        public Builder receiverPartyReference(String receiverPartyReference) {
            this.receiverPartyReference = receiverPartyReference; return this;
        }

        @JsonProperty("notionalAmount")
        public Builder notionalAmount(BigDecimal notionalAmount) {
            this.notionalAmount = notionalAmount; return this;
        }

        @JsonProperty("notionalCurrency")
        public Builder notionalCurrency(String notionalCurrency) {
            this.notionalCurrency = notionalCurrency; return this;
        }

        @JsonProperty("rateType")
        public Builder rateType(String rateType) { this.rateType = rateType; return this; }

        @JsonProperty("fixedRate")
        public Builder fixedRate(BigDecimal fixedRate) { this.fixedRate = fixedRate; return this; }

        @JsonProperty("floatingRateIndex")
        public Builder floatingRateIndex(String floatingRateIndex) {
            this.floatingRateIndex = floatingRateIndex; return this;
        }

        @JsonProperty("spread")
        public Builder spread(BigDecimal spread) { this.spread = spread; return this; }

        @JsonProperty("resetFrequency")
        public Builder resetFrequency(String resetFrequency) {
            this.resetFrequency = resetFrequency; return this;
        }

        @JsonProperty("resetDayConvention")
        public Builder resetDayConvention(String resetDayConvention) {
            this.resetDayConvention = resetDayConvention; return this;
        }

        @JsonProperty("resetBusinessCenters")
        public Builder resetBusinessCenters(List<String> resetBusinessCenters) {
            this.resetBusinessCenters = resetBusinessCenters; return this;
        }

        @JsonProperty("resetDateOffset")
        public Builder resetDateOffset(Integer resetDateOffset) {
            this.resetDateOffset = resetDateOffset; return this;
        }

        @JsonProperty("paymentFrequency")
        public Builder paymentFrequency(String paymentFrequency) {
            this.paymentFrequency = paymentFrequency; return this;
        }

        @JsonProperty("dayCountFraction")
        public Builder dayCountFraction(String dayCountFraction) {
            this.dayCountFraction = dayCountFraction; return this;
        }

        @JsonProperty("paymentDayConvention")
        public Builder paymentDayConvention(String paymentDayConvention) {
            this.paymentDayConvention = paymentDayConvention; return this;
        }

        @JsonProperty("paymentBusinessCenters")
        public Builder paymentBusinessCenters(List<String> paymentBusinessCenters) {
            this.paymentBusinessCenters = paymentBusinessCenters; return this;
        }

        @JsonProperty("paymentDateOffset")
        public Builder paymentDateOffset(Integer paymentDateOffset) {
            this.paymentDateOffset = paymentDateOffset; return this;
        }

        @JsonProperty("initialExchange")
        public Builder initialExchange(PrincipalExchange initialExchange) {
            this.initialExchange = initialExchange; return this;
        }

        @JsonProperty("finalExchange")
        public Builder finalExchange(PrincipalExchange finalExchange) {
            this.finalExchange = finalExchange; return this;
        }

        @JsonProperty("intermediateExchanges")
        public Builder intermediateExchanges(List<PrincipalExchange> intermediateExchanges) {
            this.intermediateExchanges = intermediateExchanges; return this;
        }

        @JsonProperty("settlementCurrency")
        public Builder settlementCurrency(String settlementCurrency) {
            this.settlementCurrency = settlementCurrency; return this;
        }

        @JsonProperty("settlementType")
        public Builder settlementType(String settlementType) {
            this.settlementType = settlementType; return this;
        }

        @JsonProperty("fxFixing")
        public Builder fxFixing(FxFixingParameters fxFixing) {
            this.fxFixing = fxFixing; return this;
        }

        @JsonProperty("rollConvention")
        public Builder rollConvention(String rollConvention) {
            this.rollConvention = rollConvention; return this;
        }

        public LegParameters build() {
            return new LegParameters(this);
        }
    }
}