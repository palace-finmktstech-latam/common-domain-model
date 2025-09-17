# ResetInstructionBuilderImpl

**Full Name:** `cdm.event.common.ResetInstruction$ResetInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ResetInstruction$ResetInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payout | `java.util.List<cdm.product.template.metafields.ReferenceWithMetaPayout$ReferenceWithMetaPayoutBuilder>` |  |
| rateRecordDate | `Date` |  |
| resetDate | `Date` |  |

### Methods

#### Builder Methods

- `ResetInstruction build()`

#### Setter Methods

- `ResetInstructionBuilder setPayout(List arg0)`
- `ResetInstructionBuilder setResetDate(Date arg0)`
- `ResetInstructionBuilder setRateRecordDate(Date arg0)`
- `ResetInstructionBuilder setPayoutValue(List arg0)`

#### Getter Methods

- `Date getResetDate()`
- `Date getRateRecordDate()`
- `List getPayout()`
- `ReferenceWithMetaPayoutBuilder getOrCreatePayout(int arg0)`

#### Adder Methods

- `ResetInstructionBuilder addPayout(ReferenceWithMetaPayout arg0)`
- `ResetInstructionBuilder addPayout(ReferenceWithMetaPayout arg0, int arg1)`
- `ResetInstructionBuilder addPayout(List arg0)`
- `ResetInstructionBuilder addPayoutValue(Payout arg0)`
- `ResetInstructionBuilder addPayoutValue(Payout arg0, int arg1)`
- `ResetInstructionBuilder addPayoutValue(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ResetInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ResetInstructionBuilder prune()`
- `ResetInstructionBuilder toBuilder()`
- `boolean hasData()`

