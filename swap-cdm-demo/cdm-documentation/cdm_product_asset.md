# Package: cdm.product.asset

## Enums

### BankHolidayTreatmentEnum
**Values:**
- `AsWeekday`
- `AsWeekend`

### CompoundingMethodEnum
**Values:**
- `Flat`
- `None`
- `Straight`
- `SpreadExclusive`

### CreditSeniorityEnum
**Values:**
- `Other`
- `SeniorLossAbsorbingCapacity`
- `SeniorSec`
- `SeniorUnSec`
- `SubLowerTier2`
- `SubTier1`
- `SubTier3`
- `SubUpperTier2`

### DayDistributionEnum
**Values:**
- `All`
- `First`
- `Last`
- `Penultimate`

### DiscountingTypeEnum
**Values:**
- `Standard`
- `FRA`
- `FRAYield`
- `AFMA`

### DividendAmountTypeEnum
**Values:**
- `RecordAmount`
- `ExAmount`
- `PaidAmount`
- `AsSpecifiedInMasterConfirmation`

### DividendCompositionEnum
**Values:**
- `EquityAmountReceiverElection`
- `CalculationAgentElection`

### DividendDateReferenceEnum
**Values:**
- `AdHocDate`
- `CashSettlementPaymentDate`
- `CashSettlePaymentDateExDiv`
- `CashSettlePaymentDateIssuerPayment`
- `CumulativeEquityExDiv`
- `CumulativeEquityPaid`
- `CumulativeEquityExDivBeforeReset`
- `CumulativeEquityPaidBeforeReset`
- `CumulativeEquityPaidInclReset`
- `CumulativeInterestExDiv`
- `CumulativeInterestPaid`
- `CumulativeInterestPaidInclReset`
- `CumulativeInterestPaidBeforeReset`
- `DividendPaymentDate`
- `DividendValuationDate`
- `EquityPaymentDate`
- `ExDate`
- `FloatingAmountPaymentDate`
- `FollowingPaymentDate`
- `RecordDate`
- `SharePayment`
- `TerminationDate`
- `TradeDate`
- `UnwindOrEquityExDiv`
- `UnwindOrEquityPaid`
- `UnwindOrInterestExDiv`
- `UnwindOrInterestPaid`
- `UnwindExDiv`
- `UnwindPaid`

### DividendEntitlementEnum
**Values:**
- `ExDate`
- `RecordDate`

### DividendPeriodEnum
**Values:**
- `FirstPeriod`
- `SecondPeriod`

### FPVFinalPriceElectionFallbackEnum
**Values:**
- `FPVClose`
- `FPVHedgeExecution`

### FinalPrincipalExchangeCalculationEnum
**Values:**
- `Floored`
- `NonFloored`

### IndexAnnexSourceEnum
**Values:**
- `MasterConfirmation`
- `Publisher`

### InterestShortfallCapEnum
**Values:**
- `Fixed`
- `Variable`

### LoadTypeEnum
**Values:**
- `BaseLoad`
- `PeakLoad`
- `OffPeak`
- `BlockHours`
- `Shaped`
- `GasDay`
- `Other`

### NegativeInterestRateTreatmentEnum
**Values:**
- `NegativeInterestRateMethod`
- `ZeroInterestRateMethod`
- `ZeroInterestRateExcludingSpreadMethod`

### NonCashDividendTreatmentEnum
**Values:**
- `PotentialAdjustmentEvent`
- `CashEquivalent`

### RateTreatmentEnum
**Values:**
- `BondEquivalentYield`
- `MoneyMarketYield`

### RealisedVarianceMethodEnum
**Values:**
- `Previous`
- `Last`
- `Both`

### ReturnTypeEnum
**Values:**
- `Price`
- `Total`

### RollSourceCalendarEnum
**Values:**
- `ListedOption`
- `Future`

### SettledEntityMatrixSourceEnum
**Values:**
- `ConfirmationAnnex`
- `NotApplicable`
- `Publisher`

### SpreadCalculationMethodEnum
**Values:**
- `ParPar`
- `Proceeds`

### SpreadScheduleTypeEnum
**Values:**
- `Long`
- `Short`

## Interfaces

### AdditionalFixedPayments
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AdditionalFixedPayments` [Builder]
- `getPrincipalShortfallReimbursement()` → `Boolean` [Getter]
- `getInterestShortfallReimbursement()` → `Boolean` [Getter]
- `getWritedownReimbursement()` → `Boolean` [Getter]

### AdditionalFixedPaymentsBuilder
**Implements:** `AdditionalFixedPayments` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setWritedownReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `setPrincipalShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `setInterestShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]

### AssetDeliveryInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getLocation()` → `List` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `AssetDeliveryInformation` [Builder]
- `getPeriods()` → `AssetDeliveryPeriods` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]

### AssetDeliveryInformationBuilder
**Implements:** `AssetDeliveryInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getLocation()` → `List` [Getter]
- `setLocation(List arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getPeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getOrCreatePeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `getOrCreateLocation(int arg0)` → `LocationIdentifierBuilder` [Getter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setPeriods(AssetDeliveryPeriods arg0)` → `AssetDeliveryInformationBuilder` [Setter]

### AssetDeliveryPeriods
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetDeliveryPeriods` [Builder]
- `getProfile()` → `List` [Getter]
- `getEndDate()` → `Date` [Getter]
- `getStartDate()` → `Date` [Getter]

### AssetDeliveryPeriodsBuilder
**Implements:** `AssetDeliveryPeriods` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateProfile(int arg0)` → `AssetDeliveryProfileBuilder` [Getter]
- `getProfile()` → `List` [Getter]
- `setEndDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `setStartDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `setProfile(List arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]

### AssetDeliveryProfile
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetDeliveryProfile` [Builder]
- `getLoadType()` → `LoadTypeEnum` [Getter]
- `getBankHolidaysTreatment()` → `BankHolidayTreatmentEnum` [Getter]
- `getBlock()` → `List` [Getter]

### AssetDeliveryProfileBlock
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetDeliveryProfileBlock` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `getStartTime()` → `LocalTime` [Getter]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]
- `getEndTime()` → `LocalTime` [Getter]

### AssetDeliveryProfileBlockBuilder
**Implements:** `AssetDeliveryProfileBlock` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDayOfWeek(List arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `setStartTime(LocalTime arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreatePriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `setPriceTimeIntervalQuantity(Price arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `setEndTime(LocalTime arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]

### AssetDeliveryProfileBuilder
**Implements:** `AssetDeliveryProfile` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBankHolidaysTreatment(BankHolidayTreatmentEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getOrCreateBlock(int arg0)` → `AssetDeliveryProfileBlockBuilder` [Getter]
- `setLoadType(LoadTypeEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getBlock()` → `List` [Getter]
- `setBlock(List arg0)` → `AssetDeliveryProfileBuilder` [Setter]

### BasketReferenceInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BasketReferenceInformation` [Builder]
- `getBasketName()` → `FieldWithMetaString` [Getter]
- `getBasketId()` → `List` [Getter]
- `getReferencePool()` → `ReferencePool` [Getter]
- `getNthToDefault()` → `Integer` [Getter]
- `getMthToDefault()` → `Integer` [Getter]
- `getTranche()` → `Tranche` [Getter]

### BasketReferenceInformationBuilder
**Implements:** `BasketReferenceInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getBasketName()` → `FieldWithMetaStringBuilder` [Getter]
- `getBasketId()` → `List` [Getter]
- `getReferencePool()` → `ReferencePoolBuilder` [Getter]
- `getOrCreateReferencePool()` → `ReferencePoolBuilder` [Getter]
- `setBasketName(FieldWithMetaString arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `getOrCreateBasketName()` → `FieldWithMetaStringBuilder` [Getter]
- `setBasketNameValue(String arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `getOrCreateBasketId(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setBasketIdValue(List arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setReferencePool(ReferencePool arg0)` → `BasketReferenceInformationBuilder` [Setter]

### BondReference
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BondReference` [Builder]
- `getConditionPrecedentBond()` → `Boolean` [Getter]
- `getDiscrepancyClause()` → `Boolean` [Getter]
- `getCouponRate()` → `FixedRateSpecification` [Getter]
- `getBond()` → `Security` [Getter]

### BondReferenceBuilder
**Implements:** `BondReference` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateBond()` → `SecurityBuilder` [Getter]
- `getOrCreateCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `setDiscrepancyClause(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `setConditionPrecedentBond(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `getCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `setCouponRate(FixedRateSpecification arg0)` → `BondReferenceBuilder` [Setter]
- `getBond()` → `SecurityBuilder` [Getter]
- `setBond(Security arg0)` → `BondReferenceBuilder` [Setter]

### BoundedCorrelation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BoundedCorrelation` [Builder]
- `getMaximumBoundaryPercent()` → `BigDecimal` [Getter]
- `getMinimumBoundaryPercent()` → `BigDecimal` [Getter]

### BoundedCorrelationBuilder
**Implements:** `BoundedCorrelation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMaximumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]
- `setMinimumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]

### BoundedVariance
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BoundedVariance` [Builder]
- `getRealisedVarianceMethod()` → `RealisedVarianceMethodEnum` [Getter]
- `getDaysInRangeAdjustment()` → `Boolean` [Getter]
- `getUpperBarrier()` → `BigDecimal` [Getter]
- `getLowerBarrier()` → `BigDecimal` [Getter]

### BoundedVarianceBuilder
**Implements:** `BoundedVariance` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRealisedVarianceMethod(RealisedVarianceMethodEnum arg0)` → `BoundedVarianceBuilder` [Setter]
- `setDaysInRangeAdjustment(Boolean arg0)` → `BoundedVarianceBuilder` [Setter]
- `setUpperBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]
- `setLowerBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]

### CalculationScheduleDeliveryPeriods
**Implements:** `AssetDeliveryPeriods` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationScheduleDeliveryPeriods` [Builder]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]

### CalculationScheduleDeliveryPeriodsBuilder
**Implements:** `CalculationScheduleDeliveryPeriods` `AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder` 

**Key Methods:**
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setEndDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setStartDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreatePriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `setPriceTimeIntervalQuantity(Price arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setProfile(List arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]

### CashflowRepresentation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashflowRepresentation` [Builder]
- `getCashflowsMatchParameters()` → `Boolean` [Getter]
- `getPaymentCalculationPeriod()` → `List` [Getter]

### CashflowRepresentationBuilder
**Implements:** `CashflowRepresentation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPaymentCalculationPeriod()` → `List` [Getter]
- `setPaymentCalculationPeriod(List arg0)` → `CashflowRepresentationBuilder` [Setter]
- `setCashflowsMatchParameters(Boolean arg0)` → `CashflowRepresentationBuilder` [Setter]
- `getOrCreatePaymentCalculationPeriod(int arg0)` → `PaymentCalculationPeriodBuilder` [Getter]

### CommodityPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CommodityPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `getCommodityPriceReturnTerms()` → `CommodityPriceReturnTerms` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getFxFeature()` → `FxFeature` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]

### CommodityPayoutBuilder
**Implements:** `CommodityPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `CommodityPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `CommodityPayoutBuilder` [Setter]
- `getCommodityPriceReturnTerms()` → `CommodityPriceReturnTermsBuilder` [Getter]
- `getOrCreateAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `CommodityPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `CommodityPayoutBuilder` [Setter]
- `setPaymentDates(PaymentDates arg0)` → `CommodityPayoutBuilder` [Setter]
- `getPaymentDates()` → `PaymentDatesBuilder` [Getter]

### CorrelationReturnTerms
**Implements:** `ReturnTermsBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CorrelationReturnTerms` [Builder]
- `getBoundedCorrelation()` → `NumberRange` [Getter]
- `getCorrelationStrikePrice()` → `Price` [Getter]
- `getNumberOfDataSeries()` → `Integer` [Getter]

### CorrelationReturnTermsBuilder
**Implements:** `CorrelationReturnTerms` `ReturnTermsBase$ReturnTermsBaseBuilder` 

**Key Methods:**
- `getBoundedCorrelation()` → `NumberRangeBuilder` [Getter]
- `setInitialLevel(BigDecimal arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setNumberOfDataSeries(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setAnnualizationFactor(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setExpectedN(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setBoundedCorrelation(NumberRange arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setDividendApplicability(DividendApplicability arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `getCorrelationStrikePrice()` → `PriceBuilder` [Getter]

### CreditDefaultPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditDefaultPayout` [Builder]
- `getGeneralTerms()` → `GeneralTerms` [Getter]
- `getProtectionTerms()` → `List` [Getter]
- `getTransactedPrice()` → `TransactedPrice` [Getter]

### CreditDefaultPayoutBuilder
**Implements:** `CreditDefaultPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getGeneralTerms()` → `GeneralTermsBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getProtectionTerms()` → `List` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getOrCreateTransactedPrice()` → `TransactedPriceBuilder` [Getter]
- `setGeneralTerms(GeneralTerms arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getOrCreateProtectionTerms(int arg0)` → `ProtectionTermsBuilder` [Getter]
- `setProtectionTerms(List arg0)` → `CreditDefaultPayoutBuilder` [Setter]

### DiscountingMethod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DiscountingMethod` [Builder]
- `getDiscountingType()` → `DiscountingTypeEnum` [Getter]
- `getDiscountRate()` → `BigDecimal` [Getter]
- `getDiscountRateDayCountFraction()` → `FieldWithMetaDayCountFractionEnum` [Getter]

### DiscountingMethodBuilder
**Implements:** `DiscountingMethod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDiscountingType(DiscountingTypeEnum arg0)` → `DiscountingMethodBuilder` [Setter]
- `setDiscountRate(BigDecimal arg0)` → `DiscountingMethodBuilder` [Setter]
- `getDiscountRateDayCountFraction()` → `FieldWithMetaDayCountFractionEnumBuilder` [Getter]
- `setDiscountRateDayCountFractionValue(DayCountFractionEnum arg0)` → `DiscountingMethodBuilder` [Setter]
- `getOrCreateDiscountRateDayCountFraction()` → `FieldWithMetaDayCountFractionEnumBuilder` [Getter]
- `setDiscountRateDayCountFraction(FieldWithMetaDayCountFractionEnum arg0)` → `DiscountingMethodBuilder` [Setter]

### DividendCurrency
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendCurrency` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getCurrencyReference()` → `ReferenceWithMetaString` [Getter]

### DividendCurrencyBuilder
**Implements:** `DividendCurrency` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `DividendCurrencyBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `DividendCurrencyBuilder` [Setter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DividendCurrencyBuilder` [Setter]
- `getCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]
- `setCurrencyReference(ReferenceWithMetaString arg0)` → `DividendCurrencyBuilder` [Setter]
- `setCurrencyReferenceValue(String arg0)` → `DividendCurrencyBuilder` [Setter]
- `getOrCreateCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]

### DividendDateReference
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendDateReference` [Builder]
- `getDateReference()` → `DividendDateReferenceEnum` [Getter]
- `getPaymentDateOffset()` → `Offset` [Getter]

### DividendDateReferenceBuilder
**Implements:** `DividendDateReference` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDateReference(DividendDateReferenceEnum arg0)` → `DividendDateReferenceBuilder` [Setter]
- `getPaymentDateOffset()` → `OffsetBuilder` [Getter]
- `setPaymentDateOffset(Offset arg0)` → `DividendDateReferenceBuilder` [Setter]
- `getOrCreatePaymentDateOffset()` → `OffsetBuilder` [Getter]

### DividendPaymentDate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendPaymentDate` [Builder]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDate` [Getter]
- `getDividendDateReference()` → `DividendDateReference` [Getter]

### DividendPaymentDateBuilder
**Implements:** `DividendPaymentDate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDividendDateValue(AdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `setDividendDate(ReferenceWithMetaAdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `getOrCreateDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]
- `setDividendDateReference(DividendDateReference arg0)` → `DividendPaymentDateBuilder` [Setter]
- `getDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]
- `getOrCreateDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]

### DividendPayoutRatio
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendPayoutRatio` [Builder]
- `getTotalRatio()` → `BigDecimal` [Getter]
- `getNonCashRatio()` → `BigDecimal` [Getter]
- `getCashRatio()` → `BigDecimal` [Getter]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]

### DividendPayoutRatioBuilder
**Implements:** `DividendPayoutRatio` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setTotalRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setNonCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]
- `setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setBasketConstituentValue(BasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `getOrCreateBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]

### DividendPeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendPeriod` [Builder]
- `getDividendPaymentDate()` → `DividendPaymentDate` [Getter]
- `getDividendValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getEndDate()` → `DividendPaymentDate` [Getter]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]
- `getStartDate()` → `DividendPaymentDate` [Getter]

