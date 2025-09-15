# PortfolioReturnTermsBuilderImpl

**Full Name:** `cdm.product.template.PortfolioReturnTerms$PortfolioReturnTermsBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.template.ReturnTerms$ReturnTermsBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.PortfolioReturnTerms$PortfolioReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payerReceiver | `PayerReceiverBuilder` |  |
| underlier | `ReferenceWithMetaObservableBuilder` |  |
| quantity | `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` |  |
| initialValuationPrice | `java.util.List<cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder>` |  |
| interimValuationPrice | `java.util.List<cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder>` |  |
| finalValuationPrice | `java.util.List<cdm.observable.asset.metafields.ReferenceWithMetaPriceSchedule$ReferenceWithMetaPriceScheduleBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PortfolioReturnTerms build()`

#### Setter Methods

- `PortfolioReturnTermsBuilder setUnderlier(ReferenceWithMetaObservable arg0)`
- `PortfolioReturnTermsBuilder setQuantity(ReferenceWithMetaNonNegativeQuantitySchedule arg0)`
- `PortfolioReturnTermsBuilder setPayerReceiver(PayerReceiver arg0)`
- `PortfolioReturnTermsBuilder setQuantityValue(NonNegativeQuantitySchedule arg0)`
- `PortfolioReturnTermsBuilder setVarianceReturnTerms(VarianceReturnTerms arg0)`
- `PortfolioReturnTermsBuilder setVolatilityReturnTerms(VolatilityReturnTerms arg0)`
- `PortfolioReturnTermsBuilder setDividendReturnTerms(DividendReturnTerms arg0)`
- `PortfolioReturnTermsBuilder setPriceReturnTerms(PriceReturnTerms arg0)`
- `PortfolioReturnTermsBuilder setCorrelationReturnTerms(CorrelationReturnTerms arg0)`
- `PortfolioReturnTermsBuilder setUnderlierValue(Observable arg0)`
- `PortfolioReturnTermsBuilder setInitialValuationPriceValue(List arg0)`
- `PortfolioReturnTermsBuilder setFinalValuationPriceValue(List arg0)`
- `PortfolioReturnTermsBuilder setInterimValuationPriceValue(List arg0)`
- `PortfolioReturnTermsBuilder setInitialValuationPrice(List arg0)`
- `PortfolioReturnTermsBuilder setInterimValuationPrice(List arg0)`
- `PortfolioReturnTermsBuilder setFinalValuationPrice(List arg0)`
- `PortfolioReturnTermsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `List getInterimValuationPrice()`
- `List getFinalValuationPrice()`
- `List getInitialValuationPrice()`
- `ReferenceWithMetaObservableBuilder getOrCreateUnderlier()`
- `ReferenceWithMetaObservableBuilder getUnderlier()`
- `PayerReceiverBuilder getPayerReceiver()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getQuantity()`
- `ReferenceWithMetaNonNegativeQuantityScheduleBuilder getOrCreateQuantity()`
- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInterimValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateFinalValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInitialValuationPrice(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PortfolioReturnTermsBuilder addInterimValuationPriceValue(List arg0)`
- `PortfolioReturnTermsBuilder addInterimValuationPriceValue(PriceSchedule arg0, int arg1)`
- `PortfolioReturnTermsBuilder addInterimValuationPriceValue(PriceSchedule arg0)`
- `PortfolioReturnTermsBuilder addInitialValuationPriceValue(PriceSchedule arg0)`
- `PortfolioReturnTermsBuilder addInitialValuationPriceValue(PriceSchedule arg0, int arg1)`
- `PortfolioReturnTermsBuilder addInitialValuationPriceValue(List arg0)`
- `PortfolioReturnTermsBuilder addFinalValuationPriceValue(PriceSchedule arg0)`
- `PortfolioReturnTermsBuilder addFinalValuationPriceValue(PriceSchedule arg0, int arg1)`
- `PortfolioReturnTermsBuilder addFinalValuationPriceValue(List arg0)`
- `PortfolioReturnTermsBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `PortfolioReturnTermsBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `PortfolioReturnTermsBuilder addInterimValuationPrice(List arg0)`
- `PortfolioReturnTermsBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `PortfolioReturnTermsBuilder addFinalValuationPrice(List arg0)`
- `PortfolioReturnTermsBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `PortfolioReturnTermsBuilder addInitialValuationPrice(List arg0)`
- `PortfolioReturnTermsBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `PortfolioReturnTermsBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PortfolioReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PortfolioReturnTermsBuilder toBuilder()`
- `PortfolioReturnTermsBuilder prune()`

