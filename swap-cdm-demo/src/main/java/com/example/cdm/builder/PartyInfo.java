package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyInfo {
    @JsonProperty("partyId")
    private String partyId;

    @JsonProperty("partyName")
    private String partyName;


    public PartyInfo() {}

    public PartyInfo(String partyId, String partyName) {
        this.partyId = partyId;
        this.partyName = partyName;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }


    public static PartyInfo of(String partyId, String partyName) {
        return new PartyInfo(partyId, partyName);
    }
}