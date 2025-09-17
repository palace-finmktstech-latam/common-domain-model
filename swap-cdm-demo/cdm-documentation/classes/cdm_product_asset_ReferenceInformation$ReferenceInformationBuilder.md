# ReferenceInformationBuilder

**Full Name:** `cdm.product.asset.ReferenceInformation$ReferenceInformationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReferenceInformation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `LegalEntityBuilder getReferenceEntity()`
- `PriceBuilder getReferencePrice()`
- `List getReferenceObligation()`
- `ReferenceObligationBuilder getOrCreateReferenceObligation(int arg0)`
- `LegalEntityBuilder getOrCreateReferenceEntity()`
- `PriceBuilder getOrCreateReferencePrice()`

#### Adder Methods

- `ReferenceInformationBuilder addReferenceObligation(List arg0)`
- `ReferenceInformationBuilder addReferenceObligation(ReferenceObligation arg0)`
- `ReferenceInformationBuilder addReferenceObligation(ReferenceObligation arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceInformationBuilder prune()`

