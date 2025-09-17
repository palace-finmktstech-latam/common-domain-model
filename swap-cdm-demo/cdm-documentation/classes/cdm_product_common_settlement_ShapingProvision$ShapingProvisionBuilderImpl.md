# ShapingProvisionBuilderImpl

**Full Name:** `cdm.product.common.settlement.ShapingProvision$ShapingProvisionBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.ShapingProvision$ShapingProvisionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| shapeSchedule | `java.util.List<cdm.observable.asset.Money$MoneyBuilder>` |  |

### Methods

#### Builder Methods

- `ShapingProvision build()`

#### Setter Methods

- `ShapingProvisionBuilder setShapeSchedule(List arg0)`

#### Getter Methods

- `List getShapeSchedule()`
- `MoneyBuilder getOrCreateShapeSchedule(int arg0)`

#### Adder Methods

- `ShapingProvisionBuilder addShapeSchedule(List arg0)`
- `ShapingProvisionBuilder addShapeSchedule(Money arg0)`
- `ShapingProvisionBuilder addShapeSchedule(Money arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ShapingProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ShapingProvisionBuilder prune()`
- `ShapingProvisionBuilder toBuilder()`
- `boolean hasData()`

