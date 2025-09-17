# ContractDetailsBuilder

**Full Name:** `cdm.event.common.ContractDetails$ContractDetailsBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ContractDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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
- `ContractDetailsBuilder addDocumentation(List arg0)`
- `ContractDetailsBuilder addDocumentation(LegalAgreement arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ContractDetailsBuilder prune()`

