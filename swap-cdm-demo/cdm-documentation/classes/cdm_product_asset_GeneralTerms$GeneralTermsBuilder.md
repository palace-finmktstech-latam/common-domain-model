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
- `GeneralTermsBuilder setAdditionalTermValue(List arg0)`
- `GeneralTermsBuilder setModifiedEquityDelivery(Boolean arg0)`
- `GeneralTermsBuilder setAdditionalTerm(List arg0)`
- `GeneralTermsBuilder setSubstitution(Boolean arg0)`
- `GeneralTermsBuilder setIndexReferenceInformation(CreditIndex arg0)`
- `GeneralTermsBuilder setBasketReferenceInformation(BasketReferenceInformation arg0)`

#### Getter Methods

- `List getAdditionalTerm()`
- `ReferenceInformationBuilder getReferenceInformation()`
- `FieldWithMetaStringBuilder getOrCreateAdditionalTerm(int arg0)`
- `BasketReferenceInformationBuilder getOrCreateBasketReferenceInformation()`
- `CreditIndexBuilder getOrCreateIndexReferenceInformation()`
- `BasketReferenceInformationBuilder getBasketReferenceInformation()`
- `CreditIndexBuilder getIndexReferenceInformation()`
- `ReferenceInformationBuilder getOrCreateReferenceInformation()`

#### Adder Methods

- `GeneralTermsBuilder addAdditionalTermValue(String arg0, int arg1)`
- `GeneralTermsBuilder addAdditionalTermValue(String arg0)`
- `GeneralTermsBuilder addAdditionalTermValue(List arg0)`
- `GeneralTermsBuilder addAdditionalTerm(List arg0)`
- `GeneralTermsBuilder addAdditionalTerm(FieldWithMetaString arg0, int arg1)`
- `GeneralTermsBuilder addAdditionalTerm(FieldWithMetaString arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `GeneralTermsBuilder prune()`

