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
- `getTradeReference()` → `List` [Getter]
- `getParty()` → `List` [Getter]
- `getProduct()` → `List` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getProductQualifier()` → `List` [Getter]
- `getTotalPosition()` → `Boolean` [Getter]
- `getPositionStatus()` → `PositionStatusEnum` [Getter]

### AggregationParametersBuilder
**Implements:** `AggregationParameters` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setTradeReference(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `AggregationParametersBuilder` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getOrCreateProduct(int arg0)` → `NonTransferableProductBuilder` [Getter]
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeBuilder` [Getter]
- `getParty()` → `List` [Getter]
- `getProduct()` → `List` [Getter]
- `setProduct(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setPartyValue(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setDateTime(ZonedDateTime arg0)` → `AggregationParametersBuilder` [Setter]

### AvailableInventory
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AvailableInventory` [Builder]
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `getAvailableInventoryType()` → `AvailableInventoryTypeEnum` [Getter]
- `getMessageInformation()` → `MessageInformation` [Getter]

### AvailableInventoryBuilder
**Implements:** `AvailableInventory` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `getOrCreateAvailableInventoryRecord(int arg0)` → `AvailableInventoryRecordBuilder` [Getter]
- `setAvailableInventoryRecord(List arg0)` → `AvailableInventoryBuilder` [Setter]
- `setMessageInformation(MessageInformation arg0)` → `AvailableInventoryBuilder` [Setter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `AvailableInventoryBuilder` [Setter]
- `getOrCreateParty(int arg0)` → `PartyBuilder` [Getter]
- `setParty(List arg0)` → `AvailableInventoryBuilder` [Setter]
- `getMessageInformation()` → `MessageInformationBuilder` [Getter]

### AvailableInventoryRecord
**Implements:** `InventoryRecord` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AvailableInventoryRecord` [Builder]
- `getQuantity()` → `Quantity` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getCollateral()` → `List` [Getter]
- `getInterestRate()` → `Price` [Getter]
- `getExpirationDateTime()` → `ZonedDateTime` [Getter]

### AvailableInventoryRecordBuilder
**Implements:** `AvailableInventoryRecord` `InventoryRecord$InventoryRecordBuilder` 

**Key Methods:**
- `getQuantity()` → `QuantityBuilder` [Getter]
- `setQuantity(Quantity arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getCollateral()` → `List` [Getter]
- `setCollateral(List arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreateCollateral(int arg0)` → `CollateralProvisionsBuilder` [Getter]
- `getInterestRate()` → `PriceBuilder` [Getter]
- `setExpirationDateTime(ZonedDateTime arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `setIdentifer(AssignedIdentifier arg0)` → `AvailableInventoryRecordBuilder` [Setter]

### ContractBase
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ContractBase` [Builder]
- `getExecutionDetails()` → `ReferenceWithMetaExecutionDetails` [Getter]
- `getContractDetails()` → `ReferenceWithMetaContractDetails` [Getter]
- `getCollateral()` → `ReferenceWithMetaCollateral` [Getter]

### ContractBaseBuilder
**Implements:** `ContractBase` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getExecutionDetails()` → `ReferenceWithMetaExecutionDetailsBuilder` [Getter]
- `getContractDetails()` → `ReferenceWithMetaContractDetailsBuilder` [Getter]
- `getCollateral()` → `ReferenceWithMetaCollateralBuilder` [Getter]
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `ContractBaseBuilder` [Setter]
- `getOrCreateCollateral()` → `ReferenceWithMetaCollateralBuilder` [Getter]
- `getOrCreateExecutionDetails()` → `ReferenceWithMetaExecutionDetailsBuilder` [Getter]
- `setContractDetailsValue(ContractDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setExecutionDetailsValue(ExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setCollateralValue(Collateral arg0)` → `ContractBaseBuilder` [Setter]

### CounterpartyPosition
**Implements:** `ContractBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CounterpartyPosition` [Builder]
- `getPartyRole()` → `List` [Getter]
- `getTradeReference()` → `List` [Getter]
- `getPositionBase()` → `TradableProduct` [Getter]
- `getOpenDateTime()` → `LocalDateTime` [Getter]
- `getPositionIdentifier()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### CounterpartyPositionBuilder
**Implements:** `CounterpartyPosition` `ContractBase$ContractBaseBuilder` 

**Key Methods:**
- `getPartyRole()` → `List` [Getter]
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setTradeReference(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getPositionBase()` → `TradableProductBuilder` [Getter]
- `getPositionIdentifier()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### Inventory
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Inventory` [Builder]
- `getInventoryRecord()` → `List` [Getter]

### InventoryBuilder
**Implements:** `Inventory` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateInventoryRecord(int arg0)` → `InventoryRecordBuilder` [Getter]
- `getInventoryRecord()` → `List` [Getter]
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
- `getSecurity()` → `SecurityBuilder` [Getter]
- `getOrCreateSecurity()` → `SecurityBuilder` [Getter]
- `setIdentifer(AssignedIdentifier arg0)` → `InventoryRecordBuilder` [Setter]
- `getOrCreateIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `getIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `setSecurity(Security arg0)` → `InventoryRecordBuilder` [Setter]

### Portfolio
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Portfolio` [Builder]
- `getPortfolioState()` → `PortfolioState` [Getter]
- `getAggregationParameters()` → `AggregationParameters` [Getter]

### PortfolioBuilder
**Implements:** `Portfolio` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateAggregationParameters()` → `AggregationParametersBuilder` [Getter]
- `getPortfolioState()` → `PortfolioStateBuilder` [Getter]
- `getAggregationParameters()` → `AggregationParametersBuilder` [Getter]
- `setPortfolioState(PortfolioState arg0)` → `PortfolioBuilder` [Setter]
- `setAggregationParameters(AggregationParameters arg0)` → `PortfolioBuilder` [Setter]
- `getOrCreatePortfolioState()` → `PortfolioStateBuilder` [Getter]

### PortfolioState
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PortfolioState` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getLineage()` → `Lineage` [Getter]
- `getPositions()` → `List` [Getter]

### PortfolioStateBuilder
**Implements:** `PortfolioState` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PortfolioStateBuilder` [Setter]
- `getOrCreateLineage()` → `LineageBuilder` [Getter]
- `getOrCreatePositions(int arg0)` → `PositionBuilder` [Getter]
- `setPositions(List arg0)` → `PortfolioStateBuilder` [Setter]
- `getLineage()` → `LineageBuilder` [Getter]
- `getPositions()` → `List` [Getter]
- `setLineage(Lineage arg0)` → `PortfolioStateBuilder` [Setter]

### Position
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Position` [Builder]
- `getPriceQuantity()` → `List` [Getter]
- `getCashBalance()` → `Money` [Getter]
- `getTradeReference()` → `ReferenceWithMetaTradeState` [Getter]
- `getProduct()` → `Product` [Getter]

### PositionBuilder
**Implements:** `Position` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPriceQuantity()` → `List` [Getter]
- `setPriceQuantity(List arg0)` → `PositionBuilder` [Setter]
- `setCashBalance(Money arg0)` → `PositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `PositionBuilder` [Setter]
- `setTradeReferenceValue(TradeState arg0)` → `PositionBuilder` [Setter]
- `getCashBalance()` → `MoneyBuilder` [Getter]
- `getTradeReference()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]
- `getOrCreateTradeReference()` → `ReferenceWithMetaTradeStateBuilder` [Getter]

### SecurityLocate
**Implements:** `AvailableInventory` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SecurityLocate` [Builder]

### SecurityLocateBuilder
**Implements:** `SecurityLocate` `AvailableInventory$AvailableInventoryBuilder` 

**Key Methods:**
- `setAvailableInventoryRecord(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setMessageInformation(MessageInformation arg0)` → `SecurityLocateBuilder` [Setter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `SecurityLocateBuilder` [Setter]
- `setParty(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setPartyRole(List arg0)` → `SecurityLocateBuilder` [Setter]

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
- `setTradeReference(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `AggregationParametersBuilder` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getOrCreateProduct(int arg0)` → `NonTransferableProductBuilder` [Getter]
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeBuilder` [Getter]
- `getParty()` → `List` [Getter]
- `getProduct()` → `List` [Getter]
- `setProduct(List arg0)` → `AggregationParametersBuilder` [Setter]
- `setPartyValue(List arg0)` → `AggregationParametersBuilder` [Setter]

### AggregationParametersImpl
**Implements:** `AggregationParameters` 

**Key Methods:**
- `build()` → `AggregationParameters` [Builder]
- `setBuilderFields(AggregationParametersBuilder arg0)` → `void` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getParty()` → `List` [Getter]
- `getProduct()` → `List` [Getter]
- `getDateTime()` → `ZonedDateTime` [Getter]
- `getProductQualifier()` → `List` [Getter]
- `getTotalPosition()` → `Boolean` [Getter]
- `getPositionStatus()` → `PositionStatusEnum` [Getter]

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
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `getOrCreateAvailableInventoryRecord(int arg0)` → `AvailableInventoryRecordBuilder` [Getter]
- `setAvailableInventoryRecord(List arg0)` → `AvailableInventoryBuilder` [Setter]
- `setMessageInformation(MessageInformation arg0)` → `AvailableInventoryBuilder` [Setter]
- `getAvailableInventoryType()` → `AvailableInventoryTypeEnum` [Getter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `AvailableInventoryBuilder` [Setter]
- `getOrCreateParty(int arg0)` → `PartyBuilder` [Getter]

### AvailableInventoryImpl
**Implements:** `AvailableInventory` 

**Key Methods:**
- `build()` → `AvailableInventory` [Builder]
- `setBuilderFields(AvailableInventoryBuilder arg0)` → `void` [Setter]
- `getPartyRole()` → `List` [Getter]
- `getParty()` → `List` [Getter]
- `getAvailableInventoryRecord()` → `List` [Getter]
- `getAvailableInventoryType()` → `AvailableInventoryTypeEnum` [Getter]
- `getMessageInformation()` → `MessageInformation` [Getter]

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
- `getQuantity()` → `QuantityBuilder` [Getter]
- `setQuantity(Quantity arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreateQuantity()` → `QuantityBuilder` [Getter]
- `getPartyRole()` → `List` [Getter]
- `getCollateral()` → `List` [Getter]
- `setCollateral(List arg0)` → `AvailableInventoryRecordBuilder` [Setter]
- `getOrCreateCollateral(int arg0)` → `CollateralProvisionsBuilder` [Getter]
- `getInterestRate()` → `PriceBuilder` [Getter]
- `setExpirationDateTime(ZonedDateTime arg0)` → `AvailableInventoryRecordBuilder` [Setter]

### AvailableInventoryRecordImpl
**Extends:** `InventoryRecord$InventoryRecordImpl` 
**Implements:** `AvailableInventoryRecord` 

**Key Methods:**
- `build()` → `AvailableInventoryRecord` [Builder]
- `getQuantity()` → `Quantity` [Getter]
- `setBuilderFields(AvailableInventoryRecordBuilder arg0)` → `void` [Setter]
- `getPartyRole()` → `List` [Getter]
- `getCollateral()` → `List` [Getter]
- `getInterestRate()` → `Price` [Getter]
- `getExpirationDateTime()` → `ZonedDateTime` [Getter]

### ContractBaseBuilderImpl
**Implements:** `ContractBase$ContractBaseBuilder` 

**Fields:**
- `ReferenceWithMetaContractDetailsBuilder contractDetails`
- `ReferenceWithMetaExecutionDetailsBuilder executionDetails`
- `ReferenceWithMetaCollateralBuilder collateral`

**Key Methods:**
- `build()` → `ContractBase` [Builder]
- `getExecutionDetails()` → `ReferenceWithMetaExecutionDetailsBuilder` [Getter]
- `getContractDetails()` → `ReferenceWithMetaContractDetailsBuilder` [Getter]
- `getCollateral()` → `ReferenceWithMetaCollateralBuilder` [Getter]
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `ContractBaseBuilder` [Setter]
- `getOrCreateCollateral()` → `ReferenceWithMetaCollateralBuilder` [Getter]
- `getOrCreateExecutionDetails()` → `ReferenceWithMetaExecutionDetailsBuilder` [Getter]
- `setContractDetailsValue(ContractDetails arg0)` → `ContractBaseBuilder` [Setter]
- `setExecutionDetailsValue(ExecutionDetails arg0)` → `ContractBaseBuilder` [Setter]

### ContractBaseImpl
**Implements:** `ContractBase` 

**Key Methods:**
- `build()` → `ContractBase` [Builder]
- `setBuilderFields(ContractBaseBuilder arg0)` → `void` [Setter]
- `getExecutionDetails()` → `ReferenceWithMetaExecutionDetails` [Getter]
- `getContractDetails()` → `ReferenceWithMetaContractDetails` [Getter]
- `getCollateral()` → `ReferenceWithMetaCollateral` [Getter]

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
- `getPartyRole()` → `List` [Getter]
- `setExecutionDetails(ReferenceWithMetaExecutionDetails arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setCollateral(ReferenceWithMetaCollateral arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setTradeReference(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `setTradeReferenceValue(List arg0)` → `CounterpartyPositionBuilder` [Setter]
- `getTradeReference()` → `List` [Getter]
- `getOrCreateTradeReference(int arg0)` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getPositionBase()` → `TradableProductBuilder` [Getter]
- `getOpenDateTime()` → `LocalDateTime` [Getter]

### CounterpartyPositionImpl
**Extends:** `ContractBase$ContractBaseImpl` 
**Implements:** `CounterpartyPosition` 

**Key Methods:**
- `build()` → `CounterpartyPosition` [Builder]
- `setBuilderFields(CounterpartyPositionBuilder arg0)` → `void` [Setter]
- `getPartyRole()` → `List` [Getter]
- `getTradeReference()` → `List` [Getter]
- `getPositionBase()` → `TradableProduct` [Getter]
- `getOpenDateTime()` → `LocalDateTime` [Getter]
- `getPositionIdentifier()` → `List` [Getter]
- `getParty()` → `List` [Getter]

### InventoryBuilderImpl
**Implements:** `Inventory$InventoryBuilder` 

**Fields:**
- `List (List) inventoryRecord`

**Key Methods:**
- `build()` → `Inventory` [Builder]
- `getOrCreateInventoryRecord(int arg0)` → `InventoryRecordBuilder` [Getter]
- `getInventoryRecord()` → `List` [Getter]
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
- `getSecurity()` → `SecurityBuilder` [Getter]
- `getOrCreateSecurity()` → `SecurityBuilder` [Getter]
- `setIdentifer(AssignedIdentifier arg0)` → `InventoryRecordBuilder` [Setter]
- `getOrCreateIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `getIdentifer()` → `AssignedIdentifierBuilder` [Getter]
- `setSecurity(Security arg0)` → `InventoryRecordBuilder` [Setter]

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
- `getPortfolioState()` → `PortfolioStateBuilder` [Getter]
- `getAggregationParameters()` → `AggregationParametersBuilder` [Getter]
- `setPortfolioState(PortfolioState arg0)` → `PortfolioBuilder` [Setter]
- `setAggregationParameters(AggregationParameters arg0)` → `PortfolioBuilder` [Setter]
- `getOrCreatePortfolioState()` → `PortfolioStateBuilder` [Getter]

### PortfolioImpl
**Implements:** `Portfolio` 

**Key Methods:**
- `build()` → `Portfolio` [Builder]
- `setBuilderFields(PortfolioBuilder arg0)` → `void` [Setter]
- `getPortfolioState()` → `PortfolioState` [Getter]
- `getAggregationParameters()` → `AggregationParameters` [Getter]

### PortfolioStateBuilderImpl
**Implements:** `PortfolioState$PortfolioStateBuilder` 

**Fields:**
- `List (List) positions`
- `LineageBuilder lineage`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PortfolioState` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PortfolioStateBuilder` [Setter]
- `getOrCreateLineage()` → `LineageBuilder` [Getter]
- `getOrCreatePositions(int arg0)` → `PositionBuilder` [Getter]
- `setPositions(List arg0)` → `PortfolioStateBuilder` [Setter]
- `getLineage()` → `LineageBuilder` [Getter]
- `getPositions()` → `List` [Getter]
- `setLineage(Lineage arg0)` → `PortfolioStateBuilder` [Setter]

### PortfolioStateImpl
**Implements:** `PortfolioState` 

**Key Methods:**
- `build()` → `PortfolioState` [Builder]
- `setBuilderFields(PortfolioStateBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getLineage()` → `Lineage` [Getter]
- `getPositions()` → `List` [Getter]

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
- `setPriceQuantity(List arg0)` → `PositionBuilder` [Setter]
- `setCashBalance(Money arg0)` → `PositionBuilder` [Setter]
- `setTradeReference(ReferenceWithMetaTradeState arg0)` → `PositionBuilder` [Setter]
- `setTradeReferenceValue(TradeState arg0)` → `PositionBuilder` [Setter]
- `getCashBalance()` → `MoneyBuilder` [Getter]
- `getTradeReference()` → `ReferenceWithMetaTradeStateBuilder` [Getter]
- `getOrCreatePriceQuantity(int arg0)` → `PriceQuantityBuilder` [Getter]
- `getOrCreateProduct()` → `ProductBuilder` [Getter]

### PositionImpl
**Implements:** `Position` 

**Key Methods:**
- `build()` → `Position` [Builder]
- `setBuilderFields(PositionBuilder arg0)` → `void` [Setter]
- `getPriceQuantity()` → `List` [Getter]
- `getCashBalance()` → `Money` [Getter]
- `getTradeReference()` → `ReferenceWithMetaTradeState` [Getter]
- `getProduct()` → `Product` [Getter]

### SecurityLocateBuilderImpl
**Extends:** `AvailableInventory$AvailableInventoryBuilderImpl` 
**Implements:** `SecurityLocate$SecurityLocateBuilder` 

**Key Methods:**
- `build()` → `SecurityLocate` [Builder]
- `setAvailableInventoryRecord(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setMessageInformation(MessageInformation arg0)` → `SecurityLocateBuilder` [Setter]
- `setAvailableInventoryType(AvailableInventoryTypeEnum arg0)` → `SecurityLocateBuilder` [Setter]
- `setParty(List arg0)` → `SecurityLocateBuilder` [Setter]
- `setPartyRole(List arg0)` → `SecurityLocateBuilder` [Setter]

### SecurityLocateImpl
**Extends:** `AvailableInventory$AvailableInventoryImpl` 
**Implements:** `SecurityLocate` 

**Key Methods:**
- `build()` → `SecurityLocate` [Builder]
- `setBuilderFields(SecurityLocateBuilder arg0)` → `void` [Setter]

