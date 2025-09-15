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

- `ProtectionTermsBuilder setCreditEvents(CreditEvents arg0)`
- `ProtectionTermsBuilder setFloatingAmountEvents(FloatingAmountEvents arg0)`
- `ProtectionTermsBuilder setObligations(Obligations arg0)`
- `ProtectionTermsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FloatingAmountEventsBuilder getFloatingAmountEvents()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `CreditEventsBuilder getOrCreateCreditEvents()`
- `ObligationsBuilder getOrCreateObligations()`
- `FloatingAmountEventsBuilder getOrCreateFloatingAmountEvents()`
- `CreditEventsBuilder getCreditEvents()`
- `MetaFieldsBuilder getMeta()`
- `ObligationsBuilder getObligations()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ProtectionTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ProtectionTermsBuilder toBuilder()`
- `ProtectionTermsBuilder prune()`

