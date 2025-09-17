# Package: cdm.product.collateral.metafields

## Interfaces

### FieldWithMetaCreditSupportAgreementTypeEnum
**Implements:** `RosettaModelObject` `FieldWithMeta` `GlobalKey` 

**Key Methods:**
- `getValue()` → `CreditSupportAgreementTypeEnum` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `FieldWithMetaCreditSupportAgreementTypeEnum` [Builder]
- `getValueType()` → `Class` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### FieldWithMetaCreditSupportAgreementTypeEnumBuilder
**Implements:** `FieldWithMetaCreditSupportAgreementTypeEnum` `RosettaModelObjectBuilder` `FieldWithMeta$FieldWithMetaBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(CreditSupportAgreementTypeEnum arg0)` → `FieldWithMetaCreditSupportAgreementTypeEnumBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `FieldWithMetaCreditSupportAgreementTypeEnumBuilder` [Setter]

### ReferenceWithMetaCollateral
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Collateral` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaCollateral` [Builder]
- `getValueType()` → `Class` [Getter]
- `getExternalReference()` → `String` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCollateralBuilder
**Implements:** `ReferenceWithMetaCollateral` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CollateralBuilder` [Getter]
- `setValue(Collateral arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]
- `setReference(Reference arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]
- `getOrCreateValue()` → `CollateralBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]

