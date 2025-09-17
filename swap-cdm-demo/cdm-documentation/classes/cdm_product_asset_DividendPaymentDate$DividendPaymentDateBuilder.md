# DividendPaymentDateBuilder

**Full Name:** `cdm.product.asset.DividendPaymentDate$DividendPaymentDateBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.DividendPaymentDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DividendPaymentDateBuilder setDividendDateValue(AdjustableOrRelativeDate arg0)`
- `DividendPaymentDateBuilder setDividendDate(ReferenceWithMetaAdjustableOrRelativeDate arg0)`
- `DividendPaymentDateBuilder setDividendDateReference(DividendDateReference arg0)`

#### Getter Methods

- `ReferenceWithMetaAdjustableOrRelativeDateBuilder getOrCreateDividendDate()`
- `ReferenceWithMetaAdjustableOrRelativeDateBuilder getDividendDate()`
- `DividendDateReferenceBuilder getDividendDateReference()`
- `DividendDateReferenceBuilder getOrCreateDividendDateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DividendPaymentDateBuilder prune()`

