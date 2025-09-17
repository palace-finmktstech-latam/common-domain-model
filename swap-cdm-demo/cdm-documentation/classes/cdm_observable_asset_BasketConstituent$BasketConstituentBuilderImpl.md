# BasketConstituentBuilderImpl

**Full Name:** `cdm.observable.asset.BasketConstituent$BasketConstituentBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.Observable$ObservableBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.BasketConstituent$BasketConstituentBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| quantity | `java.util.List<cdm.base.math.metafields.ReferenceWithMetaNonNegativeQuantitySchedule$ReferenceWithMetaNonNegativeQuantityScheduleBuilder>` |  |
| initialValuationPrice | `java.util.List<cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder>` |  |
| interimValuationPrice | `java.util.List<cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder>` |  |
| finalValuationPrice | `java.util.List<cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder>` |  |

### Methods

#### Builder Methods

- `BasketConstituent build()`

#### Setter Methods

- `BasketConstituentBuilder setIndex(Index arg0)`
- `BasketConstituentBuilder setQuantity(List arg0)`
- `BasketConstituentBuilder setAsset(Asset arg0)`
- `BasketConstituentBuilder setQuantityValue(List arg0)`
- `BasketConstituentBuilder setBasket(Basket arg0)`
- `BasketConstituentBuilder setInitialValuationPriceValue(List arg0)`
- `BasketConstituentBuilder setInterimValuationPriceValue(List arg0)`
- `BasketConstituentBuilder setFinalValuationPriceValue(List arg0)`
- `BasketConstituentBuilder setInitialValuationPrice(List arg0)`
- `BasketConstituentBuilder setFinalValuationPrice(List arg0)`
- `BasketConstituentBuilder setInterimValuationPrice(List arg0)`

#### Getter Methods

- `List getQuantity()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantity(int arg0)`
- `List getInitialValuationPrice()`
- `List getFinalValuationPrice()`
- `List getInterimValuationPrice()`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInitialValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInterimValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateFinalValuationPrice(int arg0)`

#### Adder Methods

- `BasketConstituentBuilder addQuantityValue(List arg0)`
- `BasketConstituentBuilder addQuantityValue(NonNegativeQuantitySchedule arg0)`
- `BasketConstituentBuilder addQuantityValue(NonNegativeQuantitySchedule arg0, int arg1)`
- `BasketConstituentBuilder addQuantity(List arg0)`
- `BasketConstituentBuilder addQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0, int arg1)`
- `BasketConstituentBuilder addQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)`
- `BasketConstituentBuilder addInitialValuationPriceValue(List arg0)`
- `BasketConstituentBuilder addInitialValuationPriceValue(PriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInitialValuationPriceValue(PriceSchedule arg0)`
- `BasketConstituentBuilder addInterimValuationPriceValue(PriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInterimValuationPriceValue(List arg0)`
- `BasketConstituentBuilder addInterimValuationPriceValue(PriceSchedule arg0)`
- `BasketConstituentBuilder addFinalValuationPriceValue(PriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addFinalValuationPriceValue(PriceSchedule arg0)`
- `BasketConstituentBuilder addFinalValuationPriceValue(List arg0)`
- `BasketConstituentBuilder addFinalValuationPrice(List arg0)`
- `BasketConstituentBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `BasketConstituentBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `BasketConstituentBuilder addInitialValuationPrice(List arg0)`
- `BasketConstituentBuilder addInterimValuationPrice(List arg0)`
- `BasketConstituentBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BasketConstituentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BasketConstituentBuilder prune()`
- `BasketConstituentBuilder toBuilder()`
- `boolean hasData()`

