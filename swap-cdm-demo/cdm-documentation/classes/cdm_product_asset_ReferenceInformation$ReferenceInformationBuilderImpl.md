# ReferenceInformationBuilderImpl

**Full Name:** `cdm.product.asset.ReferenceInformation$ReferenceInformationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ReferenceInformation$ReferenceInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| referenceEntity | `LegalEntityBuilder` |  |
| referenceObligation | `java.util.List<cdm.product.asset.ReferenceObligation$ReferenceObligationBuilder>` |  |
| noReferenceObligation | `Boolean` |  |
| unknownReferenceObligation | `Boolean` |  |
| allGuarantees | `Boolean` |  |
| referencePrice | `PriceBuilder` |  |
| referencePolicy | `Boolean` |  |
| securedList | `Boolean` |  |

### Methods

#### Builder Methods

- `ReferenceInformation build()`

#### Setter Methods

- `ReferenceInformationBuilder setUnknownReferenceObligation(Boolean arg0)`
- `ReferenceInformationBuilder setReferenceObligation(List arg0)`
- `ReferenceInformationBuilder setNoReferenceObligation(Boolean arg0)`
- `ReferenceInformationBuilder setAllGuarantees(Boolean arg0)`
- `ReferenceInformationBuilder setReferenceEntity(LegalEntity arg0)`
- `ReferenceInformationBuilder setReferencePolicy(Boolean arg0)`
- `ReferenceInformationBuilder setReferencePrice(Price arg0)`
- `ReferenceInformationBuilder setSecuredList(Boolean arg0)`

#### Getter Methods

- `Boolean getAllGuarantees()`
- `LegalEntityBuilder getReferenceEntity()`
- `PriceBuilder getReferencePrice()`
- `List getReferenceObligation()`
- `Boolean getNoReferenceObligation()`
- `Boolean getReferencePolicy()`
- `Boolean getSecuredList()`
- `Boolean getUnknownReferenceObligation()`
- `ReferenceObligationBuilder getOrCreateReferenceObligation(int arg0)`
- `LegalEntityBuilder getOrCreateReferenceEntity()`
- `PriceBuilder getOrCreateReferencePrice()`

#### Adder Methods

- `ReferenceInformationBuilder addReferenceObligation(List arg0)`
- `ReferenceInformationBuilder addReferenceObligation(ReferenceObligation arg0, int arg1)`
- `ReferenceInformationBuilder addReferenceObligation(ReferenceObligation arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceInformationBuilder prune()`
- `ReferenceInformationBuilder toBuilder()`
- `boolean hasData()`

