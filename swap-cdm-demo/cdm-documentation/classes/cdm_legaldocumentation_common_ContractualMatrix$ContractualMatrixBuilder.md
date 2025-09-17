# ContractualMatrixBuilder

**Full Name:** `cdm.legaldocumentation.common.ContractualMatrix$ContractualMatrixBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.ContractualMatrix`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ContractualMatrixBuilder setMatrixTypeValue(MatrixTypeEnum arg0)`
- `ContractualMatrixBuilder setMatrixTermValue(MatrixTermEnum arg0)`
- `ContractualMatrixBuilder setMatrixTerm(FieldWithMetaMatrixTermEnum arg0)`
- `ContractualMatrixBuilder setMatrixType(FieldWithMetaMatrixTypeEnum arg0)`

#### Getter Methods

- `FieldWithMetaMatrixTermEnumBuilder getMatrixTerm()`
- `FieldWithMetaMatrixTypeEnumBuilder getOrCreateMatrixType()`
- `FieldWithMetaMatrixTermEnumBuilder getOrCreateMatrixTerm()`
- `FieldWithMetaMatrixTypeEnumBuilder getMatrixType()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ContractualMatrixBuilder prune()`

