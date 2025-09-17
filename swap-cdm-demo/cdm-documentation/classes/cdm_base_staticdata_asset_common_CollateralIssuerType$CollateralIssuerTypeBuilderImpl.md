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

- `CollateralIssuerTypeBuilder setSupraNationalType(SupraNationalIssuerTypeEnum arg0)`
- `CollateralIssuerTypeBuilder setRegionalGovernmentType(RegionalGovernmentIssuerType arg0)`
- `CollateralIssuerTypeBuilder setQuasiGovernmentType(QuasiGovernmentIssuerType arg0)`
- `CollateralIssuerTypeBuilder setIssuerType(IssuerTypeEnum arg0)`
- `CollateralIssuerTypeBuilder setSpecialPurposeVehicleType(SpecialPurposeVehicleIssuerType arg0)`

#### Getter Methods

- `IssuerTypeEnum getIssuerType()`
- `RegionalGovernmentIssuerTypeBuilder getRegionalGovernmentType()`
- `SupraNationalIssuerTypeEnum getSupraNationalType()`
- `QuasiGovernmentIssuerTypeBuilder getQuasiGovernmentType()`
- `SpecialPurposeVehicleIssuerTypeBuilder getOrCreateSpecialPurposeVehicleType()`
- `RegionalGovernmentIssuerTypeBuilder getOrCreateRegionalGovernmentType()`
- `SpecialPurposeVehicleIssuerTypeBuilder getSpecialPurposeVehicleType()`
- `QuasiGovernmentIssuerTypeBuilder getOrCreateQuasiGovernmentType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralIssuerTypeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CollateralIssuerTypeBuilder prune()`
- `CollateralIssuerTypeBuilder toBuilder()`
- `boolean hasData()`

