# ContractDetailsBuilderImpl

**Full Name:** `cdm.event.common.ContractDetails$ContractDetailsBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ContractDetails$ContractDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| documentation | `java.util.List<cdm.legaldocumentation.common.LegalAgreement$LegalAgreementBuilder>` |  |
| governingLaw | `FieldWithMetaGoverningLawEnumBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ContractDetails build()`

#### Setter Methods

- `ContractDetailsBuilder setGoverningLawValue(GoverningLawEnum arg0)`
- `ContractDetailsBuilder setGoverningLaw(FieldWithMetaGoverningLawEnum arg0)`
- `ContractDetailsBuilder setDocumentation(List arg0)`
- `ContractDetailsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `List getDocumentation()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaGoverningLawEnumBuilder getOrCreateGoverningLaw()`
- `FieldWithMetaGoverningLawEnumBuilder getGoverningLaw()`
- `LegalAgreementBuilder getOrCreateDocumentation(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `ContractDetailsBuilder addDocumentation(LegalAgreement arg0, int arg1)`
- `ContractDetailsBuilder addDocumentation(LegalAgreement arg0)`
- `ContractDetailsBuilder addDocumentation(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ContractDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ContractDetailsBuilder prune()`
- `ContractDetailsBuilder toBuilder()`
- `boolean hasData()`

