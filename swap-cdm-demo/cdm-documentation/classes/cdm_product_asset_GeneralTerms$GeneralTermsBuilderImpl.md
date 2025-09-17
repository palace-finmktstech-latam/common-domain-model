# GeneralTermsBuilderImpl

**Full Name:** `cdm.product.asset.GeneralTerms$GeneralTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.GeneralTerms$GeneralTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| referenceInformation | `ReferenceInformationBuilder` |  |
| indexReferenceInformation | `CreditIndexBuilder` |  |
| basketReferenceInformation | `BasketReferenceInformationBuilder` |  |
| additionalTerm | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |
| substitution | `Boolean` |  |
| modifiedEquityDelivery | `Boolean` |  |

### Methods

#### Builder Methods

- `GeneralTerms build()`

#### Setter Methods

- `GeneralTermsBuilder setReferenceInformation(ReferenceInformation arg0)`
- `GeneralTermsBuilder setAdditionalTerm(List arg0)`
- `GeneralTermsBuilder setModifiedEquityDelivery(Boolean arg0)`
- `GeneralTermsBuilder setSubstitution(Boolean arg0)`
- `GeneralTermsBuilder setAdditionalTermValue(List arg0)`
- `GeneralTermsBuilder setBasketReferenceInformation(BasketReferenceInformation arg0)`
- `GeneralTermsBuilder setIndexReferenceInformation(CreditIndex arg0)`

#### Getter Methods

- `ReferenceInformationBuilder getReferenceInformation()`
- `CreditIndexBuilder getIndexReferenceInformation()`
- `ReferenceInformationBuilder getOrCreateReferenceInformation()`
- `Boolean getSubstitution()`
- `Boolean getModifiedEquityDelivery()`
- `FieldWithMetaStringBuilder getOrCreateAdditionalTerm(int arg0)`
- `BasketReferenceInformationBuilder getBasketReferenceInformation()`
- `BasketReferenceInformationBuilder getOrCreateBasketReferenceInformation()`
- `CreditIndexBuilder getOrCreateIndexReferenceInformation()`
- `List getAdditionalTerm()`

#### Adder Methods

- `GeneralTermsBuilder addAdditionalTermValue(String arg0, int arg1)`
- `GeneralTermsBuilder addAdditionalTermValue(String arg0)`
- `GeneralTermsBuilder addAdditionalTermValue(List arg0)`
- `GeneralTermsBuilder addAdditionalTerm(FieldWithMetaString arg0, int arg1)`
- `GeneralTermsBuilder addAdditionalTerm(FieldWithMetaString arg0)`
- `GeneralTermsBuilder addAdditionalTerm(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `GeneralTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `GeneralTermsBuilder prune()`
- `GeneralTermsBuilder toBuilder()`
- `boolean hasData()`

