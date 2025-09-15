# IndexTransitionInstructionBuilderImpl

**Full Name:** `cdm.event.common.IndexTransitionInstruction$IndexTransitionInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.IndexTransitionInstruction$IndexTransitionInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| priceQuantity | `java.util.List<cdm.observable.asset.PriceQuantity$PriceQuantityBuilder>` |  |
| effectiveDate | `Date` |  |
| cashTransfer | `TransferBuilder` |  |

### Methods

#### Builder Methods

- `IndexTransitionInstruction build()`

#### Setter Methods

- `IndexTransitionInstructionBuilder setCashTransfer(Transfer arg0)`
- `IndexTransitionInstructionBuilder setEffectiveDate(Date arg0)`
- `IndexTransitionInstructionBuilder setPriceQuantity(List arg0)`

#### Getter Methods

- `TransferBuilder getOrCreateCashTransfer()`
- `TransferBuilder getCashTransfer()`
- `List getPriceQuantity()`
- `Date getEffectiveDate()`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`

#### Adder Methods

- `IndexTransitionInstructionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `IndexTransitionInstructionBuilder addPriceQuantity(List arg0)`
- `IndexTransitionInstructionBuilder addPriceQuantity(PriceQuantity arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `IndexTransitionInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `IndexTransitionInstructionBuilder toBuilder()`
- `IndexTransitionInstructionBuilder prune()`

