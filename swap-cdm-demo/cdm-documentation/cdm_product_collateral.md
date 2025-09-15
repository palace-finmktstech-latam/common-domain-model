# Package: cdm.product.collateral

## Enums

### CollateralMarginTypeEnum
**Values:**
- `VariationMargin`
- `InitialMargin`

### CollateralTypeEnum
**Values:**
- `Cash`
- `NonCash`
- `CashPool`

### CreditSupportAgreementTypeEnum
**Values:**
- `CreditSupportDeed`
- `CreditSupportAnnex`
- `CollateralTransferAgreement`

## Interfaces

### AverageTradingVolumeBuilder
**Implements:** `AverageTradingVolume` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePeriod()` → `PeriodBuilder` [Getter]
- `setMethodology(AverageTradingVolumeMethodologyEnum arg0)` → `AverageTradingVolumeBuilder` [Setter]
- `setPeriod(Period arg0)` → `AverageTradingVolumeBuilder` [Setter]
- `getPeriod()` → `PeriodBuilder` [Getter]

### Collateral
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Collateral` [Builder]
- `getPortfolioIdentifier()` → `List` [Getter]
- `getCollateralPortfolio()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getIndependentAmount()` → `IndependentAmount` [Getter]
- `getCollateralProvisions()` → `CollateralProvisions` [Getter]

### CollateralBuilder
**Implements:** `Collateral` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getPortfolioIdentifier()` → `List` [Getter]
- `setPortfolioIdentifier(List arg0)` → `CollateralBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getCollateralPortfolio()` → `List` [Getter]
- `setCollateralProvisions(CollateralProvisions arg0)` → `CollateralBuilder` [Setter]
- `setIndependentAmount(IndependentAmount arg0)` → `CollateralBuilder` [Setter]
- `getOrCreateCollateralPortfolio(int arg0)` → `ReferenceWithMetaCollateralPortfolioBuilder` [Getter]
- `setCollateralPortfolioValue(List arg0)` → `CollateralBuilder` [Setter]
- `getOrCreateCollateralProvisions()` → `CollateralProvisionsBuilder` [Getter]
- `getOrCreateIndependentAmount()` → `IndependentAmountBuilder` [Getter]

### CollateralProvisionsBuilder
**Implements:** `CollateralProvisions` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getEligibleCollateral()` → `List` [Getter]
- `getSubstitutionProvisions()` → `SubstitutionProvisionsBuilder` [Getter]
- `setCollateralType(CollateralTypeEnum arg0)` → `CollateralProvisionsBuilder` [Setter]
- `setEligibleCollateral(List arg0)` → `CollateralProvisionsBuilder` [Setter]
- `setSubstitutionProvisions(SubstitutionProvisions arg0)` → `CollateralProvisionsBuilder` [Setter]
- `getOrCreateSubstitutionProvisions()` → `SubstitutionProvisionsBuilder` [Getter]
- `getOrCreateEligibleCollateral(int arg0)` → `EligibleCollateralCriteriaBuilder` [Getter]

### CollateralTreatment
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralTreatment` [Builder]
- `getIsIncluded()` → `Boolean` [Getter]
- `getValuationTreatment()` → `CollateralValuationTreatment` [Getter]
- `getConcentrationLimit()` → `List` [Getter]

### CollateralTreatmentBuilder
**Implements:** `CollateralTreatment` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setIsIncluded(Boolean arg0)` → `CollateralTreatmentBuilder` [Setter]
- `setConcentrationLimit(List arg0)` → `CollateralTreatmentBuilder` [Setter]
- `setValuationTreatment(CollateralValuationTreatment arg0)` → `CollateralTreatmentBuilder` [Setter]
- `getValuationTreatment()` → `CollateralValuationTreatmentBuilder` [Getter]
- `getConcentrationLimit()` → `List` [Getter]
- `getOrCreateConcentrationLimit(int arg0)` → `ConcentrationLimitBuilder` [Getter]
- `getOrCreateValuationTreatment()` → `CollateralValuationTreatmentBuilder` [Getter]

### CollateralValuationTreatment
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralValuationTreatment` [Builder]
- `getFxHaircutPercentage()` → `BigDecimal` [Getter]
- `getHaircutPercentage()` → `BigDecimal` [Getter]
- `getMarginPercentage()` → `BigDecimal` [Getter]
- `getAdditionalHaircutPercentage()` → `BigDecimal` [Getter]

### CollateralValuationTreatmentBuilder
**Implements:** `CollateralValuationTreatment` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMarginPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]
- `setHaircutPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]
- `setFxHaircutPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]
- `setAdditionalHaircutPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]

