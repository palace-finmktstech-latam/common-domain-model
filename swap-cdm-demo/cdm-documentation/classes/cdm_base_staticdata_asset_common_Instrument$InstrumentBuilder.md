# InstrumentBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Instrument$InstrumentBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Instrument`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InstrumentBuilder prune()`

