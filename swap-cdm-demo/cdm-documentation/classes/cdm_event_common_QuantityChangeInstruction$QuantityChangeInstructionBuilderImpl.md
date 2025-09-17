# QuantityChangeInstructionBuilderImpl

**Full Name:** `cdm.event.common.QuantityChangeInstruction$QuantityChangeInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.QuantityChangeInstruction$QuantityChangeInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| change | `java.util.List<cdm.observable.asset.PriceQuantity$PriceQuantityBuilder>` |  |
| direction | `QuantityChangeDirectionEnum` |  |
| lotIdentifier | `java.util.List<cdm.base.staticdata.identifier.Identifier$IdentifierBuilder>` |  |

### Methods

#### Builder Methods

- `QuantityChangeInstruction build()`

#### Setter Methods

- `QuantityChangeInstructionBuilder setChange(List arg0)`
- `QuantityChangeInstructionBuilder setLotIdentifier(List arg0)`
- `QuantityChangeInstructionBuilder setDirection(QuantityChangeDirectionEnum arg0)`

#### Getter Methods

- `QuantityChangeDirectionEnum getDirection()`
- `List getLotIdentifier()`
- `IdentifierBuilder getOrCreateLotIdentifier(int arg0)`
- `List getChange()`
- `PriceQuantityBuilder getOrCreateChange(int arg0)`

#### Adder Methods

- `QuantityChangeInstructionBuilder addChange(PriceQuantity arg0)`
- `QuantityChangeInstructionBuilder addChange(List arg0)`
- `QuantityChangeInstructionBuilder addChange(PriceQuantity arg0, int arg1)`
- `QuantityChangeInstructionBuilder addLotIdentifier(List arg0)`
- `QuantityChangeInstructionBuilder addLotIdentifier(Identifier arg0, int arg1)`
- `QuantityChangeInstructionBuilder addLotIdentifier(Identifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `QuantityChangeInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `QuantityChangeInstructionBuilder prune()`
- `QuantityChangeInstructionBuilder toBuilder()`
- `boolean hasData()`

