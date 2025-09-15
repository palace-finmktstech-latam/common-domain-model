# DividendPaymentDateBuilder

**Full Name:** `cdm.product.asset.DividendPaymentDate$DividendPaymentDateBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.DividendPaymentDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DividendPaymentDateBuilder setDividendDate(ReferenceWithMetaAdjustableOrRelativeDate arg0)`
- `DividendPaymentDateBuilder setDividendDateReference(DividendDateReference arg0)`
- `DividendPaymentDateBuilder setDividendDateValue(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `DividendDateReferenceBuilder getOrCreateDividendDateReference()`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder getOrCreateDividendDate()`
- `DividendDateReferenceBuilder getDividendDateReference()`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder getDividendDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DividendPaymentDateBuilder prune()`

