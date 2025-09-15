# ContractFormationInstructionBuilderImpl

**Full Name:** `cdm.event.common.ContractFormationInstruction$ContractFormationInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ContractFormationInstruction$ContractFormationInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| legalAgreement | `java.util.List<cdm.legaldocumentation.common.LegalAgreement$LegalAgreementBuilder>` |  |

### Methods

#### Builder Methods

- `ContractFormationInstruction build()`

#### Setter Methods

- `ContractFormationInstructionBuilder setLegalAgreement(List arg0)`

#### Getter Methods

- `List getLegalAgreement()`
- `LegalAgreementBuilder getOrCreateLegalAgreement(int arg0)`

#### Adder Methods

- `ContractFormationInstructionBuilder addLegalAgreement(LegalAgreement arg0, int arg1)`
- `ContractFormationInstructionBuilder addLegalAgreement(LegalAgreement arg0)`
- `ContractFormationInstructionBuilder addLegalAgreement(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ContractFormationInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ContractFormationInstructionBuilder toBuilder()`
- `ContractFormationInstructionBuilder prune()`

