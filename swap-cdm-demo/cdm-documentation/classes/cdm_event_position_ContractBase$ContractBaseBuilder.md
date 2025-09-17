# ContractBaseBuilder

**Full Name:** `cdm.event.position.ContractBase$ContractBaseBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.ContractBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ContractBaseBuilder prune()`

