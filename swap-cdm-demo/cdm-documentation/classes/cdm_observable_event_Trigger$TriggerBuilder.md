# TriggerBuilder

**Full Name:** `cdm.observable.event.Trigger$TriggerBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.Trigger`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TriggerBuilder setLevel(List arg0)`
- `TriggerBuilder setTriggerTimeType(TriggerTimeTypeEnum arg0)`
- `TriggerBuilder setTriggerType(TriggerTypeEnum arg0)`
- `TriggerBuilder setCreditEventsReference(ReferenceWithMetaCreditEvents arg0)`
- `TriggerBuilder setCreditEvents(CreditEvents arg0)`
- `TriggerBuilder setCreditEventsReferenceValue(CreditEvents arg0)`

#### Getter Methods

- `List getLevel()`
- `ReferenceWithMetaCreditEventsBuilder getCreditEventsReference()`
- `PriceScheduleBuilder getOrCreateLevel(int arg0)`
- `CreditEventsBuilder getOrCreateCreditEvents()`
- `ReferenceWithMetaCreditEventsBuilder getOrCreateCreditEventsReference()`
- `CreditEventsBuilder getCreditEvents()`

#### Adder Methods

- `TriggerBuilder addLevel(List arg0)`
- `TriggerBuilder addLevel(PriceSchedule arg0, int arg1)`
- `TriggerBuilder addLevel(PriceSchedule arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TriggerBuilder prune()`

