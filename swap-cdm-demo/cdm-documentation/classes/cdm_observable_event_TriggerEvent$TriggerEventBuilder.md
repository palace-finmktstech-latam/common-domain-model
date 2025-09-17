# TriggerEventBuilder

**Full Name:** `cdm.observable.event.TriggerEvent$TriggerEventBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.TriggerEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `TriggerEventBuilder addSchedule(List arg0)`
- `TriggerEventBuilder addSchedule(AveragingSchedule arg0, int arg1)`
- `TriggerEventBuilder addSchedule(AveragingSchedule arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TriggerEventBuilder prune()`

