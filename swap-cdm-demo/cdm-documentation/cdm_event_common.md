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
- `getBillingStartDate()` → `Date` [Getter]
- `getBillingSummary()` → `List` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getSendingParty()` → `Party` [Getter]
- `getBillingRecordInstruction()` → `List` [Getter]

### BillingInstructionBuilder
**Implements:** `BillingInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBillingSummary(List arg0)` → `BillingInstructionBuilder` [Setter]
- `setBillingEndDate(Date arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateSendingParty()` → `PartyBuilder` [Getter]
- `setBillingStartDate(Date arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateBillingSummary(int arg0)` → `BillingSummaryInstructionBuilder` [Getter]
- `setSendingParty(Party arg0)` → `BillingInstructionBuilder` [Setter]
- `setReceivingParty(Party arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateReceivingParty()` → `PartyBuilder` [Getter]
- `getBillingSummary()` → `List` [Getter]
- `getReceivingParty()` → `PartyBuilder` [Getter]

### BillingRecord
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingRecord` [Builder]
- `getRecordEndDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getMinimumFee()` → `Money` [Getter]
- `getRecordTransfer()` → `Transfer` [Getter]

### BillingRecordBuilder
**Implements:** `BillingRecord` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getMinimumFee()` → `MoneyBuilder` [Getter]
- `getRecordTransfer()` → `TransferBuilder` [Getter]
- `setRecordEndDate(Date arg0)` → `BillingRecordBuilder` [Setter]
- `setMinimumFee(Money arg0)` → `BillingRecordBuilder` [Setter]
- `getOrCreateTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreateRecordTransfer()` → `TransferBuilder` [Getter]
- `setRecordTransfer(Transfer arg0)` → `BillingRecordBuilder` [Setter]
- `getOrCreateMinimumFee()` → `MoneyBuilder` [Getter]
- `setTradeState(ReferenceWithMetaTradeState arg0)` → `BillingRecordBuilder` [Setter]

### BillingRecordInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingRecordInstruction` [Builder]
- `getSettlementDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getObservation()` → `List` [Getter]
- `getRecordStartDate()` → `Date` [Getter]

### BillingRecordInstructionBuilder
**Implements:** `BillingRecordInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateObservation(int arg0)` → `ObservationBuilder` [Getter]
- `setObservation(List arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setSettlementDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getObservation()` → `List` [Getter]
- `setRecordEndDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `getOrCreateTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `setTradeState(ReferenceWithMetaTradeState arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setTradeStateValue(TradeState arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `setRecordStartDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]

### BillingSummary
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BillingSummary` [Builder]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]
- `getSummaryTransfer()` → `Transfer` [Getter]

### BillingSummaryBuilder
**Implements:** `BillingSummary` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateSummaryTransfer()` → `TransferBuilder` [Getter]
- `setSummaryTransfer(Transfer arg0)` → `BillingSummaryBuilder` [Setter]
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
- `getAfter()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### BusinessEventBuilder
**Implements:** `BusinessEvent` `EventInstruction$EventInstructionBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setIntent(EventIntentEnum arg0)` → `BusinessEventBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `BusinessEventBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setEventDate(Date arg0)` → `BusinessEventBuilder` [Setter]
- `getOrCreateAfter(int arg0)` → `TradeStateBuilder` [Getter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `BusinessEventBuilder` [Setter]
- `setEventQualifier(String arg0)` → `BusinessEventBuilder` [Setter]
- `setPackageInformation(IdentifiedList arg0)` → `BusinessEventBuilder` [Setter]
- `setInstruction(List arg0)` → `BusinessEventBuilder` [Setter]
- `getAfter()` → `List` [Getter]

### CalculateTransferInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculateTransferInstruction` [Builder]
- `getDate()` → `Date` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getQuantity()` → `Quantity` [Getter]
- `getTradeState()` → `TradeState` [Getter]
- `getResets()` → `List` [Getter]
- `getPayout()` → `ReferenceWithMetaPayout` [Getter]

### CalculateTransferInstructionBuilder
**Implements:** `CalculateTransferInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDate(Date arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `setPayout(ReferenceWithMetaPayout arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `setPayoutValue(Payout arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getOrCreatePayout()` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getQuantity()` → `QuantityBuilder` [Getter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(Quantity arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `CalculateTransferInstructionBuilder` [Setter]

### ClearingInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ClearingInstruction` [Builder]
- `getAlphaContract()` → `TradeState` [Getter]
- `getClearingParty()` → `Party` [Getter]
- `getClearerParty1()` → `Party` [Getter]
- `getClearerParty2()` → `Party` [Getter]
- `getIsOpenOffer()` → `Boolean` [Getter]
- `getParty1()` → `Party` [Getter]
- `getParty2()` → `Party` [Getter]

### ClearingInstructionBuilder
**Implements:** `ClearingInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAlphaContract()` → `TradeStateBuilder` [Getter]
- `getAlphaContract()` → `TradeStateBuilder` [Getter]
- `getClearingParty()` → `PartyBuilder` [Getter]
- `getOrCreateParty1()` → `PartyBuilder` [Getter]
- `getOrCreateParty2()` → `PartyBuilder` [Getter]
- `getClearerParty1()` → `PartyBuilder` [Getter]
- `getOrCreateClearerParty2()` → `PartyBuilder` [Getter]
- `getOrCreateClearerParty1()` → `PartyBuilder` [Getter]
- `getClearerParty2()` → `PartyBuilder` [Getter]
- `setAlphaContract(TradeState arg0)` → `ClearingInstructionBuilder` [Setter]

### CollateralBalance
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralBalance` [Builder]
- `getAmountBaseCurrency()` → `Money` [Getter]
- `getCollateralBalanceStatus()` → `CollateralStatusEnum` [Getter]
- `getHaircutIndicator()` → `HaircutIndicatorEnum` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]

### CollateralBalanceBuilder
**Implements:** `CollateralBalance` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setCollateralBalanceStatus(CollateralStatusEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `setAmountBaseCurrency(Money arg0)` → `CollateralBalanceBuilder` [Setter]
- `setHaircutIndicator(HaircutIndicatorEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `CollateralBalanceBuilder` [Setter]
- `getOrCreateAmountBaseCurrency()` → `MoneyBuilder` [Getter]

### CollateralPortfolio
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralPortfolio` [Builder]
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreement` [Getter]
- `getPortfolioIdentifier()` → `Identifier` [Getter]
- `getCollateralBalance()` → `List` [Getter]
- `getCollateralPosition()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### CollateralPortfolioBuilder
**Implements:** `CollateralPortfolio` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `getPortfolioIdentifier()` → `IdentifierBuilder` [Getter]
- `getCollateralBalance()` → `List` [Getter]
- `getOrCreateLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `setCollateralPosition(List arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setPortfolioIdentifier(Identifier arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setCollateralBalance(List arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setLegalAgreementValue(LegalAgreement arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setLegalAgreement(ReferenceWithMetaLegalAgreement arg0)` → `CollateralPortfolioBuilder` [Setter]
- `getCollateralPosition()` → `List` [Getter]

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
- `setProduct(Product arg0)` → `CollateralPositionBuilder` [Setter]
- `getTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `getOrCreateTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setCashBalance(Money arg0)` → `CollateralPositionBuilder` [Setter]
- `setTreatment(CollateralTreatment arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReferenceValue(TradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `setCollateralPositionStatus(CollateralStatusEnum arg0)` → `CollateralPositionBuilder` [Setter]

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
- `getOrCreateDocumentation(int arg0)` → `LegalAgreementBuilder` [Getter]
- `setGoverningLawValue(GoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `setDocumentation(List arg0)` → `ContractDetailsBuilder` [Setter]
- `getGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `setGoverningLaw(FieldWithMetaGoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `getOrCreateGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ContractDetailsBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ContractFormationInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ContractFormationInstruction` [Builder]
- `getLegalAgreement()` → `List` [Getter]

### ContractFormationInstructionBuilder
**Implements:** `ContractFormationInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getLegalAgreement()` → `List` [Getter]
- `getOrCreateLegalAgreement(int arg0)` → `LegalAgreementBuilder` [Getter]
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
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
- `getEventDate()` → `Date` [Getter]
- `getAfter()` → `List` [Getter]
- `getIntent()` → `PositionEventIntentEnum` [Getter]

### CounterpartyPositionBusinessEventBuilder
**Implements:** `CounterpartyPositionBusinessEvent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setIntent(PositionEventIntentEnum arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `setEventDate(Date arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getOrCreateAfter(int arg0)` → `CounterpartyPositionStateBuilder` [Getter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getOrCreatePackageInformation()` → `IdentifiedListBuilder` [Getter]
- `setPackageInformation(IdentifiedList arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getAfter()` → `List` [Getter]
- `setAfter(List arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]

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
- `setCounterpartyPosition(CounterpartyPosition arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getObservationHistory()` → `List` [Getter]
- `setObservationHistory(List arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `getValuationHistory()` → `List` [Getter]
- `getCounterpartyPosition()` → `CounterpartyPositionBuilder` [Getter]
- `setValuationHistory(List arg0)` → `CounterpartyPositionStateBuilder` [Setter]

### CreditEvent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditEvent` [Builder]
- `getEventDeterminationDate()` → `Date` [Getter]
- `getRecoveryPercent()` → `BigDecimal` [Getter]
- `getAuctionDate()` → `Date` [Getter]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `getCreditEventType()` → `CreditEventTypeEnum` [Getter]
- `getFinalPrice()` → `Price` [Getter]
- `getPubliclyAvailableInformation()` → `List` [Getter]

### CreditEventBuilder
**Implements:** `CreditEvent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setReferenceInformation(ReferenceInformation arg0)` → `CreditEventBuilder` [Setter]
- `getOrCreateFinalPrice()` → `PriceBuilder` [Getter]
- `setAuctionDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setFinalPrice(Price arg0)` → `CreditEventBuilder` [Setter]
- `setRecoveryPercent(BigDecimal arg0)` → `CreditEventBuilder` [Setter]
- `setEventDeterminationDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setCreditEventType(CreditEventTypeEnum arg0)` → `CreditEventBuilder` [Setter]
- `getReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `getFinalPrice()` → `PriceBuilder` [Getter]
- `getOrCreatePubliclyAvailableInformation(int arg0)` → `ResourceBuilder` [Getter]

### ExecutionDetails
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExecutionDetails` [Builder]
- `getPackageReference()` → `IdentifiedList` [Getter]
- `getExecutionType()` → `ExecutionTypeEnum` [Getter]
- `getExecutionVenue()` → `LegalEntity` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExecutionDetailsBuilder
**Implements:** `ExecutionDetails` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getPackageReference()` → `IdentifiedListBuilder` [Getter]
- `getExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setExecutionType(ExecutionTypeEnum arg0)` → `ExecutionDetailsBuilder` [Setter]
- `getOrCreateExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `setExecutionVenue(LegalEntity arg0)` → `ExecutionDetailsBuilder` [Setter]
- `setPackageReference(IdentifiedList arg0)` → `ExecutionDetailsBuilder` [Setter]
- `getOrCreatePackageReference()` → `IdentifiedListBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ExecutionDetailsBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ExecutionInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExecutionInstruction` [Builder]
- `getPartyRoles()` → `List` [Getter]
- `getParties()` → `List` [Getter]
- `getLotIdentifier()` → `Identifier` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getCounterparty()` → `List` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]

### ExecutionInstructionBuilder
**Implements:** `ExecutionInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePartyRoles(int arg0)` → `PartyRoleBuilder` [Getter]
- `setExecutionDetails(ExecutionDetails arg0)` → `ExecutionInstructionBuilder` [Setter]
- `getOrCreateParties(int arg0)` → `PartyBuilder` [Getter]
- `getOrCreateTradeIdentifier(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `getOrCreateTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `setTradeDateValue(Date arg0)` → `ExecutionInstructionBuilder` [Setter]
- `setCounterparty(List arg0)` → `ExecutionInstructionBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `ExecutionInstructionBuilder` [Setter]
- `getOrCreateCollateral()` → `CollateralBuilder` [Getter]

### ExerciseEvent
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseEvent` [Builder]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedRelevantSwapEffectiveDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
- `getAdjustedExerciseDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ExerciseEventBuilder
**Implements:** `ExerciseEvent` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAdjustedRelevantSwapEffectiveDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedExerciseDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `ExerciseEventBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ExerciseInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ExerciseInstruction` [Builder]
- `getExerciseQuantity()` → `PrimitiveInstruction` [Getter]
- `getExerciseDate()` → `AdjustableOrAdjustedDate` [Getter]
- `getExerciseOption()` → `ReferenceWithMetaOptionPayout` [Getter]
- `getExerciseTime()` → `BusinessCenterTime` [Getter]
- `getReplacementTradeIdentifier()` → `List` [Getter]

### ExerciseInstructionBuilder
**Implements:** `ExerciseInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getExerciseQuantity()` → `PrimitiveInstructionBuilder` [Getter]
- `setExerciseQuantity(PrimitiveInstruction arg0)` → `ExerciseInstructionBuilder` [Setter]
- `getExerciseDate()` → `AdjustableOrAdjustedDateBuilder` [Getter]
- `getExerciseOption()` → `ReferenceWithMetaOptionPayoutBuilder` [Getter]
- `getExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateExerciseDate()` → `AdjustableOrAdjustedDateBuilder` [Getter]
- `getOrCreateExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setExerciseOption(ReferenceWithMetaOptionPayout arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseTime(BusinessCenterTime arg0)` → `ExerciseInstructionBuilder` [Setter]
- `getOrCreateExerciseOption()` → `ReferenceWithMetaOptionPayoutBuilder` [Getter]

### Exposure
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Exposure` [Builder]
- `getAggregateValue()` → `Money` [Getter]
- `getValuationDateTime()` → `ZonedDateTime` [Getter]
- `getCalculationDateTime()` → `ZonedDateTime` [Getter]
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioState` [Getter]

### ExposureBuilder
**Implements:** `Exposure` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAggregateValue()` → `MoneyBuilder` [Getter]
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `getOrCreateAggregateValue()` → `MoneyBuilder` [Getter]
- `getOrCreateTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `setAggregateValue(Money arg0)` → `ExposureBuilder` [Setter]
- `setCalculationDateTime(ZonedDateTime arg0)` → `ExposureBuilder` [Setter]
- `setTradePortfolio(ReferenceWithMetaPortfolioState arg0)` → `ExposureBuilder` [Setter]
- `setValuationDateTime(ZonedDateTime arg0)` → `ExposureBuilder` [Setter]
- `setTradePortfolioValue(PortfolioState arg0)` → `ExposureBuilder` [Setter]

### IndexTransitionInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `IndexTransitionInstruction` [Builder]
- `getCashTransfer()` → `Transfer` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getEffectiveDate()` → `Date` [Getter]

### IndexTransitionInstructionBuilder
**Implements:** `IndexTransitionInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCashTransfer(Transfer arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getOrCreateCashTransfer()` → `TransferBuilder` [Getter]
- `setEffectiveDate(Date arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getCashTransfer()` → `TransferBuilder` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `IndexTransitionInstructionBuilder` [Setter]

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
- `setPrimitiveInstruction(PrimitiveInstruction arg0)` → `InstructionBuilder` [Setter]
- `getOrCreateBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `setBeforeValue(TradeState arg0)` → `InstructionBuilder` [Setter]
- `getBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreatePrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]
- `getPrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]

### Lineage
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Lineage` [Builder]
- `getTradeReference()` → `List` [Getter]
- `getPortfolioStateReference()` → `List` [Getter]
- `getEventReference()` → `List` [Getter]

### LineageBuilder
**Implements:** `Lineage` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeBuilder` [Getter]
- `getTradeReference()` → `List` [Getter]
- `setTradeReference(List arg0)` → `LineageBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getOrCreatePortfolioStateReference(int arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `setPortfolioStateReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getOrCreateEventReference(int arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Getter]
- `setPortfolioStateReference(List arg0)` → `LineageBuilder` [Setter]
- `getPortfolioStateReference()` → `List` [Getter]
- `setEventReferenceValue(List arg0)` → `LineageBuilder` [Setter]

### MarginCallBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallBase` [Builder]
- `getCollateralPortfolio()` → `ReferenceWithMetaCollateralPortfolio` [Getter]
- `getRegIMRole()` → `RegIMRoleEnum` [Getter]
- `getBaseCurrencyExposure()` → `MarginCallExposure` [Getter]
- `getClearingBroker()` → `Party` [Getter]
- `getCallAgreementType()` → `AgreementName` [Getter]
- `getAgreementThreshold()` → `Money` [Getter]
- `getAgreementRounding()` → `Money` [Getter]
- `getRegMarginType()` → `RegMarginTypeEnum` [Getter]

### MarginCallBaseBuilder
**Implements:** `MarginCallBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPartyRole(List arg0)` → `MarginCallBaseBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `getCollateralPortfolio()` → `ReferenceWithMetaCollateralPortfolioBuilder` [Getter]
- `getBaseCurrencyExposure()` → `MarginCallExposureBuilder` [Getter]
- `getClearingBroker()` → `PartyBuilder` [Getter]
- `getCallAgreementType()` → `AgreementNameBuilder` [Getter]
- `getAgreementThreshold()` → `MoneyBuilder` [Getter]
- `getAgreementRounding()` → `MoneyBuilder` [Getter]
- `getCallIdentifier()` → `IdentifierBuilder` [Getter]
- `getInstructionType()` → `MarginCallInstructionTypeBuilder` [Getter]

### MarginCallExposure
**Implements:** `MarginCallBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallExposure` [Builder]
- `getSimmIMExposure()` → `Exposure` [Getter]
- `getScheduleGridIMExposure()` → `Exposure` [Getter]
- `getOverallExposure()` → `Exposure` [Getter]

### MarginCallExposureBuilder
**Implements:** `MarginCallExposure` `MarginCallBase$MarginCallBaseBuilder` 

**Key Methods:**
- `setPartyRole(List arg0)` → `MarginCallExposureBuilder` [Setter]
- `getSimmIMExposure()` → `ExposureBuilder` [Getter]
- `getScheduleGridIMExposure()` → `ExposureBuilder` [Getter]
- `getOverallExposure()` → `ExposureBuilder` [Getter]
- `setAgreementMinimumTransferAmount(Money arg0)` → `MarginCallExposureBuilder` [Setter]
- `getOrCreateScheduleGridIMExposure()` → `ExposureBuilder` [Getter]
- `setIndependentAmountBalance(CollateralBalance arg0)` → `MarginCallExposureBuilder` [Setter]
- `setCollateralPortfolioValue(CollateralPortfolio arg0)` → `MarginCallExposureBuilder` [Setter]
- `getOrCreateOverallExposure()` → `ExposureBuilder` [Getter]
- `setCallIdentifier(Identifier arg0)` → `MarginCallExposureBuilder` [Setter]

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
- `setCallType(CallTypeEnum arg0)` → `MarginCallInstructionTypeBuilder` [Setter]
- `setVisibilityIndicator(Boolean arg0)` → `MarginCallInstructionTypeBuilder` [Setter]

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
- `setPartyRole(List arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setAgreementMinimumTransferAmount(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setIndependentAmountBalance(CollateralBalance arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setCollateralPortfolioValue(CollateralPortfolio arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getOrCreateCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setCallAmountInBaseCurrency(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getRecallNonCashCollateralDescription()` → `List` [Getter]
- `setRecallNonCashCollateralDescription(List arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setCallIdentifier(Identifier arg0)` → `MarginCallIssuanceBuilder` [Setter]

### MarginCallResponse
**Implements:** `MarginCallBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MarginCallResponse` [Builder]
- `getAgreedAmountBaseCurrency()` → `Money` [Getter]
- `getMarginCallResponseAction()` → `List` [Getter]
- `getMarginResponseType()` → `MarginCallResponseTypeEnum` [Getter]

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
- `setCollateralPositionComponent(List arg0)` → `MarginCallResponseActionBuilder` [Setter]
- `getOrCreateCollateralPositionComponent(int arg0)` → `CollateralPositionBuilder` [Getter]
- `getCollateralPositionComponent()` → `List` [Getter]
- `setMarginCallAction(MarginCallActionEnum arg0)` → `MarginCallResponseActionBuilder` [Setter]

### MarginCallResponseBuilder
**Implements:** `MarginCallResponse` `MarginCallBase$MarginCallBaseBuilder` 

**Key Methods:**
- `setPartyRole(List arg0)` → `MarginCallResponseBuilder` [Setter]
- `setAgreementMinimumTransferAmount(Money arg0)` → `MarginCallResponseBuilder` [Setter]
- `setIndependentAmountBalance(CollateralBalance arg0)` → `MarginCallResponseBuilder` [Setter]
- `setCollateralPortfolioValue(CollateralPortfolio arg0)` → `MarginCallResponseBuilder` [Setter]
- `getOrCreateMarginCallResponseAction(int arg0)` → `MarginCallResponseActionBuilder` [Getter]
- `setMarginCallResponseAction(List arg0)` → `MarginCallResponseBuilder` [Setter]
- `getAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `getOrCreateAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setAgreedAmountBaseCurrency(Money arg0)` → `MarginCallResponseBuilder` [Setter]
- `getMarginCallResponseAction()` → `List` [Getter]

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
- `getOrCreateCorporateAction()` → `CorporateActionBuilder` [Getter]
- `getCreditEvent()` → `CreditEventBuilder` [Getter]
- `getOrCreateCreditEvent()` → `CreditEventBuilder` [Getter]
- `setCreditEvent(CreditEvent arg0)` → `ObservationEventBuilder` [Setter]
- `setCorporateAction(CorporateAction arg0)` → `ObservationEventBuilder` [Setter]
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
- `setObservationEvent(ObservationEvent arg0)` → `ObservationInstructionBuilder` [Setter]
- `getObservationEvent()` → `ObservationEventBuilder` [Getter]
- `getOrCreateObservationEvent()` → `ObservationEventBuilder` [Getter]

### PartyChangeInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PartyChangeInstruction` [Builder]
- `getTradeId()` → `List` [Getter]
- `getCounterparty()` → `Counterparty` [Getter]
- `getPartyRole()` → `PartyRole` [Getter]
- `getAncillaryParty()` → `AncillaryParty` [Getter]

### PartyChangeInstructionBuilder
**Implements:** `PartyChangeInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getTradeId()` → `List` [Getter]
- `setTradeId(List arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateAncillaryParty()` → `AncillaryPartyBuilder` [Getter]
- `setCounterparty(Counterparty arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateCounterparty()` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(AncillaryParty arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateTradeId(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `setPartyRole(PartyRole arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreatePartyRole()` → `PartyRoleBuilder` [Getter]
- `getCounterparty()` → `CounterpartyBuilder` [Getter]

### PositionIdentifier
**Implements:** `Identifier` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PositionIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]

### PositionIdentifierBuilder
**Implements:** `PositionIdentifier` `Identifier$IdentifierBuilder` 

**Key Methods:**
- `setIssuer(FieldWithMetaString arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `PositionIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `PositionIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `PositionIdentifierBuilder` [Setter]

### PrimitiveInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PrimitiveInstruction` [Builder]
- `getSplit()` → `SplitInstruction` [Getter]
- `getReset()` → `ResetInstruction` [Getter]
- `getIndexTransition()` → `IndexTransitionInstruction` [Getter]
- `getStockSplit()` → `StockSplitInstruction` [Getter]
- `getTermsChange()` → `TermsChangeInstruction` [Getter]
- `getQuantityChange()` → `QuantityChangeInstruction` [Getter]
- `getContractFormation()` → `ContractFormationInstruction` [Getter]
- `getExercise()` → `ExerciseInstruction` [Getter]

### PrimitiveInstructionBuilder
**Implements:** `PrimitiveInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSplit()` → `SplitInstructionBuilder` [Getter]
- `setReset(ResetInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `getReset()` → `ResetInstructionBuilder` [Getter]
- `setSplit(SplitInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `setValuation(ValuationInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `getOrCreateValuation()` → `ValuationInstructionBuilder` [Getter]
- `getOrCreateQuantityChange()` → `QuantityChangeInstructionBuilder` [Getter]
- `getOrCreateSplit()` → `SplitInstructionBuilder` [Getter]
- `getOrCreateReset()` → `ResetInstructionBuilder` [Getter]
- `getOrCreateIndexTransition()` → `IndexTransitionInstructionBuilder` [Getter]

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
- `setChange(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `setDirection(QuantityChangeDirectionEnum arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getOrCreateChange(int arg0)` → `PriceQuantityBuilder` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `getChange()` → `List` [Getter]

### Reset
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Reset` [Builder]
- `getRateRecordDate()` → `Date` [Getter]
- `getObservations()` → `List` [Getter]
- `getResetValue()` → `Price` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getAveragingMethodology()` → `AveragingCalculation` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ResetBuilder
**Implements:** `Reset` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateAveragingMethodology()` → `AveragingCalculationBuilder` [Getter]
- `getObservations()` → `List` [Getter]
- `getResetValue()` → `PriceBuilder` [Getter]
- `getAveragingMethodology()` → `AveragingCalculationBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAveragingMethodology(AveragingCalculation arg0)` → `ResetBuilder` [Setter]
- `getOrCreateResetValue()` → `PriceBuilder` [Getter]
- `getOrCreateObservations(int arg0)` → `ReferenceWithMetaObservationBuilder` [Getter]
- `setObservationsValue(List arg0)` → `ResetBuilder` [Setter]
- `setResetValue(Price arg0)` → `ResetBuilder` [Setter]

### ResetInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResetInstruction` [Builder]
- `getRateRecordDate()` → `Date` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getPayout()` → `List` [Getter]

### ResetInstructionBuilder
**Implements:** `ResetInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPayout(List arg0)` → `ResetInstructionBuilder` [Setter]
- `setPayoutValue(List arg0)` → `ResetInstructionBuilder` [Setter]
- `getOrCreatePayout(int arg0)` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `setRateRecordDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `setResetDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `getPayout()` → `List` [Getter]

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
- `getOrCreateQuantity(int arg0)` → `QuantityBuilder` [Getter]
- `setQuantity(List arg0)` → `ReturnInstructionBuilder` [Setter]

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
- `getBillingStartDate()` → `Date` [Getter]
- `getBillingRecord()` → `List` [Getter]
- `getBillingSummary()` → `List` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getSendingParty()` → `Party` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### SecurityLendingInvoiceBuilder
**Implements:** `SecurityLendingInvoice` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setBillingSummary(List arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `setBillingRecord(List arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setBillingEndDate(Date arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `getOrCreateSendingParty()` → `PartyBuilder` [Getter]
- `setBillingStartDate(Date arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `getOrCreateBillingRecord(int arg0)` → `BillingRecordBuilder` [Getter]
- `getOrCreateBillingSummary(int arg0)` → `BillingSummaryBuilder` [Getter]
- `setSendingParty(Party arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `setReceivingParty(Party arg0)` → `SecurityLendingInvoiceBuilder` [Setter]

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
- `setClosedState(ClosedState arg0)` → `StateBuilder` [Setter]
- `setPositionState(PositionStatusEnum arg0)` → `StateBuilder` [Setter]
- `getOrCreateClosedState()` → `ClosedStateBuilder` [Getter]
- `getClosedState()` → `ClosedStateBuilder` [Getter]

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
- `setEffectiveDate(Date arg0)` → `StockSplitInstructionBuilder` [Setter]
- `setAdjustmentRatio(BigDecimal arg0)` → `StockSplitInstructionBuilder` [Setter]

### TermsChangeInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TermsChangeInstruction` [Builder]
- `getAncillaryParty()` → `List` [Getter]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getProduct()` → `NonTransferableProduct` [Getter]

### TermsChangeInstructionBuilder
**Implements:** `TermsChangeInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `setAdjustment(NotionalAdjustmentEnum arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `getOrCreateProduct()` → `NonTransferableProductBuilder` [Getter]
- `setProduct(NonTransferableProduct arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `getAncillaryParty()` → `List` [Getter]
- `getProduct()` → `NonTransferableProductBuilder` [Getter]

### Trade
**Implements:** `TradableProduct` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Trade` [Builder]
- `getClearedDate()` → `Date` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]
- `getContractDetails()` → `ContractDetails` [Getter]
- `getTradeDate()` → `FieldWithMetaDate` [Getter]
- `getCollateral()` → `Collateral` [Getter]
- `getExecutionDetails()` → `ExecutionDetails` [Getter]

### TradeBuilder
**Implements:** `Trade` `TradableProduct$TradableProductBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setExecutionDetails(ExecutionDetails arg0)` → `TradeBuilder` [Setter]
- `getOrCreateTradeIdentifier(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `getOrCreateTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `setTradeDateValue(Date arg0)` → `TradeBuilder` [Setter]
- `setCounterparty(List arg0)` → `TradeBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `TradeBuilder` [Setter]
- `getOrCreateCollateral()` → `CollateralBuilder` [Getter]
- `setTradeIdentifier(List arg0)` → `TradeBuilder` [Setter]
- `getOrCreateTradeDate()` → `FieldWithMetaDateBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TradeBuilder` [Setter]

### TradeIdentifier
**Implements:** `Identifier` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TradeIdentifier` [Builder]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]

### TradeIdentifierBuilder
**Implements:** `TradeIdentifier` `Identifier$IdentifierBuilder` 

**Key Methods:**
- `setIssuer(FieldWithMetaString arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `TradeIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `TradeIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `TradeIdentifierBuilder` [Setter]

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
- `getPricingTime()` → `TimeZoneBuilder` [Getter]
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `setPricingTime(TimeZone arg0)` → `TradePricingReportBuilder` [Setter]
- `setDiscountingIndex(FloatingRateIndexEnum arg0)` → `TradePricingReportBuilder` [Setter]
- `getOrCreatePricingTime()` → `TimeZoneBuilder` [Getter]
- `getTrade()` → `TradeBuilder` [Getter]
- `setTrade(Trade arg0)` → `TradePricingReportBuilder` [Setter]

### TradeState
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getState()` → `State` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `TradeState` [Builder]
- `getResetHistory()` → `List` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `getObservationHistory()` → `List` [Getter]
- `getValuationHistory()` → `List` [Getter]
- `getTrade()` → `Trade` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### TradeStateBuilder
**Implements:** `TradeState` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getState()` → `StateBuilder` [Getter]
- `setState(State arg0)` → `TradeStateBuilder` [Setter]
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `getResetHistory()` → `List` [Getter]
- `getOrCreateResetHistory(int arg0)` → `ResetBuilder` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `getOrCreateTransferHistory(int arg0)` → `TransferStateBuilder` [Getter]
- `getObservationHistory()` → `List` [Getter]

### Transfer
**Implements:** `AssetFlowBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Transfer` [Builder]
- `getResetOrigin()` → `Reset` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `getSettlementOrigin()` → `ReferenceWithMetaPayout` [Getter]
- `getTransferExpression()` → `TransferExpression` [Getter]
- `getIdentifier()` → `List` [Getter]

### TransferBuilder
**Implements:** `Transfer` `AssetFlowBase$AssetFlowBaseBuilder` 

**Key Methods:**
- `getResetOrigin()` → `ResetBuilder` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getSettlementOrigin()` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `getTransferExpression()` → `TransferExpressionBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `TransferBuilder` [Setter]
- `getOrCreateIdentifier(int arg0)` → `FieldWithMetaIdentifierBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setIdentifier(List arg0)` → `TransferBuilder` [Setter]
- `setQuantity(NonNegativeQuantity arg0)` → `TransferBuilder` [Setter]
- `setIdentifierValue(List arg0)` → `TransferBuilder` [Setter]

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
- `getOrCreateTransferState(int arg0)` → `TransferStateBuilder` [Getter]
- `setTransferState(List arg0)` → `TransferInstructionBuilder` [Setter]

### TransferState
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransferState` [Builder]
- `getTransfer()` → `Transfer` [Getter]
- `getTransferStatus()` → `TransferStatusEnum` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### TransferStateBuilder
**Implements:** `TransferState` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getTransfer()` → `TransferBuilder` [Getter]
- `setTransferStatus(TransferStatusEnum arg0)` → `TransferStateBuilder` [Setter]
- `getOrCreateTransfer()` → `TransferBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setTransfer(Transfer arg0)` → `TransferStateBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `TransferStateBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### Valuation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getMethod()` → `ValuationTypeEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `Valuation` [Builder]
- `getTimestamp()` → `ZonedDateTime` [Getter]
- `getSource()` → `ValuationSourceEnum` [Getter]
- `getPriceComponent()` → `Price` [Getter]
- `getValuationTiming()` → `PriceTimingEnum` [Getter]
- `getDelta()` → `BigDecimal` [Getter]
- `getAmount()` → `Money` [Getter]

### ValuationBuilder
**Implements:** `Valuation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMethod(ValuationTypeEnum arg0)` → `ValuationBuilder` [Setter]
- `setTimestamp(ZonedDateTime arg0)` → `ValuationBuilder` [Setter]
- `getOrCreateAmount()` → `MoneyBuilder` [Getter]
- `getPriceComponent()` → `PriceBuilder` [Getter]
- `getOrCreatePriceComponent()` → `PriceBuilder` [Getter]
- `setValuationTiming(PriceTimingEnum arg0)` → `ValuationBuilder` [Setter]
- `setPriceComponent(Price arg0)` → `ValuationBuilder` [Setter]
- `setSource(ValuationSourceEnum arg0)` → `ValuationBuilder` [Setter]
- `setDelta(BigDecimal arg0)` → `ValuationBuilder` [Setter]
- `setAmount(Money arg0)` → `ValuationBuilder` [Setter]

### ValuationInstruction
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationInstruction` [Builder]
- `getValuation()` → `List` [Getter]
- `getReplace()` → `Boolean` [Getter]

### ValuationInstructionBuilder
**Implements:** `ValuationInstruction` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setValuation(List arg0)` → `ValuationInstructionBuilder` [Setter]
- `getOrCreateValuation(int arg0)` → `ValuationBuilder` [Getter]
- `getValuation()` → `List` [Getter]
- `setReplace(Boolean arg0)` → `ValuationInstructionBuilder` [Setter]

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
- `setBillingSummary(List arg0)` → `BillingInstructionBuilder` [Setter]
- `setBillingEndDate(Date arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateSendingParty()` → `PartyBuilder` [Getter]
- `setBillingStartDate(Date arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateBillingSummary(int arg0)` → `BillingSummaryInstructionBuilder` [Getter]
- `setSendingParty(Party arg0)` → `BillingInstructionBuilder` [Setter]
- `setReceivingParty(Party arg0)` → `BillingInstructionBuilder` [Setter]
- `getOrCreateReceivingParty()` → `PartyBuilder` [Getter]
- `getBillingStartDate()` → `Date` [Getter]

### BillingInstructionImpl
**Implements:** `BillingInstruction` 

**Key Methods:**
- `build()` → `BillingInstruction` [Builder]
- `setBuilderFields(BillingInstructionBuilder arg0)` → `void` [Setter]
- `getBillingStartDate()` → `Date` [Getter]
- `getBillingSummary()` → `List` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getSendingParty()` → `Party` [Getter]
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
- `getRecordEndDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getMinimumFee()` → `MoneyBuilder` [Getter]
- `getRecordTransfer()` → `TransferBuilder` [Getter]
- `setRecordEndDate(Date arg0)` → `BillingRecordBuilder` [Setter]
- `setMinimumFee(Money arg0)` → `BillingRecordBuilder` [Setter]
- `getOrCreateTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreateRecordTransfer()` → `TransferBuilder` [Getter]

### BillingRecordImpl
**Implements:** `BillingRecord` 

**Key Methods:**
- `build()` → `BillingRecord` [Builder]
- `getRecordEndDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `getMinimumFee()` → `Money` [Getter]
- `getRecordTransfer()` → `Transfer` [Getter]
- `setBuilderFields(BillingRecordBuilder arg0)` → `void` [Setter]

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
- `getOrCreateObservation(int arg0)` → `ObservationBuilder` [Getter]
- `setObservation(List arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `getSettlementDate()` → `Date` [Getter]
- `setSettlementDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]
- `getRecordEndDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getObservation()` → `List` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `setRecordEndDate(Date arg0)` → `BillingRecordInstructionBuilder` [Setter]

### BillingRecordInstructionImpl
**Implements:** `BillingRecordInstruction` 

**Key Methods:**
- `build()` → `BillingRecordInstruction` [Builder]
- `getSettlementDate()` → `Date` [Getter]
- `getRecordEndDate()` → `Date` [Getter]
- `getTradeState()` → `ReferenceWithMetaTradeState` [Getter]
- `getObservation()` → `List` [Getter]
- `getRecordStartDate()` → `Date` [Getter]
- `setBuilderFields(BillingRecordInstructionBuilder arg0)` → `void` [Setter]

### BillingSummaryBuilderImpl
**Implements:** `BillingSummary$BillingSummaryBuilder` 

**Fields:**
- `TransferBuilder summaryTransfer`
- `RecordAmountTypeEnum summaryAmountType`

**Key Methods:**
- `build()` → `BillingSummary` [Builder]
- `getOrCreateSummaryTransfer()` → `TransferBuilder` [Getter]
- `setSummaryTransfer(Transfer arg0)` → `BillingSummaryBuilder` [Setter]
- `setSummaryAmountType(RecordAmountTypeEnum arg0)` → `BillingSummaryBuilder` [Setter]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]
- `getSummaryTransfer()` → `TransferBuilder` [Getter]

### BillingSummaryImpl
**Implements:** `BillingSummary` 

**Key Methods:**
- `build()` → `BillingSummary` [Builder]
- `setBuilderFields(BillingSummaryBuilder arg0)` → `void` [Setter]
- `getSummaryAmountType()` → `RecordAmountTypeEnum` [Getter]
- `getSummaryTransfer()` → `Transfer` [Getter]

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
- `setIntent(EventIntentEnum arg0)` → `BusinessEventBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `BusinessEventBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setEventDate(Date arg0)` → `BusinessEventBuilder` [Setter]
- `getOrCreateAfter(int arg0)` → `TradeStateBuilder` [Getter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `BusinessEventBuilder` [Setter]
- `getEventQualifier()` → `String` [Getter]
- `setEventQualifier(String arg0)` → `BusinessEventBuilder` [Setter]
- `setPackageInformation(IdentifiedList arg0)` → `BusinessEventBuilder` [Setter]

### BusinessEventImpl
**Extends:** `EventInstruction$EventInstructionImpl` 
**Implements:** `BusinessEvent` 

**Key Methods:**
- `build()` → `BusinessEvent` [Builder]
- `setBuilderFields(BusinessEventBuilder arg0)` → `void` [Setter]
- `getEventQualifier()` → `String` [Getter]
- `getAfter()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

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
- `setPayout(ReferenceWithMetaPayout arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `setPayoutValue(Payout arg0)` → `CalculateTransferInstructionBuilder` [Setter]
- `getOrCreatePayout()` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getQuantity()` → `QuantityBuilder` [Getter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]

### CalculateTransferInstructionImpl
**Implements:** `CalculateTransferInstruction` 

**Key Methods:**
- `build()` → `CalculateTransferInstruction` [Builder]
- `getDate()` → `Date` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getQuantity()` → `Quantity` [Getter]
- `getTradeState()` → `TradeState` [Getter]
- `setBuilderFields(CalculateTransferInstructionBuilder arg0)` → `void` [Setter]
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
- `getOrCreateAlphaContract()` → `TradeStateBuilder` [Getter]
- `getAlphaContract()` → `TradeStateBuilder` [Getter]
- `getClearingParty()` → `PartyBuilder` [Getter]
- `getOrCreateParty1()` → `PartyBuilder` [Getter]
- `getOrCreateParty2()` → `PartyBuilder` [Getter]
- `getClearerParty1()` → `PartyBuilder` [Getter]
- `getOrCreateClearerParty2()` → `PartyBuilder` [Getter]
- `getOrCreateClearerParty1()` → `PartyBuilder` [Getter]
- `getClearerParty2()` → `PartyBuilder` [Getter]

### ClearingInstructionImpl
**Implements:** `ClearingInstruction` 

**Key Methods:**
- `build()` → `ClearingInstruction` [Builder]
- `getAlphaContract()` → `TradeState` [Getter]
- `getClearingParty()` → `Party` [Getter]
- `getClearerParty1()` → `Party` [Getter]
- `getClearerParty2()` → `Party` [Getter]
- `getIsOpenOffer()` → `Boolean` [Getter]
- `setBuilderFields(ClearingInstructionBuilder arg0)` → `void` [Setter]
- `getParty1()` → `Party` [Getter]
- `getParty2()` → `Party` [Getter]

### CollateralBalanceBuilderImpl
**Implements:** `CollateralBalance$CollateralBalanceBuilder` 

**Fields:**
- `CollateralStatusEnum collateralBalanceStatus`
- `HaircutIndicatorEnum haircutIndicator`
- `MoneyBuilder amountBaseCurrency`
- `PartyReferencePayerReceiverBuilder payerReceiver`

**Key Methods:**
- `build()` → `CollateralBalance` [Builder]
- `getAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setCollateralBalanceStatus(CollateralStatusEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `getCollateralBalanceStatus()` → `CollateralStatusEnum` [Getter]
- `setAmountBaseCurrency(Money arg0)` → `CollateralBalanceBuilder` [Setter]
- `getHaircutIndicator()` → `HaircutIndicatorEnum` [Getter]
- `setHaircutIndicator(HaircutIndicatorEnum arg0)` → `CollateralBalanceBuilder` [Setter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setPayerReceiver(PartyReferencePayerReceiver arg0)` → `CollateralBalanceBuilder` [Setter]

### CollateralBalanceImpl
**Implements:** `CollateralBalance` 

**Key Methods:**
- `build()` → `CollateralBalance` [Builder]
- `getAmountBaseCurrency()` → `Money` [Getter]
- `getCollateralBalanceStatus()` → `CollateralStatusEnum` [Getter]
- `getHaircutIndicator()` → `HaircutIndicatorEnum` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `setBuilderFields(CollateralBalanceBuilder arg0)` → `void` [Setter]

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
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `getPortfolioIdentifier()` → `IdentifierBuilder` [Getter]
- `getCollateralBalance()` → `List` [Getter]
- `getOrCreateLegalAgreement()` → `ReferenceWithMetaLegalAgreementBuilder` [Getter]
- `setCollateralPosition(List arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setPortfolioIdentifier(Identifier arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setCollateralBalance(List arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setLegalAgreementValue(LegalAgreement arg0)` → `CollateralPortfolioBuilder` [Setter]
- `setLegalAgreement(ReferenceWithMetaLegalAgreement arg0)` → `CollateralPortfolioBuilder` [Setter]

### CollateralPortfolioImpl
**Implements:** `CollateralPortfolio` 

**Key Methods:**
- `build()` → `CollateralPortfolio` [Builder]
- `getLegalAgreement()` → `ReferenceWithMetaLegalAgreement` [Getter]
- `getPortfolioIdentifier()` → `Identifier` [Getter]
- `getCollateralBalance()` → `List` [Getter]
- `getCollateralPosition()` → `List` [Getter]
- `setBuilderFields(CollateralPortfolioBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### CollateralPositionBuilderImpl
**Extends:** `Position$PositionBuilderImpl` 
**Implements:** `CollateralPosition$CollateralPositionBuilder` 

**Fields:**
- `CollateralTreatmentBuilder treatment`
- `CollateralStatusEnum collateralPositionStatus`

**Key Methods:**
- `build()` → `CollateralPosition` [Builder]
- `setProduct(Product arg0)` → `CollateralPositionBuilder` [Setter]
- `getTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `getOrCreateTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setCashBalance(Money arg0)` → `CollateralPositionBuilder` [Setter]
- `setTreatment(CollateralTreatment arg0)` → `CollateralPositionBuilder` [Setter]
- `setTradeReferenceValue(TradeState arg0)` → `CollateralPositionBuilder` [Setter]
- `setCollateralPositionStatus(CollateralStatusEnum arg0)` → `CollateralPositionBuilder` [Setter]

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
- `getOrCreateDocumentation(int arg0)` → `LegalAgreementBuilder` [Getter]
- `setGoverningLawValue(GoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `setDocumentation(List arg0)` → `ContractDetailsBuilder` [Setter]
- `getGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `setGoverningLaw(FieldWithMetaGoverningLawEnum arg0)` → `ContractDetailsBuilder` [Setter]
- `getOrCreateGoverningLaw()` → `FieldWithMetaGoverningLawEnumBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ContractDetailsBuilder` [Setter]

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
- `getLegalAgreement()` → `List` [Getter]
- `getOrCreateLegalAgreement(int arg0)` → `LegalAgreementBuilder` [Getter]
- `setLegalAgreement(List arg0)` → `ContractFormationInstructionBuilder` [Setter]

### ContractFormationInstructionImpl
**Implements:** `ContractFormationInstruction` 

**Key Methods:**
- `build()` → `ContractFormationInstruction` [Builder]
- `getLegalAgreement()` → `List` [Getter]
- `setBuilderFields(ContractFormationInstructionBuilder arg0)` → `void` [Setter]

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
- `getCorporateActionType()` → `CorporateActionTypeEnum` [Getter]
- `setUnderlier(Underlier arg0)` → `CorporateActionBuilder` [Setter]
- `setCorporateActionType(CorporateActionTypeEnum arg0)` → `CorporateActionBuilder` [Setter]
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
- `setIntent(PositionEventIntentEnum arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `setEffectiveDate(Date arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `setEventDate(Date arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getOrCreateAfter(int arg0)` → `CounterpartyPositionStateBuilder` [Getter]
- `setCorporateActionIntent(CorporateActionTypeEnum arg0)` → `CounterpartyPositionBusinessEventBuilder` [Setter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getPackageInformation()` → `IdentifiedListBuilder` [Getter]
- `getEventDate()` → `Date` [Getter]

### CounterpartyPositionBusinessEventImpl
**Implements:** `CounterpartyPositionBusinessEvent` 

**Key Methods:**
- `build()` → `CounterpartyPositionBusinessEvent` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `setBuilderFields(CounterpartyPositionBusinessEventBuilder arg0)` → `void` [Setter]
- `getCorporateActionIntent()` → `CorporateActionTypeEnum` [Getter]
- `getPackageInformation()` → `IdentifiedList` [Getter]
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
- `setCounterpartyPosition(CounterpartyPosition arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getObservationHistory()` → `List` [Getter]
- `setObservationHistory(List arg0)` → `CounterpartyPositionStateBuilder` [Setter]
- `getValuationHistory()` → `List` [Getter]
- `getCounterpartyPosition()` → `CounterpartyPositionBuilder` [Getter]

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
- `setReferenceInformation(ReferenceInformation arg0)` → `CreditEventBuilder` [Setter]
- `getOrCreateFinalPrice()` → `PriceBuilder` [Getter]
- `setAuctionDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setFinalPrice(Price arg0)` → `CreditEventBuilder` [Setter]
- `setRecoveryPercent(BigDecimal arg0)` → `CreditEventBuilder` [Setter]
- `setEventDeterminationDate(Date arg0)` → `CreditEventBuilder` [Setter]
- `setCreditEventType(CreditEventTypeEnum arg0)` → `CreditEventBuilder` [Setter]
- `getEventDeterminationDate()` → `Date` [Getter]
- `getRecoveryPercent()` → `BigDecimal` [Getter]

### CreditEventImpl
**Implements:** `CreditEvent` 

**Key Methods:**
- `build()` → `CreditEvent` [Builder]
- `getEventDeterminationDate()` → `Date` [Getter]
- `getRecoveryPercent()` → `BigDecimal` [Getter]
- `getAuctionDate()` → `Date` [Getter]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `getCreditEventType()` → `CreditEventTypeEnum` [Getter]
- `getFinalPrice()` → `Price` [Getter]
- `setBuilderFields(CreditEventBuilder arg0)` → `void` [Setter]
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
- `getPackageReference()` → `IdentifiedListBuilder` [Getter]
- `getExecutionType()` → `ExecutionTypeEnum` [Getter]
- `getExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setExecutionType(ExecutionTypeEnum arg0)` → `ExecutionDetailsBuilder` [Setter]
- `getOrCreateExecutionVenue()` → `LegalEntityBuilder` [Getter]
- `setExecutionVenue(LegalEntity arg0)` → `ExecutionDetailsBuilder` [Setter]
- `setPackageReference(IdentifiedList arg0)` → `ExecutionDetailsBuilder` [Setter]
- `getOrCreatePackageReference()` → `IdentifiedListBuilder` [Getter]

### ExecutionDetailsImpl
**Implements:** `ExecutionDetails` 

**Key Methods:**
- `build()` → `ExecutionDetails` [Builder]
- `getPackageReference()` → `IdentifiedList` [Getter]
- `getExecutionType()` → `ExecutionTypeEnum` [Getter]
- `getExecutionVenue()` → `LegalEntity` [Getter]
- `setBuilderFields(ExecutionDetailsBuilder arg0)` → `void` [Setter]
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
- `getOrCreatePartyRoles(int arg0)` → `PartyRoleBuilder` [Getter]
- `setExecutionDetails(ExecutionDetails arg0)` → `ExecutionInstructionBuilder` [Setter]
- `getOrCreateParties(int arg0)` → `PartyBuilder` [Getter]
- `getOrCreateTradeIdentifier(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `getOrCreateTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `setTradeDateValue(Date arg0)` → `ExecutionInstructionBuilder` [Setter]
- `setCounterparty(List arg0)` → `ExecutionInstructionBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `ExecutionInstructionBuilder` [Setter]

### ExecutionInstructionImpl
**Implements:** `ExecutionInstruction` 

**Key Methods:**
- `build()` → `ExecutionInstruction` [Builder]
- `getPartyRoles()` → `List` [Getter]
- `getParties()` → `List` [Getter]
- `getLotIdentifier()` → `Identifier` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `setBuilderFields(ExecutionInstructionBuilder arg0)` → `void` [Setter]
- `getCounterparty()` → `List` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getAncillaryParty()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]

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
- `setAdjustedCashSettlementValuationDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedExerciseFeePaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `setAdjustedCashSettlementPaymentDate(Date arg0)` → `ExerciseEventBuilder` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedRelevantSwapEffectiveDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]

### ExerciseEventImpl
**Implements:** `ExerciseEvent` 

**Key Methods:**
- `build()` → `ExerciseEvent` [Builder]
- `setBuilderFields(ExerciseEventBuilder arg0)` → `void` [Setter]
- `getAdjustedCashSettlementPaymentDate()` → `Date` [Getter]
- `getAdjustedRelevantSwapEffectiveDate()` → `Date` [Getter]
- `getAdjustedExerciseFeePaymentDate()` → `Date` [Getter]
- `getAdjustedCashSettlementValuationDate()` → `Date` [Getter]
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
- `getExerciseQuantity()` → `PrimitiveInstructionBuilder` [Getter]
- `setExerciseQuantity(PrimitiveInstruction arg0)` → `ExerciseInstructionBuilder` [Setter]
- `getExerciseDate()` → `AdjustableOrAdjustedDateBuilder` [Getter]
- `getExerciseOption()` → `ReferenceWithMetaOptionPayoutBuilder` [Getter]
- `getExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateExerciseDate()` → `AdjustableOrAdjustedDateBuilder` [Getter]
- `getOrCreateExerciseTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setExerciseOption(ReferenceWithMetaOptionPayout arg0)` → `ExerciseInstructionBuilder` [Setter]
- `setExerciseTime(BusinessCenterTime arg0)` → `ExerciseInstructionBuilder` [Setter]

### ExerciseInstructionImpl
**Implements:** `ExerciseInstruction` 

**Key Methods:**
- `build()` → `ExerciseInstruction` [Builder]
- `getExerciseQuantity()` → `PrimitiveInstruction` [Getter]
- `getExerciseDate()` → `AdjustableOrAdjustedDate` [Getter]
- `getExerciseOption()` → `ReferenceWithMetaOptionPayout` [Getter]
- `getExerciseTime()` → `BusinessCenterTime` [Getter]
- `setBuilderFields(ExerciseInstructionBuilder arg0)` → `void` [Setter]
- `getReplacementTradeIdentifier()` → `List` [Getter]

### ExposureBuilderImpl
**Implements:** `Exposure$ExposureBuilder` 

**Fields:**
- `ReferenceWithMetaPortfolioStateBuilder tradePortfolio`
- `MoneyBuilder aggregateValue`
- `ZonedDateTime calculationDateTime`
- `ZonedDateTime valuationDateTime`

**Key Methods:**
- `build()` → `Exposure` [Builder]
- `getAggregateValue()` → `MoneyBuilder` [Getter]
- `getValuationDateTime()` → `ZonedDateTime` [Getter]
- `getCalculationDateTime()` → `ZonedDateTime` [Getter]
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `getOrCreateAggregateValue()` → `MoneyBuilder` [Getter]
- `getOrCreateTradePortfolio()` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `setAggregateValue(Money arg0)` → `ExposureBuilder` [Setter]
- `setCalculationDateTime(ZonedDateTime arg0)` → `ExposureBuilder` [Setter]
- `setTradePortfolio(ReferenceWithMetaPortfolioState arg0)` → `ExposureBuilder` [Setter]

### ExposureImpl
**Implements:** `Exposure` 

**Key Methods:**
- `build()` → `Exposure` [Builder]
- `getAggregateValue()` → `Money` [Getter]
- `getValuationDateTime()` → `ZonedDateTime` [Getter]
- `getCalculationDateTime()` → `ZonedDateTime` [Getter]
- `getTradePortfolio()` → `ReferenceWithMetaPortfolioState` [Getter]
- `setBuilderFields(ExposureBuilder arg0)` → `void` [Setter]

### IndexTransitionInstructionBuilderImpl
**Implements:** `IndexTransitionInstruction$IndexTransitionInstructionBuilder` 

**Fields:**
- `List (List) priceQuantity`
- `Date effectiveDate`
- `TransferBuilder cashTransfer`

**Key Methods:**
- `build()` → `IndexTransitionInstruction` [Builder]
- `setCashTransfer(Transfer arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getOrCreateCashTransfer()` → `TransferBuilder` [Getter]
- `setEffectiveDate(Date arg0)` → `IndexTransitionInstructionBuilder` [Setter]
- `getCashTransfer()` → `TransferBuilder` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getEffectiveDate()` → `Date` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `IndexTransitionInstructionBuilder` [Setter]

### IndexTransitionInstructionImpl
**Implements:** `IndexTransitionInstruction` 

**Key Methods:**
- `build()` → `IndexTransitionInstruction` [Builder]
- `getCashTransfer()` → `Transfer` [Getter]
- `getPriceQuantity()` → `List` [Getter]
- `getEffectiveDate()` → `Date` [Getter]
- `setBuilderFields(IndexTransitionInstructionBuilder arg0)` → `void` [Setter]

### InstructionBuilderImpl
**Implements:** `Instruction$InstructionBuilder` 

**Fields:**
- `PrimitiveInstructionBuilder primitiveInstruction`
- `ReferenceWithMetaTradeStateBuilder before`

**Key Methods:**
- `build()` → `Instruction` [Builder]
- `setBefore(ReferenceWithMetaTradeState arg0)` → `InstructionBuilder` [Setter]
- `setPrimitiveInstruction(PrimitiveInstruction arg0)` → `InstructionBuilder` [Setter]
- `getOrCreateBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `setBeforeValue(TradeState arg0)` → `InstructionBuilder` [Setter]
- `getBefore()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreatePrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]
- `getPrimitiveInstruction()` → `PrimitiveInstructionBuilder` [Getter]

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
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeBuilder` [Getter]
- `getTradeReference()` → `List` [Getter]
- `setTradeReference(List arg0)` → `LineageBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getOrCreatePortfolioStateReference(int arg0)` → `ReferenceWithMetaPortfolioStateBuilder` [Getter]
- `setPortfolioStateReferenceValue(List arg0)` → `LineageBuilder` [Setter]
- `getOrCreateEventReference(int arg0)` → `ReferenceWithMetaWorkflowStepBuilder` [Getter]
- `setPortfolioStateReference(List arg0)` → `LineageBuilder` [Setter]
- `getPortfolioStateReference()` → `List` [Getter]

### LineageImpl
**Implements:** `Lineage` 

**Key Methods:**
- `build()` → `Lineage` [Builder]
- `setBuilderFields(LineageBuilder arg0)` → `void` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getPortfolioStateReference()` → `List` [Getter]
- `getEventReference()` → `List` [Getter]

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
- `setPartyRole(List arg0)` → `MarginCallBaseBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `getCollateralPortfolio()` → `ReferenceWithMetaCollateralPortfolioBuilder` [Getter]
- `getRegIMRole()` → `RegIMRoleEnum` [Getter]
- `getBaseCurrencyExposure()` → `MarginCallExposureBuilder` [Getter]
- `getClearingBroker()` → `PartyBuilder` [Getter]
- `getCallAgreementType()` → `AgreementNameBuilder` [Getter]
- `getAgreementThreshold()` → `MoneyBuilder` [Getter]
- `getAgreementRounding()` → `MoneyBuilder` [Getter]

### MarginCallBaseImpl
**Implements:** `MarginCallBase` 

**Key Methods:**
- `build()` → `MarginCallBase` [Builder]
- `setBuilderFields(MarginCallBaseBuilder arg0)` → `void` [Setter]
- `getCollateralPortfolio()` → `ReferenceWithMetaCollateralPortfolio` [Getter]
- `getRegIMRole()` → `RegIMRoleEnum` [Getter]
- `getBaseCurrencyExposure()` → `MarginCallExposure` [Getter]
- `getClearingBroker()` → `Party` [Getter]
- `getCallAgreementType()` → `AgreementName` [Getter]
- `getAgreementThreshold()` → `Money` [Getter]
- `getAgreementRounding()` → `Money` [Getter]
- `getRegMarginType()` → `RegMarginTypeEnum` [Getter]

### MarginCallExposureBuilderImpl
**Extends:** `MarginCallBase$MarginCallBaseBuilderImpl` 
**Implements:** `MarginCallExposure$MarginCallExposureBuilder` 

**Fields:**
- `ExposureBuilder overallExposure`
- `ExposureBuilder simmIMExposure`
- `ExposureBuilder scheduleGridIMExposure`

**Key Methods:**
- `build()` → `MarginCallExposure` [Builder]
- `setPartyRole(List arg0)` → `MarginCallExposureBuilder` [Setter]
- `getSimmIMExposure()` → `ExposureBuilder` [Getter]
- `getScheduleGridIMExposure()` → `ExposureBuilder` [Getter]
- `getOverallExposure()` → `ExposureBuilder` [Getter]
- `setAgreementMinimumTransferAmount(Money arg0)` → `MarginCallExposureBuilder` [Setter]
- `getOrCreateScheduleGridIMExposure()` → `ExposureBuilder` [Getter]
- `setIndependentAmountBalance(CollateralBalance arg0)` → `MarginCallExposureBuilder` [Setter]
- `setCollateralPortfolioValue(CollateralPortfolio arg0)` → `MarginCallExposureBuilder` [Setter]
- `getOrCreateOverallExposure()` → `ExposureBuilder` [Getter]

### MarginCallExposureImpl
**Extends:** `MarginCallBase$MarginCallBaseImpl` 
**Implements:** `MarginCallExposure` 

**Key Methods:**
- `build()` → `MarginCallExposure` [Builder]
- `setBuilderFields(MarginCallExposureBuilder arg0)` → `void` [Setter]
- `getSimmIMExposure()` → `Exposure` [Getter]
- `getScheduleGridIMExposure()` → `Exposure` [Getter]
- `getOverallExposure()` → `Exposure` [Getter]

### MarginCallInstructionTypeBuilderImpl
**Implements:** `MarginCallInstructionType$MarginCallInstructionTypeBuilder` 

**Fields:**
- `CallTypeEnum callType`
- `Boolean visibilityIndicator`

**Key Methods:**
- `build()` → `MarginCallInstructionType` [Builder]
- `setCallType(CallTypeEnum arg0)` → `MarginCallInstructionTypeBuilder` [Setter]
- `setVisibilityIndicator(Boolean arg0)` → `MarginCallInstructionTypeBuilder` [Setter]
- `getCallType()` → `CallTypeEnum` [Getter]
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
- `setPartyRole(List arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setAgreementMinimumTransferAmount(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setIndependentAmountBalance(CollateralBalance arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `setCollateralPortfolioValue(CollateralPortfolio arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getOrCreateCallAmountInBaseCurrency()` → `MoneyBuilder` [Getter]
- `setCallAmountInBaseCurrency(Money arg0)` → `MarginCallIssuanceBuilder` [Setter]
- `getRecallNonCashCollateralDescription()` → `List` [Getter]
- `setRecallNonCashCollateralDescription(List arg0)` → `MarginCallIssuanceBuilder` [Setter]

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
- `setCollateralPositionComponent(List arg0)` → `MarginCallResponseActionBuilder` [Setter]
- `getOrCreateCollateralPositionComponent(int arg0)` → `CollateralPositionBuilder` [Getter]
- `getCollateralPositionComponent()` → `List` [Getter]
- `getMarginCallAction()` → `MarginCallActionEnum` [Getter]
- `setMarginCallAction(MarginCallActionEnum arg0)` → `MarginCallResponseActionBuilder` [Setter]

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
- `setPartyRole(List arg0)` → `MarginCallResponseBuilder` [Setter]
- `setAgreementMinimumTransferAmount(Money arg0)` → `MarginCallResponseBuilder` [Setter]
- `setIndependentAmountBalance(CollateralBalance arg0)` → `MarginCallResponseBuilder` [Setter]
- `setCollateralPortfolioValue(CollateralPortfolio arg0)` → `MarginCallResponseBuilder` [Setter]
- `getOrCreateMarginCallResponseAction(int arg0)` → `MarginCallResponseActionBuilder` [Getter]
- `setMarginCallResponseAction(List arg0)` → `MarginCallResponseBuilder` [Setter]
- `getAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `getOrCreateAgreedAmountBaseCurrency()` → `MoneyBuilder` [Getter]
- `setAgreedAmountBaseCurrency(Money arg0)` → `MarginCallResponseBuilder` [Setter]

### MarginCallResponseImpl
**Extends:** `MarginCallBase$MarginCallBaseImpl` 
**Implements:** `MarginCallResponse` 

**Key Methods:**
- `build()` → `MarginCallResponse` [Builder]
- `setBuilderFields(MarginCallResponseBuilder arg0)` → `void` [Setter]
- `getAgreedAmountBaseCurrency()` → `Money` [Getter]
- `getMarginCallResponseAction()` → `List` [Getter]
- `getMarginResponseType()` → `MarginCallResponseTypeEnum` [Getter]

### ObservationEventBuilderImpl
**Implements:** `ObservationEvent$ObservationEventBuilder` 

**Fields:**
- `CreditEventBuilder creditEvent`
- `CorporateActionBuilder corporateAction`

**Key Methods:**
- `build()` → `ObservationEvent` [Builder]
- `getOrCreateCorporateAction()` → `CorporateActionBuilder` [Getter]
- `getCreditEvent()` → `CreditEventBuilder` [Getter]
- `getOrCreateCreditEvent()` → `CreditEventBuilder` [Getter]
- `setCreditEvent(CreditEvent arg0)` → `ObservationEventBuilder` [Setter]
- `setCorporateAction(CorporateAction arg0)` → `ObservationEventBuilder` [Setter]
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
- `setObservationEvent(ObservationEvent arg0)` → `ObservationInstructionBuilder` [Setter]
- `getObservationEvent()` → `ObservationEventBuilder` [Getter]
- `getOrCreateObservationEvent()` → `ObservationEventBuilder` [Getter]

### ObservationInstructionImpl
**Implements:** `ObservationInstruction` 

**Key Methods:**
- `build()` → `ObservationInstruction` [Builder]
- `getObservationEvent()` → `ObservationEvent` [Getter]
- `setBuilderFields(ObservationInstructionBuilder arg0)` → `void` [Setter]

### PartyChangeInstructionBuilderImpl
**Implements:** `PartyChangeInstruction$PartyChangeInstructionBuilder` 

**Fields:**
- `CounterpartyBuilder counterparty`
- `AncillaryPartyBuilder ancillaryParty`
- `PartyRoleBuilder partyRole`
- `List (List) tradeId`

**Key Methods:**
- `build()` → `PartyChangeInstruction` [Builder]
- `getTradeId()` → `List` [Getter]
- `setTradeId(List arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateAncillaryParty()` → `AncillaryPartyBuilder` [Getter]
- `setCounterparty(Counterparty arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateCounterparty()` → `CounterpartyBuilder` [Getter]
- `setAncillaryParty(AncillaryParty arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreateTradeId(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `setPartyRole(PartyRole arg0)` → `PartyChangeInstructionBuilder` [Setter]
- `getOrCreatePartyRole()` → `PartyRoleBuilder` [Getter]

### PartyChangeInstructionImpl
**Implements:** `PartyChangeInstruction` 

**Key Methods:**
- `build()` → `PartyChangeInstruction` [Builder]
- `getTradeId()` → `List` [Getter]
- `setBuilderFields(PartyChangeInstructionBuilder arg0)` → `void` [Setter]
- `getCounterparty()` → `Counterparty` [Getter]
- `getPartyRole()` → `PartyRole` [Getter]
- `getAncillaryParty()` → `AncillaryParty` [Getter]

### PositionIdentifierBuilderImpl
**Extends:** `Identifier$IdentifierBuilderImpl` 
**Implements:** `PositionIdentifier$PositionIdentifierBuilder` 

**Fields:**
- `TradeIdentifierTypeEnum identifierType`

**Key Methods:**
- `build()` → `PositionIdentifier` [Builder]
- `setIssuer(FieldWithMetaString arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `PositionIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `PositionIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `PositionIdentifierBuilder` [Setter]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]
- `setMeta(MetaFields arg0)` → `PositionIdentifierBuilder` [Setter]

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
- `getSplit()` → `SplitInstructionBuilder` [Getter]
- `setReset(ResetInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `getReset()` → `ResetInstructionBuilder` [Getter]
- `setSplit(SplitInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `setValuation(ValuationInstruction arg0)` → `PrimitiveInstructionBuilder` [Setter]
- `getOrCreateValuation()` → `ValuationInstructionBuilder` [Getter]
- `getOrCreateQuantityChange()` → `QuantityChangeInstructionBuilder` [Getter]
- `getOrCreateSplit()` → `SplitInstructionBuilder` [Getter]
- `getOrCreateReset()` → `ResetInstructionBuilder` [Getter]

### PrimitiveInstructionImpl
**Implements:** `PrimitiveInstruction` 

**Key Methods:**
- `build()` → `PrimitiveInstruction` [Builder]
- `getSplit()` → `SplitInstruction` [Getter]
- `getReset()` → `ResetInstruction` [Getter]
- `getIndexTransition()` → `IndexTransitionInstruction` [Getter]
- `getStockSplit()` → `StockSplitInstruction` [Getter]
- `getTermsChange()` → `TermsChangeInstruction` [Getter]
- `getQuantityChange()` → `QuantityChangeInstruction` [Getter]
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
- `setChange(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getOrCreateLotIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `setLotIdentifier(List arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `setDirection(QuantityChangeDirectionEnum arg0)` → `QuantityChangeInstructionBuilder` [Setter]
- `getOrCreateChange(int arg0)` → `PriceQuantityBuilder` [Getter]
- `getDirection()` → `QuantityChangeDirectionEnum` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `getChange()` → `List` [Getter]

### QuantityChangeInstructionImpl
**Implements:** `QuantityChangeInstruction` 

**Key Methods:**
- `build()` → `QuantityChangeInstruction` [Builder]
- `getDirection()` → `QuantityChangeDirectionEnum` [Getter]
- `getLotIdentifier()` → `List` [Getter]
- `setBuilderFields(QuantityChangeInstructionBuilder arg0)` → `void` [Setter]
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
- `getOrCreateAveragingMethodology()` → `AveragingCalculationBuilder` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `getObservations()` → `List` [Getter]
- `getResetValue()` → `PriceBuilder` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getAveragingMethodology()` → `AveragingCalculationBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setAveragingMethodology(AveragingCalculation arg0)` → `ResetBuilder` [Setter]
- `getOrCreateResetValue()` → `PriceBuilder` [Getter]

### ResetImpl
**Implements:** `Reset` 

**Key Methods:**
- `build()` → `Reset` [Builder]
- `getRateRecordDate()` → `Date` [Getter]
- `getObservations()` → `List` [Getter]
- `getResetValue()` → `Price` [Getter]
- `getResetDate()` → `Date` [Getter]
- `getAveragingMethodology()` → `AveragingCalculation` [Getter]
- `setBuilderFields(ResetBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### ResetInstructionBuilderImpl
**Implements:** `ResetInstruction$ResetInstructionBuilder` 

**Fields:**
- `List (List) payout`
- `Date rateRecordDate`
- `Date resetDate`

**Key Methods:**
- `build()` → `ResetInstruction` [Builder]
- `setPayout(List arg0)` → `ResetInstructionBuilder` [Setter]
- `setPayoutValue(List arg0)` → `ResetInstructionBuilder` [Setter]
- `getOrCreatePayout(int arg0)` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `getRateRecordDate()` → `Date` [Getter]
- `getResetDate()` → `Date` [Getter]
- `setRateRecordDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `setResetDate(Date arg0)` → `ResetInstructionBuilder` [Setter]
- `getPayout()` → `List` [Getter]

### ResetInstructionImpl
**Implements:** `ResetInstruction` 

**Key Methods:**
- `build()` → `ResetInstruction` [Builder]
- `getRateRecordDate()` → `Date` [Getter]
- `getResetDate()` → `Date` [Getter]
- `setBuilderFields(ResetInstructionBuilder arg0)` → `void` [Setter]
- `getPayout()` → `List` [Getter]

### ReturnInstructionBuilderImpl
**Implements:** `ReturnInstruction$ReturnInstructionBuilder` 

**Fields:**
- `List (List) quantity`

**Key Methods:**
- `build()` → `ReturnInstruction` [Builder]
- `getQuantity()` → `List` [Getter]
- `getOrCreateQuantity(int arg0)` → `QuantityBuilder` [Getter]
- `setQuantity(List arg0)` → `ReturnInstructionBuilder` [Setter]

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
- `setTransferType(ScheduledTransferEnum arg0)` → `ScheduledTransferBuilder` [Setter]
- `setCorporateActionTransferType(CorporateActionTypeEnum arg0)` → `ScheduledTransferBuilder` [Setter]
- `getCorporateActionTransferType()` → `CorporateActionTypeEnum` [Getter]

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
- `setBillingSummary(List arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `setBillingRecord(List arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setBillingEndDate(Date arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `getOrCreateSendingParty()` → `PartyBuilder` [Getter]
- `setBillingStartDate(Date arg0)` → `SecurityLendingInvoiceBuilder` [Setter]
- `getOrCreateBillingRecord(int arg0)` → `BillingRecordBuilder` [Getter]
- `getOrCreateBillingSummary(int arg0)` → `BillingSummaryBuilder` [Getter]
- `setSendingParty(Party arg0)` → `SecurityLendingInvoiceBuilder` [Setter]

### SecurityLendingInvoiceImpl
**Implements:** `SecurityLendingInvoice` 

**Key Methods:**
- `build()` → `SecurityLendingInvoice` [Builder]
- `setBuilderFields(SecurityLendingInvoiceBuilder arg0)` → `void` [Setter]
- `getBillingStartDate()` → `Date` [Getter]
- `getBillingRecord()` → `List` [Getter]
- `getBillingSummary()` → `List` [Getter]
- `getReceivingParty()` → `Party` [Getter]
- `getBillingEndDate()` → `Date` [Getter]
- `getSendingParty()` → `Party` [Getter]
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
- `getBreakdown()` → `List` [Getter]
- `setBuilderFields(SplitInstructionBuilder arg0)` → `void` [Setter]

### StateBuilderImpl
**Implements:** `State$StateBuilder` 

**Fields:**
- `ClosedStateBuilder closedState`
- `PositionStatusEnum positionState`

**Key Methods:**
- `build()` → `State` [Builder]
- `setClosedState(ClosedState arg0)` → `StateBuilder` [Setter]
- `setPositionState(PositionStatusEnum arg0)` → `StateBuilder` [Setter]
- `getOrCreateClosedState()` → `ClosedStateBuilder` [Getter]
- `getClosedState()` → `ClosedStateBuilder` [Getter]
- `getPositionState()` → `PositionStatusEnum` [Getter]

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
- `setEffectiveDate(Date arg0)` → `StockSplitInstructionBuilder` [Setter]
- `setAdjustmentRatio(BigDecimal arg0)` → `StockSplitInstructionBuilder` [Setter]
- `getEffectiveDate()` → `Date` [Getter]
- `getAdjustmentRatio()` → `BigDecimal` [Getter]

### StockSplitInstructionImpl
**Implements:** `StockSplitInstruction` 

**Key Methods:**
- `build()` → `StockSplitInstruction` [Builder]
- `getEffectiveDate()` → `Date` [Getter]
- `getAdjustmentRatio()` → `BigDecimal` [Getter]
- `setBuilderFields(StockSplitInstructionBuilder arg0)` → `void` [Setter]

### TermsChangeInstructionBuilderImpl
**Implements:** `TermsChangeInstruction$TermsChangeInstructionBuilder` 

**Fields:**
- `NonTransferableProductBuilder product`
- `List (List) ancillaryParty`
- `NotionalAdjustmentEnum adjustment`

**Key Methods:**
- `build()` → `TermsChangeInstruction` [Builder]
- `getOrCreateAncillaryParty(int arg0)` → `AncillaryPartyBuilder` [Getter]
- `setAncillaryParty(List arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `setAdjustment(NotionalAdjustmentEnum arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `getOrCreateProduct()` → `NonTransferableProductBuilder` [Getter]
- `setProduct(NonTransferableProduct arg0)` → `TermsChangeInstructionBuilder` [Setter]
- `getAncillaryParty()` → `List` [Getter]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
- `getProduct()` → `NonTransferableProductBuilder` [Getter]

### TermsChangeInstructionImpl
**Implements:** `TermsChangeInstruction` 

**Key Methods:**
- `build()` → `TermsChangeInstruction` [Builder]
- `setBuilderFields(TermsChangeInstructionBuilder arg0)` → `void` [Setter]
- `getAncillaryParty()` → `List` [Getter]
- `getAdjustment()` → `NotionalAdjustmentEnum` [Getter]
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
- `setExecutionDetails(ExecutionDetails arg0)` → `TradeBuilder` [Setter]
- `getOrCreateTradeIdentifier(int arg0)` → `TradeIdentifierBuilder` [Getter]
- `getOrCreateTradeTime()` → `FieldWithMetaTimeZoneBuilder` [Getter]
- `setTradeDateValue(Date arg0)` → `TradeBuilder` [Setter]
- `setCounterparty(List arg0)` → `TradeBuilder` [Setter]
- `setCollateral(Collateral arg0)` → `TradeBuilder` [Setter]
- `getOrCreateCollateral()` → `CollateralBuilder` [Getter]
- `setTradeIdentifier(List arg0)` → `TradeBuilder` [Setter]
- `getOrCreateTradeDate()` → `FieldWithMetaDateBuilder` [Getter]

### TradeIdentifierBuilderImpl
**Extends:** `Identifier$IdentifierBuilderImpl` 
**Implements:** `TradeIdentifier$TradeIdentifierBuilder` 

**Fields:**
- `TradeIdentifierTypeEnum identifierType`

**Key Methods:**
- `build()` → `TradeIdentifier` [Builder]
- `setIssuer(FieldWithMetaString arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIdentifierType(TradeIdentifierTypeEnum arg0)` → `TradeIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `TradeIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `TradeIdentifierBuilder` [Setter]
- `getIdentifierType()` → `TradeIdentifierTypeEnum` [Getter]
- `setMeta(MetaFields arg0)` → `TradeIdentifierBuilder` [Setter]

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
- `getClearedDate()` → `Date` [Getter]
- `getTradeIdentifier()` → `List` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getTradeTime()` → `FieldWithMetaTimeZone` [Getter]
- `getContractDetails()` → `ContractDetails` [Getter]
- `getTradeDate()` → `FieldWithMetaDate` [Getter]
- `getCollateral()` → `Collateral` [Getter]
- `getExecutionDetails()` → `ExecutionDetails` [Getter]

### TradePricingReportBuilderImpl
**Implements:** `TradePricingReport$TradePricingReportBuilder` 

**Fields:**
- `TradeBuilder trade`
- `TimeZoneBuilder pricingTime`
- `FloatingRateIndexEnum discountingIndex`

**Key Methods:**
- `build()` → `TradePricingReport` [Builder]
- `getPricingTime()` → `TimeZoneBuilder` [Getter]
- `getDiscountingIndex()` → `FloatingRateIndexEnum` [Getter]
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `setPricingTime(TimeZone arg0)` → `TradePricingReportBuilder` [Setter]
- `setDiscountingIndex(FloatingRateIndexEnum arg0)` → `TradePricingReportBuilder` [Setter]
- `getOrCreatePricingTime()` → `TimeZoneBuilder` [Getter]
- `getTrade()` → `TradeBuilder` [Getter]
- `setTrade(Trade arg0)` → `TradePricingReportBuilder` [Setter]

### TradePricingReportImpl
**Implements:** `TradePricingReport` 

**Key Methods:**
- `build()` → `TradePricingReport` [Builder]
- `getPricingTime()` → `TimeZone` [Getter]
- `getDiscountingIndex()` → `FloatingRateIndexEnum` [Getter]
- `setBuilderFields(TradePricingReportBuilder arg0)` → `void` [Setter]
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
- `getOrCreateState()` → `StateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateTrade()` → `TradeBuilder` [Getter]
- `getResetHistory()` → `List` [Getter]
- `getOrCreateResetHistory(int arg0)` → `ResetBuilder` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `getOrCreateTransferHistory(int arg0)` → `TransferStateBuilder` [Getter]

### TradeStateImpl
**Implements:** `TradeState` 

**Key Methods:**
- `getState()` → `State` [Getter]
- `build()` → `TradeState` [Builder]
- `getResetHistory()` → `List` [Getter]
- `getTransferHistory()` → `List` [Getter]
- `setBuilderFields(TradeStateBuilder arg0)` → `void` [Setter]
- `getObservationHistory()` → `List` [Getter]
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
- `getResetOrigin()` → `ResetBuilder` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `getSettlementOrigin()` → `ReferenceWithMetaPayoutBuilder` [Getter]
- `getTransferExpression()` → `TransferExpressionBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `TransferBuilder` [Setter]
- `getOrCreateIdentifier(int arg0)` → `FieldWithMetaIdentifierBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PartyReferencePayerReceiverBuilder` [Getter]
- `setIdentifier(List arg0)` → `TransferBuilder` [Setter]
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
- `getResetOrigin()` → `Reset` [Getter]
- `getPayerReceiver()` → `PartyReferencePayerReceiver` [Getter]
- `getSettlementOrigin()` → `ReferenceWithMetaPayout` [Getter]
- `getTransferExpression()` → `TransferExpression` [Getter]
- `setBuilderFields(TransferBuilder arg0)` → `void` [Setter]
- `getIdentifier()` → `List` [Getter]

### TransferInstructionBuilderImpl
**Implements:** `TransferInstruction$TransferInstructionBuilder` 

**Fields:**
- `List (List) transferState`

**Key Methods:**
- `build()` → `TransferInstruction` [Builder]
- `getTransferState()` → `List` [Getter]
- `getOrCreateTransferState(int arg0)` → `TransferStateBuilder` [Getter]
- `setTransferState(List arg0)` → `TransferInstructionBuilder` [Setter]

### TransferInstructionImpl
**Implements:** `TransferInstruction` 

**Key Methods:**
- `build()` → `TransferInstruction` [Builder]
- `getTransferState()` → `List` [Getter]
- `setBuilderFields(TransferInstructionBuilder arg0)` → `void` [Setter]

### TransferStateBuilderImpl
**Implements:** `TransferState$TransferStateBuilder` 

**Fields:**
- `TransferBuilder transfer`
- `TransferStatusEnum transferStatus`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `TransferState` [Builder]
- `getTransfer()` → `TransferBuilder` [Getter]
- `setTransferStatus(TransferStatusEnum arg0)` → `TransferStateBuilder` [Setter]
- `getOrCreateTransfer()` → `TransferBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setTransfer(Transfer arg0)` → `TransferStateBuilder` [Setter]
- `getTransferStatus()` → `TransferStatusEnum` [Getter]
- `setMeta(MetaFields arg0)` → `TransferStateBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### TransferStateImpl
**Implements:** `TransferState` 

**Key Methods:**
- `build()` → `TransferState` [Builder]
- `getTransfer()` → `Transfer` [Getter]
- `setBuilderFields(TransferStateBuilder arg0)` → `void` [Setter]
- `getTransferStatus()` → `TransferStatusEnum` [Getter]
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
- `getSource()` → `ValuationSourceEnum` [Getter]
- `setTimestamp(ZonedDateTime arg0)` → `ValuationBuilder` [Setter]
- `getOrCreateAmount()` → `MoneyBuilder` [Getter]
- `getPriceComponent()` → `PriceBuilder` [Getter]
- `getOrCreatePriceComponent()` → `PriceBuilder` [Getter]
- `getValuationTiming()` → `PriceTimingEnum` [Getter]

### ValuationImpl
**Implements:** `Valuation` 

**Key Methods:**
- `getMethod()` → `ValuationTypeEnum` [Getter]
- `build()` → `Valuation` [Builder]
- `getTimestamp()` → `ZonedDateTime` [Getter]
- `getSource()` → `ValuationSourceEnum` [Getter]
- `getPriceComponent()` → `Price` [Getter]
- `getValuationTiming()` → `PriceTimingEnum` [Getter]
- `setBuilderFields(ValuationBuilder arg0)` → `void` [Setter]
- `getDelta()` → `BigDecimal` [Getter]
- `getAmount()` → `Money` [Getter]

### ValuationInstructionBuilderImpl
**Implements:** `ValuationInstruction$ValuationInstructionBuilder` 

**Fields:**
- `List (List) valuation`
- `Boolean replace`

**Key Methods:**
- `build()` → `ValuationInstruction` [Builder]
- `setValuation(List arg0)` → `ValuationInstructionBuilder` [Setter]
- `getOrCreateValuation(int arg0)` → `ValuationBuilder` [Getter]
- `getValuation()` → `List` [Getter]
- `setReplace(Boolean arg0)` → `ValuationInstructionBuilder` [Setter]
- `getReplace()` → `Boolean` [Getter]

### ValuationInstructionImpl
**Implements:** `ValuationInstruction` 

**Key Methods:**
- `build()` → `ValuationInstruction` [Builder]
- `setBuilderFields(ValuationInstructionBuilder arg0)` → `void` [Setter]
- `getValuation()` → `List` [Getter]
- `getReplace()` → `Boolean` [Getter]

