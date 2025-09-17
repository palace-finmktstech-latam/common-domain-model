# Package: cdm.base.staticdata.asset.common.processor

## Concrete Classes

### AssetIdentifierTypeMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setSchemeAndIdentifierType(AssetIdentifierBuilder arg0, FieldWithMetaStringBuilder arg1, Path arg2, Path arg3)` → `void` [Setter]
- `setSchemeAndIdentifierType(AssetIdentifierBuilder arg0, FieldWithMetaStringBuilder arg1, String arg2)` → `void` [Setter]
- `getSourceEnum(String arg0)` → `AssetIdTypeEnum` [Getter]

### CashAssetIdentifierMappingProcessor
**Extends:** `MappingProcessor` 

### FxMetaHelper

**Key Methods:**
- `isUnderlierPutCurrency(String arg0)` → `Optional` [Getter]
- `isUnderlierCurrency1(String arg0)` → `Optional` [Getter]
- `getNonReferenceMappings()` → `List` [Getter]
- `getCurrencySynonymPath(Path arg0)` → `Optional` [Getter]
- `getStrikeQuoteBasisCurrencySynonymPath(Path arg0)` → `Optional` [Getter]
- `getQuoteBasisCurrencySynonymPath(Path arg0)` → `Optional` [Getter]

### ProductIdDescriptionMappingProcessor
**Extends:** `MappingProcessor` 

### ProductIdentifierSourceMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getSourceEnum(String arg0)` → `ProductIdTypeEnum` [Getter]

### TaxonomySourceMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getTaxonomySourceEnum(String arg0)` → `TaxonomySourceEnum` [Getter]

