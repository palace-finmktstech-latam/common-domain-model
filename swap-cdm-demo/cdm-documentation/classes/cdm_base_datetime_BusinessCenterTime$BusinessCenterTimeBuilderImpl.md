# BusinessCenterTimeBuilderImpl

**Full Name:** `cdm.base.datetime.BusinessCenterTime$BusinessCenterTimeBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.BusinessCenterTime$BusinessCenterTimeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| hourMinuteTime | `LocalTime` |  |
| businessCenter | `FieldWithMetaBusinessCenterEnumBuilder` |  |

### Methods

#### Builder Methods

- `BusinessCenterTime build()`

#### Setter Methods

- `BusinessCenterTimeBuilder setHourMinuteTime(LocalTime arg0)`
- `BusinessCenterTimeBuilder setBusinessCenterValue(BusinessCenterEnum arg0)`
- `BusinessCenterTimeBuilder setBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)`

#### Getter Methods

- `FieldWithMetaBusinessCenterEnumBuilder getOrCreateBusinessCenter()`
- `LocalTime getHourMinuteTime()`
- `FieldWithMetaBusinessCenterEnumBuilder getBusinessCenter()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BusinessCenterTimeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BusinessCenterTimeBuilder toBuilder()`
- `BusinessCenterTimeBuilder prune()`

