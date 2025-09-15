# FieldWithMetaTimeZoneBuilderImpl

**Full Name:** `cdm.base.datetime.metafields.FieldWithMetaTimeZone$FieldWithMetaTimeZoneBuilderImpl`

**Package:** `cdm.base.datetime.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.metafields.FieldWithMetaTimeZone$FieldWithMetaTimeZoneBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `TimeZoneBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `FieldWithMetaTimeZone build()`

#### Setter Methods

- `FieldWithMetaTimeZoneBuilder setValue(TimeZone arg0)`
- `FieldWithMetaTimeZoneBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `TimeZoneBuilder getValue()`
- `TimeZoneBuilder getOrCreateValue()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FieldWithMetaTimeZoneBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FieldWithMetaTimeZoneBuilder toBuilder()`
- `FieldWithMetaTimeZoneBuilder prune()`

