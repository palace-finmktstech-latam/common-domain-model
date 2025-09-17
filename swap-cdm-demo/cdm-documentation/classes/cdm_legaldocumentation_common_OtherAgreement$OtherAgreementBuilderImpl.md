# OtherAgreementBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.OtherAgreement$OtherAgreementBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.OtherAgreement$OtherAgreementBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `FieldWithMetaStringBuilder` |  |
| otherAgreementType | `FieldWithMetaStringBuilder` |  |
| version | `FieldWithMetaStringBuilder` |  |
| date | `Date` |  |

### Methods

#### Builder Methods

- `OtherAgreement build()`

#### Setter Methods

- `OtherAgreementBuilder setVersion(FieldWithMetaString arg0)`
- `OtherAgreementBuilder setDate(Date arg0)`
- `OtherAgreementBuilder setIdentifierValue(String arg0)`
- `OtherAgreementBuilder setIdentifier(FieldWithMetaString arg0)`
- `OtherAgreementBuilder setVersionValue(String arg0)`
- `OtherAgreementBuilder setOtherAgreementType(FieldWithMetaString arg0)`
- `OtherAgreementBuilder setOtherAgreementTypeValue(String arg0)`

#### Getter Methods

- `Date getDate()`
- `FieldWithMetaStringBuilder getVersion()`
- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `FieldWithMetaStringBuilder getOrCreateVersion()`
- `FieldWithMetaStringBuilder getOtherAgreementType()`
- `FieldWithMetaStringBuilder getOrCreateOtherAgreementType()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OtherAgreementBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `OtherAgreementBuilder prune()`
- `OtherAgreementBuilder toBuilder()`
- `boolean hasData()`

