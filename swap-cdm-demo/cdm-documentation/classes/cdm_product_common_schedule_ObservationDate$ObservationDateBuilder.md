# ObservationDateBuilder

**Full Name:** `cdm.product.common.schedule.ObservationDate$ObservationDateBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `ObservationDateBuilder setMeta(MetaFields arg0)`
- `ObservationDateBuilder setObservationReference(String arg0)`
- `ObservationDateBuilder setUnadjustedDate(Date arg0)`
- `ObservationDateBuilder setAdjustedDate(Date arg0)`
- `ObservationDateBuilder setWeight(BigDecimal arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationDateBuilder prune()`

