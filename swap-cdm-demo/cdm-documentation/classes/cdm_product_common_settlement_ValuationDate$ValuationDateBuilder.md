# ValuationDateBuilder

**Full Name:** `cdm.product.common.settlement.ValuationDate$ValuationDateBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.ValuationDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationDateBuilder prune()`