### ConcentrationLimitBuilder
**Implements:** `ConcentrationLimit` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getValueLimit()` → `MoneyRangeBuilder` [Getter]
- `getPercentageLimit()` → `NumberRangeBuilder` [Getter]
- `setPercentageLimit(NumberRange arg0)` → `ConcentrationLimitBuilder` [Setter]
- `setValueLimit(MoneyRange arg0)` → `ConcentrationLimitBuilder` [Setter]
- `getOrCreatePercentageLimit()` → `NumberRangeBuilder` [Getter]
- `getOrCreateValueLimit()` → `MoneyRangeBuilder` [Getter]
- `getConcentrationLimitCriteria()` → `ConcentrationLimitCriteriaBuilder` [Getter]
- `getOrCreateConcentrationLimitCriteria()` → `ConcentrationLimitCriteriaBuilder` [Getter]
- `setConcentrationLimitCriteria(ConcentrationLimitCriteria arg0)` → `ConcentrationLimitBuilder` [Setter]

### ConcentrationLimitCriteriaBuilder
**Implements:** `ConcentrationLimitCriteria` `CollateralCriteriaBase$CollateralCriteriaBaseBuilder` 

**Key Methods:**
- `setAverageTradingVolume(AverageTradingVolume arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `setConcentrationLimitType(ConcentrationLimitTypeEnum arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `getAverageTradingVolume()` → `AverageTradingVolumeBuilder` [Getter]
- `setAppliesTo(List arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `setCollateralCriteria(CollateralCriteria arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `setRestrictTo(CollateralMarginTypeEnum arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `getOrCreateAverageTradingVolume()` → `AverageTradingVolumeBuilder` [Getter]
- `setRatingPriorityResolution(RatingPriorityResolutionEnum arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]

### ContactElection
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ContactElection` [Builder]
- `getPartyElection()` → `List` [Getter]

### ContactElectionBuilder
**Implements:** `ContactElection` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPartyElection()` → `List` [Getter]
- `setPartyElection(List arg0)` → `ContactElectionBuilder` [Setter]
- `getOrCreatePartyElection(int arg0)` → `PartyContactInformationBuilder` [Getter]

### EligibleCollateralCriteriaBuilder
**Implements:** `EligibleCollateralCriteria` `CollateralCriteriaBase$CollateralCriteriaBaseBuilder` 

**Key Methods:**
- `setAppliesTo(List arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `setCollateralCriteria(CollateralCriteria arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `setRestrictTo(CollateralMarginTypeEnum arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `getTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `getOrCreateTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setTreatment(CollateralTreatment arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `setRatingPriorityResolution(RatingPriorityResolutionEnum arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]

### IndependentAmountBuilder
**Implements:** `IndependentAmount` `PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilder` 

**Key Methods:**
- `setPaymentDetail(List arg0)` → `IndependentAmountBuilder` [Setter]
- `getOrCreatePaymentDetail(int arg0)` → `PaymentDetailBuilder` [Getter]
- `getPaymentDetail()` → `List` [Getter]
- `setPayerPartyReference(ReferenceWithMetaParty arg0)` → `IndependentAmountBuilder` [Setter]
- `setPayerAccountReference(ReferenceWithMetaAccount arg0)` → `IndependentAmountBuilder` [Setter]
- `setReceiverPartyReference(ReferenceWithMetaParty arg0)` → `IndependentAmountBuilder` [Setter]
- `setPayerPartyReferenceValue(Party arg0)` → `IndependentAmountBuilder` [Setter]
- `setReceiverPartyReferenceValue(Party arg0)` → `IndependentAmountBuilder` [Setter]
- `setReceiverAccountReference(ReferenceWithMetaAccount arg0)` → `IndependentAmountBuilder` [Setter]
- `setPayerAccountReferenceValue(Account arg0)` → `IndependentAmountBuilder` [Setter]

### SubstitutionProvisionsBuilder
**Implements:** `SubstitutionProvisions` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getNoticeDeadlinePeriod()` → `PeriodBuilder` [Getter]
- `setNoticeDeadlineDateTime(ZonedDateTime arg0)` → `SubstitutionProvisionsBuilder` [Setter]
- `setNoticeDeadlinePeriod(Period arg0)` → `SubstitutionProvisionsBuilder` [Setter]
- `getOrCreateNoticeDeadlinePeriod()` → `PeriodBuilder` [Getter]
- `setNumberOfSubstitutionsAllowed(Integer arg0)` → `SubstitutionProvisionsBuilder` [Setter]

