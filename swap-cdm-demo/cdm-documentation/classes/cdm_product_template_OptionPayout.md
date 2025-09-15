# OptionPayout

**Full Name:** `cdm.product.template.OptionPayout`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PayoutBase`

### Methods

#### Builder Methods

- `OptionPayout build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `OptionPayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

