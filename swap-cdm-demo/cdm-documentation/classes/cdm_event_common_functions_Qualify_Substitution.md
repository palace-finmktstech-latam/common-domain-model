# Qualify_Substitution

**Full Name:** `cdm.event.common.functions.Qualify_Substitution`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`
- `com.rosetta.model.lib.functions.IQualifyFunctionExtension`

### Fields

| Name | Type | Description |
|------|------|-------------|
| extractBeforeEconomicTerms | `ExtractBeforeEconomicTerms` |  |
| extractOpenEconomicTerms | `ExtractOpenEconomicTerms` |  |

### Methods

#### Getter Methods

- `String getNamePrefix()`

#### Other Methods

- `Boolean evaluate(BusinessEvent arg0)`
- `Boolean doEvaluate(BusinessEvent arg0)`
- `MapperS openEconomicTerms(BusinessEvent arg0)`
- `MapperS beforeEconomicterms(BusinessEvent arg0)`

### Annotations

- **ImplementedBy**

