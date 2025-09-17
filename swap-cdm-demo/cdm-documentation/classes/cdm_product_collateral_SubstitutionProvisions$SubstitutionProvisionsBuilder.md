# SubstitutionProvisionsBuilder

**Full Name:** `cdm.product.collateral.SubstitutionProvisions$SubstitutionProvisionsBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.SubstitutionProvisions`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `SubstitutionProvisionsBuilder setNumberOfSubstitutionsAllowed(Integer arg0)`
- `SubstitutionProvisionsBuilder setNoticeDeadlineDateTime(ZonedDateTime arg0)`
- `SubstitutionProvisionsBuilder setNoticeDeadlinePeriod(Period arg0)`

#### Getter Methods

- `PeriodBuilder getOrCreateNoticeDeadlinePeriod()`
- `PeriodBuilder getNoticeDeadlinePeriod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SubstitutionProvisionsBuilder prune()`

