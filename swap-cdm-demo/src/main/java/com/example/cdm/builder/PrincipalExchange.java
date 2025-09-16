package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class PrincipalExchange {
    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate date;

    @JsonProperty("dayConvention")
    private String dayConvention;

    @JsonProperty("businessCenters")
    private List<String> businessCenters;

    @JsonProperty("payerPartyReference")
    private String payerPartyReference;

    @JsonProperty("receiverPartyReference")
    private String receiverPartyReference;

    public PrincipalExchange() {}

    // Getters and Setters
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDayConvention() {
        return dayConvention;
    }

    public void setDayConvention(String dayConvention) {
        this.dayConvention = dayConvention;
    }

    public List<String> getBusinessCenters() {
        return businessCenters;
    }

    public void setBusinessCenters(List<String> businessCenters) {
        this.businessCenters = businessCenters;
    }

    public String getPayerPartyReference() {
        return payerPartyReference;
    }

    public void setPayerPartyReference(String payerPartyReference) {
        this.payerPartyReference = payerPartyReference;
    }

    public String getReceiverPartyReference() {
        return receiverPartyReference;
    }

    public void setReceiverPartyReference(String receiverPartyReference) {
        this.receiverPartyReference = receiverPartyReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private PrincipalExchange exchange = new PrincipalExchange();

        public Builder amount(BigDecimal amount) {
            exchange.amount = amount;
            return this;
        }

        public Builder currency(String currency) {
            exchange.currency = currency;
            return this;
        }

        public Builder date(LocalDate date) {
            exchange.date = date;
            return this;
        }

        public Builder dayConvention(String dayConvention) {
            exchange.dayConvention = dayConvention;
            return this;
        }

        public Builder businessCenters(List<String> businessCenters) {
            exchange.businessCenters = businessCenters;
            return this;
        }

        public Builder payerPartyReference(String payerPartyReference) {
            exchange.payerPartyReference = payerPartyReference;
            return this;
        }

        public Builder receiverPartyReference(String receiverPartyReference) {
            exchange.receiverPartyReference = receiverPartyReference;
            return this;
        }

        public PrincipalExchange build() {
            return exchange;
        }
    }
}