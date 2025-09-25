package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class FxFixingParameters {
    @JsonProperty("fxFixingReference")
    private String fxFixingReference;

    @JsonProperty("fxFixingOffset")
    private Integer fxFixingOffset;

    @JsonProperty("fxFixingDayType")
    private String fxFixingDayType; // "BUSINESS" or "CALENDAR"

    @JsonProperty("dateRelativeTo")
    private String dateRelativeTo; // "PAYMENT_DATES", "CALCULATION_PERIOD_DATES", "VALUATION_DATES"

    @JsonProperty("fxFixingDayConvention")
    private String fxFixingDayConvention;

    @JsonProperty("fxFixingBusinessCenters")
    private List<String> fxFixingBusinessCenters;

    public FxFixingParameters() {}

    public String getFxFixingReference() {
        return fxFixingReference;
    }

    public void setFxFixingReference(String fxFixingReference) {
        this.fxFixingReference = fxFixingReference;
    }

    public Integer getFxFixingOffset() {
        return fxFixingOffset;
    }

    public void setFxFixingOffset(Integer fxFixingOffset) {
        this.fxFixingOffset = fxFixingOffset;
    }

    public String getFxFixingDayType() {
        return fxFixingDayType;
    }

    public void setFxFixingDayType(String fxFixingDayType) {
        this.fxFixingDayType = fxFixingDayType;
    }

    public String getDateRelativeTo() {
        return dateRelativeTo;
    }

    public void setDateRelativeTo(String dateRelativeTo) {
        this.dateRelativeTo = dateRelativeTo;
    }

    public String getFxFixingDayConvention() {
        return fxFixingDayConvention;
    }

    public void setFxFixingDayConvention(String fxFixingDayConvention) {
        this.fxFixingDayConvention = fxFixingDayConvention;
    }

    public List<String> getFxFixingBusinessCenters() {
        return fxFixingBusinessCenters;
    }

    public void setFxFixingBusinessCenters(List<String> fxFixingBusinessCenters) {
        this.fxFixingBusinessCenters = fxFixingBusinessCenters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private FxFixingParameters params = new FxFixingParameters();

        public Builder fxFixingReference(String fxFixingReference) {
            params.fxFixingReference = fxFixingReference;
            return this;
        }

        public Builder fxFixingOffset(Integer fxFixingOffset) {
            params.fxFixingOffset = fxFixingOffset;
            return this;
        }

        public Builder fxFixingDayType(String fxFixingDayType) {
            params.fxFixingDayType = fxFixingDayType;
            return this;
        }

        public Builder dateRelativeTo(String dateRelativeTo) {
            params.dateRelativeTo = dateRelativeTo;
            return this;
        }

        public Builder fxFixingDayConvention(String fxFixingDayConvention) {
            params.fxFixingDayConvention = fxFixingDayConvention;
            return this;
        }

        public Builder fxFixingBusinessCenters(List<String> fxFixingBusinessCenters) {
            params.fxFixingBusinessCenters = fxFixingBusinessCenters;
            return this;
        }

        public FxFixingParameters build() {
            return params;
        }
    }
}