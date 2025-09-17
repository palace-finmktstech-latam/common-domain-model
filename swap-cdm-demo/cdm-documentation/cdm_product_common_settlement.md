# Package: cdm.product.common.settlement

## Enums

### CashSettlementMethodEnum
**Values:**
- `CashPriceMethod`
- `CashPriceAlternateMethod`
- `ParYieldCurveAdjustedMethod`
- `ZeroCouponYieldAdjustedMethod`
- `ParYieldCurveUnadjustedMethod`
- `CrossCurrencyMethod`
- `CollateralizedCashPriceMethod`
- `MidMarketIndicativeQuotations`
- `MidMarketIndicativeQuotationsAlternate`
- `MidMarketCalculationAgentDetermination`
- `ReplacementValueFirmQuotations`
- `ReplacementValueCalculationAgentDetermination`

### DeliveryMethodEnum
**Values:**
- `DeliveryVersusPayment`
- `FreeOfPayment`
- `PreDelivery`
- `PrePayment`

### ScheduledTransferEnum
**Values:**
- `CorporateAction`
- `Coupon`
- `CreditEvent`
- `DividendReturn`
- `Exercise`
- `FixedRateReturn`
- `FloatingRateReturn`
- `FractionalAmount`
- `InterestReturn`
- `NetInterest`
- `Performance`
- `PrincipalPayment`

### SettlementCentreEnum
**Values:**
- `EuroclearBank`
- `ClearstreamBankingLuxembourg`

### SettlementTypeEnum
**Values:**
- `Cash`
- `Physical`
- `Election`
- `CashOrPhysical`

### StandardSettlementStyleEnum
**Values:**
- `Standard`
- `Net`
- `StandardAndNet`
- `PairAndNet`

### TransferSettlementEnum
**Values:**
- `DeliveryVersusDelivery`
- `DeliveryVersusPayment`
- `PaymentVersusPayment`
- `NotCentralSettlement`

## Interfaces

### AssetFlowBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetFlowBase` [Builder]
- `getQuantity()` → `NonNegativeQuantity` [Getter]
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getAsset()` → `Asset` [Getter]

### AssetFlowBaseBuilder
**Implements:** `AssetFlowBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `AssetFlowBaseBuilder` [Setter]
- `setQuantity(NonNegativeQuantity arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `getOrCreateSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `getOrCreateQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `getAsset()` → `AssetBuilder` [Getter]
- `setAsset(Asset arg0)` → `AssetFlowBaseBuilder` [Setter]

### CashSettlementTerms
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashSettlementTerms` [Builder]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationDate()` → `ValuationDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getCashSettlementAmount()` → `Money` [Getter]
- `getRecoveryFactor()` → `BigDecimal` [Getter]
- `getFixedSettlement()` → `Boolean` [Getter]
- `getValuationMethod()` → `ValuationMethod` [Getter]
- `getCashSettlementMethod()` → `CashSettlementMethodEnum` [Getter]

### CashSettlementTermsBuilder
**Implements:** `CashSettlementTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getValuationDate()` → `ValuationDateBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setValuationTime(BusinessCenterTime arg0)` → `CashSettlementTermsBuilder` [Setter]
- `getOrCreateValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setValuationDate(ValuationDate arg0)` → `CashSettlementTermsBuilder` [Setter]
- `getOrCreateValuationDate()` → `ValuationDateBuilder` [Getter]
- `setValuationMethod(ValuationMethod arg0)` → `CashSettlementTermsBuilder` [Setter]

### Cashflow
**Implements:** `AssetFlowBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Cashflow` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getCashflowType()` → `CashflowType` [Getter]
- `getPaymentDiscounting()` → `PaymentDiscounting` [Getter]

### CashflowBuilder
**Implements:** `Cashflow` `AssetFlowBase$AssetFlowBaseBuilder` 

