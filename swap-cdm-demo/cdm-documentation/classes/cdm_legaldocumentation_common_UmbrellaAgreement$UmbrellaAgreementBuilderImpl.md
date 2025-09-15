# UmbrellaAgreementBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.UmbrellaAgreement$UmbrellaAgreementBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.UmbrellaAgreement$UmbrellaAgreementBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| isApplicable | `Boolean` |  |
| language | `String` |  |
| parties | `java.util.List<cdm.legaldocumentation.common.UmbrellaAgreementEntity$UmbrellaAgreementEntityBuilder>` |  |

### Methods

#### Builder Methods

- `UmbrellaAgreement build()`

#### Setter Methods

- `UmbrellaAgreementBuilder setLanguage(String arg0)`
- `UmbrellaAgreementBuilder setIsApplicable(Boolean arg0)`
- `UmbrellaAgreementBuilder setParties(List arg0)`

#### Getter Methods

- `String getLanguage()`
- `UmbrellaAgreementEntityBuilder getOrCreateParties(int arg0)`
- `Boolean getIsApplicable()`
- `List getParties()`

#### Adder Methods

- `UmbrellaAgreementBuilder addParties(UmbrellaAgreementEntity arg0)`
- `UmbrellaAgreementBuilder addParties(UmbrellaAgreementEntity arg0, int arg1)`
- `UmbrellaAgreementBuilder addParties(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `UmbrellaAgreementBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `UmbrellaAgreementBuilder toBuilder()`
- `UmbrellaAgreementBuilder prune()`

