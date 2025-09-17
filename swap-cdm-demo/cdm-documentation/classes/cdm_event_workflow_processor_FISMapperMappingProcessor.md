# FISMapperMappingProcessor

**Full Name:** `cdm.event.workflow.processor.FISMapperMappingProcessor`

**Package:** `cdm.event.workflow.processor`

## Type: Concrete Class

### Inheritance

**Extends:**
- `com.regnosys.rosetta.common.translation.flat.FlatFileMappingProcessor`

### Methods

#### Getter Methods

- `PathValue getTradeState(PathValue arg0)`
- `PathValue getSecPO(PathValue arg0)`
- `PathValue getEcTerms(PathValue arg0)`
- `PathValue getIRP(PathValue arg0)`
- `PathValue getColPro(PathValue arg0)`
- `PathValue getPriceQuantityForInterestRatePayout(PathValue arg0)`
- `PathValue getPriceQuantityForSecurityFinancePayout(PathValue arg0)`
- `PathValue getSplitTradeState(PathValue arg0, Map arg1)`
- `PathValue getTradableProduct(PathValue arg0)`

#### Other Methods

- `void doHardCodings(WorkflowStepBuilder arg0)`
- `void buildAllocationMapping(String arg0, MappingConsumer arg1)`
- `void staticMappings(PathValue arg0)`
- `Multimap buildCommonMappings()`
- `void buildTradeStateMappings(Multimap arg0)`
- `void buildAllocationMappings(Multimap arg0)`
- `DeliveryMethodEnum parseDeliveryMethod(String arg0)`
- `CollateralTypeEnum parseCollateralType(String arg0)`
- `void buildTradeStateMapping(String arg0, MappingConsumer arg1)`
- `MappingConsumer allocaNumberMapConsumer(MappingConsumer arg0)`

