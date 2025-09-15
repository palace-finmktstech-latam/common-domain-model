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

- `ValuationDateBuilder setMultipleValuationDates(MultipleValuationDates arg0)`
- `ValuationDateBuilder setFxFixingDate(FxFixingDate arg0)`
- `ValuationDateBuilder setFxFixingSchedule(AdjustableDates arg0)`
- `ValuationDateBuilder setSingleValuationDate(SingleValuationDate arg0)`
- `ValuationDateBuilder setValuationDate(RelativeDateOffset arg0)`

#### Getter Methods

- `FxFixingDateBuilder getFxFixingDate()`
- `MultipleValuationDatesBuilder getMultipleValuationDates()`
- `FxFixingDateBuilder getOrCreateFxFixingDate()`
- `SingleValuationDateBuilder getSingleValuationDate()`
- `AdjustableDatesBuilder getFxFixingSchedule()`
- `SingleValuationDateBuilder getOrCreateSingleValuationDate()`
- `MultipleValuationDatesBuilder getOrCreateMultipleValuationDates()`
- `AdjustableDatesBuilder getOrCreateFxFixingSchedule()`
- `RelativeDateOffsetBuilder getValuationDate()`
- `RelativeDateOffsetBuilder getOrCreateValuationDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ValuationDateBuilder toBuilder()`
- `ValuationDateBuilder prune()`

