# MultipleValuationDatesBuilderImpl

**Full Name:** `cdm.observable.asset.MultipleValuationDates$MultipleValuationDatesBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.SingleValuationDate$SingleValuationDateBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.MultipleValuationDates$MultipleValuationDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessDaysThereafter | `Integer` |  |
| numberValuationDates | `Integer` |  |

### Methods

#### Builder Methods

- `MultipleValuationDates build()`

#### Setter Methods

- `MultipleValuationDatesBuilder setBusinessDays(Integer arg0)`
- `MultipleValuationDatesBuilder setNumberValuationDates(Integer arg0)`
- `MultipleValuationDatesBuilder setBusinessDaysThereafter(Integer arg0)`

#### Getter Methods

- `Integer getNumberValuationDates()`
- `Integer getBusinessDaysThereafter()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MultipleValuationDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MultipleValuationDatesBuilder prune()`
- `MultipleValuationDatesBuilder toBuilder()`
- `boolean hasData()`

