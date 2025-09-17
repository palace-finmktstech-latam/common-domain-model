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
- `getMeta()` → `MetaFields` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAccountNumber()` → `FieldWithMetaString` [Getter]
- `getServicingParty()` → `ReferenceWithMetaParty` [Getter]
- `getAccountName()` → `FieldWithMetaString` [Getter]
- `getAccountBeneficiary()` → `ReferenceWithMetaParty` [Getter]
- `getAccountType()` → `FieldWithMetaAccountTypeEnum` [Getter]

### AccountBuilder
**Implements:** `Account` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `AccountBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `AccountBuilder` [Setter]
- `getAccountNumber()` → `FieldWithMetaStringBuilder` [Getter]
- `setAccountNumber(FieldWithMetaString arg0)` → `AccountBuilder` [Setter]
- `getServicingParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setAccountNameValue(String arg0)` → `AccountBuilder` [Setter]
- `getOrCreateServicingParty()` → `ReferenceWithMetaPartyBuilder` [Getter]

### Address
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getState()` → `String` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `Address` [Builder]
- `getCountry()` → `FieldWithMetaString` [Getter]
- `getCity()` → `String` [Getter]
- `getStreet()` → `List` [Getter]
- `getPostalCode()` → `String` [Getter]

### AddressBuilder
**Implements:** `Address` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setState(String arg0)` → `AddressBuilder` [Setter]
- `getCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setCountry(FieldWithMetaString arg0)` → `AddressBuilder` [Setter]
- `setStreet(List arg0)` → `AddressBuilder` [Setter]
- `setCity(String arg0)` → `AddressBuilder` [Setter]
- `getOrCreateCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setCountryValue(String arg0)` → `AddressBuilder` [Setter]
- `setPostalCode(String arg0)` → `AddressBuilder` [Setter]

