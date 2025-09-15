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
- `setMeta(MetaFields arg0)` → `FieldWithMetaCreditSupportAgreementTypeEnumBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### ReferenceWithMetaCollateral
**Implements:** `RosettaModelObject` `ReferenceWithMeta` 

**Key Methods:**
- `getReference()` → `Reference` [Getter]
- `getValue()` → `Collateral` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceWithMetaCollateral` [Builder]
- `getExternalReference()` → `String` [Getter]
- `getValueType()` → `Class` [Getter]
- `getGlobalReference()` → `String` [Getter]

### ReferenceWithMetaCollateralBuilder
**Implements:** `ReferenceWithMetaCollateral` `RosettaModelObjectBuilder` `ReferenceWithMeta$ReferenceWithMetaBuilder` 

**Key Methods:**
- `getReference()` → `ReferenceBuilder` [Getter]
- `getValue()` → `CollateralBuilder` [Getter]
- `setValue(Collateral arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]
- `getOrCreateValue()` → `CollateralBuilder` [Getter]
- `setExternalReference(String arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]
- `setGlobalReference(String arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]
- `getOrCreateReference()` → `ReferenceBuilder` [Getter]
- `setReference(Reference arg0)` → `ReferenceWithMetaCollateralBuilder` [Setter]

