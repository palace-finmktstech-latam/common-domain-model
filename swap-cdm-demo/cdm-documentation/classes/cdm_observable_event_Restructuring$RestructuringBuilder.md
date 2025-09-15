# RestructuringBuilder

**Full Name:** `cdm.observable.event.Restructuring$RestructuringBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.Restructuring`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `RestructuringBuilder setRestructuringType(FieldWithMetaRestructuringEnum arg0)`
- `RestructuringBuilder setRestructuringTypeValue(RestructuringEnum arg0)`
- `RestructuringBuilder setMultipleHolderObligation(Boolean arg0)`
- `RestructuringBuilder setMultipleCreditEventNotices(Boolean arg0)`
- `RestructuringBuilder setApplicable(Boolean arg0)`

#### Getter Methods

- `FieldWithMetaRestructuringEnumBuilder getOrCreateRestructuringType()`
- `FieldWithMetaRestructuringEnumBuilder getRestructuringType()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `RestructuringBuilder prune()`

