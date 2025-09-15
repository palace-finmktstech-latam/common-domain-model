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
- `TriggerBuilder setTriggerType(TriggerTypeEnum arg0)`
- `TriggerBuilder setCreditEventsReference(ReferenceWithMetaCreditEvents arg0)`
- `TriggerBuilder setCreditEvents(CreditEvents arg0)`
- `TriggerBuilder setCreditEventsReferenceValue(CreditEvents arg0)`

#### Getter Methods

- `List getLevel()`
- `TriggerTimeTypeEnum getTriggerTimeType()`
- `ReferenceWithMetaCreditEventsBuilder getCreditEventsReference()`
- `PriceScheduleBuilder getOrCreateLevel(int arg0)`
- `TriggerTypeEnum getTriggerType()`
- `CreditEventsBuilder getOrCreateCreditEvents()`
- `ReferenceWithMetaCreditEventsBuilder getOrCreateCreditEventsReference()`
- `CreditEventsBuilder getCreditEvents()`

#### Adder Methods

- `TriggerBuilder addLevel(List arg0)`
- `TriggerBuilder addLevel(PriceSchedule arg0)`
- `TriggerBuilder addLevel(PriceSchedule arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TriggerBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TriggerBuilder toBuilder()`
- `TriggerBuilder prune()`

