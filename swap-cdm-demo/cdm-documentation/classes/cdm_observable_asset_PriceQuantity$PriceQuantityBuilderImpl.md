# PriceQuantityBuilderImpl

**Full Name:** `cdm.observable.asset.PriceQuantity$PriceQuantityBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.PriceQuantity$PriceQuantityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| price | `java.util.List<cdm.observable.asset.metafields.FieldWithMetaPriceSchedule$FieldWithMetaPriceScheduleBuilder>` |  |
| quantity | `java.util.List<cdm.base.math.metafields.FieldWithMetaNonNegativeQuantitySchedule$FieldWithMetaNonNegativeQuantityScheduleBuilder>` |  |
| observable | `FieldWithMetaObservableBuilder` |  |
| effectiveDate | `AdjustableOrRelativeDateBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PriceQuantity build()`

#### Setter Methods

- `PriceQuantityBuilder setEffectiveDate(AdjustableOrRelativeDate arg0)`
- `PriceQuantityBuilder setQuantity(List arg0)`
- `PriceQuantityBuilder setQuantityValue(List arg0)`
- `PriceQuantityBuilder setPriceValue(List arg0)`
- `PriceQuantityBuilder setObservable(FieldWithMetaObservable arg0)`
- `PriceQuantityBuilder setPrice(List arg0)`
- `PriceQuantityBuilder setObservableValue(Observable arg0)`
- `PriceQuantityBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaPriceScheduleBuilder getOrCreatePrice(int arg0)`
- `FieldWithMetaObservableBuilder getOrCreateObservable()`
- `AdjustableOrRelativeDateBuilder getOrCreateEffectiveDate()`
- `FieldWithMetaObservableBuilder getObservable()`
- `List getQuantity()`
- `FieldWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantity(int arg0)`
- `AdjustableOrRelativeDateBuilder getEffectiveDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `List getPrice()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PriceQuantityBuilder addPriceValue(PriceSchedule arg0)`
- `PriceQuantityBuilder addPriceValue(List arg0)`
- `PriceQuantityBuilder addPriceValue(PriceSchedule arg0, int arg1)`
- `PriceQuantityBuilder addQuantityValue(NonNegativeQuantitySchedule arg0)`
- `PriceQuantityBuilder addQuantityValue(List arg0)`
- `PriceQuantityBuilder addQuantityValue(NonNegativeQuantitySchedule arg0, int arg1)`
- `PriceQuantityBuilder addPrice(List arg0)`
- `PriceQuantityBuilder addPrice(FieldWithMetaPriceSchedule arg0, int arg1)`
- `PriceQuantityBuilder addPrice(FieldWithMetaPriceSchedule arg0)`
- `PriceQuantityBuilder addQuantity(FieldWithMetaNonNegativeQuantitySchedule arg0)`
- `PriceQuantityBuilder addQuantity(List arg0)`
- `PriceQuantityBuilder addQuantity(FieldWithMetaNonNegativeQuantitySchedule arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PriceQuantityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PriceQuantityBuilder toBuilder()`
- `PriceQuantityBuilder prune()`

