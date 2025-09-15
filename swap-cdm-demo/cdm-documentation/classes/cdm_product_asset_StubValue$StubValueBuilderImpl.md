# StubValueBuilderImpl

**Full Name:** `cdm.product.asset.StubValue$StubValueBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.StubValue$StubValueBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRate | `java.util.List<cdm.product.asset.StubFloatingRate$StubFloatingRateBuilder>` |  |
| stubRate | `BigDecimal` |  |
| stubAmount | `MoneyBuilder` |  |

### Methods

#### Builder Methods

- `StubValue build()`

#### Setter Methods

- `StubValueBuilder setFloatingRate(List arg0)`
- `StubValueBuilder setStubRate(BigDecimal arg0)`
- `StubValueBuilder setStubAmount(Money arg0)`

#### Getter Methods

- `List getFloatingRate()`
- `StubFloatingRateBuilder getOrCreateFloatingRate(int arg0)`
- `MoneyBuilder getOrCreateStubAmount()`
- `BigDecimal getStubRate()`
- `MoneyBuilder getStubAmount()`

#### Adder Methods

- `StubValueBuilder addFloatingRate(StubFloatingRate arg0, int arg1)`
- `StubValueBuilder addFloatingRate(StubFloatingRate arg0)`
- `StubValueBuilder addFloatingRate(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StubValueBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `StubValueBuilder toBuilder()`
- `StubValueBuilder prune()`

