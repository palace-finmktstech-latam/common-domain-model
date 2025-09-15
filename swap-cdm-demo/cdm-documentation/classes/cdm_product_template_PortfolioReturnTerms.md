# PortfolioReturnTerms

**Full Name:** `cdm.product.template.PortfolioReturnTerms`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ReturnTerms`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `PortfolioReturnTerms build()`

#### Getter Methods

- `Class getType()`
- `List getInterimValuationPrice()`
- `List getFinalValuationPrice()`
- `List getInitialValuationPrice()`
- `ReferenceWithMetaObservable getUnderlier()`
- `PayerReceiver getPayerReceiver()`
- `ReferenceWithMetaNonNegativeQuantitySchedule getQuantity()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PortfolioReturnTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

