# ReferenceWithMetaLegalEntityBuilder

**Full Name:** `cdm.base.staticdata.party.metafields.ReferenceWithMetaLegalEntity$ReferenceWithMetaLegalEntityBuilder`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.ReferenceWithMetaLegalEntity`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaLegalEntityBuilder setValue(LegalEntity arg0)`
- `ReferenceWithMetaLegalEntityBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaLegalEntityBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaLegalEntityBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `LegalEntityBuilder getValue()`
- `LegalEntityBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaLegalEntityBuilder prune()`

