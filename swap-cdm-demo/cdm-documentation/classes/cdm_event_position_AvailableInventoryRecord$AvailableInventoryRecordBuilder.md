# AvailableInventoryRecordBuilder

**Full Name:** `cdm.event.position.AvailableInventoryRecord$AvailableInventoryRecordBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.AvailableInventoryRecord`
- `cdm.event.position.InventoryRecord$InventoryRecordBuilder`

### Methods

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
- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`

#### Adder Methods

- `AvailableInventoryRecordBuilder addPartyRole(List arg0)`
- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0, int arg1)`
- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0)`
- `AvailableInventoryRecordBuilder addCollateral(List arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AvailableInventoryRecordBuilder prune()`

