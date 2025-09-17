# AvailableInventoryRecordBuilderImpl

**Full Name:** `cdm.event.position.AvailableInventoryRecord$AvailableInventoryRecordBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.position.InventoryRecord$InventoryRecordBuilderImpl`

### Implemented Interfaces

- `cdm.event.position.AvailableInventoryRecord$AvailableInventoryRecordBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| expirationDateTime | `ZonedDateTime` |  |
| collateral | `java.util.List<cdm.product.collateral.CollateralProvisions$CollateralProvisionsBuilder>` |  |
| partyRole | `java.util.List<cdm.base.staticdata.party.PartyRole$PartyRoleBuilder>` |  |
| quantity | `QuantityBuilder` |  |
| interestRate | `PriceBuilder` |  |

### Methods

#### Builder Methods

- `AvailableInventoryRecord build()`

#### Setter Methods

- `AvailableInventoryRecordBuilder setQuantity(Quantity arg0)`
- `AvailableInventoryRecordBuilder setCollateral(List arg0)`
- `AvailableInventoryRecordBuilder setExpirationDateTime(ZonedDateTime arg0)`
- `AvailableInventoryRecordBuilder setIdentifer(AssignedIdentifier arg0)`
- `AvailableInventoryRecordBuilder setInterestRate(Price arg0)`
- `AvailableInventoryRecordBuilder setPartyRole(List arg0)`
- `AvailableInventoryRecordBuilder setSecurity(Security arg0)`

#### Getter Methods

- `QuantityBuilder getQuantity()`
- `QuantityBuilder getOrCreateQuantity()`
- `List getPartyRole()`
- `List getCollateral()`
- `CollateralProvisionsBuilder getOrCreateCollateral(int arg0)`
- `PriceBuilder getInterestRate()`
- `PriceBuilder getOrCreateInterestRate()`
- `ZonedDateTime getExpirationDateTime()`
- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`

#### Adder Methods

- `AvailableInventoryRecordBuilder addPartyRole(List arg0)`
- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0, int arg1)`
- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0)`
- `AvailableInventoryRecordBuilder addCollateral(List arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AvailableInventoryRecordBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AvailableInventoryRecordBuilder prune()`
- `AvailableInventoryRecordBuilder toBuilder()`
- `boolean hasData()`

