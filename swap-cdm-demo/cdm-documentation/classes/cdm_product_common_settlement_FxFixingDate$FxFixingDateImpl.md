# FxFixingDateImpl

**Full Name:** `cdm.product.common.settlement.FxFixingDate$FxFixingDateImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.Offset$OffsetImpl`

### Implemented Interfaces

- `cdm.product.common.settlement.FxFixingDate`

### Methods

#### Builder Methods

- `FxFixingDate build()`

#### Setter Methods

- `void setBuilderFields(FxFixingDateBuilder arg0)`

#### Getter Methods

- `BusinessDayConventionEnum getBusinessDayConvention()`
- `BusinessCenters getBusinessCenters()`
- `AdjustableOrRelativeDate getFxFixingDate()`
- `DateRelativeToValuationDates getDateRelativeToValuationDates()`
- `DateRelativeToPaymentDates getDateRelativeToPaymentDates()`
- `DateRelativeToCalculationPeriodDates getDateRelativeToCalculationPeriodDates()`
- `ReferenceWithMetaBusinessCenters getBusinessCentersReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxFixingDateBuilder toBuilder()`

