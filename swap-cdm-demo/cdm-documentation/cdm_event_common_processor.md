# Package: cdm.event.common.processor

## Concrete Classes

### CmePartyMappingProcessor
**Extends:** `CmePartyMappingProcessor` 

### ContractFormationInstructionLegalAgreementMappingProcessor
**Extends:** `MappingProcessor` 

### DocumentationHelper

**Key Methods:**
- `getDocumentation(Path arg0)` → `List` [Getter]
- `setContractualParty(LegalAgreementBuilder arg0)` → `void` [Setter]
- `getMasterConfirmation(Path arg0)` → `Optional` [Getter]
- `getBrokerConfirmation(Path arg0)` → `Optional` [Getter]
- `getCreditSupportAgreement(Path arg0)` → `Optional` [Getter]
- `getMasterAgreement(Path arg0)` → `Optional` [Getter]
- `getConfirmation(Path arg0)` → `Optional` [Getter]
- `setAgreementType(LegalAgreementBuilder arg0, LegalAgreementTypeEnum arg1)` → `Optional` [Setter]
- `getOtherAgreement(Path arg0)` → `Optional` [Getter]

### DocumentationMappingProcessor
**Extends:** `MappingProcessor` 

### InstructionDocumentationMappingProcessor
**Extends:** `MappingProcessor` 

### NovationInstructionMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `setQuantity(QuantityScheduleBuilder arg0, Path arg1)` → `void` [Setter]
- `setAsset(AssetBuilder arg0, Path arg1)` → `void` [Setter]
- `getTransferInstruction(Path arg0)` → `Optional` [Getter]
- `getOutgoingQuantityChangeInstruction(Path arg0)` → `Optional` [Getter]
- `getIncomingQuantityChangeInstruction(Path arg0)` → `Optional` [Getter]
- `getIncomingPartyChangeInstruction(Path arg0)` → `Optional` [Getter]

### NovationPartyMappingProcessor
**Extends:** `PartyMappingProcessor` 

### NovationPartyReferenceTranslator

### ORECounterpartyMappingProcessor
**Extends:** `MappingProcessor` 

### PartyMappingProcessor
**Extends:** `PartyMappingProcessor` 

### PartyRoleMapping

### PartyRoleMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getPartyRoleEnum(Path arg0)` → `PartyRoleEnum` [Getter]

### RelatedPartyRoleMappingProcessor
**Extends:** `MappingProcessor` 

**Key Methods:**
- `getKey(Mapping arg0)` → `String` [Getter]
- `getPathIndex(Mapping arg0, String arg1)` → `int` [Getter]
- `getMapping(List arg0, Path arg1)` → `Mapping` [Getter]

