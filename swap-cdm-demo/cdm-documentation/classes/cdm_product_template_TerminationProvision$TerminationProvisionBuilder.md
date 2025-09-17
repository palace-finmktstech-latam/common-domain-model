# TerminationProvisionBuilder

**Full Name:** `cdm.product.template.TerminationProvision$TerminationProvisionBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.TerminationProvision`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TerminationProvisionBuilder setEvergreenProvision(EvergreenProvision arg0)`
- `TerminationProvisionBuilder setExtendibleProvision(ExtendibleProvision arg0)`
- `TerminationProvisionBuilder setCancelableProvision(CancelableProvision arg0)`
- `TerminationProvisionBuilder setEarlyTerminationProvision(EarlyTerminationProvision arg0)`

#### Getter Methods

- `CancelableProvisionBuilder getCancelableProvision()`
- `EvergreenProvisionBuilder getEvergreenProvision()`
- `ExtendibleProvisionBuilder getExtendibleProvision()`
- `EarlyTerminationProvisionBuilder getOrCreateEarlyTerminationProvision()`
- `EvergreenProvisionBuilder getOrCreateEvergreenProvision()`
- `CancelableProvisionBuilder getOrCreateCancelableProvision()`
- `ExtendibleProvisionBuilder getOrCreateExtendibleProvision()`
- `EarlyTerminationProvisionBuilder getEarlyTerminationProvision()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TerminationProvisionBuilder prune()`