### DividendPeriodBuilder
**Implements:** `DividendPeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateEndDate()` → `DividendPaymentDateBuilder` [Getter]
- `getOrCreateStartDate()` → `DividendPaymentDateBuilder` [Getter]
- `getDividendPaymentDate()` → `DividendPaymentDateBuilder` [Getter]
- `setDividendPaymentDate(DividendPaymentDate arg0)` → `DividendPeriodBuilder` [Setter]
- `getDividendValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDividendValuationDate(AdjustableOrRelativeDate arg0)` → `DividendPeriodBuilder` [Setter]
- `getOrCreateDividendValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateDividendPaymentDate()` → `DividendPaymentDateBuilder` [Getter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `DividendPeriodBuilder` [Setter]

### DividendReturnTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendReturnTerms` [Builder]
- `getExcessDividendAmount()` → `DividendAmountTypeEnum` [Getter]
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendPeriod()` → `List` [Getter]
- `getDividendReinvestment()` → `Boolean` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getFirstOrSecondPeriod()` → `DividendPeriodEnum` [Getter]
- `getDividendCurrency()` → `DividendCurrency` [Getter]
- `getDividendComposition()` → `DividendCompositionEnum` [Getter]

### DividendReturnTermsBuilder
**Implements:** `DividendReturnTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendPeriod()` → `List` [Getter]
- `getDividendCurrency()` → `DividendCurrencyBuilder` [Getter]
- `setDividendPayoutRatio(List arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setDividendComposition(DividendCompositionEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setDividendCurrency(DividendCurrency arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setDividendReinvestment(Boolean arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setDividendEntitlement(DividendEntitlementEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setFirstOrSecondPeriod(DividendPeriodEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setMaterialDividend(Boolean arg0)` → `DividendReturnTermsBuilder` [Setter]

### EquityUnderlierProvisions
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EquityUnderlierProvisions` [Builder]
- `getRelevantJurisdiction()` → `FieldWithMetaString` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaString` [Getter]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]

### EquityUnderlierProvisionsBuilder
**Implements:** `EquityUnderlierProvisions` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getRelevantJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `setLocalJurisdiction(FieldWithMetaString arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setRelevantJurisdiction(FieldWithMetaString arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setLocalJurisdictionValue(String arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setMultipleExchangeIndexAnnexFallback(Boolean arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `getOrCreateLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `setComponentSecurityIndexAnnexFallback(Boolean arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `getOrCreateRelevantJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `setRelevantJurisdictionValue(String arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]

### FixedAmountCalculationDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FixedAmountCalculationDetails` [Builder]
- `getYearFraction()` → `BigDecimal` [Getter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]

### FixedAmountCalculationDetailsBuilder
**Implements:** `FixedAmountCalculationDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculatedAmount(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setFixedRate(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getOrCreateCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]
- `setCalculationPeriodNotionalAmount(Money arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `getOrCreateCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]

### FixedRateSpecification
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FixedRateSpecification` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getRateSchedule()` → `RateSchedule` [Getter]

### FixedRateSpecificationBuilder
**Implements:** `FixedRateSpecification` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getOrCreateRateSchedule()` → `RateScheduleBuilder` [Getter]
- `setRateSchedule(RateSchedule arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getRateSchedule()` → `RateScheduleBuilder` [Getter]

### FloatingAmountEvents
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingAmountEvents` [Builder]
- `getInterestShortfall()` → `InterestShortFall` [Getter]
- `getFloatingAmountProvisions()` → `FloatingAmountProvisions` [Getter]
- `getFailureToPayPrincipal()` → `Boolean` [Getter]
- `getImpliedWritedown()` → `Boolean` [Getter]
- `getWritedown()` → `Boolean` [Getter]
- `getAdditionalFixedPayments()` → `AdditionalFixedPayments` [Getter]

### FloatingAmountEventsBuilder
**Implements:** `FloatingAmountEvents` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInterestShortfall()` → `InterestShortFallBuilder` [Getter]
- `getFloatingAmountProvisions()` → `FloatingAmountProvisionsBuilder` [Getter]
- `setInterestShortfall(InterestShortFall arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setAdditionalFixedPayments(AdditionalFixedPayments arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setImpliedWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setFailureToPayPrincipal(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setFloatingAmountProvisions(FloatingAmountProvisions arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `getOrCreateAdditionalFixedPayments()` → `AdditionalFixedPaymentsBuilder` [Getter]
- `getOrCreateFloatingAmountProvisions()` → `FloatingAmountProvisionsBuilder` [Getter]

### FloatingAmountProvisions
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingAmountProvisions` [Builder]
- `getWacCapInterestProvision()` → `Boolean` [Getter]
- `getStepUpProvision()` → `Boolean` [Getter]

### FloatingAmountProvisionsBuilder
**Implements:** `FloatingAmountProvisions` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setStepUpProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]
- `setWacCapInterestProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]

### FloatingRate
**Implements:** `FloatingRateBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRate` [Builder]
- `getFloatingRateMultiplierSchedule()` → `RateSchedule` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getFallbackRate()` → `FallbackRateParameters` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]

