# TriggerBuilderImpl

**Full Name:** `cdm.observable.event.Trigger$TriggerBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.Trigger$TriggerBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| level | `java.util.List<cdm.observable.asset.PriceSchedule$PriceScheduleBuilder>` |  |
| creditEvents | `CreditEventsBuilder` |  |
| creditEventsReference | `ReferenceWithMetaCreditEventsBuilder` |  |
| triggerType | `TriggerTypeEnum` |  |
| triggerTimeType | `TriggerTimeTypeEnum` |  |

### Methods

#### Builder Methods

- `Trigger build()`

#### Setter Methods

- `TriggerBuilder setLevel(List arg0)`
- `TriggerBuilder setTriggerTimeType(TriggerTimeTypeEnum arg0)`
- `TriggerBuilder setCreditEvents(CreditEvents arg0)`
- `TriggerBuilder setCreditEventsReference(ReferenceWithMetaCreditEvents arg0)`
- `TriggerBuilder setTriggerType(TriggerTypeEnum arg0)`
- `TriggerBuilder setCreditEventsReferenceValue(CreditEvents arg0)`

#### Getter Methods

- `List getLevel()`
- `CreditEventsBuilder getCreditEvents()`
- `CreditEventsBuilder getOrCreateCreditEvents()`
- `PriceScheduleBuilder getOrCreateLevel(int arg0)`
- `TriggerTimeTypeEnum getTriggerTimeType()`
- `ReferenceWithMetaCreditEventsBuilder getCreditEventsReference()`
- `TriggerTypeEnum getTriggerType()`
- `ReferenceWithMetaCreditEventsBuilder getOrCreateCreditEventsReference()`

#### Adder Methods

- `TriggerBuilder addLevel(PriceSchedule arg0, int arg1)`
- `TriggerBuilder addLevel(PriceSchedule arg0)`
- `TriggerBuilder addLevel(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TriggerBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TriggerBuilder prune()`
- `TriggerBuilder toBuilder()`
- `boolean hasData()`

