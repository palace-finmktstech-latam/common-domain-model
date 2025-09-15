# CounterpartyPositionBuilderImpl

**Full Name:** `cdm.event.position.CounterpartyPosition$CounterpartyPositionBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.position.ContractBase$ContractBaseBuilderImpl`

### Implemented Interfaces

- `cdm.event.position.CounterpartyPosition$CounterpartyPositionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| positionIdentifier | `java.util.List<cdm.event.common.PositionIdentifier$PositionIdentifierBuilder>` |  |
| openDateTime | `LocalDateTime` |  |
| tradeReference | `java.util.List<cdm.event.common.metafields.ReferenceWithMetaTradeState$ReferenceWithMetaTradeStateBuilder>` |  |
| party | `java.util.List<cdm.base.staticdata.party.Party$PartyBuilder>` |  |
| partyRole | `java.util.List<cdm.base.staticdata.party.PartyRole$PartyRoleBuilder>` |  |
| positionBase | `TradableProductBuilder` |  |

### Methods

#### Builder Methods

- `CounterpartyPosition build()`

#### Setter Methods

- `CounterpartyPositionBuilder setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)`
- `CounterpartyPositionBuilder setCollateral(ReferenceWithMetaCollateral arg0)`
- `CounterpartyPositionBuilder setPartyRole(List arg0)`
- `CounterpartyPositionBuilder setOpenDateTime(LocalDateTime arg0)`
- `CounterpartyPositionBuilder setPositionIdentifier(List arg0)`
- `CounterpartyPositionBuilder setCollateralValue(Collateral arg0)`
- `CounterpartyPositionBuilder setContractDetailsValue(ContractDetails arg0)`
- `CounterpartyPositionBuilder setExecutionDetailsValue(ExecutionDetails arg0)`
- `CounterpartyPositionBuilder setPositionBase(TradableProduct arg0)`
- `CounterpartyPositionBuilder setContractDetails(ReferenceWithMetaContractDetails arg0)`
- `CounterpartyPositionBuilder setTradeReference(List arg0)`
- `CounterpartyPositionBuilder setTradeReferenceValue(List arg0)`
- `CounterpartyPositionBuilder setParty(List arg0)`

#### Getter Methods

- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`
- `TradableProductBuilder getOrCreatePositionBase()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeReference(int arg0)`
- `LocalDateTime getOpenDateTime()`
- `TradableProductBuilder getPositionBase()`
- `List getPositionIdentifier()`
- `List getTradeReference()`
- `List getPartyRole()`
- `List getParty()`
- `PositionIdentifierBuilder getOrCreatePositionIdentifier(int arg0)`
- `PartyBuilder getOrCreateParty(int arg0)`

#### Adder Methods

- `CounterpartyPositionBuilder addParty(Party arg0, int arg1)`
- `CounterpartyPositionBuilder addParty(Party arg0)`
- `CounterpartyPositionBuilder addParty(List arg0)`
- `CounterpartyPositionBuilder addPositionIdentifier(List arg0)`
- `CounterpartyPositionBuilder addPositionIdentifier(PositionIdentifier arg0)`
- `CounterpartyPositionBuilder addPositionIdentifier(PositionIdentifier arg0, int arg1)`
- `CounterpartyPositionBuilder addPartyRole(PartyRole arg0)`
- `CounterpartyPositionBuilder addPartyRole(PartyRole arg0, int arg1)`
- `CounterpartyPositionBuilder addPartyRole(List arg0)`
- `CounterpartyPositionBuilder addTradeReference(ReferenceWithMetaTradeState arg0)`
- `CounterpartyPositionBuilder addTradeReference(ReferenceWithMetaTradeState arg0, int arg1)`
- `CounterpartyPositionBuilder addTradeReference(List arg0)`
- `CounterpartyPositionBuilder addTradeReferenceValue(List arg0)`
- `CounterpartyPositionBuilder addTradeReferenceValue(TradeState arg0, int arg1)`
- `CounterpartyPositionBuilder addTradeReferenceValue(TradeState arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CounterpartyPositionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CounterpartyPositionBuilder toBuilder()`
- `CounterpartyPositionBuilder prune()`

