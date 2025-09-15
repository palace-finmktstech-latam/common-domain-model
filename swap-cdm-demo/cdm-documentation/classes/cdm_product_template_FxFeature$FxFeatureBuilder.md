# FxFeatureBuilder

**Full Name:** `cdm.product.template.FxFeature$FxFeatureBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.FxFeature`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FxFeatureBuilder setComposite(Composite arg0)`
- `FxFeatureBuilder setCrossCurrency(Composite arg0)`
- `FxFeatureBuilder setReferenceCurrency(FieldWithMetaString arg0)`
- `FxFeatureBuilder setReferenceCurrencyValue(String arg0)`
- `FxFeatureBuilder setQuanto(Quanto arg0)`

#### Getter Methods

- `CompositeBuilder getOrCreateComposite()`
- `CompositeBuilder getComposite()`
- `QuantoBuilder getOrCreateQuanto()`
- `FieldWithMetaStringBuilder getReferenceCurrency()`
- `CompositeBuilder getCrossCurrency()`
- `CompositeBuilder getOrCreateCrossCurrency()`
- `QuantoBuilder getQuanto()`
- `FieldWithMetaStringBuilder getOrCreateReferenceCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FxFeatureBuilder prune()`

