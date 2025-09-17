# GeneralTermsBuilder

**Full Name:** `cdm.product.asset.GeneralTerms$GeneralTermsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.GeneralTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `FieldWithMetaStringBuilder getOrCreateAdditionalTerm(int arg0)`
- `BasketReferenceInformationBuilder getBasketReferenceInformation()`
- `BasketReferenceInformationBuilder getOrCreateBasketReferenceInformation()`
- `CreditIndexBuilder getOrCreateIndexReferenceInformation()`
- `List getAdditionalTerm()`

#### Adder Methods

- `GeneralTermsBuilder addAdditionalTermValue(String arg0, int arg1)`
- `GeneralTermsBuilder addAdditionalTermValue(List arg0)`
- `GeneralTermsBuilder addAdditionalTermValue(String arg0)`
- `GeneralTermsBuilder addAdditionalTerm(FieldWithMetaString arg0)`
- `GeneralTermsBuilder addAdditionalTerm(List arg0)`
- `GeneralTermsBuilder addAdditionalTerm(FieldWithMetaString arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `GeneralTermsBuilder prune()`

