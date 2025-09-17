# LoanBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.Loan$LoanBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Loan$LoanBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| borrower | `java.util.List<cdm.base.staticdata.party.LegalEntity$LegalEntityBuilder>` |  |
| lien | `FieldWithMetaStringBuilder` |  |
| facilityType | `FieldWithMetaStringBuilder` |  |
| creditAgreementDate | `Date` |  |
| tranche | `FieldWithMetaStringBuilder` |  |

### Methods

#### Builder Methods

- `Loan build()`

#### Setter Methods

- `LoanBuilder setIdentifier(List arg0)`
- `LoanBuilder setTaxonomy(List arg0)`
- `LoanBuilder setExchange(LegalEntity arg0)`
- `LoanBuilder setIsExchangeListed(Boolean arg0)`
- `LoanBuilder setRelatedExchange(List arg0)`
- `LoanBuilder setLien(FieldWithMetaString arg0)`
- `LoanBuilder setTranche(FieldWithMetaString arg0)`
- `LoanBuilder setFacilityTypeValue(String arg0)`
- `LoanBuilder setCreditAgreementDate(Date arg0)`
- `LoanBuilder setTrancheValue(String arg0)`
- `LoanBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `LoanBuilder setBorrower(List arg0)`
- `LoanBuilder setLienValue(String arg0)`
- `LoanBuilder setFacilityType(FieldWithMetaString arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getLien()`
- `FieldWithMetaStringBuilder getTranche()`
- `LegalEntityBuilder getOrCreateBorrower(int arg0)`
- `FieldWithMetaStringBuilder getFacilityType()`
- `List getBorrower()`
- `Date getCreditAgreementDate()`
- `FieldWithMetaStringBuilder getOrCreateFacilityType()`
- `FieldWithMetaStringBuilder getOrCreateLien()`
- `FieldWithMetaStringBuilder getOrCreateTranche()`

#### Adder Methods

- `LoanBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `LoanBuilder addIdentifier(AssetIdentifier arg0)`
- `LoanBuilder addIdentifier(List arg0)`
- `LoanBuilder addTaxonomy(List arg0)`
- `LoanBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `LoanBuilder addTaxonomy(Taxonomy arg0)`
- `LoanBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `LoanBuilder addRelatedExchange(LegalEntity arg0)`
- `LoanBuilder addRelatedExchange(List arg0)`
- `LoanBuilder addBorrower(List arg0)`
- `LoanBuilder addBorrower(LegalEntity arg0, int arg1)`
- `LoanBuilder addBorrower(LegalEntity arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LoanBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `LoanBuilder prune()`
- `LoanBuilder toBuilder()`
- `boolean hasData()`

