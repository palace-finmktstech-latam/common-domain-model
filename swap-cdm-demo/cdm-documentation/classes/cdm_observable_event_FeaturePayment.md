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
- `PartyReferencePayerReceiver getPayerReceiver()`
- `BigDecimal getAmount()`
- `MetaFields getMeta()`
- `BigDecimal getLevelPercentage()`
- `AdjustableOrRelativeDate getPaymentDate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FeaturePaymentBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

