# OptionPayoutImpl

**Full Name:** `cdm.product.template.OptionPayout$OptionPayoutImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseImpl`

### Implemented Interfaces

- `cdm.product.template.OptionPayout`

### Methods

#### Builder Methods

- `OptionPayout build()`

#### Setter Methods

- `void setBuilderFields(OptionPayoutBuilder arg0)`

#### Getter Methods

- `OptionStrike getStrike()`
- `Underlier getUnderlier()`
- `CalculationSchedule getSchedule()`
- `AssetDeliveryInformation getDelivery()`
- `BuyerSeller getBuyerSeller()`
- `ExerciseTerms getExerciseTerms()`
- `OptionFeature getFeature()`
- `ObservationTerms getObservationTerms()`
- `OptionTypeEnum getOptionType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OptionPayoutBuilder toBuilder()`

