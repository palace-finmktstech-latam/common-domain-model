# CreditIndex

**Full Name:** `cdm.observable.asset.CreditIndex`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.IndexBase`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `CreditIndex build()`

#### Getter Methods

- `Class getType()`
- `FieldWithMetaIndexAnnexSourceEnum getIndexAnnexSource()`
- `Date getIndexAnnexDate()`
- `SettledEntityMatrix getSettledEntityMatrix()`
- `Integer getIndexSeries()`
- `BigDecimal getIndexFactor()`
- `List getExcludedReferenceEntity()`
- `Integer getIndexAnnexVersion()`
- `CreditSeniorityEnum getSeniority()`
- `Tranche getTranche()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CreditIndexBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

