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
- `setIdentifierValue(String arg0)` → `AssignedIdentifierBuilder` [Setter]
- `setIdentifier(FieldWithMetaString arg0)` → `AssignedIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
- `getIdentifier()` → `FieldWithMetaStringBuilder` [Getter]

### IdentifiedList
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `IdentifiedList` [Builder]
- `getComponentId()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getListId()` → `Identifier` [Getter]
- `getPrice()` → `Price` [Getter]

### IdentifiedListBuilder
**Implements:** `IdentifiedList` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreatePrice()` → `PriceBuilder` [Getter]
- `getComponentId()` → `List` [Getter]
- `setComponentId(List arg0)` → `IdentifiedListBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `IdentifiedListBuilder` [Setter]
- `getListId()` → `IdentifierBuilder` [Getter]
- `getPrice()` → `PriceBuilder` [Getter]
- `setListId(Identifier arg0)` → `IdentifiedListBuilder` [Setter]
- `getOrCreateComponentId(int arg0)` → `IdentifierBuilder` [Getter]

### Identifier
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Identifier` [Builder]
- `getAssignedIdentifier()` → `List` [Getter]
- `getIssuerReference()` → `ReferenceWithMetaParty` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getIssuer()` → `FieldWithMetaString` [Getter]

### IdentifierBuilder
**Implements:** `Identifier` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getAssignedIdentifier()` → `List` [Getter]
- `getIssuerReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setIssuerReferenceValue(Party arg0)` → `IdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `IdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `IdentifierBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `IdentifierBuilder` [Setter]
- `getIssuer()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateAssignedIdentifier(int arg0)` → `AssignedIdentifierBuilder` [Getter]

### LocationIdentifier
**Implements:** `Identifier` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `LocationIdentifier` [Builder]
- `getLocationIdentifierType()` → `CommodityLocationIdentifierTypeEnum` [Getter]

### LocationIdentifierBuilder
**Implements:** `LocationIdentifier` `Identifier$IdentifierBuilder` 

**Key Methods:**
- `setIssuerReferenceValue(Party arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `LocationIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `LocationIdentifierBuilder` [Setter]
- `setLocationIdentifierType(CommodityLocationIdentifierTypeEnum arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `LocationIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `LocationIdentifierBuilder` [Setter]

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
- `setIdentifierValue(String arg0)` → `AssignedIdentifierBuilder` [Setter]
- `setIdentifier(FieldWithMetaString arg0)` → `AssignedIdentifierBuilder` [Setter]
- `getOrCreateIdentifier()` → `FieldWithMetaStringBuilder` [Getter]
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
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getOrCreatePrice()` → `PriceBuilder` [Getter]
- `getComponentId()` → `List` [Getter]
- `setComponentId(List arg0)` → `IdentifiedListBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `IdentifiedListBuilder` [Setter]
- `getListId()` → `IdentifierBuilder` [Getter]
- `getPrice()` → `PriceBuilder` [Getter]
- `setListId(Identifier arg0)` → `IdentifiedListBuilder` [Setter]

### IdentifiedListImpl
**Implements:** `IdentifiedList` 

**Key Methods:**
- `build()` → `IdentifiedList` [Builder]
- `setBuilderFields(IdentifiedListBuilder arg0)` → `void` [Setter]
- `getComponentId()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getListId()` → `Identifier` [Getter]
- `getPrice()` → `Price` [Getter]

### IdentifierBuilderImpl
**Implements:** `Identifier$IdentifierBuilder` 

**Fields:**
- `ReferenceWithMetaPartyBuilder issuerReference`
- `FieldWithMetaStringBuilder issuer`
- `List (List) assignedIdentifier`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `Identifier` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getAssignedIdentifier()` → `List` [Getter]
- `getIssuerReference()` → `ReferenceWithMetaPartyBuilder` [Getter]
- `setIssuerReferenceValue(Party arg0)` → `IdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `IdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `IdentifierBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `IdentifierBuilder` [Setter]
- `getIssuer()` → `FieldWithMetaStringBuilder` [Getter]

### IdentifierImpl
**Implements:** `Identifier` 

**Key Methods:**
- `build()` → `Identifier` [Builder]
- `setBuilderFields(IdentifierBuilder arg0)` → `void` [Setter]
- `getAssignedIdentifier()` → `List` [Getter]
- `getIssuerReference()` → `ReferenceWithMetaParty` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getIssuer()` → `FieldWithMetaString` [Getter]

### LocationIdentifierBuilderImpl
**Extends:** `Identifier$IdentifierBuilderImpl` 
**Implements:** `LocationIdentifier$LocationIdentifierBuilder` 

**Fields:**
- `CommodityLocationIdentifierTypeEnum locationIdentifierType`

**Key Methods:**
- `build()` → `LocationIdentifier` [Builder]
- `setIssuerReferenceValue(Party arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerValue(String arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuer(FieldWithMetaString arg0)` → `LocationIdentifierBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `LocationIdentifierBuilder` [Setter]
- `getLocationIdentifierType()` → `CommodityLocationIdentifierTypeEnum` [Getter]
- `setLocationIdentifierType(CommodityLocationIdentifierTypeEnum arg0)` → `LocationIdentifierBuilder` [Setter]
- `setIssuerReference(ReferenceWithMetaParty arg0)` → `LocationIdentifierBuilder` [Setter]
- `setAssignedIdentifier(List arg0)` → `LocationIdentifierBuilder` [Setter]

### LocationIdentifierImpl
**Extends:** `Identifier$IdentifierImpl` 
**Implements:** `LocationIdentifier` 

**Key Methods:**
- `build()` → `LocationIdentifier` [Builder]
- `setBuilderFields(LocationIdentifierBuilder arg0)` → `void` [Setter]
- `getLocationIdentifierType()` → `CommodityLocationIdentifierTypeEnum` [Getter]

