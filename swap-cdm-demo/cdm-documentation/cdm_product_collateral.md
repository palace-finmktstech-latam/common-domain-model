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
- `getPeriod()` → `PeriodBuilder` [Getter]
- `setPeriod(Period arg0)` → `AverageTradingVolumeBuilder` [Setter]
- `setMethodology(AverageTradingVolumeMethodologyEnum arg0)` → `AverageTradingVolumeBuilder` [Setter]
- `getOrCreatePeriod()` → `PeriodBuilder` [Getter]

### Collateral
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Collateral` [Builder]
- `getPortfolioIdentifier()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getCollateralProvisions()` → `CollateralProvisions` [Getter]
- `getIndependentAmount()` → `IndependentAmount` [Getter]
- `getCollateralPortfolio()` → `List` [Getter]

### CollateralBuilder
**Implements:** `Collateral` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setPortfolioIdentifier(List arg0)` → `CollateralBuilder` [Setter]
- `getPortfolioIdentifier()` → `List` [Getter]
- `getOrCreatePortfolioIdentifier(int arg0)` → `IdentifierBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CollateralBuilder` [Setter]
- `getCollateralProvisions()` → `CollateralProvisionsBuilder` [Getter]
- `getIndependentAmount()` → `IndependentAmountBuilder` [Getter]
- `setCollateralPortfolio(List arg0)` → `CollateralBuilder` [Setter]
- `setCollateralPortfolioValue(List arg0)` → `CollateralBuilder` [Setter]

### CollateralProvisionsBuilder
**Implements:** `CollateralProvisions` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getEligibleCollateral()` → `List` [Getter]
- `getOrCreateEligibleCollateral(int arg0)` → `EligibleCollateralCriteriaBuilder` [Getter]
- `getOrCreateSubstitutionProvisions()` → `SubstitutionProvisionsBuilder` [Getter]
- `getSubstitutionProvisions()` → `SubstitutionProvisionsBuilder` [Getter]
- `setCollateralType(CollateralTypeEnum arg0)` → `CollateralProvisionsBuilder` [Setter]
- `setSubstitutionProvisions(SubstitutionProvisions arg0)` → `CollateralProvisionsBuilder` [Setter]
- `setEligibleCollateral(List arg0)` → `CollateralProvisionsBuilder` [Setter]

### CollateralTreatment
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralTreatment` [Builder]
- `getValuationTreatment()` → `CollateralValuationTreatment` [Getter]
- `getConcentrationLimit()` → `List` [Getter]
- `getIsIncluded()` → `Boolean` [Getter]

### CollateralTreatmentBuilder
**Implements:** `CollateralTreatment` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getValuationTreatment()` → `CollateralValuationTreatmentBuilder` [Getter]
- `getConcentrationLimit()` → `List` [Getter]
- `getOrCreateValuationTreatment()` → `CollateralValuationTreatmentBuilder` [Getter]
- `getOrCreateConcentrationLimit(int arg0)` → `ConcentrationLimitBuilder` [Getter]
- `setValuationTreatment(CollateralValuationTreatment arg0)` → `CollateralTreatmentBuilder` [Setter]
- `setIsIncluded(Boolean arg0)` → `CollateralTreatmentBuilder` [Setter]
- `setConcentrationLimit(List arg0)` → `CollateralTreatmentBuilder` [Setter]

### CollateralValuationTreatment
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CollateralValuationTreatment` [Builder]
- `getHaircutPercentage()` → `BigDecimal` [Getter]
- `getMarginPercentage()` → `BigDecimal` [Getter]
- `getFxHaircutPercentage()` → `BigDecimal` [Getter]
- `getAdditionalHaircutPercentage()` → `BigDecimal` [Getter]

### CollateralValuationTreatmentBuilder
**Implements:** `CollateralValuationTreatment` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setHaircutPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]
- `setMarginPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]
- `setFxHaircutPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]
- `setAdditionalHaircutPercentage(BigDecimal arg0)` → `CollateralValuationTreatmentBuilder` [Setter]

