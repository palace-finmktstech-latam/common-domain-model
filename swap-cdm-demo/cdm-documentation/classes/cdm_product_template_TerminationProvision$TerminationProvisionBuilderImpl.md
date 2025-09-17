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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TerminationProvisionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TerminationProvisionBuilder prune()`
- `TerminationProvisionBuilder toBuilder()`
- `boolean hasData()`

