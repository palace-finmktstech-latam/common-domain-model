# SubstitutionProvisionsBuilder

**Full Name:** `cdm.product.collateral.SubstitutionProvisions$SubstitutionProvisionsBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.SubstitutionProvisions`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `SubstitutionProvisionsBuilder setNoticeDeadlineDateTime(ZonedDateTime arg0)`
- `SubstitutionProvisionsBuilder setNoticeDeadlinePeriod(Period arg0)`
- `SubstitutionProvisionsBuilder setNumberOfSubstitutionsAllowed(Integer arg0)`

#### Getter Methods

- `PeriodBuilder getNoticeDeadlinePeriod()`
- `PeriodBuilder getOrCreateNoticeDeadlinePeriod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SubstitutionProvisionsBuilder prune()`

