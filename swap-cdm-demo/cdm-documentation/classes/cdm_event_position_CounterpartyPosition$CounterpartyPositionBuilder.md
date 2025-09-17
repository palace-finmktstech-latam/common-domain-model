# CounterpartyPositionBuilder

**Full Name:** `cdm.event.position.CounterpartyPosition$CounterpartyPositionBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.CounterpartyPosition`
- `cdm.event.position.ContractBase$ContractBaseBuilder`

### Methods

#### Setter Methods

- `CounterpartyPositionBuilder setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)`
- `CounterpartyPositionBuilder setCollateral(ReferenceWithMetaCollateral arg0)`
- `CounterpartyPositionBuilder setTradeReference(List arg0)`
- `CounterpartyPositionBuilder setTradeReferenceValue(List arg0)`
- `CounterpartyPositionBuilder setPositionIdentifier(List arg0)`
- `CounterpartyPositionBuilder setContractDetailsValue(ContractDetails arg0)`
- `CounterpartyPositionBuilder setExecutionDetailsValue(ExecutionDetails arg0)`
- `CounterpartyPositionBuilder setCollateralValue(Collateral arg0)`
- `CounterpartyPositionBuilder setOpenDateTime(LocalDateTime arg0)`
- `CounterpartyPositionBuilder setPositionBase(TradableProduct arg0)`
- `CounterpartyPositionBuilder setParty(List arg0)`
- `CounterpartyPositionBuilder setContractDetails(ReferenceWithMetaContractDetails arg0)`
- `CounterpartyPositionBuilder setPartyRole(List arg0)`

#### Getter Methods

- `List getPartyRole()`
- `List getTradeReference()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeReference(int arg0)`
- `TradableProductBuilder getPositionBase()`
- `List getPositionIdentifier()`
- `List getParty()`
- `TradableProductBuilder getOrCreatePositionBase()`
- `PartyBuilder getOrCreateParty(int arg0)`
- `PositionIdentifierBuilder getOrCreatePositionIdentifier(int arg0)`
- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`

#### Adder Methods

- `CounterpartyPositionBuilder addPartyRole(PartyRole arg0)`
- `CounterpartyPositionBuilder addPartyRole(PartyRole arg0, int arg1)`
- `CounterpartyPositionBuilder addPartyRole(List arg0)`
- `CounterpartyPositionBuilder addParty(Party arg0, int arg1)`
- `CounterpartyPositionBuilder addParty(List arg0)`
- `CounterpartyPositionBuilder addParty(Party arg0)`
- `CounterpartyPositionBuilder addPositionIdentifier(PositionIdentifier arg0, int arg1)`
- `CounterpartyPositionBuilder addPositionIdentifier(PositionIdentifier arg0)`
- `CounterpartyPositionBuilder addPositionIdentifier(List arg0)`
- `CounterpartyPositionBuilder addTradeReferenceValue(TradeState arg0, int arg1)`
- `CounterpartyPositionBuilder addTradeReferenceValue(List arg0)`
- `CounterpartyPositionBuilder addTradeReferenceValue(TradeState arg0)`
- `CounterpartyPositionBuilder addTradeReference(ReferenceWithMetaTradeState arg0, int arg1)`
- `CounterpartyPositionBuilder addTradeReference(ReferenceWithMetaTradeState arg0)`
- `CounterpartyPositionBuilder addTradeReference(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CounterpartyPositionBuilder prune()`

