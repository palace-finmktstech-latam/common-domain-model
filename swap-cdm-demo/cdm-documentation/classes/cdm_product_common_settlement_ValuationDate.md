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
- `FxFixingDate getFxFixingDate()`
- `MultipleValuationDates getMultipleValuationDates()`
- `SingleValuationDate getSingleValuationDate()`
- `AdjustableDates getFxFixingSchedule()`
- `RelativeDateOffset getValuationDate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ValuationDateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

