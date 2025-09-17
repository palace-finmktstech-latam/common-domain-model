# ConcentrationLimitBuilder

**Full Name:** `cdm.product.collateral.ConcentrationLimit$ConcentrationLimitBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.ConcentrationLimit`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ConcentrationLimitBuilder setValueLimit(MoneyRange arg0)`
- `ConcentrationLimitBuilder setPercentageLimit(NumberRange arg0)`
- `ConcentrationLimitBuilder setConcentrationLimitCriteria(ConcentrationLimitCriteria arg0)`

#### Getter Methods

- `MoneyRangeBuilder getValueLimit()`
- `NumberRangeBuilder getOrCreatePercentageLimit()`
- `NumberRangeBuilder getPercentageLimit()`
- `MoneyRangeBuilder getOrCreateValueLimit()`
- `ConcentrationLimitCriteriaBuilder getConcentrationLimitCriteria()`
- `ConcentrationLimitCriteriaBuilder getOrCreateConcentrationLimitCriteria()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ConcentrationLimitBuilder prune()`

