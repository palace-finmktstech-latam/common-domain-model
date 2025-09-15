# Package: cdm.base.staticdata.identifier

## Enums

### CommodityLocationIdentifierTypeEnum
**Values:**
- `DeliveryPoint`
- `EntryPoint`
- `InterconnectionPoint`
- `WithdrawalPoint`
- `DeliveryZone`
- `BuyerHub`
- `SellerHub`

### TradeIdentifierTypeEnum
**Values:**
- `UniqueTransactionIdentifier`
- `UniqueSwapIdentifier`

## Interfaces

### AssignedIdentifier
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `AssignedIdentifier` [Builder]
- `getVersion()` → `Integer` [Getter]
- `getIdentifier()` → `FieldWithMetaString` [Getter]

### AssignedIdentifierBuilder
**Implements:** `AssignedIdentifier` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setVersion(Integer arg0)` → `AssignedIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifier(FieldWithMetaString arg0)` → `AssignedIdentifierBuilder` [Setter]
- `setIdentifierValue(String arg0)` → `AssignedIdentifierBuilder` [Setter]
- `getIdentifier()` → `FieldWithMetaStringBuilder` [Getter]

### IdentifiedList
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `IdentifiedList` [Builder]
- `getListId()` → `Identifier` [Getter]
- `getPrice()` → `Price` [Getter]
- `getComponentId()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### IdentifiedListBuilder
**Implements:** `IdentifiedList` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreatePrice()` → `PriceBuilder` [Getter]
- `getOrCreateListId()` → `IdentifierBuilder` [Getter]
- `getOrCreateComponentId(int arg0)` → `IdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setPrice(Price arg0)` → `IdentifiedListBuilder` [Setter]
- `setListId(Identifier arg0)` → `IdentifiedListBuilder` [Setter]
- `setComponentId(List arg0)` → `IdentifiedListBuilder` [Setter]
- `getListId()` → `IdentifierBuilder` [Getter]
- `getPrice()` → `PriceBuilder` [Getter]
- `getComponentId()` → `List` [Getter]

### Identifier
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Identifier` [Builder]
- `getIssuerReference()` → `ReferenceWithMetaParty` [Getter]
- `getAssignedIdentifier()` → `List` [Getter]
- `getIssuer()` → `FieldWithMetaString` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### IdentifierBuilder
**Implements:** `Identifier` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setIssuer(FieldWithMetaString arg0)` → `IdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `IdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `IdentifierBuilder` [Setter]
- `getOrCreateIssuer()` → `FieldWithMetaStringBuilder` [Getter]
- `setIssuerValue(String arg0)` → `IdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `IdentifierBuilder` [Setter]
- `getOrCreateIssuerReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getIssuerReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getAssignedIdentifier()` → `List` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

### LocationIdentifier
**Implements:** `Identifier` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `LocationIdentifier` [Builder]
- `getLocationIdentifierType()` → `CommodityLocationIdentifierTypeEnum` [Getter]

### LocationIdentifierBuilder
**Implements:** `LocationIdentifier` `Identifier$IdentifierBuilder` 

