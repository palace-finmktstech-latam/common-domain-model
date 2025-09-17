# CreditEvents

**Full Name:** `cdm.observable.event.CreditEvents`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `CreditEvents build()`

#### Getter Methods

- `Class getType()`
- `Boolean getBankruptcy()`
- `Boolean getGovernmentalIntervention()`
- `MetaFields getMeta()`
- `Money getDefaultRequirement()`
- `FailureToPay getFailureToPay()`
- `Restructuring getRestructuring()`
- `CreditEventNotice getCreditEventNotice()`
- `Boolean getFailureToPayPrincipal()`
- `Boolean getImpliedWritedown()`
- `Boolean getWritedown()`
- `Boolean getFailureToPayInterest()`
- `Boolean getMaturityExtension()`
- `Boolean getObligationAcceleration()`
- `Boolean getRepudiationMoratorium()`
- `Boolean getObligationDefault()`
- `Boolean getDistressedRatingsDowngrade()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CreditEventsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

