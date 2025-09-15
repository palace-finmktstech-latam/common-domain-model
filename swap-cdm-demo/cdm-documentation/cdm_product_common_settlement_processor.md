# Package: cdm.product.common.settlement.processor

## Concrete Classes

### CdsFeeLegMetaMappingProcessor
**Extends:** `MappingProcessor` 

### FxOptionQuantityMetaMappingProcessor
**Extends:** `MappingProcessor` 

### PredeterminedClearingOrganizationPartyMappingProcessor
**Extends:** `MappingProcessor` 

### PrincipalPaymentScheduleMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setCurrency(Path arg0, MoneyBuilder arg1)` → `void` [Setter]
- `getPrincipalPayment(Path arg0, Path arg1)` → `Optional` [Getter]
- `setPayerReceiver(Path arg0, PrincipalPaymentBuilder arg1, BigDecimal arg2)` → `void` [Setter]
- `setCounterpartyRoleEnum(Path arg0, Consumer arg1)` → `void` [Setter]
- `getAdjustedOrUnadjustedDate(PrincipalPayment arg0)` → `LocalDate` [Getter]
- `getPrincipalPayments(Path arg0)` → `LinkedList` [Getter]

### RelativeNotionalAmountMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getNotionalAmountHrefMapping(Path arg0)` → `Optional` [Getter]
- `getNotionalAmountIdSynonymPath(Mapping arg0)` → `Optional` [Getter]

### SettlementTypeHelper

**Key Methods:**
- `setSettlementType(Path arg0, SettlementTermsBuilder arg1)` → `void` [Setter]
- `isCommoditySwapWithFloatingLeg()` → `boolean` [Getter]
- `isCommoditySwapWithPhysicalLeg()` → `boolean` [Getter]
- `setSettlementTypeToCash(SettlementTermsBuilder arg0)` → `void` [Setter]
- `settlementCurrencyExists(SettlementTermsBuilder arg0)` → `boolean` [Setter]

### SettlementTypeMappingProcessor
**Extends:** `MappingProcessor` 

