# Qualify_OnDemandRateChange

**Full Name:** `cdm.event.common.functions.Qualify_OnDemandRateChange`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`
- `com.rosetta.model.lib.functions.IQualifyFunctionExtension`

### Fields

| Name | Type | Description |
|------|------|-------------|
| filterClosedTradeStates | `FilterClosedTradeStates` |  |
| filterOpenTradeStates | `FilterOpenTradeStates` |  |

### Methods

#### Getter Methods

- `String getNamePrefix()`

#### Other Methods

- `Boolean evaluate(BusinessEvent arg0)`
- `Boolean doEvaluate(BusinessEvent arg0)`
- `MapperS openEconomicTerms(BusinessEvent arg0)`
- `MapperS beforeTrade(BusinessEvent arg0)`
- `MapperS beforeEconomicterms(BusinessEvent arg0)`
- `MapperC closedTradeState(BusinessEvent arg0)`
- `MapperC beforePriceQuantityRateOnly(BusinessEvent arg0)`
- `MapperS beforeProduct(BusinessEvent arg0)`
- `MapperC beforePriceQuantityNoRate(BusinessEvent arg0)`
- `MapperC openPriceQuantityRateOnly(BusinessEvent arg0)`
- `MapperC openPriceQuantityNoRate(BusinessEvent arg0)`
- `MapperS openTrade(BusinessEvent arg0)`

### Annotations

- **ImplementedBy**

