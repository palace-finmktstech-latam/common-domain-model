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
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getQuantity()` → `NonNegativeQuantity` [Getter]
- `getAsset()` → `Asset` [Getter]

### AssetFlowBaseBuilder
**Implements:** `AssetFlowBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `getQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `getOrCreateSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getOrCreateQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `setAsset(Asset arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getAsset()` → `AssetBuilder` [Getter]

### CashSettlementTerms
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashSettlementTerms` [Builder]
- `getFixedSettlement()` → `Boolean` [Getter]
- `getCashSettlementMethod()` → `CashSettlementMethodEnum` [Getter]
- `getValuationMethod()` → `ValuationMethod` [Getter]
- `getCashSettlementAmount()` → `Money` [Getter]
- `getRecoveryFactor()` → `BigDecimal` [Getter]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationDate()` → `ValuationDate` [Getter]
- `getAccruedInterest()` → `Boolean` [Getter]

### CashSettlementTermsBuilder
**Implements:** `CashSettlementTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setRecoveryFactor(BigDecimal arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setAccruedInterest(Boolean arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setCashSettlementAmount(Money arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setValuationMethod(ValuationMethod arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setCashSettlementMethod(CashSettlementMethodEnum arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setFixedSettlement(Boolean arg0)` → `CashSettlementTermsBuilder` [Setter]
- `getValuationMethod()` → `ValuationMethodBuilder` [Getter]
- `getCashSettlementAmount()` → `MoneyBuilder` [Getter]
- `getOrCreateValuationMethod()` → `ValuationMethodBuilder` [Getter]

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
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `CashflowBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `CashflowBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `CashflowBuilder` [Setter]
- `getOrCreatePaymentDiscounting()` → `PaymentDiscountingBuilder` [Getter]
- `setCashflowType(CashflowType arg0)` → `CashflowBuilder` [Setter]
- `setAsset(Asset arg0)` → `CashflowBuilder` [Setter]
- `getCashflowType()` → `CashflowTypeBuilder` [Getter]
- `setPaymentDiscounting(PaymentDiscounting arg0)` → `CashflowBuilder` [Setter]

### CashflowType
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashflowType` [Builder]
- `getCashPrice()` → `CashPrice` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getCashflowType()` → `ScheduledTransferEnum` [Getter]

### CashflowTypeBuilder
**Implements:** `CashflowType` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateCashPrice()` → `CashPriceBuilder` [Getter]
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `setCashPrice(CashPrice arg0)` → `CashflowTypeBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `CashflowTypeBuilder` [Setter]
- `setCashflowType(ScheduledTransferEnum arg0)` → `CashflowTypeBuilder` [Setter]

### CommodityPriceReturnTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CommodityPriceReturnTerms` [Builder]
- `getConversionFactor()` → `BigDecimal` [Getter]
- `getRollFeature()` → `RollFeature` [Getter]
- `getRounding()` → `Rounding` [Getter]
- `getSpread()` → `SpreadSchedule` [Getter]

