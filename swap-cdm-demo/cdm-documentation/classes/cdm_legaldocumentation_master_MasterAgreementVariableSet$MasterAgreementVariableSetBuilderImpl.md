# MasterAgreementVariableSetBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.MasterAgreementVariableSet$MasterAgreementVariableSetBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.MasterAgreementVariableSet$MasterAgreementVariableSetBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| variableSet | `java.util.List<cdm.legaldocumentation.master.MasterAgreementVariableSet$MasterAgreementVariableSetBuilder>` |  |
| name | `String` |  |
| value | `String` |  |

### Methods

#### Builder Methods

- `MasterAgreementVariableSet build()`

#### Setter Methods

- `MasterAgreementVariableSetBuilder setName(String arg0)`
- `MasterAgreementVariableSetBuilder setValue(String arg0)`
- `MasterAgreementVariableSetBuilder setVariableSet(List arg0)`

#### Getter Methods

- `String getName()`
- `String getValue()`
- `MasterAgreementVariableSetBuilder getOrCreateVariableSet(int arg0)`
- `List getVariableSet()`

#### Adder Methods

- `MasterAgreementVariableSetBuilder addVariableSet(List arg0)`
- `MasterAgreementVariableSetBuilder addVariableSet(MasterAgreementVariableSet arg0)`
- `MasterAgreementVariableSetBuilder addVariableSet(MasterAgreementVariableSet arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MasterAgreementVariableSetBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MasterAgreementVariableSetBuilder toBuilder()`
- `MasterAgreementVariableSetBuilder prune()`

