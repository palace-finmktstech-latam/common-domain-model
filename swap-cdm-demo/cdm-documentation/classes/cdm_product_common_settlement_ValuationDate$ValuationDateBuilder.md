# ValuationDateBuilder

**Full Name:** `cdm.product.common.settlement.ValuationDate$ValuationDateBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.ValuationDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationDateBuilder prune()`

