# ContractualTermsSupplementBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.ContractualTermsSupplement$ContractualTermsSupplementBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.ContractualTermsSupplement$ContractualTermsSupplementBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| contractualTermsSupplementType | `FieldWithMetaContractualSupplementTypeEnumBuilder` |  |
| publicationDate | `Date` |  |

### Methods

#### Builder Methods

- `ContractualTermsSupplement build()`

#### Setter Methods

- `ContractualTermsSupplementBuilder setPublicationDate(Date arg0)`
- `ContractualTermsSupplementBuilder setContractualTermsSupplementTypeValue(ContractualSupplementTypeEnum arg0)`
- `ContractualTermsSupplementBuilder setContractualTermsSupplementType(FieldWithMetaContractualSupplementTypeEnum arg0)`

#### Getter Methods

- `Date getPublicationDate()`
- `FieldWithMetaContractualSupplementTypeEnumBuilder getOrCreateContractualTermsSupplementType()`
- `FieldWithMetaContractualSupplementTypeEnumBuilder getContractualTermsSupplementType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ContractualTermsSupplementBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ContractualTermsSupplementBuilder prune()`
- `ContractualTermsSupplementBuilder toBuilder()`
- `boolean hasData()`

