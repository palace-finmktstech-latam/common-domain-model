# AveragingStrikeFeatureBuilderImpl

**Full Name:** `cdm.product.template.AveragingStrikeFeature$AveragingStrikeFeatureBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.AveragingStrikeFeature$AveragingStrikeFeatureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| averagingCalculation | `AveragingCalculationBuilder` |  |
| observationTerms | `ObservationTermsBuilder` |  |

### Methods

#### Builder Methods

- `AveragingStrikeFeature build()`

#### Setter Methods

- `AveragingStrikeFeatureBuilder setObservationTerms(ObservationTerms arg0)`
- `AveragingStrikeFeatureBuilder setAveragingCalculation(AveragingCalculation arg0)`

#### Getter Methods

- `ObservationTermsBuilder getOrCreateObservationTerms()`
- `AveragingCalculationBuilder getOrCreateAveragingCalculation()`
- `AveragingCalculationBuilder getAveragingCalculation()`
- `ObservationTermsBuilder getObservationTerms()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AveragingStrikeFeatureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AveragingStrikeFeatureBuilder toBuilder()`
- `AveragingStrikeFeatureBuilder prune()`

