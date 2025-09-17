# ProtectionTermsBuilder

**Full Name:** `cdm.product.asset.ProtectionTerms$ProtectionTermsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ProtectionTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ProtectionTermsBuilder prune()`

