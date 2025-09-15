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
- `Boolean getNonStandardisedTerms()`
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

- `EconomicTermsBuilder addPayout(Payout arg0)`
- `EconomicTermsBuilder addPayout(List arg0)`
- `EconomicTermsBuilder addPayout(Payout arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EconomicTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EconomicTermsBuilder toBuilder()`
- `EconomicTermsBuilder prune()`

