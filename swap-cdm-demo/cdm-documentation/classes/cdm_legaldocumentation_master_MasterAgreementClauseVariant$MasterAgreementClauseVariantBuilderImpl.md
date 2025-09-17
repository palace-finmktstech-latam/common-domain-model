# MasterAgreementClauseVariantBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.MasterAgreementClauseVariant$MasterAgreementClauseVariantBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.MasterAgreementClauseVariant$MasterAgreementClauseVariantBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `MasterAgreementVariantIdentifierEnum` |  |
| name | `String` |  |
| counterparty | `java.util.List<cdm.base.staticdata.party.CounterpartyRoleEnum>` |  |
| otherParty | `java.util.List<cdm.base.staticdata.party.PartyRoleEnum>` |  |
| variableSet | `java.util.List<cdm.legaldocumentation.master.MasterAgreementVariableSet$MasterAgreementVariableSetBuilder>` |  |

### Methods

#### Builder Methods

- `MasterAgreementClauseVariant build()`

#### Setter Methods

- `MasterAgreementClauseVariantBuilder setName(String arg0)`
- `MasterAgreementClauseVariantBuilder setIdentifier(MasterAgreementVariantIdentifierEnum arg0)`
- `MasterAgreementClauseVariantBuilder setCounterparty(List arg0)`
- `MasterAgreementClauseVariantBuilder setVariableSet(List arg0)`
- `MasterAgreementClauseVariantBuilder setOtherParty(List arg0)`

#### Getter Methods

- `String getName()`
- `List getCounterparty()`
- `MasterAgreementVariableSetBuilder getOrCreateVariableSet(int arg0)`
- `List getVariableSet()`
- `List getOtherParty()`
- `MasterAgreementVariantIdentifierEnum getIdentifier()`

#### Adder Methods

- `MasterAgreementClauseVariantBuilder addCounterparty(CounterpartyRoleEnum arg0)`
- `MasterAgreementClauseVariantBuilder addCounterparty(CounterpartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseVariantBuilder addCounterparty(List arg0)`
- `MasterAgreementClauseVariantBuilder addVariableSet(MasterAgreementVariableSet arg0)`
- `MasterAgreementClauseVariantBuilder addVariableSet(List arg0)`
- `MasterAgreementClauseVariantBuilder addVariableSet(MasterAgreementVariableSet arg0, int arg1)`
- `MasterAgreementClauseVariantBuilder addOtherParty(PartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseVariantBuilder addOtherParty(List arg0)`
- `MasterAgreementClauseVariantBuilder addOtherParty(PartyRoleEnum arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MasterAgreementClauseVariantBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MasterAgreementClauseVariantBuilder prune()`
- `MasterAgreementClauseVariantBuilder toBuilder()`
- `boolean hasData()`

