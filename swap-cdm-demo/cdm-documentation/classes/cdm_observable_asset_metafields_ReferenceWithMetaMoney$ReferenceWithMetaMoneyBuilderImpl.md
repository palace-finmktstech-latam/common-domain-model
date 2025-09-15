# ReferenceWithMetaMoneyBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaMoney$ReferenceWithMetaMoneyBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaMoney$ReferenceWithMetaMoneyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `MoneyBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaMoney build()`

#### Setter Methods

- `ReferenceWithMetaMoneyBuilder setValue(Money arg0)`
- `ReferenceWithMetaMoneyBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaMoneyBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaMoneyBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `MoneyBuilder getValue()`
- `MoneyBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaMoneyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaMoneyBuilder toBuilder()`
- `ReferenceWithMetaMoneyBuilder prune()`

