# EventInstruction

**Full Name:** `cdm.event.workflow.EventInstruction`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `EventInstruction build()`

#### Getter Methods

- `Class getType()`
- `Date getEffectiveDate()`
- `List getInstruction()`
- `CorporateActionTypeEnum getCorporateActionIntent()`
- `IdentifiedList getPackageInformation()`
- `Date getEventDate()`
- `EventIntentEnum getIntent()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `EventInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

