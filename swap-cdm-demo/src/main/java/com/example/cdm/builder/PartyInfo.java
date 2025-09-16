package com.example.cdm.builder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyInfo {
    @JsonProperty("partyId")
    private String partyId;

    @JsonProperty("partyName")
    private String partyName;

    @JsonProperty("role")
    private String role;

    public PartyInfo() {}

    public PartyInfo(String partyId, String partyName, String role) {
        this.partyId = partyId;
        this.partyName = partyName;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static PartyInfo of(String partyId, String partyName, String role) {
        return new PartyInfo(partyId, partyName, role);
    }
}