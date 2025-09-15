# MasterAgreementClauseVariantBuilder

**Full Name:** `cdm.legaldocumentation.master.MasterAgreementClauseVariant$MasterAgreementClauseVariantBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.MasterAgreementClauseVariant`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MasterAgreementClauseVariantBuilder setName(String arg0)`
- `MasterAgreementClauseVariantBuilder setCounterparty(List arg0)`
- `MasterAgreementClauseVariantBuilder setOtherParty(List arg0)`
- `MasterAgreementClauseVariantBuilder setIdentifier(MasterAgreementVariantIdentifierEnum arg0)`
- `MasterAgreementClauseVariantBuilder setVariableSet(List arg0)`

#### Getter Methods

- `MasterAgreementVariableSetBuilder getOrCreateVariableSet(int arg0)`
- `List getVariableSet()`

#### Adder Methods

- `MasterAgreementClauseVariantBuilder addCounterparty(CounterpartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseVariantBuilder addCounterparty(List arg0)`
- `MasterAgreementClauseVariantBuilder addCounterparty(CounterpartyRoleEnum arg0)`
- `MasterAgreementClauseVariantBuilder addOtherParty(PartyRoleEnum arg0)`
- `MasterAgreementClauseVariantBuilder addOtherParty(List arg0)`
- `MasterAgreementClauseVariantBuilder addOtherParty(PartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseVariantBuilder addVariableSet(List arg0)`
- `MasterAgreementClauseVariantBuilder addVariableSet(MasterAgreementVariableSet arg0, int arg1)`
- `MasterAgreementClauseVariantBuilder addVariableSet(MasterAgreementVariableSet arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MasterAgreementClauseVariantBuilder prune()`

