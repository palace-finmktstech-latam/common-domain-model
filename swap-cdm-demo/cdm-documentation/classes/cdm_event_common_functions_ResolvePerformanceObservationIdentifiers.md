# ResolvePerformanceObservationIdentifiers

**Full Name:** `cdm.event.common.functions.ResolvePerformanceObservationIdentifiers`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| adjustedValuationDates | `AdjustedValuationDates` |  |
| assetDeepPathUtil | `AssetDeepPathUtil` |  |
| resolveAdjustableDate | `ResolveAdjustableDate` |  |
| resolvePerformanceValuationTime | `ResolvePerformanceValuationTime` |  |

### Methods

#### Other Methods

- `ObservationIdentifier evaluate(PerformancePayout arg0, Date arg1)`
- `ObservationIdentifierBuilder doEvaluate(PerformancePayout arg0, Date arg1)`
- `MapperS adjustedFinalValuationDate(PerformancePayout arg0, Date arg1)`
- `MapperS valuationDates(PerformancePayout arg0, Date arg1)`

### Annotations

- **ImplementedBy**

