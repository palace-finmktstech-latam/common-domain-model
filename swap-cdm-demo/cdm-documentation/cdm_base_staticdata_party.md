# Package: cdm.base.staticdata.party

## Enums

### AccountTypeEnum
**Values:**
- `AggregateClient`
- `Client`
- `House`

### AncillaryRoleEnum
**Values:**
- `DisruptionEventsDeterminingParty`
- `ExtraordinaryDividendsParty`
- `PredeterminedClearingOrganizationParty`
- `ExerciseNoticeReceiverPartyManual`
- `ExerciseNoticeReceiverPartyOptionalEarlyTermination`
- `ExerciseNoticeReceiverPartyCancelableProvision`
- `ExerciseNoticeReceiverPartyExtendibleProvision`
- `CalculationAgentIndependent`
- `CalculationAgentOptionalEarlyTermination`
- `CalculationAgentMandatoryEarlyTermination`
- `CalculationAgentFallback`

### CounterpartyRoleEnum
**Values:**
- `Party1`
- `Party2`

### EntityTypeEnum
**Values:**
- `Asian`
- `AustralianAndNewZealand`
- `EuropeanEmergingMarkets`
- `Japanese`
- `NorthAmericanHighYield`
- `NorthAmericanInsurance`
- `NorthAmericanInvestmentGrade`
- `Singaporean`
- `WesternEuropean`
- `WesternEuropeanInsurance`

### NaturalPersonRoleEnum
**Values:**
- `Broker`
- `Buyer`
- `DecisionMaker`
- `ExecutionWithinFirm`
- `InvestmentDecisionMaker`
- `Seller`
- `Trader`

### PartyIdentifierTypeEnum
**Values:**
- `BIC`
- `LEI`
- `MIC`

### PartyRoleEnum
**Values:**
- `Accountant`
- `AgentLender`
- `AllocationAgent`
- `ArrangingBroker`
- `BarrierDeterminationAgent`
- `BeneficialOwner`
- `Beneficiary`
- `BookingParty`
- `Borrower`
- `Buyer`
- `BuyerDecisionMaker`
- `Chargor`
- `ClearingClient`
- `ClearingExceptionParty`
- `ClearingFirm`
- `ClearingOrganization`
- `Client`
- `ClientDecisionMaker`
- `ConfirmationPlatform`
- `ContractualParty`
- `CounterPartyAffiliate`
- `CounterPartyUltimateParent`
- `Counterparty`
- `CreditSupportProvider`
- `Custodian`
- `DataSubmitter`
- `DeterminingParty`
- `DisputingParty`
- `DocumentRepository`
- `ExecutingBroker`
- `ExecutingEntity`
- `ExecutionAgent`
- `ExecutionFacility`
- `Guarantor`
- `HedgingParty`
- `Lender`
- `OrderTransmitter`
- `Pledgor`
- `PrimeBroker`
- `PriorTradeRepository`
- `PTRRServiceProvider`
- `PublicationVenue`
- `ReportingParty`
- `ReportingPartyAffiliate`
- `ReportingPartyUltimateParent`
- `Seller`
- `SellerDecisionMaker`
- `SecuredParty`
- `SettlementAgent`
- `TradeRepository`
- `TradeSource`
- `TradingManager`
- `TradingPartner`
- `TripartyAgent`
- `ThirdPartyCustodian`

### PayerReceiverEnum
**Values:**
- `Payer`
- `Receiver`

### PersonIdentifierTypeEnum
**Values:**
- `ARNU`
- `CCPT`
- `CUST`
- `DRLC`
- `EMPL`
- `NIDN`
- `SOSE`
- `TXID`
- `NPID`
- `PLID`

### TelephoneTypeEnum
**Values:**
- `Work`
- `Mobile`
- `Fax`
- `Personal`

## Interfaces

### Account
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Account` [Builder]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAccountBeneficiary()` → `ReferenceWithMetaParty` [Getter]
- `getAccountName()` → `FieldWithMetaString` [Getter]
- `getAccountNumber()` → `FieldWithMetaString` [Getter]
- `getAccountType()` → `FieldWithMetaAccountTypeEnum` [Getter]
- `getServicingParty()` → `ReferenceWithMetaParty` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### AccountBuilder
**Implements:** `Account` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateAccountType()` → `FieldWithMetaAccountTypeEnumBuilder` [Getter]
- `getOrCreateServicingParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `AccountBuilder` [Setter]
- `setAccountNumber(FieldWithMetaString arg0)` → `AccountBuilder` [Setter]
- `setAccountNumberValue(String arg0)` → `AccountBuilder` [Setter]
- `getAccountBeneficiary()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getAccountName()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]

### Address
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getState()` → `String` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `Address` [Builder]
- `getCountry()` → `FieldWithMetaString` [Getter]
- `getPostalCode()` → `String` [Getter]
- `getStreet()` → `List` [Getter]
- `getCity()` → `String` [Getter]

