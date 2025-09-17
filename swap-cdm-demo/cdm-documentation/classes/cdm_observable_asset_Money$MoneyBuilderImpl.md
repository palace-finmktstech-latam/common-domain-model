# MoneyBuilderImpl

**Full Name:** `cdm.observable.asset.Money$MoneyBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.math.Quantity$QuantityBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.Money$MoneyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Money build()`

#### Setter Methods

- `MoneyBuilder setValue(BigDecimal arg0)`
- `MoneyBuilder setMultiplier(Measure arg0)`
- `MoneyBuilder setMeta(MetaFields arg0)`
- `MoneyBuilder setDatedValue(List arg0)`
- `MoneyBuilder setUnit(UnitType arg0)`
- `MoneyBuilder setFrequency(Frequency arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `MoneyBuilder addDatedValue(List arg0)`
- `MoneyBuilder addDatedValue(DatedValue arg0)`
- `MoneyBuilder addDatedValue(DatedValue arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MoneyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MoneyBuilder prune()`
- `MoneyBuilder toBuilder()`
- `boolean hasData()`

