# CorporateActionBuilderImpl

**Full Name:** `cdm.event.common.CorporateAction$CorporateActionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.CorporateAction$CorporateActionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| corporateActionType | `CorporateActionTypeEnum` |  |
| exDate | `Date` |  |
| payDate | `Date` |  |
| underlier | `UnderlierBuilder` |  |

### Methods

#### Builder Methods

- `CorporateAction build()`

#### Setter Methods

- `CorporateActionBuilder setUnderlier(Underlier arg0)`
- `CorporateActionBuilder setCorporateActionType(CorporateActionTypeEnum arg0)`
- `CorporateActionBuilder setPayDate(Date arg0)`
- `CorporateActionBuilder setExDate(Date arg0)`

#### Getter Methods

- `UnderlierBuilder getOrCreateUnderlier()`
- `UnderlierBuilder getUnderlier()`
- `CorporateActionTypeEnum getCorporateActionType()`
- `Date getExDate()`
- `Date getPayDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CorporateActionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CorporateActionBuilder prune()`
- `CorporateActionBuilder toBuilder()`
- `boolean hasData()`

