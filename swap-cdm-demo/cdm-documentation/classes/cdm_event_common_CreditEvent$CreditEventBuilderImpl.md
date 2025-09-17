# CreditEventBuilderImpl

**Full Name:** `cdm.event.common.CreditEvent$CreditEventBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.CreditEvent$CreditEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| creditEventType | `CreditEventTypeEnum` |  |
| eventDeterminationDate | `Date` |  |
| auctionDate | `Date` |  |
| finalPrice | `PriceBuilder` |  |
| recoveryPercent | `BigDecimal` |  |
| publiclyAvailableInformation | `java.util.List<cdm.legaldocumentation.common.Resource$ResourceBuilder>` |  |
| referenceInformation | `ReferenceInformationBuilder` |  |

### Methods

#### Builder Methods

- `CreditEvent build()`

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
- `Date getEventDeterminationDate()`
- `BigDecimal getRecoveryPercent()`
- `CreditEventTypeEnum getCreditEventType()`
- `Date getAuctionDate()`
- `PriceBuilder getFinalPrice()`
- `ReferenceInformationBuilder getReferenceInformation()`
- `List getPubliclyAvailableInformation()`
- `ReferenceInformationBuilder getOrCreateReferenceInformation()`
- `ResourceBuilder getOrCreatePubliclyAvailableInformation(int arg0)`

#### Adder Methods

- `CreditEventBuilder addPubliclyAvailableInformation(Resource arg0)`
- `CreditEventBuilder addPubliclyAvailableInformation(Resource arg0, int arg1)`
- `CreditEventBuilder addPubliclyAvailableInformation(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CreditEventBuilder prune()`
- `CreditEventBuilder toBuilder()`
- `boolean hasData()`

