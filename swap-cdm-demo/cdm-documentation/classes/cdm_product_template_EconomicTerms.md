# EconomicTerms

**Full Name:** `cdm.product.template.EconomicTerms`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `EconomicTerms build()`

#### Getter Methods

- `Class getType()`
- `Collateral getCollateral()`
- `AdjustableOrRelativeDate getEffectiveDate()`
- `AdjustableOrRelativeDate getTerminationDate()`
- `List getPayout()`
- `CalculationAgent getCalculationAgent()`
- `TerminationProvision getTerminationProvision()`
- `Boolean getNonStandardisedTerms()`
- `BusinessDayAdjustments getDateAdjustments()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `EconomicTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