### CommodityPriceReturnTermsBuilder
**Implements:** `CommodityPriceReturnTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRounding(Rounding arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]
- `getOrCreateRollFeature()` → `RollFeatureBuilder` [Getter]
- `getOrCreateSpread()` → `SpreadScheduleBuilder` [Getter]
- `getRollFeature()` → `RollFeatureBuilder` [Getter]
- `getRounding()` → `RoundingBuilder` [Getter]
- `setRollFeature(RollFeature arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `setConversionFactor(BigDecimal arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getSpread()` → `SpreadScheduleBuilder` [Getter]
- `setSpread(SpreadSchedule arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]

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
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `ComputedAmountBuilder` [Setter]
- `setAmount(BigDecimal arg0)` → `ComputedAmountBuilder` [Setter]
- `setCallFunction(String arg0)` → `ComputedAmountBuilder` [Setter]

### DeliverableObligations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DeliverableObligations` [Builder]
- `getListed()` → `Boolean` [Getter]
- `getAcceleratedOrMatured()` → `Boolean` [Getter]
- `getCategory()` → `ObligationCategoryEnum` [Getter]
- `getDirectLoanParticipation()` → `LoanParticipation` [Getter]
- `getExcluded()` → `String` [Getter]
- `getOthReferenceEntityObligations()` → `String` [Getter]
- `getIndirectLoanParticipation()` → `LoanParticipation` [Getter]
- `getFullFaithAndCreditObLiability()` → `Boolean` [Getter]

### DeliverableObligationsBuilder
**Implements:** `DeliverableObligations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getDirectLoanParticipation()` → `LoanParticipationBuilder` [Getter]
- `setListed(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `getOrCreateAssignableLoan()` → `PCDeliverableObligationCharacBuilder` [Getter]
- `setNotContingent(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotDomesticCurrency(NotDomesticCurrency arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotSubordinated(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setCategory(ObligationCategoryEnum arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotDomesticLaw(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotDomesticIssuance(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setSpecifiedCurrency(SpecifiedCurrency arg0)` → `DeliverableObligationsBuilder` [Setter]

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
- `setPriceValue(PriceSchedule arg0)` → `FixedPriceBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `FixedPriceBuilder` [Setter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]

### FxFixingDate
**Implements:** `Offset` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxFixingDate` [Builder]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `getFxFixingDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDateRelativeToValuationDates()` → `DateRelativeToValuationDates` [Getter]
- `getDateRelativeToPaymentDates()` → `DateRelativeToPaymentDates` [Getter]
- `getDateRelativeToCalculationPeriodDates()` → `DateRelativeToCalculationPeriodDates` [Getter]
- `getBusinessCentersReference()` → `ReferenceWithMetaBusinessCenters` [Getter]

### FxFixingDateBuilder
**Implements:** `FxFixingDate` `Offset$OffsetBuilder` 

**Key Methods:**
- `setBusinessDayConvention(BusinessDayConventionEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `setBusinessCenters(BusinessCenters arg0)` → `FxFixingDateBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `getBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setDayType(DayTypeEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `getFxFixingDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateFxFixingDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setFxFixingDate(AdjustableOrRelativeDate arg0)` → `FxFixingDateBuilder` [Setter]
- `getOrCreateDateRelativeToPaymentDates()` → `DateRelativeToPaymentDatesBuilder` [Getter]
- `getDateRelativeToValuationDates()` → `DateRelativeToValuationDatesBuilder` [Getter]

### LoanParticipation
**Implements:** `PCDeliverableObligationCharac` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `LoanParticipation` [Builder]
- `getQualifyingParticipationSeller()` → `String` [Getter]

### LoanParticipationBuilder
**Implements:** `LoanParticipation` `PCDeliverableObligationCharac$PCDeliverableObligationCharacBuilder` 

**Key Methods:**
- `setPartialCashSettlement(Boolean arg0)` → `LoanParticipationBuilder` [Setter]
- `setQualifyingParticipationSeller(String arg0)` → `LoanParticipationBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `LoanParticipationBuilder` [Setter]

### PCDeliverableObligationCharac
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PCDeliverableObligationCharac` [Builder]
- `getPartialCashSettlement()` → `Boolean` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### PCDeliverableObligationCharacBuilder
**Implements:** `PCDeliverableObligationCharac` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPartialCashSettlement(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]

### PaymentDetail
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PaymentDetail` [Builder]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]
- `getPaymentRule()` → `PaymentRule` [Getter]
- `getPaymentAmount()` → `Money` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PaymentDetailBuilder
**Implements:** `PaymentDetail` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setPaymentAmount(Money arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreatePaymentRule()` → `PaymentRuleBuilder` [Getter]
- `getOrCreatePaymentAmount()` → `MoneyBuilder` [Getter]
- `setPaymentDate(AdjustableOrRelativeDate arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentRule()` → `PaymentRuleBuilder` [Getter]
- `getOrCreatePaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setPaymentRule(PaymentRule arg0)` → `PaymentDetailBuilder` [Setter]
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
- `setPresentValueAmount(Money arg0)` → `PaymentDiscountingBuilder` [Setter]
- `getPresentValueAmount()` → `MoneyBuilder` [Getter]
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
- `getOrCreatePercentageRule()` → `PercentageRuleBuilder` [Getter]
- `setPercentageRule(PercentageRule arg0)` → `PaymentRuleBuilder` [Setter]

### PayoutBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PayoutBase` [Builder]
- `getPriceQuantity()` → `ResolvablePriceQuantity` [Getter]
- `getPrincipalPayment()` → `PrincipalPayments` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getSettlementTerms()` → `SettlementTerms` [Getter]

### PayoutBaseBuilder
**Implements:** `PayoutBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]
- `getOrCreateSettlementTerms()` → `SettlementTermsBuilder` [Getter]
- `getPrincipalPayment()` → `PrincipalPaymentsBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `PayoutBaseBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PayoutBaseBuilder` [Setter]
- `getOrCreatePrincipalPayment()` → `PrincipalPaymentsBuilder` [Getter]
- `getOrCreatePriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]
- `setSettlementTerms(SettlementTerms arg0)` → `PayoutBaseBuilder` [Setter]

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
- `getOrCreateNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setNotionalAmountReferenceValue(Money arg0)` → `PercentageRuleBuilder` [Setter]
- `getNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setPaymentPercent(BigDecimal arg0)` → `PercentageRuleBuilder` [Setter]
- `setNotionalAmountReference(ReferenceWithMetaMoney arg0)` → `PercentageRuleBuilder` [Setter]

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
- `getPredeterminedClearingOrganizationParty()` → `AncillaryRoleEnum` [Getter]
- `getSixtyBusinessDaySettlementCap()` → `Boolean` [Getter]
- `getClearedPhysicalSettlement()` → `Boolean` [Getter]
- `getEscrow()` → `Boolean` [Getter]
- `getPhysicalSettlementPeriod()` → `PhysicalSettlementPeriod` [Getter]
- `getDeliverableObligations()` → `DeliverableObligations` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PhysicalSettlementTermsBuilder
**Implements:** `PhysicalSettlementTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setEscrow(Boolean arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setDeliverableObligations(DeliverableObligations arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getOrCreateDeliverableObligations()` → `DeliverableObligationsBuilder` [Getter]
- `setPhysicalSettlementPeriod(PhysicalSettlementPeriod arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `setClearedPhysicalSettlement(Boolean arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `setPredeterminedClearingOrganizationParty(AncillaryRoleEnum arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getOrCreatePhysicalSettlementPeriod()` → `PhysicalSettlementPeriodBuilder` [Getter]
- `setSixtyBusinessDaySettlementCap(Boolean arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getPhysicalSettlementPeriod()` → `PhysicalSettlementPeriodBuilder` [Getter]

### PricingDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PricingDates` [Builder]
- `getSpecifiedDates()` → `List` [Getter]
- `getParametricDates()` → `ParametricDates` [Getter]

### PricingDatesBuilder
**Implements:** `PricingDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSpecifiedDates()` → `List` [Getter]
- `getOrCreateSpecifiedDates(int arg0)` → `AdjustableDatesBuilder` [Getter]
- `setSpecifiedDates(List arg0)` → `PricingDatesBuilder` [Setter]
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `PricingDatesBuilder` [Setter]

### PrincipalPayment
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PrincipalPayment` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `getPresentValuePrincipalAmount()` → `Money` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getPrincipalPaymentDate()` → `AdjustableDate` [Getter]
- `getPrincipalAmount()` → `Money` [Getter]

### PrincipalPaymentBuilder
**Implements:** `PrincipalPayment` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPresentValuePrincipalAmount()` → `MoneyBuilder` [Getter]
- `getOrCreatePrincipalPaymentDate()` → `AdjustableDateBuilder` [Getter]
- `setPresentValuePrincipalAmount(Money arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getOrCreatePresentValuePrincipalAmount()` → `MoneyBuilder` [Getter]
- `setDiscountFactor(BigDecimal arg0)` → `PrincipalPaymentBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `PrincipalPaymentBuilder` [Setter]

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
- `getInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `setFinalPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `setInitialPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getOrCreateFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getOrCreateInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getOrCreateIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setIntermediatePrincipalPayment(AdjustableRelativeOrPeriodicDates arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]

### PrincipalPayments
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PrincipalPayments` [Builder]
- `getIntermediatePayment()` → `Boolean` [Getter]
- `getFinalPayment()` → `Boolean` [Getter]
- `getInitialPayment()` → `Boolean` [Getter]
- `getVaryingLegNotionalCurrency()` → `List` [Getter]
- `getPrincipalPaymentSchedule()` → `PrincipalPaymentSchedule` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PrincipalPaymentsBuilder
**Implements:** `PrincipalPayments` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setInitialPayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setIntermediatePayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setFinalPayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setVaryingLegNotionalCurrency(List arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setPrincipalPaymentSchedule(PrincipalPaymentSchedule arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getOrCreatePrincipalPaymentSchedule()` → `PrincipalPaymentScheduleBuilder` [Getter]
- `getPrincipalPaymentSchedule()` → `PrincipalPaymentScheduleBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### QuantityMultiplier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `QuantityMultiplier` [Builder]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalSchedule` [Getter]
- `getMultiplierValue()` → `BigDecimal` [Getter]

### QuantityMultiplierBuilder
**Implements:** `QuantityMultiplier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]
- `setFxLinkedNotionalSchedule(FxLinkedNotionalSchedule arg0)` → `QuantityMultiplierBuilder` [Setter]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]
- `setMultiplierValue(BigDecimal arg0)` → `QuantityMultiplierBuilder` [Setter]

### ResolvablePriceQuantity
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ResolvablePriceQuantity` [Builder]
- `getReset()` → `Boolean` [Getter]
- `getResolvedQuantity()` → `Quantity` [Getter]
- `getQuantityMultiplier()` → `QuantityMultiplier` [Getter]
- `getFutureValueNotional()` → `FutureValueAmount` [Getter]
- `getPriceSchedule()` → `List` [Getter]
- `getQuantityReference()` → `ReferenceWithMetaResolvablePriceQuantity` [Getter]
- `getQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### ResolvablePriceQuantityBuilder
**Implements:** `ResolvablePriceQuantity` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setReset(Boolean arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `getResolvedQuantity()` → `QuantityBuilder` [Getter]
- `getQuantityMultiplier()` → `QuantityMultiplierBuilder` [Getter]
- `getFutureValueNotional()` → `FutureValueAmountBuilder` [Getter]
- `getPriceSchedule()` → `List` [Getter]
- `getQuantityReference()` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Getter]
- `getQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateFutureValueNotional()` → `FutureValueAmountBuilder` [Getter]

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
- `getOrCreateDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]
- `setDeliveryDateRollConvention(Offset arg0)` → `RollFeatureBuilder` [Setter]
- `getDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]

### SettlementBase
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementBase` [Builder]
- `getSettlementProvision()` → `SettlementProvision` [Getter]
- `getTransferSettlementType()` → `TransferSettlementEnum` [Getter]
- `getStandardSettlementStyle()` → `StandardSettlementStyleEnum` [Getter]
- `getSettlementType()` → `SettlementTypeEnum` [Getter]
- `getSettlementCentre()` → `SettlementCentreEnum` [Getter]
- `getSettlementDate()` → `SettlementDate` [Getter]
- `getSettlementCurrency()` → `FieldWithMetaString` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### SettlementBaseBuilder
**Implements:** `SettlementBase` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getSettlementProvision()` → `SettlementProvisionBuilder` [Getter]
- `getSettlementDate()` → `SettlementDateBuilder` [Getter]
- `getOrCreateSettlementDate()` → `SettlementDateBuilder` [Getter]
- `setSettlementDate(SettlementDate arg0)` → `SettlementBaseBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setSettlementType(SettlementTypeEnum arg0)` → `SettlementBaseBuilder` [Setter]
- `setTransferSettlementType(TransferSettlementEnum arg0)` → `SettlementBaseBuilder` [Setter]
- `setSettlementProvision(SettlementProvision arg0)` → `SettlementBaseBuilder` [Setter]
- `setSettlementCurrency(FieldWithMetaString arg0)` → `SettlementBaseBuilder` [Setter]
- `setSettlementCurrencyValue(String arg0)` → `SettlementBaseBuilder` [Setter]

### SettlementDate
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementDate` [Builder]
- `getPaymentDelay()` → `Boolean` [Getter]
- `getBusinessDateRange()` → `BusinessDateRange` [Getter]
- `getValueDate()` → `Date` [Getter]
- `getAdjustableDates()` → `AdjustableDates` [Getter]
- `getCashSettlementBusinessDays()` → `Integer` [Getter]
- `getAdjustableOrRelativeDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### SettlementDateBuilder
**Implements:** `SettlementDate` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getBusinessDateRange()` → `BusinessDateRangeBuilder` [Getter]
- `getAdjustableDates()` → `AdjustableDatesBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setPaymentDelay(Boolean arg0)` → `SettlementDateBuilder` [Setter]
- `getOrCreateAdjustableDates()` → `AdjustableDatesBuilder` [Getter]
- `setAdjustableDates(AdjustableDates arg0)` → `SettlementDateBuilder` [Setter]
- `getOrCreateBusinessDateRange()` → `BusinessDateRangeBuilder` [Getter]
- `setAdjustableOrRelativeDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `SettlementDateBuilder` [Setter]
- `getOrCreateAdjustableOrRelativeDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `setCashSettlementBusinessDays(Integer arg0)` → `SettlementDateBuilder` [Setter]

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
- `getOrCreateShapingProvisions()` → `ShapingProvisionBuilder` [Getter]
- `setShapingProvisions(ShapingProvision arg0)` → `SettlementProvisionBuilder` [Setter]

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
- `setSettlementType(SettlementTypeEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setTransferSettlementType(TransferSettlementEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementProvision(SettlementProvision arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrency(FieldWithMetaString arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrencyValue(String arg0)` → `SettlementTermsBuilder` [Setter]
- `setCashSettlementTerms(List arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCentre(SettlementCentreEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setStandardSettlementStyle(StandardSettlementStyleEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setPhysicalSettlementTerms(PhysicalSettlementTerms arg0)` → `SettlementTermsBuilder` [Setter]

### ShapingProvision
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ShapingProvision` [Builder]
- `getShapeSchedule()` → `List` [Getter]

### ShapingProvisionBuilder
**Implements:** `ShapingProvision` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getShapeSchedule()` → `List` [Getter]
- `setShapeSchedule(List arg0)` → `ShapingProvisionBuilder` [Setter]
- `getOrCreateShapeSchedule(int arg0)` → `MoneyBuilder` [Getter]

### ValuationDate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationDate` [Builder]
- `getFxFixingDate()` → `FxFixingDate` [Getter]
- `getMultipleValuationDates()` → `MultipleValuationDates` [Getter]
- `getSingleValuationDate()` → `SingleValuationDate` [Getter]
- `getFxFixingSchedule()` → `AdjustableDates` [Getter]
- `getValuationDate()` → `RelativeDateOffset` [Getter]

### ValuationDateBuilder
**Implements:** `ValuationDate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFxFixingDate()` → `FxFixingDateBuilder` [Getter]
- `setMultipleValuationDates(MultipleValuationDates arg0)` → `ValuationDateBuilder` [Setter]
- `getMultipleValuationDates()` → `MultipleValuationDatesBuilder` [Getter]
- `getOrCreateFxFixingDate()` → `FxFixingDateBuilder` [Getter]
- `getSingleValuationDate()` → `SingleValuationDateBuilder` [Getter]
- `setFxFixingDate(FxFixingDate arg0)` → `ValuationDateBuilder` [Setter]
- `setFxFixingSchedule(AdjustableDates arg0)` → `ValuationDateBuilder` [Setter]
- `getFxFixingSchedule()` → `AdjustableDatesBuilder` [Getter]
- `setSingleValuationDate(SingleValuationDate arg0)` → `ValuationDateBuilder` [Setter]
- `getOrCreateSingleValuationDate()` → `SingleValuationDateBuilder` [Getter]

## Concrete Classes

### AssetFlowBaseBuilderImpl
**Implements:** `AssetFlowBase$AssetFlowBaseBuilder` 

**Fields:**
- `NonNegativeQuantityBuilder quantity`
- `AssetBuilder asset`
- `AdjustableOrAdjustedOrRelativeDateBuilder settlementDate`

**Key Methods:**
- `build()` → `AssetFlowBase` [Builder]
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `getQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `getOrCreateSettlementDate()` → `AdjustableOrAdjustedOrRelativeDateBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getOrCreateQuantity()` → `NonNegativeQuantityBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `setAsset(Asset arg0)` → `AssetFlowBaseBuilder` [Setter]
- `getAsset()` → `AssetBuilder` [Getter]

### AssetFlowBaseImpl
**Implements:** `AssetFlowBase` 

**Key Methods:**
- `build()` → `AssetFlowBase` [Builder]
- `getSettlementDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getQuantity()` → `NonNegativeQuantity` [Getter]
- `setBuilderFields(AssetFlowBaseBuilder arg0)` → `void` [Setter]
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
- `setRecoveryFactor(BigDecimal arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setAccruedInterest(Boolean arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setCashSettlementAmount(Money arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setValuationMethod(ValuationMethod arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setCashSettlementMethod(CashSettlementMethodEnum arg0)` → `CashSettlementTermsBuilder` [Setter]
- `setFixedSettlement(Boolean arg0)` → `CashSettlementTermsBuilder` [Setter]
- `getFixedSettlement()` → `Boolean` [Getter]
- `getCashSettlementMethod()` → `CashSettlementMethodEnum` [Getter]

### CashSettlementTermsImpl
**Implements:** `CashSettlementTerms` 

**Key Methods:**
- `build()` → `CashSettlementTerms` [Builder]
- `setBuilderFields(CashSettlementTermsBuilder arg0)` → `void` [Setter]
- `getFixedSettlement()` → `Boolean` [Getter]
- `getCashSettlementMethod()` → `CashSettlementMethodEnum` [Getter]
- `getValuationMethod()` → `ValuationMethod` [Getter]
- `getCashSettlementAmount()` → `Money` [Getter]
- `getRecoveryFactor()` → `BigDecimal` [Getter]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationDate()` → `ValuationDate` [Getter]
- `getAccruedInterest()` → `Boolean` [Getter]

### CashflowBuilderImpl
**Extends:** `AssetFlowBase$AssetFlowBaseBuilderImpl` 
**Implements:** `Cashflow$CashflowBuilder` 

**Fields:**
- `PayerReceiverBuilder payerReceiver`
- `CashflowTypeBuilder cashflowType`
- `PaymentDiscountingBuilder paymentDiscounting`

**Key Methods:**
- `build()` → `Cashflow` [Builder]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)` → `CashflowBuilder` [Setter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setQuantity(NonNegativeQuantity arg0)` → `CashflowBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `CashflowBuilder` [Setter]
- `getOrCreatePaymentDiscounting()` → `PaymentDiscountingBuilder` [Getter]
- `setCashflowType(CashflowType arg0)` → `CashflowBuilder` [Setter]
- `setAsset(Asset arg0)` → `CashflowBuilder` [Setter]
- `getCashflowType()` → `CashflowTypeBuilder` [Getter]

### CashflowImpl
**Extends:** `AssetFlowBase$AssetFlowBaseImpl` 
**Implements:** `Cashflow` 

**Key Methods:**
- `build()` → `Cashflow` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `setBuilderFields(CashflowBuilder arg0)` → `void` [Setter]
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
- `getOrCreateCashPrice()` → `CashPriceBuilder` [Getter]
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `setCashPrice(CashPrice arg0)` → `CashflowTypeBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `CashflowTypeBuilder` [Setter]
- `setCashflowType(ScheduledTransferEnum arg0)` → `CashflowTypeBuilder` [Setter]
- `getCashflowType()` → `ScheduledTransferEnum` [Getter]

### CashflowTypeImpl
**Implements:** `CashflowType` 

**Key Methods:**
- `build()` → `CashflowType` [Builder]
- `getCashPrice()` → `CashPrice` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
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
- `getConversionFactor()` → `BigDecimal` [Getter]
- `setRounding(Rounding arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `getOrCreateRounding()` → `RoundingBuilder` [Getter]
- `getOrCreateRollFeature()` → `RollFeatureBuilder` [Getter]
- `getOrCreateSpread()` → `SpreadScheduleBuilder` [Getter]
- `getRollFeature()` → `RollFeatureBuilder` [Getter]
- `getRounding()` → `RoundingBuilder` [Getter]
- `setRollFeature(RollFeature arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]
- `setConversionFactor(BigDecimal arg0)` → `CommodityPriceReturnTermsBuilder` [Setter]

### CommodityPriceReturnTermsImpl
**Implements:** `CommodityPriceReturnTerms` 

**Key Methods:**
- `build()` → `CommodityPriceReturnTerms` [Builder]
- `getConversionFactor()` → `BigDecimal` [Getter]
- `setBuilderFields(CommodityPriceReturnTermsBuilder arg0)` → `void` [Setter]
- `getRollFeature()` → `RollFeature` [Getter]
- `getRounding()` → `Rounding` [Getter]
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
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `ComputedAmountBuilder` [Setter]
- `setAmount(BigDecimal arg0)` → `ComputedAmountBuilder` [Setter]
- `getAmount()` → `BigDecimal` [Getter]
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
- `getListed()` → `Boolean` [Getter]
- `getAcceleratedOrMatured()` → `Boolean` [Getter]
- `getCategory()` → `ObligationCategoryEnum` [Getter]
- `getDirectLoanParticipation()` → `LoanParticipationBuilder` [Getter]
- `getExcluded()` → `String` [Getter]
- `setListed(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `getOrCreateAssignableLoan()` → `PCDeliverableObligationCharacBuilder` [Getter]
- `setNotContingent(Boolean arg0)` → `DeliverableObligationsBuilder` [Setter]
- `setNotDomesticCurrency(NotDomesticCurrency arg0)` → `DeliverableObligationsBuilder` [Setter]

### DeliverableObligationsImpl
**Implements:** `DeliverableObligations` 

**Key Methods:**
- `build()` → `DeliverableObligations` [Builder]
- `getListed()` → `Boolean` [Getter]
- `getAcceleratedOrMatured()` → `Boolean` [Getter]
- `getCategory()` → `ObligationCategoryEnum` [Getter]
- `getDirectLoanParticipation()` → `LoanParticipation` [Getter]
- `getExcluded()` → `String` [Getter]
- `setBuilderFields(DeliverableObligationsBuilder arg0)` → `void` [Setter]
- `getOthReferenceEntityObligations()` → `String` [Getter]
- `getIndirectLoanParticipation()` → `LoanParticipation` [Getter]
- `getFullFaithAndCreditObLiability()` → `Boolean` [Getter]

### FixedPriceBuilderImpl
**Implements:** `FixedPrice$FixedPriceBuilder` 

**Fields:**
- `ReferenceWithMetaPriceScheduleBuilder price`

**Key Methods:**
- `build()` → `FixedPrice` [Builder]
- `getOrCreatePrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]
- `setPriceValue(PriceSchedule arg0)` → `FixedPriceBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `FixedPriceBuilder` [Setter]
- `getPrice()` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]

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
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `setBusinessDayConvention(BusinessDayConventionEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `setBusinessCenters(BusinessCenters arg0)` → `FxFixingDateBuilder` [Setter]
- `getOrCreateBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `getBusinessCenters()` → `BusinessCentersBuilder` [Getter]
- `setDayType(DayTypeEnum arg0)` → `FxFixingDateBuilder` [Setter]
- `getFxFixingDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateFxFixingDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setFxFixingDate(AdjustableOrRelativeDate arg0)` → `FxFixingDateBuilder` [Setter]

### FxFixingDateImpl
**Extends:** `Offset$OffsetImpl` 
**Implements:** `FxFixingDate` 

**Key Methods:**
- `build()` → `FxFixingDate` [Builder]
- `getBusinessDayConvention()` → `BusinessDayConventionEnum` [Getter]
- `getBusinessCenters()` → `BusinessCenters` [Getter]
- `setBuilderFields(FxFixingDateBuilder arg0)` → `void` [Setter]
- `getFxFixingDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDateRelativeToValuationDates()` → `DateRelativeToValuationDates` [Getter]
- `getDateRelativeToPaymentDates()` → `DateRelativeToPaymentDates` [Getter]
- `getDateRelativeToCalculationPeriodDates()` → `DateRelativeToCalculationPeriodDates` [Getter]
- `getBusinessCentersReference()` → `ReferenceWithMetaBusinessCenters` [Getter]

### LoanParticipationBuilderImpl
**Extends:** `PCDeliverableObligationCharac$PCDeliverableObligationCharacBuilderImpl` 
**Implements:** `LoanParticipation$LoanParticipationBuilder` 

**Fields:**
- `String qualifyingParticipationSeller`

**Key Methods:**
- `build()` → `LoanParticipation` [Builder]
- `setPartialCashSettlement(Boolean arg0)` → `LoanParticipationBuilder` [Setter]
- `setQualifyingParticipationSeller(String arg0)` → `LoanParticipationBuilder` [Setter]
- `getQualifyingParticipationSeller()` → `String` [Getter]
- `setApplicable(Boolean arg0)` → `LoanParticipationBuilder` [Setter]

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
- `setPartialCashSettlement(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `PCDeliverableObligationCharacBuilder` [Setter]
- `getPartialCashSettlement()` → `Boolean` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### PCDeliverableObligationCharacImpl
**Implements:** `PCDeliverableObligationCharac` 

**Key Methods:**
- `build()` → `PCDeliverableObligationCharac` [Builder]
- `setBuilderFields(PCDeliverableObligationCharacBuilder arg0)` → `void` [Setter]
- `getPartialCashSettlement()` → `Boolean` [Getter]
- `getApplicable()` → `Boolean` [Getter]

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
- `setPaymentAmount(Money arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreatePaymentRule()` → `PaymentRuleBuilder` [Getter]
- `getOrCreatePaymentAmount()` → `MoneyBuilder` [Getter]
- `setPaymentDate(AdjustableOrRelativeDate arg0)` → `PaymentDetailBuilder` [Setter]
- `getPaymentRule()` → `PaymentRuleBuilder` [Getter]
- `getOrCreatePaymentDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setPaymentRule(PaymentRule arg0)` → `PaymentDetailBuilder` [Setter]

### PaymentDetailImpl
**Implements:** `PaymentDetail` 

**Key Methods:**
- `build()` → `PaymentDetail` [Builder]
- `setBuilderFields(PaymentDetailBuilder arg0)` → `void` [Setter]
- `getPaymentDate()` → `AdjustableOrRelativeDate` [Getter]
- `getPaymentRule()` → `PaymentRule` [Getter]
- `getPaymentAmount()` → `Money` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PaymentDiscountingBuilderImpl
**Implements:** `PaymentDiscounting$PaymentDiscountingBuilder` 

**Fields:**
- `BigDecimal discountFactor`
- `MoneyBuilder presentValueAmount`

**Key Methods:**
- `build()` → `PaymentDiscounting` [Builder]
- `setPresentValueAmount(Money arg0)` → `PaymentDiscountingBuilder` [Setter]
- `getPresentValueAmount()` → `MoneyBuilder` [Getter]
- `setDiscountFactor(BigDecimal arg0)` → `PaymentDiscountingBuilder` [Setter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
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
- `getOrCreatePercentageRule()` → `PercentageRuleBuilder` [Getter]
- `setPercentageRule(PercentageRule arg0)` → `PaymentRuleBuilder` [Setter]

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
- `getPriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]
- `getOrCreateSettlementTerms()` → `SettlementTermsBuilder` [Getter]
- `getPrincipalPayment()` → `PrincipalPaymentsBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `PayoutBaseBuilder` [Setter]
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PayoutBaseBuilder` [Setter]
- `getOrCreatePrincipalPayment()` → `PrincipalPaymentsBuilder` [Getter]
- `getOrCreatePriceQuantity()` → `ResolvablePriceQuantityBuilder` [Getter]

### PayoutBaseImpl
**Implements:** `PayoutBase` 

**Key Methods:**
- `build()` → `PayoutBase` [Builder]
- `getPriceQuantity()` → `ResolvablePriceQuantity` [Getter]
- `getPrincipalPayment()` → `PrincipalPayments` [Getter]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `setBuilderFields(PayoutBaseBuilder arg0)` → `void` [Setter]
- `getSettlementTerms()` → `SettlementTerms` [Getter]

### PercentageRuleBuilderImpl
**Implements:** `PercentageRule$PercentageRuleBuilder` 

**Fields:**
- `BigDecimal paymentPercent`
- `ReferenceWithMetaMoneyBuilder notionalAmountReference`

**Key Methods:**
- `build()` → `PercentageRule` [Builder]
- `getOrCreateNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setNotionalAmountReferenceValue(Money arg0)` → `PercentageRuleBuilder` [Setter]
- `getPaymentPercent()` → `BigDecimal` [Getter]
- `getNotionalAmountReference()` → `ReferenceWithMetaMoneyBuilder` [Getter]
- `setPaymentPercent(BigDecimal arg0)` → `PercentageRuleBuilder` [Setter]
- `setNotionalAmountReference(ReferenceWithMetaMoney arg0)` → `PercentageRuleBuilder` [Setter]

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
- `getBusinessDays()` → `Integer` [Getter]
- `getMaximumBusinessDays()` → `Integer` [Getter]
- `setBusinessDays(Integer arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `setMaximumBusinessDays(Integer arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `setBusinessDaysNotSpecified(Boolean arg0)` → `PhysicalSettlementPeriodBuilder` [Setter]
- `getBusinessDaysNotSpecified()` → `Boolean` [Getter]

### PhysicalSettlementPeriodImpl
**Implements:** `PhysicalSettlementPeriod` 

**Key Methods:**
- `build()` → `PhysicalSettlementPeriod` [Builder]
- `getBusinessDays()` → `Integer` [Getter]
- `getMaximumBusinessDays()` → `Integer` [Getter]
- `setBuilderFields(PhysicalSettlementPeriodBuilder arg0)` → `void` [Setter]
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
- `setEscrow(Boolean arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setDeliverableObligations(DeliverableObligations arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getOrCreateDeliverableObligations()` → `DeliverableObligationsBuilder` [Getter]
- `setPhysicalSettlementPeriod(PhysicalSettlementPeriod arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `setClearedPhysicalSettlement(Boolean arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `setPredeterminedClearingOrganizationParty(AncillaryRoleEnum arg0)` → `PhysicalSettlementTermsBuilder` [Setter]
- `getOrCreatePhysicalSettlementPeriod()` → `PhysicalSettlementPeriodBuilder` [Getter]
- `setSixtyBusinessDaySettlementCap(Boolean arg0)` → `PhysicalSettlementTermsBuilder` [Setter]

### PhysicalSettlementTermsImpl
**Implements:** `PhysicalSettlementTerms` 

**Key Methods:**
- `build()` → `PhysicalSettlementTerms` [Builder]
- `setBuilderFields(PhysicalSettlementTermsBuilder arg0)` → `void` [Setter]
- `getPredeterminedClearingOrganizationParty()` → `AncillaryRoleEnum` [Getter]
- `getSixtyBusinessDaySettlementCap()` → `Boolean` [Getter]
- `getClearedPhysicalSettlement()` → `Boolean` [Getter]
- `getEscrow()` → `Boolean` [Getter]
- `getPhysicalSettlementPeriod()` → `PhysicalSettlementPeriod` [Getter]
- `getDeliverableObligations()` → `DeliverableObligations` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PricingDatesBuilderImpl
**Implements:** `PricingDates$PricingDatesBuilder` 

**Fields:**
- `List (List) specifiedDates`
- `ParametricDatesBuilder parametricDates`

**Key Methods:**
- `build()` → `PricingDates` [Builder]
- `getSpecifiedDates()` → `List` [Getter]
- `getOrCreateSpecifiedDates(int arg0)` → `AdjustableDatesBuilder` [Getter]
- `setSpecifiedDates(List arg0)` → `PricingDatesBuilder` [Setter]
- `getOrCreateParametricDates()` → `ParametricDatesBuilder` [Getter]
- `getParametricDates()` → `ParametricDatesBuilder` [Getter]
- `setParametricDates(ParametricDates arg0)` → `PricingDatesBuilder` [Setter]

### PricingDatesImpl
**Implements:** `PricingDates` 

**Key Methods:**
- `build()` → `PricingDates` [Builder]
- `setBuilderFields(PricingDatesBuilder arg0)` → `void` [Setter]
- `getSpecifiedDates()` → `List` [Getter]
- `getParametricDates()` → `ParametricDates` [Getter]

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
- `getPayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `getOrCreatePayerReceiver()` → `PayerReceiverBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getPresentValuePrincipalAmount()` → `MoneyBuilder` [Getter]
- `getOrCreatePrincipalPaymentDate()` → `AdjustableDateBuilder` [Getter]
- `setPresentValuePrincipalAmount(Money arg0)` → `PrincipalPaymentBuilder` [Setter]
- `getOrCreatePresentValuePrincipalAmount()` → `MoneyBuilder` [Getter]
- `setDiscountFactor(BigDecimal arg0)` → `PrincipalPaymentBuilder` [Setter]

### PrincipalPaymentImpl
**Implements:** `PrincipalPayment` 

**Key Methods:**
- `build()` → `PrincipalPayment` [Builder]
- `getPayerReceiver()` → `PayerReceiver` [Getter]
- `setBuilderFields(PrincipalPaymentBuilder arg0)` → `void` [Setter]
- `getPresentValuePrincipalAmount()` → `Money` [Getter]
- `getDiscountFactor()` → `BigDecimal` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getPrincipalPaymentDate()` → `AdjustableDate` [Getter]
- `getPrincipalAmount()` → `Money` [Getter]

### PrincipalPaymentScheduleBuilderImpl
**Implements:** `PrincipalPaymentSchedule$PrincipalPaymentScheduleBuilder` 

**Fields:**
- `PrincipalPaymentBuilder initialPrincipalPayment`
- `AdjustableRelativeOrPeriodicDatesBuilder intermediatePrincipalPayment`
- `PrincipalPaymentBuilder finalPrincipalPayment`

**Key Methods:**
- `build()` → `PrincipalPaymentSchedule` [Builder]
- `getInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `setFinalPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `setInitialPrincipalPayment(PrincipalPayment arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]
- `getOrCreateFinalPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getOrCreateInitialPrincipalPayment()` → `PrincipalPaymentBuilder` [Getter]
- `getOrCreateIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getIntermediatePrincipalPayment()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setIntermediatePrincipalPayment(AdjustableRelativeOrPeriodicDates arg0)` → `PrincipalPaymentScheduleBuilder` [Setter]

### PrincipalPaymentScheduleImpl
**Implements:** `PrincipalPaymentSchedule` 

**Key Methods:**
- `build()` → `PrincipalPaymentSchedule` [Builder]
- `getInitialPrincipalPayment()` → `PrincipalPayment` [Getter]
- `getFinalPrincipalPayment()` → `PrincipalPayment` [Getter]
- `setBuilderFields(PrincipalPaymentScheduleBuilder arg0)` → `void` [Setter]
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
- `setInitialPayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setIntermediatePayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setFinalPayment(Boolean arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setVaryingLegNotionalCurrency(List arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `setPrincipalPaymentSchedule(PrincipalPaymentSchedule arg0)` → `PrincipalPaymentsBuilder` [Setter]
- `getOrCreatePrincipalPaymentSchedule()` → `PrincipalPaymentScheduleBuilder` [Getter]
- `getIntermediatePayment()` → `Boolean` [Getter]
- `getFinalPayment()` → `Boolean` [Getter]

### PrincipalPaymentsImpl
**Implements:** `PrincipalPayments` 

**Key Methods:**
- `build()` → `PrincipalPayments` [Builder]
- `setBuilderFields(PrincipalPaymentsBuilder arg0)` → `void` [Setter]
- `getIntermediatePayment()` → `Boolean` [Getter]
- `getFinalPayment()` → `Boolean` [Getter]
- `getInitialPayment()` → `Boolean` [Getter]
- `getVaryingLegNotionalCurrency()` → `List` [Getter]
- `getPrincipalPaymentSchedule()` → `PrincipalPaymentSchedule` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### QuantityMultiplierBuilderImpl
**Implements:** `QuantityMultiplier$QuantityMultiplierBuilder` 

**Fields:**
- `FxLinkedNotionalScheduleBuilder fxLinkedNotionalSchedule`
- `BigDecimal multiplierValue`

**Key Methods:**
- `build()` → `QuantityMultiplier` [Builder]
- `getOrCreateFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]
- `setFxLinkedNotionalSchedule(FxLinkedNotionalSchedule arg0)` → `QuantityMultiplierBuilder` [Setter]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalScheduleBuilder` [Getter]
- `getMultiplierValue()` → `BigDecimal` [Getter]
- `setMultiplierValue(BigDecimal arg0)` → `QuantityMultiplierBuilder` [Setter]

### QuantityMultiplierImpl
**Implements:** `QuantityMultiplier` 

**Key Methods:**
- `build()` → `QuantityMultiplier` [Builder]
- `setBuilderFields(QuantityMultiplierBuilder arg0)` → `void` [Setter]
- `getFxLinkedNotionalSchedule()` → `FxLinkedNotionalSchedule` [Getter]
- `getMultiplierValue()` → `BigDecimal` [Getter]

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
- `setReset(Boolean arg0)` → `ResolvablePriceQuantityBuilder` [Setter]
- `getReset()` → `Boolean` [Getter]
- `getResolvedQuantity()` → `QuantityBuilder` [Getter]
- `getQuantityMultiplier()` → `QuantityMultiplierBuilder` [Getter]
- `getFutureValueNotional()` → `FutureValueAmountBuilder` [Getter]
- `getPriceSchedule()` → `List` [Getter]
- `getQuantityReference()` → `ReferenceWithMetaResolvablePriceQuantityBuilder` [Getter]
- `getQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

### ResolvablePriceQuantityImpl
**Implements:** `ResolvablePriceQuantity` 

**Key Methods:**
- `build()` → `ResolvablePriceQuantity` [Builder]
- `getReset()` → `Boolean` [Getter]
- `getResolvedQuantity()` → `Quantity` [Getter]
- `getQuantityMultiplier()` → `QuantityMultiplier` [Getter]
- `getFutureValueNotional()` → `FutureValueAmount` [Getter]
- `getPriceSchedule()` → `List` [Getter]
- `getQuantityReference()` → `ReferenceWithMetaResolvablePriceQuantity` [Getter]
- `getQuantitySchedule()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `setBuilderFields(ResolvablePriceQuantityBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### RollFeatureBuilderImpl
**Implements:** `RollFeature$RollFeatureBuilder` 

**Fields:**
- `RollSourceCalendarEnum rollSourceCalendar`
- `OffsetBuilder deliveryDateRollConvention`

**Key Methods:**
- `build()` → `RollFeature` [Builder]
- `getRollSourceCalendar()` → `RollSourceCalendarEnum` [Getter]
- `setRollSourceCalendar(RollSourceCalendarEnum arg0)` → `RollFeatureBuilder` [Setter]
- `getOrCreateDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]
- `setDeliveryDateRollConvention(Offset arg0)` → `RollFeatureBuilder` [Setter]
- `getDeliveryDateRollConvention()` → `OffsetBuilder` [Getter]

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
- `getSettlementProvision()` → `SettlementProvisionBuilder` [Getter]
- `getTransferSettlementType()` → `TransferSettlementEnum` [Getter]
- `getStandardSettlementStyle()` → `StandardSettlementStyleEnum` [Getter]
- `getSettlementType()` → `SettlementTypeEnum` [Getter]
- `getSettlementCentre()` → `SettlementCentreEnum` [Getter]
- `getSettlementDate()` → `SettlementDateBuilder` [Getter]
- `getOrCreateSettlementDate()` → `SettlementDateBuilder` [Getter]
- `setSettlementDate(SettlementDate arg0)` → `SettlementBaseBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

### SettlementBaseImpl
**Implements:** `SettlementBase` 

**Key Methods:**
- `build()` → `SettlementBase` [Builder]
- `getSettlementProvision()` → `SettlementProvision` [Getter]
- `getTransferSettlementType()` → `TransferSettlementEnum` [Getter]
- `getStandardSettlementStyle()` → `StandardSettlementStyleEnum` [Getter]
- `getSettlementType()` → `SettlementTypeEnum` [Getter]
- `getSettlementCentre()` → `SettlementCentreEnum` [Getter]
- `getSettlementDate()` → `SettlementDate` [Getter]
- `setBuilderFields(SettlementBaseBuilder arg0)` → `void` [Setter]
- `getSettlementCurrency()` → `FieldWithMetaString` [Getter]
- `getMeta()` → `MetaFields` [Getter]

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
- `getPaymentDelay()` → `Boolean` [Getter]
- `getBusinessDateRange()` → `BusinessDateRangeBuilder` [Getter]
- `getValueDate()` → `Date` [Getter]
- `getAdjustableDates()` → `AdjustableDatesBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setPaymentDelay(Boolean arg0)` → `SettlementDateBuilder` [Setter]
- `getOrCreateAdjustableDates()` → `AdjustableDatesBuilder` [Getter]
- `setAdjustableDates(AdjustableDates arg0)` → `SettlementDateBuilder` [Setter]
- `getCashSettlementBusinessDays()` → `Integer` [Getter]

### SettlementDateImpl
**Implements:** `SettlementDate` 

**Key Methods:**
- `build()` → `SettlementDate` [Builder]
- `getPaymentDelay()` → `Boolean` [Getter]
- `getBusinessDateRange()` → `BusinessDateRange` [Getter]
- `getValueDate()` → `Date` [Getter]
- `getAdjustableDates()` → `AdjustableDates` [Getter]
- `setBuilderFields(SettlementDateBuilder arg0)` → `void` [Setter]
- `getCashSettlementBusinessDays()` → `Integer` [Getter]
- `getAdjustableOrRelativeDate()` → `AdjustableOrAdjustedOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### SettlementProvisionBuilderImpl
**Implements:** `SettlementProvision$SettlementProvisionBuilder` 

**Fields:**
- `ShapingProvisionBuilder shapingProvisions`

**Key Methods:**
- `build()` → `SettlementProvision` [Builder]
- `getShapingProvisions()` → `ShapingProvisionBuilder` [Getter]
- `getOrCreateShapingProvisions()` → `ShapingProvisionBuilder` [Getter]
- `setShapingProvisions(ShapingProvision arg0)` → `SettlementProvisionBuilder` [Setter]

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
- `setSettlementType(SettlementTypeEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setTransferSettlementType(TransferSettlementEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementProvision(SettlementProvision arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrency(FieldWithMetaString arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCurrencyValue(String arg0)` → `SettlementTermsBuilder` [Setter]
- `setCashSettlementTerms(List arg0)` → `SettlementTermsBuilder` [Setter]
- `setSettlementCentre(SettlementCentreEnum arg0)` → `SettlementTermsBuilder` [Setter]
- `setStandardSettlementStyle(StandardSettlementStyleEnum arg0)` → `SettlementTermsBuilder` [Setter]

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
- `getShapeSchedule()` → `List` [Getter]
- `setShapeSchedule(List arg0)` → `ShapingProvisionBuilder` [Setter]
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
- `getFxFixingDate()` → `FxFixingDateBuilder` [Getter]
- `setMultipleValuationDates(MultipleValuationDates arg0)` → `ValuationDateBuilder` [Setter]
- `getMultipleValuationDates()` → `MultipleValuationDatesBuilder` [Getter]
- `getOrCreateFxFixingDate()` → `FxFixingDateBuilder` [Getter]
- `getSingleValuationDate()` → `SingleValuationDateBuilder` [Getter]
- `setFxFixingDate(FxFixingDate arg0)` → `ValuationDateBuilder` [Setter]
- `setFxFixingSchedule(AdjustableDates arg0)` → `ValuationDateBuilder` [Setter]
- `getFxFixingSchedule()` → `AdjustableDatesBuilder` [Getter]
- `setSingleValuationDate(SingleValuationDate arg0)` → `ValuationDateBuilder` [Setter]

### ValuationDateImpl
**Implements:** `ValuationDate` 

**Key Methods:**
- `build()` → `ValuationDate` [Builder]
- `setBuilderFields(ValuationDateBuilder arg0)` → `void` [Setter]
- `getFxFixingDate()` → `FxFixingDate` [Getter]
- `getMultipleValuationDates()` → `MultipleValuationDates` [Getter]
- `getSingleValuationDate()` → `SingleValuationDate` [Getter]
- `getFxFixingSchedule()` → `AdjustableDates` [Getter]
- `getValuationDate()` → `RelativeDateOffset` [Getter]

