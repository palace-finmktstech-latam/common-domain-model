# DividendPaymentDateBuilderImpl

**Full Name:** `cdm.product.asset.DividendPaymentDate$DividendPaymentDateBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.DividendPaymentDate$DividendPaymentDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dividendDateReference | `DividendDateReferenceBuilder` |  |
| dividendDate | `ReferenceWithMetaAdjustableOrRelativeDateBuilder` |  |

### Methods

#### Builder Methods

- `DividendPaymentDate build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DividendPaymentDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DividendPaymentDateBuilder toBuilder()`
- `DividendPaymentDateBuilder prune()`

