# BusinessEvent

**Full Name:** `cdm.event.common.BusinessEvent`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.EventInstruction`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `BusinessEvent build()`

#### Getter Methods

- `Class getType()`
- `String getEventQualifier()`
- `List getAfter()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `BusinessEventBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