### FloatingRateBase
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateBase` [Builder]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndex` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getSpreadSchedule()` → `SpreadSchedule` [Getter]
- `getFloorRateSchedule()` → `StrikeSchedule` [Getter]
- `getCapRateSchedule()` → `StrikeSchedule` [Getter]

### FloatingRateBaseBuilder
**Implements:** `FloatingRateBase` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndexBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FloatingRateBaseBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `getOrCreateCapRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `getOrCreateSpreadSchedule()` → `SpreadScheduleBuilder` [Getter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateBaseBuilder` [Setter]

### FloatingRateBuilder
**Implements:** `FloatingRate` `FloatingRateBase$FloatingRateBaseBuilder` 

**Key Methods:**
- `setMeta(MetaFields arg0)` → `FloatingRateBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateBuilder` [Setter]
- `getOrCreateFallbackRate()` → `FallbackRateParametersBuilder` [Getter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateBuilder` [Setter]
- `setCalculationParameters(FloatingRateCalculationParameters arg0)` → `FloatingRateBuilder` [Setter]
- `setRateOption(ReferenceWithMetaInterestRateIndex arg0)` → `FloatingRateBuilder` [Setter]

### FloatingRateDefinition
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateDefinition` [Builder]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getFloatingRateMultiplier()` → `BigDecimal` [Getter]
- `getFloorRate()` → `List` [Getter]
- `getRateObservation()` → `List` [Getter]
- `getCapRate()` → `List` [Getter]
- `getSpread()` → `BigDecimal` [Getter]

### FloatingRateDefinitionBuilder
**Implements:** `FloatingRateDefinition` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateFloorRate(int arg0)` → `StrikeBuilder` [Getter]
- `setCalculatedRate(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `setRateObservation(List arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `setFloatingRateMultiplier(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getFloorRate()` → `List` [Getter]
- `getRateObservation()` → `List` [Getter]
- `getOrCreateRateObservation(int arg0)` → `RateObservationBuilder` [Getter]
- `getOrCreateCapRate(int arg0)` → `StrikeBuilder` [Getter]
- `setFloorRate(List arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `setSpread(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]

### FloatingRateSpecification
**Implements:** `FloatingRate` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateSpecification` [Builder]
- `getAveragingMethod()` → `AveragingWeightingMethodEnum` [Getter]
- `getNegativeInterestRateTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `getFinalRateRounding()` → `Rounding` [Getter]

### FloatingRateSpecificationBuilder
**Implements:** `FloatingRateSpecification` `FloatingRate$FloatingRateBuilder` 

**Key Methods:**
- `setMeta(MetaFields arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFinalRateRounding(Rounding arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setInitialRate(Price arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `getOrCreateInitialRate()` → `PriceBuilder` [Getter]

### ForeignExchange
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ForeignExchange` [Builder]
- `getExchangedCurrency2()` → `Cashflow` [Getter]
- `getTenorPeriod()` → `Period` [Getter]
- `getExchangedCurrency1()` → `Cashflow` [Getter]

### ForeignExchangeBuilder
**Implements:** `ForeignExchange` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateTenorPeriod()` → `PeriodBuilder` [Getter]
- `getExchangedCurrency2()` → `CashflowBuilder` [Getter]
- `getTenorPeriod()` → `PeriodBuilder` [Getter]
- `getExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `setExchangedCurrency1(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]
- `setExchangedCurrency2(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]
- `setTenorPeriod(Period arg0)` → `ForeignExchangeBuilder` [Setter]
- `getOrCreateExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `getOrCreateExchangedCurrency2()` → `CashflowBuilder` [Getter]

### FutureValueAmount
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FutureValueAmount` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `getCalculationPeriodNumberOfDays()` → `Integer` [Getter]
- `getValueDate()` → `Date` [Getter]

### FutureValueAmountBuilder
**Implements:** `FutureValueAmount` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `FutureValueAmountBuilder` [Setter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `FutureValueAmountBuilder` [Setter]
- `setQuantityValue(NonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `setCalculationPeriodNumberOfDays(Integer arg0)` → `FutureValueAmountBuilder` [Setter]
- `setValueDate(Date arg0)` → `FutureValueAmountBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]

### GeneralTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `GeneralTerms` [Builder]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `getIndexReferenceInformation()` → `CreditIndex` [Getter]
- `getSubstitution()` → `Boolean` [Getter]
- `getModifiedEquityDelivery()` → `Boolean` [Getter]
- `getBasketReferenceInformation()` → `BasketReferenceInformation` [Getter]
- `getAdditionalTerm()` → `List` [Getter]

### GeneralTermsBuilder
**Implements:** `GeneralTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setReferenceInformation(ReferenceInformation arg0)` → `GeneralTermsBuilder` [Setter]
- `getReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `getIndexReferenceInformation()` → `CreditIndexBuilder` [Getter]
- `getOrCreateReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `setAdditionalTerm(List arg0)` → `GeneralTermsBuilder` [Setter]
- `setModifiedEquityDelivery(Boolean arg0)` → `GeneralTermsBuilder` [Setter]
- `setSubstitution(Boolean arg0)` → `GeneralTermsBuilder` [Setter]
- `setAdditionalTermValue(List arg0)` → `GeneralTermsBuilder` [Setter]
- `getOrCreateAdditionalTerm(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `getBasketReferenceInformation()` → `BasketReferenceInformationBuilder` [Getter]

### InflationRateSpecification
**Implements:** `FloatingRateSpecification` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InflationRateSpecification` [Builder]
- `getCalculationMethod()` → `InflationCalculationMethodEnum` [Getter]
- `getMainPublication()` → `FieldWithMetaString` [Getter]
- `getInflationLag()` → `Offset` [Getter]
- `getIndexSource()` → `FieldWithMetaString` [Getter]
- `getInitialIndexLevel()` → `BigDecimal` [Getter]
- `getInterpolationMethod()` → `FieldWithMetaInterpolationMethodEnum` [Getter]
- `getCalculationStyle()` → `InflationCalculationStyleEnum` [Getter]
- `getFallbackBondApplicable()` → `Boolean` [Getter]

### InflationRateSpecificationBuilder
**Implements:** `InflationRateSpecification` `FloatingRateSpecification$FloatingRateSpecificationBuilder` 

**Key Methods:**
- `setMeta(MetaFields arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getOrCreateMainPublication()` → `FieldWithMetaStringBuilder` [Getter]
- `setIndexSourceValue(String arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getMainPublication()` → `FieldWithMetaStringBuilder` [Getter]
- `setFinalRateRounding(Rounding arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getInflationLag()` → `OffsetBuilder` [Getter]

### InterestRatePayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InterestRatePayout` [Builder]
- `getDayCountFraction()` → `FieldWithMetaDayCountFractionEnum` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getRateSpecification()` → `RateSpecification` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]
- `getStubPeriod()` → `StubPeriod` [Getter]
- `getResetDates()` → `ResetDates` [Getter]
- `getDiscountingMethod()` → `DiscountingMethod` [Getter]
- `getBondReference()` → `BondReference` [Getter]

### InterestRatePayoutBuilder
**Implements:** `InterestRatePayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `setPayerReceiver(PayerReceiver arg0)` → `InterestRatePayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `InterestRatePayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `InterestRatePayoutBuilder` [Setter]
- `setPaymentDates(PaymentDates arg0)` → `InterestRatePayoutBuilder` [Setter]
- `getDayCountFraction()` → `FieldWithMetaDayCountFractionEnumBuilder` [Getter]
- `getPaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getOrCreatePaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getOrCreateResetDates()` → `ResetDatesBuilder` [Getter]
- `getOrCreateStubPeriod()` → `StubPeriodBuilder` [Getter]
- `getOrCreateBondReference()` → `BondReferenceBuilder` [Getter]

### InterestShortFall
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InterestShortFall` [Builder]
- `getRateSource()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getInterestShortfallCap()` → `InterestShortfallCapEnum` [Getter]
- `getCompounding()` → `Boolean` [Getter]

### InterestShortFallBuilder
**Implements:** `InterestShortFall` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setRateSourceValue(FloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getOrCreateRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setRateSource(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `setCompounding(Boolean arg0)` → `InterestShortFallBuilder` [Setter]
- `setInterestShortfallCap(InterestShortfallCapEnum arg0)` → `InterestShortFallBuilder` [Setter]

### PriceReturnTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getReturnType()` → `ReturnTypeEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `PriceReturnTerms` [Builder]
- `getPerformance()` → `String` [Getter]
- `getConversionFactor()` → `BigDecimal` [Getter]

### PriceReturnTermsBuilder
**Implements:** `PriceReturnTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setReturnType(ReturnTypeEnum arg0)` → `PriceReturnTermsBuilder` [Setter]
- `setConversionFactor(BigDecimal arg0)` → `PriceReturnTermsBuilder` [Setter]
- `setPerformance(String arg0)` → `PriceReturnTermsBuilder` [Setter]

### ProtectionTerms
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ProtectionTerms` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getCreditEvents()` → `CreditEvents` [Getter]
- `getObligations()` → `Obligations` [Getter]
- `getFloatingAmountEvents()` → `FloatingAmountEvents` [Getter]

### ProtectionTermsBuilder
**Implements:** `ProtectionTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ProtectionTermsBuilder` [Setter]
- `getCreditEvents()` → `CreditEventsBuilder` [Getter]
- `setObligations(Obligations arg0)` → `ProtectionTermsBuilder` [Setter]
- `getOrCreateObligations()` → `ObligationsBuilder` [Getter]
- `setFloatingAmountEvents(FloatingAmountEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `setCreditEvents(CreditEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `getOrCreateCreditEvents()` → `CreditEventsBuilder` [Getter]
- `getOrCreateFloatingAmountEvents()` → `FloatingAmountEventsBuilder` [Getter]

### RateSpecification
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `RateSpecification` [Builder]
- `getInflationRateSpecification()` → `InflationRateSpecification` [Getter]
- `getFloatingRateSpecification()` → `FloatingRateSpecification` [Getter]
- `getFixedRateSpecification()` → `FixedRateSpecification` [Getter]

### RateSpecificationBuilder
**Implements:** `RateSpecification` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setFixedRateSpecification(FixedRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getOrCreateFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]
- `getOrCreateFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]
- `getOrCreateInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `setInflationRateSpecification(InflationRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `setFloatingRateSpecification(FloatingRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `getFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]
- `getFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]

### ReferenceInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceInformation` [Builder]
- `getAllGuarantees()` → `Boolean` [Getter]
- `getReferenceEntity()` → `LegalEntity` [Getter]
- `getReferencePrice()` → `Price` [Getter]
- `getReferenceObligation()` → `List` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getReferencePolicy()` → `Boolean` [Getter]
- `getSecuredList()` → `Boolean` [Getter]
- `getUnknownReferenceObligation()` → `Boolean` [Getter]

### ReferenceInformationBuilder
**Implements:** `ReferenceInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `getReferencePrice()` → `PriceBuilder` [Getter]
- `getReferenceObligation()` → `List` [Getter]
- `setUnknownReferenceObligation(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `getOrCreateReferenceObligation(int arg0)` → `ReferenceObligationBuilder` [Getter]
- `setReferenceObligation(List arg0)` → `ReferenceInformationBuilder` [Setter]
- `setNoReferenceObligation(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `setAllGuarantees(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `getOrCreateReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `getOrCreateReferencePrice()` → `PriceBuilder` [Getter]

### ReferenceObligation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceObligation` [Builder]
- `getSecurity()` → `Security` [Getter]
- `getLoan()` → `Loan` [Getter]
- `getStandardReferenceObligation()` → `Boolean` [Getter]
- `getPrimaryObligorReference()` → `ReferenceWithMetaLegalEntity` [Getter]
- `getGuarantor()` → `LegalEntity` [Getter]
- `getPrimaryObligor()` → `LegalEntity` [Getter]
- `getGuarantorReference()` → `String` [Getter]

### ReferenceObligationBuilder
**Implements:** `ReferenceObligation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSecurity()` → `SecurityBuilder` [Getter]
- `getOrCreateSecurity()` → `SecurityBuilder` [Getter]
- `getLoan()` → `LoanBuilder` [Getter]
- `setLoan(Loan arg0)` → `ReferenceObligationBuilder` [Setter]
- `setStandardReferenceObligation(Boolean arg0)` → `ReferenceObligationBuilder` [Setter]
- `getOrCreatePrimaryObligorReference()` → `ReferenceWithMetaLegalEntityBuilder` [Getter]
- `setPrimaryObligorReferenceValue(LegalEntity arg0)` → `ReferenceObligationBuilder` [Setter]
- `setSecurity(Security arg0)` → `ReferenceObligationBuilder` [Setter]
- `getPrimaryObligorReference()` → `ReferenceWithMetaLegalEntityBuilder` [Getter]
- `setGuarantorReference(String arg0)` → `ReferenceObligationBuilder` [Setter]

### ReferencePair
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferencePair` [Builder]
- `getReferenceEntity()` → `LegalEntity` [Getter]
- `getReferenceObligation()` → `ReferenceObligation` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getEntityType()` → `FieldWithMetaEntityTypeEnum` [Getter]

### ReferencePairBuilder
**Implements:** `ReferencePair` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `getReferenceObligation()` → `ReferenceObligationBuilder` [Getter]
- `getOrCreateEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `setEntityTypeValue(EntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `setEntityType(FieldWithMetaEntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `getEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `getOrCreateReferenceObligation()` → `ReferenceObligationBuilder` [Getter]
- `setReferenceObligation(ReferenceObligation arg0)` → `ReferencePairBuilder` [Setter]
- `setNoReferenceObligation(Boolean arg0)` → `ReferencePairBuilder` [Setter]
- `getOrCreateReferenceEntity()` → `LegalEntityBuilder` [Getter]

### ReferencePool
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferencePool` [Builder]
- `getReferencePoolItem()` → `List` [Getter]

### ReferencePoolBuilder
**Implements:** `ReferencePool` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getReferencePoolItem()` → `List` [Getter]
- `setReferencePoolItem(List arg0)` → `ReferencePoolBuilder` [Setter]
- `getOrCreateReferencePoolItem(int arg0)` → `ReferencePoolItemBuilder` [Getter]

### ReferencePoolItem
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferencePoolItem` [Builder]
- `getConstituentWeight()` → `ConstituentWeight` [Getter]
- `getReferencePair()` → `ReferencePair` [Getter]
- `getProtectionTermsReference()` → `ReferenceWithMetaProtectionTerms` [Getter]
- `getCashSettlementTermsReference()` → `ReferenceWithMetaCashSettlementTerms` [Getter]
- `getPhysicalSettlementTermsReference()` → `ReferenceWithMetaPhysicalSettlementTerms` [Getter]

### ReferencePoolItemBuilder
**Implements:** `ReferencePoolItem` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePhysicalSettlementTermsReference()` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Getter]
- `getConstituentWeight()` → `ConstituentWeightBuilder` [Getter]
- `getOrCreateReferencePair()` → `ReferencePairBuilder` [Getter]
- `getReferencePair()` → `ReferencePairBuilder` [Getter]
- `setConstituentWeight(ConstituentWeight arg0)` → `ReferencePoolItemBuilder` [Setter]
- `setReferencePair(ReferencePair arg0)` → `ReferencePoolItemBuilder` [Setter]
- `getProtectionTermsReference()` → `ReferenceWithMetaProtectionTermsBuilder` [Getter]
- `getCashSettlementTermsReference()` → `ReferenceWithMetaCashSettlementTermsBuilder` [Getter]
- `setProtectionTermsReference(ReferenceWithMetaProtectionTerms arg0)` → `ReferencePoolItemBuilder` [Setter]
- `setPhysicalSettlementTermsReference(ReferenceWithMetaPhysicalSettlementTerms arg0)` → `ReferencePoolItemBuilder` [Setter]

### ReturnTermsBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReturnTermsBase` [Builder]
- `getMeanAdjustment()` → `Boolean` [Getter]
- `getExpectedN()` → `Integer` [Getter]
- `getInitialLevelSource()` → `DeterminationMethodEnum` [Getter]
- `getAnnualizationFactor()` → `Integer` [Getter]
- `getValuationTerms()` → `ValuationTerms` [Getter]
- `getInitialLevel()` → `BigDecimal` [Getter]
- `getDividendApplicability()` → `DividendApplicability` [Getter]
- `getEquityUnderlierProvisions()` → `EquityUnderlierProvisions` [Getter]

### ReturnTermsBaseBuilder
**Implements:** `ReturnTermsBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getValuationTerms()` → `ValuationTermsBuilder` [Getter]
- `getDividendApplicability()` → `DividendApplicabilityBuilder` [Getter]
- `setInitialLevel(BigDecimal arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setAnnualizationFactor(Integer arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setExpectedN(Integer arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `getOrCreateValuationTerms()` → `ValuationTermsBuilder` [Getter]
- `setDividendApplicability(DividendApplicability arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setInitialLevelSource(DeterminationMethodEnum arg0)` → `ReturnTermsBaseBuilder` [Setter]

### SettledEntityMatrix
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettledEntityMatrix` [Builder]
- `getPublicationDate()` → `Date` [Getter]
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnum` [Getter]

### SettledEntityMatrixBuilder
**Implements:** `SettledEntityMatrix` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPublicationDate(Date arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]
- `setMatrixSource(FieldWithMetaSettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `setMatrixSourceValue(SettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `getOrCreateMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]

### SpreadSchedule
**Implements:** `RateSchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SpreadSchedule` [Builder]
- `getSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnum` [Getter]

### SpreadScheduleBuilder
**Implements:** `SpreadSchedule` `RateSchedule$RateScheduleBuilder` 

**Key Methods:**
- `setPriceValue(PriceSchedule arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleType(FieldWithMetaSpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleTypeValue(SpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `getSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]
- `getOrCreateSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `SpreadScheduleBuilder` [Setter]

### StubFloatingRate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubFloatingRate` [Builder]
- `getFloatingRateMultiplierSchedule()` → `Schedule` [Getter]
- `getSpreadSchedule()` → `List` [Getter]
- `getFloorRateSchedule()` → `List` [Getter]
- `getCapRateSchedule()` → `List` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]

### StubFloatingRateBuilder
**Implements:** `StubFloatingRate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCapRateSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateCapRateSchedule(int arg0)` → `StrikeScheduleBuilder` [Getter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `StubFloatingRateBuilder` [Setter]
- `setFloorRateSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateSpreadSchedule(int arg0)` → `SpreadScheduleBuilder` [Getter]
- `setSpreadSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateFloatingRateMultiplierSchedule()` → `ScheduleBuilder` [Getter]
- `setFloatingRateMultiplierSchedule(Schedule arg0)` → `StubFloatingRateBuilder` [Setter]

### StubValue
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubValue` [Builder]
- `getStubAmount()` → `Money` [Getter]
- `getStubRate()` → `BigDecimal` [Getter]
- `getFloatingRate()` → `List` [Getter]

### StubValueBuilder
**Implements:** `StubValue` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setStubAmount(Money arg0)` → `StubValueBuilder` [Setter]
- `getStubAmount()` → `MoneyBuilder` [Getter]
- `setStubRate(BigDecimal arg0)` → `StubValueBuilder` [Setter]
- `getOrCreateStubAmount()` → `MoneyBuilder` [Getter]
- `getOrCreateFloatingRate(int arg0)` → `StubFloatingRateBuilder` [Getter]
- `getFloatingRate()` → `List` [Getter]
- `setFloatingRate(List arg0)` → `StubValueBuilder` [Setter]

### Tranche
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Tranche` [Builder]
- `getAttachmentPoint()` → `BigDecimal` [Getter]
- `getExhaustionPoint()` → `BigDecimal` [Getter]
- `getIncurredRecoveryApplicable()` → `Boolean` [Getter]

### TrancheBuilder
**Implements:** `Tranche` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setExhaustionPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]
- `setAttachmentPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]
- `setIncurredRecoveryApplicable(Boolean arg0)` → `TrancheBuilder` [Setter]

### ValuationTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationTerms` [Builder]
- `getFuturesPriceValuation()` → `Boolean` [Getter]
- `getOptionsPriceValuation()` → `Boolean` [Getter]
- `getNumberOfValuationDates()` → `Integer` [Getter]
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getFPVFinalPriceElectionFallback()` → `FPVFinalPriceElectionFallbackEnum` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]

### ValuationTermsBuilder
**Implements:** `ValuationTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setFuturesPriceValuation(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setOptionsPriceValuation(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setNumberOfValuationDates(Integer arg0)` → `ValuationTermsBuilder` [Setter]
- `setDividendValuationDates(AdjustableRelativeOrPeriodicDates arg0)` → `ValuationTermsBuilder` [Setter]
- `setFPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum arg0)` → `ValuationTermsBuilder` [Setter]
- `setMultipleExchangeIndexAnnexFallback(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setComponentSecurityIndexAnnexFallback(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `getOrCreateDividendValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]

### VarianceCapFloor
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `VarianceCapFloor` [Builder]
- `getVarianceCap()` → `Boolean` [Getter]
- `getUnadjustedVarianceCap()` → `BigDecimal` [Getter]
- `getBoundedVariance()` → `BoundedVariance` [Getter]

### VarianceCapFloorBuilder
**Implements:** `VarianceCapFloor` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setUnadjustedVarianceCap(BigDecimal arg0)` → `VarianceCapFloorBuilder` [Setter]
- `getBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `getOrCreateBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `setBoundedVariance(BoundedVariance arg0)` → `VarianceCapFloorBuilder` [Setter]
- `setVarianceCap(Boolean arg0)` → `VarianceCapFloorBuilder` [Setter]

### VarianceReturnTerms
**Implements:** `ReturnTermsBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `VarianceReturnTerms` [Builder]
- `getVolatilityCapFloor()` → `VolatilityCapFloor` [Getter]
- `getVolatilityStrikePrice()` → `Price` [Getter]
- `getVarianceStrikePrice()` → `Price` [Getter]
- `getVarianceCapFloor()` → `VarianceCapFloor` [Getter]
- `getVegaNotionalAmount()` → `NonNegativeQuantitySchedule` [Getter]
- `getExchangeTradedContractNearest()` → `ReferenceWithMetaObservable` [Getter]

### VarianceReturnTermsBuilder
**Implements:** `VarianceReturnTerms` `ReturnTermsBase$ReturnTermsBaseBuilder` 

**Key Methods:**
- `getVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `getVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `setVolatilityStrikePrice(Price arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setVolatilityCapFloor(VolatilityCapFloor arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setVegaNotionalAmount(NonNegativeQuantitySchedule arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setAnnualizationFactor(Integer arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setExpectedN(Integer arg0)` → `VarianceReturnTermsBuilder` [Setter]

### VolatilityCapFloor
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `VolatilityCapFloor` [Builder]
- `getTotalVolatilityCap()` → `BigDecimal` [Getter]
- `getVolatilityCapFactor()` → `BigDecimal` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### VolatilityCapFloorBuilder
**Implements:** `VolatilityCapFloor` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setVolatilityCapFactor(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `setTotalVolatilityCap(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `VolatilityCapFloorBuilder` [Setter]

### VolatilityReturnTerms
**Implements:** `ReturnTermsBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `VolatilityReturnTerms` [Builder]
- `getVolatilityCapFloor()` → `VolatilityCapFloor` [Getter]
- `getVolatilityStrikePrice()` → `Price` [Getter]
- `getExchangeTradedContractNearest()` → `ListedDerivative` [Getter]

### VolatilityReturnTermsBuilder
**Implements:** `VolatilityReturnTerms` `ReturnTermsBase$ReturnTermsBaseBuilder` 

**Key Methods:**
- `getVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `getVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `setVolatilityStrikePrice(Price arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setVolatilityCapFloor(VolatilityCapFloor arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setAnnualizationFactor(Integer arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setExpectedN(Integer arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setDividendApplicability(DividendApplicability arg0)` → `VolatilityReturnTermsBuilder` [Setter]

## Concrete Classes

### AdditionalFixedPaymentsBuilderImpl
**Implements:** `AdditionalFixedPayments$AdditionalFixedPaymentsBuilder` 

**Fields:**
- `Boolean interestShortfallReimbursement`
- `Boolean principalShortfallReimbursement`
- `Boolean writedownReimbursement`

**Key Methods:**
- `build()` → `AdditionalFixedPayments` [Builder]
- `setWritedownReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `setPrincipalShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `setInterestShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `getPrincipalShortfallReimbursement()` → `Boolean` [Getter]
- `getInterestShortfallReimbursement()` → `Boolean` [Getter]
- `getWritedownReimbursement()` → `Boolean` [Getter]

### AdditionalFixedPaymentsImpl
**Implements:** `AdditionalFixedPayments` 

**Key Methods:**
- `build()` → `AdditionalFixedPayments` [Builder]
- `setBuilderFields(AdditionalFixedPaymentsBuilder arg0)` → `void` [Setter]
- `getPrincipalShortfallReimbursement()` → `Boolean` [Getter]
- `getInterestShortfallReimbursement()` → `Boolean` [Getter]
- `getWritedownReimbursement()` → `Boolean` [Getter]

### AssetDeliveryInformationBuilderImpl
**Implements:** `AssetDeliveryInformation$AssetDeliveryInformationBuilder` 

**Fields:**
- `AssetDeliveryPeriodsBuilder periods`
- `List (List) location`
- `QuantityBuilder deliveryCapacity`

**Key Methods:**
- `getLocation()` → `List` [Getter]
- `build()` → `AssetDeliveryInformation` [Builder]
- `setLocation(List arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getPeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getOrCreatePeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `getOrCreateLocation(int arg0)` → `LocationIdentifierBuilder` [Getter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setPeriods(AssetDeliveryPeriods arg0)` → `AssetDeliveryInformationBuilder` [Setter]

### AssetDeliveryInformationImpl
**Implements:** `AssetDeliveryInformation` 

**Key Methods:**
- `getLocation()` → `List` [Getter]
- `build()` → `AssetDeliveryInformation` [Builder]
- `setBuilderFields(AssetDeliveryInformationBuilder arg0)` → `void` [Setter]
- `getPeriods()` → `AssetDeliveryPeriods` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]

### AssetDeliveryPeriodsBuilderImpl
**Implements:** `AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder` 

**Fields:**
- `List (List) profile`
- `Date startDate`
- `Date endDate`

**Key Methods:**
- `build()` → `AssetDeliveryPeriods` [Builder]
- `getOrCreateProfile(int arg0)` → `AssetDeliveryProfileBuilder` [Getter]
- `getProfile()` → `List` [Getter]
- `setEndDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `getEndDate()` → `Date` [Getter]
- `getStartDate()` → `Date` [Getter]
- `setStartDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `setProfile(List arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]

### AssetDeliveryPeriodsImpl
**Implements:** `AssetDeliveryPeriods` 

**Key Methods:**
- `build()` → `AssetDeliveryPeriods` [Builder]
- `setBuilderFields(AssetDeliveryPeriodsBuilder arg0)` → `void` [Setter]
- `getProfile()` → `List` [Getter]
- `getEndDate()` → `Date` [Getter]
- `getStartDate()` → `Date` [Getter]

### AssetDeliveryProfileBlockBuilderImpl
**Implements:** `AssetDeliveryProfileBlock$AssetDeliveryProfileBlockBuilder` 

**Fields:**
- `LocalTime startTime`
- `LocalTime endTime`
- `List (List) dayOfWeek`
- `QuantityBuilder deliveryCapacity`
- `PriceBuilder priceTimeIntervalQuantity`

**Key Methods:**
- `build()` → `AssetDeliveryProfileBlock` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `setDayOfWeek(List arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getStartTime()` → `LocalTime` [Getter]
- `setStartTime(LocalTime arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreatePriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]

### AssetDeliveryProfileBlockImpl
**Implements:** `AssetDeliveryProfileBlock` 

**Key Methods:**
- `build()` → `AssetDeliveryProfileBlock` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `setBuilderFields(AssetDeliveryProfileBlockBuilder arg0)` → `void` [Setter]
- `getStartTime()` → `LocalTime` [Getter]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]
- `getEndTime()` → `LocalTime` [Getter]

### AssetDeliveryProfileBuilderImpl
**Implements:** `AssetDeliveryProfile$AssetDeliveryProfileBuilder` 

**Fields:**
- `LoadTypeEnum loadType`
- `List (List) block`
- `BankHolidayTreatmentEnum bankHolidaysTreatment`

**Key Methods:**
- `build()` → `AssetDeliveryProfile` [Builder]
- `setBankHolidaysTreatment(BankHolidayTreatmentEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getOrCreateBlock(int arg0)` → `AssetDeliveryProfileBlockBuilder` [Getter]
- `setLoadType(LoadTypeEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getLoadType()` → `LoadTypeEnum` [Getter]
- `getBankHolidaysTreatment()` → `BankHolidayTreatmentEnum` [Getter]
- `getBlock()` → `List` [Getter]
- `setBlock(List arg0)` → `AssetDeliveryProfileBuilder` [Setter]

### AssetDeliveryProfileImpl
**Implements:** `AssetDeliveryProfile` 

**Key Methods:**
- `build()` → `AssetDeliveryProfile` [Builder]
- `setBuilderFields(AssetDeliveryProfileBuilder arg0)` → `void` [Setter]
- `getLoadType()` → `LoadTypeEnum` [Getter]
- `getBankHolidaysTreatment()` → `BankHolidayTreatmentEnum` [Getter]
- `getBlock()` → `List` [Getter]

### BasketReferenceInformationBuilderImpl
**Implements:** `BasketReferenceInformation$BasketReferenceInformationBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder basketName`
- `List (List) basketId`
- `ReferencePoolBuilder referencePool`
- `Integer nthToDefault`
- `Integer mthToDefault`
- `TrancheBuilder tranche`

**Key Methods:**
- `build()` → `BasketReferenceInformation` [Builder]
- `getBasketName()` → `FieldWithMetaStringBuilder` [Getter]
- `getBasketId()` → `List` [Getter]
- `getReferencePool()` → `ReferencePoolBuilder` [Getter]
- `getOrCreateReferencePool()` → `ReferencePoolBuilder` [Getter]
- `setBasketName(FieldWithMetaString arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `getOrCreateBasketName()` → `FieldWithMetaStringBuilder` [Getter]
- `setBasketNameValue(String arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `getNthToDefault()` → `Integer` [Getter]
- `getMthToDefault()` → `Integer` [Getter]

### BasketReferenceInformationImpl
**Implements:** `BasketReferenceInformation` 

**Key Methods:**
- `build()` → `BasketReferenceInformation` [Builder]
- `setBuilderFields(BasketReferenceInformationBuilder arg0)` → `void` [Setter]
- `getBasketName()` → `FieldWithMetaString` [Getter]
- `getBasketId()` → `List` [Getter]
- `getReferencePool()` → `ReferencePool` [Getter]
- `getNthToDefault()` → `Integer` [Getter]
- `getMthToDefault()` → `Integer` [Getter]
- `getTranche()` → `Tranche` [Getter]

### BondReferenceBuilderImpl
**Implements:** `BondReference$BondReferenceBuilder` 

**Fields:**
- `SecurityBuilder bond`
- `Boolean conditionPrecedentBond`
- `Boolean discrepancyClause`
- `FixedRateSpecificationBuilder couponRate`

**Key Methods:**
- `build()` → `BondReference` [Builder]
- `getConditionPrecedentBond()` → `Boolean` [Getter]
- `getOrCreateBond()` → `SecurityBuilder` [Getter]
- `getOrCreateCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `getDiscrepancyClause()` → `Boolean` [Getter]
- `setDiscrepancyClause(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `setConditionPrecedentBond(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `getCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `setCouponRate(FixedRateSpecification arg0)` → `BondReferenceBuilder` [Setter]
- `getBond()` → `SecurityBuilder` [Getter]

### BondReferenceImpl
**Implements:** `BondReference` 

**Key Methods:**
- `build()` → `BondReference` [Builder]
- `setBuilderFields(BondReferenceBuilder arg0)` → `void` [Setter]
- `getConditionPrecedentBond()` → `Boolean` [Getter]
- `getDiscrepancyClause()` → `Boolean` [Getter]
- `getCouponRate()` → `FixedRateSpecification` [Getter]
- `getBond()` → `Security` [Getter]

### BoundedCorrelationBuilderImpl
**Implements:** `BoundedCorrelation$BoundedCorrelationBuilder` 

**Fields:**
- `BigDecimal minimumBoundaryPercent`
- `BigDecimal maximumBoundaryPercent`

**Key Methods:**
- `build()` → `BoundedCorrelation` [Builder]
- `setMaximumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]
- `setMinimumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]
- `getMaximumBoundaryPercent()` → `BigDecimal` [Getter]
- `getMinimumBoundaryPercent()` → `BigDecimal` [Getter]

### BoundedCorrelationImpl
**Implements:** `BoundedCorrelation` 

**Key Methods:**
- `build()` → `BoundedCorrelation` [Builder]
- `setBuilderFields(BoundedCorrelationBuilder arg0)` → `void` [Setter]
- `getMaximumBoundaryPercent()` → `BigDecimal` [Getter]
- `getMinimumBoundaryPercent()` → `BigDecimal` [Getter]

### BoundedVarianceBuilderImpl
**Implements:** `BoundedVariance$BoundedVarianceBuilder` 

**Fields:**
- `RealisedVarianceMethodEnum realisedVarianceMethod`
- `Boolean daysInRangeAdjustment`
- `BigDecimal upperBarrier`
- `BigDecimal lowerBarrier`

**Key Methods:**
- `build()` → `BoundedVariance` [Builder]
- `getRealisedVarianceMethod()` → `RealisedVarianceMethodEnum` [Getter]
- `getDaysInRangeAdjustment()` → `Boolean` [Getter]
- `setRealisedVarianceMethod(RealisedVarianceMethodEnum arg0)` → `BoundedVarianceBuilder` [Setter]
- `getUpperBarrier()` → `BigDecimal` [Getter]
- `getLowerBarrier()` → `BigDecimal` [Getter]
- `setDaysInRangeAdjustment(Boolean arg0)` → `BoundedVarianceBuilder` [Setter]
- `setUpperBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]
- `setLowerBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]

### BoundedVarianceImpl
**Implements:** `BoundedVariance` 

**Key Methods:**
- `build()` → `BoundedVariance` [Builder]
- `setBuilderFields(BoundedVarianceBuilder arg0)` → `void` [Setter]
- `getRealisedVarianceMethod()` → `RealisedVarianceMethodEnum` [Getter]
- `getDaysInRangeAdjustment()` → `Boolean` [Getter]
- `getUpperBarrier()` → `BigDecimal` [Getter]
- `getLowerBarrier()` → `BigDecimal` [Getter]

### CalculationScheduleDeliveryPeriodsBuilderImpl
**Extends:** `AssetDeliveryPeriods$AssetDeliveryPeriodsBuilderImpl` 
**Implements:** `CalculationScheduleDeliveryPeriods$CalculationScheduleDeliveryPeriodsBuilder` 

**Fields:**
- `QuantityBuilder deliveryCapacity`
- `PriceBuilder priceTimeIntervalQuantity`

**Key Methods:**
- `build()` → `CalculationScheduleDeliveryPeriods` [Builder]
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setEndDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setStartDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreatePriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `setPriceTimeIntervalQuantity(Price arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setProfile(List arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]

### CalculationScheduleDeliveryPeriodsImpl
**Extends:** `AssetDeliveryPeriods$AssetDeliveryPeriodsImpl` 
**Implements:** `CalculationScheduleDeliveryPeriods` 

**Key Methods:**
- `build()` → `CalculationScheduleDeliveryPeriods` [Builder]
- `setBuilderFields(CalculationScheduleDeliveryPeriodsBuilder arg0)` → `void` [Setter]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]

### CashflowRepresentationBuilderImpl
**Implements:** `CashflowRepresentation$CashflowRepresentationBuilder` 

**Fields:**
- `Boolean cashflowsMatchParameters`
- `List (List) paymentCalculationPeriod`

**Key Methods:**
- `build()` → `CashflowRepresentation` [Builder]
- `getCashflowsMatchParameters()` → `Boolean` [Getter]
- `getPaymentCalculationPeriod()` → `List` [Getter]
- `setPaymentCalculationPeriod(List arg0)` → `CashflowRepresentationBuilder` [Setter]
- `setCashflowsMatchParameters(Boolean arg0)` → `CashflowRepresentationBuilder` [Setter]
- `getOrCreatePaymentCalculationPeriod(int arg0)` → `PaymentCalculationPeriodBuilder` [Getter]

### CashflowRepresentationImpl
**Implements:** `CashflowRepresentation` 

**Key Methods:**
- `build()` → `CashflowRepresentation` [Builder]
- `setBuilderFields(CashflowRepresentationBuilder arg0)` → `void` [Setter]
- `getCashflowsMatchParameters()` → `Boolean` [Getter]
- `getPaymentCalculationPeriod()` → `List` [Getter]

### CommodityPayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `CommodityPayout$CommodityPayoutBuilder` 

**Fields:**
- `AveragingCalculationBuilder averagingFeature`
- `CommodityPriceReturnTermsBuilder commodityPriceReturnTerms`
- `PricingDatesBuilder pricingDates`
- `CalculationScheduleBuilder schedule`
- `CalculationPeriodDatesBuilder calculationPeriodDates`
- `PaymentDatesBuilder paymentDates`
- `UnderlierBuilder underlier`
- `FxFeatureBuilder fxFeature`
- `AssetDeliveryInformationBuilder delivery`

**Key Methods:**
- `build()` → `CommodityPayout` [Builder]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `CommodityPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `CommodityPayoutBuilder` [Setter]
- `getCommodityPriceReturnTerms()` → `CommodityPriceReturnTermsBuilder` [Getter]
- `getOrCreateAveragingFeature()` → `AveragingCalculationBuilder` [Getter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `CommodityPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `CommodityPayoutBuilder` [Setter]
- `setPaymentDates(PaymentDates arg0)` → `CommodityPayoutBuilder` [Setter]

### CommodityPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `CommodityPayout` 

**Key Methods:**
- `build()` → `CommodityPayout` [Builder]
- `getUnderlier()` → `Underlier` [Getter]
- `setBuilderFields(CommodityPayoutBuilder arg0)` → `void` [Setter]
- `getCommodityPriceReturnTerms()` → `CommodityPriceReturnTerms` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getFxFeature()` → `FxFeature` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]

### CorrelationReturnTermsBuilderImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseBuilderImpl` 
**Implements:** `CorrelationReturnTerms$CorrelationReturnTermsBuilder` 

**Fields:**
- `PriceBuilder correlationStrikePrice`
- `NumberRangeBuilder boundedCorrelation`
- `Integer numberOfDataSeries`

**Key Methods:**
- `build()` → `CorrelationReturnTerms` [Builder]
- `getBoundedCorrelation()` → `NumberRangeBuilder` [Getter]
- `setInitialLevel(BigDecimal arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setNumberOfDataSeries(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setAnnualizationFactor(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setExpectedN(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setBoundedCorrelation(NumberRange arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setDividendApplicability(DividendApplicability arg0)` → `CorrelationReturnTermsBuilder` [Setter]

### CorrelationReturnTermsImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseImpl` 
**Implements:** `CorrelationReturnTerms` 

**Key Methods:**
- `build()` → `CorrelationReturnTerms` [Builder]
- `setBuilderFields(CorrelationReturnTermsBuilder arg0)` → `void` [Setter]
- `getBoundedCorrelation()` → `NumberRange` [Getter]
- `getCorrelationStrikePrice()` → `Price` [Getter]
- `getNumberOfDataSeries()` → `Integer` [Getter]

### CreditDefaultPayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `CreditDefaultPayout$CreditDefaultPayoutBuilder` 

**Fields:**
- `GeneralTermsBuilder generalTerms`
- `List (List) protectionTerms`
- `TransactedPriceBuilder transactedPrice`

**Key Methods:**
- `build()` → `CreditDefaultPayout` [Builder]
- `getGeneralTerms()` → `GeneralTermsBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getProtectionTerms()` → `List` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getOrCreateTransactedPrice()` → `TransactedPriceBuilder` [Getter]
- `setGeneralTerms(GeneralTerms arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getOrCreateProtectionTerms(int arg0)` → `ProtectionTermsBuilder` [Getter]

### CreditDefaultPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `CreditDefaultPayout` 

**Key Methods:**
- `build()` → `CreditDefaultPayout` [Builder]
- `getGeneralTerms()` → `GeneralTerms` [Getter]
- `setBuilderFields(CreditDefaultPayoutBuilder arg0)` → `void` [Setter]
- `getProtectionTerms()` → `List` [Getter]
- `getTransactedPrice()` → `TransactedPrice` [Getter]

### DiscountingMethodBuilderImpl
**Implements:** `DiscountingMethod$DiscountingMethodBuilder` 

**Fields:**
- `DiscountingTypeEnum discountingType`
- `BigDecimal discountRate`
- `FieldWithMetaDayCountFractionEnumBuilder discountRateDayCountFraction`

**Key Methods:**
- `build()` → `DiscountingMethod` [Builder]
- `getDiscountingType()` → `DiscountingTypeEnum` [Getter]
- `setDiscountingType(DiscountingTypeEnum arg0)` → `DiscountingMethodBuilder` [Setter]
- `setDiscountRate(BigDecimal arg0)` → `DiscountingMethodBuilder` [Setter]
- `getDiscountRate()` → `BigDecimal` [Getter]
- `getDiscountRateDayCountFraction()` → `FieldWithMetaDayCountFractionEnumBuilder` [Getter]
- `setDiscountRateDayCountFractionValue(DayCountFractionEnum arg0)` → `DiscountingMethodBuilder` [Setter]
- `getOrCreateDiscountRateDayCountFraction()` → `FieldWithMetaDayCountFractionEnumBuilder` [Getter]
- `setDiscountRateDayCountFraction(FieldWithMetaDayCountFractionEnum arg0)` → `DiscountingMethodBuilder` [Setter]

### DiscountingMethodImpl
**Implements:** `DiscountingMethod` 

**Key Methods:**
- `build()` → `DiscountingMethod` [Builder]
- `setBuilderFields(DiscountingMethodBuilder arg0)` → `void` [Setter]
- `getDiscountingType()` → `DiscountingTypeEnum` [Getter]
- `getDiscountRate()` → `BigDecimal` [Getter]
- `getDiscountRateDayCountFraction()` → `FieldWithMetaDayCountFractionEnum` [Getter]

### DividendCurrencyBuilderImpl
**Implements:** `DividendCurrency$DividendCurrencyBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder currency`
- `DeterminationMethodEnum determinationMethod`
- `ReferenceWithMetaStringBuilder currencyReference`

**Key Methods:**
- `build()` → `DividendCurrency` [Builder]
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `DividendCurrencyBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `DividendCurrencyBuilder` [Setter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DividendCurrencyBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]
- `setCurrencyReference(ReferenceWithMetaString arg0)` → `DividendCurrencyBuilder` [Setter]
- `setCurrencyReferenceValue(String arg0)` → `DividendCurrencyBuilder` [Setter]
- `getOrCreateCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]

### DividendCurrencyImpl
**Implements:** `DividendCurrency` 

**Key Methods:**
- `build()` → `DividendCurrency` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `setBuilderFields(DividendCurrencyBuilder arg0)` → `void` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getCurrencyReference()` → `ReferenceWithMetaString` [Getter]

### DividendDateReferenceBuilderImpl
**Implements:** `DividendDateReference$DividendDateReferenceBuilder` 

**Fields:**
- `DividendDateReferenceEnum dateReference`
- `OffsetBuilder paymentDateOffset`

**Key Methods:**
- `build()` → `DividendDateReference` [Builder]
- `setDateReference(DividendDateReferenceEnum arg0)` → `DividendDateReferenceBuilder` [Setter]
- `getDateReference()` → `DividendDateReferenceEnum` [Getter]
- `getPaymentDateOffset()` → `OffsetBuilder` [Getter]
- `setPaymentDateOffset(Offset arg0)` → `DividendDateReferenceBuilder` [Setter]
- `getOrCreatePaymentDateOffset()` → `OffsetBuilder` [Getter]

### DividendDateReferenceImpl
**Implements:** `DividendDateReference` 

**Key Methods:**
- `build()` → `DividendDateReference` [Builder]
- `setBuilderFields(DividendDateReferenceBuilder arg0)` → `void` [Setter]
- `getDateReference()` → `DividendDateReferenceEnum` [Getter]
- `getPaymentDateOffset()` → `Offset` [Getter]

### DividendPaymentDateBuilderImpl
**Implements:** `DividendPaymentDate$DividendPaymentDateBuilder` 

**Fields:**
- `DividendDateReferenceBuilder dividendDateReference`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder dividendDate`

**Key Methods:**
- `build()` → `DividendPaymentDate` [Builder]
- `setDividendDateValue(AdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `setDividendDate(ReferenceWithMetaAdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `getOrCreateDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]
- `setDividendDateReference(DividendDateReference arg0)` → `DividendPaymentDateBuilder` [Setter]
- `getDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]
- `getOrCreateDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]

### DividendPaymentDateImpl
**Implements:** `DividendPaymentDate` 

**Key Methods:**
- `build()` → `DividendPaymentDate` [Builder]
- `setBuilderFields(DividendPaymentDateBuilder arg0)` → `void` [Setter]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDate` [Getter]
- `getDividendDateReference()` → `DividendDateReference` [Getter]

### DividendPayoutRatioBuilderImpl
**Implements:** `DividendPayoutRatio$DividendPayoutRatioBuilder` 

**Fields:**
- `BigDecimal totalRatio`
- `BigDecimal cashRatio`
- `BigDecimal nonCashRatio`
- `ReferenceWithMetaBasketConstituentBuilder basketConstituent`

**Key Methods:**
- `build()` → `DividendPayoutRatio` [Builder]
- `getTotalRatio()` → `BigDecimal` [Getter]
- `getNonCashRatio()` → `BigDecimal` [Getter]
- `setTotalRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setNonCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `getCashRatio()` → `BigDecimal` [Getter]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]
- `setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setBasketConstituentValue(BasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]

### DividendPayoutRatioImpl
**Implements:** `DividendPayoutRatio` 

**Key Methods:**
- `build()` → `DividendPayoutRatio` [Builder]
- `setBuilderFields(DividendPayoutRatioBuilder arg0)` → `void` [Setter]
- `getTotalRatio()` → `BigDecimal` [Getter]
- `getNonCashRatio()` → `BigDecimal` [Getter]
- `getCashRatio()` → `BigDecimal` [Getter]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]

### DividendPeriodBuilderImpl
**Implements:** `DividendPeriod$DividendPeriodBuilder` 

**Fields:**
- `DividendPaymentDateBuilder startDate`
- `DividendPaymentDateBuilder endDate`
- `BusinessDayAdjustmentsBuilder dateAdjustments`
- `ReferenceWithMetaBasketConstituentBuilder basketConstituent`
- `DividendPaymentDateBuilder dividendPaymentDate`
- `AdjustableOrRelativeDateBuilder dividendValuationDate`

**Key Methods:**
- `build()` → `DividendPeriod` [Builder]
- `getOrCreateEndDate()` → `DividendPaymentDateBuilder` [Getter]
- `getOrCreateStartDate()` → `DividendPaymentDateBuilder` [Getter]
- `getDividendPaymentDate()` → `DividendPaymentDateBuilder` [Getter]
- `setDividendPaymentDate(DividendPaymentDate arg0)` → `DividendPeriodBuilder` [Setter]
- `getDividendValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDividendValuationDate(AdjustableOrRelativeDate arg0)` → `DividendPeriodBuilder` [Setter]
- `getOrCreateDividendValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateDividendPaymentDate()` → `DividendPaymentDateBuilder` [Getter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]

### DividendPeriodImpl
**Implements:** `DividendPeriod` 

**Key Methods:**
- `build()` → `DividendPeriod` [Builder]
- `setBuilderFields(DividendPeriodBuilder arg0)` → `void` [Setter]
- `getDividendPaymentDate()` → `DividendPaymentDate` [Getter]
- `getDividendValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]
- `getEndDate()` → `DividendPaymentDate` [Getter]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]
- `getStartDate()` → `DividendPaymentDate` [Getter]

### DividendReturnTermsBuilderImpl
**Implements:** `DividendReturnTerms$DividendReturnTermsBuilder` 

**Fields:**
- `List (List) dividendPayoutRatio`
- `Boolean dividendReinvestment`
- `DividendEntitlementEnum dividendEntitlement`
- `DividendAmountTypeEnum dividendAmountType`
- `String performance`
- `DividendPeriodEnum firstOrSecondPeriod`
- `AncillaryRoleEnum extraordinaryDividendsParty`
- `DividendAmountTypeEnum excessDividendAmount`
- `DividendCurrencyBuilder dividendCurrency`
- `NonCashDividendTreatmentEnum nonCashDividendTreatment`
- `DividendCompositionEnum dividendComposition`
- `Boolean specialDividends`
- `Boolean materialDividend`
- `List (List) dividendPeriod`

**Key Methods:**
- `build()` → `DividendReturnTerms` [Builder]
- `getExcessDividendAmount()` → `DividendAmountTypeEnum` [Getter]
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendPeriod()` → `List` [Getter]
- `getDividendReinvestment()` → `Boolean` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getFirstOrSecondPeriod()` → `DividendPeriodEnum` [Getter]
- `getDividendCurrency()` → `DividendCurrencyBuilder` [Getter]
- `getDividendComposition()` → `DividendCompositionEnum` [Getter]
- `getSpecialDividends()` → `Boolean` [Getter]

### DividendReturnTermsImpl
**Implements:** `DividendReturnTerms` 

**Key Methods:**
- `build()` → `DividendReturnTerms` [Builder]
- `setBuilderFields(DividendReturnTermsBuilder arg0)` → `void` [Setter]
- `getExcessDividendAmount()` → `DividendAmountTypeEnum` [Getter]
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendPeriod()` → `List` [Getter]
- `getDividendReinvestment()` → `Boolean` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getFirstOrSecondPeriod()` → `DividendPeriodEnum` [Getter]
- `getDividendCurrency()` → `DividendCurrency` [Getter]
- `getDividendComposition()` → `DividendCompositionEnum` [Getter]

### EquityUnderlierProvisionsBuilderImpl
**Implements:** `EquityUnderlierProvisions$EquityUnderlierProvisionsBuilder` 

**Fields:**
- `Boolean multipleExchangeIndexAnnexFallback`
- `Boolean componentSecurityIndexAnnexFallback`
- `FieldWithMetaStringBuilder localJurisdiction`
- `FieldWithMetaStringBuilder relevantJurisdiction`

**Key Methods:**
- `build()` → `EquityUnderlierProvisions` [Builder]
- `getRelevantJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `setLocalJurisdiction(FieldWithMetaString arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setRelevantJurisdiction(FieldWithMetaString arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setLocalJurisdictionValue(String arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setMultipleExchangeIndexAnnexFallback(Boolean arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `getOrCreateLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]

### EquityUnderlierProvisionsImpl
**Implements:** `EquityUnderlierProvisions` 

**Key Methods:**
- `build()` → `EquityUnderlierProvisions` [Builder]
- `setBuilderFields(EquityUnderlierProvisionsBuilder arg0)` → `void` [Setter]
- `getRelevantJurisdiction()` → `FieldWithMetaString` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaString` [Getter]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]

### FixedAmountCalculationDetailsBuilderImpl
**Implements:** `FixedAmountCalculationDetails$FixedAmountCalculationDetailsBuilder` 

**Fields:**
- `CalculationPeriodBaseBuilder calculationPeriod`
- `MoneyBuilder calculationPeriodNotionalAmount`
- `BigDecimal fixedRate`
- `BigDecimal yearFraction`
- `BigDecimal calculatedAmount`

**Key Methods:**
- `build()` → `FixedAmountCalculationDetails` [Builder]
- `getYearFraction()` → `BigDecimal` [Getter]
- `setCalculatedAmount(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setFixedRate(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getOrCreateCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]

### FixedAmountCalculationDetailsImpl
**Implements:** `FixedAmountCalculationDetails` 

**Key Methods:**
- `build()` → `FixedAmountCalculationDetails` [Builder]
- `setBuilderFields(FixedAmountCalculationDetailsBuilder arg0)` → `void` [Setter]
- `getYearFraction()` → `BigDecimal` [Getter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]

### FixedRateSpecificationBuilderImpl
**Implements:** `FixedRateSpecification$FixedRateSpecificationBuilder` 

**Fields:**
- `RateScheduleBuilder rateSchedule`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `FixedRateSpecification` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getOrCreateRateSchedule()` → `RateScheduleBuilder` [Getter]
- `setRateSchedule(RateSchedule arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getRateSchedule()` → `RateScheduleBuilder` [Getter]

### FixedRateSpecificationImpl
**Implements:** `FixedRateSpecification` 

**Key Methods:**
- `build()` → `FixedRateSpecification` [Builder]
- `setBuilderFields(FixedRateSpecificationBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getRateSchedule()` → `RateSchedule` [Getter]

### FloatingAmountEventsBuilderImpl
**Implements:** `FloatingAmountEvents$FloatingAmountEventsBuilder` 

**Fields:**
- `Boolean failureToPayPrincipal`
- `InterestShortFallBuilder interestShortfall`
- `Boolean writedown`
- `Boolean impliedWritedown`
- `FloatingAmountProvisionsBuilder floatingAmountProvisions`
- `AdditionalFixedPaymentsBuilder additionalFixedPayments`

**Key Methods:**
- `build()` → `FloatingAmountEvents` [Builder]
- `getInterestShortfall()` → `InterestShortFallBuilder` [Getter]
- `getFloatingAmountProvisions()` → `FloatingAmountProvisionsBuilder` [Getter]
- `setInterestShortfall(InterestShortFall arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setAdditionalFixedPayments(AdditionalFixedPayments arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setImpliedWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setFailureToPayPrincipal(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `getFailureToPayPrincipal()` → `Boolean` [Getter]
- `getImpliedWritedown()` → `Boolean` [Getter]

### FloatingAmountEventsImpl
**Implements:** `FloatingAmountEvents` 

**Key Methods:**
- `build()` → `FloatingAmountEvents` [Builder]
- `setBuilderFields(FloatingAmountEventsBuilder arg0)` → `void` [Setter]
- `getInterestShortfall()` → `InterestShortFall` [Getter]
- `getFloatingAmountProvisions()` → `FloatingAmountProvisions` [Getter]
- `getFailureToPayPrincipal()` → `Boolean` [Getter]
- `getImpliedWritedown()` → `Boolean` [Getter]
- `getWritedown()` → `Boolean` [Getter]
- `getAdditionalFixedPayments()` → `AdditionalFixedPayments` [Getter]

### FloatingAmountProvisionsBuilderImpl
**Implements:** `FloatingAmountProvisions$FloatingAmountProvisionsBuilder` 

**Fields:**
- `Boolean wacCapInterestProvision`
- `Boolean stepUpProvision`

**Key Methods:**
- `build()` → `FloatingAmountProvisions` [Builder]
- `setStepUpProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]
- `setWacCapInterestProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]
- `getWacCapInterestProvision()` → `Boolean` [Getter]
- `getStepUpProvision()` → `Boolean` [Getter]

### FloatingAmountProvisionsImpl
**Implements:** `FloatingAmountProvisions` 

**Key Methods:**
- `build()` → `FloatingAmountProvisions` [Builder]
- `setBuilderFields(FloatingAmountProvisionsBuilder arg0)` → `void` [Setter]
- `getWacCapInterestProvision()` → `Boolean` [Getter]
- `getStepUpProvision()` → `Boolean` [Getter]

### FloatingRateBaseBuilderImpl
**Implements:** `FloatingRateBase$FloatingRateBaseBuilder` 

**Fields:**
- `ReferenceWithMetaInterestRateIndexBuilder rateOption`
- `SpreadScheduleBuilder spreadSchedule`
- `StrikeScheduleBuilder capRateSchedule`
- `StrikeScheduleBuilder floorRateSchedule`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `FloatingRateBase` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndexBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FloatingRateBaseBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `getOrCreateCapRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `getOrCreateSpreadSchedule()` → `SpreadScheduleBuilder` [Getter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]

### FloatingRateBaseImpl
**Implements:** `FloatingRateBase` 

**Key Methods:**
- `build()` → `FloatingRateBase` [Builder]
- `setBuilderFields(FloatingRateBaseBuilder arg0)` → `void` [Setter]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndex` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getSpreadSchedule()` → `SpreadSchedule` [Getter]
- `getFloorRateSchedule()` → `StrikeSchedule` [Getter]
- `getCapRateSchedule()` → `StrikeSchedule` [Getter]

### FloatingRateBuilderImpl
**Extends:** `FloatingRateBase$FloatingRateBaseBuilderImpl` 
**Implements:** `FloatingRate$FloatingRateBuilder` 

**Fields:**
- `RateScheduleBuilder floatingRateMultiplierSchedule`
- `RateTreatmentEnum rateTreatment`
- `FloatingRateCalculationParametersBuilder calculationParameters`
- `FallbackRateParametersBuilder fallbackRate`

**Key Methods:**
- `build()` → `FloatingRate` [Builder]
- `setMeta(MetaFields arg0)` → `FloatingRateBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateBuilder` [Setter]
- `getOrCreateFallbackRate()` → `FallbackRateParametersBuilder` [Getter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateBuilder` [Setter]
- `setCalculationParameters(FloatingRateCalculationParameters arg0)` → `FloatingRateBuilder` [Setter]

### FloatingRateDefinitionBuilderImpl
**Implements:** `FloatingRateDefinition$FloatingRateDefinitionBuilder` 

**Fields:**
- `BigDecimal calculatedRate`
- `List (List) rateObservation`
- `BigDecimal floatingRateMultiplier`
- `BigDecimal spread`
- `List (List) capRate`
- `List (List) floorRate`

**Key Methods:**
- `build()` → `FloatingRateDefinition` [Builder]
- `getOrCreateFloorRate(int arg0)` → `StrikeBuilder` [Getter]
- `setCalculatedRate(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `setRateObservation(List arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getFloatingRateMultiplier()` → `BigDecimal` [Getter]
- `setFloatingRateMultiplier(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getFloorRate()` → `List` [Getter]
- `getRateObservation()` → `List` [Getter]
- `getOrCreateRateObservation(int arg0)` → `RateObservationBuilder` [Getter]

### FloatingRateDefinitionImpl
**Implements:** `FloatingRateDefinition` 

**Key Methods:**
- `build()` → `FloatingRateDefinition` [Builder]
- `setBuilderFields(FloatingRateDefinitionBuilder arg0)` → `void` [Setter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getFloatingRateMultiplier()` → `BigDecimal` [Getter]
- `getFloorRate()` → `List` [Getter]
- `getRateObservation()` → `List` [Getter]
- `getCapRate()` → `List` [Getter]
- `getSpread()` → `BigDecimal` [Getter]

### FloatingRateImpl
**Extends:** `FloatingRateBase$FloatingRateBaseImpl` 
**Implements:** `FloatingRate` 

**Key Methods:**
- `build()` → `FloatingRate` [Builder]
- `setBuilderFields(FloatingRateBuilder arg0)` → `void` [Setter]
- `getFloatingRateMultiplierSchedule()` → `RateSchedule` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getFallbackRate()` → `FallbackRateParameters` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]

### FloatingRateSpecificationBuilderImpl
**Extends:** `FloatingRate$FloatingRateBuilderImpl` 
**Implements:** `FloatingRateSpecification$FloatingRateSpecificationBuilder` 

**Fields:**
- `PriceBuilder initialRate`
- `RoundingBuilder finalRateRounding`
- `AveragingWeightingMethodEnum averagingMethod`
- `NegativeInterestRateTreatmentEnum negativeInterestRateTreatment`

**Key Methods:**
- `build()` → `FloatingRateSpecification` [Builder]
- `getAveragingMethod()` → `AveragingWeightingMethodEnum` [Getter]
- `setMeta(MetaFields arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFinalRateRounding(Rounding arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setInitialRate(Price arg0)` → `FloatingRateSpecificationBuilder` [Setter]

### FloatingRateSpecificationImpl
**Extends:** `FloatingRate$FloatingRateImpl` 
**Implements:** `FloatingRateSpecification` 

**Key Methods:**
- `build()` → `FloatingRateSpecification` [Builder]
- `setBuilderFields(FloatingRateSpecificationBuilder arg0)` → `void` [Setter]
- `getAveragingMethod()` → `AveragingWeightingMethodEnum` [Getter]
- `getNegativeInterestRateTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `getFinalRateRounding()` → `Rounding` [Getter]

### ForeignExchangeBuilderImpl
**Implements:** `ForeignExchange$ForeignExchangeBuilder` 

**Fields:**
- `CashflowBuilder exchangedCurrency1`
- `CashflowBuilder exchangedCurrency2`
- `PeriodBuilder tenorPeriod`

**Key Methods:**
- `build()` → `ForeignExchange` [Builder]
- `getOrCreateTenorPeriod()` → `PeriodBuilder` [Getter]
- `getExchangedCurrency2()` → `CashflowBuilder` [Getter]
- `getTenorPeriod()` → `PeriodBuilder` [Getter]
- `getExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `setExchangedCurrency1(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]
- `setExchangedCurrency2(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]
- `setTenorPeriod(Period arg0)` → `ForeignExchangeBuilder` [Setter]
- `getOrCreateExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `getOrCreateExchangedCurrency2()` → `CashflowBuilder` [Getter]

### ForeignExchangeImpl
**Implements:** `ForeignExchange` 

**Key Methods:**
- `build()` → `ForeignExchange` [Builder]
- `setBuilderFields(ForeignExchangeBuilder arg0)` → `void` [Setter]
- `getExchangedCurrency2()` → `Cashflow` [Getter]
- `getTenorPeriod()` → `Period` [Getter]
- `getExchangedCurrency1()` → `Cashflow` [Getter]

### FutureValueAmountBuilderImpl
**Implements:** `FutureValueAmount$FutureValueAmountBuilder` 

**Fields:**
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder quantity`
- `FieldWithMetaStringBuilder currency`
- `Integer calculationPeriodNumberOfDays`
- `Date valueDate`

**Key Methods:**
- `build()` → `FutureValueAmount` [Builder]
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `FutureValueAmountBuilder` [Setter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `FutureValueAmountBuilder` [Setter]
- `setQuantityValue(NonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `getCalculationPeriodNumberOfDays()` → `Integer` [Getter]
- `setCalculationPeriodNumberOfDays(Integer arg0)` → `FutureValueAmountBuilder` [Setter]

### FutureValueAmountImpl
**Implements:** `FutureValueAmount` 

**Key Methods:**
- `build()` → `FutureValueAmount` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `setBuilderFields(FutureValueAmountBuilder arg0)` → `void` [Setter]
- `getCalculationPeriodNumberOfDays()` → `Integer` [Getter]
- `getValueDate()` → `Date` [Getter]

### GeneralTermsBuilderImpl
**Implements:** `GeneralTerms$GeneralTermsBuilder` 

**Fields:**
- `ReferenceInformationBuilder referenceInformation`
- `CreditIndexBuilder indexReferenceInformation`
- `BasketReferenceInformationBuilder basketReferenceInformation`
- `List (List) additionalTerm`
- `Boolean substitution`
- `Boolean modifiedEquityDelivery`

**Key Methods:**
- `build()` → `GeneralTerms` [Builder]
- `setReferenceInformation(ReferenceInformation arg0)` → `GeneralTermsBuilder` [Setter]
- `getReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `getIndexReferenceInformation()` → `CreditIndexBuilder` [Getter]
- `getOrCreateReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `getSubstitution()` → `Boolean` [Getter]
- `getModifiedEquityDelivery()` → `Boolean` [Getter]
- `setAdditionalTerm(List arg0)` → `GeneralTermsBuilder` [Setter]
- `setModifiedEquityDelivery(Boolean arg0)` → `GeneralTermsBuilder` [Setter]
- `setSubstitution(Boolean arg0)` → `GeneralTermsBuilder` [Setter]

### GeneralTermsImpl
**Implements:** `GeneralTerms` 

**Key Methods:**
- `build()` → `GeneralTerms` [Builder]
- `setBuilderFields(GeneralTermsBuilder arg0)` → `void` [Setter]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `getIndexReferenceInformation()` → `CreditIndex` [Getter]
- `getSubstitution()` → `Boolean` [Getter]
- `getModifiedEquityDelivery()` → `Boolean` [Getter]
- `getBasketReferenceInformation()` → `BasketReferenceInformation` [Getter]
- `getAdditionalTerm()` → `List` [Getter]

### InflationRateSpecificationBuilderImpl
**Extends:** `FloatingRateSpecification$FloatingRateSpecificationBuilderImpl` 
**Implements:** `InflationRateSpecification$InflationRateSpecificationBuilder` 

**Fields:**
- `OffsetBuilder inflationLag`
- `FieldWithMetaStringBuilder indexSource`
- `FieldWithMetaStringBuilder mainPublication`
- `FieldWithMetaInterpolationMethodEnumBuilder interpolationMethod`
- `BigDecimal initialIndexLevel`
- `Boolean fallbackBondApplicable`
- `InflationCalculationMethodEnum calculationMethod`
- `InflationCalculationStyleEnum calculationStyle`
- `FinalPrincipalExchangeCalculationEnum finalPrincipalExchangeCalculation`

**Key Methods:**
- `build()` → `InflationRateSpecification` [Builder]
- `setMeta(MetaFields arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getCalculationMethod()` → `InflationCalculationMethodEnum` [Getter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getOrCreateMainPublication()` → `FieldWithMetaStringBuilder` [Getter]
- `setIndexSourceValue(String arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getMainPublication()` → `FieldWithMetaStringBuilder` [Getter]

### InflationRateSpecificationImpl
**Extends:** `FloatingRateSpecification$FloatingRateSpecificationImpl` 
**Implements:** `InflationRateSpecification` 

**Key Methods:**
- `build()` → `InflationRateSpecification` [Builder]
- `setBuilderFields(InflationRateSpecificationBuilder arg0)` → `void` [Setter]
- `getCalculationMethod()` → `InflationCalculationMethodEnum` [Getter]
- `getMainPublication()` → `FieldWithMetaString` [Getter]
- `getInflationLag()` → `Offset` [Getter]
- `getIndexSource()` → `FieldWithMetaString` [Getter]
- `getInitialIndexLevel()` → `BigDecimal` [Getter]
- `getInterpolationMethod()` → `FieldWithMetaInterpolationMethodEnum` [Getter]
- `getCalculationStyle()` → `InflationCalculationStyleEnum` [Getter]
- `getFallbackBondApplicable()` → `Boolean` [Getter]

### InterestRatePayoutBuilderImpl
**Extends:** `PayoutBase$PayoutBaseBuilderImpl` 
**Implements:** `InterestRatePayout$InterestRatePayoutBuilder` 

**Fields:**
- `RateSpecificationBuilder rateSpecification`
- `FieldWithMetaDayCountFractionEnumBuilder dayCountFraction`
- `CalculationPeriodDatesBuilder calculationPeriodDates`
- `PaymentDatesBuilder paymentDates`
- `AdjustableDateBuilder paymentDate`
- `Boolean paymentDelay`
- `ResetDatesBuilder resetDates`
- `DiscountingMethodBuilder discountingMethod`
- `CompoundingMethodEnum compoundingMethod`
- `CashflowRepresentationBuilder cashflowRepresentation`
- `StubPeriodBuilder stubPeriod`
- `BondReferenceBuilder bondReference`
- `String fixedAmount`
- `String floatingAmount`
- `SpreadCalculationMethodEnum spreadCalculationMethod`

**Key Methods:**
- `build()` → `InterestRatePayout` [Builder]
- `setPayerReceiver(PayerReceiver arg0)` → `InterestRatePayoutBuilder` [Setter]
- `setPriceQuantity(ResolvablePriceQuantity arg0)` → `InterestRatePayoutBuilder` [Setter]
- `setSettlementTerms(SettlementTerms arg0)` → `InterestRatePayoutBuilder` [Setter]
- `setPaymentDates(PaymentDates arg0)` → `InterestRatePayoutBuilder` [Setter]
- `getDayCountFraction()` → `FieldWithMetaDayCountFractionEnumBuilder` [Getter]
- `getPaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getOrCreatePaymentDates()` → `PaymentDatesBuilder` [Getter]
- `getOrCreateResetDates()` → `ResetDatesBuilder` [Getter]
- `getOrCreateStubPeriod()` → `StubPeriodBuilder` [Getter]

### InterestRatePayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `InterestRatePayout` 

**Key Methods:**
- `build()` → `InterestRatePayout` [Builder]
- `setBuilderFields(InterestRatePayoutBuilder arg0)` → `void` [Setter]
- `getDayCountFraction()` → `FieldWithMetaDayCountFractionEnum` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]
- `getRateSpecification()` → `RateSpecification` [Getter]
- `getCalculationPeriodDates()` → `CalculationPeriodDates` [Getter]
- `getStubPeriod()` → `StubPeriod` [Getter]
- `getResetDates()` → `ResetDates` [Getter]
- `getDiscountingMethod()` → `DiscountingMethod` [Getter]
- `getBondReference()` → `BondReference` [Getter]

### InterestShortFallBuilderImpl
**Implements:** `InterestShortFall$InterestShortFallBuilder` 

**Fields:**
- `InterestShortfallCapEnum interestShortfallCap`
- `Boolean compounding`
- `FieldWithMetaFloatingRateIndexEnumBuilder rateSource`

**Key Methods:**
- `build()` → `InterestShortFall` [Builder]
- `setRateSourceValue(FloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getOrCreateRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getInterestShortfallCap()` → `InterestShortfallCapEnum` [Getter]
- `setRateSource(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `setCompounding(Boolean arg0)` → `InterestShortFallBuilder` [Setter]
- `setInterestShortfallCap(InterestShortfallCapEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getCompounding()` → `Boolean` [Getter]

### InterestShortFallImpl
**Implements:** `InterestShortFall` 

**Key Methods:**
- `build()` → `InterestShortFall` [Builder]
- `setBuilderFields(InterestShortFallBuilder arg0)` → `void` [Setter]
- `getRateSource()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getInterestShortfallCap()` → `InterestShortfallCapEnum` [Getter]
- `getCompounding()` → `Boolean` [Getter]

### PriceReturnTermsBuilderImpl
**Implements:** `PriceReturnTerms$PriceReturnTermsBuilder` 

**Fields:**
- `ReturnTypeEnum returnType`
- `BigDecimal conversionFactor`
- `String performance`

**Key Methods:**
- `getReturnType()` → `ReturnTypeEnum` [Getter]
- `build()` → `PriceReturnTerms` [Builder]
- `setReturnType(ReturnTypeEnum arg0)` → `PriceReturnTermsBuilder` [Setter]
- `setConversionFactor(BigDecimal arg0)` → `PriceReturnTermsBuilder` [Setter]
- `setPerformance(String arg0)` → `PriceReturnTermsBuilder` [Setter]
- `getPerformance()` → `String` [Getter]
- `getConversionFactor()` → `BigDecimal` [Getter]

### PriceReturnTermsImpl
**Implements:** `PriceReturnTerms` 

**Key Methods:**
- `getReturnType()` → `ReturnTypeEnum` [Getter]
- `build()` → `PriceReturnTerms` [Builder]
- `setBuilderFields(PriceReturnTermsBuilder arg0)` → `void` [Setter]
- `getPerformance()` → `String` [Getter]
- `getConversionFactor()` → `BigDecimal` [Getter]

### ProtectionTermsBuilderImpl
**Implements:** `ProtectionTerms$ProtectionTermsBuilder` 

**Fields:**
- `CreditEventsBuilder creditEvents`
- `ObligationsBuilder obligations`
- `FloatingAmountEventsBuilder floatingAmountEvents`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ProtectionTerms` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ProtectionTermsBuilder` [Setter]
- `getCreditEvents()` → `CreditEventsBuilder` [Getter]
- `setObligations(Obligations arg0)` → `ProtectionTermsBuilder` [Setter]
- `getOrCreateObligations()` → `ObligationsBuilder` [Getter]
- `setFloatingAmountEvents(FloatingAmountEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `setCreditEvents(CreditEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `getOrCreateCreditEvents()` → `CreditEventsBuilder` [Getter]

### ProtectionTermsImpl
**Implements:** `ProtectionTerms` 

**Key Methods:**
- `build()` → `ProtectionTerms` [Builder]
- `setBuilderFields(ProtectionTermsBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getCreditEvents()` → `CreditEvents` [Getter]
- `getObligations()` → `Obligations` [Getter]
- `getFloatingAmountEvents()` → `FloatingAmountEvents` [Getter]

### RateSpecificationBuilderImpl
**Implements:** `RateSpecification$RateSpecificationBuilder` 

**Fields:**
- `FixedRateSpecificationBuilder fixedRateSpecification`
- `FloatingRateSpecificationBuilder floatingRateSpecification`
- `InflationRateSpecificationBuilder inflationRateSpecification`

**Key Methods:**
- `build()` → `RateSpecification` [Builder]
- `setFixedRateSpecification(FixedRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getOrCreateFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]
- `getOrCreateFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]
- `getOrCreateInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `setInflationRateSpecification(InflationRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `setFloatingRateSpecification(FloatingRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `getFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]
- `getFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]

### RateSpecificationImpl
**Implements:** `RateSpecification` 

**Key Methods:**
- `build()` → `RateSpecification` [Builder]
- `setBuilderFields(RateSpecificationBuilder arg0)` → `void` [Setter]
- `getInflationRateSpecification()` → `InflationRateSpecification` [Getter]
- `getFloatingRateSpecification()` → `FloatingRateSpecification` [Getter]
- `getFixedRateSpecification()` → `FixedRateSpecification` [Getter]

### ReferenceInformationBuilderImpl
**Implements:** `ReferenceInformation$ReferenceInformationBuilder` 

**Fields:**
- `LegalEntityBuilder referenceEntity`
- `List (List) referenceObligation`
- `Boolean noReferenceObligation`
- `Boolean unknownReferenceObligation`
- `Boolean allGuarantees`
- `PriceBuilder referencePrice`
- `Boolean referencePolicy`
- `Boolean securedList`

**Key Methods:**
- `build()` → `ReferenceInformation` [Builder]
- `getAllGuarantees()` → `Boolean` [Getter]
- `getReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `getReferencePrice()` → `PriceBuilder` [Getter]
- `getReferenceObligation()` → `List` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getReferencePolicy()` → `Boolean` [Getter]
- `getSecuredList()` → `Boolean` [Getter]
- `getUnknownReferenceObligation()` → `Boolean` [Getter]
- `setUnknownReferenceObligation(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]

### ReferenceInformationImpl
**Implements:** `ReferenceInformation` 

**Key Methods:**
- `build()` → `ReferenceInformation` [Builder]
- `getAllGuarantees()` → `Boolean` [Getter]
- `setBuilderFields(ReferenceInformationBuilder arg0)` → `void` [Setter]
- `getReferenceEntity()` → `LegalEntity` [Getter]
- `getReferencePrice()` → `Price` [Getter]
- `getReferenceObligation()` → `List` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getReferencePolicy()` → `Boolean` [Getter]
- `getSecuredList()` → `Boolean` [Getter]
- `getUnknownReferenceObligation()` → `Boolean` [Getter]

### ReferenceObligationBuilderImpl
**Implements:** `ReferenceObligation$ReferenceObligationBuilder` 

**Fields:**
- `SecurityBuilder security`
- `LoanBuilder loan`
- `LegalEntityBuilder primaryObligor`
- `ReferenceWithMetaLegalEntityBuilder primaryObligorReference`
- `LegalEntityBuilder guarantor`
- `String guarantorReference`
- `Boolean standardReferenceObligation`

**Key Methods:**
- `build()` → `ReferenceObligation` [Builder]
- `getSecurity()` → `SecurityBuilder` [Getter]
- `getOrCreateSecurity()` → `SecurityBuilder` [Getter]
- `getLoan()` → `LoanBuilder` [Getter]
- `setLoan(Loan arg0)` → `ReferenceObligationBuilder` [Setter]
- `setStandardReferenceObligation(Boolean arg0)` → `ReferenceObligationBuilder` [Setter]
- `getOrCreatePrimaryObligorReference()` → `ReferenceWithMetaLegalEntityBuilder` [Getter]
- `getStandardReferenceObligation()` → `Boolean` [Getter]
- `setPrimaryObligorReferenceValue(LegalEntity arg0)` → `ReferenceObligationBuilder` [Setter]
- `setSecurity(Security arg0)` → `ReferenceObligationBuilder` [Setter]

### ReferenceObligationImpl
**Implements:** `ReferenceObligation` 

**Key Methods:**
- `build()` → `ReferenceObligation` [Builder]
- `setBuilderFields(ReferenceObligationBuilder arg0)` → `void` [Setter]
- `getSecurity()` → `Security` [Getter]
- `getLoan()` → `Loan` [Getter]
- `getStandardReferenceObligation()` → `Boolean` [Getter]
- `getPrimaryObligorReference()` → `ReferenceWithMetaLegalEntity` [Getter]
- `getGuarantor()` → `LegalEntity` [Getter]
- `getPrimaryObligor()` → `LegalEntity` [Getter]
- `getGuarantorReference()` → `String` [Getter]

### ReferencePairBuilderImpl
**Implements:** `ReferencePair$ReferencePairBuilder` 

**Fields:**
- `LegalEntityBuilder referenceEntity`
- `ReferenceObligationBuilder referenceObligation`
- `Boolean noReferenceObligation`
- `FieldWithMetaEntityTypeEnumBuilder entityType`

**Key Methods:**
- `build()` → `ReferencePair` [Builder]
- `getReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `getReferenceObligation()` → `ReferenceObligationBuilder` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getOrCreateEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `setEntityTypeValue(EntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `setEntityType(FieldWithMetaEntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `getEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `getOrCreateReferenceObligation()` → `ReferenceObligationBuilder` [Getter]
- `setReferenceObligation(ReferenceObligation arg0)` → `ReferencePairBuilder` [Setter]

### ReferencePairImpl
**Implements:** `ReferencePair` 

**Key Methods:**
- `build()` → `ReferencePair` [Builder]
- `setBuilderFields(ReferencePairBuilder arg0)` → `void` [Setter]
- `getReferenceEntity()` → `LegalEntity` [Getter]
- `getReferenceObligation()` → `ReferenceObligation` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getEntityType()` → `FieldWithMetaEntityTypeEnum` [Getter]

### ReferencePoolBuilderImpl
**Implements:** `ReferencePool$ReferencePoolBuilder` 

**Fields:**
- `List (List) referencePoolItem`

**Key Methods:**
- `build()` → `ReferencePool` [Builder]
- `getReferencePoolItem()` → `List` [Getter]
- `setReferencePoolItem(List arg0)` → `ReferencePoolBuilder` [Setter]
- `getOrCreateReferencePoolItem(int arg0)` → `ReferencePoolItemBuilder` [Getter]

### ReferencePoolImpl
**Implements:** `ReferencePool` 

**Key Methods:**
- `build()` → `ReferencePool` [Builder]
- `setBuilderFields(ReferencePoolBuilder arg0)` → `void` [Setter]
- `getReferencePoolItem()` → `List` [Getter]

### ReferencePoolItemBuilderImpl
**Implements:** `ReferencePoolItem$ReferencePoolItemBuilder` 

**Fields:**
- `ConstituentWeightBuilder constituentWeight`
- `ReferencePairBuilder referencePair`
- `ReferenceWithMetaProtectionTermsBuilder protectionTermsReference`
- `ReferenceWithMetaCashSettlementTermsBuilder cashSettlementTermsReference`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder physicalSettlementTermsReference`

**Key Methods:**
- `build()` → `ReferencePoolItem` [Builder]
- `getOrCreatePhysicalSettlementTermsReference()` → `ReferenceWithMetaPhysicalSettlementTermsBuilder` [Getter]
- `getConstituentWeight()` → `ConstituentWeightBuilder` [Getter]
- `getOrCreateReferencePair()` → `ReferencePairBuilder` [Getter]
- `getReferencePair()` → `ReferencePairBuilder` [Getter]
- `setConstituentWeight(ConstituentWeight arg0)` → `ReferencePoolItemBuilder` [Setter]
- `setReferencePair(ReferencePair arg0)` → `ReferencePoolItemBuilder` [Setter]
- `getProtectionTermsReference()` → `ReferenceWithMetaProtectionTermsBuilder` [Getter]
- `getCashSettlementTermsReference()` → `ReferenceWithMetaCashSettlementTermsBuilder` [Getter]
- `setProtectionTermsReference(ReferenceWithMetaProtectionTerms arg0)` → `ReferencePoolItemBuilder` [Setter]

### ReferencePoolItemImpl
**Implements:** `ReferencePoolItem` 

**Key Methods:**
- `build()` → `ReferencePoolItem` [Builder]
- `setBuilderFields(ReferencePoolItemBuilder arg0)` → `void` [Setter]
- `getConstituentWeight()` → `ConstituentWeight` [Getter]
- `getReferencePair()` → `ReferencePair` [Getter]
- `getProtectionTermsReference()` → `ReferenceWithMetaProtectionTerms` [Getter]
- `getCashSettlementTermsReference()` → `ReferenceWithMetaCashSettlementTerms` [Getter]
- `getPhysicalSettlementTermsReference()` → `ReferenceWithMetaPhysicalSettlementTerms` [Getter]

### ReturnTermsBaseBuilderImpl
**Implements:** `ReturnTermsBase$ReturnTermsBaseBuilder` 

**Fields:**
- `ValuationTermsBuilder valuationTerms`
- `Integer annualizationFactor`
- `DividendApplicabilityBuilder dividendApplicability`
- `EquityUnderlierProvisionsBuilder equityUnderlierProvisions`
- `Boolean sharePriceDividendAdjustment`
- `Integer expectedN`
- `BigDecimal initialLevel`
- `DeterminationMethodEnum initialLevelSource`
- `Boolean meanAdjustment`
- `String performance`

**Key Methods:**
- `build()` → `ReturnTermsBase` [Builder]
- `getMeanAdjustment()` → `Boolean` [Getter]
- `getExpectedN()` → `Integer` [Getter]
- `getInitialLevelSource()` → `DeterminationMethodEnum` [Getter]
- `getAnnualizationFactor()` → `Integer` [Getter]
- `getValuationTerms()` → `ValuationTermsBuilder` [Getter]
- `getInitialLevel()` → `BigDecimal` [Getter]
- `getDividendApplicability()` → `DividendApplicabilityBuilder` [Getter]
- `setInitialLevel(BigDecimal arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `ReturnTermsBaseBuilder` [Setter]

### ReturnTermsBaseImpl
**Implements:** `ReturnTermsBase` 

**Key Methods:**
- `build()` → `ReturnTermsBase` [Builder]
- `setBuilderFields(ReturnTermsBaseBuilder arg0)` → `void` [Setter]
- `getMeanAdjustment()` → `Boolean` [Getter]
- `getExpectedN()` → `Integer` [Getter]
- `getInitialLevelSource()` → `DeterminationMethodEnum` [Getter]
- `getAnnualizationFactor()` → `Integer` [Getter]
- `getValuationTerms()` → `ValuationTerms` [Getter]
- `getInitialLevel()` → `BigDecimal` [Getter]
- `getDividendApplicability()` → `DividendApplicability` [Getter]
- `getEquityUnderlierProvisions()` → `EquityUnderlierProvisions` [Getter]

### SettledEntityMatrixBuilderImpl
**Implements:** `SettledEntityMatrix$SettledEntityMatrixBuilder` 

**Fields:**
- `FieldWithMetaSettledEntityMatrixSourceEnumBuilder matrixSource`
- `Date publicationDate`

**Key Methods:**
- `build()` → `SettledEntityMatrix` [Builder]
- `setPublicationDate(Date arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `getPublicationDate()` → `Date` [Getter]
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]
- `setMatrixSource(FieldWithMetaSettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `setMatrixSourceValue(SettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `getOrCreateMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]

### SettledEntityMatrixImpl
**Implements:** `SettledEntityMatrix` 

**Key Methods:**
- `build()` → `SettledEntityMatrix` [Builder]
- `setBuilderFields(SettledEntityMatrixBuilder arg0)` → `void` [Setter]
- `getPublicationDate()` → `Date` [Getter]
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnum` [Getter]

### SpreadScheduleBuilderImpl
**Extends:** `RateSchedule$RateScheduleBuilderImpl` 
**Implements:** `SpreadSchedule$SpreadScheduleBuilder` 

**Fields:**
- `FieldWithMetaSpreadScheduleTypeEnumBuilder spreadScheduleType`

**Key Methods:**
- `build()` → `SpreadSchedule` [Builder]
- `setPriceValue(PriceSchedule arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleType(FieldWithMetaSpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleTypeValue(SpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `getSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]
- `getOrCreateSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `SpreadScheduleBuilder` [Setter]

### SpreadScheduleImpl
**Extends:** `RateSchedule$RateScheduleImpl` 
**Implements:** `SpreadSchedule` 

**Key Methods:**
- `build()` → `SpreadSchedule` [Builder]
- `setBuilderFields(SpreadScheduleBuilder arg0)` → `void` [Setter]
- `getSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnum` [Getter]

### StubFloatingRateBuilderImpl
**Implements:** `StubFloatingRate$StubFloatingRateBuilder` 

**Fields:**
- `FloatingRateIndexEnum floatingRateIndex`
- `PeriodBuilder indexTenor`
- `ScheduleBuilder floatingRateMultiplierSchedule`
- `List (List) spreadSchedule`
- `RateTreatmentEnum rateTreatment`
- `List (List) capRateSchedule`
- `List (List) floorRateSchedule`

**Key Methods:**
- `build()` → `StubFloatingRate` [Builder]
- `setCapRateSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateCapRateSchedule(int arg0)` → `StrikeScheduleBuilder` [Getter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `StubFloatingRateBuilder` [Setter]
- `setFloorRateSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateSpreadSchedule(int arg0)` → `SpreadScheduleBuilder` [Getter]
- `setSpreadSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateFloatingRateMultiplierSchedule()` → `ScheduleBuilder` [Getter]

### StubFloatingRateImpl
**Implements:** `StubFloatingRate` 

**Key Methods:**
- `build()` → `StubFloatingRate` [Builder]
- `setBuilderFields(StubFloatingRateBuilder arg0)` → `void` [Setter]
- `getFloatingRateMultiplierSchedule()` → `Schedule` [Getter]
- `getSpreadSchedule()` → `List` [Getter]
- `getFloorRateSchedule()` → `List` [Getter]
- `getCapRateSchedule()` → `List` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]

### StubValueBuilderImpl
**Implements:** `StubValue$StubValueBuilder` 

**Fields:**
- `List (List) floatingRate`
- `BigDecimal stubRate`
- `MoneyBuilder stubAmount`

**Key Methods:**
- `build()` → `StubValue` [Builder]
- `setStubAmount(Money arg0)` → `StubValueBuilder` [Setter]
- `getStubAmount()` → `MoneyBuilder` [Getter]
- `setStubRate(BigDecimal arg0)` → `StubValueBuilder` [Setter]
- `getStubRate()` → `BigDecimal` [Getter]
- `getOrCreateStubAmount()` → `MoneyBuilder` [Getter]
- `getOrCreateFloatingRate(int arg0)` → `StubFloatingRateBuilder` [Getter]
- `getFloatingRate()` → `List` [Getter]
- `setFloatingRate(List arg0)` → `StubValueBuilder` [Setter]

### StubValueImpl
**Implements:** `StubValue` 

**Key Methods:**
- `build()` → `StubValue` [Builder]
- `setBuilderFields(StubValueBuilder arg0)` → `void` [Setter]
- `getStubAmount()` → `Money` [Getter]
- `getStubRate()` → `BigDecimal` [Getter]
- `getFloatingRate()` → `List` [Getter]

### TrancheBuilderImpl
**Implements:** `Tranche$TrancheBuilder` 

**Fields:**
- `BigDecimal attachmentPoint`
- `BigDecimal exhaustionPoint`
- `Boolean incurredRecoveryApplicable`

**Key Methods:**
- `build()` → `Tranche` [Builder]
- `getAttachmentPoint()` → `BigDecimal` [Getter]
- `getExhaustionPoint()` → `BigDecimal` [Getter]
- `setExhaustionPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]
- `setAttachmentPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]
- `getIncurredRecoveryApplicable()` → `Boolean` [Getter]
- `setIncurredRecoveryApplicable(Boolean arg0)` → `TrancheBuilder` [Setter]

### TrancheImpl
**Implements:** `Tranche` 

**Key Methods:**
- `build()` → `Tranche` [Builder]
- `setBuilderFields(TrancheBuilder arg0)` → `void` [Setter]
- `getAttachmentPoint()` → `BigDecimal` [Getter]
- `getExhaustionPoint()` → `BigDecimal` [Getter]
- `getIncurredRecoveryApplicable()` → `Boolean` [Getter]

### ValuationTermsBuilderImpl
**Implements:** `ValuationTerms$ValuationTermsBuilder` 

**Fields:**
- `Boolean futuresPriceValuation`
- `Boolean optionsPriceValuation`
- `Integer numberOfValuationDates`
- `AdjustableRelativeOrPeriodicDatesBuilder dividendValuationDates`
- `FPVFinalPriceElectionFallbackEnum fPVFinalPriceElectionFallback`
- `Boolean multipleExchangeIndexAnnexFallback`
- `Boolean componentSecurityIndexAnnexFallback`

**Key Methods:**
- `build()` → `ValuationTerms` [Builder]
- `getFuturesPriceValuation()` → `Boolean` [Getter]
- `getOptionsPriceValuation()` → `Boolean` [Getter]
- `getNumberOfValuationDates()` → `Integer` [Getter]
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getFPVFinalPriceElectionFallback()` → `FPVFinalPriceElectionFallbackEnum` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `setFuturesPriceValuation(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setOptionsPriceValuation(Boolean arg0)` → `ValuationTermsBuilder` [Setter]

### ValuationTermsImpl
**Implements:** `ValuationTerms` 

**Key Methods:**
- `build()` → `ValuationTerms` [Builder]
- `setBuilderFields(ValuationTermsBuilder arg0)` → `void` [Setter]
- `getFuturesPriceValuation()` → `Boolean` [Getter]
- `getOptionsPriceValuation()` → `Boolean` [Getter]
- `getNumberOfValuationDates()` → `Integer` [Getter]
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getFPVFinalPriceElectionFallback()` → `FPVFinalPriceElectionFallbackEnum` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]

### VarianceCapFloorBuilderImpl
**Implements:** `VarianceCapFloor$VarianceCapFloorBuilder` 

**Fields:**
- `Boolean varianceCap`
- `BigDecimal unadjustedVarianceCap`
- `BoundedVarianceBuilder boundedVariance`

**Key Methods:**
- `build()` → `VarianceCapFloor` [Builder]
- `setUnadjustedVarianceCap(BigDecimal arg0)` → `VarianceCapFloorBuilder` [Setter]
- `getVarianceCap()` → `Boolean` [Getter]
- `getUnadjustedVarianceCap()` → `BigDecimal` [Getter]
- `getBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `getOrCreateBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `setBoundedVariance(BoundedVariance arg0)` → `VarianceCapFloorBuilder` [Setter]
- `setVarianceCap(Boolean arg0)` → `VarianceCapFloorBuilder` [Setter]

### VarianceCapFloorImpl
**Implements:** `VarianceCapFloor` 

**Key Methods:**
- `build()` → `VarianceCapFloor` [Builder]
- `setBuilderFields(VarianceCapFloorBuilder arg0)` → `void` [Setter]
- `getVarianceCap()` → `Boolean` [Getter]
- `getUnadjustedVarianceCap()` → `BigDecimal` [Getter]
- `getBoundedVariance()` → `BoundedVariance` [Getter]

### VarianceReturnTermsBuilderImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseBuilderImpl` 
**Implements:** `VarianceReturnTerms$VarianceReturnTermsBuilder` 

**Fields:**
- `PriceBuilder varianceStrikePrice`
- `PriceBuilder volatilityStrikePrice`
- `VarianceCapFloorBuilder varianceCapFloor`
- `VolatilityCapFloorBuilder volatilityCapFloor`
- `NonNegativeQuantityScheduleBuilder vegaNotionalAmount`
- `ReferenceWithMetaObservableBuilder exchangeTradedContractNearest`

**Key Methods:**
- `build()` → `VarianceReturnTerms` [Builder]
- `getVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `getVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `setVolatilityStrikePrice(Price arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setVolatilityCapFloor(VolatilityCapFloor arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setVegaNotionalAmount(NonNegativeQuantitySchedule arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setAnnualizationFactor(Integer arg0)` → `VarianceReturnTermsBuilder` [Setter]

### VarianceReturnTermsImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseImpl` 
**Implements:** `VarianceReturnTerms` 

**Key Methods:**
- `build()` → `VarianceReturnTerms` [Builder]
- `setBuilderFields(VarianceReturnTermsBuilder arg0)` → `void` [Setter]
- `getVolatilityCapFloor()` → `VolatilityCapFloor` [Getter]
- `getVolatilityStrikePrice()` → `Price` [Getter]
- `getVarianceStrikePrice()` → `Price` [Getter]
- `getVarianceCapFloor()` → `VarianceCapFloor` [Getter]
- `getVegaNotionalAmount()` → `NonNegativeQuantitySchedule` [Getter]
- `getExchangeTradedContractNearest()` → `ReferenceWithMetaObservable` [Getter]

### VolatilityCapFloorBuilderImpl
**Implements:** `VolatilityCapFloor$VolatilityCapFloorBuilder` 

**Fields:**
- `Boolean applicable`
- `BigDecimal totalVolatilityCap`
- `BigDecimal volatilityCapFactor`

**Key Methods:**
- `build()` → `VolatilityCapFloor` [Builder]
- `setVolatilityCapFactor(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `setTotalVolatilityCap(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `getTotalVolatilityCap()` → `BigDecimal` [Getter]
- `getVolatilityCapFactor()` → `BigDecimal` [Getter]
- `setApplicable(Boolean arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `getApplicable()` → `Boolean` [Getter]

### VolatilityCapFloorImpl
**Implements:** `VolatilityCapFloor` 

**Key Methods:**
- `build()` → `VolatilityCapFloor` [Builder]
- `setBuilderFields(VolatilityCapFloorBuilder arg0)` → `void` [Setter]
- `getTotalVolatilityCap()` → `BigDecimal` [Getter]
- `getVolatilityCapFactor()` → `BigDecimal` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### VolatilityReturnTermsBuilderImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseBuilderImpl` 
**Implements:** `VolatilityReturnTerms$VolatilityReturnTermsBuilder` 

**Fields:**
- `PriceBuilder volatilityStrikePrice`
- `VolatilityCapFloorBuilder volatilityCapFloor`
- `ListedDerivativeBuilder exchangeTradedContractNearest`

**Key Methods:**
- `build()` → `VolatilityReturnTerms` [Builder]
- `getVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `getVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `setVolatilityStrikePrice(Price arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setVolatilityCapFloor(VolatilityCapFloor arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setAnnualizationFactor(Integer arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setExpectedN(Integer arg0)` → `VolatilityReturnTermsBuilder` [Setter]

### VolatilityReturnTermsImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseImpl` 
**Implements:** `VolatilityReturnTerms` 

**Key Methods:**
- `build()` → `VolatilityReturnTerms` [Builder]
- `setBuilderFields(VolatilityReturnTermsBuilder arg0)` → `void` [Setter]
- `getVolatilityCapFloor()` → `VolatilityCapFloor` [Getter]
- `getVolatilityStrikePrice()` → `Price` [Getter]
- `getExchangeTradedContractNearest()` → `ListedDerivative` [Getter]

