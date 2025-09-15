# TerminationProvisionBuilder

**Full Name:** `cdm.product.template.TerminationProvision$TerminationProvisionBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.TerminationProvision`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TerminationProvisionBuilder setCancelableProvision(CancelableProvision arg0)`
- `TerminationProvisionBuilder setExtendibleProvision(ExtendibleProvision arg0)`
- `TerminationProvisionBuilder setEvergreenProvision(EvergreenProvision arg0)`
- `TerminationProvisionBuilder setEarlyTerminationProvision(EarlyTerminationProvision arg0)`

#### Getter Methods

- `EvergreenProvisionBuilder getEvergreenProvision()`
- `ExtendibleProvisionBuilder getExtendibleProvision()`
- `CancelableProvisionBuilder getCancelableProvision()`
- `EarlyTerminationProvisionBuilder getOrCreateEarlyTerminationProvision()`
- `CancelableProvisionBuilder getOrCreateCancelableProvision()`
- `ExtendibleProvisionBuilder getOrCreateExtendibleProvision()`
- `EvergreenProvisionBuilder getOrCreateEvergreenProvision()`
- `EarlyTerminationProvisionBuilder getEarlyTerminationProvision()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TerminationProvisionBuilder prune()`

