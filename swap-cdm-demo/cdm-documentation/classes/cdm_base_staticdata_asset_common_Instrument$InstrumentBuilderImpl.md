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

- `InstrumentBuilder setLoan(Loan arg0)`
- `InstrumentBuilder setSecurity(Security arg0)`
- `InstrumentBuilder setListedDerivative(ListedDerivative arg0)`

#### Getter Methods

- `SecurityBuilder getSecurity()`
- `SecurityBuilder getOrCreateSecurity()`
- `ListedDerivativeBuilder getListedDerivative()`
- `LoanBuilder getLoan()`
- `LoanBuilder getOrCreateLoan()`
- `ListedDerivativeBuilder getOrCreateListedDerivative()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InstrumentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `InstrumentBuilder prune()`
- `InstrumentBuilder toBuilder()`
- `boolean hasData()`

