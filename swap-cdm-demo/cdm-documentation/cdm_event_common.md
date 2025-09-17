# Package: cdm.event.common

## Enums

### ActionEnum
**Values:**
- `New`
- `Correct`
- `Cancel`

### AffirmationStatusEnum
**Values:**
- `Affirmed`
- `Unaffirmed`

### AssetTransferTypeEnum
**Values:**
- `FreeOfPayment`

### CallTypeEnum
**Values:**
- `MarginCall`
- `Notification`
- `ExpectedCall`

### CollateralStatusEnum
**Values:**
- `FullAmount`
- `SettledAmount`
- `InTransitAmount`

### ConfirmationStatusEnum
**Values:**
- `Confirmed`
- `Unconfirmed`

### CorporateActionTypeEnum
**Values:**
- `CashDividend`
- `StockDividend`
- `StockSplit`
- `ReverseStockSplit`
- `SpinOff`
- `Merger`
- `Delisting`
- `StockNameChange`
- `StockIdentifierChange`
- `RightsIssue`
- `Takeover`
- `StockReclassification`
- `BonusIssue`
- `ClassAction`
- `EarlyRedemption`
- `Liquidation`

### CreditEventTypeEnum
**Values:**
- `Bankruptcy`
- `DistressedRatingsDowngrade`
- `FailureToPay`
- `FailureToPayInterest`
- `FailureToPayPrincipal`
- `GovernmentalIntervention`
- `ImpliedWritedown`
- `MaturityExtension`
- `ObligationAcceleration`
- `ObligationDefault`
- `RepudiationMoratorium`
- `Restructuring`
- `Writedown`

### EventIntentEnum
**Values:**
- `Allocation`
- `CashFlow`
- `Clearing`
- `Compression`
- `ContractFormation`
- `ContractTermsAmendment`
- `CorporateActionAdjustment`
- `CreditEvent`
- `Decrease`
- `EarlyTerminationProvision`
- `Increase`
- `IndexTransition`
- `NotionalReset`
- `NotionalStep`
- `Novation`
- `ObservationRecord`
- `OptionExercise`
- `OptionalExtension`
- `OptionalCancellation`
- `PortfolioRebalancing`
- `PrincipalExchange`
- `Reallocation`
- `Repurchase`

### ExecutionTypeEnum
**Values:**
- `Electronic`
- `OffFacility`
- `OnVenue`

### HaircutIndicatorEnum
**Values:**
- `PreHaircut`
- `PostHaircut`

### InstructionFunctionEnum
**Values:**
- `Execution`
- `ContractFormation`
- `QuantityChange`
- `Renegotiation`
- `Compression`

### MarginCallActionEnum
**Values:**
- `Delivery`
- `Return`

### MarginCallResponseTypeEnum
**Values:**
- `AgreeinFull`
- `PartiallyAgree`
- `Dispute`

### PerformanceTransferTypeEnum
**Values:**
- `Commodity`
- `Correlation`
- `Dividend`
- `Equity`
- `Interest`
- `Volatility`
- `Variance`

### PositionEventIntentEnum
**Values:**
- `PositionCreation`
- `CorporateActionAdjustment`
- `Decrease`
- `Increase`
- `Transfer`
- `OptionExercise`
- `Valuation`

### PriceTimingEnum
**Values:**
- `ClosingPrice`
- `OpeningPrice`

### RecordAmountTypeEnum
**Values:**
- `AccountTotal`
- `GrandTotal`
- `ParentTotal`

### RegIMRoleEnum
**Values:**
- `Pledgor`
- `Secured`

### RegMarginTypeEnum
**Values:**
- `VM`
- `RegIM`
- `NonRegIM`

### TransferStatusEnum
**Values:**
- `Disputed`
- `Instructed`
- `Pending`
- `Settled`
- `Netted`

### ValuationSourceEnum
**Values:**
- `CentralCounterparty`

### ValuationTypeEnum
**Values:**
- `MarkToMarket`
- `MarkToModel`

## Interfaces

### BillingInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingInstruction` [Builder]
- `getBillingSummary()` → `List` [Getter]
- `getSendingParty()` → `Party` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getBillingStartDate()` → `Date` [Getter]
- `getBillingRecordInstruction()` → `List` [Getter]

### BillingInstructionBuilder
**Implements:** `BillingInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getBillingSummary()` → `List` [Getter]
- `getSendingParty()` → `PartyBuilder` [Getter]
- `getReceivingParty()` → `PartyBuilder` [Getter]
- `getBillingRecordInstruction()` → `List` [Getter]
- `getOrCreateBillingRecordInstruction(int arg0)` → `BillingRecordInstructionBuilder` [Getter]
- `setBillingRecordInstruction(List arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateSendingParty()` → `PartyBuilder` [Getter]
- `setBillingStartDate(Date arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateReceivingParty()` → `PartyBuilder` [Getter]
- `getOrCreateBillingSummary(int arg0)` → `BillingSummaryInstructionBuilder` [Getter]

### BillingRecord
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingRecord` [Builder]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]
- `getRecordTransfer()` → `Transfer` [Getter]
- `getMinimumFee()` → `Money` [Getter]

### BillingRecordBuilder
**Implements:** `BillingRecord` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `setMinimumFee(Money arg0)` → `BillingRecordBuilder` [Setter]
- `setRecordTransfer(Transfer arg0)` → `BillingRecordBuilder` [Setter]
- `setRecordEndDate(Date arg0)` → `BillingRecordBuilder` [Setter]
- `setRecordStartDate(Date arg0)` → `BillingRecordBuilder` [Setter]
- `getOrCreateRecordTransfer()` → `TransferBuilder` [Getter]
- `setTradeState(ReferenceWithMetaTradeState arg0)` → `BillingRecordBuilder` [Setter]
- `setTradeStateValue(TradeState arg0)` → `BillingRecordBuilder` [Setter]
- `getOrCreateTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreateMinimumFee()` → `MoneyBuilder` [Getter]

### BillingRecordInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingRecordInstruction` [Builder]
- `getSettlementDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getObservation()` → `List` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]

### BillingRecordInstructionBuilder
**Implements:** `BillingRecordInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSettlementDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getObservation()` → `List` [Getter]
- `setRecordEndDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setRecordStartDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setTradeState(ReferenceWithMetaTradeState arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setTradeStateValue(TradeState arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `getOrCreateTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreateObservation(int arg0)` → `ObservationBuilder` [Getter]
- `setObservation(List arg0)` → `BillingRecordInstructionBuilder` [Setter]

### BillingSummary
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingSummary` [Builder]
- `getSummaryTransfer()` → `Transfer` [Getter]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]

### BillingSummaryBuilder
**Implements:** `BillingSummary` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSummaryTransfer(Transfer arg0)` → `BillingSummaryBuilder` [Setter]
- `getOrCreateSummaryTransfer()` → `TransferBuilder` [Getter]
- `setSummaryAmountType(RecordAmountTypeEnum arg0)` → `BillingSummaryBuilder` [Setter]
- `getSummaryTransfer()` → `TransferBuilder` [Getter]

### BillingSummaryInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingSummaryInstruction` [Builder]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]

### BillingSummaryInstructionBuilder
**Implements:** `BillingSummaryInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSummaryAmountType(RecordAmountTypeEnum arg0)` → `BillingSummaryInstructionBuilder` [Setter]

### BusinessEvent
**Implements:** `EventInstruction` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BusinessEvent` [Builder]
- `getEventQualifier()` → `String` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAfter()` → `List` [Getter]

