# PhysicalSettlementTermsBuilderImpl

**Full Name:** `cdm.product.common.settlement.PhysicalSettlementTerms$PhysicalSettlementTermsBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PhysicalSettlementTerms$PhysicalSettlementTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| clearedPhysicalSettlement | `Boolean` |  |
| predeterminedClearingOrganizationParty | `AncillaryRoleEnum` |  |
| physicalSettlementPeriod | `PhysicalSettlementPeriodBuilder` |  |
| deliverableObligations | `DeliverableObligationsBuilder` |  |
| escrow | `Boolean` |  |
| sixtyBusinessDaySettlementCap | `Boolean` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PhysicalSettlementTerms build()`

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
- `Boolean getEscrow()`
- `Boolean getSixtyBusinessDaySettlementCap()`
- `Boolean getClearedPhysicalSettlement()`
- `AncillaryRoleEnum getPredeterminedClearingOrganizationParty()`
- `PhysicalSettlementPeriodBuilder getOrCreatePhysicalSettlementPeriod()`
- `DeliverableObligationsBuilder getOrCreateDeliverableObligations()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PhysicalSettlementTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PhysicalSettlementTermsBuilder prune()`
- `PhysicalSettlementTermsBuilder toBuilder()`
- `boolean hasData()`