**Key Methods:**
- `setPayerReceiver(PayerReceiver arg0)` → `CashflowBuilder` [Setter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `CashflowBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `CashflowBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setAsset(Asset arg0)` → `CashflowBuilder` [Setter]
- `getOrCreateCashflowType()` → `CashflowTypeBuilder` [Getter]
- `getCashflowType()` → `CashflowTypeBuilder` [Getter]
- `getPaymentDiscounting()` → `PaymentDiscountingBuilder` [Getter]
- `setPaymentDiscounting(PaymentDiscounting arg0)` → `CashflowBuilder` [Setter]

### CashflowType
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashflowType` [Builder]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getCashPrice()` → `CashPrice` [Getter]
- `getCashflowType()` → `ScheduledTransferEnum` [Getter]

### CashflowTypeBuilder
**Implements:** `CashflowType` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `CashflowTypeBuilder` [Setter]
- `setCashPrice(CashPrice arg0)` → `CashflowTypeBuilder` [Setter]
- `setCashflowType(ScheduledTransferEnum arg0)` → `CashflowTypeBuilder` [Setter]
- `getOrCreateCashPrice()` → `CashPriceBuilder` [Getter]

### CommodityPriceReturnTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CommodityPriceReturnTerms` [Builder]
- `getRounding()` → `Rounding` [Getter]
- `getRollFeature()` → `RollFeature` [Getter]
- `getConversionFactor()` → `BigDecimal` [Getter]
- `getSpread()` → `SpreadSchedule` [Getter]

### CommodityPriceReturnTermsBuilder
**Implements:** `CommodityPriceReturnTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setConversionFactor(BigDecimal arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]
- `getRounding()` → `RoundingBuilder` [Getter]
- `getRollFeature()` → `RollFeatureBuilder` [Getter]
- `getOrCreateSpread()` → `SpreadScheduleBuilder` [Getter]
- `setRollFeature(RollFeature arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getOrCreateRollFeature()` → `RollFeatureBuilder` [Getter]
- `setRounding(Rounding arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `setSpread(SpreadSchedule arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getSpread()` → `SpreadScheduleBuilder` [Getter]

### ComputedAmount
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ComputedAmount` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getAmount()` → `BigDecimal` [Getter]
- `getCallFunction()` → `String` [Getter]

### ComputedAmountBuilder
**Implements:** `ComputedAmount` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `ComputedAmountBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `ComputedAmountBuilder` [Setter]
- `setAmount(BigDecimal arg0)` → `ComputedAmountBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCallFunction(String arg0)` → `ComputedAmountBuilder` [Setter]

### DeliverableObligations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DeliverableObligations` [Builder]
- `getGeneralFundObligationLiability()` → `Boolean` [Getter]
- `getRevenueObligationLiability()` → `Boolean` [Getter]
- `getFullFaithAndCreditObLiability()` → `Boolean` [Getter]
- `getAccruedInterest()` → `Boolean` [Getter]
- `getNotDomesticLaw()` → `Boolean` [Getter]
- `getNotContingent()` → `Boolean` [Getter]
- `getSpecifiedCurrency()` → `SpecifiedCurrency` [Getter]
- `getNotDomesticIssuance()` → `Boolean` [Getter]

### DeliverableObligationsBuilder
**Implements:** `DeliverableObligations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAccruedInterest(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `getOrCreateAssignableLoan()` → `PCDeliverableObligationCharacBuilder` [Getter]
- `setConsentRequiredLoan(PCDeliverableObligationCharac arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setMaximumMaturity(Period arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setAcceleratedOrMatured(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setSpecifiedCurrency(SpecifiedCurrency arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotSovereignLender(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setCategory(ObligationCategoryEnum arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotBearer(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotSubordinated(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]

### FixedPrice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FixedPrice` [Builder]
- `getPrice()` → `ReferenceWithMetaPriceSchedule` [Getter]

### FixedPriceBuilder
**Implements:** `FixedPrice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `setPriceValue(PriceSchedule arg0)` → `FixedPriceBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `FixedPriceBuilder` [Setter]

### FxFixingDate
**Implements:** `Offset` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxFixingDate` [Builder]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getFxFixingDate()` → `AdjustableOrRelativeDate` [Getter]
- `getBusinessCentersReference()` → `ReferenceWithMetaBusinessCenters` [Getter]
- `getDateRelativeToPaymentDates()` → `DateRelativeToPaymentDates` [Getter]
- `getDateRelativeToValuationDates()` → `DateRelativeToValuationDates` [Getter]
- `getDateRelativeToCalculationPeriodDates()` → `DateRelativeToCalculationPeriodDates` [Getter]

### FxFixingDateBuilder
**Implements:** `FxFixingDate` `Offset$OffsetBuilder` 

**Key Methods:**
- `getOrCreateDateRelativeToCalculationPeriodDates()` → `DateRelativeToCalculationPeriodDatesBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FxFixingDateBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setBusinessCenters(BusinessCenters arg0)` → `FxFixingDateBuilder` [Setter]
- `getBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setBusinessDayConvention(BusinessDayConventionEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `setDayType(DayTypeEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `getOrCreateFxFixingDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getFxFixingDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setFxFixingDate(AdjustableOrRelativeDate arg0)` → `FxFixingDateBuilder` [Setter]

### LoanParticipation
**Implements:** `PCDeliverableObligationCharac` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `LoanParticipation` [Builder]
- `getQualifyingParticipationSeller()` → `String` [Getter]

### LoanParticipationBuilder
**Implements:** `LoanParticipation` `PCDeliverableObligationCharac$PCDeliverableObligationCharacBuilder` 

**Key Methods:**
- `setApplicable(Boolean arg0)` → `LoanParticipationBuilder` [Setter]
- `setPartialCashSettlement(Boolean arg0)` → `LoanParticipationBuilder` [Setter]
- `setQualifyingParticipationSeller(String arg0)` → `LoanParticipationBuilder` [Setter]

### PCDeliverableObligationCharac
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PCDeliverableObligationCharac` [Builder]
- `getApplicable()` → `Boolean` [Getter]
- `getPartialCashSettlement()` → `Boolean` [Getter]

### PCDeliverableObligationCharacBuilder
**Implements:** `PCDeliverableObligationCharac` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setApplicable(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]
- `setPartialCashSettlement(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]

### PaymentDetail
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentDetail` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]
- `getPaymentRule()` → `PaymentRule` [Getter]
- `getPaymentAmount()` → `Money` [Getter]

### PaymentDetailBuilder
**Implements:** `PaymentDetail` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PaymentDetailBuilder` [Setter]
- `getOrCreatePaymentRule()` → `PaymentRuleBuilder` [Getter]
- `setPaymentAmount(Money arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setPaymentDate(AdjustableOrRelativeDate arg0)` → `PaymentDetailBuilder` [Setter]
- `setPaymentRule(PaymentRule arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentRule()` → `PaymentRuleBuilder` [Getter]
- `getPaymentAmount()` → `MoneyBuilder` [Getter]

### PaymentDiscounting
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentDiscounting` [Builder]
- `getPresentValueAmount()` → `Money` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]

### PaymentDiscountingBuilder
**Implements:** `PaymentDiscounting` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPresentValueAmount()` → `MoneyBuilder` [Getter]
- `setPresentValueAmount(Money arg0)` → `PaymentDiscountingBuilder` [Setter]
- `setDiscountFactor(BigDecimal arg0)` → `PaymentDiscountingBuilder` [Setter]
- `getOrCreatePresentValueAmount()` → `MoneyBuilder` [Getter]

### PaymentRule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentRule` [Builder]
- `getPercentageRule()` → `PercentageRule` [Getter]

### PaymentRuleBuilder
**Implements:** `PaymentRule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPercentageRule()` → `PercentageRuleBuilder` [Getter]
- `setPercentageRule(PercentageRule arg0)` → `PaymentRuleBuilder` [Setter]
- `getOrCreatePercentageRule()` → `PercentageRuleBuilder` [Getter]

### PayoutBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PayoutBase` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getPriceQuantity()` → `ResolvablePriceQuantity` [Getter]
- `getPrincipalPayment()` → `PrincipalPayments` [Getter]
- `getSettlementTerms()` → `SettlementTerms` [Getter]

### PayoutBaseBuilder
**Implements:** `PayoutBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPayerReceiver(PayerReceiver arg0)` → `PayoutBaseBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `PayoutBaseBuilder` [Setter]
- `getOrCreatePriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setSettlementTerms(SettlementTerms arg0)` → `PayoutBaseBuilder` [Setter]
- `getPrincipalPayment()` → `PrincipalPaymentsBuilder` [Getter]
- `getOrCreateSettlementTerms()` → `SettlementTermsBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `PayoutBaseBuilder` [Setter]

### PercentageRule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PercentageRule` [Builder]
- `getPaymentPercent()` → `BigDecimal` [Getter]
- `getNotionalAmountReference()` → `ReferenceWithMetaMoney` [Getter]

### PercentageRuleBuilder
**Implements:** `PercentageRule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setNotionalAmountReference(ReferenceWithMetaMoney arg0)` → `PercentageRuleBuilder` [Setter]
- `setPaymentPercent(BigDecimal arg0)` → `PercentageRuleBuilder` [Setter]
- `getOrCreateNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setNotionalAmountReferenceValue(Money arg0)` → `PercentageRuleBuilder` [Setter]

### PhysicalSettlementPeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PhysicalSettlementPeriod` [Builder]
- `getBusinessDays()` → `Integer` [Getter]
- `getMaximumBusinessDays()` → `Integer` [Getter]
- `getBusinessDaysNotSpecified()` → `Boolean` [Getter]

### PhysicalSettlementPeriodBuilder
**Implements:** `PhysicalSettlementPeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBusinessDays(Integer arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `setMaximumBusinessDays(Integer arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `setBusinessDaysNotSpecified(Boolean arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]

### PhysicalSettlementTerms
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PhysicalSettlementTerms` [Builder]
- `getPhysicalSettlementPeriod()` → `PhysicalSettlementPeriod` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getDeliverableObligations()` → `DeliverableObligations` [Getter]
- `getEscrow()` → `Boolean` [Getter]
- `getSixtyBusinessDaySettlementCap()` → `Boolean` [Getter]
- `getClearedPhysicalSettlement()` → `Boolean` [Getter]
- `getPredeterminedClearingOrganizationParty()` → `AncillaryRoleEnum` [Getter]

### PhysicalSettlementTermsBuilder
**Implements:** `PhysicalSettlementTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPhysicalSettlementPeriod()` → `PhysicalSettlementPeriodBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `setDeliverableObligations(DeliverableObligations arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getDeliverableObligations()` → `DeliverableObligationsBuilder` [Getter]
- `getOrCreatePhysicalSettlementPeriod()` → `PhysicalSettlementPeriodBuilder` [Getter]
- `getOrCreateDeliverableObligations()` → `DeliverableObligationsBuilder` [Getter]
- `setSixtyBusinessDaySettlementCap(Boolean arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `setPredeterminedClearingOrganizationParty(AncillaryRoleEnum arg0)` → `PhysicalSettlementTermsBuilder` [Setter]

### PricingDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PricingDates` [Builder]
- `getParametricDates()` → `ParametricDates` [Getter]
- `getSpecifiedDates()` → `List` [Getter]

### PricingDatesBuilder
**Implements:** `PricingDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `PricingDatesBuilder` [Setter]
- `getOrCreateSpecifiedDates(int arg0)` → `AdjustableDatesBuilder` [Getter]
- `getSpecifiedDates()` → `List` [Getter]
- `setSpecifiedDates(List arg0)` → `PricingDatesBuilder` [Setter]

### PrincipalPayment
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PrincipalPayment` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getPrincipalPaymentDate()` → `AdjustableDate` [Getter]
- `getPrincipalAmount()` → `Money` [Getter]
- `getPresentValuePrincipalAmount()` → `Money` [Getter]

### PrincipalPaymentBuilder
**Implements:** `PrincipalPayment` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setPayerReceiver(PayerReceiver arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PrincipalPaymentBuilder` [Setter]
- `setDiscountFactor(BigDecimal arg0)` → `PrincipalPaymentBuilder` [Setter]
- `setPrincipalAmount(Money arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getPrincipalPaymentDate()` → `AdjustableDateBuilder` [Getter]
- `getPrincipalAmount()` → `MoneyBuilder` [Getter]

### PrincipalPaymentSchedule
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PrincipalPaymentSchedule` [Builder]
- `getInitialPrincipalPayment()` → `PrincipalPayment` [Getter]
- `getFinalPrincipalPayment()` → `PrincipalPayment` [Getter]
- `getIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDates` [Getter]

### PrincipalPaymentScheduleBuilder
**Implements:** `PrincipalPaymentSchedule` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setInitialPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `setFinalPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getOrCreateIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `setIntermediatePrincipalPayment(AdjustableRelativeOrPeriodicDates arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getOrCreateFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]

### PrincipalPayments
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PrincipalPayments` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getInitialPayment()` → `Boolean` [Getter]
- `getIntermediatePayment()` → `Boolean` [Getter]
- `getFinalPayment()` → `Boolean` [Getter]
- `getPrincipalPaymentSchedule()` → `PrincipalPaymentSchedule` [Getter]
- `getVaryingLegNotionalCurrency()` → `List` [Getter]

### PrincipalPaymentsBuilder
**Implements:** `PrincipalPayments` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getPrincipalPaymentSchedule()` → `PrincipalPaymentScheduleBuilder` [Getter]
- `setInitialPayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setFinalPayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setIntermediatePayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getOrCreatePrincipalPaymentSchedule()` → `PrincipalPaymentScheduleBuilder` [Getter]
- `setPrincipalPaymentSchedule(PrincipalPaymentSchedule arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setVaryingLegNotionalCurrency(List arg0)` → `PrincipalPaymentsBuilder` [Setter]

### QuantityMultiplier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `QuantityMultiplier` [Builder]
- `getMultiplierValue()` → `BigDecimal` [Getter]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalSchedule` [Getter]

### QuantityMultiplierBuilder
**Implements:** `QuantityMultiplier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMultiplierValue(BigDecimal arg0)` → `QuantityMultiplierBuilder` [Setter]
- `setFxLinkedNotionalSchedule(FxLinkedNotionalSchedule arg0)` → `QuantityMultiplierBuilder` [Setter]
- `getOrCreateFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]

### ResolvablePriceQuantity
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResolvablePriceQuantity` [Builder]
- `getReset()` → `Boolean` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `getQuantityMultiplier()` → `QuantityMultiplier` [Getter]
- `getQuantityReference()` → `ReferenceWithMetaResolvablePriceQuantity` [Getter]
- `getResolvedQuantity()` → `Quantity` [Getter]
- `getFutureValueNotional()` → `FutureValueAmount` [Getter]
- `getPriceSchedule()` → `List` [Getter]

### ResolvablePriceQuantityBuilder
**Implements:** `ResolvablePriceQuantity` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setReset(Boolean arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `getOrCreateQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setFutureValueNotional(FutureValueAmount arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `setPriceScheduleValue(List arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `setResolvedQuantity(Quantity arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `setQuantitySchedule(ReferenceWithMetaNonNegativeQuantitySchedule arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `setQuantityReferenceValue(ResolvablePriceQuantity arg0)` → `ResolvablePriceQuantityBuilder` [Setter]

### RollFeature
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `RollFeature` [Builder]
- `getRollSourceCalendar()` → `RollSourceCalendarEnum` [Getter]
- `getDeliveryDateRollConvention()` → `Offset` [Getter]

### RollFeatureBuilder
**Implements:** `RollFeature` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRollSourceCalendar(RollSourceCalendarEnum arg0)` → `RollFeatureBuilder` [Setter]
- `getDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]
- `getOrCreateDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]
- `setDeliveryDateRollConvention(Offset arg0)` → `RollFeatureBuilder` [Setter]

### SettlementBase
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementBase` [Builder]
- `getSettlementDate()` → `SettlementDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getSettlementCurrency()` → `FieldWithMetaString` [Getter]
- `getTransferSettlementType()` → `TransferSettlementEnum` [Getter]
- `getSettlementProvision()` → `SettlementProvision` [Getter]
- `getStandardSettlementStyle()` → `StandardSettlementStyleEnum` [Getter]
- `getSettlementType()` → `SettlementTypeEnum` [Getter]
- `getSettlementCentre()` → `SettlementCentreEnum` [Getter]

### SettlementBaseBuilder
**Implements:** `SettlementBase` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setSettlementDate(SettlementDate arg0)` → `SettlementBaseBuilder` [Setter]
- `getOrCreateSettlementDate()` → `SettlementDateBuilder` [Getter]
- `getSettlementDate()` → `SettlementDateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `SettlementBaseBuilder` [Setter]
- `setTransferSettlementType(TransferSettlementEnum arg0)` → `SettlementBaseBuilder` [Setter]
- `setStandardSettlementStyle(StandardSettlementStyleEnum arg0)` → `SettlementBaseBuilder` [Setter]
- `setSettlementCurrencyValue(String arg0)` → `SettlementBaseBuilder` [Setter]
- `setSettlementCurrency(FieldWithMetaString arg0)` → `SettlementBaseBuilder` [Setter]

### SettlementDate
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementDate` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getCashSettlementBusinessDays()` → `Integer` [Getter]
- `getAdjustableOrRelativeDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getPaymentDelay()` → `Boolean` [Getter]
- `getAdjustableDates()` → `AdjustableDates` [Getter]
- `getBusinessDateRange()` → `BusinessDateRange` [Getter]
- `getValueDate()` → `Date` [Getter]

### SettlementDateBuilder
**Implements:** `SettlementDate` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `SettlementDateBuilder` [Setter]
- `setPaymentDelay(Boolean arg0)` → `SettlementDateBuilder` [Setter]
- `getOrCreateAdjustableDates()` → `AdjustableDatesBuilder` [Getter]
- `setAdjustableDates(AdjustableDates arg0)` → `SettlementDateBuilder` [Setter]
- `setValueDate(Date arg0)` → `SettlementDateBuilder` [Setter]
- `getAdjustableOrRelativeDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `getAdjustableDates()` → `AdjustableDatesBuilder` [Getter]
- `getBusinessDateRange()` → `BusinessDateRangeBuilder` [Getter]

### SettlementProvision
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementProvision` [Builder]
- `getShapingProvisions()` → `ShapingProvision` [Getter]

### SettlementProvisionBuilder
**Implements:** `SettlementProvision` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getShapingProvisions()` → `ShapingProvisionBuilder` [Getter]
- `setShapingProvisions(ShapingProvision arg0)` → `SettlementProvisionBuilder` [Setter]
- `getOrCreateShapingProvisions()` → `ShapingProvisionBuilder` [Getter]

### SettlementTerms
**Implements:** `SettlementBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementTerms` [Builder]
- `getCashSettlementTerms()` → `List` [Getter]
- `getPhysicalSettlementTerms()` → `PhysicalSettlementTerms` [Getter]

### SettlementTermsBuilder
**Implements:** `SettlementTerms` `SettlementBase$SettlementBaseBuilder` 

**Key Methods:**
- `setSettlementDate(SettlementDate arg0)` → `SettlementTermsBuilder` [Setter]
- `getCashSettlementTerms()` → `List` [Getter]
- `setMeta(MetaFields arg0)` → `SettlementTermsBuilder` [Setter]
- `setTransferSettlementType(TransferSettlementEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setStandardSettlementStyle(StandardSettlementStyleEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setPhysicalSettlementTerms(PhysicalSettlementTerms arg0)` → `SettlementTermsBuilder` [Setter]
- `setCashSettlementTerms(List arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrencyValue(String arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrency(FieldWithMetaString arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCentre(SettlementCentreEnum arg0)` → `SettlementTermsBuilder` [Setter]

### ShapingProvision
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ShapingProvision` [Builder]
- `getShapeSchedule()` → `List` [Getter]

### ShapingProvisionBuilder
**Implements:** `ShapingProvision` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setShapeSchedule(List arg0)` → `ShapingProvisionBuilder` [Setter]
- `getShapeSchedule()` → `List` [Getter]
- `getOrCreateShapeSchedule(int arg0)` → `MoneyBuilder` [Getter]

### ValuationDate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationDate` [Builder]
- `getValuationDate()` → `RelativeDateOffset` [Getter]
- `getFxFixingSchedule()` → `AdjustableDates` [Getter]
- `getMultipleValuationDates()` → `MultipleValuationDates` [Getter]
- `getSingleValuationDate()` → `SingleValuationDate` [Getter]
- `getFxFixingDate()` → `FxFixingDate` [Getter]

### ValuationDateBuilder
**Implements:** `ValuationDate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getValuationDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setValuationDate(RelativeDateOffset arg0)` → `ValuationDateBuilder` [Setter]
- `getOrCreateValuationDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getFxFixingSchedule()` → `AdjustableDatesBuilder` [Getter]
- `getMultipleValuationDates()` → `MultipleValuationDatesBuilder` [Getter]
- `getSingleValuationDate()` → `SingleValuationDateBuilder` [Getter]
- `getOrCreateFxFixingDate()` → `FxFixingDateBuilder` [Getter]
- `setMultipleValuationDates(MultipleValuationDates arg0)` → `ValuationDateBuilder` [Setter]
- `setFxFixingSchedule(AdjustableDates arg0)` → `ValuationDateBuilder` [Setter]
- `getFxFixingDate()` → `FxFixingDateBuilder` [Getter]

## Concrete Classes

### AssetFlowBaseBuilderImpl
**Implements:** `AssetFlowBase$AssetFlowBaseBuilder` 

**Fields:**
- `NonNegativeQuantityBuilder quantity`
- `AssetBuilder asset`
- `AdjustableOrAdjustedOrRelativeDateBuilder settlementDate`

**Key Methods:**
- `build()` → `AssetFlowBase` [Builder]
- `getQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `AssetFlowBaseBuilder` [Setter]
- `setQuantity(NonNegativeQuantity arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `getOrCreateSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `getOrCreateQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `getAsset()` → `AssetBuilder` [Getter]
- `setAsset(Asset arg0)` → `AssetFlowBaseBuilder` [Setter]

### AssetFlowBaseImpl
**Implements:** `AssetFlowBase` 

**Key Methods:**
- `build()` → `AssetFlowBase` [Builder]
- `getQuantity()` → `NonNegativeQuantity` [Getter]
- `setBuilderFields(AssetFlowBaseBuilder arg0)` → `void` [Setter]
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getAsset()` → `Asset` [Getter]

### CashSettlementTermsBuilderImpl
**Implements:** `CashSettlementTerms$CashSettlementTermsBuilder` 

**Fields:**
- `CashSettlementMethodEnum cashSettlementMethod`
- `ValuationMethodBuilder valuationMethod`
- `ValuationDateBuilder valuationDate`
- `BusinessCenterTimeBuilder valuationTime`
- `MoneyBuilder cashSettlementAmount`
- `BigDecimal recoveryFactor`
- `Boolean fixedSettlement`
- `Boolean accruedInterest`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `CashSettlementTerms` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getValuationDate()` → `ValuationDateBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setValuationTime(BusinessCenterTime arg0)` → `CashSettlementTermsBuilder` [Setter]
- `getOrCreateValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setValuationDate(ValuationDate arg0)` → `CashSettlementTermsBuilder` [Setter]
- `getOrCreateValuationDate()` → `ValuationDateBuilder` [Getter]

### CashSettlementTermsImpl
**Implements:** `CashSettlementTerms` 

**Key Methods:**
- `build()` → `CashSettlementTerms` [Builder]
- `setBuilderFields(CashSettlementTermsBuilder arg0)` → `void` [Setter]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationDate()` → `ValuationDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getCashSettlementAmount()` → `Money` [Getter]
- `getRecoveryFactor()` → `BigDecimal` [Getter]
- `getFixedSettlement()` → `Boolean` [Getter]
- `getValuationMethod()` → `ValuationMethod` [Getter]
- `getCashSettlementMethod()` → `CashSettlementMethodEnum` [Getter]

### CashflowBuilderImpl
**Extends:** `AssetFlowBase$AssetFlowBaseBuilderImpl` 
**Implements:** `Cashflow$CashflowBuilder` 

**Fields:**
- `PayerReceiverBuilder payerReceiver`
- `CashflowTypeBuilder cashflowType`
- `PaymentDiscountingBuilder paymentDiscounting`

**Key Methods:**
- `build()` → `Cashflow` [Builder]
- `setPayerReceiver(PayerReceiver arg0)` → `CashflowBuilder` [Setter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `CashflowBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `CashflowBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setAsset(Asset arg0)` → `CashflowBuilder` [Setter]
- `getOrCreateCashflowType()` → `CashflowTypeBuilder` [Getter]
- `getCashflowType()` → `CashflowTypeBuilder` [Getter]
- `getPaymentDiscounting()` → `PaymentDiscountingBuilder` [Getter]

### CashflowImpl
**Extends:** `AssetFlowBase$AssetFlowBaseImpl` 
**Implements:** `Cashflow` 

**Key Methods:**
- `build()` → `Cashflow` [Builder]
- `setBuilderFields(CashflowBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getCashflowType()` → `CashflowType` [Getter]
- `getPaymentDiscounting()` → `PaymentDiscounting` [Getter]

### CashflowTypeBuilderImpl
**Implements:** `CashflowType$CashflowTypeBuilder` 

**Fields:**
- `ScheduledTransferEnum cashflowType`
- `CashPriceBuilder cashPrice`
- `PriceExpressionEnum priceExpression`

**Key Methods:**
- `build()` → `CashflowType` [Builder]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `CashflowTypeBuilder` [Setter]
- `setCashPrice(CashPrice arg0)` → `CashflowTypeBuilder` [Setter]
- `getCashflowType()` → `ScheduledTransferEnum` [Getter]
- `setCashflowType(ScheduledTransferEnum arg0)` → `CashflowTypeBuilder` [Setter]
- `getOrCreateCashPrice()` → `CashPriceBuilder` [Getter]

### CashflowTypeImpl
**Implements:** `CashflowType` 

**Key Methods:**
- `build()` → `CashflowType` [Builder]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getCashPrice()` → `CashPrice` [Getter]
- `setBuilderFields(CashflowTypeBuilder arg0)` → `void` [Setter]
- `getCashflowType()` → `ScheduledTransferEnum` [Getter]

### CommodityPriceReturnTermsBuilderImpl
**Implements:** `CommodityPriceReturnTerms$CommodityPriceReturnTermsBuilder` 

**Fields:**
- `RoundingBuilder rounding`
- `SpreadScheduleBuilder spread`
- `RollFeatureBuilder rollFeature`
- `BigDecimal conversionFactor`

**Key Methods:**
- `build()` → `CommodityPriceReturnTerms` [Builder]
- `setConversionFactor(BigDecimal arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]
- `getRounding()` → `RoundingBuilder` [Getter]
- `getRollFeature()` → `RollFeatureBuilder` [Getter]
- `getOrCreateSpread()` → `SpreadScheduleBuilder` [Getter]
- `setRollFeature(RollFeature arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getOrCreateRollFeature()` → `RollFeatureBuilder` [Getter]
- `setRounding(Rounding arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getConversionFactor()` → `BigDecimal` [Getter]

### CommodityPriceReturnTermsImpl
**Implements:** `CommodityPriceReturnTerms` 

**Key Methods:**
- `build()` → `CommodityPriceReturnTerms` [Builder]
- `setBuilderFields(CommodityPriceReturnTermsBuilder arg0)` → `void` [Setter]
- `getRounding()` → `Rounding` [Getter]
- `getRollFeature()` → `RollFeature` [Getter]
- `getConversionFactor()` → `BigDecimal` [Getter]
- `getSpread()` → `SpreadSchedule` [Getter]

### ComputedAmountBuilderImpl
**Implements:** `ComputedAmount$ComputedAmountBuilder` 

**Fields:**
- `String callFunction`
- `BigDecimal amount`
- `FieldWithMetaStringBuilder currency`

**Key Methods:**
- `build()` → `ComputedAmount` [Builder]
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `ComputedAmountBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `ComputedAmountBuilder` [Setter]
- `setAmount(BigDecimal arg0)` → `ComputedAmountBuilder` [Setter]
- `getAmount()` → `BigDecimal` [Getter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `getCallFunction()` → `String` [Getter]
- `setCallFunction(String arg0)` → `ComputedAmountBuilder` [Setter]

### ComputedAmountImpl
**Implements:** `ComputedAmount` 

**Key Methods:**
- `build()` → `ComputedAmount` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `setBuilderFields(ComputedAmountBuilder arg0)` → `void` [Setter]
- `getAmount()` → `BigDecimal` [Getter]
- `getCallFunction()` → `String` [Getter]

### DeliverableObligationsBuilderImpl
**Implements:** `DeliverableObligations$DeliverableObligationsBuilder` 

**Fields:**
- `Boolean accruedInterest`
- `ObligationCategoryEnum category`
- `Boolean notSubordinated`
- `SpecifiedCurrencyBuilder specifiedCurrency`
- `Boolean notSovereignLender`
- `NotDomesticCurrencyBuilder notDomesticCurrency`
- `Boolean notDomesticLaw`
- `Boolean listed`
- `Boolean notContingent`
- `Boolean notDomesticIssuance`
- `PCDeliverableObligationCharacBuilder assignableLoan`
- `PCDeliverableObligationCharacBuilder consentRequiredLoan`
- `LoanParticipationBuilder directLoanParticipation`
- `Boolean transferable`
- `PeriodBuilder maximumMaturity`
- `Boolean acceleratedOrMatured`
- `Boolean notBearer`
- `Boolean fullFaithAndCreditObLiability`
- `Boolean generalFundObligationLiability`
- `Boolean revenueObligationLiability`
- `LoanParticipationBuilder indirectLoanParticipation`
- `String excluded`
- `String othReferenceEntityObligations`

**Key Methods:**
- `build()` → `DeliverableObligations` [Builder]
- `getGeneralFundObligationLiability()` → `Boolean` [Getter]
- `getRevenueObligationLiability()` → `Boolean` [Getter]
- `getFullFaithAndCreditObLiability()` → `Boolean` [Getter]
- `setAccruedInterest(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `getOrCreateAssignableLoan()` → `PCDeliverableObligationCharacBuilder` [Getter]
- `setConsentRequiredLoan(PCDeliverableObligationCharac arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setMaximumMaturity(Period arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setAcceleratedOrMatured(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setSpecifiedCurrency(SpecifiedCurrency arg0)` → `DeliverableObligationsBuilder` [Setter]

### DeliverableObligationsImpl
**Implements:** `DeliverableObligations` 

**Key Methods:**
- `build()` → `DeliverableObligations` [Builder]
- `setBuilderFields(DeliverableObligationsBuilder arg0)` → `void` [Setter]
- `getGeneralFundObligationLiability()` → `Boolean` [Getter]
- `getRevenueObligationLiability()` → `Boolean` [Getter]
- `getFullFaithAndCreditObLiability()` → `Boolean` [Getter]
- `getAccruedInterest()` → `Boolean` [Getter]
- `getNotDomesticLaw()` → `Boolean` [Getter]
- `getNotContingent()` → `Boolean` [Getter]
- `getSpecifiedCurrency()` → `SpecifiedCurrency` [Getter]
- `getNotDomesticIssuance()` → `Boolean` [Getter]

### FixedPriceBuilderImpl
**Implements:** `FixedPrice$FixedPriceBuilder` 

**Fields:**
- `ReferenceWithMetaPriceScheduleBuilder price`

**Key Methods:**
- `build()` → `FixedPrice` [Builder]
- `getOrCreatePrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `setPriceValue(PriceSchedule arg0)` → `FixedPriceBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `FixedPriceBuilder` [Setter]

### FixedPriceImpl
**Implements:** `FixedPrice` 

**Key Methods:**
- `build()` → `FixedPrice` [Builder]
- `setBuilderFields(FixedPriceBuilder arg0)` → `void` [Setter]
- `getPrice()` → `ReferenceWithMetaPriceSchedule` [Getter]

### FxFixingDateBuilderImpl
**Extends:** `Offset$OffsetBuilderImpl` 
**Implements:** `FxFixingDate$FxFixingDateBuilder` 

**Fields:**
- `BusinessDayConventionEnum businessDayConvention`
- `BusinessCentersBuilder businessCenters`
- `ReferenceWithMetaBusinessCentersBuilder businessCentersReference`
- `DateRelativeToPaymentDatesBuilder dateRelativeToPaymentDates`
- `DateRelativeToCalculationPeriodDatesBuilder dateRelativeToCalculationPeriodDates`
- `DateRelativeToValuationDatesBuilder dateRelativeToValuationDates`
- `AdjustableOrRelativeDateBuilder fxFixingDate`

**Key Methods:**
- `build()` → `FxFixingDate` [Builder]
- `getOrCreateDateRelativeToCalculationPeriodDates()` → `DateRelativeToCalculationPeriodDatesBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FxFixingDateBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setBusinessCenters(BusinessCenters arg0)` → `FxFixingDateBuilder` [Setter]
- `getBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setBusinessDayConvention(BusinessDayConventionEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `setDayType(DayTypeEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `getOrCreateFxFixingDate()` → `AdjustableOrRelativeDateBuilder` [Getter]

### FxFixingDateImpl
**Extends:** `Offset$OffsetImpl` 
**Implements:** `FxFixingDate` 

**Key Methods:**
- `build()` → `FxFixingDate` [Builder]
- `setBuilderFields(FxFixingDateBuilder arg0)` → `void` [Setter]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getFxFixingDate()` → `AdjustableOrRelativeDate` [Getter]
- `getBusinessCentersReference()` → `ReferenceWithMetaBusinessCenters` [Getter]
- `getDateRelativeToPaymentDates()` → `DateRelativeToPaymentDates` [Getter]
- `getDateRelativeToValuationDates()` → `DateRelativeToValuationDates` [Getter]
- `getDateRelativeToCalculationPeriodDates()` → `DateRelativeToCalculationPeriodDates` [Getter]

### LoanParticipationBuilderImpl
**Extends:** `PCDeliverableObligationCharac$PCDeliverableObligationCharacBuilderImpl` 
**Implements:** `LoanParticipation$LoanParticipationBuilder` 

**Fields:**
- `String qualifyingParticipationSeller`

**Key Methods:**
- `build()` → `LoanParticipation` [Builder]
- `setApplicable(Boolean arg0)` → `LoanParticipationBuilder` [Setter]
- `setPartialCashSettlement(Boolean arg0)` → `LoanParticipationBuilder` [Setter]
- `getQualifyingParticipationSeller()` → `String` [Getter]
- `setQualifyingParticipationSeller(String arg0)` → `LoanParticipationBuilder` [Setter]

### LoanParticipationImpl
**Extends:** `PCDeliverableObligationCharac$PCDeliverableObligationCharacImpl` 
**Implements:** `LoanParticipation` 

**Key Methods:**
- `build()` → `LoanParticipation` [Builder]
- `setBuilderFields(LoanParticipationBuilder arg0)` → `void` [Setter]
- `getQualifyingParticipationSeller()` → `String` [Getter]

### PCDeliverableObligationCharacBuilderImpl
**Implements:** `PCDeliverableObligationCharac$PCDeliverableObligationCharacBuilder` 

**Fields:**
- `Boolean applicable`
- `Boolean partialCashSettlement`

**Key Methods:**
- `build()` → `PCDeliverableObligationCharac` [Builder]
- `setApplicable(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]
- `setPartialCashSettlement(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]
- `getApplicable()` → `Boolean` [Getter]
- `getPartialCashSettlement()` → `Boolean` [Getter]

### PCDeliverableObligationCharacImpl
**Implements:** `PCDeliverableObligationCharac` 

**Key Methods:**
- `build()` → `PCDeliverableObligationCharac` [Builder]
- `setBuilderFields(PCDeliverableObligationCharacBuilder arg0)` → `void` [Setter]
- `getApplicable()` → `Boolean` [Getter]
- `getPartialCashSettlement()` → `Boolean` [Getter]

### PaymentDetailBuilderImpl
**Implements:** `PaymentDetail$PaymentDetailBuilder` 

**Fields:**
- `AdjustableOrRelativeDateBuilder paymentDate`
- `PaymentRuleBuilder paymentRule`
- `MoneyBuilder paymentAmount`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PaymentDetail` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PaymentDetailBuilder` [Setter]
- `getOrCreatePaymentRule()` → `PaymentRuleBuilder` [Getter]
- `setPaymentAmount(Money arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setPaymentDate(AdjustableOrRelativeDate arg0)` → `PaymentDetailBuilder` [Setter]
- `setPaymentRule(PaymentRule arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentRule()` → `PaymentRuleBuilder` [Getter]

### PaymentDetailImpl
**Implements:** `PaymentDetail` 

**Key Methods:**
- `build()` → `PaymentDetail` [Builder]
- `setBuilderFields(PaymentDetailBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]
- `getPaymentRule()` → `PaymentRule` [Getter]
- `getPaymentAmount()` → `Money` [Getter]

### PaymentDiscountingBuilderImpl
**Implements:** `PaymentDiscounting$PaymentDiscountingBuilder` 

**Fields:**
- `BigDecimal discountFactor`
- `MoneyBuilder presentValueAmount`

**Key Methods:**
- `build()` → `PaymentDiscounting` [Builder]
- `getPresentValueAmount()` → `MoneyBuilder` [Getter]
- `setPresentValueAmount(Money arg0)` → `PaymentDiscountingBuilder` [Setter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `setDiscountFactor(BigDecimal arg0)` → `PaymentDiscountingBuilder` [Setter]
- `getOrCreatePresentValueAmount()` → `MoneyBuilder` [Getter]

### PaymentDiscountingImpl
**Implements:** `PaymentDiscounting` 

**Key Methods:**
- `build()` → `PaymentDiscounting` [Builder]
- `setBuilderFields(PaymentDiscountingBuilder arg0)` → `void` [Setter]
- `getPresentValueAmount()` → `Money` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]

### PaymentRuleBuilderImpl
**Implements:** `PaymentRule$PaymentRuleBuilder` 

**Fields:**
- `PercentageRuleBuilder percentageRule`

**Key Methods:**
- `build()` → `PaymentRule` [Builder]
- `getPercentageRule()` → `PercentageRuleBuilder` [Getter]
- `setPercentageRule(PercentageRule arg0)` → `PaymentRuleBuilder` [Setter]
- `getOrCreatePercentageRule()` → `PercentageRuleBuilder` [Getter]

### PaymentRuleImpl
**Implements:** `PaymentRule` 

**Key Methods:**
- `build()` → `PaymentRule` [Builder]
- `setBuilderFields(PaymentRuleBuilder arg0)` → `void` [Setter]
- `getPercentageRule()` → `PercentageRule` [Getter]

### PayoutBaseBuilderImpl
**Implements:** `PayoutBase$PayoutBaseBuilder` 

**Fields:**
- `PayerReceiverBuilder payerReceiver`
- `ResolvablePriceQuantityBuilder priceQuantity`
- `PrincipalPaymentsBuilder principalPayment`
- `SettlementTermsBuilder settlementTerms`

**Key Methods:**
- `build()` → `PayoutBase` [Builder]
- `setPayerReceiver(PayerReceiver arg0)` → `PayoutBaseBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `PayoutBaseBuilder` [Setter]
- `getOrCreatePriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setSettlementTerms(SettlementTerms arg0)` → `PayoutBaseBuilder` [Setter]
- `getPrincipalPayment()` → `PrincipalPaymentsBuilder` [Getter]
- `getOrCreateSettlementTerms()` → `SettlementTermsBuilder` [Getter]

### PayoutBaseImpl
**Implements:** `PayoutBase` 

**Key Methods:**
- `build()` → `PayoutBase` [Builder]
- `setBuilderFields(PayoutBaseBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getPriceQuantity()` → `ResolvablePriceQuantity` [Getter]
- `getPrincipalPayment()` → `PrincipalPayments` [Getter]
- `getSettlementTerms()` → `SettlementTerms` [Getter]

### PercentageRuleBuilderImpl
**Implements:** `PercentageRule$PercentageRuleBuilder` 

**Fields:**
- `BigDecimal paymentPercent`
- `ReferenceWithMetaMoneyBuilder notionalAmountReference`

**Key Methods:**
- `build()` → `PercentageRule` [Builder]
- `getPaymentPercent()` → `BigDecimal` [Getter]
- `getNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setNotionalAmountReference(ReferenceWithMetaMoney arg0)` → `PercentageRuleBuilder` [Setter]
- `setPaymentPercent(BigDecimal arg0)` → `PercentageRuleBuilder` [Setter]
- `getOrCreateNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setNotionalAmountReferenceValue(Money arg0)` → `PercentageRuleBuilder` [Setter]

### PercentageRuleImpl
**Implements:** `PercentageRule` 

**Key Methods:**
- `build()` → `PercentageRule` [Builder]
- `setBuilderFields(PercentageRuleBuilder arg0)` → `void` [Setter]
- `getPaymentPercent()` → `BigDecimal` [Getter]
- `getNotionalAmountReference()` → `ReferenceWithMetaMoney` [Getter]

### PhysicalSettlementPeriodBuilderImpl
**Implements:** `PhysicalSettlementPeriod$PhysicalSettlementPeriodBuilder` 

**Fields:**
- `Boolean businessDaysNotSpecified`
- `Integer businessDays`
- `Integer maximumBusinessDays`

**Key Methods:**
- `build()` → `PhysicalSettlementPeriod` [Builder]
- `setBusinessDays(Integer arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `setMaximumBusinessDays(Integer arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `setBusinessDaysNotSpecified(Boolean arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `getBusinessDays()` → `Integer` [Getter]
- `getMaximumBusinessDays()` → `Integer` [Getter]
- `getBusinessDaysNotSpecified()` → `Boolean` [Getter]

### PhysicalSettlementPeriodImpl
**Implements:** `PhysicalSettlementPeriod` 

**Key Methods:**
- `build()` → `PhysicalSettlementPeriod` [Builder]
- `setBuilderFields(PhysicalSettlementPeriodBuilder arg0)` → `void` [Setter]
- `getBusinessDays()` → `Integer` [Getter]
- `getMaximumBusinessDays()` → `Integer` [Getter]
- `getBusinessDaysNotSpecified()` → `Boolean` [Getter]

### PhysicalSettlementTermsBuilderImpl
**Implements:** `PhysicalSettlementTerms$PhysicalSettlementTermsBuilder` 

**Fields:**
- `Boolean clearedPhysicalSettlement`
- `AncillaryRoleEnum predeterminedClearingOrganizationParty`
- `PhysicalSettlementPeriodBuilder physicalSettlementPeriod`
- `DeliverableObligationsBuilder deliverableObligations`
- `Boolean escrow`
- `Boolean sixtyBusinessDaySettlementCap`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PhysicalSettlementTerms` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPhysicalSettlementPeriod()` → `PhysicalSettlementPeriodBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `setDeliverableObligations(DeliverableObligations arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getDeliverableObligations()` → `DeliverableObligationsBuilder` [Getter]
- `getEscrow()` → `Boolean` [Getter]
- `getSixtyBusinessDaySettlementCap()` → `Boolean` [Getter]
- `getClearedPhysicalSettlement()` → `Boolean` [Getter]

### PhysicalSettlementTermsImpl
**Implements:** `PhysicalSettlementTerms` 

**Key Methods:**
- `build()` → `PhysicalSettlementTerms` [Builder]
- `setBuilderFields(PhysicalSettlementTermsBuilder arg0)` → `void` [Setter]
- `getPhysicalSettlementPeriod()` → `PhysicalSettlementPeriod` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getDeliverableObligations()` → `DeliverableObligations` [Getter]
- `getEscrow()` → `Boolean` [Getter]
- `getSixtyBusinessDaySettlementCap()` → `Boolean` [Getter]
- `getClearedPhysicalSettlement()` → `Boolean` [Getter]
- `getPredeterminedClearingOrganizationParty()` → `AncillaryRoleEnum` [Getter]

### PricingDatesBuilderImpl
**Implements:** `PricingDates$PricingDatesBuilder` 

**Fields:**
- `List (List) specifiedDates`
- `ParametricDatesBuilder parametricDates`

**Key Methods:**
- `build()` → `PricingDates` [Builder]
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `PricingDatesBuilder` [Setter]
- `getOrCreateSpecifiedDates(int arg0)` → `AdjustableDatesBuilder` [Getter]
- `getSpecifiedDates()` → `List` [Getter]
- `setSpecifiedDates(List arg0)` → `PricingDatesBuilder` [Setter]

### PricingDatesImpl
**Implements:** `PricingDates` 

**Key Methods:**
- `build()` → `PricingDates` [Builder]
- `setBuilderFields(PricingDatesBuilder arg0)` → `void` [Setter]
- `getParametricDates()` → `ParametricDates` [Getter]
- `getSpecifiedDates()` → `List` [Getter]

### PrincipalPaymentBuilderImpl
**Implements:** `PrincipalPayment$PrincipalPaymentBuilder` 

**Fields:**
- `AdjustableDateBuilder principalPaymentDate`
- `PayerReceiverBuilder payerReceiver`
- `MoneyBuilder principalAmount`
- `BigDecimal discountFactor`
- `MoneyBuilder presentValuePrincipalAmount`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PrincipalPayment` [Builder]
- `setPayerReceiver(PayerReceiver arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `setDiscountFactor(BigDecimal arg0)` → `PrincipalPaymentBuilder` [Setter]
- `setPrincipalAmount(Money arg0)` → `PrincipalPaymentBuilder` [Setter]

### PrincipalPaymentImpl
**Implements:** `PrincipalPayment` 

**Key Methods:**
- `build()` → `PrincipalPayment` [Builder]
- `setBuilderFields(PrincipalPaymentBuilder arg0)` → `void` [Setter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getPrincipalPaymentDate()` → `AdjustableDate` [Getter]
- `getPrincipalAmount()` → `Money` [Getter]
- `getPresentValuePrincipalAmount()` → `Money` [Getter]

### PrincipalPaymentScheduleBuilderImpl
**Implements:** `PrincipalPaymentSchedule$PrincipalPaymentScheduleBuilder` 

**Fields:**
- `PrincipalPaymentBuilder initialPrincipalPayment`
- `AdjustableRelativeOrPeriodicDatesBuilder intermediatePrincipalPayment`
- `PrincipalPaymentBuilder finalPrincipalPayment`

**Key Methods:**
- `build()` → `PrincipalPaymentSchedule` [Builder]
- `setInitialPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `setFinalPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getOrCreateIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `setIntermediatePrincipalPayment(AdjustableRelativeOrPeriodicDates arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getOrCreateFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]

### PrincipalPaymentScheduleImpl
**Implements:** `PrincipalPaymentSchedule` 

**Key Methods:**
- `build()` → `PrincipalPaymentSchedule` [Builder]
- `setBuilderFields(PrincipalPaymentScheduleBuilder arg0)` → `void` [Setter]
- `getInitialPrincipalPayment()` → `PrincipalPayment` [Getter]
- `getFinalPrincipalPayment()` → `PrincipalPayment` [Getter]
- `getIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDates` [Getter]

### PrincipalPaymentsBuilderImpl
**Implements:** `PrincipalPayments$PrincipalPaymentsBuilder` 

**Fields:**
- `Boolean initialPayment`
- `Boolean finalPayment`
- `Boolean intermediatePayment`
- `List (List) varyingLegNotionalCurrency`
- `PrincipalPaymentScheduleBuilder principalPaymentSchedule`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PrincipalPayments` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getInitialPayment()` → `Boolean` [Getter]
- `getIntermediatePayment()` → `Boolean` [Getter]
- `getFinalPayment()` → `Boolean` [Getter]
- `getPrincipalPaymentSchedule()` → `PrincipalPaymentScheduleBuilder` [Getter]
- `getVaryingLegNotionalCurrency()` → `List` [Getter]
- `setInitialPayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]

### PrincipalPaymentsImpl
**Implements:** `PrincipalPayments` 

**Key Methods:**
- `build()` → `PrincipalPayments` [Builder]
- `setBuilderFields(PrincipalPaymentsBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getInitialPayment()` → `Boolean` [Getter]
- `getIntermediatePayment()` → `Boolean` [Getter]
- `getFinalPayment()` → `Boolean` [Getter]
- `getPrincipalPaymentSchedule()` → `PrincipalPaymentSchedule` [Getter]
- `getVaryingLegNotionalCurrency()` → `List` [Getter]

### QuantityMultiplierBuilderImpl
**Implements:** `QuantityMultiplier$QuantityMultiplierBuilder` 

**Fields:**
- `FxLinkedNotionalScheduleBuilder fxLinkedNotionalSchedule`
- `BigDecimal multiplierValue`

**Key Methods:**
- `build()` → `QuantityMultiplier` [Builder]
- `setMultiplierValue(BigDecimal arg0)` → `QuantityMultiplierBuilder` [Setter]
- `getMultiplierValue()` → `BigDecimal` [Getter]
- `setFxLinkedNotionalSchedule(FxLinkedNotionalSchedule arg0)` → `QuantityMultiplierBuilder` [Setter]
- `getOrCreateFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]

### QuantityMultiplierImpl
**Implements:** `QuantityMultiplier` 

**Key Methods:**
- `build()` → `QuantityMultiplier` [Builder]
- `setBuilderFields(QuantityMultiplierBuilder arg0)` → `void` [Setter]
- `getMultiplierValue()` → `BigDecimal` [Getter]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalSchedule` [Getter]

### ResolvablePriceQuantityBuilderImpl
**Implements:** `ResolvablePriceQuantity$ResolvablePriceQuantityBuilder` 

**Fields:**
- `QuantityBuilder resolvedQuantity`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder quantitySchedule`
- `ReferenceWithMetaResolvablePriceQuantityBuilder quantityReference`
- `QuantityMultiplierBuilder quantityMultiplier`
- `Boolean reset`
- `FutureValueAmountBuilder futureValueNotional`
- `List (List) priceSchedule`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ResolvablePriceQuantity` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getReset()` → `Boolean` [Getter]
- `setReset(Boolean arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `getOrCreateQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setFutureValueNotional(FutureValueAmount arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `setPriceScheduleValue(List arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `setResolvedQuantity(Quantity arg0)` → `ResolvablePriceQuantityBuilder` [Setter]

### ResolvablePriceQuantityImpl
**Implements:** `ResolvablePriceQuantity` 

**Key Methods:**
- `build()` → `ResolvablePriceQuantity` [Builder]
- `setBuilderFields(ResolvablePriceQuantityBuilder arg0)` → `void` [Setter]
- `getReset()` → `Boolean` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `getQuantityMultiplier()` → `QuantityMultiplier` [Getter]
- `getQuantityReference()` → `ReferenceWithMetaResolvablePriceQuantity` [Getter]
- `getResolvedQuantity()` → `Quantity` [Getter]
- `getFutureValueNotional()` → `FutureValueAmount` [Getter]
- `getPriceSchedule()` → `List` [Getter]

### RollFeatureBuilderImpl
**Implements:** `RollFeature$RollFeatureBuilder` 

**Fields:**
- `RollSourceCalendarEnum rollSourceCalendar`
- `OffsetBuilder deliveryDateRollConvention`

**Key Methods:**
- `build()` → `RollFeature` [Builder]
- `getRollSourceCalendar()` → `RollSourceCalendarEnum` [Getter]
- `setRollSourceCalendar(RollSourceCalendarEnum arg0)` → `RollFeatureBuilder` [Setter]
- `getDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]
- `getOrCreateDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]
- `setDeliveryDateRollConvention(Offset arg0)` → `RollFeatureBuilder` [Setter]

### RollFeatureImpl
**Implements:** `RollFeature` 

**Key Methods:**
- `build()` → `RollFeature` [Builder]
- `setBuilderFields(RollFeatureBuilder arg0)` → `void` [Setter]
- `getRollSourceCalendar()` → `RollSourceCalendarEnum` [Getter]
- `getDeliveryDateRollConvention()` → `Offset` [Getter]

### SettlementBaseBuilderImpl
**Implements:** `SettlementBase$SettlementBaseBuilder` 

**Fields:**
- `SettlementTypeEnum settlementType`
- `TransferSettlementEnum transferSettlementType`
- `FieldWithMetaStringBuilder settlementCurrency`
- `SettlementDateBuilder settlementDate`
- `SettlementCentreEnum settlementCentre`
- `SettlementProvisionBuilder settlementProvision`
- `StandardSettlementStyleEnum standardSettlementStyle`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `SettlementBase` [Builder]
- `setSettlementDate(SettlementDate arg0)` → `SettlementBaseBuilder` [Setter]
- `getOrCreateSettlementDate()` → `SettlementDateBuilder` [Getter]
- `getSettlementDate()` → `SettlementDateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `SettlementBaseBuilder` [Setter]
- `setTransferSettlementType(TransferSettlementEnum arg0)` → `SettlementBaseBuilder` [Setter]
- `setStandardSettlementStyle(StandardSettlementStyleEnum arg0)` → `SettlementBaseBuilder` [Setter]
- `setSettlementCurrencyValue(String arg0)` → `SettlementBaseBuilder` [Setter]

### SettlementBaseImpl
**Implements:** `SettlementBase` 

**Key Methods:**
- `build()` → `SettlementBase` [Builder]
- `setBuilderFields(SettlementBaseBuilder arg0)` → `void` [Setter]
- `getSettlementDate()` → `SettlementDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getSettlementCurrency()` → `FieldWithMetaString` [Getter]
- `getTransferSettlementType()` → `TransferSettlementEnum` [Getter]
- `getSettlementProvision()` → `SettlementProvision` [Getter]
- `getStandardSettlementStyle()` → `StandardSettlementStyleEnum` [Getter]
- `getSettlementType()` → `SettlementTypeEnum` [Getter]
- `getSettlementCentre()` → `SettlementCentreEnum` [Getter]

### SettlementDateBuilderImpl
**Implements:** `SettlementDate$SettlementDateBuilder` 

**Fields:**
- `AdjustableOrAdjustedOrRelativeDateBuilder adjustableOrRelativeDate`
- `Date valueDate`
- `AdjustableDatesBuilder adjustableDates`
- `BusinessDateRangeBuilder businessDateRange`
- `Integer cashSettlementBusinessDays`
- `Boolean paymentDelay`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `SettlementDate` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `SettlementDateBuilder` [Setter]
- `setPaymentDelay(Boolean arg0)` → `SettlementDateBuilder` [Setter]
- `getOrCreateAdjustableDates()` → `AdjustableDatesBuilder` [Getter]
- `setAdjustableDates(AdjustableDates arg0)` → `SettlementDateBuilder` [Setter]
- `getCashSettlementBusinessDays()` → `Integer` [Getter]
- `setValueDate(Date arg0)` → `SettlementDateBuilder` [Setter]
- `getAdjustableOrRelativeDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]

### SettlementDateImpl
**Implements:** `SettlementDate` 

**Key Methods:**
- `build()` → `SettlementDate` [Builder]
- `setBuilderFields(SettlementDateBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getCashSettlementBusinessDays()` → `Integer` [Getter]
- `getAdjustableOrRelativeDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getPaymentDelay()` → `Boolean` [Getter]
- `getAdjustableDates()` → `AdjustableDates` [Getter]
- `getBusinessDateRange()` → `BusinessDateRange` [Getter]
- `getValueDate()` → `Date` [Getter]

### SettlementProvisionBuilderImpl
**Implements:** `SettlementProvision$SettlementProvisionBuilder` 

**Fields:**
- `ShapingProvisionBuilder shapingProvisions`

**Key Methods:**
- `build()` → `SettlementProvision` [Builder]
- `getShapingProvisions()` → `ShapingProvisionBuilder` [Getter]
- `setShapingProvisions(ShapingProvision arg0)` → `SettlementProvisionBuilder` [Setter]
- `getOrCreateShapingProvisions()` → `ShapingProvisionBuilder` [Getter]

### SettlementProvisionImpl
**Implements:** `SettlementProvision` 

**Key Methods:**
- `build()` → `SettlementProvision` [Builder]
- `setBuilderFields(SettlementProvisionBuilder arg0)` → `void` [Setter]
- `getShapingProvisions()` → `ShapingProvision` [Getter]

### SettlementTermsBuilderImpl
**Extends:** `SettlementBase$SettlementBaseBuilderImpl` 
**Implements:** `SettlementTerms$SettlementTermsBuilder` 

**Fields:**
- `List (List) cashSettlementTerms`
- `PhysicalSettlementTermsBuilder physicalSettlementTerms`

**Key Methods:**
- `build()` → `SettlementTerms` [Builder]
- `setSettlementDate(SettlementDate arg0)` → `SettlementTermsBuilder` [Setter]
- `getCashSettlementTerms()` → `List` [Getter]
- `setMeta(MetaFields arg0)` → `SettlementTermsBuilder` [Setter]
- `setTransferSettlementType(TransferSettlementEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setStandardSettlementStyle(StandardSettlementStyleEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setPhysicalSettlementTerms(PhysicalSettlementTerms arg0)` → `SettlementTermsBuilder` [Setter]
- `setCashSettlementTerms(List arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrencyValue(String arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrency(FieldWithMetaString arg0)` → `SettlementTermsBuilder` [Setter]

### SettlementTermsImpl
**Extends:** `SettlementBase$SettlementBaseImpl` 
**Implements:** `SettlementTerms` 

**Key Methods:**
- `build()` → `SettlementTerms` [Builder]
- `setBuilderFields(SettlementTermsBuilder arg0)` → `void` [Setter]
- `getCashSettlementTerms()` → `List` [Getter]
- `getPhysicalSettlementTerms()` → `PhysicalSettlementTerms` [Getter]

### ShapingProvisionBuilderImpl
**Implements:** `ShapingProvision$ShapingProvisionBuilder` 

**Fields:**
- `List (List) shapeSchedule`

**Key Methods:**
- `build()` → `ShapingProvision` [Builder]
- `setShapeSchedule(List arg0)` → `ShapingProvisionBuilder` [Setter]
- `getShapeSchedule()` → `List` [Getter]
- `getOrCreateShapeSchedule(int arg0)` → `MoneyBuilder` [Getter]

### ShapingProvisionImpl
**Implements:** `ShapingProvision` 

**Key Methods:**
- `build()` → `ShapingProvision` [Builder]
- `setBuilderFields(ShapingProvisionBuilder arg0)` → `void` [Setter]
- `getShapeSchedule()` → `List` [Getter]

### ValuationDateBuilderImpl
**Implements:** `ValuationDate$ValuationDateBuilder` 

**Fields:**
- `SingleValuationDateBuilder singleValuationDate`
- `MultipleValuationDatesBuilder multipleValuationDates`
- `RelativeDateOffsetBuilder valuationDate`
- `FxFixingDateBuilder fxFixingDate`
- `AdjustableDatesBuilder fxFixingSchedule`

**Key Methods:**
- `build()` → `ValuationDate` [Builder]
- `getValuationDate()` → `RelativeDateOffsetBuilder` [Getter]
- `setValuationDate(RelativeDateOffset arg0)` → `ValuationDateBuilder` [Setter]
- `getOrCreateValuationDate()` → `RelativeDateOffsetBuilder` [Getter]
- `getFxFixingSchedule()` → `AdjustableDatesBuilder` [Getter]
- `getMultipleValuationDates()` → `MultipleValuationDatesBuilder` [Getter]
- `getSingleValuationDate()` → `SingleValuationDateBuilder` [Getter]
- `getOrCreateFxFixingDate()` → `FxFixingDateBuilder` [Getter]
- `setMultipleValuationDates(MultipleValuationDates arg0)` → `ValuationDateBuilder` [Setter]
- `setFxFixingSchedule(AdjustableDates arg0)` → `ValuationDateBuilder` [Setter]

### ValuationDateImpl
**Implements:** `ValuationDate` 

**Key Methods:**
- `build()` → `ValuationDate` [Builder]
- `setBuilderFields(ValuationDateBuilder arg0)` → `void` [Setter]
- `getValuationDate()` → `RelativeDateOffset` [Getter]
- `getFxFixingSchedule()` → `AdjustableDates` [Getter]
- `getMultipleValuationDates()` → `MultipleValuationDates` [Getter]
- `getSingleValuationDate()` → `SingleValuationDate` [Getter]
- `getFxFixingDate()` → `FxFixingDate` [Getter]

