# ObligationsBuilder

**Full Name:** `cdm.base.staticdata.asset.credit.Obligations$ObligationsBuilder`

**Package:** `cdm.base.staticdata.asset.credit`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.credit.Obligations`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObligationsBuilder setContinuity(Boolean arg0)`
- `ObligationsBuilder setCashSettlementOnly(Boolean arg0)`
- `ObligationsBuilder setDesignatedPriority(FieldWithMetaString arg0)`
- `ObligationsBuilder setDesignatedPriorityValue(String arg0)`
- `ObligationsBuilder setDeliveryOfCommitments(Boolean arg0)`
- `ObligationsBuilder setListed(Boolean arg0)`
- `ObligationsBuilder setNotContingent(Boolean arg0)`
- `ObligationsBuilder setNotDomesticCurrency(NotDomesticCurrency arg0)`
- `ObligationsBuilder setNotSubordinated(Boolean arg0)`
- `ObligationsBuilder setCategory(ObligationCategoryEnum arg0)`
- `ObligationsBuilder setNotDomesticLaw(Boolean arg0)`
- `ObligationsBuilder setNotDomesticIssuance(Boolean arg0)`
- `ObligationsBuilder setSpecifiedCurrency(SpecifiedCurrency arg0)`
- `ObligationsBuilder setExcluded(String arg0)`
- `ObligationsBuilder setNotSovereignLender(Boolean arg0)`
- `ObligationsBuilder setRevenueObligationLiability(Boolean arg0)`
- `ObligationsBuilder setGeneralFundObligationLiability(Boolean arg0)`
- `ObligationsBuilder setFullFaithAndCreditObLiability(Boolean arg0)`
- `ObligationsBuilder setOthReferenceEntityObligations(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getDesignatedPriority()`
- `SpecifiedCurrencyBuilder getOrCreateSpecifiedCurrency()`
- `NotDomesticCurrencyBuilder getOrCreateNotDomesticCurrency()`
- `FieldWithMetaStringBuilder getOrCreateDesignatedPriority()`
- `SpecifiedCurrencyBuilder getSpecifiedCurrency()`
- `NotDomesticCurrencyBuilder getNotDomesticCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObligationsBuilder prune()`