### BusinessEventBuilder
**Implements:** `BusinessEvent` `EventInstruction$EventInstructionBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setEventDate(Date arg0)` → `BusinessEventBuilder` [Setter]
- `setIntent(EventIntentEnum arg0)` → `BusinessEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `BusinessEventBuilder` [Setter]
- `getAfter()` → `List` [Getter]
- `setPackageInformation(IdentifiedList arg0)` → `BusinessEventBuilder` [Setter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `BusinessEventBuilder` [Setter]
- `getOrCreateAfter(int arg0)` → `TradeStateBuilder` [Getter]
- `setInstruction(List arg0)` → `BusinessEventBuilder` [Setter]

### CalculateTransferInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculateTransferInstruction` [Builder]
- `getDate()` → `Date` [Getter]
- `getQuantity()` → `Quantity` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getTradeState()` → `TradeState` [Getter]
- `getResets()` → `List` [Getter]
- `getPayout()` → `ReferenceWithMetaPayout` [Getter]

### CalculateTransferInstructionBuilder
**Implements:** `CalculateTransferInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDate(Date arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getQuantity()` → `QuantityBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(Quantity arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `getTradeState()` → `TradeStateBuilder` [Getter]
- `getOrCreateResets(int arg0)` → `ResetBuilder` [Getter]
- `setPayout(ReferenceWithMetaPayout arg0)` → `CalculateTransferInstructionBuilder` [Setter]

### ClearingInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ClearingInstruction` [Builder]
- `getIsOpenOffer()` → `Boolean` [Getter]
- `getClearerParty2()` → `Party` [Getter]
- `getClearingParty()` → `Party` [Getter]
- `getClearerParty1()` → `Party` [Getter]
- `getAlphaContract()` → `TradeState` [Getter]
- `getParty2()` → `Party` [Getter]
- `getParty1()` → `Party` [Getter]

### ClearingInstructionBuilder
**Implements:** `ClearingInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAlphaContract()` → `TradeStateBuilder` [Getter]
- `getOrCreateClearerParty2()` → `PartyBuilder` [Getter]
- `getOrCreateClearerParty1()` → `PartyBuilder` [Getter]
- `getOrCreateParty1()` → `PartyBuilder` [Getter]
- `getOrCreateClearingParty()` → `PartyBuilder` [Getter]
- `setClearerParty1(Party arg0)` → `ClearingInstructionBuilder` [Setter]
- `setClearingParty(Party arg0)` → `ClearingInstructionBuilder` [Setter]
- `getClearerParty2()` → `PartyBuilder` [Getter]
- `getClearingParty()` → `PartyBuilder` [Getter]
- `getClearerParty1()` → `PartyBuilder` [Getter]

### CollateralBalance
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralBalance` [Builder]
- `getCollateralBalanceStatus()` → `CollateralStatusEnum` [Getter]
- `getAmountBaseCurrency()` → `Money` [Getter]
- `getHaircutIndicator()` → `HaircutIndicatorEnum` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]

### CollateralBalanceBuilder
**Implements:** `CollateralBalance` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAmountBaseCurrency(Money arg0)` → `CollateralBalanceBuilder` [Setter]
- `setCollateralBalanceStatus(CollateralStatusEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `getAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setHaircutIndicator(HaircutIndicatorEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `CollateralBalanceBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getOrCreateAmountBaseCurrency()` → `MoneyBuilder` [Getter]

### CollateralPortfolio
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralPortfolio` [Builder]
- `getCollateralBalance()` → `List` [Getter]
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreement` [Getter]
- `getPortfolioIdentifier()` → `Identifier` [Getter]
- `getCollateralPosition()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CollateralPortfolioBuilder
**Implements:** `CollateralPortfolio` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getCollateralBalance()` → `List` [Getter]
- `getOrCreateLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `setPortfolioIdentifier(Identifier arg0)` → `CollateralPortfolioBuilder` [Setter]
- `getPortfolioIdentifier()` → `IdentifierBuilder` [Getter]
- `getCollateralPosition()` → `List` [Getter]
- `setCollateralBalance(List arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setCollateralPosition(List arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setLegalAgreementValue(LegalAgreement arg0)` → `CollateralPortfolioBuilder` [Setter]

### CollateralPosition
**Implements:** `Position` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralPosition` [Builder]
- `getTreatment()` → `CollateralTreatment` [Getter]
- `getCollateralPositionStatus()` → `CollateralStatusEnum` [Getter]

### CollateralPositionBuilder
**Implements:** `CollateralPosition` `Position$PositionBuilder` 

**Key Methods:**
- `getTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `CollateralPositionBuilder` [Setter]
- `setCashBalance(Money arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `setTreatment(CollateralTreatment arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReferenceValue(TradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `getOrCreateTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setCollateralPositionStatus(CollateralStatusEnum arg0)` → `CollateralPositionBuilder` [Setter]
- `setProduct(Product arg0)` → `CollateralPositionBuilder` [Setter]

### ContractDetails
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ContractDetails` [Builder]
- `getDocumentation()` → `List` [Getter]
- `getGoverningLaw()` → `FieldWithMetaGoverningLawEnum` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ContractDetailsBuilder
**Implements:** `ContractDetails` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getDocumentation()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `setGoverningLawValue(GoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `setGoverningLaw(FieldWithMetaGoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `getGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `getOrCreateDocumentation(int arg0)` → `LegalAgreementBuilder` [Getter]
- `setDocumentation(List arg0)` → `ContractDetailsBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ContractDetailsBuilder` [Setter]

### ContractFormationInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ContractFormationInstruction` [Builder]
- `getLegalAgreement()` → `List` [Getter]

### ContractFormationInstructionBuilder
**Implements:** `ContractFormationInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateLegalAgreement(int arg0)` → `LegalAgreementBuilder` [Getter]
- `getLegalAgreement()` → `List` [Getter]
- `setLegalAgreement(List arg0)` → `ContractFormationInstructionBuilder` [Setter]

### CorporateAction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CorporateAction` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getCorporateActionType()` → `CorporateActionTypeEnum` [Getter]
- `getExDate()` → `Date` [Getter]
- `getPayDate()` → `Date` [Getter]

### CorporateActionBuilder
**Implements:** `CorporateAction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `CorporateActionBuilder` [Setter]
- `setCorporateActionType(CorporateActionTypeEnum arg0)` → `CorporateActionBuilder` [Setter]
- `setPayDate(Date arg0)` → `CorporateActionBuilder` [Setter]
- `setExDate(Date arg0)` → `CorporateActionBuilder` [Setter]

### CounterpartyPositionBusinessEvent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CounterpartyPositionBusinessEvent` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getAfter()` → `List` [Getter]
- `getIntent()` → `PositionEventIntentEnum` [Getter]

### CounterpartyPositionBusinessEventBuilder
**Implements:** `CounterpartyPositionBusinessEvent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setEventDate(Date arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getOrCreatePackageInformation()` → `IdentifiedListBuilder` [Getter]
- `setIntent(PositionEventIntentEnum arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getAfter()` → `List` [Getter]
- `setPackageInformation(IdentifiedList arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getOrCreateAfter(int arg0)` → `CounterpartyPositionStateBuilder` [Getter]
- `setAfter(List arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]

### CounterpartyPositionState
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getState()` → `State` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `CounterpartyPositionState` [Builder]
- `getObservationHistory()` → `List` [Getter]
- `getValuationHistory()` → `List` [Getter]
- `getCounterpartyPosition()` → `CounterpartyPosition` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CounterpartyPositionStateBuilder
**Implements:** `CounterpartyPositionState` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getState()` → `StateBuilder` [Getter]
- `setState(State arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getObservationHistory()` → `List` [Getter]
- `getValuationHistory()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setValuationHistory(List arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `setObservationHistory(List arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `setCounterpartyPosition(CounterpartyPosition arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `getCounterpartyPosition()` → `CounterpartyPositionBuilder` [Getter]

### CreditEvent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditEvent` [Builder]
- `getEventDeterminationDate()` → `Date` [Getter]
- `getRecoveryPercent()` → `BigDecimal` [Getter]
- `getCreditEventType()` → `CreditEventTypeEnum` [Getter]
- `getAuctionDate()` → `Date` [Getter]
- `getFinalPrice()` → `Price` [Getter]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `getPubliclyAvailableInformation()` → `List` [Getter]

### CreditEventBuilder
**Implements:** `CreditEvent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCreditEventType(CreditEventTypeEnum arg0)` → `CreditEventBuilder` [Setter]
- `getOrCreateFinalPrice()` → `PriceBuilder` [Getter]
- `setEventDeterminationDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setRecoveryPercent(BigDecimal arg0)` → `CreditEventBuilder` [Setter]
- `setFinalPrice(Price arg0)` → `CreditEventBuilder` [Setter]
- `setAuctionDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setReferenceInformation(ReferenceInformation arg0)` → `CreditEventBuilder` [Setter]
- `getFinalPrice()` → `PriceBuilder` [Getter]
- `getReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `getPubliclyAvailableInformation()` → `List` [Getter]

### ExecutionDetails
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExecutionDetails` [Builder]
- `getExecutionType()` → `ExecutionTypeEnum` [Getter]
- `getPackageReference()` → `IdentifiedList` [Getter]
- `getExecutionVenue()` → `LegalEntity` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExecutionDetailsBuilder
**Implements:** `ExecutionDetails` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPackageReference()` → `IdentifiedListBuilder` [Getter]
- `getExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `getOrCreateExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `setPackageReference(IdentifiedList arg0)` → `ExecutionDetailsBuilder` [Setter]
- `setExecutionVenue(LegalEntity arg0)` → `ExecutionDetailsBuilder` [Setter]
- `setExecutionType(ExecutionTypeEnum arg0)` → `ExecutionDetailsBuilder` [Setter]
- `getOrCreatePackageReference()` → `IdentifiedListBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExecutionDetailsBuilder` [Setter]

### ExecutionInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExecutionInstruction` [Builder]
- `getTradeDate()` → `FieldWithMetaDate` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]
- `getExecutionDetails()` → `ExecutionDetails` [Getter]
- `getCollateral()` → `Collateral` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]

### ExecutionInstructionBuilder
**Implements:** `ExecutionInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getTradeDate()` → `FieldWithMetaDateBuilder` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `getExecutionDetails()` → `ExecutionDetailsBuilder` [Getter]
- `getCollateral()` → `CollateralBuilder` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getLotIdentifier()` → `IdentifierBuilder` [Getter]
- `getOrCreatePartyRoles(int arg0)` → `PartyRoleBuilder` [Getter]

### ExerciseEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseEvent` [Builder]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedRelevantSwapEffectiveDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExerciseEventBuilder
**Implements:** `ExerciseEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedRelevantSwapEffectiveDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExerciseEventBuilder` [Setter]

### ExerciseInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseInstruction` [Builder]
- `getReplacementTradeIdentifier()` → `List` [Getter]
- `getExerciseTime()` → `BusinessCenterTime` [Getter]
- `getExerciseQuantity()` → `PrimitiveInstruction` [Getter]
- `getExerciseOption()` → `ReferenceWithMetaOptionPayout` [Getter]
- `getExerciseDate()` → `AdjustableOrAdjustedDate` [Getter]

### ExerciseInstructionBuilder
**Implements:** `ExerciseInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getReplacementTradeIdentifier()` → `List` [Getter]
- `getOrCreateExerciseQuantity()` → `PrimitiveInstructionBuilder` [Getter]
- `getOrCreateReplacementTradeIdentifier(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `setReplacementTradeIdentifier(List arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseQuantity(PrimitiveInstruction arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseTime(BusinessCenterTime arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseOption(ReferenceWithMetaOptionPayout arg0)` → `ExerciseInstructionBuilder` [Setter]
- `getExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateExerciseOption()` → `ReferenceWithMetaOptionPayoutBuilder` [Getter]
- `setExerciseDate(AdjustableOrAdjustedDate arg0)` → `ExerciseInstructionBuilder` [Setter]

### Exposure
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Exposure` [Builder]
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioState` [Getter]
- `getValuationDateTime()` → `ZonedDateTime` [Getter]
- `getCalculationDateTime()` → `ZonedDateTime` [Getter]
- `getAggregateValue()` → `Money` [Getter]

### ExposureBuilder
**Implements:** `Exposure` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `getAggregateValue()` → `MoneyBuilder` [Getter]
- `setCalculationDateTime(ZonedDateTime arg0)` → `ExposureBuilder` [Setter]
- `setValuationDateTime(ZonedDateTime arg0)` → `ExposureBuilder` [Setter]
- `setTradePortfolioValue(PortfolioState arg0)` → `ExposureBuilder` [Setter]
- `getOrCreateTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `setTradePortfolio(ReferenceWithMetaPortfolioState arg0)` → `ExposureBuilder` [Setter]
- `getOrCreateAggregateValue()` → `MoneyBuilder` [Getter]
- `setAggregateValue(Money arg0)` → `ExposureBuilder` [Setter]

### IndexTransitionInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `IndexTransitionInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getCashTransfer()` → `Transfer` [Getter]
- `getPriceQuantity()` → `List` [Getter]

### IndexTransitionInstructionBuilder
**Implements:** `IndexTransitionInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCashTransfer()` → `TransferBuilder` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `setPriceQuantity(List arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setEffectiveDate(Date arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `setCashTransfer(Transfer arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getOrCreateCashTransfer()` → `TransferBuilder` [Getter]

### Instruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Instruction` [Builder]
- `getBefore()` → `ReferenceWithMetaTradeState` [Getter]
- `getPrimitiveInstruction()` → `PrimitiveInstruction` [Getter]

### InstructionBuilder
**Implements:** `Instruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBefore(ReferenceWithMetaTradeState arg0)` → `InstructionBuilder` [Setter]
- `getBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getPrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]
- `getOrCreatePrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]
- `setBeforeValue(TradeState arg0)` → `InstructionBuilder` [Setter]
- `setPrimitiveInstruction(PrimitiveInstruction arg0)` → `InstructionBuilder` [Setter]
- `getOrCreateBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]

### Lineage
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Lineage` [Builder]
- `getTradeReference()` → `List` [Getter]
- `getEventReference()` → `List` [Getter]
- `getPortfolioStateReference()` → `List` [Getter]

### LineageBuilder
**Implements:** `Lineage` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setTradeReference(List arg0)` → `LineageBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeBuilder` [Getter]
- `setEventReference(List arg0)` → `LineageBuilder` [Setter]
- `getOrCreateEventReference(int arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Getter]
- `getEventReference()` → `List` [Getter]
- `setEventReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getPortfolioStateReference()` → `List` [Getter]
- `setPortfolioStateReference(List arg0)` → `LineageBuilder` [Setter]

### MarginCallBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallBase` [Builder]
- `getPartyRole()` → `List` [Getter]
- `getIndependentAmountBalance()` → `CollateralBalance` [Getter]
- `getAgreementMinimumTransferAmount()` → `Money` [Getter]
- `getParty()` → `List` [Getter]
- `getRegMarginType()` → `RegMarginTypeEnum` [Getter]
- `getClearingBroker()` → `Party` [Getter]
- `getCallIdentifier()` → `Identifier` [Getter]
- `getRegIMRole()` → `RegIMRoleEnum` [Getter]

### MarginCallBaseBuilder
**Implements:** `MarginCallBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPartyRole()` → `List` [Getter]
- `getIndependentAmountBalance()` → `CollateralBalanceBuilder` [Getter]
- `getAgreementMinimumTransferAmount()` → `MoneyBuilder` [Getter]
- `getParty()` → `List` [Getter]
- `setAgreementRounding(Money arg0)` → `MarginCallBaseBuilder` [Setter]
- `setInstructionType(MarginCallInstructionType arg0)` → `MarginCallBaseBuilder` [Setter]
- `setClearingBroker(Party arg0)` → `MarginCallBaseBuilder` [Setter]
- `setRegMarginType(RegMarginTypeEnum arg0)` → `MarginCallBaseBuilder` [Setter]
- `setCallAgreementType(AgreementName arg0)` → `MarginCallBaseBuilder` [Setter]
- `setRegIMRole(RegIMRoleEnum arg0)` → `MarginCallBaseBuilder` [Setter]

### MarginCallExposure
**Implements:** `MarginCallBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallExposure` [Builder]
- `getOverallExposure()` → `Exposure` [Getter]
- `getSimmIMExposure()` → `Exposure` [Getter]
- `getScheduleGridIMExposure()` → `Exposure` [Getter]

### MarginCallExposureBuilder
**Implements:** `MarginCallExposure` `MarginCallBase$MarginCallBaseBuilder` 

**Key Methods:**
- `getOverallExposure()` → `ExposureBuilder` [Getter]
- `getSimmIMExposure()` → `ExposureBuilder` [Getter]
- `getScheduleGridIMExposure()` → `ExposureBuilder` [Getter]
- `setAgreementRounding(Money arg0)` → `MarginCallExposureBuilder` [Setter]
- `setInstructionType(MarginCallInstructionType arg0)` → `MarginCallExposureBuilder` [Setter]
- `setClearingBroker(Party arg0)` → `MarginCallExposureBuilder` [Setter]
- `setRegMarginType(RegMarginTypeEnum arg0)` → `MarginCallExposureBuilder` [Setter]
- `getOrCreateSimmIMExposure()` → `ExposureBuilder` [Getter]
- `setCallAgreementType(AgreementName arg0)` → `MarginCallExposureBuilder` [Setter]
- `setRegIMRole(RegIMRoleEnum arg0)` → `MarginCallExposureBuilder` [Setter]

### MarginCallInstructionType
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallInstructionType` [Builder]
- `getCallType()` → `CallTypeEnum` [Getter]
- `getVisibilityIndicator()` → `Boolean` [Getter]

### MarginCallInstructionTypeBuilder
**Implements:** `MarginCallInstructionType` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setVisibilityIndicator(Boolean arg0)` → `MarginCallInstructionTypeBuilder` [Setter]
- `setCallType(CallTypeEnum arg0)` → `MarginCallInstructionTypeBuilder` [Setter]

### MarginCallIssuance
**Implements:** `MarginCallBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallIssuance` [Builder]
- `getCallAmountInBaseCurrency()` → `Money` [Getter]
- `getRecallNonCashCollateralDescription()` → `List` [Getter]

### MarginCallIssuanceBuilder
**Implements:** `MarginCallIssuance` `MarginCallBase$MarginCallBaseBuilder` 

**Key Methods:**
- `getCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setRecallNonCashCollateralDescription(List arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getOrCreateCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setCallAmountInBaseCurrency(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getRecallNonCashCollateralDescription()` → `List` [Getter]
- `getOrCreateRecallNonCashCollateralDescription(int arg0)` → `EligibleCollateralCriteriaBuilder` [Getter]
- `setAgreementRounding(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setInstructionType(MarginCallInstructionType arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setClearingBroker(Party arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setRegMarginType(RegMarginTypeEnum arg0)` → `MarginCallIssuanceBuilder` [Setter]

### MarginCallResponse
**Implements:** `MarginCallBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallResponse` [Builder]
- `getMarginResponseType()` → `MarginCallResponseTypeEnum` [Getter]
- `getAgreedAmountBaseCurrency()` → `Money` [Getter]
- `getMarginCallResponseAction()` → `List` [Getter]

### MarginCallResponseAction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallResponseAction` [Builder]
- `getCollateralPositionComponent()` → `List` [Getter]
- `getMarginCallAction()` → `MarginCallActionEnum` [Getter]

### MarginCallResponseActionBuilder
**Implements:** `MarginCallResponseAction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateCollateralPositionComponent(int arg0)` → `CollateralPositionBuilder` [Getter]
- `getCollateralPositionComponent()` → `List` [Getter]
- `setCollateralPositionComponent(List arg0)` → `MarginCallResponseActionBuilder` [Setter]
- `setMarginCallAction(MarginCallActionEnum arg0)` → `MarginCallResponseActionBuilder` [Setter]

### MarginCallResponseBuilder
**Implements:** `MarginCallResponse` `MarginCallBase$MarginCallBaseBuilder` 

**Key Methods:**
- `setMarginResponseType(MarginCallResponseTypeEnum arg0)` → `MarginCallResponseBuilder` [Setter]
- `getAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setMarginCallResponseAction(List arg0)` → `MarginCallResponseBuilder` [Setter]
- `getOrCreateMarginCallResponseAction(int arg0)` → `MarginCallResponseActionBuilder` [Getter]
- `getMarginCallResponseAction()` → `List` [Getter]
- `getOrCreateAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setAgreedAmountBaseCurrency(Money arg0)` → `MarginCallResponseBuilder` [Setter]
- `setAgreementRounding(Money arg0)` → `MarginCallResponseBuilder` [Setter]
- `setInstructionType(MarginCallInstructionType arg0)` → `MarginCallResponseBuilder` [Setter]
- `setClearingBroker(Party arg0)` → `MarginCallResponseBuilder` [Setter]

### ObservationEvent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationEvent` [Builder]
- `getCreditEvent()` → `CreditEvent` [Getter]
- `getCorporateAction()` → `CorporateAction` [Getter]

### ObservationEventBuilder
**Implements:** `ObservationEvent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateCreditEvent()` → `CreditEventBuilder` [Getter]
- `getCreditEvent()` → `CreditEventBuilder` [Getter]
- `getOrCreateCorporateAction()` → `CorporateActionBuilder` [Getter]
- `setCorporateAction(CorporateAction arg0)` → `ObservationEventBuilder` [Setter]
- `setCreditEvent(CreditEvent arg0)` → `ObservationEventBuilder` [Setter]
- `getCorporateAction()` → `CorporateActionBuilder` [Getter]

### ObservationInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ObservationInstruction` [Builder]
- `getObservationEvent()` → `ObservationEvent` [Getter]

### ObservationInstructionBuilder
**Implements:** `ObservationInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getObservationEvent()` → `ObservationEventBuilder` [Getter]
- `setObservationEvent(ObservationEvent arg0)` → `ObservationInstructionBuilder` [Setter]
- `getOrCreateObservationEvent()` → `ObservationEventBuilder` [Getter]

### PartyChangeInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyChangeInstruction` [Builder]
- `getPartyRole()` → `PartyRole` [Getter]
- `getCounterparty()` → `Counterparty` [Getter]
- `getAncillaryParty()` → `AncillaryParty` [Getter]
- `getTradeId()` → `List` [Getter]

### PartyChangeInstructionBuilder
**Implements:** `PartyChangeInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPartyRole()` → `PartyRoleBuilder` [Getter]
- `getCounterparty()` → `CounterpartyBuilder` [Getter]
- `getAncillaryParty()` → `AncillaryPartyBuilder` [Getter]
- `setTradeId(List arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getTradeId()` → `List` [Getter]
- `setCounterparty(Counterparty arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateAncillaryParty()` → `AncillaryPartyBuilder` [Getter]
- `getOrCreateCounterparty()` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(AncillaryParty arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `setPartyRole(PartyRole arg0)` → `PartyChangeInstructionBuilder` [Setter]

### PositionIdentifier
**Implements:** `Identifier` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PositionIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]

### PositionIdentifierBuilder
**Implements:** `PositionIdentifier` `Identifier$IdentifierBuilder` 

**Key Methods:**
- `setIssuerReferenceValue(Party arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `PositionIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `PositionIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `PositionIdentifierBuilder` [Setter]

### PrimitiveInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PrimitiveInstruction` [Builder]
- `getObservation()` → `ObservationInstruction` [Getter]
- `getExecution()` → `ExecutionInstruction` [Getter]
- `getTransfer()` → `TransferInstruction` [Getter]
- `getSplit()` → `SplitInstruction` [Getter]
- `getReset()` → `ResetInstruction` [Getter]
- `getContractFormation()` → `ContractFormationInstruction` [Getter]
- `getExercise()` → `ExerciseInstruction` [Getter]
- `getPartyChange()` → `PartyChangeInstruction` [Getter]

### PrimitiveInstructionBuilder
**Implements:** `PrimitiveInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setTransfer(TransferInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `getOrCreateTransfer()` → `TransferInstructionBuilder` [Getter]
- `getObservation()` → `ObservationInstructionBuilder` [Getter]
- `getExecution()` → `ExecutionInstructionBuilder` [Getter]
- `getTransfer()` → `TransferInstructionBuilder` [Getter]
- `getSplit()` → `SplitInstructionBuilder` [Getter]
- `getReset()` → `ResetInstructionBuilder` [Getter]
- `setReset(ResetInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `setSplit(SplitInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `setValuation(ValuationInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]

### QuantityChangeInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `QuantityChangeInstruction` [Builder]
- `getDirection()` → `QuantityChangeDirectionEnum` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `getChange()` → `List` [Getter]

### QuantityChangeInstructionBuilder
**Implements:** `QuantityChangeInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getLotIdentifier()` → `List` [Getter]
- `setChange(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getChange()` → `List` [Getter]
- `getOrCreateChange(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setDirection(QuantityChangeDirectionEnum arg0)` → `QuantityChangeInstructionBuilder` [Setter]

### Reset
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Reset` [Builder]
- `getResetValue()` → `Price` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `getObservations()` → `List` [Getter]
- `getAveragingMethodology()` → `AveragingCalculation` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ResetBuilder
**Implements:** `Reset` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getResetValue()` → `PriceBuilder` [Getter]
- `getObservations()` → `List` [Getter]
- `getAveragingMethodology()` → `AveragingCalculationBuilder` [Getter]
- `setAveragingMethodology(AveragingCalculation arg0)` → `ResetBuilder` [Setter]
- `setObservations(List arg0)` → `ResetBuilder` [Setter]
- `setResetDate(Date arg0)` → `ResetBuilder` [Setter]
- `setRateRecordDate(Date arg0)` → `ResetBuilder` [Setter]
- `getOrCreateResetValue()` → `PriceBuilder` [Getter]
- `setResetValue(Price arg0)` → `ResetBuilder` [Setter]

### ResetInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResetInstruction` [Builder]
- `getResetDate()` → `Date` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `getPayout()` → `List` [Getter]

### ResetInstructionBuilder
**Implements:** `ResetInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPayout(List arg0)` → `ResetInstructionBuilder` [Setter]
- `setResetDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `setRateRecordDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `getPayout()` → `List` [Getter]
- `getOrCreatePayout(int arg0)` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `setPayoutValue(List arg0)` → `ResetInstructionBuilder` [Setter]

### ReturnInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReturnInstruction` [Builder]
- `getQuantity()` → `List` [Getter]

### ReturnInstructionBuilder
**Implements:** `ReturnInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getQuantity()` → `List` [Getter]
- `setQuantity(List arg0)` → `ReturnInstructionBuilder` [Setter]
- `getOrCreateQuantity(int arg0)` → `QuantityBuilder` [Getter]

### ScheduledTransfer
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ScheduledTransfer` [Builder]
- `getTransferType()` → `ScheduledTransferEnum` [Getter]
- `getCorporateActionTransferType()` → `CorporateActionTypeEnum` [Getter]

### ScheduledTransferBuilder
**Implements:** `ScheduledTransfer` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setTransferType(ScheduledTransferEnum arg0)` → `ScheduledTransferBuilder` [Setter]
- `setCorporateActionTransferType(CorporateActionTypeEnum arg0)` → `ScheduledTransferBuilder` [Setter]

### SecurityLendingInvoice
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SecurityLendingInvoice` [Builder]
- `getBillingSummary()` → `List` [Getter]
- `getBillingRecord()` → `List` [Getter]
- `getSendingParty()` → `Party` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getBillingStartDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### SecurityLendingInvoiceBuilder
**Implements:** `SecurityLendingInvoice` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getBillingSummary()` → `List` [Getter]
- `getBillingRecord()` → `List` [Getter]
- `getSendingParty()` → `PartyBuilder` [Getter]
- `getReceivingParty()` → `PartyBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `getOrCreateBillingRecord(int arg0)` → `BillingRecordBuilder` [Getter]
- `getOrCreateSendingParty()` → `PartyBuilder` [Getter]
- `setBillingStartDate(Date arg0)` → `SecurityLendingInvoiceBuilder` [Setter]

### SplitInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SplitInstruction` [Builder]
- `getBreakdown()` → `List` [Getter]

### SplitInstructionBuilder
**Implements:** `SplitInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateBreakdown(int arg0)` → `PrimitiveInstructionBuilder` [Getter]
- `setBreakdown(List arg0)` → `SplitInstructionBuilder` [Setter]
- `getBreakdown()` → `List` [Getter]

### State
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `State` [Builder]
- `getClosedState()` → `ClosedState` [Getter]
- `getPositionState()` → `PositionStatusEnum` [Getter]

### StateBuilder
**Implements:** `State` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getClosedState()` → `ClosedStateBuilder` [Getter]
- `getOrCreateClosedState()` → `ClosedStateBuilder` [Getter]
- `setPositionState(PositionStatusEnum arg0)` → `StateBuilder` [Setter]
- `setClosedState(ClosedState arg0)` → `StateBuilder` [Setter]

### StockSplitInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StockSplitInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getAdjustmentRatio()` → `BigDecimal` [Getter]

### StockSplitInstructionBuilder
**Implements:** `StockSplitInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAdjustmentRatio(BigDecimal arg0)` → `StockSplitInstructionBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `StockSplitInstructionBuilder` [Setter]

### TermsChangeInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TermsChangeInstruction` [Builder]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getProduct()` → `NonTransferableProduct` [Getter]

### TermsChangeInstructionBuilder
**Implements:** `TermsChangeInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAncillaryParty()` → `List` [Getter]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `getOrCreateProduct()` → `NonTransferableProductBuilder` [Getter]
- `getProduct()` → `NonTransferableProductBuilder` [Getter]
- `setProduct(NonTransferableProduct arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `setAdjustment(NotionalAdjustmentEnum arg0)` → `TermsChangeInstructionBuilder` [Setter]

### Trade
**Implements:** `TradableProduct` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Trade` [Builder]
- `getTradeDate()` → `FieldWithMetaDate` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getExecutionDetails()` → `ExecutionDetails` [Getter]
- `getContractDetails()` → `ContractDetails` [Getter]
- `getClearedDate()` → `Date` [Getter]
- `getCollateral()` → `Collateral` [Getter]

### TradeBuilder
**Implements:** `Trade` `TradableProduct$TradableProductBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getTradeDate()` → `FieldWithMetaDateBuilder` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getExecutionDetails()` → `ExecutionDetailsBuilder` [Getter]
- `getContractDetails()` → `ContractDetailsBuilder` [Getter]
- `getCollateral()` → `CollateralBuilder` [Getter]
- `getOrCreateTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `setExecutionDetails(ExecutionDetails arg0)` → `TradeBuilder` [Setter]

### TradeIdentifier
**Implements:** `Identifier` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TradeIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]

### TradeIdentifierBuilder
**Implements:** `TradeIdentifier` `Identifier$IdentifierBuilder` 

**Key Methods:**
- `setIssuerReferenceValue(Party arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `TradeIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `TradeIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `TradeIdentifierBuilder` [Setter]

### TradePricingReport
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TradePricingReport` [Builder]
- `getPricingTime()` → `TimeZone` [Getter]
- `getDiscountingIndex()` → `FloatingRateIndexEnum` [Getter]
- `getTrade()` → `Trade` [Getter]

### TradePricingReportBuilder
**Implements:** `TradePricingReport` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `getPricingTime()` → `TimeZoneBuilder` [Getter]
- `getOrCreatePricingTime()` → `TimeZoneBuilder` [Getter]
- `setPricingTime(TimeZone arg0)` → `TradePricingReportBuilder` [Setter]
- `setDiscountingIndex(FloatingRateIndexEnum arg0)` → `TradePricingReportBuilder` [Setter]
- `getTrade()` → `TradeBuilder` [Getter]
- `setTrade(Trade arg0)` → `TradePricingReportBuilder` [Setter]

### TradeState
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getState()` → `State` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `TradeState` [Builder]
- `getObservationHistory()` → `List` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `getResetHistory()` → `List` [Getter]
- `getValuationHistory()` → `List` [Getter]
- `getTrade()` → `Trade` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### TradeStateBuilder
**Implements:** `TradeState` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getState()` → `StateBuilder` [Getter]
- `setState(State arg0)` → `TradeStateBuilder` [Setter]
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getObservationHistory()` → `List` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `getResetHistory()` → `List` [Getter]
- `getOrCreateTransferHistory(int arg0)` → `TransferStateBuilder` [Getter]
- `getOrCreateResetHistory(int arg0)` → `ResetBuilder` [Getter]
- `setTransferHistory(List arg0)` → `TradeStateBuilder` [Setter]

### Transfer
**Implements:** `AssetFlowBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Transfer` [Builder]
- `getSettlementOrigin()` → `ReferenceWithMetaPayout` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `getTransferExpression()` → `TransferExpression` [Getter]
- `getResetOrigin()` → `Reset` [Getter]
- `getIdentifier()` → `List` [Getter]

### TransferBuilder
**Implements:** `Transfer` `AssetFlowBase$AssetFlowBaseBuilder` 

**Key Methods:**
- `getOrCreateResetOrigin()` → `ResetBuilder` [Getter]
- `getSettlementOrigin()` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `setSettlementOriginValue(Payout arg0)` → `TransferBuilder` [Setter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `TransferBuilder` [Setter]
- `setTransferExpression(TransferExpression arg0)` → `TransferBuilder` [Setter]
- `setIdentifierValue(List arg0)` → `TransferBuilder` [Setter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `TransferBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `TransferBuilder` [Setter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]

### TransferExpression
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransferExpression` [Builder]
- `getPriceTransfer()` → `FeeTypeEnum` [Getter]
- `getScheduledTransfer()` → `ScheduledTransfer` [Getter]

### TransferExpressionBuilder
**Implements:** `TransferExpression` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPriceTransfer(FeeTypeEnum arg0)` → `TransferExpressionBuilder` [Setter]
- `setScheduledTransfer(ScheduledTransfer arg0)` → `TransferExpressionBuilder` [Setter]
- `getScheduledTransfer()` → `ScheduledTransferBuilder` [Getter]
- `getOrCreateScheduledTransfer()` → `ScheduledTransferBuilder` [Getter]

### TransferInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransferInstruction` [Builder]
- `getTransferState()` → `List` [Getter]

### TransferInstructionBuilder
**Implements:** `TransferInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getTransferState()` → `List` [Getter]
- `setTransferState(List arg0)` → `TransferInstructionBuilder` [Setter]
- `getOrCreateTransferState(int arg0)` → `TransferStateBuilder` [Getter]

### TransferState
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransferState` [Builder]
- `getTransferStatus()` → `TransferStatusEnum` [Getter]
- `getTransfer()` → `Transfer` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### TransferStateBuilder
**Implements:** `TransferState` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setTransfer(Transfer arg0)` → `TransferStateBuilder` [Setter]
- `setTransferStatus(TransferStatusEnum arg0)` → `TransferStateBuilder` [Setter]
- `getOrCreateTransfer()` → `TransferBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getTransfer()` → `TransferBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `TransferStateBuilder` [Setter]

### Valuation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getMethod()` → `ValuationTypeEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `Valuation` [Builder]
- `getTimestamp()` → `ZonedDateTime` [Getter]
- `getValuationTiming()` → `PriceTimingEnum` [Getter]
- `getPriceComponent()` → `Price` [Getter]
- `getSource()` → `ValuationSourceEnum` [Getter]
- `getDelta()` → `BigDecimal` [Getter]
- `getAmount()` → `Money` [Getter]

### ValuationBuilder
**Implements:** `Valuation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMethod(ValuationTypeEnum arg0)` → `ValuationBuilder` [Setter]
- `getOrCreateAmount()` → `MoneyBuilder` [Getter]
- `getOrCreatePriceComponent()` → `PriceBuilder` [Getter]
- `getPriceComponent()` → `PriceBuilder` [Getter]
- `setPriceComponent(Price arg0)` → `ValuationBuilder` [Setter]
- `setValuationTiming(PriceTimingEnum arg0)` → `ValuationBuilder` [Setter]
- `setTimestamp(ZonedDateTime arg0)` → `ValuationBuilder` [Setter]
- `setSource(ValuationSourceEnum arg0)` → `ValuationBuilder` [Setter]
- `setAmount(Money arg0)` → `ValuationBuilder` [Setter]
- `setDelta(BigDecimal arg0)` → `ValuationBuilder` [Setter]

### ValuationInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationInstruction` [Builder]
- `getReplace()` → `Boolean` [Getter]
- `getValuation()` → `List` [Getter]

### ValuationInstructionBuilder
**Implements:** `ValuationInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setReplace(Boolean arg0)` → `ValuationInstructionBuilder` [Setter]
- `setValuation(List arg0)` → `ValuationInstructionBuilder` [Setter]
- `getOrCreateValuation(int arg0)` → `ValuationBuilder` [Getter]
- `getValuation()` → `List` [Getter]

## Concrete Classes

### BillingInstructionBuilderImpl
**Implements:** `BillingInstruction$BillingInstructionBuilder` 

**Fields:**
- `PartyBuilder sendingParty`
- `PartyBuilder receivingParty`
- `Date billingStartDate`
- `Date billingEndDate`
- `List (List) billingRecordInstruction`
- `List (List) billingSummary`

**Key Methods:**
- `build()` → `BillingInstruction` [Builder]
- `getBillingSummary()` → `List` [Getter]
- `getSendingParty()` → `PartyBuilder` [Getter]
- `getReceivingParty()` → `PartyBuilder` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getBillingStartDate()` → `Date` [Getter]
- `getBillingRecordInstruction()` → `List` [Getter]
- `getOrCreateBillingRecordInstruction(int arg0)` → `BillingRecordInstructionBuilder` [Getter]
- `setBillingRecordInstruction(List arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateSendingParty()` → `PartyBuilder` [Getter]

### BillingInstructionImpl
**Implements:** `BillingInstruction` 

**Key Methods:**
- `build()` → `BillingInstruction` [Builder]
- `setBuilderFields(BillingInstructionBuilder arg0)` → `void` [Setter]
- `getBillingSummary()` → `List` [Getter]
- `getSendingParty()` → `Party` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getBillingStartDate()` → `Date` [Getter]
- `getBillingRecordInstruction()` → `List` [Getter]

### BillingRecordBuilderImpl
**Implements:** `BillingRecord$BillingRecordBuilder` 

**Fields:**
- `ReferenceWithMetaTradeStateBuilder tradeState`
- `TransferBuilder recordTransfer`
- `Date recordStartDate`
- `Date recordEndDate`
- `MoneyBuilder minimumFee`

**Key Methods:**
- `build()` → `BillingRecord` [Builder]
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]
- `setMinimumFee(Money arg0)` → `BillingRecordBuilder` [Setter]
- `setRecordTransfer(Transfer arg0)` → `BillingRecordBuilder` [Setter]
- `setRecordEndDate(Date arg0)` → `BillingRecordBuilder` [Setter]
- `setRecordStartDate(Date arg0)` → `BillingRecordBuilder` [Setter]
- `getOrCreateRecordTransfer()` → `TransferBuilder` [Getter]
- `setTradeState(ReferenceWithMetaTradeState arg0)` → `BillingRecordBuilder` [Setter]

### BillingRecordImpl
**Implements:** `BillingRecord` 

**Key Methods:**
- `build()` → `BillingRecord` [Builder]
- `setBuilderFields(BillingRecordBuilder arg0)` → `void` [Setter]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]
- `getRecordTransfer()` → `Transfer` [Getter]
- `getMinimumFee()` → `Money` [Getter]

### BillingRecordInstructionBuilderImpl
**Implements:** `BillingRecordInstruction$BillingRecordInstructionBuilder` 

**Fields:**
- `ReferenceWithMetaTradeStateBuilder tradeState`
- `List (List) observation`
- `Date recordStartDate`
- `Date recordEndDate`
- `Date settlementDate`

**Key Methods:**
- `build()` → `BillingRecordInstruction` [Builder]
- `setSettlementDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `getSettlementDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getObservation()` → `List` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]
- `setRecordEndDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setRecordStartDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setTradeState(ReferenceWithMetaTradeState arg0)` → `BillingRecordInstructionBuilder` [Setter]

### BillingRecordInstructionImpl
**Implements:** `BillingRecordInstruction` 

**Key Methods:**
- `build()` → `BillingRecordInstruction` [Builder]
- `setBuilderFields(BillingRecordInstructionBuilder arg0)` → `void` [Setter]
- `getSettlementDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getObservation()` → `List` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]

### BillingSummaryBuilderImpl
**Implements:** `BillingSummary$BillingSummaryBuilder` 

**Fields:**
- `TransferBuilder summaryTransfer`
- `RecordAmountTypeEnum summaryAmountType`

**Key Methods:**
- `build()` → `BillingSummary` [Builder]
- `setSummaryTransfer(Transfer arg0)` → `BillingSummaryBuilder` [Setter]
- `getOrCreateSummaryTransfer()` → `TransferBuilder` [Getter]
- `setSummaryAmountType(RecordAmountTypeEnum arg0)` → `BillingSummaryBuilder` [Setter]
- `getSummaryTransfer()` → `TransferBuilder` [Getter]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]

### BillingSummaryImpl
**Implements:** `BillingSummary` 

**Key Methods:**
- `build()` → `BillingSummary` [Builder]
- `setBuilderFields(BillingSummaryBuilder arg0)` → `void` [Setter]
- `getSummaryTransfer()` → `Transfer` [Getter]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]

### BillingSummaryInstructionBuilderImpl
**Implements:** `BillingSummaryInstruction$BillingSummaryInstructionBuilder` 

**Fields:**
- `RecordAmountTypeEnum summaryAmountType`

**Key Methods:**
- `build()` → `BillingSummaryInstruction` [Builder]
- `setSummaryAmountType(RecordAmountTypeEnum arg0)` → `BillingSummaryInstructionBuilder` [Setter]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]

### BillingSummaryInstructionImpl
**Implements:** `BillingSummaryInstruction` 

**Key Methods:**
- `build()` → `BillingSummaryInstruction` [Builder]
- `setBuilderFields(BillingSummaryInstructionBuilder arg0)` → `void` [Setter]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]

### BusinessEventBuilderImpl
**Extends:** `EventInstruction$EventInstructionBuilderImpl` 
**Implements:** `BusinessEvent$BusinessEventBuilder` 

**Fields:**
- `String eventQualifier`
- `List (List) after`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `BusinessEvent` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setEventDate(Date arg0)` → `BusinessEventBuilder` [Setter]
- `setIntent(EventIntentEnum arg0)` → `BusinessEventBuilder` [Setter]
- `getEventQualifier()` → `String` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `BusinessEventBuilder` [Setter]
- `getAfter()` → `List` [Getter]
- `setPackageInformation(IdentifiedList arg0)` → `BusinessEventBuilder` [Setter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `BusinessEventBuilder` [Setter]

### BusinessEventImpl
**Extends:** `EventInstruction$EventInstructionImpl` 
**Implements:** `BusinessEvent` 

**Key Methods:**
- `build()` → `BusinessEvent` [Builder]
- `setBuilderFields(BusinessEventBuilder arg0)` → `void` [Setter]
- `getEventQualifier()` → `String` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getAfter()` → `List` [Getter]

### CalculateTransferInstructionBuilderImpl
**Implements:** `CalculateTransferInstruction$CalculateTransferInstructionBuilder` 

**Fields:**
- `TradeStateBuilder tradeState`
- `ReferenceWithMetaPayoutBuilder payout`
- `List (List) resets`
- `PayerReceiverBuilder payerReceiver`
- `QuantityBuilder quantity`
- `Date date`

**Key Methods:**
- `build()` → `CalculateTransferInstruction` [Builder]
- `setDate(Date arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getDate()` → `Date` [Getter]
- `getQuantity()` → `QuantityBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(Quantity arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `getTradeState()` → `TradeStateBuilder` [Getter]

### CalculateTransferInstructionImpl
**Implements:** `CalculateTransferInstruction` 

**Key Methods:**
- `build()` → `CalculateTransferInstruction` [Builder]
- `getDate()` → `Date` [Getter]
- `getQuantity()` → `Quantity` [Getter]
- `setBuilderFields(CalculateTransferInstructionBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getTradeState()` → `TradeState` [Getter]
- `getResets()` → `List` [Getter]
- `getPayout()` → `ReferenceWithMetaPayout` [Getter]

### ClearingInstructionBuilderImpl
**Implements:** `ClearingInstruction$ClearingInstructionBuilder` 

**Fields:**
- `TradeStateBuilder alphaContract`
- `PartyBuilder clearingParty`
- `PartyBuilder party1`
- `PartyBuilder party2`
- `PartyBuilder clearerParty1`
- `PartyBuilder clearerParty2`
- `Boolean isOpenOffer`

**Key Methods:**
- `build()` → `ClearingInstruction` [Builder]
- `getIsOpenOffer()` → `Boolean` [Getter]
- `getOrCreateAlphaContract()` → `TradeStateBuilder` [Getter]
- `getOrCreateClearerParty2()` → `PartyBuilder` [Getter]
- `getOrCreateClearerParty1()` → `PartyBuilder` [Getter]
- `getOrCreateParty1()` → `PartyBuilder` [Getter]
- `getOrCreateClearingParty()` → `PartyBuilder` [Getter]
- `setClearerParty1(Party arg0)` → `ClearingInstructionBuilder` [Setter]
- `setClearingParty(Party arg0)` → `ClearingInstructionBuilder` [Setter]
- `getClearerParty2()` → `PartyBuilder` [Getter]

### ClearingInstructionImpl
**Implements:** `ClearingInstruction` 

**Key Methods:**
- `build()` → `ClearingInstruction` [Builder]
- `setBuilderFields(ClearingInstructionBuilder arg0)` → `void` [Setter]
- `getIsOpenOffer()` → `Boolean` [Getter]
- `getClearerParty2()` → `Party` [Getter]
- `getClearingParty()` → `Party` [Getter]
- `getClearerParty1()` → `Party` [Getter]
- `getAlphaContract()` → `TradeState` [Getter]
- `getParty2()` → `Party` [Getter]
- `getParty1()` → `Party` [Getter]

### CollateralBalanceBuilderImpl
**Implements:** `CollateralBalance$CollateralBalanceBuilder` 

**Fields:**
- `CollateralStatusEnum collateralBalanceStatus`
- `HaircutIndicatorEnum haircutIndicator`
- `MoneyBuilder amountBaseCurrency`
- `PartyReferencePayerReceiverBuilder payerReceiver`

**Key Methods:**
- `build()` → `CollateralBalance` [Builder]
- `setAmountBaseCurrency(Money arg0)` → `CollateralBalanceBuilder` [Setter]
- `getCollateralBalanceStatus()` → `CollateralStatusEnum` [Getter]
- `setCollateralBalanceStatus(CollateralStatusEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `getAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `getHaircutIndicator()` → `HaircutIndicatorEnum` [Getter]
- `setHaircutIndicator(HaircutIndicatorEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `CollateralBalanceBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]

### CollateralBalanceImpl
**Implements:** `CollateralBalance` 

**Key Methods:**
- `build()` → `CollateralBalance` [Builder]
- `getCollateralBalanceStatus()` → `CollateralStatusEnum` [Getter]
- `getAmountBaseCurrency()` → `Money` [Getter]
- `getHaircutIndicator()` → `HaircutIndicatorEnum` [Getter]
- `setBuilderFields(CollateralBalanceBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]

### CollateralPortfolioBuilderImpl
**Implements:** `CollateralPortfolio$CollateralPortfolioBuilder` 

**Fields:**
- `IdentifierBuilder portfolioIdentifier`
- `List (List) collateralPosition`
- `List (List) collateralBalance`
- `ReferenceWithMetaLegalAgreementBuilder legalAgreement`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `CollateralPortfolio` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getCollateralBalance()` → `List` [Getter]
- `getOrCreateLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `setPortfolioIdentifier(Identifier arg0)` → `CollateralPortfolioBuilder` [Setter]
- `getPortfolioIdentifier()` → `IdentifierBuilder` [Getter]
- `getCollateralPosition()` → `List` [Getter]
- `setCollateralBalance(List arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setCollateralPosition(List arg0)` → `CollateralPortfolioBuilder` [Setter]

### CollateralPortfolioImpl
**Implements:** `CollateralPortfolio` 

**Key Methods:**
- `build()` → `CollateralPortfolio` [Builder]
- `setBuilderFields(CollateralPortfolioBuilder arg0)` → `void` [Setter]
- `getCollateralBalance()` → `List` [Getter]
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreement` [Getter]
- `getPortfolioIdentifier()` → `Identifier` [Getter]
- `getCollateralPosition()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CollateralPositionBuilderImpl
**Extends:** `Position$PositionBuilderImpl` 
**Implements:** `CollateralPosition$CollateralPositionBuilder` 

**Fields:**
- `CollateralTreatmentBuilder treatment`
- `CollateralStatusEnum collateralPositionStatus`

**Key Methods:**
- `build()` → `CollateralPosition` [Builder]
- `getTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `CollateralPositionBuilder` [Setter]
- `setCashBalance(Money arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `setTreatment(CollateralTreatment arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReferenceValue(TradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `getOrCreateTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setCollateralPositionStatus(CollateralStatusEnum arg0)` → `CollateralPositionBuilder` [Setter]
- `getCollateralPositionStatus()` → `CollateralStatusEnum` [Getter]

### CollateralPositionImpl
**Extends:** `Position$PositionImpl` 
**Implements:** `CollateralPosition` 

**Key Methods:**
- `build()` → `CollateralPosition` [Builder]
- `setBuilderFields(CollateralPositionBuilder arg0)` → `void` [Setter]
- `getTreatment()` → `CollateralTreatment` [Getter]
- `getCollateralPositionStatus()` → `CollateralStatusEnum` [Getter]

### ContractDetailsBuilderImpl
**Implements:** `ContractDetails$ContractDetailsBuilder` 

**Fields:**
- `List (List) documentation`
- `FieldWithMetaGoverningLawEnumBuilder governingLaw`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ContractDetails` [Builder]
- `getDocumentation()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `setGoverningLawValue(GoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `setGoverningLaw(FieldWithMetaGoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `getGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `getOrCreateDocumentation(int arg0)` → `LegalAgreementBuilder` [Getter]
- `setDocumentation(List arg0)` → `ContractDetailsBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ContractDetailsImpl
**Implements:** `ContractDetails` 

**Key Methods:**
- `build()` → `ContractDetails` [Builder]
- `getDocumentation()` → `List` [Getter]
- `setBuilderFields(ContractDetailsBuilder arg0)` → `void` [Setter]
- `getGoverningLaw()` → `FieldWithMetaGoverningLawEnum` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ContractFormationInstructionBuilderImpl
**Implements:** `ContractFormationInstruction$ContractFormationInstructionBuilder` 

**Fields:**
- `List (List) legalAgreement`

**Key Methods:**
- `build()` → `ContractFormationInstruction` [Builder]
- `getOrCreateLegalAgreement(int arg0)` → `LegalAgreementBuilder` [Getter]
- `getLegalAgreement()` → `List` [Getter]
- `setLegalAgreement(List arg0)` → `ContractFormationInstructionBuilder` [Setter]

### ContractFormationInstructionImpl
**Implements:** `ContractFormationInstruction` 

**Key Methods:**
- `build()` → `ContractFormationInstruction` [Builder]
- `setBuilderFields(ContractFormationInstructionBuilder arg0)` → `void` [Setter]
- `getLegalAgreement()` → `List` [Getter]

### CorporateActionBuilderImpl
**Implements:** `CorporateAction$CorporateActionBuilder` 

**Fields:**
- `CorporateActionTypeEnum corporateActionType`
- `Date exDate`
- `Date payDate`
- `UnderlierBuilder underlier`

**Key Methods:**
- `build()` → `CorporateAction` [Builder]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `CorporateActionBuilder` [Setter]
- `setCorporateActionType(CorporateActionTypeEnum arg0)` → `CorporateActionBuilder` [Setter]
- `getCorporateActionType()` → `CorporateActionTypeEnum` [Getter]
- `setPayDate(Date arg0)` → `CorporateActionBuilder` [Setter]
- `getExDate()` → `Date` [Getter]
- `getPayDate()` → `Date` [Getter]
- `setExDate(Date arg0)` → `CorporateActionBuilder` [Setter]

### CorporateActionImpl
**Implements:** `CorporateAction` 

**Key Methods:**
- `build()` → `CorporateAction` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getCorporateActionType()` → `CorporateActionTypeEnum` [Getter]
- `setBuilderFields(CorporateActionBuilder arg0)` → `void` [Setter]
- `getExDate()` → `Date` [Getter]
- `getPayDate()` → `Date` [Getter]

### CounterpartyPositionBusinessEventBuilderImpl
**Implements:** `CounterpartyPositionBusinessEvent$CounterpartyPositionBusinessEventBuilder` 

**Fields:**
- `PositionEventIntentEnum intent`
- `CorporateActionTypeEnum corporateActionIntent`
- `Date eventDate`
- `Date effectiveDate`
- `IdentifiedListBuilder packageInformation`
- `List (List) after`

**Key Methods:**
- `build()` → `CounterpartyPositionBusinessEvent` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `setEventDate(Date arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getOrCreatePackageInformation()` → `IdentifiedListBuilder` [Getter]
- `setIntent(PositionEventIntentEnum arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getAfter()` → `List` [Getter]
- `getIntent()` → `PositionEventIntentEnum` [Getter]

### CounterpartyPositionBusinessEventImpl
**Implements:** `CounterpartyPositionBusinessEvent` 

**Key Methods:**
- `build()` → `CounterpartyPositionBusinessEvent` [Builder]
- `setBuilderFields(CounterpartyPositionBusinessEventBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getAfter()` → `List` [Getter]
- `getIntent()` → `PositionEventIntentEnum` [Getter]

### CounterpartyPositionStateBuilderImpl
**Implements:** `CounterpartyPositionState$CounterpartyPositionStateBuilder` 

**Fields:**
- `CounterpartyPositionBuilder counterpartyPosition`
- `StateBuilder state`
- `List (List) observationHistory`
- `List (List) valuationHistory`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getState()` → `StateBuilder` [Getter]
- `setState(State arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `build()` → `CounterpartyPositionState` [Builder]
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getObservationHistory()` → `List` [Getter]
- `getValuationHistory()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setValuationHistory(List arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `setObservationHistory(List arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `setCounterpartyPosition(CounterpartyPosition arg0)` → `CounterpartyPositionStateBuilder` [Setter]

### CounterpartyPositionStateImpl
**Implements:** `CounterpartyPositionState` 

**Key Methods:**
- `getState()` → `State` [Getter]
- `build()` → `CounterpartyPositionState` [Builder]
- `setBuilderFields(CounterpartyPositionStateBuilder arg0)` → `void` [Setter]
- `getObservationHistory()` → `List` [Getter]
- `getValuationHistory()` → `List` [Getter]
- `getCounterpartyPosition()` → `CounterpartyPosition` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CreditEventBuilderImpl
**Implements:** `CreditEvent$CreditEventBuilder` 

**Fields:**
- `CreditEventTypeEnum creditEventType`
- `Date eventDeterminationDate`
- `Date auctionDate`
- `PriceBuilder finalPrice`
- `BigDecimal recoveryPercent`
- `List (List) publiclyAvailableInformation`
- `ReferenceInformationBuilder referenceInformation`

**Key Methods:**
- `build()` → `CreditEvent` [Builder]
- `setCreditEventType(CreditEventTypeEnum arg0)` → `CreditEventBuilder` [Setter]
- `getOrCreateFinalPrice()` → `PriceBuilder` [Getter]
- `setEventDeterminationDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setRecoveryPercent(BigDecimal arg0)` → `CreditEventBuilder` [Setter]
- `setFinalPrice(Price arg0)` → `CreditEventBuilder` [Setter]
- `setAuctionDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setReferenceInformation(ReferenceInformation arg0)` → `CreditEventBuilder` [Setter]
- `getEventDeterminationDate()` → `Date` [Getter]
- `getRecoveryPercent()` → `BigDecimal` [Getter]

### CreditEventImpl
**Implements:** `CreditEvent` 

**Key Methods:**
- `build()` → `CreditEvent` [Builder]
- `setBuilderFields(CreditEventBuilder arg0)` → `void` [Setter]
- `getEventDeterminationDate()` → `Date` [Getter]
- `getRecoveryPercent()` → `BigDecimal` [Getter]
- `getCreditEventType()` → `CreditEventTypeEnum` [Getter]
- `getAuctionDate()` → `Date` [Getter]
- `getFinalPrice()` → `Price` [Getter]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `getPubliclyAvailableInformation()` → `List` [Getter]

### ExecutionDetailsBuilderImpl
**Implements:** `ExecutionDetails$ExecutionDetailsBuilder` 

**Fields:**
- `ExecutionTypeEnum executionType`
- `LegalEntityBuilder executionVenue`
- `IdentifiedListBuilder packageReference`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ExecutionDetails` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getExecutionType()` → `ExecutionTypeEnum` [Getter]
- `getPackageReference()` → `IdentifiedListBuilder` [Getter]
- `getExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `getOrCreateExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `setPackageReference(IdentifiedList arg0)` → `ExecutionDetailsBuilder` [Setter]
- `setExecutionVenue(LegalEntity arg0)` → `ExecutionDetailsBuilder` [Setter]
- `setExecutionType(ExecutionTypeEnum arg0)` → `ExecutionDetailsBuilder` [Setter]
- `getOrCreatePackageReference()` → `IdentifiedListBuilder` [Getter]

### ExecutionDetailsImpl
**Implements:** `ExecutionDetails` 

**Key Methods:**
- `build()` → `ExecutionDetails` [Builder]
- `setBuilderFields(ExecutionDetailsBuilder arg0)` → `void` [Setter]
- `getExecutionType()` → `ExecutionTypeEnum` [Getter]
- `getPackageReference()` → `IdentifiedList` [Getter]
- `getExecutionVenue()` → `LegalEntity` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExecutionInstructionBuilderImpl
**Implements:** `ExecutionInstruction$ExecutionInstructionBuilder` 

**Fields:**
- `NonTransferableProductBuilder product`
- `List (List) priceQuantity`
- `List (List) counterparty`
- `List (List) ancillaryParty`
- `List (List) parties`
- `List (List) partyRoles`
- `ExecutionDetailsBuilder executionDetails`
- `FieldWithMetaDateBuilder tradeDate`
- `FieldWithMetaTimeZoneBuilder tradeTime`
- `List (List) tradeIdentifier`
- `CollateralBuilder collateral`
- `IdentifierBuilder lotIdentifier`

**Key Methods:**
- `build()` → `ExecutionInstruction` [Builder]
- `getTradeDate()` → `FieldWithMetaDateBuilder` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `getExecutionDetails()` → `ExecutionDetailsBuilder` [Getter]
- `getCollateral()` → `CollateralBuilder` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getLotIdentifier()` → `IdentifierBuilder` [Getter]

### ExecutionInstructionImpl
**Implements:** `ExecutionInstruction` 

**Key Methods:**
- `build()` → `ExecutionInstruction` [Builder]
- `setBuilderFields(ExecutionInstructionBuilder arg0)` → `void` [Setter]
- `getTradeDate()` → `FieldWithMetaDate` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]
- `getExecutionDetails()` → `ExecutionDetails` [Getter]
- `getCollateral()` → `Collateral` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getPriceQuantity()` → `List` [Getter]

### ExerciseEventBuilderImpl
**Implements:** `ExerciseEvent$ExerciseEventBuilder` 

**Fields:**
- `Date adjustedExerciseDate`
- `Date adjustedRelevantSwapEffectiveDate`
- `Date adjustedCashSettlementValuationDate`
- `Date adjustedCashSettlementPaymentDate`
- `Date adjustedExerciseFeePaymentDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ExerciseEvent` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedRelevantSwapEffectiveDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedRelevantSwapEffectiveDate()` → `Date` [Getter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `ExerciseEventBuilder` [Setter]

### ExerciseEventImpl
**Implements:** `ExerciseEvent` 

**Key Methods:**
- `build()` → `ExerciseEvent` [Builder]
- `setBuilderFields(ExerciseEventBuilder arg0)` → `void` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedRelevantSwapEffectiveDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExerciseInstructionBuilderImpl
**Implements:** `ExerciseInstruction$ExerciseInstructionBuilder` 

**Fields:**
- `PrimitiveInstructionBuilder exerciseQuantity`
- `ReferenceWithMetaOptionPayoutBuilder exerciseOption`
- `AdjustableOrAdjustedDateBuilder exerciseDate`
- `BusinessCenterTimeBuilder exerciseTime`
- `List (List) replacementTradeIdentifier`

**Key Methods:**
- `build()` → `ExerciseInstruction` [Builder]
- `getReplacementTradeIdentifier()` → `List` [Getter]
- `getOrCreateExerciseQuantity()` → `PrimitiveInstructionBuilder` [Getter]
- `getOrCreateReplacementTradeIdentifier(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `setReplacementTradeIdentifier(List arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseQuantity(PrimitiveInstruction arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseTime(BusinessCenterTime arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseOption(ReferenceWithMetaOptionPayout arg0)` → `ExerciseInstructionBuilder` [Setter]
- `getExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateExerciseOption()` → `ReferenceWithMetaOptionPayoutBuilder` [Getter]

### ExerciseInstructionImpl
**Implements:** `ExerciseInstruction` 

**Key Methods:**
- `build()` → `ExerciseInstruction` [Builder]
- `setBuilderFields(ExerciseInstructionBuilder arg0)` → `void` [Setter]
- `getReplacementTradeIdentifier()` → `List` [Getter]
- `getExerciseTime()` → `BusinessCenterTime` [Getter]
- `getExerciseQuantity()` → `PrimitiveInstruction` [Getter]
- `getExerciseOption()` → `ReferenceWithMetaOptionPayout` [Getter]
- `getExerciseDate()` → `AdjustableOrAdjustedDate` [Getter]

### ExposureBuilderImpl
**Implements:** `Exposure$ExposureBuilder` 

**Fields:**
- `ReferenceWithMetaPortfolioStateBuilder tradePortfolio`
- `MoneyBuilder aggregateValue`
- `ZonedDateTime calculationDateTime`
- `ZonedDateTime valuationDateTime`

**Key Methods:**
- `build()` → `Exposure` [Builder]
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `getValuationDateTime()` → `ZonedDateTime` [Getter]
- `getCalculationDateTime()` → `ZonedDateTime` [Getter]
- `getAggregateValue()` → `MoneyBuilder` [Getter]
- `setCalculationDateTime(ZonedDateTime arg0)` → `ExposureBuilder` [Setter]
- `setValuationDateTime(ZonedDateTime arg0)` → `ExposureBuilder` [Setter]
- `setTradePortfolioValue(PortfolioState arg0)` → `ExposureBuilder` [Setter]
- `getOrCreateTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `setTradePortfolio(ReferenceWithMetaPortfolioState arg0)` → `ExposureBuilder` [Setter]

### ExposureImpl
**Implements:** `Exposure` 

**Key Methods:**
- `build()` → `Exposure` [Builder]
- `setBuilderFields(ExposureBuilder arg0)` → `void` [Setter]
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioState` [Getter]
- `getValuationDateTime()` → `ZonedDateTime` [Getter]
- `getCalculationDateTime()` → `ZonedDateTime` [Getter]
- `getAggregateValue()` → `Money` [Getter]

### IndexTransitionInstructionBuilderImpl
**Implements:** `IndexTransitionInstruction$IndexTransitionInstructionBuilder` 

**Fields:**
- `List (List) priceQuantity`
- `Date effectiveDate`
- `TransferBuilder cashTransfer`

**Key Methods:**
- `build()` → `IndexTransitionInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getCashTransfer()` → `TransferBuilder` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `setPriceQuantity(List arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setEffectiveDate(Date arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `setCashTransfer(Transfer arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getOrCreateCashTransfer()` → `TransferBuilder` [Getter]

### IndexTransitionInstructionImpl
**Implements:** `IndexTransitionInstruction` 

**Key Methods:**
- `build()` → `IndexTransitionInstruction` [Builder]
- `setBuilderFields(IndexTransitionInstructionBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `getCashTransfer()` → `Transfer` [Getter]
- `getPriceQuantity()` → `List` [Getter]

### InstructionBuilderImpl
**Implements:** `Instruction$InstructionBuilder` 

**Fields:**
- `PrimitiveInstructionBuilder primitiveInstruction`
- `ReferenceWithMetaTradeStateBuilder before`

**Key Methods:**
- `build()` → `Instruction` [Builder]
- `setBefore(ReferenceWithMetaTradeState arg0)` → `InstructionBuilder` [Setter]
- `getBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getPrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]
- `getOrCreatePrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]
- `setBeforeValue(TradeState arg0)` → `InstructionBuilder` [Setter]
- `setPrimitiveInstruction(PrimitiveInstruction arg0)` → `InstructionBuilder` [Setter]
- `getOrCreateBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]

### InstructionImpl
**Implements:** `Instruction` 

**Key Methods:**
- `build()` → `Instruction` [Builder]
- `setBuilderFields(InstructionBuilder arg0)` → `void` [Setter]
- `getBefore()` → `ReferenceWithMetaTradeState` [Getter]
- `getPrimitiveInstruction()` → `PrimitiveInstruction` [Getter]

### LineageBuilderImpl
**Implements:** `Lineage$LineageBuilder` 

**Fields:**
- `List (List) tradeReference`
- `List (List) eventReference`
- `List (List) portfolioStateReference`

**Key Methods:**
- `build()` → `Lineage` [Builder]
- `setTradeReference(List arg0)` → `LineageBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeBuilder` [Getter]
- `setEventReference(List arg0)` → `LineageBuilder` [Setter]
- `getOrCreateEventReference(int arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Getter]
- `getEventReference()` → `List` [Getter]
- `setEventReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getPortfolioStateReference()` → `List` [Getter]

### LineageImpl
**Implements:** `Lineage` 

**Key Methods:**
- `build()` → `Lineage` [Builder]
- `setBuilderFields(LineageBuilder arg0)` → `void` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getEventReference()` → `List` [Getter]
- `getPortfolioStateReference()` → `List` [Getter]

### MarginCallBaseBuilderImpl
**Implements:** `MarginCallBase$MarginCallBaseBuilder` 

**Fields:**
- `MarginCallInstructionTypeBuilder instructionType`
- `List (List) party`
- `List (List) partyRole`
- `PartyBuilder clearingBroker`
- `IdentifierBuilder callIdentifier`
- `AgreementNameBuilder callAgreementType`
- `MoneyBuilder agreementMinimumTransferAmount`
- `MoneyBuilder agreementThreshold`
- `MoneyBuilder agreementRounding`
- `RegMarginTypeEnum regMarginType`
- `RegIMRoleEnum regIMRole`
- `MarginCallExposureBuilder baseCurrencyExposure`
- `ReferenceWithMetaCollateralPortfolioBuilder collateralPortfolio`
- `CollateralBalanceBuilder independentAmountBalance`

**Key Methods:**
- `build()` → `MarginCallBase` [Builder]
- `getPartyRole()` → `List` [Getter]
- `getIndependentAmountBalance()` → `CollateralBalanceBuilder` [Getter]
- `getAgreementMinimumTransferAmount()` → `MoneyBuilder` [Getter]
- `getParty()` → `List` [Getter]
- `setAgreementRounding(Money arg0)` → `MarginCallBaseBuilder` [Setter]
- `setInstructionType(MarginCallInstructionType arg0)` → `MarginCallBaseBuilder` [Setter]
- `setClearingBroker(Party arg0)` → `MarginCallBaseBuilder` [Setter]
- `setRegMarginType(RegMarginTypeEnum arg0)` → `MarginCallBaseBuilder` [Setter]
- `setCallAgreementType(AgreementName arg0)` → `MarginCallBaseBuilder` [Setter]

### MarginCallBaseImpl
**Implements:** `MarginCallBase` 

**Key Methods:**
- `build()` → `MarginCallBase` [Builder]
- `setBuilderFields(MarginCallBaseBuilder arg0)` → `void` [Setter]
- `getPartyRole()` → `List` [Getter]
- `getIndependentAmountBalance()` → `CollateralBalance` [Getter]
- `getAgreementMinimumTransferAmount()` → `Money` [Getter]
- `getParty()` → `List` [Getter]
- `getRegMarginType()` → `RegMarginTypeEnum` [Getter]
- `getClearingBroker()` → `Party` [Getter]
- `getCallIdentifier()` → `Identifier` [Getter]
- `getRegIMRole()` → `RegIMRoleEnum` [Getter]

### MarginCallExposureBuilderImpl
**Extends:** `MarginCallBase$MarginCallBaseBuilderImpl` 
**Implements:** `MarginCallExposure$MarginCallExposureBuilder` 

**Fields:**
- `ExposureBuilder overallExposure`
- `ExposureBuilder simmIMExposure`
- `ExposureBuilder scheduleGridIMExposure`

**Key Methods:**
- `build()` → `MarginCallExposure` [Builder]
- `getOverallExposure()` → `ExposureBuilder` [Getter]
- `getSimmIMExposure()` → `ExposureBuilder` [Getter]
- `getScheduleGridIMExposure()` → `ExposureBuilder` [Getter]
- `setAgreementRounding(Money arg0)` → `MarginCallExposureBuilder` [Setter]
- `setInstructionType(MarginCallInstructionType arg0)` → `MarginCallExposureBuilder` [Setter]
- `setClearingBroker(Party arg0)` → `MarginCallExposureBuilder` [Setter]
- `setRegMarginType(RegMarginTypeEnum arg0)` → `MarginCallExposureBuilder` [Setter]
- `getOrCreateSimmIMExposure()` → `ExposureBuilder` [Getter]
- `setCallAgreementType(AgreementName arg0)` → `MarginCallExposureBuilder` [Setter]

### MarginCallExposureImpl
**Extends:** `MarginCallBase$MarginCallBaseImpl` 
**Implements:** `MarginCallExposure` 

**Key Methods:**
- `build()` → `MarginCallExposure` [Builder]
- `setBuilderFields(MarginCallExposureBuilder arg0)` → `void` [Setter]
- `getOverallExposure()` → `Exposure` [Getter]
- `getSimmIMExposure()` → `Exposure` [Getter]
- `getScheduleGridIMExposure()` → `Exposure` [Getter]

### MarginCallInstructionTypeBuilderImpl
**Implements:** `MarginCallInstructionType$MarginCallInstructionTypeBuilder` 

**Fields:**
- `CallTypeEnum callType`
- `Boolean visibilityIndicator`

**Key Methods:**
- `build()` → `MarginCallInstructionType` [Builder]
- `setVisibilityIndicator(Boolean arg0)` → `MarginCallInstructionTypeBuilder` [Setter]
- `getCallType()` → `CallTypeEnum` [Getter]
- `setCallType(CallTypeEnum arg0)` → `MarginCallInstructionTypeBuilder` [Setter]
- `getVisibilityIndicator()` → `Boolean` [Getter]

### MarginCallInstructionTypeImpl
**Implements:** `MarginCallInstructionType` 

**Key Methods:**
- `build()` → `MarginCallInstructionType` [Builder]
- `setBuilderFields(MarginCallInstructionTypeBuilder arg0)` → `void` [Setter]
- `getCallType()` → `CallTypeEnum` [Getter]
- `getVisibilityIndicator()` → `Boolean` [Getter]

### MarginCallIssuanceBuilderImpl
**Extends:** `MarginCallBase$MarginCallBaseBuilderImpl` 
**Implements:** `MarginCallIssuance$MarginCallIssuanceBuilder` 

**Fields:**
- `MoneyBuilder callAmountInBaseCurrency`
- `List (List) recallNonCashCollateralDescription`

**Key Methods:**
- `build()` → `MarginCallIssuance` [Builder]
- `getCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setRecallNonCashCollateralDescription(List arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getOrCreateCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setCallAmountInBaseCurrency(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getRecallNonCashCollateralDescription()` → `List` [Getter]
- `getOrCreateRecallNonCashCollateralDescription(int arg0)` → `EligibleCollateralCriteriaBuilder` [Getter]
- `setAgreementRounding(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setInstructionType(MarginCallInstructionType arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setClearingBroker(Party arg0)` → `MarginCallIssuanceBuilder` [Setter]

### MarginCallIssuanceImpl
**Extends:** `MarginCallBase$MarginCallBaseImpl` 
**Implements:** `MarginCallIssuance` 

**Key Methods:**
- `build()` → `MarginCallIssuance` [Builder]
- `setBuilderFields(MarginCallIssuanceBuilder arg0)` → `void` [Setter]
- `getCallAmountInBaseCurrency()` → `Money` [Getter]
- `getRecallNonCashCollateralDescription()` → `List` [Getter]

### MarginCallResponseActionBuilderImpl
**Implements:** `MarginCallResponseAction$MarginCallResponseActionBuilder` 

**Fields:**
- `List (List) collateralPositionComponent`
- `MarginCallActionEnum marginCallAction`

**Key Methods:**
- `build()` → `MarginCallResponseAction` [Builder]
- `getOrCreateCollateralPositionComponent(int arg0)` → `CollateralPositionBuilder` [Getter]
- `getCollateralPositionComponent()` → `List` [Getter]
- `setCollateralPositionComponent(List arg0)` → `MarginCallResponseActionBuilder` [Setter]
- `setMarginCallAction(MarginCallActionEnum arg0)` → `MarginCallResponseActionBuilder` [Setter]
- `getMarginCallAction()` → `MarginCallActionEnum` [Getter]

### MarginCallResponseActionImpl
**Implements:** `MarginCallResponseAction` 

**Key Methods:**
- `build()` → `MarginCallResponseAction` [Builder]
- `setBuilderFields(MarginCallResponseActionBuilder arg0)` → `void` [Setter]
- `getCollateralPositionComponent()` → `List` [Getter]
- `getMarginCallAction()` → `MarginCallActionEnum` [Getter]

### MarginCallResponseBuilderImpl
**Extends:** `MarginCallBase$MarginCallBaseBuilderImpl` 
**Implements:** `MarginCallResponse$MarginCallResponseBuilder` 

**Fields:**
- `List (List) marginCallResponseAction`
- `MarginCallResponseTypeEnum marginResponseType`
- `MoneyBuilder agreedAmountBaseCurrency`

**Key Methods:**
- `build()` → `MarginCallResponse` [Builder]
- `setMarginResponseType(MarginCallResponseTypeEnum arg0)` → `MarginCallResponseBuilder` [Setter]
- `getMarginResponseType()` → `MarginCallResponseTypeEnum` [Getter]
- `getAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setMarginCallResponseAction(List arg0)` → `MarginCallResponseBuilder` [Setter]
- `getOrCreateMarginCallResponseAction(int arg0)` → `MarginCallResponseActionBuilder` [Getter]
- `getMarginCallResponseAction()` → `List` [Getter]
- `getOrCreateAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setAgreedAmountBaseCurrency(Money arg0)` → `MarginCallResponseBuilder` [Setter]
- `setAgreementRounding(Money arg0)` → `MarginCallResponseBuilder` [Setter]

### MarginCallResponseImpl
**Extends:** `MarginCallBase$MarginCallBaseImpl` 
**Implements:** `MarginCallResponse` 

**Key Methods:**
- `build()` → `MarginCallResponse` [Builder]
- `setBuilderFields(MarginCallResponseBuilder arg0)` → `void` [Setter]
- `getMarginResponseType()` → `MarginCallResponseTypeEnum` [Getter]
- `getAgreedAmountBaseCurrency()` → `Money` [Getter]
- `getMarginCallResponseAction()` → `List` [Getter]

### ObservationEventBuilderImpl
**Implements:** `ObservationEvent$ObservationEventBuilder` 

**Fields:**
- `CreditEventBuilder creditEvent`
- `CorporateActionBuilder corporateAction`

**Key Methods:**
- `build()` → `ObservationEvent` [Builder]
- `getOrCreateCreditEvent()` → `CreditEventBuilder` [Getter]
- `getCreditEvent()` → `CreditEventBuilder` [Getter]
- `getOrCreateCorporateAction()` → `CorporateActionBuilder` [Getter]
- `setCorporateAction(CorporateAction arg0)` → `ObservationEventBuilder` [Setter]
- `setCreditEvent(CreditEvent arg0)` → `ObservationEventBuilder` [Setter]
- `getCorporateAction()` → `CorporateActionBuilder` [Getter]

### ObservationEventImpl
**Implements:** `ObservationEvent` 

**Key Methods:**
- `build()` → `ObservationEvent` [Builder]
- `setBuilderFields(ObservationEventBuilder arg0)` → `void` [Setter]
- `getCreditEvent()` → `CreditEvent` [Getter]
- `getCorporateAction()` → `CorporateAction` [Getter]

### ObservationInstructionBuilderImpl
**Implements:** `ObservationInstruction$ObservationInstructionBuilder` 

**Fields:**
- `ObservationEventBuilder observationEvent`

**Key Methods:**
- `build()` → `ObservationInstruction` [Builder]
- `getObservationEvent()` → `ObservationEventBuilder` [Getter]
- `setObservationEvent(ObservationEvent arg0)` → `ObservationInstructionBuilder` [Setter]
- `getOrCreateObservationEvent()` → `ObservationEventBuilder` [Getter]

### ObservationInstructionImpl
**Implements:** `ObservationInstruction` 

**Key Methods:**
- `build()` → `ObservationInstruction` [Builder]
- `setBuilderFields(ObservationInstructionBuilder arg0)` → `void` [Setter]
- `getObservationEvent()` → `ObservationEvent` [Getter]

### PartyChangeInstructionBuilderImpl
**Implements:** `PartyChangeInstruction$PartyChangeInstructionBuilder` 

**Fields:**
- `CounterpartyBuilder counterparty`
- `AncillaryPartyBuilder ancillaryParty`
- `PartyRoleBuilder partyRole`
- `List (List) tradeId`

**Key Methods:**
- `build()` → `PartyChangeInstruction` [Builder]
- `getPartyRole()` → `PartyRoleBuilder` [Getter]
- `getCounterparty()` → `CounterpartyBuilder` [Getter]
- `getAncillaryParty()` → `AncillaryPartyBuilder` [Getter]
- `setTradeId(List arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getTradeId()` → `List` [Getter]
- `setCounterparty(Counterparty arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateAncillaryParty()` → `AncillaryPartyBuilder` [Getter]
- `getOrCreateCounterparty()` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(AncillaryParty arg0)` → `PartyChangeInstructionBuilder` [Setter]

### PartyChangeInstructionImpl
**Implements:** `PartyChangeInstruction` 

**Key Methods:**
- `build()` → `PartyChangeInstruction` [Builder]
- `setBuilderFields(PartyChangeInstructionBuilder arg0)` → `void` [Setter]
- `getPartyRole()` → `PartyRole` [Getter]
- `getCounterparty()` → `Counterparty` [Getter]
- `getAncillaryParty()` → `AncillaryParty` [Getter]
- `getTradeId()` → `List` [Getter]

### PositionIdentifierBuilderImpl
**Extends:** `Identifier$IdentifierBuilderImpl` 
**Implements:** `PositionIdentifier$PositionIdentifierBuilder` 

**Fields:**
- `TradeIdentifierTypeEnum identifierType`

**Key Methods:**
- `build()` → `PositionIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]
- `setIssuerReferenceValue(Party arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `PositionIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `PositionIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `PositionIdentifierBuilder` [Setter]

### PositionIdentifierImpl
**Extends:** `Identifier$IdentifierImpl` 
**Implements:** `PositionIdentifier` 

**Key Methods:**
- `build()` → `PositionIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]
- `setBuilderFields(PositionIdentifierBuilder arg0)` → `void` [Setter]

### PrimitiveInstructionBuilderImpl
**Implements:** `PrimitiveInstruction$PrimitiveInstructionBuilder` 

**Fields:**
- `ContractFormationInstructionBuilder contractFormation`
- `ExecutionInstructionBuilder execution`
- `ExerciseInstructionBuilder exercise`
- `PartyChangeInstructionBuilder partyChange`
- `QuantityChangeInstructionBuilder quantityChange`
- `ResetInstructionBuilder reset`
- `SplitInstructionBuilder split`
- `TermsChangeInstructionBuilder termsChange`
- `TransferInstructionBuilder transfer`
- `IndexTransitionInstructionBuilder indexTransition`
- `StockSplitInstructionBuilder stockSplit`
- `ObservationInstructionBuilder observation`
- `ValuationInstructionBuilder valuation`

**Key Methods:**
- `build()` → `PrimitiveInstruction` [Builder]
- `setTransfer(TransferInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `getOrCreateTransfer()` → `TransferInstructionBuilder` [Getter]
- `getObservation()` → `ObservationInstructionBuilder` [Getter]
- `getExecution()` → `ExecutionInstructionBuilder` [Getter]
- `getTransfer()` → `TransferInstructionBuilder` [Getter]
- `getSplit()` → `SplitInstructionBuilder` [Getter]
- `getReset()` → `ResetInstructionBuilder` [Getter]
- `setReset(ResetInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `setSplit(SplitInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]

### PrimitiveInstructionImpl
**Implements:** `PrimitiveInstruction` 

**Key Methods:**
- `build()` → `PrimitiveInstruction` [Builder]
- `setBuilderFields(PrimitiveInstructionBuilder arg0)` → `void` [Setter]
- `getObservation()` → `ObservationInstruction` [Getter]
- `getExecution()` → `ExecutionInstruction` [Getter]
- `getTransfer()` → `TransferInstruction` [Getter]
- `getSplit()` → `SplitInstruction` [Getter]
- `getReset()` → `ResetInstruction` [Getter]
- `getContractFormation()` → `ContractFormationInstruction` [Getter]
- `getExercise()` → `ExerciseInstruction` [Getter]
- `getPartyChange()` → `PartyChangeInstruction` [Getter]

### QuantityChangeInstructionBuilderImpl
**Implements:** `QuantityChangeInstruction$QuantityChangeInstructionBuilder` 

**Fields:**
- `List (List) change`
- `QuantityChangeDirectionEnum direction`
- `List (List) lotIdentifier`

**Key Methods:**
- `build()` → `QuantityChangeInstruction` [Builder]
- `getDirection()` → `QuantityChangeDirectionEnum` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `setChange(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getChange()` → `List` [Getter]
- `getOrCreateChange(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setDirection(QuantityChangeDirectionEnum arg0)` → `QuantityChangeInstructionBuilder` [Setter]

### QuantityChangeInstructionImpl
**Implements:** `QuantityChangeInstruction` 

**Key Methods:**
- `build()` → `QuantityChangeInstruction` [Builder]
- `setBuilderFields(QuantityChangeInstructionBuilder arg0)` → `void` [Setter]
- `getDirection()` → `QuantityChangeDirectionEnum` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `getChange()` → `List` [Getter]

### ResetBuilderImpl
**Implements:** `Reset$ResetBuilder` 

**Fields:**
- `PriceBuilder resetValue`
- `Date resetDate`
- `Date rateRecordDate`
- `List (List) observations`
- `AveragingCalculationBuilder averagingMethodology`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Reset` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getResetValue()` → `PriceBuilder` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `getObservations()` → `List` [Getter]
- `getAveragingMethodology()` → `AveragingCalculationBuilder` [Getter]
- `setAveragingMethodology(AveragingCalculation arg0)` → `ResetBuilder` [Setter]
- `setObservations(List arg0)` → `ResetBuilder` [Setter]
- `setResetDate(Date arg0)` → `ResetBuilder` [Setter]

### ResetImpl
**Implements:** `Reset` 

**Key Methods:**
- `build()` → `Reset` [Builder]
- `setBuilderFields(ResetBuilder arg0)` → `void` [Setter]
- `getResetValue()` → `Price` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `getObservations()` → `List` [Getter]
- `getAveragingMethodology()` → `AveragingCalculation` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ResetInstructionBuilderImpl
**Implements:** `ResetInstruction$ResetInstructionBuilder` 

**Fields:**
- `List (List) payout`
- `Date rateRecordDate`
- `Date resetDate`

**Key Methods:**
- `build()` → `ResetInstruction` [Builder]
- `getResetDate()` → `Date` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `setPayout(List arg0)` → `ResetInstructionBuilder` [Setter]
- `setResetDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `setRateRecordDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `getPayout()` → `List` [Getter]
- `getOrCreatePayout(int arg0)` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `setPayoutValue(List arg0)` → `ResetInstructionBuilder` [Setter]

### ResetInstructionImpl
**Implements:** `ResetInstruction` 

**Key Methods:**
- `build()` → `ResetInstruction` [Builder]
- `setBuilderFields(ResetInstructionBuilder arg0)` → `void` [Setter]
- `getResetDate()` → `Date` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `getPayout()` → `List` [Getter]

### ReturnInstructionBuilderImpl
**Implements:** `ReturnInstruction$ReturnInstructionBuilder` 

**Fields:**
- `List (List) quantity`

**Key Methods:**
- `build()` → `ReturnInstruction` [Builder]
- `getQuantity()` → `List` [Getter]
- `setQuantity(List arg0)` → `ReturnInstructionBuilder` [Setter]
- `getOrCreateQuantity(int arg0)` → `QuantityBuilder` [Getter]

### ReturnInstructionImpl
**Implements:** `ReturnInstruction` 

**Key Methods:**
- `build()` → `ReturnInstruction` [Builder]
- `getQuantity()` → `List` [Getter]
- `setBuilderFields(ReturnInstructionBuilder arg0)` → `void` [Setter]

### ScheduledTransferBuilderImpl
**Implements:** `ScheduledTransfer$ScheduledTransferBuilder` 

**Fields:**
- `ScheduledTransferEnum transferType`
- `CorporateActionTypeEnum corporateActionTransferType`

**Key Methods:**
- `build()` → `ScheduledTransfer` [Builder]
- `getTransferType()` → `ScheduledTransferEnum` [Getter]
- `getCorporateActionTransferType()` → `CorporateActionTypeEnum` [Getter]
- `setTransferType(ScheduledTransferEnum arg0)` → `ScheduledTransferBuilder` [Setter]
- `setCorporateActionTransferType(CorporateActionTypeEnum arg0)` → `ScheduledTransferBuilder` [Setter]

### ScheduledTransferImpl
**Implements:** `ScheduledTransfer` 

**Key Methods:**
- `build()` → `ScheduledTransfer` [Builder]
- `getTransferType()` → `ScheduledTransferEnum` [Getter]
- `setBuilderFields(ScheduledTransferBuilder arg0)` → `void` [Setter]
- `getCorporateActionTransferType()` → `CorporateActionTypeEnum` [Getter]

### SecurityLendingInvoiceBuilderImpl
**Implements:** `SecurityLendingInvoice$SecurityLendingInvoiceBuilder` 

**Fields:**
- `PartyBuilder sendingParty`
- `PartyBuilder receivingParty`
- `Date billingStartDate`
- `Date billingEndDate`
- `List (List) billingRecord`
- `List (List) billingSummary`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `SecurityLendingInvoice` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getBillingSummary()` → `List` [Getter]
- `getBillingRecord()` → `List` [Getter]
- `getSendingParty()` → `PartyBuilder` [Getter]
- `getReceivingParty()` → `PartyBuilder` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getBillingStartDate()` → `Date` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `SecurityLendingInvoiceBuilder` [Setter]

### SecurityLendingInvoiceImpl
**Implements:** `SecurityLendingInvoice` 

**Key Methods:**
- `build()` → `SecurityLendingInvoice` [Builder]
- `setBuilderFields(SecurityLendingInvoiceBuilder arg0)` → `void` [Setter]
- `getBillingSummary()` → `List` [Getter]
- `getBillingRecord()` → `List` [Getter]
- `getSendingParty()` → `Party` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getBillingStartDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### SplitInstructionBuilderImpl
**Implements:** `SplitInstruction$SplitInstructionBuilder` 

**Fields:**
- `List (List) breakdown`

**Key Methods:**
- `build()` → `SplitInstruction` [Builder]
- `getOrCreateBreakdown(int arg0)` → `PrimitiveInstructionBuilder` [Getter]
- `setBreakdown(List arg0)` → `SplitInstructionBuilder` [Setter]
- `getBreakdown()` → `List` [Getter]

### SplitInstructionImpl
**Implements:** `SplitInstruction` 

**Key Methods:**
- `build()` → `SplitInstruction` [Builder]
- `setBuilderFields(SplitInstructionBuilder arg0)` → `void` [Setter]
- `getBreakdown()` → `List` [Getter]

### StateBuilderImpl
**Implements:** `State$StateBuilder` 

**Fields:**
- `ClosedStateBuilder closedState`
- `PositionStatusEnum positionState`

**Key Methods:**
- `build()` → `State` [Builder]
- `getClosedState()` → `ClosedStateBuilder` [Getter]
- `getPositionState()` → `PositionStatusEnum` [Getter]
- `getOrCreateClosedState()` → `ClosedStateBuilder` [Getter]
- `setPositionState(PositionStatusEnum arg0)` → `StateBuilder` [Setter]
- `setClosedState(ClosedState arg0)` → `StateBuilder` [Setter]

### StateImpl
**Implements:** `State` 

**Key Methods:**
- `build()` → `State` [Builder]
- `setBuilderFields(StateBuilder arg0)` → `void` [Setter]
- `getClosedState()` → `ClosedState` [Getter]
- `getPositionState()` → `PositionStatusEnum` [Getter]

### StockSplitInstructionBuilderImpl
**Implements:** `StockSplitInstruction$StockSplitInstructionBuilder` 

**Fields:**
- `BigDecimal adjustmentRatio`
- `Date effectiveDate`

**Key Methods:**
- `build()` → `StockSplitInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getAdjustmentRatio()` → `BigDecimal` [Getter]
- `setAdjustmentRatio(BigDecimal arg0)` → `StockSplitInstructionBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `StockSplitInstructionBuilder` [Setter]

### StockSplitInstructionImpl
**Implements:** `StockSplitInstruction` 

**Key Methods:**
- `build()` → `StockSplitInstruction` [Builder]
- `setBuilderFields(StockSplitInstructionBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `getAdjustmentRatio()` → `BigDecimal` [Getter]

### TermsChangeInstructionBuilderImpl
**Implements:** `TermsChangeInstruction$TermsChangeInstructionBuilder` 

**Fields:**
- `NonTransferableProductBuilder product`
- `List (List) ancillaryParty`
- `NotionalAdjustmentEnum adjustment`

**Key Methods:**
- `build()` → `TermsChangeInstruction` [Builder]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `getOrCreateProduct()` → `NonTransferableProductBuilder` [Getter]
- `getProduct()` → `NonTransferableProductBuilder` [Getter]
- `setProduct(NonTransferableProduct arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `setAdjustment(NotionalAdjustmentEnum arg0)` → `TermsChangeInstructionBuilder` [Setter]

### TermsChangeInstructionImpl
**Implements:** `TermsChangeInstruction` 

**Key Methods:**
- `build()` → `TermsChangeInstruction` [Builder]
- `setBuilderFields(TermsChangeInstructionBuilder arg0)` → `void` [Setter]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getProduct()` → `NonTransferableProduct` [Getter]

### TradeBuilderImpl
**Extends:** `TradableProduct$TradableProductBuilderImpl` 
**Implements:** `Trade$TradeBuilder` 

**Fields:**
- `List (List) tradeIdentifier`
- `FieldWithMetaDateBuilder tradeDate`
- `FieldWithMetaTimeZoneBuilder tradeTime`
- `List (List) party`
- `List (List) partyRole`
- `ExecutionDetailsBuilder executionDetails`
- `ContractDetailsBuilder contractDetails`
- `Date clearedDate`
- `CollateralBuilder collateral`
- `List (List) account`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Trade` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getTradeDate()` → `FieldWithMetaDateBuilder` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getExecutionDetails()` → `ExecutionDetailsBuilder` [Getter]
- `getContractDetails()` → `ContractDetailsBuilder` [Getter]
- `getClearedDate()` → `Date` [Getter]
- `getCollateral()` → `CollateralBuilder` [Getter]

### TradeIdentifierBuilderImpl
**Extends:** `Identifier$IdentifierBuilderImpl` 
**Implements:** `TradeIdentifier$TradeIdentifierBuilder` 

**Fields:**
- `TradeIdentifierTypeEnum identifierType`

**Key Methods:**
- `build()` → `TradeIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]
- `setIssuerReferenceValue(Party arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `TradeIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `TradeIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `TradeIdentifierBuilder` [Setter]

### TradeIdentifierImpl
**Extends:** `Identifier$IdentifierImpl` 
**Implements:** `TradeIdentifier` 

**Key Methods:**
- `build()` → `TradeIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]
- `setBuilderFields(TradeIdentifierBuilder arg0)` → `void` [Setter]

### TradeImpl
**Extends:** `TradableProduct$TradableProductImpl` 
**Implements:** `Trade` 

**Key Methods:**
- `build()` → `Trade` [Builder]
- `setBuilderFields(TradeBuilder arg0)` → `void` [Setter]
- `getTradeDate()` → `FieldWithMetaDate` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getExecutionDetails()` → `ExecutionDetails` [Getter]
- `getContractDetails()` → `ContractDetails` [Getter]
- `getClearedDate()` → `Date` [Getter]
- `getCollateral()` → `Collateral` [Getter]

### TradePricingReportBuilderImpl
**Implements:** `TradePricingReport$TradePricingReportBuilder` 

**Fields:**
- `TradeBuilder trade`
- `TimeZoneBuilder pricingTime`
- `FloatingRateIndexEnum discountingIndex`

**Key Methods:**
- `build()` → `TradePricingReport` [Builder]
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `getPricingTime()` → `TimeZoneBuilder` [Getter]
- `getDiscountingIndex()` → `FloatingRateIndexEnum` [Getter]
- `getOrCreatePricingTime()` → `TimeZoneBuilder` [Getter]
- `setPricingTime(TimeZone arg0)` → `TradePricingReportBuilder` [Setter]
- `setDiscountingIndex(FloatingRateIndexEnum arg0)` → `TradePricingReportBuilder` [Setter]
- `getTrade()` → `TradeBuilder` [Getter]
- `setTrade(Trade arg0)` → `TradePricingReportBuilder` [Setter]

### TradePricingReportImpl
**Implements:** `TradePricingReport` 

**Key Methods:**
- `build()` → `TradePricingReport` [Builder]
- `setBuilderFields(TradePricingReportBuilder arg0)` → `void` [Setter]
- `getPricingTime()` → `TimeZone` [Getter]
- `getDiscountingIndex()` → `FloatingRateIndexEnum` [Getter]
- `getTrade()` → `Trade` [Getter]

### TradeStateBuilderImpl
**Implements:** `TradeState$TradeStateBuilder` 

**Fields:**
- `TradeBuilder trade`
- `StateBuilder state`
- `List (List) resetHistory`
- `List (List) transferHistory`
- `List (List) observationHistory`
- `List (List) valuationHistory`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `getState()` → `StateBuilder` [Getter]
- `setState(State arg0)` → `TradeStateBuilder` [Setter]
- `build()` → `TradeState` [Builder]
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getObservationHistory()` → `List` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `getResetHistory()` → `List` [Getter]
- `getOrCreateTransferHistory(int arg0)` → `TransferStateBuilder` [Getter]
- `getOrCreateResetHistory(int arg0)` → `ResetBuilder` [Getter]

### TradeStateImpl
**Implements:** `TradeState` 

**Key Methods:**
- `getState()` → `State` [Getter]
- `build()` → `TradeState` [Builder]
- `setBuilderFields(TradeStateBuilder arg0)` → `void` [Setter]
- `getObservationHistory()` → `List` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `getResetHistory()` → `List` [Getter]
- `getValuationHistory()` → `List` [Getter]
- `getTrade()` → `Trade` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### TransferBuilderImpl
**Extends:** `AssetFlowBase$AssetFlowBaseBuilderImpl` 
**Implements:** `Transfer$TransferBuilder` 

**Fields:**
- `List (List) identifier`
- `PartyReferencePayerReceiverBuilder payerReceiver`
- `ReferenceWithMetaPayoutBuilder settlementOrigin`
- `ResetBuilder resetOrigin`
- `TransferExpressionBuilder transferExpression`

**Key Methods:**
- `build()` → `Transfer` [Builder]
- `getOrCreateResetOrigin()` → `ResetBuilder` [Getter]
- `getSettlementOrigin()` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `setSettlementOriginValue(Payout arg0)` → `TransferBuilder` [Setter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `TransferBuilder` [Setter]
- `setTransferExpression(TransferExpression arg0)` → `TransferBuilder` [Setter]
- `setIdentifierValue(List arg0)` → `TransferBuilder` [Setter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `TransferBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `TransferBuilder` [Setter]

### TransferExpressionBuilderImpl
**Implements:** `TransferExpression$TransferExpressionBuilder` 

**Fields:**
- `FeeTypeEnum priceTransfer`
- `ScheduledTransferBuilder scheduledTransfer`

**Key Methods:**
- `build()` → `TransferExpression` [Builder]
- `setPriceTransfer(FeeTypeEnum arg0)` → `TransferExpressionBuilder` [Setter]
- `setScheduledTransfer(ScheduledTransfer arg0)` → `TransferExpressionBuilder` [Setter]
- `getPriceTransfer()` → `FeeTypeEnum` [Getter]
- `getScheduledTransfer()` → `ScheduledTransferBuilder` [Getter]
- `getOrCreateScheduledTransfer()` → `ScheduledTransferBuilder` [Getter]

### TransferExpressionImpl
**Implements:** `TransferExpression` 

**Key Methods:**
- `build()` → `TransferExpression` [Builder]
- `getPriceTransfer()` → `FeeTypeEnum` [Getter]
- `getScheduledTransfer()` → `ScheduledTransfer` [Getter]
- `setBuilderFields(TransferExpressionBuilder arg0)` → `void` [Setter]

### TransferImpl
**Extends:** `AssetFlowBase$AssetFlowBaseImpl` 
**Implements:** `Transfer` 

**Key Methods:**
- `build()` → `Transfer` [Builder]
- `getSettlementOrigin()` → `ReferenceWithMetaPayout` [Getter]
- `setBuilderFields(TransferBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `getTransferExpression()` → `TransferExpression` [Getter]
- `getResetOrigin()` → `Reset` [Getter]
- `getIdentifier()` → `List` [Getter]

### TransferInstructionBuilderImpl
**Implements:** `TransferInstruction$TransferInstructionBuilder` 

**Fields:**
- `List (List) transferState`

**Key Methods:**
- `build()` → `TransferInstruction` [Builder]
- `getTransferState()` → `List` [Getter]
- `setTransferState(List arg0)` → `TransferInstructionBuilder` [Setter]
- `getOrCreateTransferState(int arg0)` → `TransferStateBuilder` [Getter]

### TransferInstructionImpl
**Implements:** `TransferInstruction` 

**Key Methods:**
- `build()` → `TransferInstruction` [Builder]
- `setBuilderFields(TransferInstructionBuilder arg0)` → `void` [Setter]
- `getTransferState()` → `List` [Getter]

### TransferStateBuilderImpl
**Implements:** `TransferState$TransferStateBuilder` 

**Fields:**
- `TransferBuilder transfer`
- `TransferStatusEnum transferStatus`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `TransferState` [Builder]
- `getTransferStatus()` → `TransferStatusEnum` [Getter]
- `setTransfer(Transfer arg0)` → `TransferStateBuilder` [Setter]
- `setTransferStatus(TransferStatusEnum arg0)` → `TransferStateBuilder` [Setter]
- `getOrCreateTransfer()` → `TransferBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getTransfer()` → `TransferBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `TransferStateBuilder` [Setter]

### TransferStateImpl
**Implements:** `TransferState` 

**Key Methods:**
- `build()` → `TransferState` [Builder]
- `getTransferStatus()` → `TransferStatusEnum` [Getter]
- `setBuilderFields(TransferStateBuilder arg0)` → `void` [Setter]
- `getTransfer()` → `Transfer` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ValuationBuilderImpl
**Implements:** `Valuation$ValuationBuilder` 

**Fields:**
- `MoneyBuilder amount`
- `ZonedDateTime timestamp`
- `ValuationTypeEnum method`
- `ValuationSourceEnum source`
- `BigDecimal delta`
- `PriceTimingEnum valuationTiming`
- `PriceBuilder priceComponent`

**Key Methods:**
- `getMethod()` → `ValuationTypeEnum` [Getter]
- `build()` → `Valuation` [Builder]
- `setMethod(ValuationTypeEnum arg0)` → `ValuationBuilder` [Setter]
- `getTimestamp()` → `ZonedDateTime` [Getter]
- `getOrCreateAmount()` → `MoneyBuilder` [Getter]
- `getOrCreatePriceComponent()` → `PriceBuilder` [Getter]
- `getValuationTiming()` → `PriceTimingEnum` [Getter]
- `getPriceComponent()` → `PriceBuilder` [Getter]
- `setPriceComponent(Price arg0)` → `ValuationBuilder` [Setter]
- `setValuationTiming(PriceTimingEnum arg0)` → `ValuationBuilder` [Setter]

### ValuationImpl
**Implements:** `Valuation` 

**Key Methods:**
- `getMethod()` → `ValuationTypeEnum` [Getter]
- `build()` → `Valuation` [Builder]
- `getTimestamp()` → `ZonedDateTime` [Getter]
- `setBuilderFields(ValuationBuilder arg0)` → `void` [Setter]
- `getValuationTiming()` → `PriceTimingEnum` [Getter]
- `getPriceComponent()` → `Price` [Getter]
- `getSource()` → `ValuationSourceEnum` [Getter]
- `getDelta()` → `BigDecimal` [Getter]
- `getAmount()` → `Money` [Getter]

### ValuationInstructionBuilderImpl
**Implements:** `ValuationInstruction$ValuationInstructionBuilder` 

**Fields:**
- `List (List) valuation`
- `Boolean replace`

**Key Methods:**
- `build()` → `ValuationInstruction` [Builder]
- `setReplace(Boolean arg0)` → `ValuationInstructionBuilder` [Setter]
- `getReplace()` → `Boolean` [Getter]
- `setValuation(List arg0)` → `ValuationInstructionBuilder` [Setter]
- `getOrCreateValuation(int arg0)` → `ValuationBuilder` [Getter]
- `getValuation()` → `List` [Getter]

### ValuationInstructionImpl
**Implements:** `ValuationInstruction` 

**Key Methods:**
- `build()` → `ValuationInstruction` [Builder]
- `setBuilderFields(ValuationInstructionBuilder arg0)` → `void` [Setter]
- `getReplace()` → `Boolean` [Getter]
- `getValuation()` → `List` [Getter]

