# TimeZoneBuilderImpl

**Full Name:** `cdm.base.datetime.TimeZone$TimeZoneBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.TimeZone$TimeZoneBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| time | `LocalTime` |  |
| location | `FieldWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `TimeZone build()`

#### Setter Methods

- `TimeZoneBuilder setTime(LocalTime arg0)`
- `TimeZoneBuilder setLocation(FieldWithMetaString arg0)`
- `TimeZoneBuilder setLocationValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getLocation()`
- `LocalTime getTime()`
- `FieldWithMetaStringBuilder getOrCreateLocation()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TimeZoneBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TimeZoneBuilder prune()`
- `TimeZoneBuilder toBuilder()`
- `boolean hasData()`

