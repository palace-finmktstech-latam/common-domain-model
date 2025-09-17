# FloatingAmountEvents

**Full Name:** `cdm.product.asset.FloatingAmountEvents`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FloatingAmountEvents build()`

#### Getter Methods

- `Class getType()`
- `InterestShortFall getInterestShortfall()`
- `FloatingAmountProvisions getFloatingAmountProvisions()`
- `Boolean getFailureToPayPrincipal()`
- `Boolean getImpliedWritedown()`
- `Boolean getWritedown()`
- `AdditionalFixedPayments getAdditionalFixedPayments()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingAmountEventsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

