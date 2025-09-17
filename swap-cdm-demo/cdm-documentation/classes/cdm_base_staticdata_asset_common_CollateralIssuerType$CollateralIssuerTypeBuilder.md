# CollateralIssuerTypeBuilder

**Full Name:** `cdm.base.staticdata.asset.common.CollateralIssuerType$CollateralIssuerTypeBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CollateralIssuerType`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CollateralIssuerTypeBuilder setSupraNationalType(SupraNationalIssuerTypeEnum arg0)`
- `CollateralIssuerTypeBuilder setRegionalGovernmentType(RegionalGovernmentIssuerType arg0)`
- `CollateralIssuerTypeBuilder setQuasiGovernmentType(QuasiGovernmentIssuerType arg0)`
- `CollateralIssuerTypeBuilder setIssuerType(IssuerTypeEnum arg0)`
- `CollateralIssuerTypeBuilder setSpecialPurposeVehicleType(SpecialPurposeVehicleIssuerType arg0)`

#### Getter Methods

- `RegionalGovernmentIssuerTypeBuilder getRegionalGovernmentType()`
- `QuasiGovernmentIssuerTypeBuilder getQuasiGovernmentType()`
- `SpecialPurposeVehicleIssuerTypeBuilder getOrCreateSpecialPurposeVehicleType()`
- `RegionalGovernmentIssuerTypeBuilder getOrCreateRegionalGovernmentType()`
- `SpecialPurposeVehicleIssuerTypeBuilder getSpecialPurposeVehicleType()`
- `QuasiGovernmentIssuerTypeBuilder getOrCreateQuasiGovernmentType()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralIssuerTypeBuilder prune()`

