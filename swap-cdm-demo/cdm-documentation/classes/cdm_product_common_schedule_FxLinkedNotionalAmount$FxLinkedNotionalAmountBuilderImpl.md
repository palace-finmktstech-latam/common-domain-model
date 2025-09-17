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

- `FxLinkedNotionalAmountBuilder setResetDate(Date arg0)`
- `FxLinkedNotionalAmountBuilder setNotionalAmount(BigDecimal arg0)`
- `FxLinkedNotionalAmountBuilder setObservedFxSpotRate(BigDecimal arg0)`
- `FxLinkedNotionalAmountBuilder setAdjustedFxSpotFixingDate(Date arg0)`

#### Getter Methods

- `Date getResetDate()`
- `BigDecimal getObservedFxSpotRate()`
- `Date getAdjustedFxSpotFixingDate()`
- `BigDecimal getNotionalAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxLinkedNotionalAmountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FxLinkedNotionalAmountBuilder prune()`
- `FxLinkedNotionalAmountBuilder toBuilder()`
- `boolean hasData()`

