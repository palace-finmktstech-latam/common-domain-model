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
- `getWritedownReimbursement()` → `Boolean` [Getter]
- `getInterestShortfallReimbursement()` → `Boolean` [Getter]
- `getPrincipalShortfallReimbursement()` → `Boolean` [Getter]

### AdditionalFixedPaymentsBuilder
**Implements:** `AdditionalFixedPayments` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setWritedownReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `setInterestShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `setPrincipalShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]

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
- `getPeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `setPeriods(AssetDeliveryPeriods arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setLocation(List arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getOrCreatePeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreateLocation(int arg0)` → `LocationIdentifierBuilder` [Getter]

### AssetDeliveryPeriods
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetDeliveryPeriods` [Builder]
- `getStartDate()` → `Date` [Getter]
- `getEndDate()` → `Date` [Getter]
- `getProfile()` → `List` [Getter]

### AssetDeliveryPeriodsBuilder
**Implements:** `AssetDeliveryPeriods` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setStartDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `setEndDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `setProfile(List arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `getOrCreateProfile(int arg0)` → `AssetDeliveryProfileBuilder` [Getter]
- `getProfile()` → `List` [Getter]

### AssetDeliveryProfile
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetDeliveryProfile` [Builder]
- `getBankHolidaysTreatment()` → `BankHolidayTreatmentEnum` [Getter]
- `getLoadType()` → `LoadTypeEnum` [Getter]
- `getBlock()` → `List` [Getter]

### AssetDeliveryProfileBlock
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssetDeliveryProfileBlock` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `getStartTime()` → `LocalTime` [Getter]
- `getEndTime()` → `LocalTime` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]

### AssetDeliveryProfileBlockBuilder
**Implements:** `AssetDeliveryProfileBlock` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDayOfWeek(List arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `setStartTime(LocalTime arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `setEndTime(LocalTime arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setPriceTimeIntervalQuantity(Price arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getOrCreatePriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]

### AssetDeliveryProfileBuilder
**Implements:** `AssetDeliveryProfile` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBlock(List arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getOrCreateBlock(int arg0)` → `AssetDeliveryProfileBlockBuilder` [Getter]
- `setLoadType(LoadTypeEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `setBankHolidaysTreatment(BankHolidayTreatmentEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getBlock()` → `List` [Getter]

### BasketReferenceInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BasketReferenceInformation` [Builder]
- `getMthToDefault()` → `Integer` [Getter]
- `getNthToDefault()` → `Integer` [Getter]
- `getReferencePool()` → `ReferencePool` [Getter]
- `getBasketName()` → `FieldWithMetaString` [Getter]
- `getBasketId()` → `List` [Getter]
- `getTranche()` → `Tranche` [Getter]

### BasketReferenceInformationBuilder
**Implements:** `BasketReferenceInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateTranche()` → `TrancheBuilder` [Getter]
- `getOrCreateBasketName()` → `FieldWithMetaStringBuilder` [Getter]
- `setNthToDefault(Integer arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setBasketNameValue(String arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setBasketIdValue(List arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setReferencePool(ReferencePool arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setBasketId(List arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setMthToDefault(Integer arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `getOrCreateBasketId(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateReferencePool()` → `ReferencePoolBuilder` [Getter]

### BondReference
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BondReference` [Builder]
- `getDiscrepancyClause()` → `Boolean` [Getter]
- `getConditionPrecedentBond()` → `Boolean` [Getter]
- `getCouponRate()` → `FixedRateSpecification` [Getter]
- `getBond()` → `Security` [Getter]

### BondReferenceBuilder
**Implements:** `BondReference` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `getOrCreateBond()` → `SecurityBuilder` [Getter]
- `setConditionPrecedentBond(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `getOrCreateCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `setDiscrepancyClause(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `setCouponRate(FixedRateSpecification arg0)` → `BondReferenceBuilder` [Setter]
- `getBond()` → `SecurityBuilder` [Getter]
- `setBond(Security arg0)` → `BondReferenceBuilder` [Setter]

### BoundedCorrelation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BoundedCorrelation` [Builder]
- `getMinimumBoundaryPercent()` → `BigDecimal` [Getter]
- `getMaximumBoundaryPercent()` → `BigDecimal` [Getter]

### BoundedCorrelationBuilder
**Implements:** `BoundedCorrelation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMinimumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]
- `setMaximumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]

### BoundedVariance
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BoundedVariance` [Builder]
- `getLowerBarrier()` → `BigDecimal` [Getter]
- `getDaysInRangeAdjustment()` → `Boolean` [Getter]
- `getUpperBarrier()` → `BigDecimal` [Getter]
- `getRealisedVarianceMethod()` → `RealisedVarianceMethodEnum` [Getter]

### BoundedVarianceBuilder
**Implements:** `BoundedVariance` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setDaysInRangeAdjustment(Boolean arg0)` → `BoundedVarianceBuilder` [Setter]
- `setRealisedVarianceMethod(RealisedVarianceMethodEnum arg0)` → `BoundedVarianceBuilder` [Setter]
- `setUpperBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]
- `setLowerBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]

### CalculationScheduleDeliveryPeriods
**Implements:** `AssetDeliveryPeriods` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationScheduleDeliveryPeriods` [Builder]
- `getDeliveryCapacity()` → `Quantity` [Getter]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]

### CalculationScheduleDeliveryPeriodsBuilder
**Implements:** `CalculationScheduleDeliveryPeriods` `AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder` 

**Key Methods:**
- `setStartDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setEndDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setProfile(List arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setPriceTimeIntervalQuantity(Price arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getOrCreatePriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]

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
- `getPricingDates()` → `PricingDates` [Getter]
- `getUnderlier()` → `Underlier` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getFxFeature()` → `FxFeature` [Getter]
- `getCommodityPriceReturnTerms()` → `CommodityPriceReturnTerms` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]

### CommodityPayoutBuilder
**Implements:** `CommodityPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getPricingDates()` → `PricingDatesBuilder` [Getter]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `CommodityPayoutBuilder` [Setter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `CommodityPayoutBuilder` [Setter]
- `getDelivery()` → `AssetDeliveryInformationBuilder` [Getter]
- `setSchedule(CalculationSchedule arg0)` → `CommodityPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `CommodityPayoutBuilder` [Setter]
- `getOrCreateSchedule()` → `CalculationScheduleBuilder` [Getter]

### CorrelationReturnTerms
**Implements:** `ReturnTermsBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CorrelationReturnTerms` [Builder]
- `getCorrelationStrikePrice()` → `Price` [Getter]
- `getBoundedCorrelation()` → `NumberRange` [Getter]
- `getNumberOfDataSeries()` → `Integer` [Getter]

### CorrelationReturnTermsBuilder
**Implements:** `CorrelationReturnTerms` `ReturnTermsBase$ReturnTermsBaseBuilder` 

**Key Methods:**
- `setSharePriceDividendAdjustment(Boolean arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `getCorrelationStrikePrice()` → `PriceBuilder` [Getter]
- `getBoundedCorrelation()` → `NumberRangeBuilder` [Getter]
- `setNumberOfDataSeries(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setDividendApplicability(DividendApplicability arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setExpectedN(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]

### CreditDefaultPayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditDefaultPayout` [Builder]
- `getTransactedPrice()` → `TransactedPrice` [Getter]
- `getGeneralTerms()` → `GeneralTerms` [Getter]
- `getProtectionTerms()` → `List` [Getter]

### CreditDefaultPayoutBuilder
**Implements:** `CreditDefaultPayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getTransactedPrice()` → `TransactedPriceBuilder` [Getter]
- `getGeneralTerms()` → `GeneralTermsBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setProtectionTerms(List arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setTransactedPrice(TransactedPrice arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getOrCreateGeneralTerms()` → `GeneralTermsBuilder` [Getter]
- `getOrCreateProtectionTerms(int arg0)` → `ProtectionTermsBuilder` [Getter]
- `getOrCreateTransactedPrice()` → `TransactedPriceBuilder` [Getter]
- `setGeneralTerms(GeneralTerms arg0)` → `CreditDefaultPayoutBuilder` [Setter]

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
- `getOrCreateCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DividendCurrencyBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `DividendCurrencyBuilder` [Setter]
- `setCurrencyReference(ReferenceWithMetaString arg0)` → `DividendCurrencyBuilder` [Setter]
- `getCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]
- `setCurrencyReferenceValue(String arg0)` → `DividendCurrencyBuilder` [Setter]

### DividendDateReference
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendDateReference` [Builder]
- `getPaymentDateOffset()` → `Offset` [Getter]
- `getDateReference()` → `DividendDateReferenceEnum` [Getter]

### DividendDateReferenceBuilder
**Implements:** `DividendDateReference` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePaymentDateOffset()` → `OffsetBuilder` [Getter]
- `getPaymentDateOffset()` → `OffsetBuilder` [Getter]
- `setDateReference(DividendDateReferenceEnum arg0)` → `DividendDateReferenceBuilder` [Setter]
- `setPaymentDateOffset(Offset arg0)` → `DividendDateReferenceBuilder` [Setter]

### DividendPaymentDate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendPaymentDate` [Builder]
- `getDividendDateReference()` → `DividendDateReference` [Getter]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDate` [Getter]

### DividendPaymentDateBuilder
**Implements:** `DividendPaymentDate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]
- `getOrCreateDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]
- `getDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]
- `setDividendDate(ReferenceWithMetaAdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `setDividendDateReference(DividendDateReference arg0)` → `DividendPaymentDateBuilder` [Setter]
- `setDividendDateValue(AdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]

### DividendPayoutRatio
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendPayoutRatio` [Builder]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]
- `getCashRatio()` → `BigDecimal` [Getter]
- `getTotalRatio()` → `BigDecimal` [Getter]
- `getNonCashRatio()` → `BigDecimal` [Getter]

### DividendPayoutRatioBuilder
**Implements:** `DividendPayoutRatio` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]
- `setBasketConstituentValue(BasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setNonCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setTotalRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `getOrCreateBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]

### DividendPeriod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendPeriod` [Builder]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]
- `getStartDate()` → `DividendPaymentDate` [Getter]
- `getEndDate()` → `DividendPaymentDate` [Getter]
- `getDividendPaymentDate()` → `DividendPaymentDate` [Getter]
- `getDividendValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]

### DividendPeriodBuilder
**Implements:** `DividendPeriod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]
- `setBasketConstituentValue(BasketConstituent arg0)` → `DividendPeriodBuilder` [Setter]
- `setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)` → `DividendPeriodBuilder` [Setter]
- `getStartDate()` → `DividendPaymentDateBuilder` [Getter]
- `setStartDate(DividendPaymentDate arg0)` → `DividendPeriodBuilder` [Setter]
- `setEndDate(DividendPaymentDate arg0)` → `DividendPeriodBuilder` [Setter]
- `getEndDate()` → `DividendPaymentDateBuilder` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `DividendPeriodBuilder` [Setter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]
- `getOrCreateDividendValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]

### DividendReturnTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendReturnTerms` [Builder]
- `getPerformance()` → `String` [Getter]
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendReinvestment()` → `Boolean` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getFirstOrSecondPeriod()` → `DividendPeriodEnum` [Getter]
- `getExcessDividendAmount()` → `DividendAmountTypeEnum` [Getter]
- `getDividendComposition()` → `DividendCompositionEnum` [Getter]
- `getDividendPeriod()` → `List` [Getter]

### DividendReturnTermsBuilder
**Implements:** `DividendReturnTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setNonCashDividendTreatment(NonCashDividendTreatmentEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setExtraordinaryDividendsParty(AncillaryRoleEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `getOrCreateDividendCurrency()` → `DividendCurrencyBuilder` [Getter]
- `getOrCreateDividendPayoutRatio(int arg0)` → `DividendPayoutRatioBuilder` [Getter]
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendPeriod()` → `List` [Getter]
- `getDividendCurrency()` → `DividendCurrencyBuilder` [Getter]
- `setDividendPayoutRatio(List arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setDividendComposition(DividendCompositionEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setSpecialDividends(Boolean arg0)` → `DividendReturnTermsBuilder` [Setter]

### EquityUnderlierProvisions
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EquityUnderlierProvisions` [Builder]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaString` [Getter]
- `getRelevantJurisdiction()` → `FieldWithMetaString` [Getter]

### EquityUnderlierProvisionsBuilder
**Implements:** `EquityUnderlierProvisions` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMultipleExchangeIndexAnnexFallback(Boolean arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setComponentSecurityIndexAnnexFallback(Boolean arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `getOrCreateLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `setRelevantJurisdictionValue(String arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `getOrCreateRelevantJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `getRelevantJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `setRelevantJurisdiction(FieldWithMetaString arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setLocalJurisdictionValue(String arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setLocalJurisdiction(FieldWithMetaString arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]

### FixedAmountCalculationDetails
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FixedAmountCalculationDetails` [Builder]
- `getYearFraction()` → `BigDecimal` [Getter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]

### FixedAmountCalculationDetailsBuilder
**Implements:** `FixedAmountCalculationDetails` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setFixedRate(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setCalculatedAmount(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getOrCreateCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]
- `getCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]
- `getOrCreateCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `setCalculationPeriodNotionalAmount(Money arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]

### FixedRateSpecification
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FixedRateSpecification` [Builder]
- `getRateSchedule()` → `RateSchedule` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FixedRateSpecificationBuilder
**Implements:** `FixedRateSpecification` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getRateSchedule()` → `RateScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setRateSchedule(RateSchedule arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getOrCreateRateSchedule()` → `RateScheduleBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### FloatingAmountEvents
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingAmountEvents` [Builder]
- `getAdditionalFixedPayments()` → `AdditionalFixedPayments` [Getter]
- `getInterestShortfall()` → `InterestShortFall` [Getter]
- `getFloatingAmountProvisions()` → `FloatingAmountProvisions` [Getter]
- `getWritedown()` → `Boolean` [Getter]
- `getFailureToPayPrincipal()` → `Boolean` [Getter]
- `getImpliedWritedown()` → `Boolean` [Getter]

### FloatingAmountEventsBuilder
**Implements:** `FloatingAmountEvents` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setFailureToPayPrincipal(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setImpliedWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setInterestShortfall(InterestShortFall arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setAdditionalFixedPayments(AdditionalFixedPayments arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `getAdditionalFixedPayments()` → `AdditionalFixedPaymentsBuilder` [Getter]
- `getOrCreateInterestShortfall()` → `InterestShortFallBuilder` [Getter]
- `getOrCreateFloatingAmountProvisions()` → `FloatingAmountProvisionsBuilder` [Getter]
- `getOrCreateAdditionalFixedPayments()` → `AdditionalFixedPaymentsBuilder` [Getter]
- `setFloatingAmountProvisions(FloatingAmountProvisions arg0)` → `FloatingAmountEventsBuilder` [Setter]

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
- `setWacCapInterestProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]
- `setStepUpProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]

### FloatingRate
**Implements:** `FloatingRateBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRate` [Builder]
- `getFallbackRate()` → `FallbackRateParameters` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `getFloatingRateMultiplierSchedule()` → `RateSchedule` [Getter]

### FloatingRateBase
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateBase` [Builder]
- `getFloorRateSchedule()` → `StrikeSchedule` [Getter]
- `getSpreadSchedule()` → `SpreadSchedule` [Getter]
- `getCapRateSchedule()` → `StrikeSchedule` [Getter]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndex` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FloatingRateBaseBuilder
**Implements:** `FloatingRateBase` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getFloorRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `getSpreadSchedule()` → `SpreadScheduleBuilder` [Getter]
- `getCapRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndexBuilder` [Getter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `getOrCreateSpreadSchedule()` → `SpreadScheduleBuilder` [Getter]
- `getOrCreateCapRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]

### FloatingRateBuilder
**Implements:** `FloatingRate` `FloatingRateBase$FloatingRateBaseBuilder` 

**Key Methods:**
- `getFallbackRate()` → `FallbackRateParametersBuilder` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateBuilder` [Setter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateBuilder` [Setter]
- `setRateOption(ReferenceWithMetaInterestRateIndex arg0)` → `FloatingRateBuilder` [Setter]
- `setCalculationParameters(FloatingRateCalculationParameters arg0)` → `FloatingRateBuilder` [Setter]

### FloatingRateDefinition
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateDefinition` [Builder]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getRateObservation()` → `List` [Getter]
- `getFloatingRateMultiplier()` → `BigDecimal` [Getter]
- `getFloorRate()` → `List` [Getter]
- `getSpread()` → `BigDecimal` [Getter]
- `getCapRate()` → `List` [Getter]

### FloatingRateDefinitionBuilder
**Implements:** `FloatingRateDefinition` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getRateObservation()` → `List` [Getter]
- `getFloorRate()` → `List` [Getter]
- `setFloorRate(List arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getOrCreateFloorRate(int arg0)` → `StrikeBuilder` [Getter]
- `setRateObservation(List arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `setCalculatedRate(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getOrCreateRateObservation(int arg0)` → `RateObservationBuilder` [Getter]
- `setFloatingRateMultiplier(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getOrCreateCapRate(int arg0)` → `StrikeBuilder` [Getter]
- `getCapRate()` → `List` [Getter]

### FloatingRateSpecification
**Implements:** `FloatingRate` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateSpecification` [Builder]
- `getFinalRateRounding()` → `Rounding` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `getNegativeInterestRateTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]
- `getAveragingMethod()` → `AveragingWeightingMethodEnum` [Getter]

### FloatingRateSpecificationBuilder
**Implements:** `FloatingRateSpecification` `FloatingRate$FloatingRateBuilder` 

**Key Methods:**
- `getFinalRateRounding()` → `RoundingBuilder` [Getter]
- `getInitialRate()` → `PriceBuilder` [Getter]
- `setAveragingMethod(AveragingWeightingMethodEnum arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setInitialRate(Price arg0)` → `FloatingRateSpecificationBuilder` [Setter]

### ForeignExchange
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ForeignExchange` [Builder]
- `getExchangedCurrency2()` → `Cashflow` [Getter]
- `getExchangedCurrency1()` → `Cashflow` [Getter]
- `getTenorPeriod()` → `Period` [Getter]

### ForeignExchangeBuilder
**Implements:** `ForeignExchange` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateExchangedCurrency2()` → `CashflowBuilder` [Getter]
- `getOrCreateExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `getExchangedCurrency2()` → `CashflowBuilder` [Getter]
- `getExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `getTenorPeriod()` → `PeriodBuilder` [Getter]
- `setTenorPeriod(Period arg0)` → `ForeignExchangeBuilder` [Setter]
- `setExchangedCurrency2(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]
- `getOrCreateTenorPeriod()` → `PeriodBuilder` [Getter]
- `setExchangedCurrency1(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]

### FutureValueAmount
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FutureValueAmount` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getValueDate()` → `Date` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `getCalculationPeriodNumberOfDays()` → `Integer` [Getter]

### FutureValueAmountBuilder
**Implements:** `FutureValueAmount` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `FutureValueAmountBuilder` [Setter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `setQuantityValue(NonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `FutureValueAmountBuilder` [Setter]
- `setCalculationPeriodNumberOfDays(Integer arg0)` → `FutureValueAmountBuilder` [Setter]
- `setValueDate(Date arg0)` → `FutureValueAmountBuilder` [Setter]

### GeneralTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `GeneralTerms` [Builder]
- `getAdditionalTerm()` → `List` [Getter]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `getSubstitution()` → `Boolean` [Getter]
- `getModifiedEquityDelivery()` → `Boolean` [Getter]
- `getBasketReferenceInformation()` → `BasketReferenceInformation` [Getter]
- `getIndexReferenceInformation()` → `CreditIndex` [Getter]

### GeneralTermsBuilder
**Implements:** `GeneralTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAdditionalTerm()` → `List` [Getter]
- `setReferenceInformation(ReferenceInformation arg0)` → `GeneralTermsBuilder` [Setter]
- `getReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `getOrCreateAdditionalTerm(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setAdditionalTermValue(List arg0)` → `GeneralTermsBuilder` [Setter]
- `setModifiedEquityDelivery(Boolean arg0)` → `GeneralTermsBuilder` [Setter]
- `setAdditionalTerm(List arg0)` → `GeneralTermsBuilder` [Setter]
- `setSubstitution(Boolean arg0)` → `GeneralTermsBuilder` [Setter]
- `getOrCreateBasketReferenceInformation()` → `BasketReferenceInformationBuilder` [Getter]
- `getOrCreateIndexReferenceInformation()` → `CreditIndexBuilder` [Getter]

### InflationRateSpecification
**Implements:** `FloatingRateSpecification` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InflationRateSpecification` [Builder]
- `getCalculationMethod()` → `InflationCalculationMethodEnum` [Getter]
- `getFallbackBondApplicable()` → `Boolean` [Getter]
- `getMainPublication()` → `FieldWithMetaString` [Getter]
- `getInterpolationMethod()` → `FieldWithMetaInterpolationMethodEnum` [Getter]
- `getIndexSource()` → `FieldWithMetaString` [Getter]
- `getCalculationStyle()` → `InflationCalculationStyleEnum` [Getter]
- `getInitialIndexLevel()` → `BigDecimal` [Getter]
- `getInflationLag()` → `Offset` [Getter]

### InflationRateSpecificationBuilder
**Implements:** `InflationRateSpecification` `FloatingRateSpecification$FloatingRateSpecificationBuilder` 

**Key Methods:**
- `setAveragingMethod(AveragingWeightingMethodEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setCalculationMethod(InflationCalculationMethodEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getOrCreateMainPublication()` → `FieldWithMetaStringBuilder` [Getter]
- `setIndexSourceValue(String arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setMainPublication(FieldWithMetaString arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setMainPublicationValue(String arg0)` → `InflationRateSpecificationBuilder` [Setter]

### InterestRatePayout
**Implements:** `PayoutBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InterestRatePayout` [Builder]
- `getFloatingAmount()` → `String` [Getter]
- `getPaymentDelay()` → `Boolean` [Getter]
- `getResetDates()` → `ResetDates` [Getter]
- `getDiscountingMethod()` → `DiscountingMethod` [Getter]
- `getCompoundingMethod()` → `CompoundingMethodEnum` [Getter]
- `getCashflowRepresentation()` → `CashflowRepresentation` [Getter]
- `getStubPeriod()` → `StubPeriod` [Getter]
- `getBondReference()` → `BondReference` [Getter]

### InterestRatePayoutBuilder
**Implements:** `InterestRatePayout` `PayoutBase$PayoutBaseBuilder` 

**Key Methods:**
- `getResetDates()` → `ResetDatesBuilder` [Getter]
- `getDiscountingMethod()` → `DiscountingMethodBuilder` [Getter]
- `getCashflowRepresentation()` → `CashflowRepresentationBuilder` [Getter]
- `getStubPeriod()` → `StubPeriodBuilder` [Getter]
- `getBondReference()` → `BondReferenceBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `InterestRatePayoutBuilder` [Setter]
- `getRateSpecification()` → `RateSpecificationBuilder` [Getter]
- `setPayerReceiver(PayerReceiver arg0)` → `InterestRatePayoutBuilder` [Setter]
- `getPaymentDate()` → `AdjustableDateBuilder` [Getter]
- `setPaymentDate(AdjustableDate arg0)` → `InterestRatePayoutBuilder` [Setter]

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
- `setRateSource(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setInterestShortfallCap(InterestShortfallCapEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getOrCreateRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setCompounding(Boolean arg0)` → `InterestShortFallBuilder` [Setter]
- `setRateSourceValue(FloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]

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
- `setPerformance(String arg0)` → `PriceReturnTermsBuilder` [Setter]
- `setConversionFactor(BigDecimal arg0)` → `PriceReturnTermsBuilder` [Setter]

### ProtectionTerms
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ProtectionTerms` [Builder]
- `getFloatingAmountEvents()` → `FloatingAmountEvents` [Getter]
- `getCreditEvents()` → `CreditEvents` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getObligations()` → `Obligations` [Getter]

### ProtectionTermsBuilder
**Implements:** `ProtectionTerms` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getFloatingAmountEvents()` → `FloatingAmountEventsBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateCreditEvents()` → `CreditEventsBuilder` [Getter]
- `getOrCreateObligations()` → `ObligationsBuilder` [Getter]
- `setCreditEvents(CreditEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `setFloatingAmountEvents(FloatingAmountEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `setObligations(Obligations arg0)` → `ProtectionTermsBuilder` [Setter]
- `getOrCreateFloatingAmountEvents()` → `FloatingAmountEventsBuilder` [Getter]
- `getCreditEvents()` → `CreditEventsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `ProtectionTermsBuilder` [Setter]

### RateSpecification
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `RateSpecification` [Builder]
- `getFixedRateSpecification()` → `FixedRateSpecification` [Getter]
- `getInflationRateSpecification()` → `InflationRateSpecification` [Getter]
- `getFloatingRateSpecification()` → `FloatingRateSpecification` [Getter]

### RateSpecificationBuilder
**Implements:** `RateSpecification` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]
- `setFixedRateSpecification(FixedRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `getOrCreateInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `getOrCreateFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]
- `getOrCreateFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]
- `setInflationRateSpecification(InflationRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `setFloatingRateSpecification(FloatingRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]

### ReferenceInformation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceInformation` [Builder]
- `getAllGuarantees()` → `Boolean` [Getter]
- `getReferenceObligation()` → `List` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getReferencePrice()` → `Price` [Getter]
- `getReferenceEntity()` → `LegalEntity` [Getter]
- `getReferencePolicy()` → `Boolean` [Getter]
- `getSecuredList()` → `Boolean` [Getter]
- `getUnknownReferenceObligation()` → `Boolean` [Getter]

### ReferenceInformationBuilder
**Implements:** `ReferenceInformation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `getOrCreateReferencePrice()` → `PriceBuilder` [Getter]
- `setReferencePrice(Price arg0)` → `ReferenceInformationBuilder` [Setter]
- `setReferenceObligation(List arg0)` → `ReferenceInformationBuilder` [Setter]
- `setReferenceEntity(LegalEntity arg0)` → `ReferenceInformationBuilder` [Setter]
- `setReferencePolicy(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `setAllGuarantees(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `setSecuredList(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `setNoReferenceObligation(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `getReferenceObligation()` → `List` [Getter]

### ReferenceObligation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceObligation` [Builder]
- `getPrimaryObligor()` → `LegalEntity` [Getter]
- `getGuarantor()` → `LegalEntity` [Getter]
- `getGuarantorReference()` → `String` [Getter]
- `getPrimaryObligorReference()` → `ReferenceWithMetaLegalEntity` [Getter]
- `getLoan()` → `Loan` [Getter]
- `getSecurity()` → `Security` [Getter]
- `getStandardReferenceObligation()` → `Boolean` [Getter]

### ReferenceObligationBuilder
**Implements:** `ReferenceObligation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateGuarantor()` → `LegalEntityBuilder` [Getter]
- `getPrimaryObligor()` → `LegalEntityBuilder` [Getter]
- `setGuarantorReference(String arg0)` → `ReferenceObligationBuilder` [Setter]
- `getGuarantor()` → `LegalEntityBuilder` [Getter]
- `setSecurity(Security arg0)` → `ReferenceObligationBuilder` [Setter]
- `setGuarantor(LegalEntity arg0)` → `ReferenceObligationBuilder` [Setter]
- `setPrimaryObligorReference(ReferenceWithMetaLegalEntity arg0)` → `ReferenceObligationBuilder` [Setter]
- `getOrCreatePrimaryObligor()` → `LegalEntityBuilder` [Getter]
- `setPrimaryObligor(LegalEntity arg0)` → `ReferenceObligationBuilder` [Setter]
- `getPrimaryObligorReference()` → `ReferenceWithMetaLegalEntityBuilder` [Getter]

### ReferencePair
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferencePair` [Builder]
- `getEntityType()` → `FieldWithMetaEntityTypeEnum` [Getter]
- `getReferenceObligation()` → `ReferenceObligation` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getReferenceEntity()` → `LegalEntity` [Getter]

### ReferencePairBuilder
**Implements:** `ReferencePair` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `setReferenceObligation(ReferenceObligation arg0)` → `ReferencePairBuilder` [Setter]
- `setReferenceEntity(LegalEntity arg0)` → `ReferencePairBuilder` [Setter]
- `setNoReferenceObligation(Boolean arg0)` → `ReferencePairBuilder` [Setter]
- `setEntityType(FieldWithMetaEntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `getEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `getOrCreateEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `setEntityTypeValue(EntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `getReferenceObligation()` → `ReferenceObligationBuilder` [Getter]
- `getReferenceEntity()` → `LegalEntityBuilder` [Getter]

### ReferencePool
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferencePool` [Builder]
- `getReferencePoolItem()` → `List` [Getter]

### ReferencePoolBuilder
**Implements:** `ReferencePool` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setReferencePoolItem(List arg0)` → `ReferencePoolBuilder` [Setter]
- `getReferencePoolItem()` → `List` [Getter]
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
- `setReferencePair(ReferencePair arg0)` → `ReferencePoolItemBuilder` [Setter]
- `getConstituentWeight()` → `ConstituentWeightBuilder` [Getter]
- `getReferencePair()` → `ReferencePairBuilder` [Getter]
- `setConstituentWeight(ConstituentWeight arg0)` → `ReferencePoolItemBuilder` [Setter]
- `getOrCreateReferencePair()` → `ReferencePairBuilder` [Getter]
- `getOrCreateCashSettlementTermsReference()` → `ReferenceWithMetaCashSettlementTermsBuilder` [Getter]
- `getProtectionTermsReference()` → `ReferenceWithMetaProtectionTermsBuilder` [Getter]
- `setProtectionTermsReference(ReferenceWithMetaProtectionTerms arg0)` → `ReferencePoolItemBuilder` [Setter]
- `setProtectionTermsReferenceValue(ProtectionTerms arg0)` → `ReferencePoolItemBuilder` [Setter]
- `getOrCreateProtectionTermsReference()` → `ReferenceWithMetaProtectionTermsBuilder` [Getter]

### ReturnTermsBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReturnTermsBase` [Builder]
- `getPerformance()` → `String` [Getter]
- `getValuationTerms()` → `ValuationTerms` [Getter]
- `getDividendApplicability()` → `DividendApplicability` [Getter]
- `getExpectedN()` → `Integer` [Getter]
- `getAnnualizationFactor()` → `Integer` [Getter]
- `getMeanAdjustment()` → `Boolean` [Getter]
- `getInitialLevel()` → `BigDecimal` [Getter]
- `getInitialLevelSource()` → `DeterminationMethodEnum` [Getter]

### ReturnTermsBaseBuilder
**Implements:** `ReturnTermsBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSharePriceDividendAdjustment(Boolean arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `getOrCreateDividendApplicability()` → `DividendApplicabilityBuilder` [Getter]
- `getOrCreateEquityUnderlierProvisions()` → `EquityUnderlierProvisionsBuilder` [Getter]
- `getValuationTerms()` → `ValuationTermsBuilder` [Getter]
- `getDividendApplicability()` → `DividendApplicabilityBuilder` [Getter]
- `setValuationTerms(ValuationTerms arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setDividendApplicability(DividendApplicability arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setMeanAdjustment(Boolean arg0)` → `ReturnTermsBaseBuilder` [Setter]

### SettledEntityMatrix
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettledEntityMatrix` [Builder]
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnum` [Getter]
- `getPublicationDate()` → `Date` [Getter]

### SettledEntityMatrixBuilder
**Implements:** `SettledEntityMatrix` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]
- `setMatrixSource(FieldWithMetaSettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `getOrCreateMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]
- `setMatrixSourceValue(SettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `setPublicationDate(Date arg0)` → `SettledEntityMatrixBuilder` [Setter]

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
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleTypeValue(SpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleType(FieldWithMetaSpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `getSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]
- `getOrCreateSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]

### StubFloatingRate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubFloatingRate` [Builder]
- `getFloorRateSchedule()` → `List` [Getter]
- `getSpreadSchedule()` → `List` [Getter]
- `getCapRateSchedule()` → `List` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `getFloatingRateMultiplierSchedule()` → `Schedule` [Getter]

### StubFloatingRateBuilder
**Implements:** `StubFloatingRate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFloorRateSchedule()` → `List` [Getter]
- `getSpreadSchedule()` → `List` [Getter]
- `getCapRateSchedule()` → `List` [Getter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `StubFloatingRateBuilder` [Setter]
- `setSpreadSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `getOrCreateSpreadSchedule(int arg0)` → `SpreadScheduleBuilder` [Getter]
- `getOrCreateCapRateSchedule(int arg0)` → `StrikeScheduleBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `StubFloatingRateBuilder` [Setter]

### StubValue
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `StubValue` [Builder]
- `getFloatingRate()` → `List` [Getter]
- `getStubRate()` → `BigDecimal` [Getter]
- `getStubAmount()` → `Money` [Getter]

### StubValueBuilder
**Implements:** `StubValue` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFloatingRate()` → `List` [Getter]
- `getOrCreateFloatingRate(int arg0)` → `StubFloatingRateBuilder` [Getter]
- `setFloatingRate(List arg0)` → `StubValueBuilder` [Setter]
- `setStubRate(BigDecimal arg0)` → `StubValueBuilder` [Setter]
- `getOrCreateStubAmount()` → `MoneyBuilder` [Getter]
- `setStubAmount(Money arg0)` → `StubValueBuilder` [Setter]
- `getStubAmount()` → `MoneyBuilder` [Getter]

### Tranche
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Tranche` [Builder]
- `getIncurredRecoveryApplicable()` → `Boolean` [Getter]
- `getAttachmentPoint()` → `BigDecimal` [Getter]
- `getExhaustionPoint()` → `BigDecimal` [Getter]

### TrancheBuilder
**Implements:** `Tranche` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setIncurredRecoveryApplicable(Boolean arg0)` → `TrancheBuilder` [Setter]
- `setExhaustionPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]
- `setAttachmentPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]

### ValuationTerms
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationTerms` [Builder]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getFPVFinalPriceElectionFallback()` → `FPVFinalPriceElectionFallbackEnum` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getFuturesPriceValuation()` → `Boolean` [Getter]
- `getOptionsPriceValuation()` → `Boolean` [Getter]
- `getNumberOfValuationDates()` → `Integer` [Getter]

### ValuationTermsBuilder
**Implements:** `ValuationTerms` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMultipleExchangeIndexAnnexFallback(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setComponentSecurityIndexAnnexFallback(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setFPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum arg0)` → `ValuationTermsBuilder` [Setter]
- `getOrCreateDividendValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setNumberOfValuationDates(Integer arg0)` → `ValuationTermsBuilder` [Setter]
- `setDividendValuationDates(AdjustableRelativeOrPeriodicDates arg0)` → `ValuationTermsBuilder` [Setter]
- `setFuturesPriceValuation(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setOptionsPriceValuation(Boolean arg0)` → `ValuationTermsBuilder` [Setter]

### VarianceCapFloor
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `VarianceCapFloor` [Builder]
- `getVarianceCap()` → `Boolean` [Getter]
- `getBoundedVariance()` → `BoundedVariance` [Getter]
- `getUnadjustedVarianceCap()` → `BigDecimal` [Getter]

### VarianceCapFloorBuilder
**Implements:** `VarianceCapFloor` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setVarianceCap(Boolean arg0)` → `VarianceCapFloorBuilder` [Setter]
- `setUnadjustedVarianceCap(BigDecimal arg0)` → `VarianceCapFloorBuilder` [Setter]
- `getOrCreateBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `getBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `setBoundedVariance(BoundedVariance arg0)` → `VarianceCapFloorBuilder` [Setter]

### VarianceReturnTerms
**Implements:** `ReturnTermsBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `VarianceReturnTerms` [Builder]
- `getVarianceCapFloor()` → `VarianceCapFloor` [Getter]
- `getVolatilityCapFloor()` → `VolatilityCapFloor` [Getter]
- `getVarianceStrikePrice()` → `Price` [Getter]
- `getVegaNotionalAmount()` → `NonNegativeQuantitySchedule` [Getter]
- `getVolatilityStrikePrice()` → `Price` [Getter]
- `getExchangeTradedContractNearest()` → `ReferenceWithMetaObservable` [Getter]

### VarianceReturnTermsBuilder
**Implements:** `VarianceReturnTerms` `ReturnTermsBase$ReturnTermsBaseBuilder` 

**Key Methods:**
- `getOrCreateVarianceStrikePrice()` → `PriceBuilder` [Getter]
- `getOrCreateVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `getOrCreateVarianceCapFloor()` → `VarianceCapFloorBuilder` [Getter]
- `getOrCreateVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `setSharePriceDividendAdjustment(Boolean arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setExchangeTradedContractNearest(ReferenceWithMetaObservable arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setExchangeTradedContractNearestValue(Observable arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `getOrCreateExchangeTradedContractNearest()` → `ReferenceWithMetaObservableBuilder` [Getter]
- `getOrCreateVegaNotionalAmount()` → `NonNegativeQuantityScheduleBuilder` [Getter]

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
- `setApplicable(Boolean arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `setTotalVolatilityCap(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `setVolatilityCapFactor(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]

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
- `getOrCreateVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `getOrCreateVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `setSharePriceDividendAdjustment(Boolean arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setExchangeTradedContractNearest(ListedDerivative arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `getOrCreateExchangeTradedContractNearest()` → `ListedDerivativeBuilder` [Getter]
- `getVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `getVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `setValuationTerms(ValuationTerms arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `VolatilityReturnTermsBuilder` [Setter]

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
- `getWritedownReimbursement()` → `Boolean` [Getter]
- `setInterestShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `setPrincipalShortfallReimbursement(Boolean arg0)` → `AdditionalFixedPaymentsBuilder` [Setter]
- `getInterestShortfallReimbursement()` → `Boolean` [Getter]
- `getPrincipalShortfallReimbursement()` → `Boolean` [Getter]

### AdditionalFixedPaymentsImpl
**Implements:** `AdditionalFixedPayments` 

**Key Methods:**
- `build()` → `AdditionalFixedPayments` [Builder]
- `getWritedownReimbursement()` → `Boolean` [Getter]
- `setBuilderFields(AdditionalFixedPaymentsBuilder arg0)` → `void` [Setter]
- `getInterestShortfallReimbursement()` → `Boolean` [Getter]
- `getPrincipalShortfallReimbursement()` → `Boolean` [Getter]

### AssetDeliveryInformationBuilderImpl
**Implements:** `AssetDeliveryInformation$AssetDeliveryInformationBuilder` 

**Fields:**
- `AssetDeliveryPeriodsBuilder periods`
- `List (List) location`
- `QuantityBuilder deliveryCapacity`

**Key Methods:**
- `getLocation()` → `List` [Getter]
- `build()` → `AssetDeliveryInformation` [Builder]
- `getPeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `setPeriods(AssetDeliveryPeriods arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setLocation(List arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getOrCreatePeriods()` → `AssetDeliveryPeriodsBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryInformationBuilder` [Setter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `getOrCreateLocation(int arg0)` → `LocationIdentifierBuilder` [Getter]

### AssetDeliveryInformationImpl
**Implements:** `AssetDeliveryInformation` 

**Key Methods:**
- `getLocation()` → `List` [Getter]
- `build()` → `AssetDeliveryInformation` [Builder]
- `getPeriods()` → `AssetDeliveryPeriods` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]
- `setBuilderFields(AssetDeliveryInformationBuilder arg0)` → `void` [Setter]

### AssetDeliveryPeriodsBuilderImpl
**Implements:** `AssetDeliveryPeriods$AssetDeliveryPeriodsBuilder` 

**Fields:**
- `List (List) profile`
- `Date startDate`
- `Date endDate`

**Key Methods:**
- `build()` → `AssetDeliveryPeriods` [Builder]
- `getStartDate()` → `Date` [Getter]
- `setStartDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `setEndDate(Date arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `getEndDate()` → `Date` [Getter]
- `setProfile(List arg0)` → `AssetDeliveryPeriodsBuilder` [Setter]
- `getOrCreateProfile(int arg0)` → `AssetDeliveryProfileBuilder` [Getter]
- `getProfile()` → `List` [Getter]

### AssetDeliveryPeriodsImpl
**Implements:** `AssetDeliveryPeriods` 

**Key Methods:**
- `build()` → `AssetDeliveryPeriods` [Builder]
- `getStartDate()` → `Date` [Getter]
- `getEndDate()` → `Date` [Getter]
- `setBuilderFields(AssetDeliveryPeriodsBuilder arg0)` → `void` [Setter]
- `getProfile()` → `List` [Getter]

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
- `getEndTime()` → `LocalTime` [Getter]
- `setEndTime(LocalTime arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `AssetDeliveryProfileBlockBuilder` [Setter]
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]

### AssetDeliveryProfileBlockImpl
**Implements:** `AssetDeliveryProfileBlock` 

**Key Methods:**
- `build()` → `AssetDeliveryProfileBlock` [Builder]
- `getDayOfWeek()` → `List` [Getter]
- `getStartTime()` → `LocalTime` [Getter]
- `getEndTime()` → `LocalTime` [Getter]
- `getDeliveryCapacity()` → `Quantity` [Getter]
- `setBuilderFields(AssetDeliveryProfileBlockBuilder arg0)` → `void` [Setter]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]

### AssetDeliveryProfileBuilderImpl
**Implements:** `AssetDeliveryProfile$AssetDeliveryProfileBuilder` 

**Fields:**
- `LoadTypeEnum loadType`
- `List (List) block`
- `BankHolidayTreatmentEnum bankHolidaysTreatment`

**Key Methods:**
- `build()` → `AssetDeliveryProfile` [Builder]
- `setBlock(List arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getOrCreateBlock(int arg0)` → `AssetDeliveryProfileBlockBuilder` [Getter]
- `setLoadType(LoadTypeEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `setBankHolidaysTreatment(BankHolidayTreatmentEnum arg0)` → `AssetDeliveryProfileBuilder` [Setter]
- `getBankHolidaysTreatment()` → `BankHolidayTreatmentEnum` [Getter]
- `getLoadType()` → `LoadTypeEnum` [Getter]
- `getBlock()` → `List` [Getter]

### AssetDeliveryProfileImpl
**Implements:** `AssetDeliveryProfile` 

**Key Methods:**
- `build()` → `AssetDeliveryProfile` [Builder]
- `setBuilderFields(AssetDeliveryProfileBuilder arg0)` → `void` [Setter]
- `getBankHolidaysTreatment()` → `BankHolidayTreatmentEnum` [Getter]
- `getLoadType()` → `LoadTypeEnum` [Getter]
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
- `getOrCreateTranche()` → `TrancheBuilder` [Getter]
- `getOrCreateBasketName()` → `FieldWithMetaStringBuilder` [Getter]
- `setNthToDefault(Integer arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setBasketNameValue(String arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `getMthToDefault()` → `Integer` [Getter]
- `setBasketIdValue(List arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setReferencePool(ReferencePool arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setBasketId(List arg0)` → `BasketReferenceInformationBuilder` [Setter]
- `setMthToDefault(Integer arg0)` → `BasketReferenceInformationBuilder` [Setter]

### BasketReferenceInformationImpl
**Implements:** `BasketReferenceInformation` 

**Key Methods:**
- `build()` → `BasketReferenceInformation` [Builder]
- `getMthToDefault()` → `Integer` [Getter]
- `getNthToDefault()` → `Integer` [Getter]
- `getReferencePool()` → `ReferencePool` [Getter]
- `setBuilderFields(BasketReferenceInformationBuilder arg0)` → `void` [Setter]
- `getBasketName()` → `FieldWithMetaString` [Getter]
- `getBasketId()` → `List` [Getter]
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
- `getDiscrepancyClause()` → `Boolean` [Getter]
- `getConditionPrecedentBond()` → `Boolean` [Getter]
- `getCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `getOrCreateBond()` → `SecurityBuilder` [Getter]
- `setConditionPrecedentBond(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `getOrCreateCouponRate()` → `FixedRateSpecificationBuilder` [Getter]
- `setDiscrepancyClause(Boolean arg0)` → `BondReferenceBuilder` [Setter]
- `setCouponRate(FixedRateSpecification arg0)` → `BondReferenceBuilder` [Setter]
- `getBond()` → `SecurityBuilder` [Getter]

### BondReferenceImpl
**Implements:** `BondReference` 

**Key Methods:**
- `build()` → `BondReference` [Builder]
- `setBuilderFields(BondReferenceBuilder arg0)` → `void` [Setter]
- `getDiscrepancyClause()` → `Boolean` [Getter]
- `getConditionPrecedentBond()` → `Boolean` [Getter]
- `getCouponRate()` → `FixedRateSpecification` [Getter]
- `getBond()` → `Security` [Getter]

### BoundedCorrelationBuilderImpl
**Implements:** `BoundedCorrelation$BoundedCorrelationBuilder` 

**Fields:**
- `BigDecimal minimumBoundaryPercent`
- `BigDecimal maximumBoundaryPercent`

**Key Methods:**
- `build()` → `BoundedCorrelation` [Builder]
- `getMinimumBoundaryPercent()` → `BigDecimal` [Getter]
- `getMaximumBoundaryPercent()` → `BigDecimal` [Getter]
- `setMinimumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]
- `setMaximumBoundaryPercent(BigDecimal arg0)` → `BoundedCorrelationBuilder` [Setter]

### BoundedCorrelationImpl
**Implements:** `BoundedCorrelation` 

**Key Methods:**
- `build()` → `BoundedCorrelation` [Builder]
- `setBuilderFields(BoundedCorrelationBuilder arg0)` → `void` [Setter]
- `getMinimumBoundaryPercent()` → `BigDecimal` [Getter]
- `getMaximumBoundaryPercent()` → `BigDecimal` [Getter]

### BoundedVarianceBuilderImpl
**Implements:** `BoundedVariance$BoundedVarianceBuilder` 

**Fields:**
- `RealisedVarianceMethodEnum realisedVarianceMethod`
- `Boolean daysInRangeAdjustment`
- `BigDecimal upperBarrier`
- `BigDecimal lowerBarrier`

**Key Methods:**
- `build()` → `BoundedVariance` [Builder]
- `getLowerBarrier()` → `BigDecimal` [Getter]
- `getDaysInRangeAdjustment()` → `Boolean` [Getter]
- `setDaysInRangeAdjustment(Boolean arg0)` → `BoundedVarianceBuilder` [Setter]
- `setRealisedVarianceMethod(RealisedVarianceMethodEnum arg0)` → `BoundedVarianceBuilder` [Setter]
- `setUpperBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]
- `setLowerBarrier(BigDecimal arg0)` → `BoundedVarianceBuilder` [Setter]
- `getUpperBarrier()` → `BigDecimal` [Getter]
- `getRealisedVarianceMethod()` → `RealisedVarianceMethodEnum` [Getter]

### BoundedVarianceImpl
**Implements:** `BoundedVariance` 

**Key Methods:**
- `build()` → `BoundedVariance` [Builder]
- `setBuilderFields(BoundedVarianceBuilder arg0)` → `void` [Setter]
- `getLowerBarrier()` → `BigDecimal` [Getter]
- `getDaysInRangeAdjustment()` → `Boolean` [Getter]
- `getUpperBarrier()` → `BigDecimal` [Getter]
- `getRealisedVarianceMethod()` → `RealisedVarianceMethodEnum` [Getter]

### CalculationScheduleDeliveryPeriodsBuilderImpl
**Extends:** `AssetDeliveryPeriods$AssetDeliveryPeriodsBuilderImpl` 
**Implements:** `CalculationScheduleDeliveryPeriods$CalculationScheduleDeliveryPeriodsBuilder` 

**Fields:**
- `QuantityBuilder deliveryCapacity`
- `PriceBuilder priceTimeIntervalQuantity`

**Key Methods:**
- `build()` → `CalculationScheduleDeliveryPeriods` [Builder]
- `setStartDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setEndDate(Date arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `setProfile(List arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setDeliveryCapacity(Quantity arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getPriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]
- `getOrCreateDeliveryCapacity()` → `QuantityBuilder` [Getter]
- `setPriceTimeIntervalQuantity(Price arg0)` → `CalculationScheduleDeliveryPeriodsBuilder` [Setter]
- `getOrCreatePriceTimeIntervalQuantity()` → `PriceBuilder` [Getter]

### CalculationScheduleDeliveryPeriodsImpl
**Extends:** `AssetDeliveryPeriods$AssetDeliveryPeriodsImpl` 
**Implements:** `CalculationScheduleDeliveryPeriods` 

**Key Methods:**
- `build()` → `CalculationScheduleDeliveryPeriods` [Builder]
- `getDeliveryCapacity()` → `Quantity` [Getter]
- `setBuilderFields(CalculationScheduleDeliveryPeriodsBuilder arg0)` → `void` [Setter]
- `getPriceTimeIntervalQuantity()` → `Price` [Getter]

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
- `getPricingDates()` → `PricingDatesBuilder` [Getter]
- `getOrCreateUnderlier()` → `UnderlierBuilder` [Getter]
- `getUnderlier()` → `UnderlierBuilder` [Getter]
- `setUnderlier(Underlier arg0)` → `CommodityPayoutBuilder` [Setter]
- `getSchedule()` → `CalculationScheduleBuilder` [Getter]
- `setDelivery(AssetDeliveryInformation arg0)` → `CommodityPayoutBuilder` [Setter]
- `getDelivery()` → `AssetDeliveryInformationBuilder` [Getter]
- `setSchedule(CalculationSchedule arg0)` → `CommodityPayoutBuilder` [Setter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `CommodityPayoutBuilder` [Setter]

### CommodityPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `CommodityPayout` 

**Key Methods:**
- `build()` → `CommodityPayout` [Builder]
- `getPricingDates()` → `PricingDates` [Getter]
- `getUnderlier()` → `Underlier` [Getter]
- `getSchedule()` → `CalculationSchedule` [Getter]
- `getDelivery()` → `AssetDeliveryInformation` [Getter]
- `getAveragingFeature()` → `AveragingCalculation` [Getter]
- `getFxFeature()` → `FxFeature` [Getter]
- `setBuilderFields(CommodityPayoutBuilder arg0)` → `void` [Setter]
- `getCommodityPriceReturnTerms()` → `CommodityPriceReturnTerms` [Getter]
- `getPaymentDates()` → `PaymentDates` [Getter]

### CorrelationReturnTermsBuilderImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseBuilderImpl` 
**Implements:** `CorrelationReturnTerms$CorrelationReturnTermsBuilder` 

**Fields:**
- `PriceBuilder correlationStrikePrice`
- `NumberRangeBuilder boundedCorrelation`
- `Integer numberOfDataSeries`

**Key Methods:**
- `build()` → `CorrelationReturnTerms` [Builder]
- `setSharePriceDividendAdjustment(Boolean arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `getCorrelationStrikePrice()` → `PriceBuilder` [Getter]
- `getBoundedCorrelation()` → `NumberRangeBuilder` [Getter]
- `getNumberOfDataSeries()` → `Integer` [Getter]
- `setNumberOfDataSeries(Integer arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setValuationTerms(ValuationTerms arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setInitialLevel(BigDecimal arg0)` → `CorrelationReturnTermsBuilder` [Setter]
- `setDividendApplicability(DividendApplicability arg0)` → `CorrelationReturnTermsBuilder` [Setter]

### CorrelationReturnTermsImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseImpl` 
**Implements:** `CorrelationReturnTerms` 

**Key Methods:**
- `build()` → `CorrelationReturnTerms` [Builder]
- `setBuilderFields(CorrelationReturnTermsBuilder arg0)` → `void` [Setter]
- `getCorrelationStrikePrice()` → `Price` [Getter]
- `getBoundedCorrelation()` → `NumberRange` [Getter]
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
- `getTransactedPrice()` → `TransactedPriceBuilder` [Getter]
- `getGeneralTerms()` → `GeneralTermsBuilder` [Getter]
- `setPrincipalPayment(PrincipalPayments arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setPayerReceiver(PayerReceiver arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setProtectionTerms(List arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `setTransactedPrice(TransactedPrice arg0)` → `CreditDefaultPayoutBuilder` [Setter]
- `getOrCreateGeneralTerms()` → `GeneralTermsBuilder` [Getter]
- `getOrCreateProtectionTerms(int arg0)` → `ProtectionTermsBuilder` [Getter]
- `getOrCreateTransactedPrice()` → `TransactedPriceBuilder` [Getter]

### CreditDefaultPayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `CreditDefaultPayout` 

**Key Methods:**
- `build()` → `CreditDefaultPayout` [Builder]
- `getTransactedPrice()` → `TransactedPrice` [Getter]
- `getGeneralTerms()` → `GeneralTerms` [Getter]
- `setBuilderFields(CreditDefaultPayoutBuilder arg0)` → `void` [Setter]
- `getProtectionTerms()` → `List` [Getter]

### DiscountingMethodBuilderImpl
**Implements:** `DiscountingMethod$DiscountingMethodBuilder` 

**Fields:**
- `DiscountingTypeEnum discountingType`
- `BigDecimal discountRate`
- `FieldWithMetaDayCountFractionEnumBuilder discountRateDayCountFraction`

**Key Methods:**
- `build()` → `DiscountingMethod` [Builder]
- `getDiscountingType()` → `DiscountingTypeEnum` [Getter]
- `getDiscountRate()` → `BigDecimal` [Getter]
- `setDiscountingType(DiscountingTypeEnum arg0)` → `DiscountingMethodBuilder` [Setter]
- `setDiscountRate(BigDecimal arg0)` → `DiscountingMethodBuilder` [Setter]
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
- `getOrCreateCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `DividendCurrencyBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `DividendCurrencyBuilder` [Setter]
- `setCurrencyReference(ReferenceWithMetaString arg0)` → `DividendCurrencyBuilder` [Setter]
- `getCurrencyReference()` → `ReferenceWithMetaStringBuilder` [Getter]

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
- `getOrCreatePaymentDateOffset()` → `OffsetBuilder` [Getter]
- `getPaymentDateOffset()` → `OffsetBuilder` [Getter]
- `setDateReference(DividendDateReferenceEnum arg0)` → `DividendDateReferenceBuilder` [Setter]
- `setPaymentDateOffset(Offset arg0)` → `DividendDateReferenceBuilder` [Setter]
- `getDateReference()` → `DividendDateReferenceEnum` [Getter]

### DividendDateReferenceImpl
**Implements:** `DividendDateReference` 

**Key Methods:**
- `build()` → `DividendDateReference` [Builder]
- `setBuilderFields(DividendDateReferenceBuilder arg0)` → `void` [Setter]
- `getPaymentDateOffset()` → `Offset` [Getter]
- `getDateReference()` → `DividendDateReferenceEnum` [Getter]

### DividendPaymentDateBuilderImpl
**Implements:** `DividendPaymentDate$DividendPaymentDateBuilder` 

**Fields:**
- `DividendDateReferenceBuilder dividendDateReference`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder dividendDate`

**Key Methods:**
- `build()` → `DividendPaymentDate` [Builder]
- `getOrCreateDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]
- `getOrCreateDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]
- `getDividendDateReference()` → `DividendDateReferenceBuilder` [Getter]
- `setDividendDate(ReferenceWithMetaAdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `setDividendDateReference(DividendDateReference arg0)` → `DividendPaymentDateBuilder` [Setter]
- `setDividendDateValue(AdjustableOrRelativeDate arg0)` → `DividendPaymentDateBuilder` [Setter]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDateBuilder` [Getter]

### DividendPaymentDateImpl
**Implements:** `DividendPaymentDate` 

**Key Methods:**
- `build()` → `DividendPaymentDate` [Builder]
- `setBuilderFields(DividendPaymentDateBuilder arg0)` → `void` [Setter]
- `getDividendDateReference()` → `DividendDateReference` [Getter]
- `getDividendDate()` → `ReferenceWithMetaAdjustableOrRelativeDate` [Getter]

### DividendPayoutRatioBuilderImpl
**Implements:** `DividendPayoutRatio$DividendPayoutRatioBuilder` 

**Fields:**
- `BigDecimal totalRatio`
- `BigDecimal cashRatio`
- `BigDecimal nonCashRatio`
- `ReferenceWithMetaBasketConstituentBuilder basketConstituent`

**Key Methods:**
- `build()` → `DividendPayoutRatio` [Builder]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]
- `setBasketConstituentValue(BasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `getCashRatio()` → `BigDecimal` [Getter]
- `setCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `setNonCashRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]
- `getTotalRatio()` → `BigDecimal` [Getter]
- `getNonCashRatio()` → `BigDecimal` [Getter]
- `setTotalRatio(BigDecimal arg0)` → `DividendPayoutRatioBuilder` [Setter]

### DividendPayoutRatioImpl
**Implements:** `DividendPayoutRatio` 

**Key Methods:**
- `build()` → `DividendPayoutRatio` [Builder]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]
- `setBuilderFields(DividendPayoutRatioBuilder arg0)` → `void` [Setter]
- `getCashRatio()` → `BigDecimal` [Getter]
- `getTotalRatio()` → `BigDecimal` [Getter]
- `getNonCashRatio()` → `BigDecimal` [Getter]

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
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituentBuilder` [Getter]
- `setBasketConstituentValue(BasketConstituent arg0)` → `DividendPeriodBuilder` [Setter]
- `setBasketConstituent(ReferenceWithMetaBasketConstituent arg0)` → `DividendPeriodBuilder` [Setter]
- `getStartDate()` → `DividendPaymentDateBuilder` [Getter]
- `setStartDate(DividendPaymentDate arg0)` → `DividendPeriodBuilder` [Setter]
- `setEndDate(DividendPaymentDate arg0)` → `DividendPeriodBuilder` [Setter]
- `getEndDate()` → `DividendPaymentDateBuilder` [Getter]
- `setDateAdjustments(BusinessDayAdjustments arg0)` → `DividendPeriodBuilder` [Setter]
- `getOrCreateDateAdjustments()` → `BusinessDayAdjustmentsBuilder` [Getter]

### DividendPeriodImpl
**Implements:** `DividendPeriod` 

**Key Methods:**
- `build()` → `DividendPeriod` [Builder]
- `getBasketConstituent()` → `ReferenceWithMetaBasketConstituent` [Getter]
- `getStartDate()` → `DividendPaymentDate` [Getter]
- `getEndDate()` → `DividendPaymentDate` [Getter]
- `setBuilderFields(DividendPeriodBuilder arg0)` → `void` [Setter]
- `getDividendPaymentDate()` → `DividendPaymentDate` [Getter]
- `getDividendValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDateAdjustments()` → `BusinessDayAdjustments` [Getter]

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
- `setNonCashDividendTreatment(NonCashDividendTreatmentEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `setExtraordinaryDividendsParty(AncillaryRoleEnum arg0)` → `DividendReturnTermsBuilder` [Setter]
- `getOrCreateDividendCurrency()` → `DividendCurrencyBuilder` [Getter]
- `getPerformance()` → `String` [Getter]
- `getOrCreateDividendPayoutRatio(int arg0)` → `DividendPayoutRatioBuilder` [Getter]
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendReinvestment()` → `Boolean` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getFirstOrSecondPeriod()` → `DividendPeriodEnum` [Getter]

### DividendReturnTermsImpl
**Implements:** `DividendReturnTerms` 

**Key Methods:**
- `build()` → `DividendReturnTerms` [Builder]
- `getPerformance()` → `String` [Getter]
- `setBuilderFields(DividendReturnTermsBuilder arg0)` → `void` [Setter]
- `getDividendPayoutRatio()` → `List` [Getter]
- `getDividendReinvestment()` → `Boolean` [Getter]
- `getDividendEntitlement()` → `DividendEntitlementEnum` [Getter]
- `getFirstOrSecondPeriod()` → `DividendPeriodEnum` [Getter]
- `getExcessDividendAmount()` → `DividendAmountTypeEnum` [Getter]
- `getDividendComposition()` → `DividendCompositionEnum` [Getter]
- `getDividendPeriod()` → `List` [Getter]

### EquityUnderlierProvisionsBuilderImpl
**Implements:** `EquityUnderlierProvisions$EquityUnderlierProvisionsBuilder` 

**Fields:**
- `Boolean multipleExchangeIndexAnnexFallback`
- `Boolean componentSecurityIndexAnnexFallback`
- `FieldWithMetaStringBuilder localJurisdiction`
- `FieldWithMetaStringBuilder relevantJurisdiction`

**Key Methods:**
- `build()` → `EquityUnderlierProvisions` [Builder]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `setMultipleExchangeIndexAnnexFallback(Boolean arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `setComponentSecurityIndexAnnexFallback(Boolean arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `getOrCreateLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `setRelevantJurisdictionValue(String arg0)` → `EquityUnderlierProvisionsBuilder` [Setter]
- `getOrCreateRelevantJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]
- `getRelevantJurisdiction()` → `FieldWithMetaStringBuilder` [Getter]

### EquityUnderlierProvisionsImpl
**Implements:** `EquityUnderlierProvisions` 

**Key Methods:**
- `build()` → `EquityUnderlierProvisions` [Builder]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `setBuilderFields(EquityUnderlierProvisionsBuilder arg0)` → `void` [Setter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `getLocalJurisdiction()` → `FieldWithMetaString` [Getter]
- `getRelevantJurisdiction()` → `FieldWithMetaString` [Getter]

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
- `setFixedRate(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `setCalculationPeriod(CalculationPeriodBase arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setYearFraction(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `setCalculatedAmount(BigDecimal arg0)` → `FixedAmountCalculationDetailsBuilder` [Setter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBaseBuilder` [Getter]
- `getOrCreateCalculationPeriodNotionalAmount()` → `MoneyBuilder` [Getter]

### FixedAmountCalculationDetailsImpl
**Implements:** `FixedAmountCalculationDetails` 

**Key Methods:**
- `build()` → `FixedAmountCalculationDetails` [Builder]
- `getYearFraction()` → `BigDecimal` [Getter]
- `getFixedRate()` → `BigDecimal` [Getter]
- `getCalculatedAmount()` → `BigDecimal` [Getter]
- `getCalculationPeriod()` → `CalculationPeriodBase` [Getter]
- `setBuilderFields(FixedAmountCalculationDetailsBuilder arg0)` → `void` [Setter]
- `getCalculationPeriodNotionalAmount()` → `Money` [Getter]

### FixedRateSpecificationBuilderImpl
**Implements:** `FixedRateSpecification$FixedRateSpecificationBuilder` 

**Fields:**
- `RateScheduleBuilder rateSchedule`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `FixedRateSpecification` [Builder]
- `getRateSchedule()` → `RateScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setRateSchedule(RateSchedule arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getOrCreateRateSchedule()` → `RateScheduleBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FixedRateSpecificationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### FixedRateSpecificationImpl
**Implements:** `FixedRateSpecification` 

**Key Methods:**
- `build()` → `FixedRateSpecification` [Builder]
- `getRateSchedule()` → `RateSchedule` [Getter]
- `setBuilderFields(FixedRateSpecificationBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

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
- `setFailureToPayPrincipal(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setImpliedWritedown(Boolean arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setInterestShortfall(InterestShortFall arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `setAdditionalFixedPayments(AdditionalFixedPayments arg0)` → `FloatingAmountEventsBuilder` [Setter]
- `getAdditionalFixedPayments()` → `AdditionalFixedPaymentsBuilder` [Getter]
- `getOrCreateInterestShortfall()` → `InterestShortFallBuilder` [Getter]
- `getOrCreateFloatingAmountProvisions()` → `FloatingAmountProvisionsBuilder` [Getter]
- `getOrCreateAdditionalFixedPayments()` → `AdditionalFixedPaymentsBuilder` [Getter]

### FloatingAmountEventsImpl
**Implements:** `FloatingAmountEvents` 

**Key Methods:**
- `build()` → `FloatingAmountEvents` [Builder]
- `getAdditionalFixedPayments()` → `AdditionalFixedPayments` [Getter]
- `setBuilderFields(FloatingAmountEventsBuilder arg0)` → `void` [Setter]
- `getInterestShortfall()` → `InterestShortFall` [Getter]
- `getFloatingAmountProvisions()` → `FloatingAmountProvisions` [Getter]
- `getWritedown()` → `Boolean` [Getter]
- `getFailureToPayPrincipal()` → `Boolean` [Getter]
- `getImpliedWritedown()` → `Boolean` [Getter]

### FloatingAmountProvisionsBuilderImpl
**Implements:** `FloatingAmountProvisions$FloatingAmountProvisionsBuilder` 

**Fields:**
- `Boolean wacCapInterestProvision`
- `Boolean stepUpProvision`

**Key Methods:**
- `build()` → `FloatingAmountProvisions` [Builder]
- `getWacCapInterestProvision()` → `Boolean` [Getter]
- `setWacCapInterestProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]
- `setStepUpProvision(Boolean arg0)` → `FloatingAmountProvisionsBuilder` [Setter]
- `getStepUpProvision()` → `Boolean` [Getter]

### FloatingAmountProvisionsImpl
**Implements:** `FloatingAmountProvisions` 

**Key Methods:**
- `build()` → `FloatingAmountProvisions` [Builder]
- `getWacCapInterestProvision()` → `Boolean` [Getter]
- `getStepUpProvision()` → `Boolean` [Getter]
- `setBuilderFields(FloatingAmountProvisionsBuilder arg0)` → `void` [Setter]

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
- `getFloorRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `getSpreadSchedule()` → `SpreadScheduleBuilder` [Getter]
- `getCapRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndexBuilder` [Getter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]
- `getOrCreateSpreadSchedule()` → `SpreadScheduleBuilder` [Getter]
- `getOrCreateCapRateSchedule()` → `StrikeScheduleBuilder` [Getter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBaseBuilder` [Setter]

### FloatingRateBaseImpl
**Implements:** `FloatingRateBase` 

**Key Methods:**
- `build()` → `FloatingRateBase` [Builder]
- `getFloorRateSchedule()` → `StrikeSchedule` [Getter]
- `getSpreadSchedule()` → `SpreadSchedule` [Getter]
- `getCapRateSchedule()` → `StrikeSchedule` [Getter]
- `setBuilderFields(FloatingRateBaseBuilder arg0)` → `void` [Setter]
- `getRateOption()` → `ReferenceWithMetaInterestRateIndex` [Getter]
- `getMeta()` → `MetaFields` [Getter]

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
- `getFallbackRate()` → `FallbackRateParametersBuilder` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParametersBuilder` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateBuilder` [Setter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateBuilder` [Setter]

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
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getRateObservation()` → `List` [Getter]
- `getFloatingRateMultiplier()` → `BigDecimal` [Getter]
- `getFloorRate()` → `List` [Getter]
- `setFloorRate(List arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getOrCreateFloorRate(int arg0)` → `StrikeBuilder` [Getter]
- `setRateObservation(List arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `setCalculatedRate(BigDecimal arg0)` → `FloatingRateDefinitionBuilder` [Setter]
- `getOrCreateRateObservation(int arg0)` → `RateObservationBuilder` [Getter]

### FloatingRateDefinitionImpl
**Implements:** `FloatingRateDefinition` 

**Key Methods:**
- `build()` → `FloatingRateDefinition` [Builder]
- `setBuilderFields(FloatingRateDefinitionBuilder arg0)` → `void` [Setter]
- `getCalculatedRate()` → `BigDecimal` [Getter]
- `getRateObservation()` → `List` [Getter]
- `getFloatingRateMultiplier()` → `BigDecimal` [Getter]
- `getFloorRate()` → `List` [Getter]
- `getSpread()` → `BigDecimal` [Getter]
- `getCapRate()` → `List` [Getter]

### FloatingRateImpl
**Extends:** `FloatingRateBase$FloatingRateBaseImpl` 
**Implements:** `FloatingRate` 

**Key Methods:**
- `build()` → `FloatingRate` [Builder]
- `getFallbackRate()` → `FallbackRateParameters` [Getter]
- `getCalculationParameters()` → `FloatingRateCalculationParameters` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `setBuilderFields(FloatingRateBuilder arg0)` → `void` [Setter]
- `getFloatingRateMultiplierSchedule()` → `RateSchedule` [Getter]

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
- `getFinalRateRounding()` → `RoundingBuilder` [Getter]
- `getInitialRate()` → `PriceBuilder` [Getter]
- `setAveragingMethod(AveragingWeightingMethodEnum arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setFallbackRate(FallbackRateParameters arg0)` → `FloatingRateSpecificationBuilder` [Setter]
- `setRateOptionValue(InterestRateIndex arg0)` → `FloatingRateSpecificationBuilder` [Setter]

### FloatingRateSpecificationImpl
**Extends:** `FloatingRate$FloatingRateImpl` 
**Implements:** `FloatingRateSpecification` 

**Key Methods:**
- `build()` → `FloatingRateSpecification` [Builder]
- `getFinalRateRounding()` → `Rounding` [Getter]
- `getInitialRate()` → `Price` [Getter]
- `setBuilderFields(FloatingRateSpecificationBuilder arg0)` → `void` [Setter]
- `getNegativeInterestRateTreatment()` → `NegativeInterestRateTreatmentEnum` [Getter]
- `getAveragingMethod()` → `AveragingWeightingMethodEnum` [Getter]

### ForeignExchangeBuilderImpl
**Implements:** `ForeignExchange$ForeignExchangeBuilder` 

**Fields:**
- `CashflowBuilder exchangedCurrency1`
- `CashflowBuilder exchangedCurrency2`
- `PeriodBuilder tenorPeriod`

**Key Methods:**
- `build()` → `ForeignExchange` [Builder]
- `getOrCreateExchangedCurrency2()` → `CashflowBuilder` [Getter]
- `getOrCreateExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `getExchangedCurrency2()` → `CashflowBuilder` [Getter]
- `getExchangedCurrency1()` → `CashflowBuilder` [Getter]
- `getTenorPeriod()` → `PeriodBuilder` [Getter]
- `setTenorPeriod(Period arg0)` → `ForeignExchangeBuilder` [Setter]
- `setExchangedCurrency2(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]
- `getOrCreateTenorPeriod()` → `PeriodBuilder` [Getter]
- `setExchangedCurrency1(Cashflow arg0)` → `ForeignExchangeBuilder` [Setter]

### ForeignExchangeImpl
**Implements:** `ForeignExchange` 

**Key Methods:**
- `build()` → `ForeignExchange` [Builder]
- `setBuilderFields(ForeignExchangeBuilder arg0)` → `void` [Setter]
- `getExchangedCurrency2()` → `Cashflow` [Getter]
- `getExchangedCurrency1()` → `Cashflow` [Getter]
- `getTenorPeriod()` → `Period` [Getter]

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
- `getValueDate()` → `Date` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateQuantity()` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `setQuantityValue(NonNegativeQuantitySchedule arg0)` → `FutureValueAmountBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `FutureValueAmountBuilder` [Setter]

### FutureValueAmountImpl
**Implements:** `FutureValueAmount` 

**Key Methods:**
- `build()` → `FutureValueAmount` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getValueDate()` → `Date` [Getter]
- `getQuantity()` → `ReferenceWithMetaNonNegativeQuantitySchedule` [Getter]
- `setBuilderFields(FutureValueAmountBuilder arg0)` → `void` [Setter]
- `getCalculationPeriodNumberOfDays()` → `Integer` [Getter]

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
- `getAdditionalTerm()` → `List` [Getter]
- `setReferenceInformation(ReferenceInformation arg0)` → `GeneralTermsBuilder` [Setter]
- `getReferenceInformation()` → `ReferenceInformationBuilder` [Getter]
- `getOrCreateAdditionalTerm(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setAdditionalTermValue(List arg0)` → `GeneralTermsBuilder` [Setter]
- `setModifiedEquityDelivery(Boolean arg0)` → `GeneralTermsBuilder` [Setter]
- `setAdditionalTerm(List arg0)` → `GeneralTermsBuilder` [Setter]
- `setSubstitution(Boolean arg0)` → `GeneralTermsBuilder` [Setter]
- `getOrCreateBasketReferenceInformation()` → `BasketReferenceInformationBuilder` [Getter]

### GeneralTermsImpl
**Implements:** `GeneralTerms` 

**Key Methods:**
- `build()` → `GeneralTerms` [Builder]
- `getAdditionalTerm()` → `List` [Getter]
- `getReferenceInformation()` → `ReferenceInformation` [Getter]
- `setBuilderFields(GeneralTermsBuilder arg0)` → `void` [Setter]
- `getSubstitution()` → `Boolean` [Getter]
- `getModifiedEquityDelivery()` → `Boolean` [Getter]
- `getBasketReferenceInformation()` → `BasketReferenceInformation` [Getter]
- `getIndexReferenceInformation()` → `CreditIndex` [Getter]

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
- `setAveragingMethod(AveragingWeightingMethodEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getCalculationMethod()` → `InflationCalculationMethodEnum` [Getter]
- `setCalculationMethod(InflationCalculationMethodEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setSpreadSchedule(SpreadSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setRateTreatment(RateTreatmentEnum arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setFloorRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `setCapRateSchedule(StrikeSchedule arg0)` → `InflationRateSpecificationBuilder` [Setter]
- `getOrCreateMainPublication()` → `FieldWithMetaStringBuilder` [Getter]
- `getFallbackBondApplicable()` → `Boolean` [Getter]

### InflationRateSpecificationImpl
**Extends:** `FloatingRateSpecification$FloatingRateSpecificationImpl` 
**Implements:** `InflationRateSpecification` 

**Key Methods:**
- `build()` → `InflationRateSpecification` [Builder]
- `getCalculationMethod()` → `InflationCalculationMethodEnum` [Getter]
- `setBuilderFields(InflationRateSpecificationBuilder arg0)` → `void` [Setter]
- `getFallbackBondApplicable()` → `Boolean` [Getter]
- `getMainPublication()` → `FieldWithMetaString` [Getter]
- `getInterpolationMethod()` → `FieldWithMetaInterpolationMethodEnum` [Getter]
- `getIndexSource()` → `FieldWithMetaString` [Getter]
- `getCalculationStyle()` → `InflationCalculationStyleEnum` [Getter]
- `getInitialIndexLevel()` → `BigDecimal` [Getter]
- `getInflationLag()` → `Offset` [Getter]

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
- `getFloatingAmount()` → `String` [Getter]
- `getPaymentDelay()` → `Boolean` [Getter]
- `getResetDates()` → `ResetDatesBuilder` [Getter]
- `getDiscountingMethod()` → `DiscountingMethodBuilder` [Getter]
- `getCompoundingMethod()` → `CompoundingMethodEnum` [Getter]
- `getCashflowRepresentation()` → `CashflowRepresentationBuilder` [Getter]
- `getStubPeriod()` → `StubPeriodBuilder` [Getter]
- `getBondReference()` → `BondReferenceBuilder` [Getter]
- `getFixedAmount()` → `String` [Getter]

### InterestRatePayoutImpl
**Extends:** `PayoutBase$PayoutBaseImpl` 
**Implements:** `InterestRatePayout` 

**Key Methods:**
- `build()` → `InterestRatePayout` [Builder]
- `getFloatingAmount()` → `String` [Getter]
- `getPaymentDelay()` → `Boolean` [Getter]
- `getResetDates()` → `ResetDates` [Getter]
- `getDiscountingMethod()` → `DiscountingMethod` [Getter]
- `getCompoundingMethod()` → `CompoundingMethodEnum` [Getter]
- `getCashflowRepresentation()` → `CashflowRepresentation` [Getter]
- `getStubPeriod()` → `StubPeriod` [Getter]
- `getBondReference()` → `BondReference` [Getter]
- `getFixedAmount()` → `String` [Getter]

### InterestShortFallBuilderImpl
**Implements:** `InterestShortFall$InterestShortFallBuilder` 

**Fields:**
- `InterestShortfallCapEnum interestShortfallCap`
- `Boolean compounding`
- `FieldWithMetaFloatingRateIndexEnumBuilder rateSource`

**Key Methods:**
- `build()` → `InterestShortFall` [Builder]
- `setRateSource(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setInterestShortfallCap(InterestShortfallCapEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getInterestShortfallCap()` → `InterestShortfallCapEnum` [Getter]
- `getOrCreateRateSource()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setCompounding(Boolean arg0)` → `InterestShortFallBuilder` [Setter]
- `setRateSourceValue(FloatingRateIndexEnum arg0)` → `InterestShortFallBuilder` [Setter]
- `getCompounding()` → `Boolean` [Getter]

### InterestShortFallImpl
**Implements:** `InterestShortFall` 

**Key Methods:**
- `build()` → `InterestShortFall` [Builder]
- `getRateSource()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getInterestShortfallCap()` → `InterestShortfallCapEnum` [Getter]
- `getCompounding()` → `Boolean` [Getter]
- `setBuilderFields(InterestShortFallBuilder arg0)` → `void` [Setter]

### PriceReturnTermsBuilderImpl
**Implements:** `PriceReturnTerms$PriceReturnTermsBuilder` 

**Fields:**
- `ReturnTypeEnum returnType`
- `BigDecimal conversionFactor`
- `String performance`

**Key Methods:**
- `getReturnType()` → `ReturnTypeEnum` [Getter]
- `build()` → `PriceReturnTerms` [Builder]
- `getPerformance()` → `String` [Getter]
- `getConversionFactor()` → `BigDecimal` [Getter]
- `setReturnType(ReturnTypeEnum arg0)` → `PriceReturnTermsBuilder` [Setter]
- `setPerformance(String arg0)` → `PriceReturnTermsBuilder` [Setter]
- `setConversionFactor(BigDecimal arg0)` → `PriceReturnTermsBuilder` [Setter]

### PriceReturnTermsImpl
**Implements:** `PriceReturnTerms` 

**Key Methods:**
- `getReturnType()` → `ReturnTypeEnum` [Getter]
- `build()` → `PriceReturnTerms` [Builder]
- `getPerformance()` → `String` [Getter]
- `getConversionFactor()` → `BigDecimal` [Getter]
- `setBuilderFields(PriceReturnTermsBuilder arg0)` → `void` [Setter]

### ProtectionTermsBuilderImpl
**Implements:** `ProtectionTerms$ProtectionTermsBuilder` 

**Fields:**
- `CreditEventsBuilder creditEvents`
- `ObligationsBuilder obligations`
- `FloatingAmountEventsBuilder floatingAmountEvents`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `ProtectionTerms` [Builder]
- `getFloatingAmountEvents()` → `FloatingAmountEventsBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreateCreditEvents()` → `CreditEventsBuilder` [Getter]
- `getOrCreateObligations()` → `ObligationsBuilder` [Getter]
- `setCreditEvents(CreditEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `setFloatingAmountEvents(FloatingAmountEvents arg0)` → `ProtectionTermsBuilder` [Setter]
- `setObligations(Obligations arg0)` → `ProtectionTermsBuilder` [Setter]
- `getOrCreateFloatingAmountEvents()` → `FloatingAmountEventsBuilder` [Getter]
- `getCreditEvents()` → `CreditEventsBuilder` [Getter]

### ProtectionTermsImpl
**Implements:** `ProtectionTerms` 

**Key Methods:**
- `build()` → `ProtectionTerms` [Builder]
- `getFloatingAmountEvents()` → `FloatingAmountEvents` [Getter]
- `setBuilderFields(ProtectionTermsBuilder arg0)` → `void` [Setter]
- `getCreditEvents()` → `CreditEvents` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getObligations()` → `Obligations` [Getter]

### RateSpecificationBuilderImpl
**Implements:** `RateSpecification$RateSpecificationBuilder` 

**Fields:**
- `FixedRateSpecificationBuilder fixedRateSpecification`
- `FloatingRateSpecificationBuilder floatingRateSpecification`
- `InflationRateSpecificationBuilder inflationRateSpecification`

**Key Methods:**
- `build()` → `RateSpecification` [Builder]
- `getFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]
- `setFixedRateSpecification(FixedRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `getOrCreateInflationRateSpecification()` → `InflationRateSpecificationBuilder` [Getter]
- `getOrCreateFixedRateSpecification()` → `FixedRateSpecificationBuilder` [Getter]
- `getOrCreateFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]
- `setInflationRateSpecification(InflationRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `setFloatingRateSpecification(FloatingRateSpecification arg0)` → `RateSpecificationBuilder` [Setter]
- `getFloatingRateSpecification()` → `FloatingRateSpecificationBuilder` [Getter]

### RateSpecificationImpl
**Implements:** `RateSpecification` 

**Key Methods:**
- `build()` → `RateSpecification` [Builder]
- `getFixedRateSpecification()` → `FixedRateSpecification` [Getter]
- `setBuilderFields(RateSpecificationBuilder arg0)` → `void` [Setter]
- `getInflationRateSpecification()` → `InflationRateSpecification` [Getter]
- `getFloatingRateSpecification()` → `FloatingRateSpecification` [Getter]

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
- `getOrCreateReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `getOrCreateReferencePrice()` → `PriceBuilder` [Getter]
- `setReferencePrice(Price arg0)` → `ReferenceInformationBuilder` [Setter]
- `setReferenceObligation(List arg0)` → `ReferenceInformationBuilder` [Setter]
- `setReferenceEntity(LegalEntity arg0)` → `ReferenceInformationBuilder` [Setter]
- `setReferencePolicy(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `setAllGuarantees(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `setSecuredList(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]
- `setNoReferenceObligation(Boolean arg0)` → `ReferenceInformationBuilder` [Setter]

### ReferenceInformationImpl
**Implements:** `ReferenceInformation` 

**Key Methods:**
- `build()` → `ReferenceInformation` [Builder]
- `getAllGuarantees()` → `Boolean` [Getter]
- `getReferenceObligation()` → `List` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getReferencePrice()` → `Price` [Getter]
- `getReferenceEntity()` → `LegalEntity` [Getter]
- `getReferencePolicy()` → `Boolean` [Getter]
- `getSecuredList()` → `Boolean` [Getter]
- `setBuilderFields(ReferenceInformationBuilder arg0)` → `void` [Setter]
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
- `getOrCreateGuarantor()` → `LegalEntityBuilder` [Getter]
- `getPrimaryObligor()` → `LegalEntityBuilder` [Getter]
- `setGuarantorReference(String arg0)` → `ReferenceObligationBuilder` [Setter]
- `getGuarantor()` → `LegalEntityBuilder` [Getter]
- `getGuarantorReference()` → `String` [Getter]
- `setSecurity(Security arg0)` → `ReferenceObligationBuilder` [Setter]
- `setGuarantor(LegalEntity arg0)` → `ReferenceObligationBuilder` [Setter]
- `setPrimaryObligorReference(ReferenceWithMetaLegalEntity arg0)` → `ReferenceObligationBuilder` [Setter]
- `getOrCreatePrimaryObligor()` → `LegalEntityBuilder` [Getter]

### ReferenceObligationImpl
**Implements:** `ReferenceObligation` 

**Key Methods:**
- `build()` → `ReferenceObligation` [Builder]
- `getPrimaryObligor()` → `LegalEntity` [Getter]
- `getGuarantor()` → `LegalEntity` [Getter]
- `getGuarantorReference()` → `String` [Getter]
- `getPrimaryObligorReference()` → `ReferenceWithMetaLegalEntity` [Getter]
- `getLoan()` → `Loan` [Getter]
- `setBuilderFields(ReferenceObligationBuilder arg0)` → `void` [Setter]
- `getSecurity()` → `Security` [Getter]
- `getStandardReferenceObligation()` → `Boolean` [Getter]

### ReferencePairBuilderImpl
**Implements:** `ReferencePair$ReferencePairBuilder` 

**Fields:**
- `LegalEntityBuilder referenceEntity`
- `ReferenceObligationBuilder referenceObligation`
- `Boolean noReferenceObligation`
- `FieldWithMetaEntityTypeEnumBuilder entityType`

**Key Methods:**
- `build()` → `ReferencePair` [Builder]
- `getOrCreateReferenceEntity()` → `LegalEntityBuilder` [Getter]
- `setReferenceObligation(ReferenceObligation arg0)` → `ReferencePairBuilder` [Setter]
- `setReferenceEntity(LegalEntity arg0)` → `ReferencePairBuilder` [Setter]
- `setNoReferenceObligation(Boolean arg0)` → `ReferencePairBuilder` [Setter]
- `setEntityType(FieldWithMetaEntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `getEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `getOrCreateEntityType()` → `FieldWithMetaEntityTypeEnumBuilder` [Getter]
- `setEntityTypeValue(EntityTypeEnum arg0)` → `ReferencePairBuilder` [Setter]
- `getReferenceObligation()` → `ReferenceObligationBuilder` [Getter]

### ReferencePairImpl
**Implements:** `ReferencePair` 

**Key Methods:**
- `build()` → `ReferencePair` [Builder]
- `getEntityType()` → `FieldWithMetaEntityTypeEnum` [Getter]
- `getReferenceObligation()` → `ReferenceObligation` [Getter]
- `getNoReferenceObligation()` → `Boolean` [Getter]
- `getReferenceEntity()` → `LegalEntity` [Getter]
- `setBuilderFields(ReferencePairBuilder arg0)` → `void` [Setter]

### ReferencePoolBuilderImpl
**Implements:** `ReferencePool$ReferencePoolBuilder` 

**Fields:**
- `List (List) referencePoolItem`

**Key Methods:**
- `build()` → `ReferencePool` [Builder]
- `setReferencePoolItem(List arg0)` → `ReferencePoolBuilder` [Setter]
- `getReferencePoolItem()` → `List` [Getter]
- `getOrCreateReferencePoolItem(int arg0)` → `ReferencePoolItemBuilder` [Getter]

### ReferencePoolImpl
**Implements:** `ReferencePool` 

**Key Methods:**
- `build()` → `ReferencePool` [Builder]
- `getReferencePoolItem()` → `List` [Getter]
- `setBuilderFields(ReferencePoolBuilder arg0)` → `void` [Setter]

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
- `setReferencePair(ReferencePair arg0)` → `ReferencePoolItemBuilder` [Setter]
- `getConstituentWeight()` → `ConstituentWeightBuilder` [Getter]
- `getReferencePair()` → `ReferencePairBuilder` [Getter]
- `setConstituentWeight(ConstituentWeight arg0)` → `ReferencePoolItemBuilder` [Setter]
- `getOrCreateReferencePair()` → `ReferencePairBuilder` [Getter]
- `getOrCreateCashSettlementTermsReference()` → `ReferenceWithMetaCashSettlementTermsBuilder` [Getter]
- `getProtectionTermsReference()` → `ReferenceWithMetaProtectionTermsBuilder` [Getter]
- `setProtectionTermsReference(ReferenceWithMetaProtectionTerms arg0)` → `ReferencePoolItemBuilder` [Setter]
- `setProtectionTermsReferenceValue(ProtectionTerms arg0)` → `ReferencePoolItemBuilder` [Setter]

### ReferencePoolItemImpl
**Implements:** `ReferencePoolItem` 

**Key Methods:**
- `build()` → `ReferencePoolItem` [Builder]
- `getConstituentWeight()` → `ConstituentWeight` [Getter]
- `getReferencePair()` → `ReferencePair` [Getter]
- `setBuilderFields(ReferencePoolItemBuilder arg0)` → `void` [Setter]
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
- `getPerformance()` → `String` [Getter]
- `setSharePriceDividendAdjustment(Boolean arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `ReturnTermsBaseBuilder` [Setter]
- `getOrCreateDividendApplicability()` → `DividendApplicabilityBuilder` [Getter]
- `getOrCreateEquityUnderlierProvisions()` → `EquityUnderlierProvisionsBuilder` [Getter]
- `getValuationTerms()` → `ValuationTermsBuilder` [Getter]
- `getDividendApplicability()` → `DividendApplicabilityBuilder` [Getter]
- `getExpectedN()` → `Integer` [Getter]
- `getAnnualizationFactor()` → `Integer` [Getter]

### ReturnTermsBaseImpl
**Implements:** `ReturnTermsBase` 

**Key Methods:**
- `build()` → `ReturnTermsBase` [Builder]
- `getPerformance()` → `String` [Getter]
- `setBuilderFields(ReturnTermsBaseBuilder arg0)` → `void` [Setter]
- `getValuationTerms()` → `ValuationTerms` [Getter]
- `getDividendApplicability()` → `DividendApplicability` [Getter]
- `getExpectedN()` → `Integer` [Getter]
- `getAnnualizationFactor()` → `Integer` [Getter]
- `getMeanAdjustment()` → `Boolean` [Getter]
- `getInitialLevel()` → `BigDecimal` [Getter]
- `getInitialLevelSource()` → `DeterminationMethodEnum` [Getter]

### SettledEntityMatrixBuilderImpl
**Implements:** `SettledEntityMatrix$SettledEntityMatrixBuilder` 

**Fields:**
- `FieldWithMetaSettledEntityMatrixSourceEnumBuilder matrixSource`
- `Date publicationDate`

**Key Methods:**
- `build()` → `SettledEntityMatrix` [Builder]
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]
- `setMatrixSource(FieldWithMetaSettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `getOrCreateMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` [Getter]
- `setMatrixSourceValue(SettledEntityMatrixSourceEnum arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `setPublicationDate(Date arg0)` → `SettledEntityMatrixBuilder` [Setter]
- `getPublicationDate()` → `Date` [Getter]

### SettledEntityMatrixImpl
**Implements:** `SettledEntityMatrix` 

**Key Methods:**
- `build()` → `SettledEntityMatrix` [Builder]
- `setBuilderFields(SettledEntityMatrixBuilder arg0)` → `void` [Setter]
- `getMatrixSource()` → `FieldWithMetaSettledEntityMatrixSourceEnum` [Getter]
- `getPublicationDate()` → `Date` [Getter]

### SpreadScheduleBuilderImpl
**Extends:** `RateSchedule$RateScheduleBuilderImpl` 
**Implements:** `SpreadSchedule$SpreadScheduleBuilder` 

**Fields:**
- `FieldWithMetaSpreadScheduleTypeEnumBuilder spreadScheduleType`

**Key Methods:**
- `build()` → `SpreadSchedule` [Builder]
- `setPriceValue(PriceSchedule arg0)` → `SpreadScheduleBuilder` [Setter]
- `setPrice(ReferenceWithMetaPriceSchedule arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleTypeValue(SpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `setSpreadScheduleType(FieldWithMetaSpreadScheduleTypeEnum arg0)` → `SpreadScheduleBuilder` [Setter]
- `getSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]
- `getOrCreateSpreadScheduleType()` → `FieldWithMetaSpreadScheduleTypeEnumBuilder` [Getter]

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
- `getFloorRateSchedule()` → `List` [Getter]
- `getSpreadSchedule()` → `List` [Getter]
- `getCapRateSchedule()` → `List` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `StubFloatingRateBuilder` [Setter]
- `setSpreadSchedule(List arg0)` → `StubFloatingRateBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]

### StubFloatingRateImpl
**Implements:** `StubFloatingRate` 

**Key Methods:**
- `build()` → `StubFloatingRate` [Builder]
- `getFloorRateSchedule()` → `List` [Getter]
- `getSpreadSchedule()` → `List` [Getter]
- `getCapRateSchedule()` → `List` [Getter]
- `getRateTreatment()` → `RateTreatmentEnum` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `setBuilderFields(StubFloatingRateBuilder arg0)` → `void` [Setter]
- `getFloatingRateMultiplierSchedule()` → `Schedule` [Getter]

### StubValueBuilderImpl
**Implements:** `StubValue$StubValueBuilder` 

**Fields:**
- `List (List) floatingRate`
- `BigDecimal stubRate`
- `MoneyBuilder stubAmount`

**Key Methods:**
- `build()` → `StubValue` [Builder]
- `getFloatingRate()` → `List` [Getter]
- `getOrCreateFloatingRate(int arg0)` → `StubFloatingRateBuilder` [Getter]
- `setFloatingRate(List arg0)` → `StubValueBuilder` [Setter]
- `setStubRate(BigDecimal arg0)` → `StubValueBuilder` [Setter]
- `getOrCreateStubAmount()` → `MoneyBuilder` [Getter]
- `getStubRate()` → `BigDecimal` [Getter]
- `setStubAmount(Money arg0)` → `StubValueBuilder` [Setter]
- `getStubAmount()` → `MoneyBuilder` [Getter]

### StubValueImpl
**Implements:** `StubValue` 

**Key Methods:**
- `build()` → `StubValue` [Builder]
- `getFloatingRate()` → `List` [Getter]
- `setBuilderFields(StubValueBuilder arg0)` → `void` [Setter]
- `getStubRate()` → `BigDecimal` [Getter]
- `getStubAmount()` → `Money` [Getter]

### TrancheBuilderImpl
**Implements:** `Tranche$TrancheBuilder` 

**Fields:**
- `BigDecimal attachmentPoint`
- `BigDecimal exhaustionPoint`
- `Boolean incurredRecoveryApplicable`

**Key Methods:**
- `build()` → `Tranche` [Builder]
- `getIncurredRecoveryApplicable()` → `Boolean` [Getter]
- `setIncurredRecoveryApplicable(Boolean arg0)` → `TrancheBuilder` [Setter]
- `getAttachmentPoint()` → `BigDecimal` [Getter]
- `getExhaustionPoint()` → `BigDecimal` [Getter]
- `setExhaustionPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]
- `setAttachmentPoint(BigDecimal arg0)` → `TrancheBuilder` [Setter]

### TrancheImpl
**Implements:** `Tranche` 

**Key Methods:**
- `build()` → `Tranche` [Builder]
- `setBuilderFields(TrancheBuilder arg0)` → `void` [Setter]
- `getIncurredRecoveryApplicable()` → `Boolean` [Getter]
- `getAttachmentPoint()` → `BigDecimal` [Getter]
- `getExhaustionPoint()` → `BigDecimal` [Getter]

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
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `setMultipleExchangeIndexAnnexFallback(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `setComponentSecurityIndexAnnexFallback(Boolean arg0)` → `ValuationTermsBuilder` [Setter]
- `getFPVFinalPriceElectionFallback()` → `FPVFinalPriceElectionFallbackEnum` [Getter]
- `setFPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum arg0)` → `ValuationTermsBuilder` [Setter]
- `getOrCreateDividendValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getFuturesPriceValuation()` → `Boolean` [Getter]

### ValuationTermsImpl
**Implements:** `ValuationTerms` 

**Key Methods:**
- `build()` → `ValuationTerms` [Builder]
- `getMultipleExchangeIndexAnnexFallback()` → `Boolean` [Getter]
- `getFPVFinalPriceElectionFallback()` → `FPVFinalPriceElectionFallbackEnum` [Getter]
- `setBuilderFields(ValuationTermsBuilder arg0)` → `void` [Setter]
- `getComponentSecurityIndexAnnexFallback()` → `Boolean` [Getter]
- `getDividendValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getFuturesPriceValuation()` → `Boolean` [Getter]
- `getOptionsPriceValuation()` → `Boolean` [Getter]
- `getNumberOfValuationDates()` → `Integer` [Getter]

### VarianceCapFloorBuilderImpl
**Implements:** `VarianceCapFloor$VarianceCapFloorBuilder` 

**Fields:**
- `Boolean varianceCap`
- `BigDecimal unadjustedVarianceCap`
- `BoundedVarianceBuilder boundedVariance`

**Key Methods:**
- `build()` → `VarianceCapFloor` [Builder]
- `setVarianceCap(Boolean arg0)` → `VarianceCapFloorBuilder` [Setter]
- `getVarianceCap()` → `Boolean` [Getter]
- `setUnadjustedVarianceCap(BigDecimal arg0)` → `VarianceCapFloorBuilder` [Setter]
- `getOrCreateBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `getBoundedVariance()` → `BoundedVarianceBuilder` [Getter]
- `setBoundedVariance(BoundedVariance arg0)` → `VarianceCapFloorBuilder` [Setter]
- `getUnadjustedVarianceCap()` → `BigDecimal` [Getter]

### VarianceCapFloorImpl
**Implements:** `VarianceCapFloor` 

**Key Methods:**
- `build()` → `VarianceCapFloor` [Builder]
- `setBuilderFields(VarianceCapFloorBuilder arg0)` → `void` [Setter]
- `getVarianceCap()` → `Boolean` [Getter]
- `getBoundedVariance()` → `BoundedVariance` [Getter]
- `getUnadjustedVarianceCap()` → `BigDecimal` [Getter]

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
- `getOrCreateVarianceStrikePrice()` → `PriceBuilder` [Getter]
- `getOrCreateVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `getOrCreateVarianceCapFloor()` → `VarianceCapFloorBuilder` [Getter]
- `getOrCreateVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `setSharePriceDividendAdjustment(Boolean arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setExchangeTradedContractNearest(ReferenceWithMetaObservable arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `setExchangeTradedContractNearestValue(Observable arg0)` → `VarianceReturnTermsBuilder` [Setter]
- `getOrCreateExchangeTradedContractNearest()` → `ReferenceWithMetaObservableBuilder` [Getter]

### VarianceReturnTermsImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseImpl` 
**Implements:** `VarianceReturnTerms` 

**Key Methods:**
- `build()` → `VarianceReturnTerms` [Builder]
- `setBuilderFields(VarianceReturnTermsBuilder arg0)` → `void` [Setter]
- `getVarianceCapFloor()` → `VarianceCapFloor` [Getter]
- `getVolatilityCapFloor()` → `VolatilityCapFloor` [Getter]
- `getVarianceStrikePrice()` → `Price` [Getter]
- `getVegaNotionalAmount()` → `NonNegativeQuantitySchedule` [Getter]
- `getVolatilityStrikePrice()` → `Price` [Getter]
- `getExchangeTradedContractNearest()` → `ReferenceWithMetaObservable` [Getter]

### VolatilityCapFloorBuilderImpl
**Implements:** `VolatilityCapFloor$VolatilityCapFloorBuilder` 

**Fields:**
- `Boolean applicable`
- `BigDecimal totalVolatilityCap`
- `BigDecimal volatilityCapFactor`

**Key Methods:**
- `build()` → `VolatilityCapFloor` [Builder]
- `getTotalVolatilityCap()` → `BigDecimal` [Getter]
- `setApplicable(Boolean arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `setTotalVolatilityCap(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]
- `getVolatilityCapFactor()` → `BigDecimal` [Getter]
- `setVolatilityCapFactor(BigDecimal arg0)` → `VolatilityCapFloorBuilder` [Setter]
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
- `getOrCreateVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `getOrCreateVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `setSharePriceDividendAdjustment(Boolean arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setEquityUnderlierProvisions(EquityUnderlierProvisions arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `setExchangeTradedContractNearest(ListedDerivative arg0)` → `VolatilityReturnTermsBuilder` [Setter]
- `getOrCreateExchangeTradedContractNearest()` → `ListedDerivativeBuilder` [Getter]
- `getVolatilityCapFloor()` → `VolatilityCapFloorBuilder` [Getter]
- `getVolatilityStrikePrice()` → `PriceBuilder` [Getter]
- `setValuationTerms(ValuationTerms arg0)` → `VolatilityReturnTermsBuilder` [Setter]

### VolatilityReturnTermsImpl
**Extends:** `ReturnTermsBase$ReturnTermsBaseImpl` 
**Implements:** `VolatilityReturnTerms` 

**Key Methods:**
- `build()` → `VolatilityReturnTerms` [Builder]
- `setBuilderFields(VolatilityReturnTermsBuilder arg0)` → `void` [Setter]
- `getVolatilityCapFloor()` → `VolatilityCapFloor` [Getter]
- `getVolatilityStrikePrice()` → `Price` [Getter]
- `getExchangeTradedContractNearest()` → `ListedDerivative` [Getter]

