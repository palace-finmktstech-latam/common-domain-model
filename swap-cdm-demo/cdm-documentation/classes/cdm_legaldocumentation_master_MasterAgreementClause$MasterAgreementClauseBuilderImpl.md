# MasterAgreementClauseBuilderImpl

**Full Name:** `cdm.legaldocumentation.master.MasterAgreementClause$MasterAgreementClauseBuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.master.MasterAgreementClause$MasterAgreementClauseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifer | `MasterAgreementClauseIdentifierEnum` |  |
| name | `String` |  |
| counterparty | `java.util.List<cdm.base.staticdata.party.CounterpartyRoleEnum>` |  |
| otherParty | `java.util.List<cdm.base.staticdata.party.PartyRoleEnum>` |  |
| variant | `java.util.List<cdm.legaldocumentation.master.MasterAgreementClauseVariant$MasterAgreementClauseVariantBuilder>` |  |

### Methods

#### Builder Methods

- `MasterAgreementClause build()`

#### Setter Methods

- `MasterAgreementClauseBuilder setName(String arg0)`
- `MasterAgreementClauseBuilder setVariant(List arg0)`
- `MasterAgreementClauseBuilder setCounterparty(List arg0)`
- `MasterAgreementClauseBuilder setOtherParty(List arg0)`
- `MasterAgreementClauseBuilder setIdentifer(MasterAgreementClauseIdentifierEnum arg0)`

#### Getter Methods

- `String getName()`
- `List getVariant()`
- `MasterAgreementClauseIdentifierEnum getIdentifer()`
- `List getOtherParty()`
- `MasterAgreementClauseVariantBuilder getOrCreateVariant(int arg0)`
- `List getCounterparty()`

#### Adder Methods

- `MasterAgreementClauseBuilder addCounterparty(CounterpartyRoleEnum arg0)`
- `MasterAgreementClauseBuilder addCounterparty(CounterpartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseBuilder addCounterparty(List arg0)`
- `MasterAgreementClauseBuilder addOtherParty(PartyRoleEnum arg0, int arg1)`
- `MasterAgreementClauseBuilder addOtherParty(List arg0)`
- `MasterAgreementClauseBuilder addOtherParty(PartyRoleEnum arg0)`
- `MasterAgreementClauseBuilder addVariant(MasterAgreementClauseVariant arg0, int arg1)`
- `MasterAgreementClauseBuilder addVariant(List arg0)`
- `MasterAgreementClauseBuilder addVariant(MasterAgreementClauseVariant arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MasterAgreementClauseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MasterAgreementClauseBuilder toBuilder()`
- `MasterAgreementClauseBuilder prune()`

