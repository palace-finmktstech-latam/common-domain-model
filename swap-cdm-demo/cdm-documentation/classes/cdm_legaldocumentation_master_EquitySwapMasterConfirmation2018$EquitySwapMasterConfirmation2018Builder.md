# EquitySwapMasterConfirmation2018Builder

**Full Name:** `cdm.legaldocumentation.master.EquitySwapMasterConfirmation2018$EquitySwapMasterConfirmation2018Builder`

**Package:** `cdm.legaldocumentation.master`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.master.EquitySwapMasterConfirmation2018`
- `cdm.legaldocumentation.master.EquityMasterConfirmation$EquityMasterConfirmationBuilder`

### Methods

#### Setter Methods

- `EquitySwapMasterConfirmation2018Builder setSettlementTerms(SettlementTerms arg0)`
- `EquitySwapMasterConfirmation2018Builder setValuationDates(ValuationDates arg0)`
- `EquitySwapMasterConfirmation2018Builder setTypeOfSwapElection(ReturnTypeEnum arg0)`
- `EquitySwapMasterConfirmation2018Builder setPricingMethodElection(PriceReturnTerms arg0)`
- `EquitySwapMasterConfirmation2018Builder setEquityCashSettlementDates(PaymentDates arg0)`
- `EquitySwapMasterConfirmation2018Builder setLinearInterpolationElection(InterpolationMethodEnum arg0)`

#### Getter Methods

- `ValuationDatesBuilder getValuationDates()`
- `ValuationDatesBuilder getOrCreateValuationDates()`
- `SettlementTermsBuilder getOrCreateSettlementTerms()`
- `PaymentDatesBuilder getEquityCashSettlementDates()`
- `SettlementTermsBuilder getSettlementTerms()`
- `PriceReturnTermsBuilder getPricingMethodElection()`
- `PriceReturnTermsBuilder getOrCreatePricingMethodElection()`
- `PaymentDatesBuilder getOrCreateEquityCashSettlementDates()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EquitySwapMasterConfirmation2018Builder prune()`

