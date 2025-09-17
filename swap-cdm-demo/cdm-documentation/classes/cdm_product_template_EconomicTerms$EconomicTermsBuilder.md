# EconomicTermsBuilder

**Full Name:** `cdm.product.template.EconomicTerms$EconomicTermsBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.EconomicTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `EconomicTermsBuilder setTerminationDate(AdjustableOrRelativeDate arg0)`
- `EconomicTermsBuilder setPayout(List arg0)`
- `EconomicTermsBuilder setCollateral(Collateral arg0)`
- `EconomicTermsBuilder setCalculationAgent(CalculationAgent arg0)`
- `EconomicTermsBuilder setTerminationProvision(TerminationProvision arg0)`
- `EconomicTermsBuilder setNonStandardisedTerms(Boolean arg0)`
- `EconomicTermsBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `EconomicTermsBuilder setEffectiveDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `CollateralBuilder getCollateral()`
- `AdjustableOrRelativeDateBuilder getEffectiveDate()`
- `AdjustableOrRelativeDateBuilder getTerminationDate()`
- `CollateralBuilder getOrCreateCollateral()`
- `List getPayout()`
- `CalculationAgentBuilder getCalculationAgent()`
- `AdjustableOrRelativeDateBuilder getOrCreateTerminationDate()`
- `TerminationProvisionBuilder getTerminationProvision()`
- `AdjustableOrRelativeDateBuilder getOrCreateEffectiveDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `CalculationAgentBuilder getOrCreateCalculationAgent()`
- `TerminationProvisionBuilder getOrCreateTerminationProvision()`
- `PayoutBuilder getOrCreatePayout(int arg0)`

#### Adder Methods

- `EconomicTermsBuilder addPayout(Payout arg0, int arg1)`
- `EconomicTermsBuilder addPayout(List arg0)`
- `EconomicTermsBuilder addPayout(Payout arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EconomicTermsBuilder prune()`

