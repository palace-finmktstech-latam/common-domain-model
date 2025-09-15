# TermsChangeInstructionBuilderImpl

**Full Name:** `cdm.event.common.TermsChangeInstruction$TermsChangeInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.TermsChangeInstruction$TermsChangeInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| product | `NonTransferableProductBuilder` |  |
| ancillaryParty | `java.util.List<cdm.base.staticdata.party.AncillaryParty$AncillaryPartyBuilder>` |  |
| adjustment | `NotionalAdjustmentEnum` |  |

### Methods

#### Builder Methods

- `TermsChangeInstruction build()`

#### Setter Methods

- `TermsChangeInstructionBuilder setAncillaryParty(List arg0)`
- `TermsChangeInstructionBuilder setAdjustment(NotionalAdjustmentEnum arg0)`
- `TermsChangeInstructionBuilder setProduct(NonTransferableProduct arg0)`

#### Getter Methods

- `AncillaryPartyBuilder getOrCreateAncillaryParty(int arg0)`
- `NonTransferableProductBuilder getOrCreateProduct()`
- `List getAncillaryParty()`
- `NotionalAdjustmentEnum getAdjustment()`
- `NonTransferableProductBuilder getProduct()`

#### Adder Methods

- `TermsChangeInstructionBuilder addAncillaryParty(AncillaryParty arg0)`
- `TermsChangeInstructionBuilder addAncillaryParty(AncillaryParty arg0, int arg1)`
- `TermsChangeInstructionBuilder addAncillaryParty(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TermsChangeInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TermsChangeInstructionBuilder toBuilder()`
- `TermsChangeInstructionBuilder prune()`

