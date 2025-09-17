# MultipleDebtTypesBuilderImpl

**Full Name:** `cdm.observable.asset.MultipleDebtTypes$MultipleDebtTypesBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.MultipleDebtTypes$MultipleDebtTypesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| condition | `QuantifierEnum` |  |
| debtType | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |

### Methods

#### Builder Methods

- `MultipleDebtTypes build()`

#### Setter Methods

- `MultipleDebtTypesBuilder setCondition(QuantifierEnum arg0)`
- `MultipleDebtTypesBuilder setDebtType(List arg0)`
- `MultipleDebtTypesBuilder setDebtTypeValue(List arg0)`

#### Getter Methods

- `List getDebtType()`
- `FieldWithMetaStringBuilder getOrCreateDebtType(int arg0)`
- `QuantifierEnum getCondition()`

#### Adder Methods

- `MultipleDebtTypesBuilder addDebtType(List arg0)`
- `MultipleDebtTypesBuilder addDebtType(FieldWithMetaString arg0)`
- `MultipleDebtTypesBuilder addDebtType(FieldWithMetaString arg0, int arg1)`
- `MultipleDebtTypesBuilder addDebtTypeValue(List arg0)`
- `MultipleDebtTypesBuilder addDebtTypeValue(String arg0, int arg1)`
- `MultipleDebtTypesBuilder addDebtTypeValue(String arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MultipleDebtTypesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MultipleDebtTypesBuilder prune()`
- `MultipleDebtTypesBuilder toBuilder()`
- `boolean hasData()`

