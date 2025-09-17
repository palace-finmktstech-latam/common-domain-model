# EquitySwapMasterConfirmation2018BuilderImpl

**Full Name:** `cdm.legaldocumentation.master.EquitySwapMasterConfirmation2018$EquitySwapMasterConfirmation2018BuilderImpl`

**Package:** `cdm.legaldocumentation.master`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.legaldocumentation.master.EquityMasterConfirmation$EquityMasterConfirmationBuilderImpl`

### Implemented Interfaces

- `cdm.legaldocumentation.master.EquitySwapMasterConfirmation2018$EquitySwapMasterConfirmation2018Builder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| typeOfSwapElection | `ReturnTypeEnum` |  |
| pricingMethodElection | `PriceReturnTermsBuilder` |  |
| linearInterpolationElection | `InterpolationMethodEnum` |  |
| settlementTerms | `SettlementTermsBuilder` |  |
| valuationDates | `ValuationDatesBuilder` |  |
| equityCashSettlementDates | `PaymentDatesBuilder` |  |

### Methods

#### Builder Methods

- `EquitySwapMasterConfirmation2018 build()`

#### Setter Methods

- `EquitySwapMasterConfirmation2018Builder setSettlementTerms(SettlementTerms arg0)`
- `EquitySwapMasterConfirmation2018Builder setValuationDates(ValuationDates arg0)`
- `EquitySwapMasterConfirmation2018Builder setTypeOfSwapElection(ReturnTypeEnum arg0)`
- `EquitySwapMasterConfirmation2018Builder setPricingMethodElection(PriceReturnTerms arg0)`
- `EquitySwapMasterConfirmation2018Builder setEquityCashSettlementDates(PaymentDates arg0)`
- `EquitySwapMasterConfirmation2018Builder setLinearInterpolationElection(InterpolationMethodEnum arg0)`

#### Getter Methods

- `ReturnTypeEnum getTypeOfSwapElection()`
- `ValuationDatesBuilder getValuationDates()`
- `ValuationDatesBuilder getOrCreateValuationDates()`
- `SettlementTermsBuilder getOrCreateSettlementTerms()`
- `PaymentDatesBuilder getEquityCashSettlementDates()`
- `SettlementTermsBuilder getSettlementTerms()`
- `PriceReturnTermsBuilder getPricingMethodElection()`
- `InterpolationMethodEnum getLinearInterpolationElection()`
- `PriceReturnTermsBuilder getOrCreatePricingMethodElection()`
- `PaymentDatesBuilder getOrCreateEquityCashSettlementDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EquitySwapMasterConfirmation2018Builder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `EquitySwapMasterConfirmation2018Builder prune()`
- `EquitySwapMasterConfirmation2018Builder toBuilder()`
- `boolean hasData()`

