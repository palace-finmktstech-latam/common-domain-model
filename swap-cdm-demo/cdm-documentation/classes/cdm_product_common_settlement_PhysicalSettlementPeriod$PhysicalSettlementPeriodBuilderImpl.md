# PhysicalSettlementPeriodBuilderImpl

**Full Name:** `cdm.product.common.settlement.PhysicalSettlementPeriod$PhysicalSettlementPeriodBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PhysicalSettlementPeriod$PhysicalSettlementPeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessDaysNotSpecified | `Boolean` |  |
| businessDays | `Integer` |  |
| maximumBusinessDays | `Integer` |  |

### Methods

#### Builder Methods

- `PhysicalSettlementPeriod build()`

#### Setter Methods

- `PhysicalSettlementPeriodBuilder setBusinessDays(Integer arg0)`
- `PhysicalSettlementPeriodBuilder setMaximumBusinessDays(Integer arg0)`
- `PhysicalSettlementPeriodBuilder setBusinessDaysNotSpecified(Boolean arg0)`

#### Getter Methods

- `Integer getBusinessDays()`
- `Integer getMaximumBusinessDays()`
- `Boolean getBusinessDaysNotSpecified()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PhysicalSettlementPeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PhysicalSettlementPeriodBuilder prune()`
- `PhysicalSettlementPeriodBuilder toBuilder()`
- `boolean hasData()`

