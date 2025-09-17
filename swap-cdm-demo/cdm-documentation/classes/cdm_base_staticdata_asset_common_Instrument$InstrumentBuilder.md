# InstrumentBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Instrument$InstrumentBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Instrument`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InstrumentBuilder prune()`

