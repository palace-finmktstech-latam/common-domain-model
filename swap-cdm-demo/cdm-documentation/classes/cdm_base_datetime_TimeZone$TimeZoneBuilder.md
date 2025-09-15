# TimeZoneBuilder

**Full Name:** `cdm.base.datetime.TimeZone$TimeZoneBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.TimeZone`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TimeZoneBuilder setTime(LocalTime arg0)`
- `TimeZoneBuilder setLocation(FieldWithMetaString arg0)`
- `TimeZoneBuilder setLocationValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getLocation()`
- `FieldWithMetaStringBuilder getOrCreateLocation()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TimeZoneBuilder prune()`

