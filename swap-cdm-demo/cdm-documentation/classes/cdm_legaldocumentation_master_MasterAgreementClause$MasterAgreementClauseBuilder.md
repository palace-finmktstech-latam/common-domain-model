# MasterAgreementClauseBuilder

**Full Name:** `cdm.legaldocumentation.master.MasterAgreementClause$MasterAgreementClauseBuilder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.MasterAgreementClause`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MasterAgreementClauseBuilder setName(String arg0)`
- `MasterAgreementClauseBuilder setVariant(List arg0)`
- `MasterAgreementClauseBuilder setCounterparty(List arg0)`
- `MasterAgreementClauseBuilder setIdentifer(MasterAgreementClauseIdentifierEnum arg0)`
- `MasterAgreementClauseBuilder setOtherParty(List arg0)`

#### Getter Methods

- `List getVariant()`
- `MasterAgreementClauseVariantBuilder getOrCreateVariant(int arg0)`

#### Adder Methods

- `MasterAgreementClauseBuilder addCounterparty(CounterpartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseBuilder addCounterparty(CounterpartyRoleEnum arg0)`
- `MasterAgreementClauseBuilder addCounterparty(List arg0)`
- `MasterAgreementClauseBuilder addOtherParty(PartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseBuilder addOtherParty(PartyRoleEnum arg0)`
- `MasterAgreementClauseBuilder addOtherParty(List arg0)`
- `MasterAgreementClauseBuilder addVariant(List arg0)`
- `MasterAgreementClauseBuilder addVariant(MasterAgreementClauseVariant arg0, int arg1)`
- `MasterAgreementClauseBuilder addVariant(MasterAgreementClauseVariant arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MasterAgreementClauseBuilder prune()`

