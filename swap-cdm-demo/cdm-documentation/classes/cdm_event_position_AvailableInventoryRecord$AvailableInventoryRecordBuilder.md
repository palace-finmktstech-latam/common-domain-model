# AvailableInventoryRecordBuilder

**Full Name:** `cdm.event.position.AvailableInventoryRecord$AvailableInventoryRecordBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.AvailableInventoryRecord`
- `cdm.event.position.InventoryRecord$InventoryRecordBuilder`

### Methods

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
- `List getPartyRole()`
- `List getCollateral()`

#### Adder Methods

- `AvailableInventoryRecordBuilder addPartyRole(List arg0)`
- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0)`
- `AvailableInventoryRecordBuilder addPartyRole(PartyRole arg0, int arg1)`
- `AvailableInventoryRecordBuilder addCollateral(List arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0)`
- `AvailableInventoryRecordBuilder addCollateral(CollateralProvisions arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AvailableInventoryRecordBuilder prune()`

