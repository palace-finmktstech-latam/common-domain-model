# DiscountingMethodBuilder

**Full Name:** `cdm.product.asset.DiscountingMethod$DiscountingMethodBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.DiscountingMethod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DiscountingMethodBuilder setDiscountingType(DiscountingTypeEnum arg0)`
- `DiscountingMethodBuilder setDiscountRate(BigDecimal arg0)`
- `DiscountingMethodBuilder setDiscountRateDayCountFractionValue(DayCountFractionEnum arg0)`
- `DiscountingMethodBuilder setDiscountRateDayCountFraction(FieldWithMetaDayCountFractionEnum arg0)`

#### Getter Methods

- `FieldWithMetaDayCountFractionEnumBuilder getDiscountRateDayCountFraction()`
- `FieldWithMetaDayCountFractionEnumBuilder getOrCreateDiscountRateDayCountFraction()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DiscountingMethodBuilder prune()`

