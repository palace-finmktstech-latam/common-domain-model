# ExecutionInstructionBuilderImpl

**Full Name:** `cdm.event.common.ExecutionInstruction$ExecutionInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ExecutionInstruction$ExecutionInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| product | `NonTransferableProductBuilder` |  |
| priceQuantity | `java.util.List<cdm.observable.asset.PriceQuantity$PriceQuantityBuilder>` |  |
| counterparty | `java.util.List<cdm.base.staticdata.party.Counterparty$CounterpartyBuilder>` |  |
| ancillaryParty | `java.util.List<cdm.base.staticdata.party.AncillaryParty$AncillaryPartyBuilder>` |  |
| parties | `java.util.List<cdm.base.staticdata.party.Party$PartyBuilder>` |  |
| partyRoles | `java.util.List<cdm.base.staticdata.party.PartyRole$PartyRoleBuilder>` |  |
| executionDetails | `ExecutionDetailsBuilder` |  |
| tradeDate | `FieldWithMetaDateBuilder` |  |
| tradeTime | `FieldWithMetaTimeZoneBuilder` |  |
| tradeIdentifier | `java.util.List<cdm.event.common.TradeIdentifier$TradeIdentifierBuilder>` |  |
| collateral | `CollateralBuilder` |  |
| lotIdentifier | `IdentifierBuilder` |  |

### Methods

#### Builder Methods

- `ExecutionInstruction build()`

#### Setter Methods

- `ExecutionInstructionBuilder setExecutionDetails(ExecutionDetails arg0)`
- `ExecutionInstructionBuilder setTradeDateValue(Date arg0)`
- `ExecutionInstructionBuilder setCounterparty(List arg0)`
- `ExecutionInstructionBuilder setCollateral(Collateral arg0)`
- `ExecutionInstructionBuilder setTradeIdentifier(List arg0)`
- `ExecutionInstructionBuilder setAncillaryParty(List arg0)`
- `ExecutionInstructionBuilder setPartyRoles(List arg0)`
- `ExecutionInstructionBuilder setTradeDate(FieldWithMetaDate arg0)`
- `ExecutionInstructionBuilder setTradeTime(FieldWithMetaTimeZone arg0)`
- `ExecutionInstructionBuilder setLotIdentifier(Identifier arg0)`
- `ExecutionInstructionBuilder setTradeTimeValue(TimeZone arg0)`
- `ExecutionInstructionBuilder setParties(List arg0)`
- `ExecutionInstructionBuilder setProduct(NonTransferableProduct arg0)`
- `ExecutionInstructionBuilder setPriceQuantity(List arg0)`

#### Getter Methods

- `PartyRoleBuilder getOrCreatePartyRoles(int arg0)`
- `PartyBuilder getOrCreateParties(int arg0)`
- `TradeIdentifierBuilder getOrCreateTradeIdentifier(int arg0)`
- `AncillaryPartyBuilder getOrCreateAncillaryParty(int arg0)`
- `FieldWithMetaTimeZoneBuilder getOrCreateTradeTime()`
- `CollateralBuilder getOrCreateCollateral()`
- `CounterpartyBuilder getOrCreateCounterparty(int arg0)`
- `FieldWithMetaDateBuilder getOrCreateTradeDate()`
- `List getPartyRoles()`
- `IdentifierBuilder getOrCreateLotIdentifier()`
- `List getParties()`
- `IdentifierBuilder getLotIdentifier()`
- `List getPriceQuantity()`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`
- `NonTransferableProductBuilder getOrCreateProduct()`
- `List getCounterparty()`
- `List getTradeIdentifier()`
- `List getAncillaryParty()`
- `FieldWithMetaTimeZoneBuilder getTradeTime()`
- `FieldWithMetaDateBuilder getTradeDate()`
- `CollateralBuilder getCollateral()`
- `ExecutionDetailsBuilder getExecutionDetails()`
- `NonTransferableProductBuilder getProduct()`
- `ExecutionDetailsBuilder getOrCreateExecutionDetails()`

#### Adder Methods

- `ExecutionInstructionBuilder addPartyRoles(PartyRole arg0, int arg1)`
- `ExecutionInstructionBuilder addPartyRoles(PartyRole arg0)`
- `ExecutionInstructionBuilder addPartyRoles(List arg0)`
- `ExecutionInstructionBuilder addAncillaryParty(AncillaryParty arg0)`
- `ExecutionInstructionBuilder addAncillaryParty(List arg0)`
- `ExecutionInstructionBuilder addAncillaryParty(AncillaryParty arg0, int arg1)`
- `ExecutionInstructionBuilder addTradeIdentifier(TradeIdentifier arg0)`
- `ExecutionInstructionBuilder addTradeIdentifier(TradeIdentifier arg0, int arg1)`
- `ExecutionInstructionBuilder addTradeIdentifier(List arg0)`
- `ExecutionInstructionBuilder addCounterparty(Counterparty arg0, int arg1)`
- `ExecutionInstructionBuilder addCounterparty(List arg0)`
- `ExecutionInstructionBuilder addCounterparty(Counterparty arg0)`
- `ExecutionInstructionBuilder addParties(Party arg0)`
- `ExecutionInstructionBuilder addParties(Party arg0, int arg1)`
- `ExecutionInstructionBuilder addParties(List arg0)`
- `ExecutionInstructionBuilder addPriceQuantity(PriceQuantity arg0)`
- `ExecutionInstructionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `ExecutionInstructionBuilder addPriceQuantity(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExecutionInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExecutionInstructionBuilder toBuilder()`
- `ExecutionInstructionBuilder prune()`

