# TaxonomyValueBuilder

**Full Name:** `cdm.base.staticdata.asset.common.TaxonomyValue$TaxonomyValueBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.TaxonomyValue`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TaxonomyValueBuilder setName(FieldWithMetaString arg0)`
- `TaxonomyValueBuilder setNameValue(String arg0)`
- `TaxonomyValueBuilder setClassification(List arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getName()`
- `List getClassification()`
- `FieldWithMetaStringBuilder getOrCreateName()`
- `TaxonomyClassificationBuilder getOrCreateClassification(int arg0)`

#### Adder Methods

- `TaxonomyValueBuilder addClassification(TaxonomyClassification arg0, int arg1)`
- `TaxonomyValueBuilder addClassification(TaxonomyClassification arg0)`
- `TaxonomyValueBuilder addClassification(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TaxonomyValueBuilder prune()`

