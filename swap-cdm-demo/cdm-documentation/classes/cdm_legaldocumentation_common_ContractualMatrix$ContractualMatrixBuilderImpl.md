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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ContractualMatrixBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ContractualMatrixBuilder prune()`
- `ContractualMatrixBuilder toBuilder()`
- `boolean hasData()`

