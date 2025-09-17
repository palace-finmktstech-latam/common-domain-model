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
- `FieldWithMetaDate getTradeDate()`
- `List getTradeIdentifier()`
- `FieldWithMetaTimeZone getTradeTime()`
- `List getPartyRole()`
- `ExecutionDetails getExecutionDetails()`
- `ContractDetails getContractDetails()`
- `Date getClearedDate()`
- `Collateral getCollateral()`
- `MetaFields getMeta()`
- `List getParty()`
- `List getAccount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `TradeBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

