# ValuationInstructionBuilderImpl

**Full Name:** `cdm.event.common.ValuationInstruction$ValuationInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ValuationInstruction$ValuationInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| valuation | `java.util.List<cdm.event.common.Valuation$ValuationBuilder>` |  |
| replace | `Boolean` |  |

### Methods

#### Builder Methods

- `ValuationInstruction build()`

#### Setter Methods

- `ValuationInstructionBuilder setValuation(List arg0)`
- `ValuationInstructionBuilder setReplace(Boolean arg0)`

#### Getter Methods

- `ValuationBuilder getOrCreateValuation(int arg0)`
- `List getValuation()`
- `Boolean getReplace()`

#### Adder Methods

- `ValuationInstructionBuilder addValuation(Valuation arg0, int arg1)`
- `ValuationInstructionBuilder addValuation(Valuation arg0)`
- `ValuationInstructionBuilder addValuation(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ValuationInstructionBuilder toBuilder()`
- `ValuationInstructionBuilder prune()`

