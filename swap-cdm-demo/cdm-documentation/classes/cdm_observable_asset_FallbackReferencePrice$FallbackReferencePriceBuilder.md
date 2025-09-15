# FallbackReferencePriceBuilder

**Full Name:** `cdm.observable.asset.FallbackReferencePrice$FallbackReferencePriceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.FallbackReferencePrice`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FallbackReferencePriceBuilder setFallBackSettlementRateOptionValue(List arg0)`
- `FallbackReferencePriceBuilder setCalculationAgentDetermination(CalculationAgent arg0)`
- `FallbackReferencePriceBuilder setFallBackSettlementRateOption(List arg0)`
- `FallbackReferencePriceBuilder setFallbackSurveyValuationPostponement(Boolean arg0)`
- `FallbackReferencePriceBuilder setValuationPostponement(ValuationPostponement arg0)`

#### Getter Methods

- `List getFallBackSettlementRateOption()`
- `CalculationAgentBuilder getCalculationAgentDetermination()`
- `FieldWithMetaSettlementRateOptionEnumBuilder getOrCreateFallBackSettlementRateOption(int arg0)`
- `CalculationAgentBuilder getOrCreateCalculationAgentDetermination()`
- `ValuationPostponementBuilder getOrCreateValuationPostponement()`
- `ValuationPostponementBuilder getValuationPostponement()`

#### Adder Methods

- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0, int arg1)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(List arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(SettlementRateOptionEnum arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(List arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(SettlementRateOptionEnum arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FallbackReferencePriceBuilder prune()`

