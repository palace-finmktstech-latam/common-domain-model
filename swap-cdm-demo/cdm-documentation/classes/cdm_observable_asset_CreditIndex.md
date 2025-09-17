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
- `MetaFields getMeta()`
- `Tranche getTranche()`
- `Integer getIndexSeries()`
- `Date getIndexAnnexDate()`
- `List getExcludedReferenceEntity()`
- `FieldWithMetaIndexAnnexSourceEnum getIndexAnnexSource()`
- `Integer getIndexAnnexVersion()`
- `CreditSeniorityEnum getSeniority()`
- `BigDecimal getIndexFactor()`
- `SettledEntityMatrix getSettledEntityMatrix()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CreditIndexBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

