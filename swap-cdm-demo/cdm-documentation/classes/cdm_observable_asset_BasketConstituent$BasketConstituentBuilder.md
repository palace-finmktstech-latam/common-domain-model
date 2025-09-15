# BasketConstituentBuilder

**Full Name:** `cdm.observable.asset.BasketConstituent$BasketConstituentBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.BasketConstituent`
- `cdm.observable.asset.Observable$ObservableBuilder`

### Methods

#### Setter Methods

- `BasketConstituentBuilder setIndex(Index arg0)`
- `BasketConstituentBuilder setBasket(Basket arg0)`
- `BasketConstituentBuilder setQuantity(List arg0)`
- `BasketConstituentBuilder setQuantityValue(List arg0)`
- `BasketConstituentBuilder setInitialValuationPriceValue(List arg0)`
- `BasketConstituentBuilder setFinalValuationPriceValue(List arg0)`
- `BasketConstituentBuilder setInterimValuationPriceValue(List arg0)`
- `BasketConstituentBuilder setInitialValuationPrice(List arg0)`
- `BasketConstituentBuilder setInterimValuationPrice(List arg0)`
- `BasketConstituentBuilder setFinalValuationPrice(List arg0)`
- `BasketConstituentBuilder setAsset(Asset arg0)`

#### Getter Methods

- `List getInterimValuationPrice()`
- `List getFinalValuationPrice()`
- `List getInitialValuationPrice()`
- `List getQuantity()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantity(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInterimValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateFinalValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInitialValuationPrice(int arg0)`

#### Adder Methods

- `BasketConstituentBuilder addQuantityValue(NonNegativeQuantitySchedule arg0)`
- `BasketConstituentBuilder addQuantityValue(List arg0)`
- `BasketConstituentBuilder addQuantityValue(NonNegativeQuantitySchedule arg0, int arg1)`
- `BasketConstituentBuilder addInterimValuationPriceValue(PriceSchedule arg0)`
- `BasketConstituentBuilder addInterimValuationPriceValue(PriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInterimValuationPriceValue(List arg0)`
- `BasketConstituentBuilder addInitialValuationPriceValue(List arg0)`
- `BasketConstituentBuilder addInitialValuationPriceValue(PriceSchedule arg0)`
- `BasketConstituentBuilder addInitialValuationPriceValue(PriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addFinalValuationPriceValue(PriceSchedule arg0)`
- `BasketConstituentBuilder addFinalValuationPriceValue(PriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addFinalValuationPriceValue(List arg0)`
- `BasketConstituentBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `BasketConstituentBuilder addInterimValuationPrice(List arg0)`
- `BasketConstituentBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `BasketConstituentBuilder addFinalValuationPrice(List arg0)`
- `BasketConstituentBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInitialValuationPrice(List arg0)`
- `BasketConstituentBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `BasketConstituentBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `BasketConstituentBuilder addQuantity(List arg0)`
- `BasketConstituentBuilder addQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0, int arg1)`
- `BasketConstituentBuilder addQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BasketConstituentBuilder prune()`

