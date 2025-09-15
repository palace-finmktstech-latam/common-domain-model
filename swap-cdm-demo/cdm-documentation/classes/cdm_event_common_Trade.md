# Trade

**Full Name:** `cdm.event.common.Trade`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.TradableProduct`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `Trade build()`

#### Getter Methods

- `Class getType()`
- `Date getClearedDate()`
- `List getTradeIdentifier()`
- `List getPartyRole()`
- `FieldWithMetaTimeZone getTradeTime()`
- `ContractDetails getContractDetails()`
- `FieldWithMetaDate getTradeDate()`
- `Collateral getCollateral()`
- `ExecutionDetails getExecutionDetails()`
- `List getAccount()`
- `List getParty()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `TradeBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

