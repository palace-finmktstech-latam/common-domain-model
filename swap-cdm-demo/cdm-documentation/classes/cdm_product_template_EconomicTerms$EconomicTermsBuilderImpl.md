# EconomicTermsBuilderImpl

**Full Name:** `cdm.product.template.EconomicTerms$EconomicTermsBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.EconomicTerms$EconomicTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| effectiveDate | `AdjustableOrRelativeDateBuilder` |  |
| terminationDate | `AdjustableOrRelativeDateBuilder` |  |
| dateAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| payout | `java.util.List<cdm.product.template.Payout$PayoutBuilder>` |  |
| terminationProvision | `TerminationProvisionBuilder` |  |
| calculationAgent | `CalculationAgentBuilder` |  |
| nonStandardisedTerms | `Boolean` |  |
| collateral | `CollateralBuilder` |  |

### Methods

#### Builder Methods

- `EconomicTerms build()`

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
- `Boolean getNonStandardisedTerms()`
- `AdjustableOrRelativeDateBuilder getOrCreateEffectiveDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `CalculationAgentBuilder getOrCreateCalculationAgent()`
- `TerminationProvisionBuilder getOrCreateTerminationProvision()`
- `PayoutBuilder getOrCreatePayout(int arg0)`

#### Adder Methods

- `EconomicTermsBuilder addPayout(List arg0)`
- `EconomicTermsBuilder addPayout(Payout arg0, int arg1)`
- `EconomicTermsBuilder addPayout(Payout arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EconomicTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `EconomicTermsBuilder prune()`
- `EconomicTermsBuilder toBuilder()`
- `boolean hasData()`

