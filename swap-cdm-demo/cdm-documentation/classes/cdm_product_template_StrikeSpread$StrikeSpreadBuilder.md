# StrikeSpreadBuilder

**Full Name:** `cdm.product.template.StrikeSpread$StrikeSpreadBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.StrikeSpread`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `StrikeSpreadBuilder setUpperStrikeNumberOfOptions(BigDecimal arg0)`
- `StrikeSpreadBuilder setUpperStrike(OptionStrike arg0)`

#### Getter Methods

- `OptionStrikeBuilder getUpperStrike()`
- `OptionStrikeBuilder getOrCreateUpperStrike()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StrikeSpreadBuilder prune()`

