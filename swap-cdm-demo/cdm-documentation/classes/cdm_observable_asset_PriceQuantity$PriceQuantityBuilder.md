# PriceQuantityBuilder

**Full Name:** `cdm.observable.asset.PriceQuantity$PriceQuantityBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.PriceQuantity`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PriceQuantityBuilder setQuantity(List arg0)`
- `PriceQuantityBuilder setObservableValue(Observable arg0)`
- `PriceQuantityBuilder setObservable(FieldWithMetaObservable arg0)`
- `PriceQuantityBuilder setMeta(MetaFields arg0)`
- `PriceQuantityBuilder setPriceValue(List arg0)`
- `PriceQuantityBuilder setQuantityValue(List arg0)`
- `PriceQuantityBuilder setPrice(List arg0)`
- `PriceQuantityBuilder setEffectiveDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `FieldWithMetaObservableBuilder getObservable()`
- `List getQuantity()`
- `FieldWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantity(int arg0)`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableOrRelativeDateBuilder getEffectiveDate()`
- `FieldWithMetaPriceScheduleBuilder getOrCreatePrice(int arg0)`
- `FieldWithMetaObservableBuilder getOrCreateObservable()`
- `MetaFieldsBuilder getMeta()`
- `List getPrice()`
- `AdjustableOrRelativeDateBuilder getOrCreateEffectiveDate()`

#### Adder Methods

- `PriceQuantityBuilder addQuantityValue(NonNegativeQuantitySchedule arg0, int arg1)`
- `PriceQuantityBuilder addQuantityValue(NonNegativeQuantitySchedule arg0)`
- `PriceQuantityBuilder addQuantityValue(List arg0)`
- `PriceQuantityBuilder addPriceValue(PriceSchedule arg0, int arg1)`
- `PriceQuantityBuilder addPriceValue(PriceSchedule arg0)`
- `PriceQuantityBuilder addPriceValue(List arg0)`
- `PriceQuantityBuilder addPrice(FieldWithMetaPriceSchedule arg0, int arg1)`
- `PriceQuantityBuilder addPrice(List arg0)`
- `PriceQuantityBuilder addPrice(FieldWithMetaPriceSchedule arg0)`
- `PriceQuantityBuilder addQuantity(FieldWithMetaNonNegativeQuantitySchedule arg0, int arg1)`
- `PriceQuantityBuilder addQuantity(List arg0)`
- `PriceQuantityBuilder addQuantity(FieldWithMetaNonNegativeQuantitySchedule arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PriceQuantityBuilder prune()`

