# EventInstructionBuilder

**Full Name:** `cdm.event.workflow.EventInstruction$EventInstructionBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.EventInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `EventInstructionBuilder setEventDate(Date arg0)`
- `EventInstructionBuilder setIntent(EventIntentEnum arg0)`
- `EventInstructionBuilder setPackageInformation(IdentifiedList arg0)`
- `EventInstructionBuilder setCorporateActionIntent(CorporateActionTypeEnum arg0)`
- `EventInstructionBuilder setInstruction(List arg0)`
- `EventInstructionBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `IdentifiedListBuilder getOrCreatePackageInformation()`
- `IdentifiedListBuilder getPackageInformation()`
- `List getInstruction()`
- `InstructionBuilder getOrCreateInstruction(int arg0)`

#### Adder Methods

- `EventInstructionBuilder addInstruction(Instruction arg0, int arg1)`
- `EventInstructionBuilder addInstruction(List arg0)`
- `EventInstructionBuilder addInstruction(Instruction arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EventInstructionBuilder prune()`

