# TermsChangeInstructionBuilder

**Full Name:** `cdm.event.common.TermsChangeInstruction$TermsChangeInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.TermsChangeInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TermsChangeInstructionBuilder setAncillaryParty(List arg0)`
- `TermsChangeInstructionBuilder setAdjustment(NotionalAdjustmentEnum arg0)`
- `TermsChangeInstructionBuilder setProduct(NonTransferableProduct arg0)`

#### Getter Methods

- `AncillaryPartyBuilder getOrCreateAncillaryParty(int arg0)`
- `NonTransferableProductBuilder getOrCreateProduct()`
- `List getAncillaryParty()`
- `NonTransferableProductBuilder getProduct()`

#### Adder Methods

- `TermsChangeInstructionBuilder addAncillaryParty(AncillaryParty arg0, int arg1)`
- `TermsChangeInstructionBuilder addAncillaryParty(AncillaryParty arg0)`
- `TermsChangeInstructionBuilder addAncillaryParty(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TermsChangeInstructionBuilder prune()`

