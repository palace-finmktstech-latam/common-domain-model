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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ProtectionTermsBuilder prune()`

