# Package: cdm.event.position

## Enums

### AvailableInventoryTypeEnum
**Values:**
- `AvailableToLend`
- `RequestToBorrow`

### PositionStatusEnum
**Values:**
- `Executed`
- `Formed`
- `Settled`
- `Cancelled`
- `Closed`

## Interfaces

### AggregationParameters
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AggregationParameters` [Builder]
- `getProductQualifier()` → `List` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getPositionStatus()` → `PositionStatusEnum` [Getter]
- `getTotalPosition()` → `Boolean` [Getter]
- `getTradeReference()` → `List` [Getter]
- `getProduct()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### AggregationParametersBuilder
**Implements:** `AggregationParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setProductQualifier(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setPartyValue(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setDateTime(ZonedDateTime arg0)` → `AggregationParametersBuilder` [Setter]
- `setTotalPosition(Boolean arg0)` → `AggregationParametersBuilder` [Setter]
- `setPositionStatus(PositionStatusEnum arg0)` → `AggregationParametersBuilder` [Setter]
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeBuilder` [Getter]
- `getOrCreateProduct(int arg0)` → `NonTransferableProductBuilder` [Getter]
- `setProduct(List arg0)` → `AggregationParametersBuilder` [Setter]
- `getTradeReference()` → `List` [Getter]
- `setTradeReference(List arg0)` → `AggregationParametersBuilder` [Setter]

### AvailableInventory
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AvailableInventory` [Builder]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `getAvailableInventoryType()` → `AvailableInventoryTypeEnum` [Getter]
- `getMessageInformation()` → `MessageInformation` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### AvailableInventoryBuilder
**Implements:** `AvailableInventory` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPartyRole(List arg0)` → `AvailableInventoryBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `setMessageInformation(MessageInformation arg0)` → `AvailableInventoryBuilder` [Setter]
- `getOrCreateAvailableInventoryRecord(int arg0)` → `AvailableInventoryRecordBuilder` [Getter]
- `setAvailableInventoryRecord(List arg0)` → `AvailableInventoryBuilder` [Setter]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `AvailableInventoryBuilder` [Setter]
- `getMessageInformation()` → `MessageInformationBuilder` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### AvailableInventoryRecord
**Implements:** `InventoryRecord` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AvailableInventoryRecord` [Builder]
- `getQuantity()` → `Quantity` [Getter]
- `getInterestRate()` → `Price` [Getter]
- `getExpirationDateTime()` → `ZonedDateTime` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getCollateral()` → `List` [Getter]

### AvailableInventoryRecordBuilder
**Implements:** `AvailableInventoryRecord` `InventoryRecord$InventoryRecordBuilder` 

**Key Methods:**
- `setCollateral(List arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreateCollateral(int arg0)` → `CollateralProvisionsBuilder` [Getter]
- `setPartyRole(List arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `setSecurity(Security arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getQuantity()` → `QuantityBuilder` [Getter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `setQuantity(Quantity arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `setIdentifer(AssignedIdentifier arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `setInterestRate(Price arg0)` → `AvailableInventoryRecordBuilder` [Setter]

### ContractBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ContractBase` [Builder]
- `getContractDetails()` → `ReferenceWithMetaContractDetails` [Getter]
- `getCollateral()` → `ReferenceWithMetaCollateral` [Getter]
- `getExecutionDetails()` → `ReferenceWithMetaExecutionDetails` [Getter]

### ContractBaseBuilder
**Implements:** `ContractBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `ContractBaseBuilder` [Setter]
- `getOrCreateCollateral()` → `ReferenceWithMetaCollateralBuilder` [Getter]
- `setCollateralValue(Collateral arg0)` → `ContractBaseBuilder` [Setter]
- `setContractDetailsValue(ContractDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setExecutionDetailsValue(ExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setContractDetails(ReferenceWithMetaContractDetails arg0)` → `ContractBaseBuilder` [Setter]
- `getOrCreateContractDetails()` → `ReferenceWithMetaContractDetailsBuilder` [Getter]
- `getContractDetails()` → `ReferenceWithMetaContractDetailsBuilder` [Getter]
- `getCollateral()` → `ReferenceWithMetaCollateralBuilder` [Getter]

### CounterpartyPosition
**Implements:** `ContractBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CounterpartyPosition` [Builder]
- `getOpenDateTime()` → `LocalDateTime` [Getter]
- `getPositionBase()` → `TradableProduct` [Getter]
- `getPositionIdentifier()` → `List` [Getter]
- `getTradeReference()` → `List` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### CounterpartyPositionBuilder
**Implements:** `CounterpartyPosition` `ContractBase$ContractBaseBuilder` 

**Key Methods:**
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setPartyRole(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `setOpenDateTime(LocalDateTime arg0)` → `CounterpartyPositionBuilder` [Setter]
- `getOrCreatePositionBase()` → `TradableProductBuilder` [Getter]
- `setPositionIdentifier(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setCollateralValue(Collateral arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setContractDetailsValue(ContractDetails arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setExecutionDetailsValue(ExecutionDetails arg0)` → `CounterpartyPositionBuilder` [Setter]

### Inventory
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Inventory` [Builder]
- `getInventoryRecord()` → `List` [Getter]

### InventoryBuilder
**Implements:** `Inventory` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInventoryRecord()` → `List` [Getter]
- `getOrCreateInventoryRecord(int arg0)` → `InventoryRecordBuilder` [Getter]
- `setInventoryRecord(List arg0)` → `InventoryBuilder` [Setter]

### InventoryRecord
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InventoryRecord` [Builder]
- `getSecurity()` → `Security` [Getter]
- `getIdentifer()` → `AssignedIdentifier` [Getter]

### InventoryRecordBuilder
**Implements:** `InventoryRecord` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSecurity(Security arg0)` → `InventoryRecordBuilder` [Setter]
- `getSecurity()` → `SecurityBuilder` [Getter]
- `setIdentifer(AssignedIdentifier arg0)` → `InventoryRecordBuilder` [Setter]
- `getOrCreateIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `getIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `getOrCreateSecurity()` → `SecurityBuilder` [Getter]

### Portfolio
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Portfolio` [Builder]
- `getAggregationParameters()` → `AggregationParameters` [Getter]
- `getPortfolioState()` → `PortfolioState` [Getter]

### PortfolioBuilder
**Implements:** `Portfolio` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAggregationParameters()` → `AggregationParametersBuilder` [Getter]
- `getAggregationParameters()` → `AggregationParametersBuilder` [Getter]
- `getPortfolioState()` → `PortfolioStateBuilder` [Getter]
- `setAggregationParameters(AggregationParameters arg0)` → `PortfolioBuilder` [Setter]
- `getOrCreatePortfolioState()` → `PortfolioStateBuilder` [Getter]
- `setPortfolioState(PortfolioState arg0)` → `PortfolioBuilder` [Setter]

### PortfolioState
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PortfolioState` [Builder]
- `getLineage()` → `Lineage` [Getter]
- `getPositions()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PortfolioStateBuilder
**Implements:** `PortfolioState` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setPositions(List arg0)` → `PortfolioStateBuilder` [Setter]
- `getOrCreatePositions(int arg0)` → `PositionBuilder` [Getter]
- `getOrCreateLineage()` → `LineageBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getLineage()` → `LineageBuilder` [Getter]
- `getPositions()` → `List` [Getter]
- `setLineage(Lineage arg0)` → `PortfolioStateBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `PortfolioStateBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### Position
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Position` [Builder]
- `getPriceQuantity()` → `List` [Getter]
- `getTradeReference()` → `ReferenceWithMetaTradeState` [Getter]
- `getCashBalance()` → `Money` [Getter]
- `getProduct()` → `Product` [Getter]

### PositionBuilder
**Implements:** `Position` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPriceQuantity()` → `List` [Getter]
- `getOrCreateTradeReference()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `getOrCreateCashBalance()` → `MoneyBuilder` [Getter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]
- `setProduct(Product arg0)` → `PositionBuilder` [Setter]
- `getTradeReference()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `PositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `PositionBuilder` [Setter]
- `setCashBalance(Money arg0)` → `PositionBuilder` [Setter]

### SecurityLocate
**Implements:** `AvailableInventory` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SecurityLocate` [Builder]

### SecurityLocateBuilder
**Implements:** `SecurityLocate` `AvailableInventory$AvailableInventoryBuilder` 

**Key Methods:**
- `setPartyRole(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setMessageInformation(MessageInformation arg0)` → `SecurityLocateBuilder` [Setter]
- `setAvailableInventoryRecord(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `SecurityLocateBuilder` [Setter]
- `setParty(List arg0)` → `SecurityLocateBuilder` [Setter]

## Concrete Classes

### AggregationParametersBuilderImpl
**Implements:** `AggregationParameters$AggregationParametersBuilder` 

**Fields:**
- `ZonedDateTime dateTime`
- `Boolean totalPosition`
- `PositionStatusEnum positionStatus`
- `List (List) party`
- `List (List) product`
- `List (List) productQualifier`
- `List (List) tradeReference`

**Key Methods:**
- `build()` → `AggregationParameters` [Builder]
- `getProductQualifier()` → `List` [Getter]
- `setProductQualifier(List arg0)` → `AggregationParametersBuilder` [Setter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `setPartyValue(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setDateTime(ZonedDateTime arg0)` → `AggregationParametersBuilder` [Setter]
- `setTotalPosition(Boolean arg0)` → `AggregationParametersBuilder` [Setter]
- `getPositionStatus()` → `PositionStatusEnum` [Getter]
- `getTotalPosition()` → `Boolean` [Getter]
- `setPositionStatus(PositionStatusEnum arg0)` → `AggregationParametersBuilder` [Setter]

### AggregationParametersImpl
**Implements:** `AggregationParameters` 

**Key Methods:**
- `build()` → `AggregationParameters` [Builder]
- `getProductQualifier()` → `List` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `setBuilderFields(AggregationParametersBuilder arg0)` → `void` [Setter]
- `getPositionStatus()` → `PositionStatusEnum` [Getter]
- `getTotalPosition()` → `Boolean` [Getter]
- `getTradeReference()` → `List` [Getter]
- `getProduct()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### AvailableInventoryBuilderImpl
**Implements:** `AvailableInventory$AvailableInventoryBuilder` 

**Fields:**
- `AvailableInventoryTypeEnum availableInventoryType`
- `MessageInformationBuilder messageInformation`
- `List (List) party`
- `List (List) partyRole`
- `List (List) availableInventoryRecord`

**Key Methods:**
- `build()` → `AvailableInventory` [Builder]
- `setPartyRole(List arg0)` → `AvailableInventoryBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `setMessageInformation(MessageInformation arg0)` → `AvailableInventoryBuilder` [Setter]
- `getOrCreateAvailableInventoryRecord(int arg0)` → `AvailableInventoryRecordBuilder` [Getter]
- `setAvailableInventoryRecord(List arg0)` → `AvailableInventoryBuilder` [Setter]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `getAvailableInventoryType()` → `AvailableInventoryTypeEnum` [Getter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `AvailableInventoryBuilder` [Setter]
- `getMessageInformation()` → `MessageInformationBuilder` [Getter]

### AvailableInventoryImpl
**Implements:** `AvailableInventory` 

**Key Methods:**
- `build()` → `AvailableInventory` [Builder]
- `setBuilderFields(AvailableInventoryBuilder arg0)` → `void` [Setter]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `getAvailableInventoryType()` → `AvailableInventoryTypeEnum` [Getter]
- `getMessageInformation()` → `MessageInformation` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### AvailableInventoryRecordBuilderImpl
**Extends:** `InventoryRecord$InventoryRecordBuilderImpl` 
**Implements:** `AvailableInventoryRecord$AvailableInventoryRecordBuilder` 

**Fields:**
- `ZonedDateTime expirationDateTime`
- `List (List) collateral`
- `List (List) partyRole`
- `QuantityBuilder quantity`
- `PriceBuilder interestRate`

**Key Methods:**
- `build()` → `AvailableInventoryRecord` [Builder]
- `setCollateral(List arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreateCollateral(int arg0)` → `CollateralProvisionsBuilder` [Getter]
- `setPartyRole(List arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `setSecurity(Security arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getQuantity()` → `QuantityBuilder` [Getter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `setQuantity(Quantity arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `setIdentifer(AssignedIdentifier arg0)` → `AvailableInventoryRecordBuilder` [Setter]

### AvailableInventoryRecordImpl
**Extends:** `InventoryRecord$InventoryRecordImpl` 
**Implements:** `AvailableInventoryRecord` 

**Key Methods:**
- `build()` → `AvailableInventoryRecord` [Builder]
- `getQuantity()` → `Quantity` [Getter]
- `setBuilderFields(AvailableInventoryRecordBuilder arg0)` → `void` [Setter]
- `getInterestRate()` → `Price` [Getter]
- `getExpirationDateTime()` → `ZonedDateTime` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getCollateral()` → `List` [Getter]

### ContractBaseBuilderImpl
**Implements:** `ContractBase$ContractBaseBuilder` 

**Fields:**
- `ReferenceWithMetaContractDetailsBuilder contractDetails`
- `ReferenceWithMetaExecutionDetailsBuilder executionDetails`
- `ReferenceWithMetaCollateralBuilder collateral`

**Key Methods:**
- `build()` → `ContractBase` [Builder]
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `ContractBaseBuilder` [Setter]
- `getOrCreateCollateral()` → `ReferenceWithMetaCollateralBuilder` [Getter]
- `setCollateralValue(Collateral arg0)` → `ContractBaseBuilder` [Setter]
- `setContractDetailsValue(ContractDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setExecutionDetailsValue(ExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setContractDetails(ReferenceWithMetaContractDetails arg0)` → `ContractBaseBuilder` [Setter]
- `getOrCreateContractDetails()` → `ReferenceWithMetaContractDetailsBuilder` [Getter]
- `getContractDetails()` → `ReferenceWithMetaContractDetailsBuilder` [Getter]

### ContractBaseImpl
**Implements:** `ContractBase` 

**Key Methods:**
- `build()` → `ContractBase` [Builder]
- `setBuilderFields(ContractBaseBuilder arg0)` → `void` [Setter]
- `getContractDetails()` → `ReferenceWithMetaContractDetails` [Getter]
- `getCollateral()` → `ReferenceWithMetaCollateral` [Getter]
- `getExecutionDetails()` → `ReferenceWithMetaExecutionDetails` [Getter]

### CounterpartyPositionBuilderImpl
**Extends:** `ContractBase$ContractBaseBuilderImpl` 
**Implements:** `CounterpartyPosition$CounterpartyPositionBuilder` 

**Fields:**
- `List (List) positionIdentifier`
- `LocalDateTime openDateTime`
- `List (List) tradeReference`
- `List (List) party`
- `List (List) partyRole`
- `TradableProductBuilder positionBase`

**Key Methods:**
- `build()` → `CounterpartyPosition` [Builder]
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setPartyRole(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `getOrCreatePartyRole(int arg0)` → `PartyRoleBuilder` [Getter]
- `setOpenDateTime(LocalDateTime arg0)` → `CounterpartyPositionBuilder` [Setter]
- `getOrCreatePositionBase()` → `TradableProductBuilder` [Getter]
- `setPositionIdentifier(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setCollateralValue(Collateral arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setContractDetailsValue(ContractDetails arg0)` → `CounterpartyPositionBuilder` [Setter]

### CounterpartyPositionImpl
**Extends:** `ContractBase$ContractBaseImpl` 
**Implements:** `CounterpartyPosition` 

**Key Methods:**
- `build()` → `CounterpartyPosition` [Builder]
- `setBuilderFields(CounterpartyPositionBuilder arg0)` → `void` [Setter]
- `getOpenDateTime()` → `LocalDateTime` [Getter]
- `getPositionBase()` → `TradableProduct` [Getter]
- `getPositionIdentifier()` → `List` [Getter]
- `getTradeReference()` → `List` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### InventoryBuilderImpl
**Implements:** `Inventory$InventoryBuilder` 

**Fields:**
- `List (List) inventoryRecord`

**Key Methods:**
- `build()` → `Inventory` [Builder]
- `getInventoryRecord()` → `List` [Getter]
- `getOrCreateInventoryRecord(int arg0)` → `InventoryRecordBuilder` [Getter]
- `setInventoryRecord(List arg0)` → `InventoryBuilder` [Setter]

### InventoryImpl
**Implements:** `Inventory` 

**Key Methods:**
- `build()` → `Inventory` [Builder]
- `setBuilderFields(InventoryBuilder arg0)` → `void` [Setter]
- `getInventoryRecord()` → `List` [Getter]

### InventoryRecordBuilderImpl
**Implements:** `InventoryRecord$InventoryRecordBuilder` 

**Fields:**
- `AssignedIdentifierBuilder identifer`
- `SecurityBuilder security`

**Key Methods:**
- `build()` → `InventoryRecord` [Builder]
- `setSecurity(Security arg0)` → `InventoryRecordBuilder` [Setter]
- `getSecurity()` → `SecurityBuilder` [Getter]
- `setIdentifer(AssignedIdentifier arg0)` → `InventoryRecordBuilder` [Setter]
- `getOrCreateIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `getIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `getOrCreateSecurity()` → `SecurityBuilder` [Getter]

### InventoryRecordImpl
**Implements:** `InventoryRecord` 

**Key Methods:**
- `build()` → `InventoryRecord` [Builder]
- `setBuilderFields(InventoryRecordBuilder arg0)` → `void` [Setter]
- `getSecurity()` → `Security` [Getter]
- `getIdentifer()` → `AssignedIdentifier` [Getter]

### PortfolioBuilderImpl
**Implements:** `Portfolio$PortfolioBuilder` 

**Fields:**
- `AggregationParametersBuilder aggregationParameters`
- `PortfolioStateBuilder portfolioState`

**Key Methods:**
- `build()` → `Portfolio` [Builder]
- `getOrCreateAggregationParameters()` → `AggregationParametersBuilder` [Getter]
- `getAggregationParameters()` → `AggregationParametersBuilder` [Getter]
- `getPortfolioState()` → `PortfolioStateBuilder` [Getter]
- `setAggregationParameters(AggregationParameters arg0)` → `PortfolioBuilder` [Setter]
- `getOrCreatePortfolioState()` → `PortfolioStateBuilder` [Getter]
- `setPortfolioState(PortfolioState arg0)` → `PortfolioBuilder` [Setter]

### PortfolioImpl
**Implements:** `Portfolio` 

**Key Methods:**
- `build()` → `Portfolio` [Builder]
- `setBuilderFields(PortfolioBuilder arg0)` → `void` [Setter]
- `getAggregationParameters()` → `AggregationParameters` [Getter]
- `getPortfolioState()` → `PortfolioState` [Getter]

### PortfolioStateBuilderImpl
**Implements:** `PortfolioState$PortfolioStateBuilder` 

**Fields:**
- `List (List) positions`
- `LineageBuilder lineage`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PortfolioState` [Builder]
- `setPositions(List arg0)` → `PortfolioStateBuilder` [Setter]
- `getOrCreatePositions(int arg0)` → `PositionBuilder` [Getter]
- `getOrCreateLineage()` → `LineageBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getLineage()` → `LineageBuilder` [Getter]
- `getPositions()` → `List` [Getter]
- `setLineage(Lineage arg0)` → `PortfolioStateBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `PortfolioStateBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### PortfolioStateImpl
**Implements:** `PortfolioState` 

**Key Methods:**
- `build()` → `PortfolioState` [Builder]
- `setBuilderFields(PortfolioStateBuilder arg0)` → `void` [Setter]
- `getLineage()` → `Lineage` [Getter]
- `getPositions()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PositionBuilderImpl
**Implements:** `Position$PositionBuilder` 

**Fields:**
- `List (List) priceQuantity`
- `ProductBuilder product`
- `MoneyBuilder cashBalance`
- `ReferenceWithMetaTradeStateBuilder tradeReference`

**Key Methods:**
- `build()` → `Position` [Builder]
- `getPriceQuantity()` → `List` [Getter]
- `getOrCreateTradeReference()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `getOrCreateCashBalance()` → `MoneyBuilder` [Getter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]
- `setProduct(Product arg0)` → `PositionBuilder` [Setter]
- `getTradeReference()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `setPriceQuantity(List arg0)` → `PositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `PositionBuilder` [Setter]

### PositionImpl
**Implements:** `Position` 

**Key Methods:**
- `build()` → `Position` [Builder]
- `getPriceQuantity()` → `List` [Getter]
- `setBuilderFields(PositionBuilder arg0)` → `void` [Setter]
- `getTradeReference()` → `ReferenceWithMetaTradeState` [Getter]
- `getCashBalance()` → `Money` [Getter]
- `getProduct()` → `Product` [Getter]

### SecurityLocateBuilderImpl
**Extends:** `AvailableInventory$AvailableInventoryBuilderImpl` 
**Implements:** `SecurityLocate$SecurityLocateBuilder` 

**Key Methods:**
- `build()` → `SecurityLocate` [Builder]
- `setPartyRole(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setMessageInformation(MessageInformation arg0)` → `SecurityLocateBuilder` [Setter]
- `setAvailableInventoryRecord(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `SecurityLocateBuilder` [Setter]
- `setParty(List arg0)` → `SecurityLocateBuilder` [Setter]

### SecurityLocateImpl
**Extends:** `AvailableInventory$AvailableInventoryImpl` 
**Implements:** `SecurityLocate` 

**Key Methods:**
- `build()` → `SecurityLocate` [Builder]
- `setBuilderFields(SecurityLocateBuilder arg0)` → `void` [Setter]

