# Create_PartyChange

**Full Name:** `cdm.event.common.functions.Create_PartyChange`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| emptyTransferHistory | `EmptyTransferHistory` |  |
| extractCounterpartyByRole | `ExtractCounterpartyByRole` |  |
| replaceParty | `ReplaceParty` |  |

### Methods

#### Other Methods

- `TradeState evaluate(Counterparty arg0, AncillaryParty arg1, PartyRole arg2, List arg3, TradeState arg4)`
- `TradeStateBuilder doEvaluate(Counterparty arg0, AncillaryParty arg1, PartyRole arg2, List arg3, TradeState arg4)`
- `MapperS counterparty2(Counterparty arg0, AncillaryParty arg1, PartyRole arg2, List arg3, TradeState arg4)`
- `MapperS partyToRemove(Counterparty arg0, AncillaryParty arg1, PartyRole arg2, List arg3, TradeState arg4)`
- `MapperS counterparty1(Counterparty arg0, AncillaryParty arg1, PartyRole arg2, List arg3, TradeState arg4)`

### Annotations

- **ImplementedBy**

