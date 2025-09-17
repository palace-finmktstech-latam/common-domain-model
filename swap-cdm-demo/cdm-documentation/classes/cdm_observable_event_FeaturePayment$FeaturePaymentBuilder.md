# FeaturePaymentBuilder

**Full Name:** `cdm.observable.event.FeaturePayment$FeaturePaymentBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.FeaturePayment`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `FeaturePaymentBuilder setCurrency(FieldWithMetaString arg0)`
- `FeaturePaymentBuilder setTime(TimeTypeEnum arg0)`
- `FeaturePaymentBuilder setPayerReceiver(PartyReferencePayerReceiver arg0)`
- `FeaturePaymentBuilder setCurrencyValue(String arg0)`
- `FeaturePaymentBuilder setAmount(BigDecimal arg0)`
- `FeaturePaymentBuilder setMeta(MetaFields arg0)`
- `FeaturePaymentBuilder setLevelPercentage(BigDecimal arg0)`
- `FeaturePaymentBuilder setPaymentDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `PartyReferencePayerReceiverBuilder getOrCreatePayerReceiver()`
- `PartyReferencePayerReceiverBuilder getPayerReceiver()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`
- `AdjustableOrRelativeDateBuilder getPaymentDate()`
- `AdjustableOrRelativeDateBuilder getOrCreatePaymentDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FeaturePaymentBuilder prune()`

