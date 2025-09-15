# Package: cdm.product.template.processor

## Concrete Classes

### AssetCashMetaMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setReference(Path arg0, RosettaModelObjectBuilder arg1)` → `void` [Setter]

### BuyerMappingProcessor
**Extends:** `BuyerMappingProcessor` 

### CdsFeeLegPayoutMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getPayoutBuilders(NonTransferableProductBuilder arg0)` → `List` [Getter]

### CommodityClassificationMetaMappingProcessor
**Extends:** `MappingProcessor` 

### DividendFixedLegMappingProcessor
**Extends:** `MappingProcessor` 

### ExerciseNoticeGiverMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getXmlValue(List arg0, Function arg1)` → `String` [Getter]
- `getExerciseNoticeGiverEnum(String arg0)` → `Optional` [Getter]

### ExerciseNoticeReceiverMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getAncillaryRoleEnum()` → `Optional` [Getter]

### ExpirationTimeTypeMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `isExpirationTimeSet(ExerciseTermsBuilder arg0)` → `boolean` [Getter]

### FraHelper

### FraPayoutSplitterMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getPartyReference(String arg0)` → `Optional` [Getter]
- `getReferenceMapping(Path arg0)` → `Optional` [Getter]

### FraPriceQuantitySplitterMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getNonReferenceMapping(Path arg0)` → `Optional` [Getter]

### InterestRateForwardDebtPriceMappingProcessor
**Extends:** `MappingProcessor` 

### SellerMappingProcessor
**Extends:** `SellerMappingProcessor` 

### UnderlierMetaMappingProcessor
**Extends:** `MappingProcessor` 

