# EconomicTermsBuilder

**Full Name:** `cdm.product.template.EconomicTerms$EconomicTermsBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.EconomicTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `EconomicTermsBuilder setPayout(List arg0)`
- `EconomicTermsBuilder setCollateral(Collateral arg0)`
- `EconomicTermsBuilder setEffectiveDate(AdjustableOrRelativeDate arg0)`
- `EconomicTermsBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `EconomicTermsBuilder setTerminationProvision(TerminationProvision arg0)`
- `EconomicTermsBuilder setNonStandardisedTerms(Boolean arg0)`
- `EconomicTermsBuilder setCalculationAgent(CalculationAgent arg0)`
- `EconomicTermsBuilder setTerminationDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `CollateralBuilder getOrCreateCollateral()`
- `PayoutBuilder getOrCreatePayout(int arg0)`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `TerminationProvisionBuilder getTerminationProvision()`
- `AdjustableOrRelativeDateBuilder getOrCreateTerminationDate()`
- `CalculationAgentBuilder getCalculationAgent()`
- `AdjustableOrRelativeDateBuilder getOrCreateEffectiveDate()`
- `AdjustableOrRelativeDateBuilder getEffectiveDate()`
- `AdjustableOrRelativeDateBuilder getTerminationDate()`
- `CollateralBuilder getCollateral()`
- `CalculationAgentBuilder getOrCreateCalculationAgent()`
- `TerminationProvisionBuilder getOrCreateTerminationProvision()`
- `List getPayout()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`

#### Adder Methods

- `EconomicTermsBuilder addPayout(List arg0)`
- `EconomicTermsBuilder addPayout(Payout arg0, int arg1)`
- `EconomicTermsBuilder addPayout(Payout arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EconomicTermsBuilder prune()`