**Key Methods:**
- `setIssuer(FieldWithMetaString arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `LocationIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `LocationIdentifierBuilder` [Setter]
- `setLocationIdentifierType(CommodityLocationIdentifierTypeEnum arg0)` → `LocationIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `LocationIdentifierBuilder` [Setter]

## Concrete Classes

### AssignedIdentifierBuilderImpl
**Implements:** `AssignedIdentifier$AssignedIdentifierBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder identifier`
- `Integer version`

**Key Methods:**
- `build()` → `AssignedIdentifier` [Builder]
- `setVersion(Integer arg0)` → `AssignedIdentifierBuilder` [Setter]
- `getVersion()` → `Integer` [Getter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `setIdentifier(FieldWithMetaString arg0)` → `AssignedIdentifierBuilder` [Setter]
- `setIdentifierValue(String arg0)` → `AssignedIdentifierBuilder` [Setter]
- `getIdentifier()` → `FieldWithMetaStringBuilder` [Getter]

### AssignedIdentifierImpl
**Implements:** `AssignedIdentifier` 

**Key Methods:**
- `build()` → `AssignedIdentifier` [Builder]
- `getVersion()` → `Integer` [Getter]
- `setBuilderFields(AssignedIdentifierBuilder arg0)` → `void` [Setter]
- `getIdentifier()` → `FieldWithMetaString` [Getter]

### IdentifiedListBuilderImpl
**Implements:** `IdentifiedList$IdentifiedListBuilder` 

**Fields:**
- `IdentifierBuilder listId`
- `List (List) componentId`
- `PriceBuilder price`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `IdentifiedList` [Builder]
- `getOrCreatePrice()` → `PriceBuilder` [Getter]
- `getOrCreateListId()` → `IdentifierBuilder` [Getter]
- `getOrCreateComponentId(int arg0)` → `IdentifierBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setPrice(Price arg0)` → `IdentifiedListBuilder` [Setter]
- `setListId(Identifier arg0)` → `IdentifiedListBuilder` [Setter]
- `setComponentId(List arg0)` → `IdentifiedListBuilder` [Setter]
- `getListId()` → `IdentifierBuilder` [Getter]
- `getPrice()` → `PriceBuilder` [Getter]

### IdentifiedListImpl
**Implements:** `IdentifiedList` 

**Key Methods:**
- `build()` → `IdentifiedList` [Builder]
- `setBuilderFields(IdentifiedListBuilder arg0)` → `void` [Setter]
- `getListId()` → `Identifier` [Getter]
- `getPrice()` → `Price` [Getter]
- `getComponentId()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### IdentifierBuilderImpl
**Implements:** `Identifier$IdentifierBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder issuerReference`
- `FieldWithMetaStringBuilder issuer`
- `List (List) assignedIdentifier`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Identifier` [Builder]
- `setIssuer(FieldWithMetaString arg0)` → `IdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `IdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `IdentifierBuilder` [Setter]
- `getOrCreateIssuer()` → `FieldWithMetaStringBuilder` [Getter]
- `setIssuerValue(String arg0)` → `IdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `IdentifierBuilder` [Setter]
- `getOrCreateIssuerReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getIssuerReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `getAssignedIdentifier()` → `List` [Getter]

### IdentifierImpl
**Implements:** `Identifier` 

**Key Methods:**
- `build()` → `Identifier` [Builder]
- `getIssuerReference()` → `ReferenceWithMetaParty` [Getter]
- `getAssignedIdentifier()` → `List` [Getter]
- `setBuilderFields(IdentifierBuilder arg0)` → `void` [Setter]
- `getIssuer()` → `FieldWithMetaString` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### LocationIdentifierBuilderImpl
**Extends:** `Identifier$IdentifierBuilderImpl` 
**Implements:** `LocationIdentifier$LocationIdentifierBuilder` 

**Fields:**
- `CommodityLocationIdentifierTypeEnum locationIdentifierType`

**Key Methods:**
- `build()` → `LocationIdentifier` [Builder]
- `setIssuer(FieldWithMetaString arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerReferenceValue(Party arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `LocationIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `LocationIdentifierBuilder` [Setter]
- `setLocationIdentifierType(CommodityLocationIdentifierTypeEnum arg0)` → `LocationIdentifierBuilder` [Setter]
- `getLocationIdentifierType()` → `CommodityLocationIdentifierTypeEnum` [Getter]
- `setMeta(MetaFields arg0)` → `LocationIdentifierBuilder` [Setter]

### LocationIdentifierImpl
**Extends:** `Identifier$IdentifierImpl` 
**Implements:** `LocationIdentifier` 

**Key Methods:**
- `build()` → `LocationIdentifier` [Builder]
- `setBuilderFields(LocationIdentifierBuilder arg0)` → `void` [Setter]
- `getLocationIdentifierType()` → `CommodityLocationIdentifierTypeEnum` [Getter]

