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

- `SettledEntityMatrixBuilder setPublicationDate(Date arg0)`
- `SettledEntityMatrixBuilder setMatrixSource(FieldWithMetaSettledEntityMatrixSourceEnum arg0)`
- `SettledEntityMatrixBuilder setMatrixSourceValue(SettledEntityMatrixSourceEnum arg0)`

#### Getter Methods

- `Date getPublicationDate()`
- `FieldWithMetaSettledEntityMatrixSourceEnumBuilder getMatrixSource()`
- `FieldWithMetaSettledEntityMatrixSourceEnumBuilder getOrCreateMatrixSource()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SettledEntityMatrixBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `SettledEntityMatrixBuilder prune()`
- `SettledEntityMatrixBuilder toBuilder()`
- `boolean hasData()`

