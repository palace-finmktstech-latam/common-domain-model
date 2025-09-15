# AmountScheduleBuilderImpl

**Full Name:** `cdm.product.common.schedule.AmountSchedule$AmountScheduleBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.math.Schedule$ScheduleBuilderImpl`

### Implemented Interfaces

- `cdm.product.common.schedule.AmountSchedule$AmountScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| currency | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |

### Methods

#### Builder Methods

- `AmountSchedule build()`

#### Setter Methods

- `AmountScheduleBuilder setValue(BigDecimal arg0)`
- `AmountScheduleBuilder setCurrency(List arg0)`
- `AmountScheduleBuilder setDatedValue(List arg0)`
- `AmountScheduleBuilder setCurrencyValue(List arg0)`

#### Getter Methods

- `List getCurrency()`
- `FieldWithMetaStringBuilder getOrCreateCurrency(int arg0)`

#### Adder Methods

- `AmountScheduleBuilder addCurrency(List arg0)`
- `AmountScheduleBuilder addCurrency(FieldWithMetaString arg0)`
- `AmountScheduleBuilder addCurrency(FieldWithMetaString arg0, int arg1)`
- `AmountScheduleBuilder addCurrencyValue(List arg0)`
- `AmountScheduleBuilder addCurrencyValue(String arg0, int arg1)`
- `AmountScheduleBuilder addCurrencyValue(String arg0)`
- `AmountScheduleBuilder addDatedValue(DatedValue arg0, int arg1)`
- `AmountScheduleBuilder addDatedValue(List arg0)`
- `AmountScheduleBuilder addDatedValue(DatedValue arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AmountScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AmountScheduleBuilder toBuilder()`
- `AmountScheduleBuilder prune()`

