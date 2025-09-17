# CreditEventBuilder

**Full Name:** `cdm.event.common.CreditEvent$CreditEventBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CreditEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CreditEventBuilder setCreditEventType(CreditEventTypeEnum arg0)`
- `CreditEventBuilder setEventDeterminationDate(Date arg0)`
- `CreditEventBuilder setRecoveryPercent(BigDecimal arg0)`
- `CreditEventBuilder setFinalPrice(Price arg0)`
- `CreditEventBuilder setAuctionDate(Date arg0)`
- `CreditEventBuilder setReferenceInformation(ReferenceInformation arg0)`
- `CreditEventBuilder setPubliclyAvailableInformation(List arg0)`

#### Getter Methods

- `PriceBuilder getOrCreateFinalPrice()`
- `PriceBuilder getFinalPrice()`
- `ReferenceInformationBuilder getReferenceInformation()`
- `List getPubliclyAvailableInformation()`
- `ReferenceInformationBuilder getOrCreateReferenceInformation()`
- `ResourceBuilder getOrCreatePubliclyAvailableInformation(int arg0)`

#### Adder Methods

- `CreditEventBuilder addPubliclyAvailableInformation(List arg0)`
- `CreditEventBuilder addPubliclyAvailableInformation(Resource arg0)`
- `CreditEventBuilder addPubliclyAvailableInformation(Resource arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditEventBuilder prune()`

