package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

public class DateWithAdjustment {
    @JsonProperty("date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate date;

    @JsonProperty("businessDayConvention")
    private String businessDayConvention;

    @JsonProperty("businessCenters")
    private List<String> businessCenters;

    public DateWithAdjustment() {}

    public DateWithAdjustment(LocalDate date, String businessDayConvention, List<String> businessCenters) {
        this.date = date;
        this.businessDayConvention = businessDayConvention;
        this.businessCenters = businessCenters;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBusinessDayConvention() {
        return businessDayConvention;
    }

    public void setBusinessDayConvention(String businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
    }

    public List<String> getBusinessCenters() {
        return businessCenters;
    }

    public void setBusinessCenters(List<String> businessCenters) {
        this.businessCenters = businessCenters;
    }

    public static DateWithAdjustment of(LocalDate date, String convention, List<String> centers) {
        return new DateWithAdjustment(date, convention, centers);
    }
}