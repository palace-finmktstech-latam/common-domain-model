# MultipleDebtTypesBuilder

**Full Name:** `cdm.observable.asset.MultipleDebtTypes$MultipleDebtTypesBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.MultipleDebtTypes`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MultipleDebtTypesBuilder setDebtType(List arg0)`
- `MultipleDebtTypesBuilder setCondition(QuantifierEnum arg0)`
- `MultipleDebtTypesBuilder setDebtTypeValue(List arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateDebtType(int arg0)`
- `List getDebtType()`

#### Adder Methods

- `MultipleDebtTypesBuilder addDebtTypeValue(String arg0, int arg1)`
- `MultipleDebtTypesBuilder addDebtTypeValue(List arg0)`
- `MultipleDebtTypesBuilder addDebtTypeValue(String arg0)`
- `MultipleDebtTypesBuilder addDebtType(List arg0)`
- `MultipleDebtTypesBuilder addDebtType(FieldWithMetaString arg0)`
- `MultipleDebtTypesBuilder addDebtType(FieldWithMetaString arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MultipleDebtTypesBuilder prune()`

