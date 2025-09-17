# ContactElectionBuilder

**Full Name:** `cdm.product.collateral.ContactElection$ContactElectionBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.ContactElection`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ContactElectionBuilder setPartyElection(List arg0)`

#### Getter Methods

- `PartyContactInformationBuilder getOrCreatePartyElection(int arg0)`
- `List getPartyElection()`

#### Adder Methods

- `ContactElectionBuilder addPartyElection(List arg0)`
- `ContactElectionBuilder addPartyElection(PartyContactInformation arg0)`
- `ContactElectionBuilder addPartyElection(PartyContactInformation arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ContactElectionBuilder prune()`