### AddressBuilder
**Implements:** `Address` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setState(String arg0)` → `AddressBuilder` [Setter]
- `getCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setPostalCode(String arg0)` → `AddressBuilder` [Setter]
- `setCountryValue(String arg0)` → `AddressBuilder` [Setter]
- `getOrCreateCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setCountry(FieldWithMetaString arg0)` → `AddressBuilder` [Setter]
- `setCity(String arg0)` → `AddressBuilder` [Setter]
- `setStreet(List arg0)` → `AddressBuilder` [Setter]

### AncillaryEntity
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AncillaryEntity` [Builder]
- `getLegalEntity()` → `LegalEntity` [Getter]
- `getAncillaryParty()` → `AncillaryRoleEnum` [Getter]

### AncillaryEntityBuilder
**Implements:** `AncillaryEntity` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAncillaryParty(AncillaryRoleEnum arg0)` → `AncillaryEntityBuilder` [Setter]
- `setLegalEntity(LegalEntity arg0)` → `AncillaryEntityBuilder` [Setter]
- `getLegalEntity()` → `LegalEntityBuilder` [Getter]
- `getOrCreateLegalEntity()` → `LegalEntityBuilder` [Getter]

### AncillaryParty
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AncillaryParty` [Builder]
- `getRole()` → `AncillaryRoleEnum` [Getter]
- `getPartyReference()` → `List` [Getter]
- `getOnBehalfOf()` → `CounterpartyRoleEnum` [Getter]

### AncillaryPartyBuilder
**Implements:** `AncillaryParty` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setOnBehalfOf(CounterpartyRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `setRole(AncillaryRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `getPartyReference()` → `List` [Getter]
- `setPartyReferenceValue(List arg0)` → `AncillaryPartyBuilder` [Setter]
- `getOrCreatePartyReference(int arg0)` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(List arg0)` → `AncillaryPartyBuilder` [Setter]

### BusinessUnit
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getName()` → `String` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `BusinessUnit` [Builder]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getIdentifier()` → `Identifier` [Getter]

### BusinessUnitBuilder
**Implements:** `BusinessUnit` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setName(String arg0)` → `BusinessUnitBuilder` [Setter]
- `getOrCreateIdentifier()` → `IdentifierBuilder` [Getter]
- `setIdentifier(Identifier arg0)` → `BusinessUnitBuilder` [Setter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setContactInformation(ContactInformation arg0)` → `BusinessUnitBuilder` [Setter]
- `getOrCreateContactInformation()` → `ContactInformationBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `BusinessUnitBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `getIdentifier()` → `IdentifierBuilder` [Getter]

### BuyerSeller
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BuyerSeller` [Builder]
- `getSeller()` → `CounterpartyRoleEnum` [Getter]
- `getBuyer()` → `CounterpartyRoleEnum` [Getter]

### BuyerSellerBuilder
**Implements:** `BuyerSeller` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSeller(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]
- `setBuyer(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]

### ContactInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `getAddress()` → `List` [Getter]
- `build()` → `ContactInformation` [Builder]
- `getTelephone()` → `List` [Getter]
- `getEmail()` → `List` [Getter]
- `getWebPage()` → `List` [Getter]

### ContactInformationBuilder
**Implements:** `ContactInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAddress()` → `List` [Getter]
- `getTelephone()` → `List` [Getter]
- `getOrCreateAddress(int arg0)` → `AddressBuilder` [Getter]
- `setTelephone(List arg0)` → `ContactInformationBuilder` [Setter]
- `getOrCreateTelephone(int arg0)` → `TelephoneNumberBuilder` [Getter]
- `setAddress(List arg0)` → `ContactInformationBuilder` [Setter]
- `setEmail(List arg0)` → `ContactInformationBuilder` [Setter]
- `setWebPage(List arg0)` → `ContactInformationBuilder` [Setter]

### Counterparty
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Counterparty` [Builder]
- `getRole()` → `CounterpartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]

