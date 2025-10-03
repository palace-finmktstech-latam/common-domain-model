package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.List;

@JsonDeserialize(builder = SwapParameters.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SwapParameters {
    private final SwapHeader header;
    private final List<LegParameters> legs;
    private final AmortizationSchedule amortizationSchedule;

    private SwapParameters(Builder builder) {
        this.header = builder.header;
        this.legs = builder.legs;
        this.amortizationSchedule = builder.amortizationSchedule;
    }

    public SwapHeader getHeader() {
        return header;
    }

    public List<LegParameters> getLegs() {
        return legs;
    }

    public AmortizationSchedule getAmortizationSchedule() {
        return amortizationSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        private SwapHeader header;
        private List<LegParameters> legs;
        private AmortizationSchedule amortizationSchedule;

        @JsonProperty("header")
        public Builder header(SwapHeader header) {
            this.header = header;
            return this;
        }

        @JsonProperty("legs")
        public Builder legs(List<LegParameters> legs) {
            this.legs = legs;
            return this;
        }

        @JsonProperty("amortizationSchedule")
        public Builder amortizationSchedule(AmortizationSchedule amortizationSchedule) {
            this.amortizationSchedule = amortizationSchedule;
            return this;
        }

        public SwapParameters build() {
            return new SwapParameters(this);
        }
    }
}