# PhysicalSettlementTerms

**Full Name:** `cdm.product.common.settlement.PhysicalSettlementTerms`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `PhysicalSettlementTerms build()`

#### Getter Methods

- `Class getType()`
- `PhysicalSettlementPeriod getPhysicalSettlementPeriod()`
- `MetaFields getMeta()`
- `DeliverableObligations getDeliverableObligations()`
- `Boolean getEscrow()`
- `Boolean getSixtyBusinessDaySettlementCap()`
- `Boolean getClearedPhysicalSettlement()`
- `AncillaryRoleEnum getPredeterminedClearingOrganizationParty()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PhysicalSettlementTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

