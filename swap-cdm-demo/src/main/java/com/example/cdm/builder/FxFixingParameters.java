package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class FxFixingParameters {
    @JsonProperty("fxFixingReference")
    private String fxFixingReference;

    @JsonProperty("fxFixingOffset")
    private Integer fxFixingOffset;

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