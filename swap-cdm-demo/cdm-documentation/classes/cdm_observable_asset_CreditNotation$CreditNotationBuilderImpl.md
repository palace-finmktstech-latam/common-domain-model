# CreditNotationBuilderImpl

**Full Name:** `cdm.observable.asset.CreditNotation$CreditNotationBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.CreditNotation$CreditNotationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| agency | `CreditRatingAgencyEnum` |  |
| notation | `FieldWithMetaStringBuilder` |  |
| scale | `FieldWithMetaStringBuilder` |  |
| debt | `CreditRatingDebtBuilder` |  |
| outlook | `CreditRatingOutlookEnum` |  |
| creditWatch | `CreditRatingCreditWatchEnum` |  |

### Methods

#### Builder Methods

- `CreditNotation build()`

#### Setter Methods

- `CreditNotationBuilder setScale(FieldWithMetaString arg0)`
- `CreditNotationBuilder setAgency(CreditRatingAgencyEnum arg0)`
- `CreditNotationBuilder setOutlook(CreditRatingOutlookEnum arg0)`
- `CreditNotationBuilder setDebt(CreditRatingDebt arg0)`
- `CreditNotationBuilder setNotation(FieldWithMetaString arg0)`
- `CreditNotationBuilder setCreditWatch(CreditRatingCreditWatchEnum arg0)`
- `CreditNotationBuilder setScaleValue(String arg0)`
- `CreditNotationBuilder setNotationValue(String arg0)`

#### Getter Methods

- `CreditRatingDebtBuilder getDebt()`
- `CreditRatingAgencyEnum getAgency()`
- `FieldWithMetaStringBuilder getScale()`
- `CreditRatingOutlookEnum getOutlook()`
- `CreditRatingCreditWatchEnum getCreditWatch()`
- `FieldWithMetaStringBuilder getNotation()`
- `FieldWithMetaStringBuilder getOrCreateNotation()`
- `FieldWithMetaStringBuilder getOrCreateScale()`
- `CreditRatingDebtBuilder getOrCreateDebt()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditNotationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CreditNotationBuilder toBuilder()`
- `CreditNotationBuilder prune()`

