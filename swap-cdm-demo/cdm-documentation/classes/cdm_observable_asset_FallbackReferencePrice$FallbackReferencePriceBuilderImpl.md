# FallbackReferencePriceBuilderImpl

**Full Name:** `cdm.observable.asset.FallbackReferencePrice$FallbackReferencePriceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.FallbackReferencePrice$FallbackReferencePriceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| valuationPostponement | `ValuationPostponementBuilder` |  |
| fallBackSettlementRateOption | `java.util.List<cdm.observable.asset.metafields.FieldWithMetaSettlementRateOptionEnum$FieldWithMetaSettlementRateOptionEnumBuilder>` |  |
| fallbackSurveyValuationPostponement | `Boolean` |  |
| calculationAgentDetermination | `CalculationAgentBuilder` |  |

### Methods

#### Builder Methods

- `FallbackReferencePrice build()`

#### Setter Methods

- `FallbackReferencePriceBuilder setValuationPostponement(ValuationPostponement arg0)`
- `FallbackReferencePriceBuilder setCalculationAgentDetermination(CalculationAgent arg0)`
- `FallbackReferencePriceBuilder setFallBackSettlementRateOptionValue(List arg0)`
- `FallbackReferencePriceBuilder setFallBackSettlementRateOption(List arg0)`
- `FallbackReferencePriceBuilder setFallbackSurveyValuationPostponement(Boolean arg0)`

#### Getter Methods

- `ValuationPostponementBuilder getValuationPostponement()`
- `List getFallBackSettlementRateOption()`
- `Boolean getFallbackSurveyValuationPostponement()`
- `CalculationAgentBuilder getCalculationAgentDetermination()`
- `ValuationPostponementBuilder getOrCreateValuationPostponement()`
- `CalculationAgentBuilder getOrCreateCalculationAgentDetermination()`
- `FieldWithMetaSettlementRateOptionEnumBuilder getOrCreateFallBackSettlementRateOption(int arg0)`

#### Adder Methods

- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0, int arg1)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(List arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(List arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(SettlementRateOptionEnum arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(SettlementRateOptionEnum arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FallbackReferencePriceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FallbackReferencePriceBuilder prune()`
- `FallbackReferencePriceBuilder toBuilder()`
- `boolean hasData()`

