# FallbackReferencePriceBuilder

**Full Name:** `cdm.observable.asset.FallbackReferencePrice$FallbackReferencePriceBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.FallbackReferencePrice`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FallbackReferencePriceBuilder setValuationPostponement(ValuationPostponement arg0)`
- `FallbackReferencePriceBuilder setCalculationAgentDetermination(CalculationAgent arg0)`
- `FallbackReferencePriceBuilder setFallBackSettlementRateOptionValue(List arg0)`
- `FallbackReferencePriceBuilder setFallBackSettlementRateOption(List arg0)`
- `FallbackReferencePriceBuilder setFallbackSurveyValuationPostponement(Boolean arg0)`

#### Getter Methods

- `ValuationPostponementBuilder getValuationPostponement()`
- `List getFallBackSettlementRateOption()`
- `CalculationAgentBuilder getCalculationAgentDetermination()`
- `ValuationPostponementBuilder getOrCreateValuationPostponement()`
- `CalculationAgentBuilder getOrCreateCalculationAgentDetermination()`
- `FieldWithMetaSettlementRateOptionEnumBuilder getOrCreateFallBackSettlementRateOption(int arg0)`

#### Adder Methods

- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(List arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0, int arg1)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(SettlementRateOptionEnum arg0, int arg1)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(SettlementRateOptionEnum arg0)`
- `FallbackReferencePriceBuilder addFallBackSettlementRateOptionValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FallbackReferencePriceBuilder prune()`

