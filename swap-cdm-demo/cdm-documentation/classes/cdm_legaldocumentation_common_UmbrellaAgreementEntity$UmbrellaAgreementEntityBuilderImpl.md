# UmbrellaAgreementEntityBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.UmbrellaAgreementEntity$UmbrellaAgreementEntityBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.party.LegalEntity$LegalEntityBuilderImpl`

### Implemented Interfaces

- `cdm.legaldocumentation.common.UmbrellaAgreementEntity$UmbrellaAgreementEntityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| terms | `String` |  |

### Methods

#### Builder Methods

- `UmbrellaAgreementEntity build()`

#### Setter Methods

- `UmbrellaAgreementEntityBuilder setName(FieldWithMetaString arg0)`
- `UmbrellaAgreementEntityBuilder setMeta(MetaFields arg0)`
- `UmbrellaAgreementEntityBuilder setNameValue(String arg0)`
- `UmbrellaAgreementEntityBuilder setEntityId(List arg0)`
- `UmbrellaAgreementEntityBuilder setEntityIdValue(List arg0)`
- `UmbrellaAgreementEntityBuilder setTerms(String arg0)`

#### Getter Methods

- `String getTerms()`

#### Adder Methods

- `UmbrellaAgreementEntityBuilder addEntityIdValue(String arg0, int arg1)`
- `UmbrellaAgreementEntityBuilder addEntityIdValue(List arg0)`
- `UmbrellaAgreementEntityBuilder addEntityIdValue(String arg0)`
- `UmbrellaAgreementEntityBuilder addEntityId(List arg0)`
- `UmbrellaAgreementEntityBuilder addEntityId(FieldWithMetaString arg0)`
- `UmbrellaAgreementEntityBuilder addEntityId(FieldWithMetaString arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `UmbrellaAgreementEntityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `UmbrellaAgreementEntityBuilder prune()`
- `UmbrellaAgreementEntityBuilder toBuilder()`
- `boolean hasData()`

