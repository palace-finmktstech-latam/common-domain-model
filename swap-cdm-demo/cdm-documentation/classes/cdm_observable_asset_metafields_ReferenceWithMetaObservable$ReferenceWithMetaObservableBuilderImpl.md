# ReferenceWithMetaObservableBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaObservable$ReferenceWithMetaObservableBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaObservable$ReferenceWithMetaObservableBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `ObservableBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaObservable build()`

#### Setter Methods

- `ReferenceWithMetaObservableBuilder setValue(Observable arg0)`
- `ReferenceWithMetaObservableBuilder setReference(Reference arg0)`
- `ReferenceWithMetaObservableBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaObservableBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ObservableBuilder getValue()`
- `ObservableBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaObservableBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaObservableBuilder prune()`
- `ReferenceWithMetaObservableBuilder toBuilder()`
- `boolean hasData()`

