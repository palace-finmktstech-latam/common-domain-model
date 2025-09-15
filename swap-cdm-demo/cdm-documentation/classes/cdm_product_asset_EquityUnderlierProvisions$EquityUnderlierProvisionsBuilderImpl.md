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

- `EquityUnderlierProvisionsBuilder setMultipleExchangeIndexAnnexFallback(Boolean arg0)`
- `EquityUnderlierProvisionsBuilder setComponentSecurityIndexAnnexFallback(Boolean arg0)`
- `EquityUnderlierProvisionsBuilder setRelevantJurisdictionValue(String arg0)`
- `EquityUnderlierProvisionsBuilder setRelevantJurisdiction(FieldWithMetaString arg0)`
- `EquityUnderlierProvisionsBuilder setLocalJurisdictionValue(String arg0)`
- `EquityUnderlierProvisionsBuilder setLocalJurisdiction(FieldWithMetaString arg0)`

#### Getter Methods

- `Boolean getMultipleExchangeIndexAnnexFallback()`
- `FieldWithMetaStringBuilder getOrCreateLocalJurisdiction()`
- `FieldWithMetaStringBuilder getOrCreateRelevantJurisdiction()`
- `Boolean getComponentSecurityIndexAnnexFallback()`
- `FieldWithMetaStringBuilder getLocalJurisdiction()`
- `FieldWithMetaStringBuilder getRelevantJurisdiction()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EquityUnderlierProvisionsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EquityUnderlierProvisionsBuilder toBuilder()`
- `EquityUnderlierProvisionsBuilder prune()`

