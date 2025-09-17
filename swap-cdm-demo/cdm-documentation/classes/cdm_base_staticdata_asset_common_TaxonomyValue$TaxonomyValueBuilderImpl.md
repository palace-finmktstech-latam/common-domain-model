# TaxonomyValueBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.TaxonomyValue$TaxonomyValueBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.TaxonomyValue$TaxonomyValueBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| name | `FieldWithMetaStringBuilder` |  |
| classification | `java.util.List<cdm.base.staticdata.asset.common.TaxonomyClassification$TaxonomyClassificationBuilder>` |  |

### Methods

#### Builder Methods

- `TaxonomyValue build()`

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
- `TaxonomyValueBuilder addClassification(List arg0)`
- `TaxonomyValueBuilder addClassification(TaxonomyClassification arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TaxonomyValueBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TaxonomyValueBuilder prune()`
- `TaxonomyValueBuilder toBuilder()`
- `boolean hasData()`

