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

- `ValuationInstructionBuilder setReplace(Boolean arg0)`
- `ValuationInstructionBuilder setValuation(List arg0)`

#### Getter Methods

- `Boolean getReplace()`
- `ValuationBuilder getOrCreateValuation(int arg0)`
- `List getValuation()`

#### Adder Methods

- `ValuationInstructionBuilder addValuation(List arg0)`
- `ValuationInstructionBuilder addValuation(Valuation arg0)`
- `ValuationInstructionBuilder addValuation(Valuation arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ValuationInstructionBuilder prune()`
- `ValuationInstructionBuilder toBuilder()`
- `boolean hasData()`

