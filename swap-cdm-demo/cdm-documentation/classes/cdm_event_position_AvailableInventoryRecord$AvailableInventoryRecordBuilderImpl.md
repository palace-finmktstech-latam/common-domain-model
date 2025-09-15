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

- `AvailableInventoryRecordBuilder setCollateral(List arg0)`
- `AvailableInventoryRecordBuilder setPartyRole(List arg0)`
- `AvailableInventoryRecordBuilder setSecurity(Security arg0)`
- `AvailableInventoryRecordBuilder setQuantity(Quantity arg0)`
- `AvailableInventoryRecordBuilder setIdentifer(AssignedIdentifier arg0)`
- `AvailableInventoryRecordBuilder setInterestRate(Price arg0)`
- `AvailableInventoryRecordBuilder setExpirationDateTime(ZonedDateTime arg0)`

#### Getter Methods

- `CollateralProvisionsBuilder getOrCreateCollateral(int arg0)`
- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`
- `QuantityBuilder getQuantity()`
- `QuantityBuilder getOrCreateQuantity()`
- `PriceBuilder getOrCreateInterestRate()`
- `PriceBuilder getInterestRate()`
- `ZonedDateTime getExpirationDateTime()`
- `List getPartyRole()`
- `List getCollateral()`

#### Adder Methods

- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0)`
- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0, int arg1)`
- `AvailableInventoryRecordBuilder addPartyRole(List arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0, int arg1)`
- `AvailableInventoryRecordBuilder addCollateral(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AvailableInventoryRecordBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AvailableInventoryRecordBuilder toBuilder()`
- `AvailableInventoryRecordBuilder prune()`

