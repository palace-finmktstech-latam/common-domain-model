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
- `CreditEventNotice getCreditEventNotice()`
- `Restructuring getRestructuring()`
- `FailureToPay getFailureToPay()`
- `Money getDefaultRequirement()`
- `Boolean getGovernmentalIntervention()`
- `Boolean getDistressedRatingsDowngrade()`
- `Boolean getBankruptcy()`
- `Boolean getObligationAcceleration()`
- `Boolean getRepudiationMoratorium()`
- `Boolean getObligationDefault()`
- `MetaFields getMeta()`
- `Boolean getMaturityExtension()`
- `Boolean getFailureToPayInterest()`
- `Boolean getWritedown()`
- `Boolean getFailureToPayPrincipal()`
- `Boolean getImpliedWritedown()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CreditEventsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

