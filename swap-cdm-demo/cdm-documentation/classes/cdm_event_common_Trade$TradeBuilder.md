# TradeBuilder

**Full Name:** `cdm.event.common.Trade$TradeBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.Trade`
- `cdm.product.template.TradableProduct$TradableProductBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `TradeBuilder setExecutionDetails(ExecutionDetails arg0)`
- `TradeBuilder setTradeDateValue(Date arg0)`
- `TradeBuilder setCounterparty(List arg0)`
- `TradeBuilder setCollateral(Collateral arg0)`
- `TradeBuilder setTradeIdentifier(List arg0)`
- `TradeBuilder setAncillaryParty(List arg0)`
- `TradeBuilder setTradeDate(FieldWithMetaDate arg0)`
- `TradeBuilder setTradeTime(FieldWithMetaTimeZone arg0)`
- `TradeBuilder setTradeTimeValue(TimeZone arg0)`
- `TradeBuilder setPartyRole(List arg0)`
- `TradeBuilder setAdjustment(NotionalAdjustmentEnum arg0)`
- `TradeBuilder setTradeLot(List arg0)`
- `TradeBuilder setAccount(List arg0)`
- `TradeBuilder setContractDetails(ContractDetails arg0)`
- `TradeBuilder setClearedDate(Date arg0)`
- `TradeBuilder setProduct(NonTransferableProduct arg0)`
- `TradeBuilder setParty(List arg0)`
- `TradeBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `TradeIdentifierBuilder getOrCreateTradeIdentifier(int arg0)`
- `FieldWithMetaTimeZoneBuilder getOrCreateTradeTime()`
- `CollateralBuilder getOrCreateCollateral()`
- `FieldWithMetaDateBuilder getOrCreateTradeDate()`
- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AccountBuilder getOrCreateAccount(int arg0)`
- `ContractDetailsBuilder getOrCreateContractDetails()`
- `List getTradeIdentifier()`
- `List getPartyRole()`
- `FieldWithMetaTimeZoneBuilder getTradeTime()`
- `ContractDetailsBuilder getContractDetails()`
- `FieldWithMetaDateBuilder getTradeDate()`
- `CollateralBuilder getCollateral()`
- `ExecutionDetailsBuilder getExecutionDetails()`
- `List getAccount()`
- `List getParty()`
- `ExecutionDetailsBuilder getOrCreateExecutionDetails()`
- `PartyBuilder getOrCreateParty(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `TradeBuilder addParty(Party arg0)`
- `TradeBuilder addParty(List arg0)`
- `TradeBuilder addParty(Party arg0, int arg1)`
- `TradeBuilder addAncillaryParty(AncillaryParty arg0)`
- `TradeBuilder addAncillaryParty(AncillaryParty arg0, int arg1)`
- `TradeBuilder addAncillaryParty(List arg0)`
- `TradeBuilder addTradeIdentifier(TradeIdentifier arg0, int arg1)`
- `TradeBuilder addTradeIdentifier(TradeIdentifier arg0)`
- `TradeBuilder addTradeIdentifier(List arg0)`
- `TradeBuilder addCounterparty(Counterparty arg0, int arg1)`
- `TradeBuilder addCounterparty(Counterparty arg0)`
- `TradeBuilder addCounterparty(List arg0)`
- `TradeBuilder addTradeLot(TradeLot arg0)`
- `TradeBuilder addTradeLot(List arg0)`
- `TradeBuilder addTradeLot(TradeLot arg0, int arg1)`
- `TradeBuilder addPartyRole(PartyRole arg0)`
- `TradeBuilder addPartyRole(List arg0)`
- `TradeBuilder addPartyRole(PartyRole arg0, int arg1)`
- `TradeBuilder addAccount(Account arg0)`
- `TradeBuilder addAccount(List arg0)`
- `TradeBuilder addAccount(Account arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TradeBuilder prune()`

