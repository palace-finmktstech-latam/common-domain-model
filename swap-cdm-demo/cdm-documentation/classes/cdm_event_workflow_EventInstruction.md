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
- `IdentifiedList getPackageInformation()`
- `CorporateActionTypeEnum getCorporateActionIntent()`
- `List getInstruction()`
- `Date getEventDate()`
- `EventIntentEnum getIntent()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `EventInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

