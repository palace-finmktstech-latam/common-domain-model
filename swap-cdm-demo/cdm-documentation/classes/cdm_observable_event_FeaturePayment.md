# FeaturePayment

**Full Name:** `cdm.observable.event.FeaturePayment`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `FeaturePayment build()`

#### Getter Methods

- `Class getType()`
- `FieldWithMetaString getCurrency()`
- `TimeTypeEnum getTime()`
- `BigDecimal getLevelPercentage()`
- `PartyReferencePayerReceiver getPayerReceiver()`
- `AdjustableOrRelativeDate getPaymentDate()`
- `MetaFields getMeta()`
- `BigDecimal getAmount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FeaturePaymentBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

