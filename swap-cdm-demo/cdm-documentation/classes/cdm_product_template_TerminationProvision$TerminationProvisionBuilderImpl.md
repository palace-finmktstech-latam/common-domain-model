# TerminationProvisionBuilderImpl

**Full Name:** `cdm.product.template.TerminationProvision$TerminationProvisionBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.TerminationProvision$TerminationProvisionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| cancelableProvision | `CancelableProvisionBuilder` |  |
| earlyTerminationProvision | `EarlyTerminationProvisionBuilder` |  |
| evergreenProvision | `EvergreenProvisionBuilder` |  |
| extendibleProvision | `ExtendibleProvisionBuilder` |  |

### Methods

#### Builder Methods

- `TerminationProvision build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TerminationProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TerminationProvisionBuilder toBuilder()`
- `TerminationProvisionBuilder prune()`

