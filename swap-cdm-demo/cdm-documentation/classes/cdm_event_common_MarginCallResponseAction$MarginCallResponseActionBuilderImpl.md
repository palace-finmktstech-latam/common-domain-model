# MarginCallResponseActionBuilderImpl

**Full Name:** `cdm.event.common.MarginCallResponseAction$MarginCallResponseActionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.MarginCallResponseAction$MarginCallResponseActionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| collateralPositionComponent | `java.util.List<cdm.event.common.CollateralPosition$CollateralPositionBuilder>` |  |
| marginCallAction | `MarginCallActionEnum` |  |

### Methods

#### Builder Methods

- `MarginCallResponseAction build()`

#### Setter Methods

- `MarginCallResponseActionBuilder setCollateralPositionComponent(List arg0)`
- `MarginCallResponseActionBuilder setMarginCallAction(MarginCallActionEnum arg0)`

#### Getter Methods

- `CollateralPositionBuilder getOrCreateCollateralPositionComponent(int arg0)`
- `List getCollateralPositionComponent()`
- `MarginCallActionEnum getMarginCallAction()`

#### Adder Methods

- `MarginCallResponseActionBuilder addCollateralPositionComponent(CollateralPosition arg0)`
- `MarginCallResponseActionBuilder addCollateralPositionComponent(List arg0)`
- `MarginCallResponseActionBuilder addCollateralPositionComponent(CollateralPosition arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MarginCallResponseActionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MarginCallResponseActionBuilder prune()`
- `MarginCallResponseActionBuilder toBuilder()`
- `boolean hasData()`

