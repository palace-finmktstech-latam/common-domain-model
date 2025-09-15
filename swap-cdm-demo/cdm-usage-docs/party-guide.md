# Party Management Guide

## Overview

Parties represent entities involved in trades (counterparties, brokers, clearing houses, etc.).

## Party Structure

```
Party
├── PartyId[] (identifiers)
├── Name
├── Person[] (contacts)
├── Account[]
└── PartyRole[]
```

## Creating Parties

### Basic Party

```java
Party party = Party.builder()
    .setPartyIdValue("LEI:97018000197018000") // LEI format
    .setNameValue("SCOTIABANK CHILE")
    .build();
```

### Party with Multiple Identifiers

```java
Party party = Party.builder()
    .addPartyId(PartyIdentifier.builder()
        .setIdentifierType(PartyIdentifierTypeEnum.LEI)
        .setIdentifierValue("97018000197018000")
        .build())
    .addPartyId(PartyIdentifier.builder()
        .setIdentifierType(PartyIdentifierTypeEnum.ACCOUNT_NUMBER)
        .setIdentifierValue("ACC-12345")
        .build())
    .setNameValue("SCOTIABANK CHILE")
    .build();
```

### Party with Contact Information

```java
Party party = Party.builder()
    .setPartyIdValue("LEI:97018000197018000")
    .setNameValue("SCOTIABANK CHILE")
    .addPerson(NaturalPerson.builder()
        .setFirstName("John")
        .setSurname("Doe")
        .addContactInformation(ContactInformation.builder()
            .addTelephoneNumber(TelephoneNumber.builder()
                .setNumber("+56 2 1234 5678")
                .setTelephoneNumberType(TelephoneTypeEnum.WORK)
                .build())
            .addEmail("john.doe@scotiabank.cl")
            .build())
        .build())
    .build();
```

## Party Roles

### Common Roles

```java
// Counterparty role
Counterparty counterparty = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_1)
    .setPartyReferenceValue(party.getMeta().getGlobalKey())
    .build();

// Broker role
PartyRole brokerRole = PartyRole.builder()
    .setRole(PartyRoleEnum.ARRANGING_BROKER)
    .setPartyReferenceValue(brokerParty.getMeta().getGlobalKey())
    .build();

// Clearing member
PartyRole clearingRole = PartyRole.builder()
    .setRole(PartyRoleEnum.CLEARING_FIRM)
    .setPartyReferenceValue(clearingParty.getMeta().getGlobalKey())
    .build();
```

## Accounts

### Linking Accounts to Parties

```java
Account account = Account.builder()
    .setAccountNumber(FieldWithMetaString.builder()
        .setValue("ACC-7554")
        .build())
    .setAccountName(FieldWithMetaString.builder()
        .setValue("Trading Account")
        .build())
    .setAccountType(AccountTypeEnum.AGGREGATE_CLIENT)
    .setPartyReferenceValue(party.getMeta().getGlobalKey())
    .build();
```

