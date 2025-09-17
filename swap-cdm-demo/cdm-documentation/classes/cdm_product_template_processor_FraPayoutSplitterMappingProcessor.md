# FraPayoutSplitterMappingProcessor

**Full Name:** `cdm.product.template.processor.FraPayoutSplitterMappingProcessor`

**Package:** `cdm.product.template.processor`

## Type: Concrete Class

### Inheritance

**Extends:**
- `com.regnosys.rosetta.common.translation.MappingProcessor`

### Methods

#### Getter Methods

- `Optional getPartyReference(String arg0)`
- `Optional getReferenceMapping(Path arg0)`

#### Adder Methods

- `void addFloatingLegQuantityReference(Mapping arg0, InterestRatePayoutBuilder arg1)`

#### Other Methods

- `void map(Path arg0, RosettaModelObjectBuilder arg1, RosettaModelObjectBuilder arg2)`
- `void updateFixedLeg(InterestRatePayoutBuilder arg0)`
- `void updateFloatingLeg(Path arg0, InterestRatePayoutBuilder arg1)`
- `void updateFloatingLegParties(InterestRatePayoutBuilder arg0)`
- `void updateFloatingRateIndexReference(Mapping arg0, InterestRatePayoutBuilder arg1)`

