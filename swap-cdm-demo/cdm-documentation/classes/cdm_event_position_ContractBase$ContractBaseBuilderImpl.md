# ContractBaseBuilderImpl

**Full Name:** `cdm.event.position.ContractBase$ContractBaseBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.ContractBase$ContractBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| contractDetails | `ReferenceWithMetaContractDetailsBuilder` |  |
| executionDetails | `ReferenceWithMetaExecutionDetailsBuilder` |  |
| collateral | `ReferenceWithMetaCollateralBuilder` |  |

### Methods

#### Builder Methods

- `ContractBase build()`

#### Setter Methods

- `ContractBaseBuilder setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)`
- `ContractBaseBuilder setCollateral(ReferenceWithMetaCollateral arg0)`
- `ContractBaseBuilder setContractDetailsValue(ContractDetails arg0)`
- `ContractBaseBuilder setExecutionDetailsValue(ExecutionDetails arg0)`
- `ContractBaseBuilder setCollateralValue(Collateral arg0)`
- `ContractBaseBuilder setContractDetails(ReferenceWithMetaContractDetails arg0)`

#### Getter Methods

- `ReferenceWithMetaExecutionDetailsBuilder getExecutionDetails()`
- `ReferenceWithMetaContractDetailsBuilder getContractDetails()`
- `ReferenceWithMetaCollateralBuilder getCollateral()`
- `ReferenceWithMetaCollateralBuilder getOrCreateCollateral()`
- `ReferenceWithMetaExecutionDetailsBuilder getOrCreateExecutionDetails()`
- `ReferenceWithMetaContractDetailsBuilder getOrCreateContractDetails()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ContractBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ContractBaseBuilder prune()`
- `ContractBaseBuilder toBuilder()`
- `boolean hasData()`

