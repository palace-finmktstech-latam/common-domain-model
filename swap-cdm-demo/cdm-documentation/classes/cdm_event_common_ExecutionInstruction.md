# ExecutionInstruction

**Full Name:** `cdm.event.common.ExecutionInstruction`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ExecutionInstruction build()`

#### Getter Methods

- `Class getType()`
- `FieldWithMetaDate getTradeDate()`
- `List getTradeIdentifier()`
- `FieldWithMetaTimeZone getTradeTime()`
- `ExecutionDetails getExecutionDetails()`
- `Collateral getCollateral()`
- `List getCounterparty()`
- `List getAncillaryParty()`
- `List getPriceQuantity()`
- `Identifier getLotIdentifier()`
- `List getPartyRoles()`
- `NonTransferableProduct getProduct()`
- `List getParties()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExecutionInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

