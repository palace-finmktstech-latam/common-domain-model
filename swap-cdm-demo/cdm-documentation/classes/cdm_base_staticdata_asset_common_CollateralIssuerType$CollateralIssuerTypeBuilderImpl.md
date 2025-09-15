# CollateralIssuerTypeBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.CollateralIssuerType$CollateralIssuerTypeBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.CollateralIssuerType$CollateralIssuerTypeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| issuerType | `IssuerTypeEnum` |  |
| supraNationalType | `SupraNationalIssuerTypeEnum` |  |
| quasiGovernmentType | `QuasiGovernmentIssuerTypeBuilder` |  |
| regionalGovernmentType | `RegionalGovernmentIssuerTypeBuilder` |  |
| specialPurposeVehicleType | `SpecialPurposeVehicleIssuerTypeBuilder` |  |

### Methods

#### Builder Methods

- `CollateralIssuerType build()`

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
- `IssuerTypeEnum getIssuerType()`
- `SupraNationalIssuerTypeEnum getSupraNationalType()`
- `QuasiGovernmentIssuerTypeBuilder getQuasiGovernmentType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralIssuerTypeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CollateralIssuerTypeBuilder toBuilder()`
- `CollateralIssuerTypeBuilder prune()`

