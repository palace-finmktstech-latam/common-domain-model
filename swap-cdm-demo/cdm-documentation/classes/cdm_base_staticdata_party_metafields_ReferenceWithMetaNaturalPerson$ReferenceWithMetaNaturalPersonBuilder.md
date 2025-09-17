# ReferenceWithMetaNaturalPersonBuilder

**Full Name:** `cdm.base.staticdata.party.metafields.ReferenceWithMetaNaturalPerson$ReferenceWithMetaNaturalPersonBuilder`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.ReferenceWithMetaNaturalPerson`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaNaturalPersonBuilder setValue(NaturalPerson arg0)`
- `ReferenceWithMetaNaturalPersonBuilder setReference(Reference arg0)`
- `ReferenceWithMetaNaturalPersonBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaNaturalPersonBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `NaturalPersonBuilder getValue()`
- `NaturalPersonBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaNaturalPersonBuilder prune()`

