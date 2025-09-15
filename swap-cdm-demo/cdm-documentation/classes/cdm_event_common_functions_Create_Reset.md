# Create_Reset

**Full Name:** `cdm.event.common.functions.Create_Reset`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| resolveInterestRateObservationIdentifiers | `ResolveInterestRateObservationIdentifiers` |  |
| resolveInterestRateReset | `ResolveInterestRateReset` |  |
| resolveObservation | `ResolveObservation` |  |
| resolvePerformanceObservationIdentifiers | `ResolvePerformanceObservationIdentifiers` |  |
| resolvePerformanceReset | `ResolvePerformanceReset` |  |

### Methods

#### Other Methods

- `TradeState evaluate(ResetInstruction arg0, TradeState arg1)`
- `TradeStateBuilder doEvaluate(ResetInstruction arg0, TradeState arg1)`
- `MapperS observationDate(ResetInstruction arg0, TradeState arg1)`
- `MapperS observationIdentifiers(ResetInstruction arg0, TradeState arg1)`
- `MapperS observation(ResetInstruction arg0, TradeState arg1)`
- `MapperC payout(ResetInstruction arg0, TradeState arg1)`

### Annotations

- **ImplementedBy**

