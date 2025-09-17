# CounterpartyPositionBusinessEventBuilderImpl

**Full Name:** `cdm.event.common.CounterpartyPositionBusinessEvent$CounterpartyPositionBusinessEventBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.CounterpartyPositionBusinessEvent$CounterpartyPositionBusinessEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| intent | `PositionEventIntentEnum` |  |
| corporateActionIntent | `CorporateActionTypeEnum` |  |
| eventDate | `Date` |  |
| effectiveDate | `Date` |  |
| packageInformation | `IdentifiedListBuilder` |  |
| after | `java.util.List<cdm.event.common.CounterpartyPositionState$CounterpartyPositionStateBuilder>` |  |

### Methods

#### Builder Methods

- `CounterpartyPositionBusinessEvent build()`

#### Setter Methods

- `CounterpartyPositionBusinessEventBuilder setEventDate(Date arg0)`
- `CounterpartyPositionBusinessEventBuilder setIntent(PositionEventIntentEnum arg0)`
- `CounterpartyPositionBusinessEventBuilder setPackageInformation(IdentifiedList arg0)`
- `CounterpartyPositionBusinessEventBuilder setCorporateActionIntent(CorporateActionTypeEnum arg0)`
- `CounterpartyPositionBusinessEventBuilder setAfter(List arg0)`
- `CounterpartyPositionBusinessEventBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `Date getEffectiveDate()`
- `IdentifiedListBuilder getOrCreatePackageInformation()`
- `IdentifiedListBuilder getPackageInformation()`
- `CorporateActionTypeEnum getCorporateActionIntent()`
- `Date getEventDate()`
- `List getAfter()`
- `PositionEventIntentEnum getIntent()`
- `CounterpartyPositionStateBuilder getOrCreateAfter(int arg0)`

#### Adder Methods

- `CounterpartyPositionBusinessEventBuilder addAfter(CounterpartyPositionState arg0, int arg1)`
- `CounterpartyPositionBusinessEventBuilder addAfter(List arg0)`
- `CounterpartyPositionBusinessEventBuilder addAfter(CounterpartyPositionState arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CounterpartyPositionBusinessEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CounterpartyPositionBusinessEventBuilder prune()`
- `CounterpartyPositionBusinessEventBuilder toBuilder()`
- `boolean hasData()`

