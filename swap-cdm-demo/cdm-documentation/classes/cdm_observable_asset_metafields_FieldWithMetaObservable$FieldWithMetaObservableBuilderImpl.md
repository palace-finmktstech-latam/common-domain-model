# FieldWithMetaObservableBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.FieldWithMetaObservable$FieldWithMetaObservableBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.FieldWithMetaObservable$FieldWithMetaObservableBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `ObservableBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `FieldWithMetaObservable build()`

#### Setter Methods

- `FieldWithMetaObservableBuilder setValue(Observable arg0)`
- `FieldWithMetaObservableBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `ObservableBuilder getValue()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `ObservableBuilder getOrCreateValue()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FieldWithMetaObservableBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FieldWithMetaObservableBuilder prune()`
- `FieldWithMetaObservableBuilder toBuilder()`
- `boolean hasData()`