### AncillaryEntity
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AncillaryEntity` [Builder]
- `getAncillaryParty()` → `AncillaryRoleEnum` [Getter]
- `getLegalEntity()` → `LegalEntity` [Getter]

### AncillaryEntityBuilder
**Implements:** `AncillaryEntity` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAncillaryParty(AncillaryRoleEnum arg0)` → `AncillaryEntityBuilder` [Setter]
- `getOrCreateLegalEntity()` → `LegalEntityBuilder` [Getter]
- `getLegalEntity()` → `LegalEntityBuilder` [Getter]
- `setLegalEntity(LegalEntity arg0)` → `AncillaryEntityBuilder` [Setter]

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
- `setRole(AncillaryRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `getPartyReference()` → `List` [Getter]
- `setOnBehalfOf(CounterpartyRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `setPartyReference(List arg0)` → `AncillaryPartyBuilder` [Setter]
- `getOrCreatePartyReference(int arg0)` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(List arg0)` → `AncillaryPartyBuilder` [Setter]

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
- `setIdentifier(Identifier arg0)` → `BusinessUnitBuilder` [Setter]
- `getOrCreateIdentifier()` → `IdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `BusinessUnitBuilder` [Setter]
- `setContactInformation(ContactInformation arg0)` → `BusinessUnitBuilder` [Setter]
- `getOrCreateContactInformation()` → `ContactInformationBuilder` [Getter]
- `getIdentifier()` → `IdentifierBuilder` [Getter]

### BuyerSeller
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BuyerSeller` [Builder]
- `getBuyer()` → `CounterpartyRoleEnum` [Getter]
- `getSeller()` → `CounterpartyRoleEnum` [Getter]

### BuyerSellerBuilder
**Implements:** `BuyerSeller` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBuyer(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]
- `setSeller(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]

### ContactInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `getAddress()` → `List` [Getter]
- `build()` → `ContactInformation` [Builder]
- `getEmail()` → `List` [Getter]
- `getWebPage()` → `List` [Getter]
- `getTelephone()` → `List` [Getter]

### ContactInformationBuilder
**Implements:** `ContactInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAddress()` → `List` [Getter]
- `setAddress(List arg0)` → `ContactInformationBuilder` [Setter]
- `setEmail(List arg0)` → `ContactInformationBuilder` [Setter]
- `setWebPage(List arg0)` → `ContactInformationBuilder` [Setter]
- `setTelephone(List arg0)` → `ContactInformationBuilder` [Setter]
- `getOrCreateTelephone(int arg0)` → `TelephoneNumberBuilder` [Getter]
- `getOrCreateAddress(int arg0)` → `AddressBuilder` [Getter]
- `getTelephone()` → `List` [Getter]

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
- `setPartyReference(ReferenceWithMetaParty arg0)` → `CounterpartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `CounterpartyBuilder` [Setter]

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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEntityId()` → `List` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `LegalEntityBuilder` [Setter]
- `setNameValue(String arg0)` → `LegalEntityBuilder` [Setter]
- `getOrCreateName()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateEntityId(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setEntityId(List arg0)` → `LegalEntityBuilder` [Setter]

### NaturalPerson
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NaturalPerson` [Builder]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getInitial()` → `List` [Getter]
- `getSurname()` → `String` [Getter]
- `getSuffix()` → `String` [Getter]
- `getPersonId()` → `List` [Getter]
- `getMiddleName()` → `List` [Getter]
- `getHonorific()` → `String` [Getter]

### NaturalPersonBuilder
**Implements:** `NaturalPerson` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NaturalPersonBuilder` [Setter]
- `setContactInformation(ContactInformation arg0)` → `NaturalPersonBuilder` [Setter]
- `getOrCreateContactInformation()` → `ContactInformationBuilder` [Getter]
- `setSurname(String arg0)` → `NaturalPersonBuilder` [Setter]
- `setInitial(List arg0)` → `NaturalPersonBuilder` [Setter]
- `setSuffix(String arg0)` → `NaturalPersonBuilder` [Setter]
- `setPersonId(List arg0)` → `NaturalPersonBuilder` [Setter]

### NaturalPersonRole
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NaturalPersonRole` [Builder]
- `getRole()` → `List` [Getter]
- `getPersonReference()` → `ReferenceWithMetaNaturalPerson` [Getter]

### NaturalPersonRoleBuilder
**Implements:** `NaturalPersonRole` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRole(List arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `getRole()` → `List` [Getter]
- `setPersonReference(ReferenceWithMetaNaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `getOrCreatePersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `getOrCreateRole(int arg0)` → `FieldWithMetaNaturalPersonRoleEnumBuilder` [Getter]
- `getPersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `setPersonReferenceValue(NaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setRoleValue(List arg0)` → `NaturalPersonRoleBuilder` [Setter]

### Party
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `Party` [Builder]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAccount()` → `Account` [Getter]
- `getPerson()` → `List` [Getter]
- `getPartyId()` → `List` [Getter]

### PartyBuilder
**Implements:** `Party` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getName()` → `FieldWithMetaStringBuilder` [Getter]
- `setName(FieldWithMetaString arg0)` → `PartyBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PartyBuilder` [Setter]
- `getAccount()` → `AccountBuilder` [Getter]
- `getPerson()` → `List` [Getter]

### PartyContactInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyContactInformation` [Builder]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPerson()` → `List` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAdditionalInformation()` → `String` [Getter]

### PartyContactInformationBuilder
**Implements:** `PartyContactInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPerson()` → `List` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreatePerson(int arg0)` → `NaturalPersonBuilder` [Getter]
- `setBusinessUnit(List arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreateBusinessUnit(int arg0)` → `BusinessUnitBuilder` [Getter]
- `setContactInformation(ContactInformation arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]

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
- `setIdentifierValue(String arg0)` → `PartyIdentifierBuilder` [Setter]
- `setIdentifier(FieldWithMetaString arg0)` → `PartyIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PartyIdentifierBuilder` [Setter]
- `setIdentifierType(PartyIdentifierTypeEnum arg0)` → `PartyIdentifierBuilder` [Setter]
- `getIdentifier()` → `FieldWithMetaStringBuilder` [Getter]

### PartyReferencePayerReceiver
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyReferencePayerReceiver` [Builder]
- `getReceiverAccountReference()` → `ReferenceWithMetaAccount` [Getter]
- `getPayerPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccount` [Getter]

### PartyReferencePayerReceiverBuilder
**Implements:** `PartyReferencePayerReceiver` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getReceiverAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `getPayerPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setPayerPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setReceiverPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `getOrCreateReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreatePayerPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setReceiverAccountReference(ReferenceWithMetaAccount arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setReceiverAccountReferenceValue(Account arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]

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
- `setOwnershipPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOwnershipPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreateOwnershipPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setOwnershipPartyReferenceValue(Party arg0)` → `PartyRoleBuilder` [Setter]

### PayerReceiver
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PayerReceiver` [Builder]
- `getReceiver()` → `CounterpartyRoleEnum` [Getter]
- `getPayer()` → `CounterpartyRoleEnum` [Getter]

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
- `setIdentifierValue(String arg0)` → `PersonIdentifierBuilder` [Setter]
- `setIdentifier(FieldWithMetaString arg0)` → `PersonIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PersonIdentifierBuilder` [Setter]
- `setCountry(FieldWithMetaString arg0)` → `PersonIdentifierBuilder` [Setter]
- `getOrCreateCountry()` → `FieldWithMetaStringBuilder` [Getter]
- `setCountryValue(String arg0)` → `PersonIdentifierBuilder` [Setter]

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
- `setReferenceBankName(String arg0)` → `ReferenceBankBuilder` [Setter]
- `getOrCreateReferenceBankId()` → `FieldWithMetaStringBuilder` [Getter]
- `setReferenceBankId(FieldWithMetaString arg0)` → `ReferenceBankBuilder` [Setter]
- `setReferenceBankIdValue(String arg0)` → `ReferenceBankBuilder` [Setter]

### ReferenceBanks
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceBanks` [Builder]
- `getReferenceBank()` → `List` [Getter]

### ReferenceBanksBuilder
**Implements:** `ReferenceBanks` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateReferenceBank(int arg0)` → `ReferenceBankBuilder` [Getter]
- `getReferenceBank()` → `List` [Getter]
- `setReferenceBank(List arg0)` → `ReferenceBanksBuilder` [Setter]

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
- `getOrCreateAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `RelatedPartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `RelatedPartyBuilder` [Setter]
- `setAccountReferenceValue(Account arg0)` → `RelatedPartyBuilder` [Setter]
- `getAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setAccountReference(ReferenceWithMetaAccount arg0)` → `RelatedPartyBuilder` [Setter]

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
- `setNumber(String arg0)` → `TelephoneNumberBuilder` [Setter]
- `setTelephoneNumberType(TelephoneTypeEnum arg0)` → `TelephoneNumberBuilder` [Setter]

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
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `AccountBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `AccountBuilder` [Setter]
- `getAccountNumber()` → `FieldWithMetaStringBuilder` [Getter]
- `setAccountNumber(FieldWithMetaString arg0)` → `AccountBuilder` [Setter]
- `getServicingParty()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setAccountNameValue(String arg0)` → `AccountBuilder` [Setter]

### AccountImpl
**Implements:** `Account` 

**Key Methods:**
- `build()` → `Account` [Builder]
- `setBuilderFields(AccountBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAccountNumber()` → `FieldWithMetaString` [Getter]
- `getServicingParty()` → `ReferenceWithMetaParty` [Getter]
- `getAccountName()` → `FieldWithMetaString` [Getter]
- `getAccountBeneficiary()` → `ReferenceWithMetaParty` [Getter]
- `getAccountType()` → `FieldWithMetaAccountTypeEnum` [Getter]

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
- `setCountry(FieldWithMetaString arg0)` → `AddressBuilder` [Setter]
- `setStreet(List arg0)` → `AddressBuilder` [Setter]
- `setCity(String arg0)` → `AddressBuilder` [Setter]
- `getCity()` → `String` [Getter]
- `getStreet()` → `List` [Getter]
- `getOrCreateCountry()` → `FieldWithMetaStringBuilder` [Getter]

### AddressImpl
**Implements:** `Address` 

**Key Methods:**
- `getState()` → `String` [Getter]
- `build()` → `Address` [Builder]
- `getCountry()` → `FieldWithMetaString` [Getter]
- `setBuilderFields(AddressBuilder arg0)` → `void` [Setter]
- `getCity()` → `String` [Getter]
- `getStreet()` → `List` [Getter]
- `getPostalCode()` → `String` [Getter]

### AncillaryEntityBuilderImpl
**Implements:** `AncillaryEntity$AncillaryEntityBuilder` 

**Fields:**
- `AncillaryRoleEnum ancillaryParty`
- `LegalEntityBuilder legalEntity`

**Key Methods:**
- `build()` → `AncillaryEntity` [Builder]
- `getAncillaryParty()` → `AncillaryRoleEnum` [Getter]
- `setAncillaryParty(AncillaryRoleEnum arg0)` → `AncillaryEntityBuilder` [Setter]
- `getOrCreateLegalEntity()` → `LegalEntityBuilder` [Getter]
- `getLegalEntity()` → `LegalEntityBuilder` [Getter]
- `setLegalEntity(LegalEntity arg0)` → `AncillaryEntityBuilder` [Setter]

### AncillaryEntityImpl
**Implements:** `AncillaryEntity` 

**Key Methods:**
- `build()` → `AncillaryEntity` [Builder]
- `setBuilderFields(AncillaryEntityBuilder arg0)` → `void` [Setter]
- `getAncillaryParty()` → `AncillaryRoleEnum` [Getter]
- `getLegalEntity()` → `LegalEntity` [Getter]

### AncillaryPartyBuilderImpl
**Implements:** `AncillaryParty$AncillaryPartyBuilder` 

**Fields:**
- `AncillaryRoleEnum role`
- `List (List) partyReference`
- `CounterpartyRoleEnum onBehalfOf`

**Key Methods:**
- `build()` → `AncillaryParty` [Builder]
- `setRole(AncillaryRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `getRole()` → `AncillaryRoleEnum` [Getter]
- `getPartyReference()` → `List` [Getter]
- `getOnBehalfOf()` → `CounterpartyRoleEnum` [Getter]
- `setOnBehalfOf(CounterpartyRoleEnum arg0)` → `AncillaryPartyBuilder` [Setter]
- `setPartyReference(List arg0)` → `AncillaryPartyBuilder` [Setter]
- `getOrCreatePartyReference(int arg0)` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(List arg0)` → `AncillaryPartyBuilder` [Setter]

### AncillaryPartyImpl
**Implements:** `AncillaryParty` 

**Key Methods:**
- `build()` → `AncillaryParty` [Builder]
- `setBuilderFields(AncillaryPartyBuilder arg0)` → `void` [Setter]
- `getRole()` → `AncillaryRoleEnum` [Getter]
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
- `setIdentifier(Identifier arg0)` → `BusinessUnitBuilder` [Setter]
- `getOrCreateIdentifier()` → `IdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `BusinessUnitBuilder` [Setter]
- `setContactInformation(ContactInformation arg0)` → `BusinessUnitBuilder` [Setter]

### BusinessUnitImpl
**Implements:** `BusinessUnit` 

**Key Methods:**
- `getName()` → `String` [Getter]
- `build()` → `BusinessUnit` [Builder]
- `setBuilderFields(BusinessUnitBuilder arg0)` → `void` [Setter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getIdentifier()` → `Identifier` [Getter]

### BuyerSellerBuilderImpl
**Implements:** `BuyerSeller$BuyerSellerBuilder` 

**Fields:**
- `CounterpartyRoleEnum buyer`
- `CounterpartyRoleEnum seller`

**Key Methods:**
- `build()` → `BuyerSeller` [Builder]
- `getBuyer()` → `CounterpartyRoleEnum` [Getter]
- `getSeller()` → `CounterpartyRoleEnum` [Getter]
- `setBuyer(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]
- `setSeller(CounterpartyRoleEnum arg0)` → `BuyerSellerBuilder` [Setter]

### BuyerSellerImpl
**Implements:** `BuyerSeller` 

**Key Methods:**
- `build()` → `BuyerSeller` [Builder]
- `setBuilderFields(BuyerSellerBuilder arg0)` → `void` [Setter]
- `getBuyer()` → `CounterpartyRoleEnum` [Getter]
- `getSeller()` → `CounterpartyRoleEnum` [Getter]

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
- `setAddress(List arg0)` → `ContactInformationBuilder` [Setter]
- `setEmail(List arg0)` → `ContactInformationBuilder` [Setter]
- `getEmail()` → `List` [Getter]
- `getWebPage()` → `List` [Getter]
- `setWebPage(List arg0)` → `ContactInformationBuilder` [Setter]
- `setTelephone(List arg0)` → `ContactInformationBuilder` [Setter]
- `getOrCreateTelephone(int arg0)` → `TelephoneNumberBuilder` [Getter]
- `getOrCreateAddress(int arg0)` → `AddressBuilder` [Getter]

### ContactInformationImpl
**Implements:** `ContactInformation` 

**Key Methods:**
- `getAddress()` → `List` [Getter]
- `build()` → `ContactInformation` [Builder]
- `setBuilderFields(ContactInformationBuilder arg0)` → `void` [Setter]
- `getEmail()` → `List` [Getter]
- `getWebPage()` → `List` [Getter]
- `getTelephone()` → `List` [Getter]

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
- `setPartyReference(ReferenceWithMetaParty arg0)` → `CounterpartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `CounterpartyBuilder` [Setter]

### CounterpartyImpl
**Implements:** `Counterparty` 

**Key Methods:**
- `build()` → `Counterparty` [Builder]
- `setBuilderFields(CounterpartyBuilder arg0)` → `void` [Setter]
- `getRole()` → `CounterpartyRoleEnum` [Getter]
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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEntityId()` → `List` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `LegalEntityBuilder` [Setter]
- `setNameValue(String arg0)` → `LegalEntityBuilder` [Setter]
- `getOrCreateName()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateEntityId(int arg0)` → `FieldWithMetaStringBuilder` [Getter]

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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `NaturalPersonBuilder` [Setter]
- `setContactInformation(ContactInformation arg0)` → `NaturalPersonBuilder` [Setter]
- `getOrCreateContactInformation()` → `ContactInformationBuilder` [Getter]
- `setSurname(String arg0)` → `NaturalPersonBuilder` [Setter]
- `getInitial()` → `List` [Getter]
- `getSurname()` → `String` [Getter]

### NaturalPersonImpl
**Implements:** `NaturalPerson` 

**Key Methods:**
- `build()` → `NaturalPerson` [Builder]
- `setBuilderFields(NaturalPersonBuilder arg0)` → `void` [Setter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getInitial()` → `List` [Getter]
- `getSurname()` → `String` [Getter]
- `getSuffix()` → `String` [Getter]
- `getPersonId()` → `List` [Getter]
- `getMiddleName()` → `List` [Getter]
- `getHonorific()` → `String` [Getter]

### NaturalPersonRoleBuilderImpl
**Implements:** `NaturalPersonRole$NaturalPersonRoleBuilder` 

**Fields:**
- `ReferenceWithMetaNaturalPersonBuilder personReference`
- `List (List) role`

**Key Methods:**
- `build()` → `NaturalPersonRole` [Builder]
- `setRole(List arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `getRole()` → `List` [Getter]
- `setPersonReference(ReferenceWithMetaNaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `getOrCreatePersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `getOrCreateRole(int arg0)` → `FieldWithMetaNaturalPersonRoleEnumBuilder` [Getter]
- `getPersonReference()` → `ReferenceWithMetaNaturalPersonBuilder` [Getter]
- `setPersonReferenceValue(NaturalPerson arg0)` → `NaturalPersonRoleBuilder` [Setter]
- `setRoleValue(List arg0)` → `NaturalPersonRoleBuilder` [Setter]

### NaturalPersonRoleImpl
**Implements:** `NaturalPersonRole` 

**Key Methods:**
- `build()` → `NaturalPersonRole` [Builder]
- `setBuilderFields(NaturalPersonRoleBuilder arg0)` → `void` [Setter]
- `getRole()` → `List` [Getter]
- `getPersonReference()` → `ReferenceWithMetaNaturalPerson` [Getter]

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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PartyBuilder` [Setter]
- `getAccount()` → `AccountBuilder` [Getter]

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
- `getContactInformation()` → `ContactInformationBuilder` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPerson()` → `List` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreatePerson(int arg0)` → `NaturalPersonBuilder` [Getter]
- `setBusinessUnit(List arg0)` → `PartyContactInformationBuilder` [Setter]
- `getOrCreateBusinessUnit(int arg0)` → `BusinessUnitBuilder` [Getter]
- `setContactInformation(ContactInformation arg0)` → `PartyContactInformationBuilder` [Setter]

### PartyContactInformationImpl
**Implements:** `PartyContactInformation` 

**Key Methods:**
- `build()` → `PartyContactInformation` [Builder]
- `setBuilderFields(PartyContactInformationBuilder arg0)` → `void` [Setter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPerson()` → `List` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getAdditionalInformation()` → `String` [Getter]

### PartyIdentifierBuilderImpl
**Implements:** `PartyIdentifier$PartyIdentifierBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder identifier`
- `PartyIdentifierTypeEnum identifierType`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PartyIdentifier` [Builder]
- `getIdentifierType()` → `PartyIdentifierTypeEnum` [Getter]
- `setIdentifierValue(String arg0)` → `PartyIdentifierBuilder` [Setter]
- `setIdentifier(FieldWithMetaString arg0)` → `PartyIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PartyIdentifierBuilder` [Setter]
- `setIdentifierType(PartyIdentifierTypeEnum arg0)` → `PartyIdentifierBuilder` [Setter]
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
- `setBuilderFields(PartyBuilder arg0)` → `void` [Setter]
- `getContactInformation()` → `ContactInformation` [Getter]
- `getBusinessUnit()` → `List` [Getter]
- `getPersonRole()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAccount()` → `Account` [Getter]
- `getPerson()` → `List` [Getter]
- `getPartyId()` → `List` [Getter]

### PartyReferencePayerReceiverBuilderImpl
**Implements:** `PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder payerPartyReference`
- `ReferenceWithMetaAccountBuilder payerAccountReference`
- `ReferenceWithMetaPartyBuilder receiverPartyReference`
- `ReferenceWithMetaAccountBuilder receiverAccountReference`

**Key Methods:**
- `build()` → `PartyReferencePayerReceiver` [Builder]
- `getReceiverAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `getPayerPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `setPayerPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `setReceiverPartyReferenceValue(Party arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]
- `getOrCreateReceiverPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOrCreatePayerPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setReceiverAccountReference(ReferenceWithMetaAccount arg0)` → `PartyReferencePayerReceiverBuilder` [Setter]

### PartyReferencePayerReceiverImpl
**Implements:** `PartyReferencePayerReceiver` 

**Key Methods:**
- `build()` → `PartyReferencePayerReceiver` [Builder]
- `getReceiverAccountReference()` → `ReferenceWithMetaAccount` [Getter]
- `getPayerPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getReceiverPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getPayerAccountReference()` → `ReferenceWithMetaAccount` [Getter]
- `setBuilderFields(PartyReferencePayerReceiverBuilder arg0)` → `void` [Setter]

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
- `setOwnershipPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getOwnershipPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `PartyRoleBuilder` [Setter]
- `getOrCreateOwnershipPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]

### PartyRoleImpl
**Implements:** `PartyRole` 

**Key Methods:**
- `build()` → `PartyRole` [Builder]
- `setBuilderFields(PartyRoleBuilder arg0)` → `void` [Setter]
- `getRole()` → `PartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaParty` [Getter]
- `getOwnershipPartyReference()` → `ReferenceWithMetaParty` [Getter]

### PayerReceiverBuilderImpl
**Implements:** `PayerReceiver$PayerReceiverBuilder` 

**Fields:**
- `CounterpartyRoleEnum payer`
- `CounterpartyRoleEnum receiver`

**Key Methods:**
- `build()` → `PayerReceiver` [Builder]
- `getReceiver()` → `CounterpartyRoleEnum` [Getter]
- `setReceiver(CounterpartyRoleEnum arg0)` → `PayerReceiverBuilder` [Setter]
- `setPayer(CounterpartyRoleEnum arg0)` → `PayerReceiverBuilder` [Setter]
- `getPayer()` → `CounterpartyRoleEnum` [Getter]

### PayerReceiverImpl
**Implements:** `PayerReceiver` 

**Key Methods:**
- `build()` → `PayerReceiver` [Builder]
- `setBuilderFields(PayerReceiverBuilder arg0)` → `void` [Setter]
- `getReceiver()` → `CounterpartyRoleEnum` [Getter]
- `getPayer()` → `CounterpartyRoleEnum` [Getter]

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
- `getIdentifierType()` → `PersonIdentifierTypeEnum` [Getter]
- `setIdentifierValue(String arg0)` → `PersonIdentifierBuilder` [Setter]
- `setIdentifier(FieldWithMetaString arg0)` → `PersonIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PersonIdentifierBuilder` [Setter]
- `setCountry(FieldWithMetaString arg0)` → `PersonIdentifierBuilder` [Setter]

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
- `setReferenceBankName(String arg0)` → `ReferenceBankBuilder` [Setter]
- `getOrCreateReferenceBankId()` → `FieldWithMetaStringBuilder` [Getter]
- `setReferenceBankId(FieldWithMetaString arg0)` → `ReferenceBankBuilder` [Setter]
- `setReferenceBankIdValue(String arg0)` → `ReferenceBankBuilder` [Setter]
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
- `getOrCreateReferenceBank(int arg0)` → `ReferenceBankBuilder` [Getter]
- `getReferenceBank()` → `List` [Getter]
- `setReferenceBank(List arg0)` → `ReferenceBanksBuilder` [Setter]

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
- `getOrCreateAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]
- `getRole()` → `PartyRoleEnum` [Getter]
- `getPartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReference(ReferenceWithMetaParty arg0)` → `RelatedPartyBuilder` [Setter]
- `getOrCreatePartyReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setPartyReferenceValue(Party arg0)` → `RelatedPartyBuilder` [Setter]
- `setAccountReferenceValue(Account arg0)` → `RelatedPartyBuilder` [Setter]
- `getAccountReference()` → `ReferenceWithMetaAccountBuilder` [Getter]

### RelatedPartyImpl
**Implements:** `RelatedParty` 

**Key Methods:**
- `build()` → `RelatedParty` [Builder]
- `setBuilderFields(RelatedPartyBuilder arg0)` → `void` [Setter]
- `getRole()` → `PartyRoleEnum` [Getter]
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
- `setNumber(String arg0)` → `TelephoneNumberBuilder` [Setter]
- `getTelephoneNumberType()` → `TelephoneTypeEnum` [Getter]
- `setTelephoneNumberType(TelephoneTypeEnum arg0)` → `TelephoneNumberBuilder` [Setter]

### TelephoneNumberImpl
**Implements:** `TelephoneNumber` 

**Key Methods:**
- `build()` → `TelephoneNumber` [Builder]
- `getNumber()` → `String` [Getter]
- `setBuilderFields(TelephoneNumberBuilder arg0)` → `void` [Setter]
- `getTelephoneNumberType()` → `TelephoneTypeEnum` [Getter]

