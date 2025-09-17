# ContractFormationInstructionBuilder

**Full Name:** `cdm.event.common.ContractFormationInstruction$ContractFormationInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ContractFormationInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ContractFormationInstructionBuilder setLegalAgreement(List arg0)`

#### Getter Methods

- `LegalAgreementBuilder getOrCreateLegalAgreement(int arg0)`
- `List getLegalAgreement()`

#### Adder Methods

- `ContractFormationInstructionBuilder addLegalAgreement(List arg0)`
- `ContractFormationInstructionBuilder addLegalAgreement(LegalAgreement arg0)`
- `ContractFormationInstructionBuilder addLegalAgreement(LegalAgreement arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ContractFormationInstructionBuilder prune()`

