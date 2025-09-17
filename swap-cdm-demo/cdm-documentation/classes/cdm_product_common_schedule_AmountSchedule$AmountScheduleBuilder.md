# AmountScheduleBuilder

**Full Name:** `cdm.product.common.schedule.AmountSchedule$AmountScheduleBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.AmountSchedule`
- `cdm.base.math.Schedule$ScheduleBuilder`

### Methods

#### Setter Methods

- `AmountScheduleBuilder setValue(BigDecimal arg0)`
- `AmountScheduleBuilder setCurrency(List arg0)`
- `AmountScheduleBuilder setCurrencyValue(List arg0)`
- `AmountScheduleBuilder setDatedValue(List arg0)`

#### Getter Methods

- `List getCurrency()`
- `FieldWithMetaStringBuilder getOrCreateCurrency(int arg0)`

#### Adder Methods

- `AmountScheduleBuilder addCurrencyValue(String arg0)`
- `AmountScheduleBuilder addCurrencyValue(List arg0)`
- `AmountScheduleBuilder addCurrencyValue(String arg0, int arg1)`
- `AmountScheduleBuilder addCurrency(FieldWithMetaString arg0, int arg1)`
- `AmountScheduleBuilder addCurrency(List arg0)`
- `AmountScheduleBuilder addCurrency(FieldWithMetaString arg0)`
- `AmountScheduleBuilder addDatedValue(DatedValue arg0)`
- `AmountScheduleBuilder addDatedValue(List arg0)`
- `AmountScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AmountScheduleBuilder prune()`

