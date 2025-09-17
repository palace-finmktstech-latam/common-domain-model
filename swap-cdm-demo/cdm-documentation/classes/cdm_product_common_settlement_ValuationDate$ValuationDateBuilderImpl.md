# ValuationDateBuilderImpl

**Full Name:** `cdm.product.common.settlement.ValuationDate$ValuationDateBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.ValuationDate$ValuationDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| singleValuationDate | `SingleValuationDateBuilder` |  |
| multipleValuationDates | `MultipleValuationDatesBuilder` |  |
| valuationDate | `RelativeDateOffsetBuilder` |  |
| fxFixingDate | `FxFixingDateBuilder` |  |
| fxFixingSchedule | `AdjustableDatesBuilder` |  |

### Methods

#### Builder Methods

- `ValuationDate build()`

#### Setter Methods

- `ValuationDateBuilder setValuationDate(RelativeDateOffset arg0)`
- `ValuationDateBuilder setMultipleValuationDates(MultipleValuationDates arg0)`
- `ValuationDateBuilder setFxFixingSchedule(AdjustableDates arg0)`
- `ValuationDateBuilder setSingleValuationDate(SingleValuationDate arg0)`
- `ValuationDateBuilder setFxFixingDate(FxFixingDate arg0)`

#### Getter Methods

- `RelativeDateOffsetBuilder getValuationDate()`
- `RelativeDateOffsetBuilder getOrCreateValuationDate()`
- `AdjustableDatesBuilder getFxFixingSchedule()`
- `MultipleValuationDatesBuilder getMultipleValuationDates()`
- `SingleValuationDateBuilder getSingleValuationDate()`
- `FxFixingDateBuilder getOrCreateFxFixingDate()`
- `FxFixingDateBuilder getFxFixingDate()`
- `AdjustableDatesBuilder getOrCreateFxFixingSchedule()`
- `SingleValuationDateBuilder getOrCreateSingleValuationDate()`
- `MultipleValuationDatesBuilder getOrCreateMultipleValuationDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ValuationDateBuilder prune()`
- `ValuationDateBuilder toBuilder()`
- `boolean hasData()`

