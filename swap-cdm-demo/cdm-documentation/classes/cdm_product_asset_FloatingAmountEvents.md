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
- `AdditionalFixedPayments getAdditionalFixedPayments()`
- `InterestShortFall getInterestShortfall()`
- `FloatingAmountProvisions getFloatingAmountProvisions()`
- `Boolean getWritedown()`
- `Boolean getFailureToPayPrincipal()`
- `Boolean getImpliedWritedown()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingAmountEventsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

