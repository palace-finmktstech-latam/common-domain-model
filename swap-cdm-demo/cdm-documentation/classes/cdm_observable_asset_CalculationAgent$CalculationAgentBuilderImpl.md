# CalculationAgentBuilderImpl

**Full Name:** `cdm.observable.asset.CalculationAgent$CalculationAgentBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.CalculationAgent$CalculationAgentBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationAgentParty | `AncillaryRoleEnum` |  |
| calculationAgentPartyEnum | `PartyDeterminationEnum` |  |
| calculationAgentBusinessCenter | `FieldWithMetaBusinessCenterEnumBuilder` |  |

### Methods

#### Builder Methods

- `CalculationAgent build()`

#### Setter Methods

- `CalculationAgentBuilder setCalculationAgentParty(AncillaryRoleEnum arg0)`
- `CalculationAgentBuilder setCalculationAgentBusinessCenterValue(BusinessCenterEnum arg0)`
- `CalculationAgentBuilder setCalculationAgentBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)`
- `CalculationAgentBuilder setCalculationAgentPartyEnum(PartyDeterminationEnum arg0)`

#### Getter Methods

- `AncillaryRoleEnum getCalculationAgentParty()`
- `PartyDeterminationEnum getCalculationAgentPartyEnum()`
- `FieldWithMetaBusinessCenterEnumBuilder getCalculationAgentBusinessCenter()`
- `FieldWithMetaBusinessCenterEnumBuilder getOrCreateCalculationAgentBusinessCenter()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationAgentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CalculationAgentBuilder prune()`
- `CalculationAgentBuilder toBuilder()`
- `boolean hasData()`

