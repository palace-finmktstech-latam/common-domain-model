# StrikeBuilder

**Full Name:** `cdm.product.template.Strike$StrikeBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Strike`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `StrikeBuilder setMeta(MetaFields arg0)`
- `StrikeBuilder setStrikeRate(BigDecimal arg0)`
- `StrikeBuilder setBuyer(PayerReceiverEnum arg0)`
- `StrikeBuilder setSeller(PayerReceiverEnum arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StrikeBuilder prune()`

