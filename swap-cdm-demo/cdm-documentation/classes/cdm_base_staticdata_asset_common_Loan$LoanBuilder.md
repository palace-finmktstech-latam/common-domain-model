# LoanBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Loan$LoanBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Loan`
- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilder`

### Methods

#### Setter Methods

- `LoanBuilder setIsExchangeListed(Boolean arg0)`
- `LoanBuilder setRelatedExchange(List arg0)`
- `LoanBuilder setExchange(LegalEntity arg0)`
- `LoanBuilder setInstrumentType(InstrumentTypeEnum arg0)`
- `LoanBuilder setLienValue(String arg0)`
- `LoanBuilder setFacilityType(FieldWithMetaString arg0)`
- `LoanBuilder setFacilityTypeValue(String arg0)`
- `LoanBuilder setCreditAgreementDate(Date arg0)`
- `LoanBuilder setTrancheValue(String arg0)`
- `LoanBuilder setBorrower(List arg0)`
- `LoanBuilder setTaxonomy(List arg0)`
- `LoanBuilder setIdentifier(List arg0)`
- `LoanBuilder setTranche(FieldWithMetaString arg0)`
- `LoanBuilder setLien(FieldWithMetaString arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getFacilityType()`
- `LegalEntityBuilder getOrCreateBorrower(int arg0)`
- `FieldWithMetaStringBuilder getOrCreateLien()`
- `FieldWithMetaStringBuilder getOrCreateFacilityType()`
- `FieldWithMetaStringBuilder getOrCreateTranche()`
- `List getBorrower()`
- `FieldWithMetaStringBuilder getTranche()`
- `FieldWithMetaStringBuilder getLien()`

#### Adder Methods

- `LoanBuilder addRelatedExchange(List arg0)`
- `LoanBuilder addRelatedExchange(LegalEntity arg0)`
- `LoanBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `LoanBuilder addBorrower(LegalEntity arg0)`
- `LoanBuilder addBorrower(LegalEntity arg0, int arg1)`
- `LoanBuilder addBorrower(List arg0)`
- `LoanBuilder addTaxonomy(List arg0)`
- `LoanBuilder addTaxonomy(Taxonomy arg0)`
- `LoanBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `LoanBuilder addIdentifier(AssetIdentifier arg0)`
- `LoanBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `LoanBuilder addIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LoanBuilder prune()`

