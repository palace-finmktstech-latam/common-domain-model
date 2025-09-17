# AdjustableDate

**Full Name:** `cdm.base.datetime.AdjustableDate`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `AdjustableDate build()`

#### Getter Methods

- `Class getType()`
- `FieldWithMetaDate getAdjustedDate()`
- `Date getUnadjustedDate()`
- `MetaFields getMeta()`
- `BusinessDayAdjustments getDateAdjustments()`
- `ReferenceWithMetaBusinessDayAdjustments getDateAdjustmentsReference()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `AdjustableDateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

