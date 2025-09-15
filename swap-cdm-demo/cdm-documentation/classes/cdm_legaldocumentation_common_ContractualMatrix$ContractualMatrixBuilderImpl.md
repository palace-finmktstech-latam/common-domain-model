# ContractualMatrixBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.ContractualMatrix$ContractualMatrixBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.ContractualMatrix$ContractualMatrixBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| matrixType | `FieldWithMetaMatrixTypeEnumBuilder` |  |
| matrixTerm | `FieldWithMetaMatrixTermEnumBuilder` |  |

### Methods

#### Builder Methods

- `ContractualMatrix build()`

#### Setter Methods

- `ContractualMatrixBuilder setMatrixTerm(FieldWithMetaMatrixTermEnum arg0)`
- `ContractualMatrixBuilder setMatrixType(FieldWithMetaMatrixTypeEnum arg0)`
- `ContractualMatrixBuilder setMatrixTermValue(MatrixTermEnum arg0)`
- `ContractualMatrixBuilder setMatrixTypeValue(MatrixTypeEnum arg0)`

#### Getter Methods

- `FieldWithMetaMatrixTermEnumBuilder getOrCreateMatrixTerm()`
- `FieldWithMetaMatrixTermEnumBuilder getMatrixTerm()`
- `FieldWithMetaMatrixTypeEnumBuilder getOrCreateMatrixType()`
- `FieldWithMetaMatrixTypeEnumBuilder getMatrixType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ContractualMatrixBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ContractualMatrixBuilder toBuilder()`
- `ContractualMatrixBuilder prune()`

