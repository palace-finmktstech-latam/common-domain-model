# TradeImpl

**Full Name:** `cdm.event.common.Trade$TradeImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.template.TradableProduct$TradableProductImpl`

### Implemented Interfaces

- `cdm.event.common.Trade`

### Methods

#### Builder Methods

- `Trade build()`

#### Setter Methods

- `void setBuilderFields(TradeBuilder arg0)`

#### Getter Methods

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TradeBuilder toBuilder()`

