# Package: cdm.base.staticdata.party.processor

## Abstract Classes

### BuyerSellerMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getSetter(RosettaModelObjectBuilder arg0)` → `Optional` [Getter]

### PayerReceiverMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setCounterparty(Path arg0, PayerReceiverBuilder arg1, PartyMappingHelper arg2)` → `void` [Setter]

## Concrete Classes

### AccountPartyReferenceMappingProcessor
**Extends:** `MappingProcessor` 

### BuyerAsReceiverOrPayerMappingProcessor
**Extends:** `PayerReceiverMappingProcessor` 

**Key Methods:**
- `setCounterparty(Path arg0, PayerReceiverBuilder arg1, PartyMappingHelper arg2)` → `void` [Setter]

### BuyerMappingProcessor
**Extends:** `BuyerSellerMappingProcessor` 

**Key Methods:**
- `getSetter(RosettaModelObjectBuilder arg0)` → `Optional` [Getter]

### BuyerSellerPartyHelper

### CashPaymentBuyerMappingProcessor
**Extends:** `BuyerMappingProcessor` 

### CashPaymentSellerMappingProcessor
**Extends:** `SellerMappingProcessor` 

### PayerMappingProcessor
**Extends:** `PayerReceiverMappingProcessor` 

**Key Methods:**
- `setCounterparty(Path arg0, PayerReceiverBuilder arg1, PartyMappingHelper arg2)` → `void` [Setter]

### ReceiverMappingProcessor
**Extends:** `PayerReceiverMappingProcessor` 

**Key Methods:**
- `setCounterparty(Path arg0, PayerReceiverBuilder arg1, PartyMappingHelper arg2)` → `void` [Setter]

### SellerAsPayerOrReceiverMappingProcessor
**Extends:** `PayerReceiverMappingProcessor` 

**Key Methods:**
- `setCounterparty(Path arg0, PayerReceiverBuilder arg1, PartyMappingHelper arg2)` → `void` [Setter]

### SellerMappingProcessor
**Extends:** `BuyerSellerMappingProcessor` 

**Key Methods:**
- `getSetter(RosettaModelObjectBuilder arg0)` → `Optional` [Getter]

### TradeSideToPartyMappingHelper

### TradeSideToPartyMappingProcessor
**Extends:** `MappingProcessor` 

