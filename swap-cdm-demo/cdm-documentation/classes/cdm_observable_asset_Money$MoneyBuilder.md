# MoneyBuilder

**Full Name:** `cdm.observable.asset.Money$MoneyBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.Money`
- `cdm.base.math.Quantity$QuantityBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `MoneyBuilder setValue(BigDecimal arg0)`
- `MoneyBuilder setMultiplier(Measure arg0)`
- `MoneyBuilder setDatedValue(List arg0)`
- `MoneyBuilder setFrequency(Frequency arg0)`
- `MoneyBuilder setUnit(UnitType arg0)`
- `MoneyBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `MoneyBuilder addDatedValue(List arg0)`
- `MoneyBuilder addDatedValue(DatedValue arg0, int arg1)`
- `MoneyBuilder addDatedValue(DatedValue arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MoneyBuilder prune()`

