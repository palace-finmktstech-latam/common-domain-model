# ClearingInstruction

**Full Name:** `cdm.event.common.ClearingInstruction`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ClearingInstruction build()`

#### Getter Methods

- `Class getType()`
- `TradeState getAlphaContract()`
- `Party getClearingParty()`
- `Party getClearerParty1()`
- `Party getClearerParty2()`
- `Boolean getIsOpenOffer()`
- `Party getParty1()`
- `Party getParty2()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ClearingInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

