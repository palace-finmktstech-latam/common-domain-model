# Goldman Sachs Non-Deliverable Swap CDM Analysis

## Contract Overview

This document analyzes the CDM representation of a complex interest rate swap between Goldman Sachs Bank USA and Banco ABC.

### Key Characteristics

| Feature | Description |
|---------|-------------|
| Type | Non-Deliverable Interest Rate Swap |
| Term | 20 years (2023-2043) |
| Notionals | CLP 10.7B (floating) / CLF 316,764 (fixed) |
| Settlement | USD (non-deliverable) |
| Special Features | Amortizing, Inflation-linked |

## CDM Representation

### Structure

```
TradeState
└── Trade
    ├── TradeDate: 2022-08-26
    ├── TradeIdentifier[]
    ├── Party[]
    │   ├── Goldman Sachs Bank USA
    │   └── BANCO ABC
    ├── Counterparty[]
    │   ├── PARTY_1 (Floating Payer)
    │   └── PARTY_2 (Fixed Payer)
    └── Product: NonTransferableProduct
        └── EconomicTerms
            └── Payout
                └── InterestRatePayout[]
```

## Floating Leg Details

- **Payer**: Goldman Sachs Bank USA
- **Index**: CLP-ICP (Chilean overnight rate)
- **Spread**: None
- **Notional**: Amortizing from CLP 10,694,180,710
- **Payments**: Monthly on 5th

## Fixed Leg Details

- **Payer**: BANCO ABC
- **Rate**: 1.75% per annum
- **Notional**: CLF 316,764 (inflation-adjusted)
- **Payments**: Monthly on 5th

## Implementation Notes

### Challenges in CDM Representation

1. **Amortization Schedule**: The swap has a complex 240-period amortization schedule
2. **Inflation Linkage**: CLF/UF adjustment mechanism requires custom handling
3. **Non-Deliverable**: Settlement in USD while referencing CLP rates
4. **Interim Exchanges**: Multiple cash flows during the swap life

### CDM Limitations

The CDM 6.0.0 model provides the framework but would need extensions for:
- Detailed amortization schedules
- CLF/UF inflation adjustment formulas
- Complex disruption event handling
- Interim exchange specifications

