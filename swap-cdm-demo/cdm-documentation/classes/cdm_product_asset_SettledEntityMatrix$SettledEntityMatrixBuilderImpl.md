# SettledEntityMatrixBuilderImpl

**Full Name:** `cdm.product.asset.SettledEntityMatrix$SettledEntityMatrixBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.SettledEntityMatrix$SettledEntityMatrixBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| matrixSource | `FieldWithMetaSettledEntityMatrixSourceEnumBuilder` |  |
| publicationDate | `Date` |  |

### Methods

#### Builder Methods

- `SettledEntityMatrix build()`

#### Setter Methods

- `SettledEntityMatrixBuilder setMatrixSource(FieldWithMetaSettledEntityMatrixSourceEnum arg0)`
- `SettledEntityMatrixBuilder setMatrixSourceValue(SettledEntityMatrixSourceEnum arg0)`
- `SettledEntityMatrixBuilder setPublicationDate(Date arg0)`

#### Getter Methods

- `FieldWithMetaSettledEntityMatrixSourceEnumBuilder getMatrixSource()`
- `FieldWithMetaSettledEntityMatrixSourceEnumBuilder getOrCreateMatrixSource()`
- `Date getPublicationDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SettledEntityMatrixBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SettledEntityMatrixBuilder toBuilder()`
- `SettledEntityMatrixBuilder prune()`

