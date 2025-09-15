# ClauseBuilder

**Full Name:** `cdm.legaldocumentation.master.Clause$ClauseBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.Clause`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ClauseBuilder setIdentifier(String arg0)`
- `ClauseBuilder setTerms(String arg0)`
- `ClauseBuilder setSubcomponents(List arg0)`

#### Getter Methods

- `List getSubcomponents()`
- `ClauseBuilder getOrCreateSubcomponents(int arg0)`

#### Adder Methods

- `ClauseBuilder addSubcomponents(List arg0)`
- `ClauseBuilder addSubcomponents(Clause arg0, int arg1)`
- `ClauseBuilder addSubcomponents(Clause arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ClauseBuilder prune()`

