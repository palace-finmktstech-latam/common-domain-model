# CreditEventBuilder

**Full Name:** `cdm.event.common.CreditEvent$CreditEventBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CreditEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CreditEventBuilder setReferenceInformation(ReferenceInformation arg0)`
- `CreditEventBuilder setAuctionDate(Date arg0)`
- `CreditEventBuilder setFinalPrice(Price arg0)`
- `CreditEventBuilder setRecoveryPercent(BigDecimal arg0)`
- `CreditEventBuilder setEventDeterminationDate(Date arg0)`
- `CreditEventBuilder setCreditEventType(CreditEventTypeEnum arg0)`
- `CreditEventBuilder setPubliclyAvailableInformation(List arg0)`

#### Getter Methods

- `PriceBuilder getOrCreateFinalPrice()`
- `ReferenceInformationBuilder getReferenceInformation()`
- `PriceBuilder getFinalPrice()`
- `ResourceBuilder getOrCreatePubliclyAvailableInformation(int arg0)`
- `ReferenceInformationBuilder getOrCreateReferenceInformation()`
- `List getPubliclyAvailableInformation()`

#### Adder Methods

- `CreditEventBuilder addPubliclyAvailableInformation(List arg0)`
- `CreditEventBuilder addPubliclyAvailableInformation(Resource arg0, int arg1)`
- `CreditEventBuilder addPubliclyAvailableInformation(Resource arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditEventBuilder prune()`

