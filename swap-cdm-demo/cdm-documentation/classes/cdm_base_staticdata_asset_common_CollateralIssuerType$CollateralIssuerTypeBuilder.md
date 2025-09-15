# CollateralIssuerTypeBuilder

**Full Name:** `cdm.base.staticdata.asset.common.CollateralIssuerType$CollateralIssuerTypeBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CollateralIssuerType`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CollateralIssuerTypeBuilder setSpecialPurposeVehicleType(SpecialPurposeVehicleIssuerType arg0)`
- `CollateralIssuerTypeBuilder setQuasiGovernmentType(QuasiGovernmentIssuerType arg0)`
- `CollateralIssuerTypeBuilder setRegionalGovernmentType(RegionalGovernmentIssuerType arg0)`
- `CollateralIssuerTypeBuilder setIssuerType(IssuerTypeEnum arg0)`
- `CollateralIssuerTypeBuilder setSupraNationalType(SupraNationalIssuerTypeEnum arg0)`

#### Getter Methods

- `QuasiGovernmentIssuerTypeBuilder getOrCreateQuasiGovernmentType()`
- `RegionalGovernmentIssuerTypeBuilder getOrCreateRegionalGovernmentType()`
- `SpecialPurposeVehicleIssuerTypeBuilder getSpecialPurposeVehicleType()`
- `SpecialPurposeVehicleIssuerTypeBuilder getOrCreateSpecialPurposeVehicleType()`
- `RegionalGovernmentIssuerTypeBuilder getRegionalGovernmentType()`
- `QuasiGovernmentIssuerTypeBuilder getQuasiGovernmentType()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralIssuerTypeBuilder prune()`

