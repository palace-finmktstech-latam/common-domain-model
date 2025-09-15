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
- `List getPartyRoles()`
- `List getParties()`
- `Identifier getLotIdentifier()`
- `List getPriceQuantity()`
- `List getCounterparty()`
- `List getTradeIdentifier()`
- `List getAncillaryParty()`
- `FieldWithMetaTimeZone getTradeTime()`
- `FieldWithMetaDate getTradeDate()`
- `Collateral getCollateral()`
- `ExecutionDetails getExecutionDetails()`
- `NonTransferableProduct getProduct()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExecutionInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

