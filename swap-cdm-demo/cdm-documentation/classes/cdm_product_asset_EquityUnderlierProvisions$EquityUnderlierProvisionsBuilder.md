# EquityUnderlierProvisionsBuilder

**Full Name:** `cdm.product.asset.EquityUnderlierProvisions$EquityUnderlierProvisionsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.EquityUnderlierProvisions`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `EquityUnderlierProvisionsBuilder setMultipleExchangeIndexAnnexFallback(Boolean arg0)`
- `EquityUnderlierProvisionsBuilder setComponentSecurityIndexAnnexFallback(Boolean arg0)`
- `EquityUnderlierProvisionsBuilder setRelevantJurisdictionValue(String arg0)`
- `EquityUnderlierProvisionsBuilder setRelevantJurisdiction(FieldWithMetaString arg0)`
- `EquityUnderlierProvisionsBuilder setLocalJurisdictionValue(String arg0)`
- `EquityUnderlierProvisionsBuilder setLocalJurisdiction(FieldWithMetaString arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateLocalJurisdiction()`
- `FieldWithMetaStringBuilder getOrCreateRelevantJurisdiction()`
- `FieldWithMetaStringBuilder getLocalJurisdiction()`
- `FieldWithMetaStringBuilder getRelevantJurisdiction()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EquityUnderlierProvisionsBuilder prune()`

