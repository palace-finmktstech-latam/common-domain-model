# CreditNotationBuilder

**Full Name:** `cdm.observable.asset.CreditNotation$CreditNotationBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.CreditNotation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `FieldWithMetaStringBuilder getScale()`
- `FieldWithMetaStringBuilder getNotation()`
- `FieldWithMetaStringBuilder getOrCreateNotation()`
- `FieldWithMetaStringBuilder getOrCreateScale()`
- `CreditRatingDebtBuilder getOrCreateDebt()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditNotationBuilder prune()`

