# CreditIndexBuilderImpl

**Full Name:** `cdm.observable.asset.CreditIndex$CreditIndexBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.observable.asset.IndexBase$IndexBaseBuilderImpl`

### Implemented Interfaces

- `cdm.observable.asset.CreditIndex$CreditIndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| indexSeries | `Integer` |  |
| indexAnnexVersion | `Integer` |  |
| indexAnnexDate | `Date` |  |
| indexAnnexSource | `FieldWithMetaIndexAnnexSourceEnumBuilder` |  |
| excludedReferenceEntity | `java.util.List<cdm.product.asset.ReferenceInformation$ReferenceInformationBuilder>` |  |
| tranche | `TrancheBuilder` |  |
| settledEntityMatrix | `SettledEntityMatrixBuilder` |  |
| indexFactor | `BigDecimal` |  |
| seniority | `CreditSeniorityEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CreditIndex build()`

#### Setter Methods

- `CreditIndexBuilder setName(FieldWithMetaString arg0)`
- `CreditIndexBuilder setIsExchangeListed(Boolean arg0)`
- `CreditIndexBuilder setRelatedExchange(List arg0)`
- `CreditIndexBuilder setExchange(LegalEntity arg0)`
- `CreditIndexBuilder setProvider(LegalEntity arg0)`
- `CreditIndexBuilder setAssetClass(AssetClassEnum arg0)`
- `CreditIndexBuilder setTaxonomy(List arg0)`
- `CreditIndexBuilder setIdentifier(List arg0)`
- `CreditIndexBuilder setNameValue(String arg0)`
- `CreditIndexBuilder setTranche(Tranche arg0)`
- `CreditIndexBuilder setSeniority(CreditSeniorityEnum arg0)`
- `CreditIndexBuilder setIndexAnnexSource(FieldWithMetaIndexAnnexSourceEnum arg0)`
- `CreditIndexBuilder setIndexAnnexSourceValue(IndexAnnexSourceEnum arg0)`
- `CreditIndexBuilder setIndexSeries(Integer arg0)`
- `CreditIndexBuilder setIndexAnnexVersion(Integer arg0)`
- `CreditIndexBuilder setExcludedReferenceEntity(List arg0)`
- `CreditIndexBuilder setSettledEntityMatrix(SettledEntityMatrix arg0)`
- `CreditIndexBuilder setIndexFactor(BigDecimal arg0)`
- `CreditIndexBuilder setIndexAnnexDate(Date arg0)`
- `CreditIndexBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaIndexAnnexSourceEnumBuilder getIndexAnnexSource()`
- `Date getIndexAnnexDate()`
- `SettledEntityMatrixBuilder getSettledEntityMatrix()`
- `Integer getIndexSeries()`
- `BigDecimal getIndexFactor()`
- `List getExcludedReferenceEntity()`
- `Integer getIndexAnnexVersion()`
- `CreditSeniorityEnum getSeniority()`
- `TrancheBuilder getOrCreateTranche()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `SettledEntityMatrixBuilder getOrCreateSettledEntityMatrix()`
- `FieldWithMetaIndexAnnexSourceEnumBuilder getOrCreateIndexAnnexSource()`
- `ReferenceInformationBuilder getOrCreateExcludedReferenceEntity(int arg0)`
- `TrancheBuilder getTranche()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `CreditIndexBuilder addRelatedExchange(LegalEntity arg0)`
- `CreditIndexBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `CreditIndexBuilder addRelatedExchange(List arg0)`
- `CreditIndexBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `CreditIndexBuilder addTaxonomy(Taxonomy arg0)`
- `CreditIndexBuilder addTaxonomy(List arg0)`
- `CreditIndexBuilder addIdentifier(List arg0)`
- `CreditIndexBuilder addIdentifier(AssetIdentifier arg0)`
- `CreditIndexBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `CreditIndexBuilder addExcludedReferenceEntity(ReferenceInformation arg0, int arg1)`
- `CreditIndexBuilder addExcludedReferenceEntity(ReferenceInformation arg0)`
- `CreditIndexBuilder addExcludedReferenceEntity(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CreditIndexBuilder toBuilder()`
- `CreditIndexBuilder prune()`

