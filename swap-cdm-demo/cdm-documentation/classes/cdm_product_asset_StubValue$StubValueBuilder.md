# StubValueBuilder

**Full Name:** `cdm.product.asset.StubValue$StubValueBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.StubValue`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `StubValueBuilder setFloatingRate(List arg0)`
- `StubValueBuilder setStubRate(BigDecimal arg0)`
- `StubValueBuilder setStubAmount(Money arg0)`

#### Getter Methods

- `List getFloatingRate()`
- `StubFloatingRateBuilder getOrCreateFloatingRate(int arg0)`
- `MoneyBuilder getOrCreateStubAmount()`
- `MoneyBuilder getStubAmount()`

#### Adder Methods

- `StubValueBuilder addFloatingRate(StubFloatingRate arg0)`
- `StubValueBuilder addFloatingRate(StubFloatingRate arg0, int arg1)`
- `StubValueBuilder addFloatingRate(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StubValueBuilder prune()`

