# LoanBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Loan$LoanBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Loan`
- `cdm.base.staticdata.asset.common.InstrumentBase$InstrumentBaseBuilder`

### Methods

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
- `FieldWithMetaStringBuilder getOrCreateFacilityType()`
- `FieldWithMetaStringBuilder getOrCreateLien()`
- `FieldWithMetaStringBuilder getOrCreateTranche()`

#### Adder Methods

- `LoanBuilder addIdentifier(AssetIdentifier arg0)`
- `LoanBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `LoanBuilder addIdentifier(List arg0)`
- `LoanBuilder addTaxonomy(List arg0)`
- `LoanBuilder addTaxonomy(Taxonomy arg0)`
- `LoanBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `LoanBuilder addRelatedExchange(List arg0)`
- `LoanBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `LoanBuilder addRelatedExchange(LegalEntity arg0)`
- `LoanBuilder addBorrower(LegalEntity arg0)`
- `LoanBuilder addBorrower(List arg0)`
- `LoanBuilder addBorrower(LegalEntity arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LoanBuilder prune()`

