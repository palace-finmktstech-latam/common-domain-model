# Qualify_Reprice

**Full Name:** `cdm.event.common.functions.Qualify_Reprice`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`
- `com.rosetta.model.lib.functions.IQualifyFunctionExtension`

### Fields

| Name | Type | Description |
|------|------|-------------|
| extractAfterTrade | `ExtractAfterTrade` |  |
| extractBeforeEconomicTerms | `ExtractBeforeEconomicTerms` |  |
| extractBeforeTrade | `ExtractBeforeTrade` |  |
| extractOpenEconomicTerms | `ExtractOpenEconomicTerms` |  |
| extractTradeCollateralPrice | `ExtractTradeCollateralPrice` |  |
| extractTradeCollateralQuantity | `ExtractTradeCollateralQuantity` |  |
| extractTradePurchasePrice | `ExtractTradePurchasePrice` |  |
| filterClosedTradeStates | `FilterClosedTradeStates` |  |
| filterOpenTradeStates | `FilterOpenTradeStates` |  |

### Methods

#### Getter Methods

- `String getNamePrefix()`

#### Other Methods

- `Boolean evaluate(BusinessEvent arg0)`
- `MapperC beforeTradeCollateralQuantity(BusinessEvent arg0)`
- `MapperC afterTradeCollateralQuantity(BusinessEvent arg0)`
- `Boolean doEvaluate(BusinessEvent arg0)`
- `MapperC afterTradePurchasePrice(BusinessEvent arg0)`
- `MapperC beforeTradeCollateralPrice(BusinessEvent arg0)`
- `MapperC afterTradeCollateralPrice(BusinessEvent arg0)`
- `MapperC beforeTradePurchasePrice(BusinessEvent arg0)`
- `MapperS openEconomicTerms(BusinessEvent arg0)`
- `MapperS beforeEconomicterms(BusinessEvent arg0)`
- `MapperS beforeTrade(BusinessEvent arg0)`
- `MapperS afterTrade(BusinessEvent arg0)`
- `MapperC openTrades(BusinessEvent arg0)`
- `MapperC closedTradeState(BusinessEvent arg0)`

### Annotations

- **ImplementedBy**

