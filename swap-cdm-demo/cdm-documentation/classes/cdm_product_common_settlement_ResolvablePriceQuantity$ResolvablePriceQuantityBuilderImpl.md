# ResolvablePriceQuantityBuilderImpl

**Full Name:** `cdm.product.common.settlement.ResolvablePriceQuantity$ResolvablePriceQuantityBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.ResolvablePriceQuantity$ResolvablePriceQuantityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| resolvedQuantity | `QuantityBuilder` |  |
| quantitySchedule | `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` |  |
| quantityReference | `ReferenceWithMetaResolvablePriceQuantityBuilder` |  |
| quantityMultiplier | `QuantityMultiplierBuilder` |  |
| reset | `Boolean` |  |
| futureValueNotional | `FutureValueAmountBuilder` |  |
| priceSchedule | `java.util.List<cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ResolvablePriceQuantity build()`

#### Setter Methods

- `ResolvablePriceQuantityBuilder setReset(Boolean arg0)`
- `ResolvablePriceQuantityBuilder setMeta(MetaFields arg0)`
- `ResolvablePriceQuantityBuilder setFutureValueNotional(FutureValueAmount arg0)`
- `ResolvablePriceQuantityBuilder setPriceScheduleValue(List arg0)`
- `ResolvablePriceQuantityBuilder setResolvedQuantity(Quantity arg0)`
- `ResolvablePriceQuantityBuilder setQuantitySchedule(ReferenceWithMetaNonNegativeQuantitySchedule arg0)`
- `ResolvablePriceQuantityBuilder setQuantityReferenceValue(ResolvablePriceQuantity arg0)`
- `ResolvablePriceQuantityBuilder setPriceSchedule(List arg0)`
- `ResolvablePriceQuantityBuilder setQuantityMultiplier(QuantityMultiplier arg0)`
- `ResolvablePriceQuantityBuilder setQuantityReference(ReferenceWithMetaResolvablePriceQuantity arg0)`
- `ResolvablePriceQuantityBuilder setQuantityScheduleValue(NonNegativeQuantitySchedule arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Boolean getReset()`
- `MetaFieldsBuilder getMeta()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantitySchedule()`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreatePriceSchedule(int arg0)`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getQuantitySchedule()`
- `QuantityMultiplierBuilder getQuantityMultiplier()`
- `ReferenceWithMetaResolvablePriceQuantityBuilder getQuantityReference()`
- `QuantityBuilder getResolvedQuantity()`
- `FutureValueAmountBuilder getFutureValueNotional()`
- `List getPriceSchedule()`
- `ReferenceWithMetaResolvablePriceQuantityBuilder getOrCreateQuantityReference()`
- `QuantityMultiplierBuilder getOrCreateQuantityMultiplier()`
- `QuantityBuilder getOrCreateResolvedQuantity()`
- `FutureValueAmountBuilder getOrCreateFutureValueNotional()`

#### Adder Methods

- `ResolvablePriceQuantityBuilder addPriceSchedule(ReferenceWithMetaPriceSchedule arg0)`
- `ResolvablePriceQuantityBuilder addPriceSchedule(List arg0)`
- `ResolvablePriceQuantityBuilder addPriceSchedule(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `ResolvablePriceQuantityBuilder addPriceScheduleValue(List arg0)`
- `ResolvablePriceQuantityBuilder addPriceScheduleValue(PriceSchedule arg0)`
- `ResolvablePriceQuantityBuilder addPriceScheduleValue(PriceSchedule arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ResolvablePriceQuantityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ResolvablePriceQuantityBuilder prune()`
- `ResolvablePriceQuantityBuilder toBuilder()`
- `boolean hasData()`

