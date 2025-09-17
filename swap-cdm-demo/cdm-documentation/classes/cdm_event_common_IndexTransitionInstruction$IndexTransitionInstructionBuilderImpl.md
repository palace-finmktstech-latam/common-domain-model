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

- `IndexTransitionInstructionBuilder setPriceQuantity(List arg0)`
- `IndexTransitionInstructionBuilder setEffectiveDate(Date arg0)`
- `IndexTransitionInstructionBuilder setCashTransfer(Transfer arg0)`

#### Getter Methods

- `Date getEffectiveDate()`
- `TransferBuilder getCashTransfer()`
- `List getPriceQuantity()`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`
- `TransferBuilder getOrCreateCashTransfer()`

#### Adder Methods

- `IndexTransitionInstructionBuilder addPriceQuantity(PriceQuantity arg0)`
- `IndexTransitionInstructionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `IndexTransitionInstructionBuilder addPriceQuantity(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `IndexTransitionInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `IndexTransitionInstructionBuilder prune()`
- `IndexTransitionInstructionBuilder toBuilder()`
- `boolean hasData()`

