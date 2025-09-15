# RelativeDateOffset

**Full Name:** `cdm.base.datetime.RelativeDateOffset`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.Offset`

### Methods

#### Builder Methods

- `RelativeDateOffset build()`

#### Getter Methods

- `Class getType()`
- `BusinessDayConventionEnum getBusinessDayConvention()`
- `BusinessCenters getBusinessCenters()`
- `ReferenceWithMetaDate getDateRelativeTo()`
- `Date getAdjustedDate()`
- `ReferenceWithMetaBusinessCenters getBusinessCentersReference()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `RelativeDateOffsetBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

