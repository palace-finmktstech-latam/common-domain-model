# CalculationAgentBuilder

**Full Name:** `cdm.observable.asset.CalculationAgent$CalculationAgentBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.CalculationAgent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CalculationAgentBuilder setCalculationAgentParty(AncillaryRoleEnum arg0)`
- `CalculationAgentBuilder setCalculationAgentPartyEnum(PartyDeterminationEnum arg0)`
- `CalculationAgentBuilder setCalculationAgentBusinessCenterValue(BusinessCenterEnum arg0)`
- `CalculationAgentBuilder setCalculationAgentBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)`

#### Getter Methods

- `FieldWithMetaBusinessCenterEnumBuilder getOrCreateCalculationAgentBusinessCenter()`
- `FieldWithMetaBusinessCenterEnumBuilder getCalculationAgentBusinessCenter()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculationAgentBuilder prune()`

