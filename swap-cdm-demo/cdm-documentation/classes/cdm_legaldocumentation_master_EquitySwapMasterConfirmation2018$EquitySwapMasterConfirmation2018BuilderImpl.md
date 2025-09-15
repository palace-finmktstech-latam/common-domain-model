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

- `EquitySwapMasterConfirmation2018Builder setValuationDates(ValuationDates arg0)`
- `EquitySwapMasterConfirmation2018Builder setSettlementTerms(SettlementTerms arg0)`
- `EquitySwapMasterConfirmation2018Builder setTypeOfSwapElection(ReturnTypeEnum arg0)`
- `EquitySwapMasterConfirmation2018Builder setPricingMethodElection(PriceReturnTerms arg0)`
- `EquitySwapMasterConfirmation2018Builder setLinearInterpolationElection(InterpolationMethodEnum arg0)`
- `EquitySwapMasterConfirmation2018Builder setEquityCashSettlementDates(PaymentDates arg0)`

#### Getter Methods

- `PriceReturnTermsBuilder getPricingMethodElection()`
- `SettlementTermsBuilder getOrCreateSettlementTerms()`
- `ReturnTypeEnum getTypeOfSwapElection()`
- `ValuationDatesBuilder getValuationDates()`
- `ValuationDatesBuilder getOrCreateValuationDates()`
- `InterpolationMethodEnum getLinearInterpolationElection()`
- `PaymentDatesBuilder getEquityCashSettlementDates()`
- `SettlementTermsBuilder getSettlementTerms()`
- `PriceReturnTermsBuilder getOrCreatePricingMethodElection()`
- `PaymentDatesBuilder getOrCreateEquityCashSettlementDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EquitySwapMasterConfirmation2018Builder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EquitySwapMasterConfirmation2018Builder toBuilder()`
- `EquitySwapMasterConfirmation2018Builder prune()`

