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
- `Underlier getUnderlier()`
- `OptionFeature getFeature()`
- `ObservationTerms getObservationTerms()`
- `OptionStrike getStrike()`
- `ExerciseTerms getExerciseTerms()`
- `AssetDeliveryInformation getDelivery()`
- `BuyerSeller getBuyerSeller()`
- `CalculationSchedule getSchedule()`
- `OptionTypeEnum getOptionType()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `OptionPayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

