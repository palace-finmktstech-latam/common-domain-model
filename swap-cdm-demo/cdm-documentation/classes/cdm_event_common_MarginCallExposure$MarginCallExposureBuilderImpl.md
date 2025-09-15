# MarginCallExposureBuilderImpl

**Full Name:** `cdm.event.common.MarginCallExposure$MarginCallExposureBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.common.MarginCallBase$MarginCallBaseBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.MarginCallExposure$MarginCallExposureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| overallExposure | `ExposureBuilder` |  |
| simmIMExposure | `ExposureBuilder` |  |
| scheduleGridIMExposure | `ExposureBuilder` |  |

### Methods

#### Builder Methods

- `MarginCallExposure build()`

#### Setter Methods

- `MarginCallExposureBuilder setPartyRole(List arg0)`
- `MarginCallExposureBuilder setAgreementMinimumTransferAmount(Money arg0)`
- `MarginCallExposureBuilder setIndependentAmountBalance(CollateralBalance arg0)`
- `MarginCallExposureBuilder setCollateralPortfolioValue(CollateralPortfolio arg0)`
- `MarginCallExposureBuilder setCallIdentifier(Identifier arg0)`
- `MarginCallExposureBuilder setInstructionType(MarginCallInstructionType arg0)`
- `MarginCallExposureBuilder setClearingBroker(Party arg0)`
- `MarginCallExposureBuilder setCallAgreementType(AgreementName arg0)`
- `MarginCallExposureBuilder setScheduleGridIMExposure(Exposure arg0)`
- `MarginCallExposureBuilder setAgreementRounding(Money arg0)`
- `MarginCallExposureBuilder setRegMarginType(RegMarginTypeEnum arg0)`
- `MarginCallExposureBuilder setAgreementThreshold(Money arg0)`
- `MarginCallExposureBuilder setOverallExposure(Exposure arg0)`
- `MarginCallExposureBuilder setRegIMRole(RegIMRoleEnum arg0)`
- `MarginCallExposureBuilder setSimmIMExposure(Exposure arg0)`
- `MarginCallExposureBuilder setCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0)`
- `MarginCallExposureBuilder setBaseCurrencyExposure(MarginCallExposure arg0)`
- `MarginCallExposureBuilder setParty(List arg0)`

#### Getter Methods

- `ExposureBuilder getSimmIMExposure()`
- `ExposureBuilder getScheduleGridIMExposure()`
- `ExposureBuilder getOverallExposure()`
- `ExposureBuilder getOrCreateScheduleGridIMExposure()`
- `ExposureBuilder getOrCreateOverallExposure()`
- `ExposureBuilder getOrCreateSimmIMExposure()`

#### Adder Methods

- `MarginCallExposureBuilder addParty(List arg0)`
- `MarginCallExposureBuilder addParty(Party arg0, int arg1)`
- `MarginCallExposureBuilder addParty(Party arg0)`
- `MarginCallExposureBuilder addPartyRole(List arg0)`
- `MarginCallExposureBuilder addPartyRole(PartyRole arg0, int arg1)`
- `MarginCallExposureBuilder addPartyRole(PartyRole arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MarginCallExposureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MarginCallExposureBuilder toBuilder()`
- `MarginCallExposureBuilder prune()`

