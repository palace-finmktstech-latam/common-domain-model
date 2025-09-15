# BusinessEventBuilder

**Full Name:** `cdm.event.common.BusinessEvent$BusinessEventBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.BusinessEvent`
- `cdm.event.workflow.EventInstruction$EventInstructionBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `BusinessEventBuilder setIntent(EventIntentEnum arg0)`
- `BusinessEventBuilder setEffectiveDate(Date arg0)`
- `BusinessEventBuilder setEventDate(Date arg0)`
- `BusinessEventBuilder setCorporateActionIntent(CorporateActionTypeEnum arg0)`
- `BusinessEventBuilder setEventQualifier(String arg0)`
- `BusinessEventBuilder setPackageInformation(IdentifiedList arg0)`
- `BusinessEventBuilder setInstruction(List arg0)`
- `BusinessEventBuilder setAfter(List arg0)`
- `BusinessEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `TradeStateBuilder getOrCreateAfter(int arg0)`
- `List getAfter()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `BusinessEventBuilder addAfter(List arg0)`
- `BusinessEventBuilder addAfter(TradeState arg0, int arg1)`
- `BusinessEventBuilder addAfter(TradeState arg0)`
- `BusinessEventBuilder addInstruction(List arg0)`
- `BusinessEventBuilder addInstruction(Instruction arg0, int arg1)`
- `BusinessEventBuilder addInstruction(Instruction arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BusinessEventBuilder prune()`

