# CounterpartyPositionBusinessEvent

**Full Name:** `cdm.event.common.CounterpartyPositionBusinessEvent`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `CounterpartyPositionBusinessEvent build()`

#### Getter Methods

- `Class getType()`
- `Date getEffectiveDate()`
- `CorporateActionTypeEnum getCorporateActionIntent()`
- `IdentifiedList getPackageInformation()`
- `Date getEventDate()`
- `List getAfter()`
- `PositionEventIntentEnum getIntent()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CounterpartyPositionBusinessEventBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

