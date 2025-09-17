# ProtectionTermsBuilderImpl

**Full Name:** `cdm.product.asset.ProtectionTerms$ProtectionTermsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ProtectionTerms$ProtectionTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| creditEvents | `CreditEventsBuilder` |  |
| obligations | `ObligationsBuilder` |  |
| floatingAmountEvents | `FloatingAmountEventsBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ProtectionTerms build()`

#### Setter Methods

- `ProtectionTermsBuilder setMeta(MetaFields arg0)`
- `ProtectionTermsBuilder setObligations(Obligations arg0)`
- `ProtectionTermsBuilder setFloatingAmountEvents(FloatingAmountEvents arg0)`
- `ProtectionTermsBuilder setCreditEvents(CreditEvents arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `CreditEventsBuilder getCreditEvents()`
- `ObligationsBuilder getOrCreateObligations()`
- `CreditEventsBuilder getOrCreateCreditEvents()`
- `FloatingAmountEventsBuilder getOrCreateFloatingAmountEvents()`
- `ObligationsBuilder getObligations()`
- `FloatingAmountEventsBuilder getFloatingAmountEvents()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ProtectionTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ProtectionTermsBuilder prune()`
- `ProtectionTermsBuilder toBuilder()`
- `boolean hasData()`

