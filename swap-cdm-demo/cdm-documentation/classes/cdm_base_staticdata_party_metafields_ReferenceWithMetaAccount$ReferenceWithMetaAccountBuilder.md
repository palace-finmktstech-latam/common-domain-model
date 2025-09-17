# ReferenceWithMetaAccountBuilder

**Full Name:** `cdm.base.staticdata.party.metafields.ReferenceWithMetaAccount$ReferenceWithMetaAccountBuilder`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.ReferenceWithMetaAccount`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaAccountBuilder setValue(Account arg0)`
- `ReferenceWithMetaAccountBuilder setReference(Reference arg0)`
- `ReferenceWithMetaAccountBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaAccountBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `AccountBuilder getValue()`
- `AccountBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaAccountBuilder prune()`