### ConcentrationLimitBuilder
**Implements:** `ConcentrationLimit` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getValueLimit()` → `MoneyRangeBuilder` [Getter]
- `setValueLimit(MoneyRange arg0)` → `ConcentrationLimitBuilder` [Setter]
- `setPercentageLimit(NumberRange arg0)` → `ConcentrationLimitBuilder` [Setter]
- `getOrCreatePercentageLimit()` → `NumberRangeBuilder` [Getter]
- `getPercentageLimit()` → `NumberRangeBuilder` [Getter]
- `getOrCreateValueLimit()` → `MoneyRangeBuilder` [Getter]
- `getConcentrationLimitCriteria()` → `ConcentrationLimitCriteriaBuilder` [Getter]
- `getOrCreateConcentrationLimitCriteria()` → `ConcentrationLimitCriteriaBuilder` [Getter]
- `setConcentrationLimitCriteria(ConcentrationLimitCriteria arg0)` → `ConcentrationLimitBuilder` [Setter]

### ConcentrationLimitCriteriaBuilder
**Implements:** `ConcentrationLimitCriteria` `CollateralCriteriaBase$CollateralCriteriaBaseBuilder` 

**Key Methods:**
- `setRatingPriorityResolution(RatingPriorityResolutionEnum arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `setCollateralCriteria(CollateralCriteria arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `setAppliesTo(List arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `setRestrictTo(CollateralMarginTypeEnum arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `getOrCreateAverageTradingVolume()` → `AverageTradingVolumeBuilder` [Getter]
- `setAverageTradingVolume(AverageTradingVolume arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]
- `getAverageTradingVolume()` → `AverageTradingVolumeBuilder` [Getter]
- `setConcentrationLimitType(ConcentrationLimitTypeEnum arg0)` → `ConcentrationLimitCriteriaBuilder` [Setter]

### ContactElection
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ContactElection` [Builder]
- `getPartyElection()` → `List` [Getter]

### ContactElectionBuilder
**Implements:** `ContactElection` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPartyElection(List arg0)` → `ContactElectionBuilder` [Setter]
- `getOrCreatePartyElection(int arg0)` → `PartyContactInformationBuilder` [Getter]
- `getPartyElection()` → `List` [Getter]

### EligibleCollateralCriteriaBuilder
**Implements:** `EligibleCollateralCriteria` `CollateralCriteriaBase$CollateralCriteriaBaseBuilder` 

**Key Methods:**
- `getTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setTreatment(CollateralTreatment arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `getOrCreateTreatment()` → `CollateralTreatmentBuilder` [Getter]
- `setRatingPriorityResolution(RatingPriorityResolutionEnum arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `setCollateralCriteria(CollateralCriteria arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `setAppliesTo(List arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]
- `setRestrictTo(CollateralMarginTypeEnum arg0)` → `EligibleCollateralCriteriaBuilder` [Setter]

### IndependentAmountBuilder
**Implements:** `IndependentAmount` `PartyReferencePayerReceiver$PartyReferencePayerReceiverBuilder` 

**Key Methods:**
- `setPayerPartyReferenceValue(Party arg0)` → `IndependentAmountBuilder` [Setter]
- `setReceiverPartyReferenceValue(Party arg0)` → `IndependentAmountBuilder` [Setter]
- `setReceiverAccountReference(ReferenceWithMetaAccount arg0)` → `IndependentAmountBuilder` [Setter]
- `setReceiverAccountReferenceValue(Account arg0)` → `IndependentAmountBuilder` [Setter]
- `setPayerAccountReferenceValue(Account arg0)` → `IndependentAmountBuilder` [Setter]
- `setReceiverPartyReference(ReferenceWithMetaParty arg0)` → `IndependentAmountBuilder` [Setter]
- `setPayerPartyReference(ReferenceWithMetaParty arg0)` → `IndependentAmountBuilder` [Setter]
- `getPaymentDetail()` → `List` [Getter]
- `setPaymentDetail(List arg0)` → `IndependentAmountBuilder` [Setter]
- `getOrCreatePaymentDetail(int arg0)` → `PaymentDetailBuilder` [Getter]

### SubstitutionProvisionsBuilder
**Implements:** `SubstitutionProvisions` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateNoticeDeadlinePeriod()` → `PeriodBuilder` [Getter]
- `setNumberOfSubstitutionsAllowed(Integer arg0)` → `SubstitutionProvisionsBuilder` [Setter]
- `getNoticeDeadlinePeriod()` → `PeriodBuilder` [Getter]
- `setNoticeDeadlineDateTime(ZonedDateTime arg0)` → `SubstitutionProvisionsBuilder` [Setter]
- `setNoticeDeadlinePeriod(Period arg0)` → `SubstitutionProvisionsBuilder` [Setter]

