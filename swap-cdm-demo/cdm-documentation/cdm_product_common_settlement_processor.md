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
- `setPayerReceiver(Path arg0, PrincipalPaymentBuilder arg1, BigDecimal arg2)` → `void` [Setter]
- `getPrincipalPayment(Path arg0, Path arg1)` → `Optional` [Getter]
- `setCounterpartyRoleEnum(Path arg0, Consumer arg1)` → `void` [Setter]
- `getPrincipalPayments(Path arg0)` → `LinkedList` [Getter]
- `getAdjustedOrUnadjustedDate(PrincipalPayment arg0)` → `LocalDate` [Getter]

### RelativeNotionalAmountMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getNotionalAmountIdSynonymPath(Mapping arg0)` → `Optional` [Getter]
- `getNotionalAmountHrefMapping(Path arg0)` → `Optional` [Getter]

### SettlementTypeHelper

**Key Methods:**
- `setSettlementType(Path arg0, SettlementTermsBuilder arg1)` → `void` [Setter]
- `setSettlementTypeToCash(SettlementTermsBuilder arg0)` → `void` [Setter]
- `settlementCurrencyExists(SettlementTermsBuilder arg0)` → `boolean` [Setter]
- `isCommoditySwapWithPhysicalLeg()` → `boolean` [Getter]
- `isCommoditySwapWithFloatingLeg()` → `boolean` [Getter]

### SettlementTypeMappingProcessor
**Extends:** `MappingProcessor` 

