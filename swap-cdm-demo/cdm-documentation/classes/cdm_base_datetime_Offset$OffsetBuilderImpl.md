# OffsetBuilderImpl

**Full Name:** `cdm.base.datetime.Offset$OffsetBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.Period$PeriodBuilderImpl`

### Implemented Interfaces

- `cdm.base.datetime.Offset$OffsetBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dayType | `DayTypeEnum` |  |

### Methods

#### Builder Methods

- `Offset build()`

#### Setter Methods

- `OffsetBuilder setDayType(DayTypeEnum arg0)`
- `OffsetBuilder setPeriod(PeriodEnum arg0)`
- `OffsetBuilder setPeriodMultiplier(Integer arg0)`
- `OffsetBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `DayTypeEnum getDayType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OffsetBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `OffsetBuilder toBuilder()`
- `OffsetBuilder prune()`

