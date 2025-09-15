# EventInstructionBuilderImpl

**Full Name:** `cdm.event.workflow.EventInstruction$EventInstructionBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.EventInstruction$EventInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| intent | `EventIntentEnum` |  |
| corporateActionIntent | `CorporateActionTypeEnum` |  |
| eventDate | `Date` |  |
| effectiveDate | `Date` |  |
| packageInformation | `IdentifiedListBuilder` |  |
| instruction | `java.util.List<cdm.event.common.Instruction$InstructionBuilder>` |  |

### Methods

#### Builder Methods

- `EventInstruction build()`

#### Setter Methods

- `EventInstructionBuilder setIntent(EventIntentEnum arg0)`
- `EventInstructionBuilder setEffectiveDate(Date arg0)`
- `EventInstructionBuilder setEventDate(Date arg0)`
- `EventInstructionBuilder setCorporateActionIntent(CorporateActionTypeEnum arg0)`
- `EventInstructionBuilder setPackageInformation(IdentifiedList arg0)`
- `EventInstructionBuilder setInstruction(List arg0)`

#### Getter Methods

- `Date getEffectiveDate()`
- `List getInstruction()`
- `CorporateActionTypeEnum getCorporateActionIntent()`
- `IdentifiedListBuilder getPackageInformation()`
- `Date getEventDate()`
- `IdentifiedListBuilder getOrCreatePackageInformation()`
- `InstructionBuilder getOrCreateInstruction(int arg0)`
- `EventIntentEnum getIntent()`

#### Adder Methods

- `EventInstructionBuilder addInstruction(Instruction arg0, int arg1)`
- `EventInstructionBuilder addInstruction(List arg0)`
- `EventInstructionBuilder addInstruction(Instruction arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EventInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EventInstructionBuilder toBuilder()`
- `EventInstructionBuilder prune()`

