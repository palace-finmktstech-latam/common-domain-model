# EquityUnderlierProvisionsBuilderImpl

**Full Name:** `cdm.product.asset.EquityUnderlierProvisions$EquityUnderlierProvisionsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.EquityUnderlierProvisions$EquityUnderlierProvisionsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| multipleExchangeIndexAnnexFallback | `Boolean` |  |
| componentSecurityIndexAnnexFallback | `Boolean` |  |
| localJurisdiction | `FieldWithMetaStringBuilder` |  |
| relevantJurisdiction | `FieldWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `EquityUnderlierProvisions build()`

#### Setter Methods

- `EquityUnderlierProvisionsBuilder setLocalJurisdiction(FieldWithMetaString arg0)`
- `EquityUnderlierProvisionsBuilder setRelevantJurisdiction(FieldWithMetaString arg0)`
- `EquityUnderlierProvisionsBuilder setLocalJurisdictionValue(String arg0)`
- `EquityUnderlierProvisionsBuilder setMultipleExchangeIndexAnnexFallback(Boolean arg0)`
- `EquityUnderlierProvisionsBuilder setComponentSecurityIndexAnnexFallback(Boolean arg0)`
- `EquityUnderlierProvisionsBuilder setRelevantJurisdictionValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getRelevantJurisdiction()`
- `FieldWithMetaStringBuilder getLocalJurisdiction()`
- `Boolean getMultipleExchangeIndexAnnexFallback()`
- `Boolean getComponentSecurityIndexAnnexFallback()`
- `FieldWithMetaStringBuilder getOrCreateLocalJurisdiction()`
- `FieldWithMetaStringBuilder getOrCreateRelevantJurisdiction()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EquityUnderlierProvisionsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `EquityUnderlierProvisionsBuilder prune()`
- `EquityUnderlierProvisionsBuilder toBuilder()`
- `boolean hasData()`

