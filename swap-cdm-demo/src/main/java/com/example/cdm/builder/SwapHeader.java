package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = SwapHeader.Builder.class)
public class SwapHeader {
    private final String tradeId;
    private final String tradeIdType;
    private final DateWithAdjustment tradeDate;
    private final DateWithAdjustment effectiveDate;
    private final DateWithAdjustment terminationDate;
    private final PartyInfo party1;
    private final PartyInfo party2;

    private SwapHeader(Builder builder) {
        this.tradeId = builder.tradeId;
        this.tradeIdType = builder.tradeIdType;
        this.tradeDate = builder.tradeDate;
        this.effectiveDate = builder.effectiveDate;
        this.terminationDate = builder.terminationDate;
        this.party1 = builder.party1;
        this.party2 = builder.party2;
    }

    public String getTradeId() {
        return tradeId;
    }

    public String getTradeIdType() {
        return tradeIdType;
    }

    public DateWithAdjustment getTradeDate() {
        return tradeDate;
    }

    public DateWithAdjustment getEffectiveDate() {
        return effectiveDate;
    }

    public DateWithAdjustment getTerminationDate() {
        return terminationDate;
    }

    public PartyInfo getParty1() {
        return party1;
    }

    public PartyInfo getParty2() {
        return party2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        private String tradeId;
        private String tradeIdType;
        private DateWithAdjustment tradeDate;
        private DateWithAdjustment effectiveDate;
        private DateWithAdjustment terminationDate;
        private PartyInfo party1;
        private PartyInfo party2;

        @JsonProperty("tradeId")
        public Builder tradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }

        @JsonProperty("tradeIdType")
        public Builder tradeIdType(String tradeIdType) {
            this.tradeIdType = tradeIdType;
            return this;
        }

        @JsonProperty("tradeDate")
        public Builder tradeDate(DateWithAdjustment tradeDate) {
            this.tradeDate = tradeDate;
            return this;
        }

        @JsonProperty("effectiveDate")
        public Builder effectiveDate(DateWithAdjustment effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        @JsonProperty("terminationDate")
        public Builder terminationDate(DateWithAdjustment terminationDate) {
            this.terminationDate = terminationDate;
            return this;
        }

        @JsonProperty("party1")
        public Builder party1(PartyInfo party1) {
            this.party1 = party1;
            return this;
        }

        @JsonProperty("party2")
        public Builder party2(PartyInfo party2) {
            this.party2 = party2;
            return this;
        }

        public SwapHeader build() {
            return new SwapHeader(this);
        }
    }
}