# FxLinkedNotionalAmountBuilderImpl

**Full Name:** `cdm.product.common.schedule.FxLinkedNotionalAmount$FxLinkedNotionalAmountBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.FxLinkedNotionalAmount$FxLinkedNotionalAmountBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| resetDate | `Date` |  |
| adjustedFxSpotFixingDate | `Date` |  |
| observedFxSpotRate | `BigDecimal` |  |
| notionalAmount | `BigDecimal` |  |

### Methods

#### Builder Methods

- `FxLinkedNotionalAmount build()`

#### Setter Methods

- `FxLinkedNotionalAmountBuilder setNotionalAmount(BigDecimal arg0)`
- `FxLinkedNotionalAmountBuilder setObservedFxSpotRate(BigDecimal arg0)`
- `FxLinkedNotionalAmountBuilder setAdjustedFxSpotFixingDate(Date arg0)`
- `FxLinkedNotionalAmountBuilder setResetDate(Date arg0)`

#### Getter Methods

- `BigDecimal getNotionalAmount()`
- `Date getResetDate()`
- `BigDecimal getObservedFxSpotRate()`
- `Date getAdjustedFxSpotFixingDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxLinkedNotionalAmountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FxLinkedNotionalAmountBuilder toBuilder()`
- `FxLinkedNotionalAmountBuilder prune()`

