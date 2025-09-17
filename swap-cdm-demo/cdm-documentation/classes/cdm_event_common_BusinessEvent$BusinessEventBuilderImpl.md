# BusinessEventBuilderImpl

**Full Name:** `cdm.event.common.BusinessEvent$BusinessEventBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.workflow.EventInstruction$EventInstructionBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.BusinessEvent$BusinessEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| eventQualifier | `String` |  |
| after | `java.util.List<cdm.event.common.TradeState$TradeStateBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `BusinessEvent build()`

#### Setter Methods

- `BusinessEventBuilder setEventDate(Date arg0)`
- `BusinessEventBuilder setIntent(EventIntentEnum arg0)`
- `BusinessEventBuilder setMeta(MetaFields arg0)`
- `BusinessEventBuilder setPackageInformation(IdentifiedList arg0)`
- `BusinessEventBuilder setCorporateActionIntent(CorporateActionTypeEnum arg0)`
- `BusinessEventBuilder setInstruction(List arg0)`
- `BusinessEventBuilder setEventQualifier(String arg0)`
- `BusinessEventBuilder setAfter(List arg0)`
- `BusinessEventBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `String getEventQualifier()`
- `MetaFieldsBuilder getMeta()`
- `List getAfter()`
- `TradeStateBuilder getOrCreateAfter(int arg0)`

#### Adder Methods

- `BusinessEventBuilder addInstruction(Instruction arg0)`
- `BusinessEventBuilder addInstruction(Instruction arg0, int arg1)`
- `BusinessEventBuilder addInstruction(List arg0)`
- `BusinessEventBuilder addAfter(TradeState arg0)`
- `BusinessEventBuilder addAfter(TradeState arg0, int arg1)`
- `BusinessEventBuilder addAfter(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BusinessEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BusinessEventBuilder prune()`
- `BusinessEventBuilder toBuilder()`
- `boolean hasData()`

