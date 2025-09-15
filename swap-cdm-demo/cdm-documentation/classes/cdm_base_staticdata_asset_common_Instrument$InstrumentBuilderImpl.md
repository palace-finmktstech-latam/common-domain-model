# InstrumentBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.Instrument$InstrumentBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Instrument$InstrumentBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| listedDerivative | `ListedDerivativeBuilder` |  |
| loan | `LoanBuilder` |  |
| security | `SecurityBuilder` |  |

### Methods

#### Builder Methods

- `Instrument build()`

#### Setter Methods

- `InstrumentBuilder setSecurity(Security arg0)`
- `InstrumentBuilder setLoan(Loan arg0)`
- `InstrumentBuilder setListedDerivative(ListedDerivative arg0)`

#### Getter Methods

- `LoanBuilder getOrCreateLoan()`
- `ListedDerivativeBuilder getListedDerivative()`
- `LoanBuilder getLoan()`
- `SecurityBuilder getSecurity()`
- `SecurityBuilder getOrCreateSecurity()`
- `ListedDerivativeBuilder getOrCreateListedDerivative()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InstrumentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InstrumentBuilder toBuilder()`
- `InstrumentBuilder prune()`

