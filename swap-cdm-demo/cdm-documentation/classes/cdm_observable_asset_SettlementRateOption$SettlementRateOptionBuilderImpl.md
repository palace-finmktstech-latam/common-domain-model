# SettlementRateOptionBuilderImpl

**Full Name:** `cdm.observable.asset.SettlementRateOption$SettlementRateOptionBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.SettlementRateOption$SettlementRateOptionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| settlementRateOption | `FieldWithMetaSettlementRateOptionEnumBuilder` |  |
| priceSourceDisruption | `PriceSourceDisruptionBuilder` |  |

### Methods

#### Builder Methods

- `SettlementRateOption build()`

#### Setter Methods

- `SettlementRateOptionBuilder setSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)`
- `SettlementRateOptionBuilder setPriceSourceDisruption(PriceSourceDisruption arg0)`
- `SettlementRateOptionBuilder setSettlementRateOptionValue(SettlementRateOptionEnum arg0)`

#### Getter Methods

- `PriceSourceDisruptionBuilder getPriceSourceDisruption()`
- `FieldWithMetaSettlementRateOptionEnumBuilder getSettlementRateOption()`
- `FieldWithMetaSettlementRateOptionEnumBuilder getOrCreateSettlementRateOption()`
- `PriceSourceDisruptionBuilder getOrCreatePriceSourceDisruption()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SettlementRateOptionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SettlementRateOptionBuilder toBuilder()`
- `SettlementRateOptionBuilder prune()`

