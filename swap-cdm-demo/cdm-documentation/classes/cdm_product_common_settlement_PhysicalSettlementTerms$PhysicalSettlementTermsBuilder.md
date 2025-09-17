# PhysicalSettlementTermsBuilder

**Full Name:** `cdm.product.common.settlement.PhysicalSettlementTerms$PhysicalSettlementTermsBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PhysicalSettlementTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PhysicalSettlementTermsBuilder setMeta(MetaFields arg0)`
- `PhysicalSettlementTermsBuilder setDeliverableObligations(DeliverableObligations arg0)`
- `PhysicalSettlementTermsBuilder setSixtyBusinessDaySettlementCap(Boolean arg0)`
- `PhysicalSettlementTermsBuilder setPredeterminedClearingOrganizationParty(AncillaryRoleEnum arg0)`
- `PhysicalSettlementTermsBuilder setPhysicalSettlementPeriod(PhysicalSettlementPeriod arg0)`
- `PhysicalSettlementTermsBuilder setClearedPhysicalSettlement(Boolean arg0)`
- `PhysicalSettlementTermsBuilder setEscrow(Boolean arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `PhysicalSettlementPeriodBuilder getPhysicalSettlementPeriod()`
- `MetaFieldsBuilder getMeta()`
- `DeliverableObligationsBuilder getDeliverableObligations()`
- `PhysicalSettlementPeriodBuilder getOrCreatePhysicalSettlementPeriod()`
- `DeliverableObligationsBuilder getOrCreateDeliverableObligations()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PhysicalSettlementTermsBuilder prune()`

