# FxFeatureBuilderImpl

**Full Name:** `cdm.product.template.FxFeature$FxFeatureBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.FxFeature$FxFeatureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| referenceCurrency | `FieldWithMetaStringBuilder` |  |
| composite | `CompositeBuilder` |  |
| quanto | `QuantoBuilder` |  |
| crossCurrency | `CompositeBuilder` |  |

### Methods

#### Builder Methods

- `FxFeature build()`

#### Setter Methods

- `FxFeatureBuilder setComposite(Composite arg0)`
- `FxFeatureBuilder setReferenceCurrency(FieldWithMetaString arg0)`
- `FxFeatureBuilder setReferenceCurrencyValue(String arg0)`
- `FxFeatureBuilder setCrossCurrency(Composite arg0)`
- `FxFeatureBuilder setQuanto(Quanto arg0)`

#### Getter Methods

- `CompositeBuilder getComposite()`
- `FieldWithMetaStringBuilder getReferenceCurrency()`
- `CompositeBuilder getCrossCurrency()`
- `QuantoBuilder getOrCreateQuanto()`
- `CompositeBuilder getOrCreateCrossCurrency()`
- `FieldWithMetaStringBuilder getOrCreateReferenceCurrency()`
- `CompositeBuilder getOrCreateComposite()`
- `QuantoBuilder getQuanto()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxFeatureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FxFeatureBuilder prune()`
- `FxFeatureBuilder toBuilder()`
- `boolean hasData()`

