# StrikeScheduleBuilderImpl

**Full Name:** `cdm.product.template.StrikeSchedule$StrikeScheduleBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.schedule.RateSchedule$RateScheduleBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.StrikeSchedule$StrikeScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| buyer | `PayerReceiverEnum` |  |
| seller | `PayerReceiverEnum` |  |

### Methods

#### Builder Methods

- `StrikeSchedule build()`

#### Setter Methods

- `StrikeScheduleBuilder setPriceValue(PriceSchedule arg0)`
- `StrikeScheduleBuilder setPrice(ReferenceWithMetaPriceSchedule arg0)`
- `StrikeScheduleBuilder setBuyer(PayerReceiverEnum arg0)`
- `StrikeScheduleBuilder setSeller(PayerReceiverEnum arg0)`

#### Getter Methods

- `PayerReceiverEnum getBuyer()`
- `PayerReceiverEnum getSeller()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StrikeScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `StrikeScheduleBuilder prune()`
- `StrikeScheduleBuilder toBuilder()`
- `boolean hasData()`

