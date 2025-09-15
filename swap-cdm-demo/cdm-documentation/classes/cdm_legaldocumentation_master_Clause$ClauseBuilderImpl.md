# ClauseBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.Clause$ClauseBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.Clause$ClauseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `String` |  |
| terms | `String` |  |
| subcomponents | `java.util.List<cdm.legaldocumentation.master.Clause$ClauseBuilder>` |  |

### Methods

#### Builder Methods

- `Clause build()`

#### Setter Methods

- `ClauseBuilder setIdentifier(String arg0)`
- `ClauseBuilder setTerms(String arg0)`
- `ClauseBuilder setSubcomponents(List arg0)`

#### Getter Methods

- `String getTerms()`
- `List getSubcomponents()`
- `ClauseBuilder getOrCreateSubcomponents(int arg0)`
- `String getIdentifier()`

#### Adder Methods

- `ClauseBuilder addSubcomponents(List arg0)`
- `ClauseBuilder addSubcomponents(Clause arg0)`
- `ClauseBuilder addSubcomponents(Clause arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ClauseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ClauseBuilder toBuilder()`
- `ClauseBuilder prune()`

