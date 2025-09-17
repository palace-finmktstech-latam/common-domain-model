# ValuationDate

**Full Name:** `cdm.product.common.settlement.ValuationDate`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ValuationDate build()`

#### Getter Methods

- `Class getType()`
- `RelativeDateOffset getValuationDate()`
- `AdjustableDates getFxFixingSchedule()`
- `MultipleValuationDates getMultipleValuationDates()`
- `SingleValuationDate getSingleValuationDate()`
- `FxFixingDate getFxFixingDate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ValuationDateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