### CounterpartyBuilder
**Implements:** `Counterparty` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRole(CounterpartyRoleEnum arg0)` → `CounterpartyBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `CounterpartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `CounterpartyBuilder` [Setter]

### LegalEntity
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `LegalEntity` [Builder]
- `getEntityId()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### LegalEntityBuilder
**Implements:** `LegalEntity` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getName()` → `FieldWithMetaStringBuilder` [Getter]
- `setName(FieldWithMetaString arg0)` → `LegalEntityBuilder` [Setter]
- `setEntityId(List arg0)` → `LegalEntityBuilder` [Setter]
- `getOrCreateEntityId(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setEntityIdValue(List arg0)` → `LegalEntityBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateName()` → `FieldWithMetaStringBuilder` [Getter]
- `setNameValue(String arg0)` → `LegalEntityBuilder` [Setter]
- `getEntityId()` → `List` [Getter]
- `setMeta(MetaFields arg0)` → `LegalEntityBuilder` [Setter]

### NaturalPerson
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NaturalPerson` [Builder]
- `getFirstName()` → `String` [Getter]
- `getMiddleName()` → `List` [Getter]
- `getDateOfBirth()` → `Date` [Getter]
- `getPersonId()` → `List` [Getter]
- `getHonorific()` → `String` [Getter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getInitial()` → `List` [Getter]
- `getSurname()` → `String` [Getter]

### NaturalPersonBuilder
**Implements:** `NaturalPerson` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getPersonId()` → `List` [Getter]
- `setDateOfBirth(Date arg0)` → `NaturalPersonBuilder` [Setter]
- `setMiddleName(List arg0)` → `NaturalPersonBuilder` [Setter]
- `setPersonIdValue(List arg0)` → `NaturalPersonBuilder` [Setter]
- `setPersonId(List arg0)` → `NaturalPersonBuilder` [Setter]
- `setHonorific(String arg0)` → `NaturalPersonBuilder` [Setter]
- `setFirstName(String arg0)` → `NaturalPersonBuilder` [Setter]
- `getOrCreatePersonId(int arg0)` → `FieldWithMetaPersonIdentifierBuilder` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

### NaturalPersonRole
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NaturalPersonRole` [Builder]
- `getPersonReference()` → `ReferenceWithMetaNaturalPerson` [Getter]
- `getRole()` → `List` [Getter]

### NaturalPersonRoleBuilder
**Implements:** `NaturalPersonRole` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `getOrCreateRole(int arg0)` → `FieldWithMetaNaturalPersonRoleEnumBuilder` [Getter]
- `getOrCreatePersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `setPersonReference(ReferenceWithMetaNaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setRoleValue(List arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setPersonReferenceValue(NaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setRole(List arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `getRole()` → `List` [Getter]

### Party
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `Party` [Builder]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getAccount()` → `Account` [Getter]
- `getPartyId()` → `List` [Getter]
- `getPerson()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PartyBuilder
**Implements:** `Party` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getName()` → `FieldWithMetaStringBuilder` [Getter]
- `setName(FieldWithMetaString arg0)` → `PartyBuilder` [Setter]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAccount(Account arg0)` → `PartyBuilder` [Setter]
- `getOrCreateAccount()` → `AccountBuilder` [Getter]
- `setPartyId(List arg0)` → `PartyBuilder` [Setter]
- `setPerson(List arg0)` → `PartyBuilder` [Setter]

### PartyContactInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyContactInformation` [Builder]
- `getBusinessUnit()` → `List` [Getter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPerson()` → `List` [Getter]
- `getAdditionalInformation()` → `String` [Getter]

### PartyContactInformationBuilder
**Implements:** `PartyContactInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getBusinessUnit()` → `List` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPerson(List arg0)` → `PartyContactInformationBuilder` [Setter]
- `setPartyReferenceValue(Party arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setContactInformation(ContactInformation arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreatePerson(int arg0)` → `NaturalPersonBuilder` [Getter]
- `setBusinessUnit(List arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreateBusinessUnit(int arg0)` → `BusinessUnitBuilder` [Getter]

### PartyIdentifier
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyIdentifier` [Builder]
- `getIdentifierType()` → `PartyIdentifierTypeEnum` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getIdentifier()` → `FieldWithMetaString` [Getter]

### PartyIdentifierBuilder
**Implements:** `PartyIdentifier` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setIdentifierType(PartyIdentifierTypeEnum arg0)` → `PartyIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifier(FieldWithMetaString arg0)` → `PartyIdentifierBuilder` [Setter]
- `setIdentifierValue(String arg0)` → `PartyIdentifierBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PartyIdentifierBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `getIdentifier()` → `FieldWithMetaStringBuilder` [Getter]

### PartyReferencePayerReceiver
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyReferencePayerReceiver` [Builder]
- `getPayerPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccount` [Getter]
- `getReceiverAccountReference()` → `ReferenceWithMetaAccount` [Getter]

### PartyReferencePayerReceiverBuilder
**Implements:** `PartyReferencePayerReceiver` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPayerPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setPayerPartyReference(ReferenceWithMetaParty arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setPayerAccountReference(ReferenceWithMetaAccount arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setReceiverPartyReference(ReferenceWithMetaParty arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setPayerPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setReceiverPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `getOrCreateReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreatePayerPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]

### PartyRole
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyRole` [Builder]
- `getRole()` → `PartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getOwnershipPartyReference()` → `ReferenceWithMetaParty` [Getter]

### PartyRoleBuilder
**Implements:** `PartyRole` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRole(PartyRoleEnum arg0)` → `PartyRoleBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setOwnershipPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreateOwnershipPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setOwnershipPartyReferenceValue(Party arg0)` → `PartyRoleBuilder` [Setter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]
- `getOwnershipPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]

### PayerReceiver
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PayerReceiver` [Builder]
- `getPayer()` → `CounterpartyRoleEnum` [Getter]
- `getReceiver()` → `CounterpartyRoleEnum` [Getter]

### PayerReceiverBuilder
**Implements:** `PayerReceiver` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setReceiver(CounterpartyRoleEnum arg0)` → `PayerReceiverBuilder` [Setter]
- `setPayer(CounterpartyRoleEnum arg0)` → `PayerReceiverBuilder` [Setter]

### PersonIdentifier
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PersonIdentifier` [Builder]
- `getCountry()` → `FieldWithMetaString` [Getter]
- `getIdentifierType()` → `PersonIdentifierTypeEnum` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getIdentifier()` → `FieldWithMetaString` [Getter]

### PersonIdentifierBuilder
**Implements:** `PersonIdentifier` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifierType(PersonIdentifierTypeEnum arg0)` → `PersonIdentifierBuilder` [Setter]
- `setCountryValue(String arg0)` → `PersonIdentifierBuilder` [Setter]
- `getOrCreateCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifier(FieldWithMetaString arg0)` → `PersonIdentifierBuilder` [Setter]
- `setIdentifierValue(String arg0)` → `PersonIdentifierBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setCountry(FieldWithMetaString arg0)` → `PersonIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `PersonIdentifierBuilder` [Setter]

### ReferenceBank
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceBank` [Builder]
- `getReferenceBankId()` → `FieldWithMetaString` [Getter]
- `getReferenceBankName()` → `String` [Getter]

### ReferenceBankBuilder
**Implements:** `ReferenceBank` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getReferenceBankId()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateReferenceBankId()` → `FieldWithMetaStringBuilder` [Getter]
- `setReferenceBankId(FieldWithMetaString arg0)` → `ReferenceBankBuilder` [Setter]
- `setReferenceBankIdValue(String arg0)` → `ReferenceBankBuilder` [Setter]
- `setReferenceBankName(String arg0)` → `ReferenceBankBuilder` [Setter]

### ReferenceBanks
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceBanks` [Builder]
- `getReferenceBank()` → `List` [Getter]

### ReferenceBanksBuilder
**Implements:** `ReferenceBanks` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getReferenceBank()` → `List` [Getter]
- `setReferenceBank(List arg0)` → `ReferenceBanksBuilder` [Setter]
- `getOrCreateReferenceBank(int arg0)` → `ReferenceBankBuilder` [Getter]

### RelatedParty
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `RelatedParty` [Builder]
- `getRole()` → `PartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAccountReference()` → `ReferenceWithMetaAccount` [Getter]

### RelatedPartyBuilder
**Implements:** `RelatedParty` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRole(PartyRoleEnum arg0)` → `RelatedPartyBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `RelatedPartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `RelatedPartyBuilder` [Setter]
- `getAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setAccountReference(ReferenceWithMetaAccount arg0)` → `RelatedPartyBuilder` [Setter]
- `setAccountReferenceValue(Account arg0)` → `RelatedPartyBuilder` [Setter]

### TelephoneNumber
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TelephoneNumber` [Builder]
- `getNumber()` → `String` [Getter]
- `getTelephoneNumberType()` → `TelephoneTypeEnum` [Getter]

### TelephoneNumberBuilder
**Implements:** `TelephoneNumber` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setTelephoneNumberType(TelephoneTypeEnum arg0)` → `TelephoneNumberBuilder` [Setter]
- `setNumber(String arg0)` → `TelephoneNumberBuilder` [Setter]

## Concrete Classes

### AccountBuilderImpl
**Implements:** `Account$AccountBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder partyReference`
- `FieldWithMetaStringBuilder accountNumber`
- `FieldWithMetaStringBuilder accountName`
- `FieldWithMetaAccountTypeEnumBuilder accountType`
- `ReferenceWithMetaPartyBuilder accountBeneficiary`
- `ReferenceWithMetaPartyBuilder servicingParty`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Account` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateAccountType()` → `FieldWithMetaAccountTypeEnumBuilder` [Getter]
- `getOrCreateServicingParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `AccountBuilder` [Setter]
- `setAccountNumber(FieldWithMetaString arg0)` → `AccountBuilder` [Setter]
- `setAccountNumberValue(String arg0)` → `AccountBuilder` [Setter]
- `getAccountBeneficiary()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getAccountName()` → `FieldWithMetaStringBuilder` [Getter]

### AccountImpl
**Implements:** `Account` 

**Key Methods:**
- `build()` → `Account` [Builder]
- `setBuilderFields(AccountBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAccountBeneficiary()` → `ReferenceWithMetaParty` [Getter]
- `getAccountName()` → `FieldWithMetaString` [Getter]
- `getAccountNumber()` → `FieldWithMetaString` [Getter]
- `getAccountType()` → `FieldWithMetaAccountTypeEnum` [Getter]
- `getServicingParty()` → `ReferenceWithMetaParty` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### AddressBuilderImpl
**Implements:** `Address$AddressBuilder` 

**Fields:**
- `List (List) street`
- `String city`
- `String state`
- `FieldWithMetaStringBuilder country`
- `String postalCode`

**Key Methods:**
- `getState()` → `String` [Getter]
- `setState(String arg0)` → `AddressBuilder` [Setter]
- `build()` → `Address` [Builder]
- `getCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setPostalCode(String arg0)` → `AddressBuilder` [Setter]
- `getPostalCode()` → `String` [Getter]
- `setCountryValue(String arg0)` → `AddressBuilder` [Setter]
- `getOrCreateCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `getStreet()` → `List` [Getter]
- `setCountry(FieldWithMetaString arg0)` → `AddressBuilder` [Setter]

### AddressImpl
**Implements:** `Address` 

**Key Methods:**
- `getState()` → `String` [Getter]
- `build()` → `Address` [Builder]
- `getCountry()` → `FieldWithMetaString` [Getter]
- `getPostalCode()` → `String` [Getter]
- `setBuilderFields(AddressBuilder arg0)` → `void` [Setter]
- `getStreet()` → `List` [Getter]
- `getCity()` → `String` [Getter]

### AncillaryEntityBuilderImpl
**Implements:** `AncillaryEntity$AncillaryEntityBuilder` 

**Fields:**
- `AncillaryRoleEnum ancillaryParty`
- `LegalEntityBuilder legalEntity`

**Key Methods:**
- `build()` → `AncillaryEntity` [Builder]
- `setAncillaryParty(AncillaryRoleEnum arg0)` → `AncillaryEntityBuilder` [Setter]
- `setLegalEntity(LegalEntity arg0)` → `AncillaryEntityBuilder` [Setter]
- `getLegalEntity()` → `LegalEntityBuilder` [Getter]
- `getOrCreateLegalEntity()` → `LegalEntityBuilder` [Getter]
- `getAncillaryParty()` → `AncillaryRoleEnum` [Getter]

### AncillaryEntityImpl
**Implements:** `AncillaryEntity` 

**Key Methods:**
- `build()` → `AncillaryEntity` [Builder]
- `setBuilderFields(AncillaryEntityBuilder arg0)` → `void` [Setter]
- `getLegalEntity()` → `LegalEntity` [Getter]
- `getAncillaryParty()` → `AncillaryRoleEnum` [Getter]

### AncillaryPartyBuilderImpl
**Implements:** `AncillaryParty$AncillaryPartyBuilder` 

**Fields:**
- `AncillaryRoleEnum role`
- `List (List) partyReference`
- `CounterpartyRoleEnum onBehalfOf`

**Key Methods:**
- `build()` → `AncillaryParty` [Builder]
- `setOnBehalfOf(CounterpartyRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `setRole(AncillaryRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `getRole()` → `AncillaryRoleEnum` [Getter]
- `getPartyReference()` → `List` [Getter]
- `setPartyReferenceValue(List arg0)` → `AncillaryPartyBuilder` [Setter]
- `getOrCreatePartyReference(int arg0)` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(List arg0)` → `AncillaryPartyBuilder` [Setter]
- `getOnBehalfOf()` → `CounterpartyRoleEnum` [Getter]

### AncillaryPartyImpl
**Implements:** `AncillaryParty` 

**Key Methods:**
- `build()` → `AncillaryParty` [Builder]
- `getRole()` → `AncillaryRoleEnum` [Getter]
- `setBuilderFields(AncillaryPartyBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `List` [Getter]
- `getOnBehalfOf()` → `CounterpartyRoleEnum` [Getter]

### BusinessUnitBuilderImpl
**Implements:** `BusinessUnit$BusinessUnitBuilder` 

**Fields:**
- `String name`
- `IdentifierBuilder identifier`
- `ContactInformationBuilder contactInformation`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getName()` → `String` [Getter]
- `setName(String arg0)` → `BusinessUnitBuilder` [Setter]
- `build()` → `BusinessUnit` [Builder]
- `getOrCreateIdentifier()` → `IdentifierBuilder` [Getter]
- `setIdentifier(Identifier arg0)` → `BusinessUnitBuilder` [Setter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setContactInformation(ContactInformation arg0)` → `BusinessUnitBuilder` [Setter]
- `getOrCreateContactInformation()` → `ContactInformationBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `BusinessUnitBuilder` [Setter]

### BusinessUnitImpl
**Implements:** `BusinessUnit` 

**Key Methods:**
- `getName()` → `String` [Getter]
- `build()` → `BusinessUnit` [Builder]
- `getContactInformation()` → `ContactInformation` [Getter]
- `setBuilderFields(BusinessUnitBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getIdentifier()` → `Identifier` [Getter]

### BuyerSellerBuilderImpl
**Implements:** `BuyerSeller$BuyerSellerBuilder` 

**Fields:**
- `CounterpartyRoleEnum buyer`
- `CounterpartyRoleEnum seller`

**Key Methods:**
- `build()` → `BuyerSeller` [Builder]
- `getSeller()` → `CounterpartyRoleEnum` [Getter]
- `getBuyer()` → `CounterpartyRoleEnum` [Getter]
- `setSeller(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]
- `setBuyer(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]

### BuyerSellerImpl
**Implements:** `BuyerSeller` 

**Key Methods:**
- `build()` → `BuyerSeller` [Builder]
- `getSeller()` → `CounterpartyRoleEnum` [Getter]
- `getBuyer()` → `CounterpartyRoleEnum` [Getter]
- `setBuilderFields(BuyerSellerBuilder arg0)` → `void` [Setter]

### ContactInformationBuilderImpl
**Implements:** `ContactInformation$ContactInformationBuilder` 

**Fields:**
- `List (List) telephone`
- `List (List) address`
- `List (List) email`
- `List (List) webPage`

**Key Methods:**
- `getAddress()` → `List` [Getter]
- `build()` → `ContactInformation` [Builder]
- `getTelephone()` → `List` [Getter]
- `getOrCreateAddress(int arg0)` → `AddressBuilder` [Getter]
- `setTelephone(List arg0)` → `ContactInformationBuilder` [Setter]
- `getOrCreateTelephone(int arg0)` → `TelephoneNumberBuilder` [Getter]
- `getEmail()` → `List` [Getter]
- `setAddress(List arg0)` → `ContactInformationBuilder` [Setter]
- `setEmail(List arg0)` → `ContactInformationBuilder` [Setter]
- `setWebPage(List arg0)` → `ContactInformationBuilder` [Setter]

### ContactInformationImpl
**Implements:** `ContactInformation` 

**Key Methods:**
- `getAddress()` → `List` [Getter]
- `build()` → `ContactInformation` [Builder]
- `getTelephone()` → `List` [Getter]
- `getEmail()` → `List` [Getter]
- `setBuilderFields(ContactInformationBuilder arg0)` → `void` [Setter]
- `getWebPage()` → `List` [Getter]

### CounterpartyBuilderImpl
**Implements:** `Counterparty$CounterpartyBuilder` 

**Fields:**
- `CounterpartyRoleEnum role`
- `ReferenceWithMetaPartyBuilder partyReference`

**Key Methods:**
- `build()` → `Counterparty` [Builder]
- `setRole(CounterpartyRoleEnum arg0)` → `CounterpartyBuilder` [Setter]
- `getRole()` → `CounterpartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `CounterpartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `CounterpartyBuilder` [Setter]

### CounterpartyImpl
**Implements:** `Counterparty` 

**Key Methods:**
- `build()` → `Counterparty` [Builder]
- `getRole()` → `CounterpartyRoleEnum` [Getter]
- `setBuilderFields(CounterpartyBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]

### LegalEntityBuilderImpl
**Implements:** `LegalEntity$LegalEntityBuilder` 

**Fields:**
- `List (List) entityId`
- `FieldWithMetaStringBuilder name`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getName()` → `FieldWithMetaStringBuilder` [Getter]
- `setName(FieldWithMetaString arg0)` → `LegalEntityBuilder` [Setter]
- `build()` → `LegalEntity` [Builder]
- `setEntityId(List arg0)` → `LegalEntityBuilder` [Setter]
- `getOrCreateEntityId(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setEntityIdValue(List arg0)` → `LegalEntityBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateName()` → `FieldWithMetaStringBuilder` [Getter]
- `setNameValue(String arg0)` → `LegalEntityBuilder` [Setter]
- `getEntityId()` → `List` [Getter]

### LegalEntityImpl
**Implements:** `LegalEntity` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `build()` → `LegalEntity` [Builder]
- `setBuilderFields(LegalEntityBuilder arg0)` → `void` [Setter]
- `getEntityId()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### NaturalPersonBuilderImpl
**Implements:** `NaturalPerson$NaturalPersonBuilder` 

**Fields:**
- `List (List) personId`
- `String honorific`
- `String firstName`
- `List (List) middleName`
- `List (List) initial`
- `String surname`
- `String suffix`
- `Date dateOfBirth`
- `ContactInformationBuilder contactInformation`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `NaturalPerson` [Builder]
- `getFirstName()` → `String` [Getter]
- `getMiddleName()` → `List` [Getter]
- `getDateOfBirth()` → `Date` [Getter]
- `getPersonId()` → `List` [Getter]
- `getHonorific()` → `String` [Getter]
- `setDateOfBirth(Date arg0)` → `NaturalPersonBuilder` [Setter]
- `setMiddleName(List arg0)` → `NaturalPersonBuilder` [Setter]
- `setPersonIdValue(List arg0)` → `NaturalPersonBuilder` [Setter]
- `setPersonId(List arg0)` → `NaturalPersonBuilder` [Setter]

### NaturalPersonImpl
**Implements:** `NaturalPerson` 

**Key Methods:**
- `build()` → `NaturalPerson` [Builder]
- `getFirstName()` → `String` [Getter]
- `getMiddleName()` → `List` [Getter]
- `getDateOfBirth()` → `Date` [Getter]
- `getPersonId()` → `List` [Getter]
- `getHonorific()` → `String` [Getter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `setBuilderFields(NaturalPersonBuilder arg0)` → `void` [Setter]
- `getInitial()` → `List` [Getter]
- `getSurname()` → `String` [Getter]

### NaturalPersonRoleBuilderImpl
**Implements:** `NaturalPersonRole$NaturalPersonRoleBuilder` 

**Fields:**
- `ReferenceWithMetaNaturalPersonBuilder personReference`
- `List (List) role`

**Key Methods:**
- `build()` → `NaturalPersonRole` [Builder]
- `getPersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `getOrCreateRole(int arg0)` → `FieldWithMetaNaturalPersonRoleEnumBuilder` [Getter]
- `getOrCreatePersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `setPersonReference(ReferenceWithMetaNaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setRoleValue(List arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setPersonReferenceValue(NaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setRole(List arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `getRole()` → `List` [Getter]

### NaturalPersonRoleImpl
**Implements:** `NaturalPersonRole` 

**Key Methods:**
- `build()` → `NaturalPersonRole` [Builder]
- `getPersonReference()` → `ReferenceWithMetaNaturalPerson` [Getter]
- `getRole()` → `List` [Getter]
- `setBuilderFields(NaturalPersonRoleBuilder arg0)` → `void` [Setter]

### PartyBuilderImpl
**Implements:** `Party$PartyBuilder` 

**Fields:**
- `List (List) partyId`
- `FieldWithMetaStringBuilder name`
- `List (List) businessUnit`
- `List (List) person`
- `List (List) personRole`
- `AccountBuilder account`
- `ContactInformationBuilder contactInformation`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getName()` → `FieldWithMetaStringBuilder` [Getter]
- `setName(FieldWithMetaString arg0)` → `PartyBuilder` [Setter]
- `build()` → `Party` [Builder]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAccount(Account arg0)` → `PartyBuilder` [Setter]
- `getOrCreateAccount()` → `AccountBuilder` [Getter]
- `setPartyId(List arg0)` → `PartyBuilder` [Setter]

### PartyContactInformationBuilderImpl
**Implements:** `PartyContactInformation$PartyContactInformationBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder partyReference`
- `ContactInformationBuilder contactInformation`
- `List (List) businessUnit`
- `List (List) person`
- `String additionalInformation`

**Key Methods:**
- `build()` → `PartyContactInformation` [Builder]
- `getBusinessUnit()` → `List` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPerson(List arg0)` → `PartyContactInformationBuilder` [Setter]
- `setPartyReferenceValue(Party arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setContactInformation(ContactInformation arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreatePerson(int arg0)` → `NaturalPersonBuilder` [Getter]
- `setBusinessUnit(List arg0)` → `PartyContactInformationBuilder` [Setter]

### PartyContactInformationImpl
**Implements:** `PartyContactInformation` 

**Key Methods:**
- `build()` → `PartyContactInformation` [Builder]
- `getBusinessUnit()` → `List` [Getter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `setBuilderFields(PartyContactInformationBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPerson()` → `List` [Getter]
- `getAdditionalInformation()` → `String` [Getter]

### PartyIdentifierBuilderImpl
**Implements:** `PartyIdentifier$PartyIdentifierBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder identifier`
- `PartyIdentifierTypeEnum identifierType`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PartyIdentifier` [Builder]
- `setIdentifierType(PartyIdentifierTypeEnum arg0)` → `PartyIdentifierBuilder` [Setter]
- `getIdentifierType()` → `PartyIdentifierTypeEnum` [Getter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifier(FieldWithMetaString arg0)` → `PartyIdentifierBuilder` [Setter]
- `setIdentifierValue(String arg0)` → `PartyIdentifierBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PartyIdentifierBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `getIdentifier()` → `FieldWithMetaStringBuilder` [Getter]

### PartyIdentifierImpl
**Implements:** `PartyIdentifier` 

**Key Methods:**
- `build()` → `PartyIdentifier` [Builder]
- `getIdentifierType()` → `PartyIdentifierTypeEnum` [Getter]
- `setBuilderFields(PartyIdentifierBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getIdentifier()` → `FieldWithMetaString` [Getter]

### PartyImpl
**Implements:** `Party` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `build()` → `Party` [Builder]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `setBuilderFields(PartyBuilder arg0)` → `void` [Setter]
- `getAccount()` → `Account` [Getter]
- `getPartyId()` → `List` [Getter]
- `getPerson()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PartyReferencePayerReceiverBuilderImpl
**Implements:** `PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder payerPartyReference`
- `ReferenceWithMetaAccountBuilder payerAccountReference`
- `ReferenceWithMetaPartyBuilder receiverPartyReference`
- `ReferenceWithMetaAccountBuilder receiverAccountReference`

**Key Methods:**
- `build()` → `PartyReferencePayerReceiver` [Builder]
- `getPayerPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setPayerPartyReference(ReferenceWithMetaParty arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setPayerAccountReference(ReferenceWithMetaAccount arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setReceiverPartyReference(ReferenceWithMetaParty arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setPayerPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setReceiverPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `getOrCreateReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]

### PartyReferencePayerReceiverImpl
**Implements:** `PartyReferencePayerReceiver` 

**Key Methods:**
- `build()` → `PartyReferencePayerReceiver` [Builder]
- `getPayerPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccount` [Getter]
- `setBuilderFields(PartyReferencePayerReceiverBuilder arg0)` → `void` [Setter]
- `getReceiverAccountReference()` → `ReferenceWithMetaAccount` [Getter]

### PartyRoleBuilderImpl
**Implements:** `PartyRole$PartyRoleBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder partyReference`
- `PartyRoleEnum role`
- `ReferenceWithMetaPartyBuilder ownershipPartyReference`

**Key Methods:**
- `build()` → `PartyRole` [Builder]
- `setRole(PartyRoleEnum arg0)` → `PartyRoleBuilder` [Setter]
- `getRole()` → `PartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setOwnershipPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreateOwnershipPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setOwnershipPartyReferenceValue(Party arg0)` → `PartyRoleBuilder` [Setter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]

### PartyRoleImpl
**Implements:** `PartyRole` 

**Key Methods:**
- `build()` → `PartyRole` [Builder]
- `getRole()` → `PartyRoleEnum` [Getter]
- `setBuilderFields(PartyRoleBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getOwnershipPartyReference()` → `ReferenceWithMetaParty` [Getter]

### PayerReceiverBuilderImpl
**Implements:** `PayerReceiver$PayerReceiverBuilder` 

**Fields:**
- `CounterpartyRoleEnum payer`
- `CounterpartyRoleEnum receiver`

**Key Methods:**
- `build()` → `PayerReceiver` [Builder]
- `getPayer()` → `CounterpartyRoleEnum` [Getter]
- `setReceiver(CounterpartyRoleEnum arg0)` → `PayerReceiverBuilder` [Setter]
- `setPayer(CounterpartyRoleEnum arg0)` → `PayerReceiverBuilder` [Setter]
- `getReceiver()` → `CounterpartyRoleEnum` [Getter]

### PayerReceiverImpl
**Implements:** `PayerReceiver` 

**Key Methods:**
- `build()` → `PayerReceiver` [Builder]
- `getPayer()` → `CounterpartyRoleEnum` [Getter]
- `setBuilderFields(PayerReceiverBuilder arg0)` → `void` [Setter]
- `getReceiver()` → `CounterpartyRoleEnum` [Getter]

### PersonIdentifierBuilderImpl
**Implements:** `PersonIdentifier$PersonIdentifierBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder identifier`
- `PersonIdentifierTypeEnum identifierType`
- `FieldWithMetaStringBuilder country`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PersonIdentifier` [Builder]
- `getCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifierType(PersonIdentifierTypeEnum arg0)` → `PersonIdentifierBuilder` [Setter]
- `setCountryValue(String arg0)` → `PersonIdentifierBuilder` [Setter]
- `getOrCreateCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `getIdentifierType()` → `PersonIdentifierTypeEnum` [Getter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifier(FieldWithMetaString arg0)` → `PersonIdentifierBuilder` [Setter]
- `setIdentifierValue(String arg0)` → `PersonIdentifierBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

### PersonIdentifierImpl
**Implements:** `PersonIdentifier` 

**Key Methods:**
- `build()` → `PersonIdentifier` [Builder]
- `getCountry()` → `FieldWithMetaString` [Getter]
- `getIdentifierType()` → `PersonIdentifierTypeEnum` [Getter]
- `setBuilderFields(PersonIdentifierBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getIdentifier()` → `FieldWithMetaString` [Getter]

### ReferenceBankBuilderImpl
**Implements:** `ReferenceBank$ReferenceBankBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder referenceBankId`
- `String referenceBankName`

**Key Methods:**
- `build()` → `ReferenceBank` [Builder]
- `getReferenceBankId()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateReferenceBankId()` → `FieldWithMetaStringBuilder` [Getter]
- `setReferenceBankId(FieldWithMetaString arg0)` → `ReferenceBankBuilder` [Setter]
- `setReferenceBankIdValue(String arg0)` → `ReferenceBankBuilder` [Setter]
- `setReferenceBankName(String arg0)` → `ReferenceBankBuilder` [Setter]
- `getReferenceBankName()` → `String` [Getter]

### ReferenceBankImpl
**Implements:** `ReferenceBank` 

**Key Methods:**
- `build()` → `ReferenceBank` [Builder]
- `setBuilderFields(ReferenceBankBuilder arg0)` → `void` [Setter]
- `getReferenceBankId()` → `FieldWithMetaString` [Getter]
- `getReferenceBankName()` → `String` [Getter]

### ReferenceBanksBuilderImpl
**Implements:** `ReferenceBanks$ReferenceBanksBuilder` 

**Fields:**
- `List (List) referenceBank`

**Key Methods:**
- `build()` → `ReferenceBanks` [Builder]
- `getReferenceBank()` → `List` [Getter]
- `setReferenceBank(List arg0)` → `ReferenceBanksBuilder` [Setter]
- `getOrCreateReferenceBank(int arg0)` → `ReferenceBankBuilder` [Getter]

### ReferenceBanksImpl
**Implements:** `ReferenceBanks` 

**Key Methods:**
- `build()` → `ReferenceBanks` [Builder]
- `setBuilderFields(ReferenceBanksBuilder arg0)` → `void` [Setter]
- `getReferenceBank()` → `List` [Getter]

### RelatedPartyBuilderImpl
**Implements:** `RelatedParty$RelatedPartyBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder partyReference`
- `ReferenceWithMetaAccountBuilder accountReference`
- `PartyRoleEnum role`

**Key Methods:**
- `build()` → `RelatedParty` [Builder]
- `setRole(PartyRoleEnum arg0)` → `RelatedPartyBuilder` [Setter]
- `getRole()` → `PartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `RelatedPartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreateAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `RelatedPartyBuilder` [Setter]
- `getAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setAccountReference(ReferenceWithMetaAccount arg0)` → `RelatedPartyBuilder` [Setter]

### RelatedPartyImpl
**Implements:** `RelatedParty` 

**Key Methods:**
- `build()` → `RelatedParty` [Builder]
- `getRole()` → `PartyRoleEnum` [Getter]
- `setBuilderFields(RelatedPartyBuilder arg0)` → `void` [Setter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAccountReference()` → `ReferenceWithMetaAccount` [Getter]

### TelephoneNumberBuilderImpl
**Implements:** `TelephoneNumber$TelephoneNumberBuilder` 

**Fields:**
- `TelephoneTypeEnum telephoneNumberType`
- `String number`

**Key Methods:**
- `build()` → `TelephoneNumber` [Builder]
- `getNumber()` → `String` [Getter]
- `setTelephoneNumberType(TelephoneTypeEnum arg0)` → `TelephoneNumberBuilder` [Setter]
- `getTelephoneNumberType()` → `TelephoneTypeEnum` [Getter]
- `setNumber(String arg0)` → `TelephoneNumberBuilder` [Setter]

### TelephoneNumberImpl
**Implements:** `TelephoneNumber` 

**Key Methods:**
- `build()` → `TelephoneNumber` [Builder]
- `getNumber()` → `String` [Getter]
- `getTelephoneNumberType()` → `TelephoneTypeEnum` [Getter]
- `setBuilderFields(TelephoneNumberBuilder arg0)` → `void` [Setter]

