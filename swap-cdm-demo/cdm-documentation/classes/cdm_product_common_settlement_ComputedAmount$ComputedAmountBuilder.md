# ComputedAmountBuilder

**Full Name:** `cdm.product.common.settlement.ComputedAmount$ComputedAmountBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.ComputedAmount`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ComputedAmountBuilder setCurrency(FieldWithMetaString arg0)`
- `ComputedAmountBuilder setCurrencyValue(String arg0)`
- `ComputedAmountBuilder setAmount(BigDecimal arg0)`
- `ComputedAmountBuilder setCallFunction(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ComputedAmountBuilder prune()`

