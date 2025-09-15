# DiscountingMethodBuilderImpl

**Full Name:** `cdm.product.asset.DiscountingMethod$DiscountingMethodBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.DiscountingMethod$DiscountingMethodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| discountingType | `DiscountingTypeEnum` |  |
| discountRate | `BigDecimal` |  |
| discountRateDayCountFraction | `FieldWithMetaDayCountFractionEnumBuilder` |  |

### Methods

#### Builder Methods

- `DiscountingMethod build()`

#### Setter Methods

- `DiscountingMethodBuilder setDiscountingType(DiscountingTypeEnum arg0)`
- `DiscountingMethodBuilder setDiscountRate(BigDecimal arg0)`
- `DiscountingMethodBuilder setDiscountRateDayCountFractionValue(DayCountFractionEnum arg0)`
- `DiscountingMethodBuilder setDiscountRateDayCountFraction(FieldWithMetaDayCountFractionEnum arg0)`

#### Getter Methods

- `DiscountingTypeEnum getDiscountingType()`
- `BigDecimal getDiscountRate()`
- `FieldWithMetaDayCountFractionEnumBuilder getDiscountRateDayCountFraction()`
- `FieldWithMetaDayCountFractionEnumBuilder getOrCreateDiscountRateDayCountFraction()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DiscountingMethodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DiscountingMethodBuilder toBuilder()`
- `DiscountingMethodBuilder prune()`

