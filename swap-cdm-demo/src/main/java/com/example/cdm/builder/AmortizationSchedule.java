package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class AmortizationSchedule {
    @JsonProperty("type")
    private String type; // LINEAR, CUSTOM, STEP_DOWN

    @JsonProperty("steps")
    private List<AmortizationStep> steps;

    public AmortizationSchedule() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AmortizationStep> getSteps() {
        return steps;
    }

    public void setSteps(List<AmortizationStep> steps) {
        this.steps = steps;
    }

    public static class AmortizationStep {
        @JsonProperty("date")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        private LocalDate date;

        @JsonProperty("notionalAmount")
        private BigDecimal notionalAmount;

        @JsonProperty("notionalPercentage")
        private BigDecimal notionalPercentage;

        public AmortizationStep() {}

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public BigDecimal getNotionalAmount() {
            return notionalAmount;
        }

        public void setNotionalAmount(BigDecimal notionalAmount) {
            this.notionalAmount = notionalAmount;
        }

        public BigDecimal getNotionalPercentage() {
            return notionalPercentage;
        }

        public void setNotionalPercentage(BigDecimal notionalPercentage) {
            this.notionalPercentage = notionalPercentage;
        }
    }
}