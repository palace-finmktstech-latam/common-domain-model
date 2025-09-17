# TriggerEventBuilderImpl

**Full Name:** `cdm.observable.event.TriggerEvent$TriggerEventBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.TriggerEvent$TriggerEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| schedule | `java.util.List<cdm.base.datetime.AveragingSchedule$AveragingScheduleBuilder>` |  |
| triggerDates | `DateListBuilder` |  |
| trigger | `TriggerBuilder` |  |
| featurePayment | `FeaturePaymentBuilder` |  |

### Methods

#### Builder Methods

- `TriggerEvent build()`

#### Setter Methods

- `TriggerEventBuilder setSchedule(List arg0)`
- `TriggerEventBuilder setTriggerDates(DateList arg0)`
- `TriggerEventBuilder setFeaturePayment(FeaturePayment arg0)`
- `TriggerEventBuilder setTrigger(Trigger arg0)`

#### Getter Methods

- `TriggerBuilder getTrigger()`
- `List getSchedule()`
- `AveragingScheduleBuilder getOrCreateSchedule(int arg0)`
- `DateListBuilder getOrCreateTriggerDates()`
- `TriggerBuilder getOrCreateTrigger()`
- `FeaturePaymentBuilder getOrCreateFeaturePayment()`
- `DateListBuilder getTriggerDates()`
- `FeaturePaymentBuilder getFeaturePayment()`

#### Adder Methods

- `TriggerEventBuilder addSchedule(AveragingSchedule arg0)`
- `TriggerEventBuilder addSchedule(AveragingSchedule arg0, int arg1)`
- `TriggerEventBuilder addSchedule(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TriggerEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TriggerEventBuilder prune()`
- `TriggerEventBuilder toBuilder()`
- `boolean hasData()`

