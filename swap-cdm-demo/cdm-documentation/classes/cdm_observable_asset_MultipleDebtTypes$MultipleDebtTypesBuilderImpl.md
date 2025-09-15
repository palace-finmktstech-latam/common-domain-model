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

- `MultipleDebtTypesBuilder setDebtType(List arg0)`
- `MultipleDebtTypesBuilder setCondition(QuantifierEnum arg0)`
- `MultipleDebtTypesBuilder setDebtTypeValue(List arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateDebtType(int arg0)`
- `List getDebtType()`
- `QuantifierEnum getCondition()`

#### Adder Methods

- `MultipleDebtTypesBuilder addDebtTypeValue(List arg0)`
- `MultipleDebtTypesBuilder addDebtTypeValue(String arg0, int arg1)`
- `MultipleDebtTypesBuilder addDebtTypeValue(String arg0)`
- `MultipleDebtTypesBuilder addDebtType(FieldWithMetaString arg0)`
- `MultipleDebtTypesBuilder addDebtType(List arg0)`
- `MultipleDebtTypesBuilder addDebtType(FieldWithMetaString arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MultipleDebtTypesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MultipleDebtTypesBuilder toBuilder()`
- `MultipleDebtTypesBuilder prune()`

