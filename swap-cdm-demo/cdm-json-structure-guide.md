# CDM JSON Representation: Cross-Currency Interest Rate Swap

## Overview

This document explains the JSON structure that CDM generates for financial trades, using our cross-currency interest rate swap as an example. The JSON shown above represents a simplified swap trade created using CDM 6.0.0.

## JSON Structure Analysis

### Root Level: TradeState
```json
{
  "trade": { ... },           // The actual trade object
  "state": null,              // Lifecycle state (EXECUTED, SETTLED, etc.)
  "resetHistory": null,       // History of rate resets
  "transferHistory": null,    // History of transfers/payments
  "observationHistory": null, // History of market observations
  "valuationHistory": null,   // History of valuations
  "meta": null,              // CDM metadata
  "type": "cdm.event.common.TradeState"
}
```

**Key Points:**
- `TradeState` is the top-level container for trade information
- Contains both static trade data and dynamic lifecycle information
- `type` field always indicates the CDM class name

### Trade Level Structure
```json
"trade": {
  "product": { ... },        // Financial product definition
  "tradeIdentifier": [ ... ], // Trade IDs (UTI, USI, etc.)
  "tradeDate": { ... },      // Trade execution date
  "party": [ ... ],          // Counterparties
  "counterparty": [ ... ],   // Counterparty roles
  "type": "cdm.event.common.Trade"
}
```

## Product Structure: Your Cross-Currency Swap

For your cross-currency swap, the product structure would look like this:

### Product Container
```json
"product": {
  "economicTerms": {
    "payout": [
      {
        "interestRatePayout": {
          // Fixed leg: Bank A pays 5% CLP
          "payerReceiver": {
            "payer": "PARTY_1",      // Bank A
            "receiver": "PARTY_2"    // Goldman Sachs
          },
          "rateSpecification": {
            "fixedRate": {
              "rateSchedule": {
                "priceValue": 0.05   // 5%
              }
            }
          },
          "priceQuantity": {
            // CLP 950B notional
            "quantitySchedule": {
              "initialValue": 9500000000.00,
              "unit": {
                "currency": "CLP"
              }
            }
          },
          "calculationPeriodDates": {
            "effectiveDate": {
              "adjustableDate": {
                "unadjustedDate": {
                  "day": 12,
                  "month": 9,
                  "year": 2025
                },
                "dateAdjustments": {
                  "businessDayConvention": "MODFOLLOWING",
                  "businessCenters": ["NYFD", "CLSA"]
                }
              }
            },
            "terminationDate": {
              "adjustableDate": {
                "unadjustedDate": {
                  "day": 12,
                  "month": 9,
                  "year": 2030
                }
              }
            },
            "calculationPeriodFrequency": {
              "periodMultiplier": 6,
              "period": "M",          // Monthly
              "rollConvention": "_12" // 12th of month
            }
          },
          "paymentDates": {
            "paymentFrequency": {
              "periodMultiplier": 6,
              "period": "M"           // Semi-annual
            },
            "payRelativeTo": "CALCULATION_PERIOD_END_DATE",
            "paymentDaysOffset": {
              "periodMultiplier": 2,
              "dayType": "BUSINESS"   // T+2
            }
          },
          "settlementTerms": {
            "settlementCurrency": "USD"  // Net settlement
          }
        }
      },
      {
        "interestRatePayout": {
          // Floating leg: Bank A receives SOFR + 100bps USD
          "payerReceiver": {
            "payer": "PARTY_2",      // Goldman Sachs
            "receiver": "PARTY_1"    // Bank A
          },
          "rateSpecification": {
            "floatingRate": {
              "rateOption": {
                "floatingRateIndex": "USD-SOFR-COMPOUND",
                "indexTenor": {
                  "periodMultiplier": 1,
                  "period": "D"      // Daily compounding
                }
              },
              "spreadSchedule": {
                "initialValue": 0.01 // 100 bps
              }
            }
          },
          "priceQuantity": {
            // USD 10M notional
            "quantitySchedule": {
              "initialValue": 10000000.00,
              "unit": {
                "currency": "USD"
              }
            }
          },
          "resetDates": {
            "resetRelativeTo": "CALCULATION_PERIOD_START_DATE",
            "fixingDates": {
              "periodMultiplier": -1, // T-1
              "dayType": "BUSINESS",
              "businessDayConvention": "PRECEDING",
              "businessCenters": ["USNY"]
            }
          },
          "compoundingMethod": "STRAIGHT",
          "settlementTerms": {
            "settlementCurrency": "USD"
          }
        }
      }
    ]
  },
  "type": "cdm.product.template.NonTransferableProduct"
}
```

### Party Structure
```json
"party": [
  {
    "name": {
      "value": "Bank A",
      "type": "com.rosetta.model.metafields.FieldWithMetaString"
    },
    "partyId": [
      {
        "identifier": "LEI:BANKA123456789012",
        "identifierType": "LEI"
      }
    ],
    "type": "cdm.base.staticdata.party.Party"
  },
  {
    "name": {
      "value": "Goldman Sachs International",
      "type": "com.rosetta.model.metafields.FieldWithMetaString"
    },
    "partyId": [
      {
        "identifier": "LEI:784F5XWPLTWKTBV55W24",
        "identifierType": "LEI"
      }
    ],
    "type": "cdm.base.staticdata.party.Party"
  }
],
"counterparty": [
  {
    "role": "PARTY_1",
    "partyReference": "bank-a-global-key",
    "type": "cdm.base.staticdata.party.Counterparty"
  },
  {
    "role": "PARTY_2", 
    "partyReference": "goldman-sachs-global-key",
    "type": "cdm.base.staticdata.party.Counterparty"
  }
]
```

### Trade Identifiers
```json
"tradeIdentifier": [
  {
    "assignedIdentifier": [
      {
        "identifierValue": "XCCY-SWAP-001",
        "version": 1
      }
    ],
    "identifierType": "UNIQUE_TRANSACTION_IDENTIFIER",
    "type": "cdm.event.common.TradeIdentifier"
  }
]
```

### Date Representation
```json
"tradeDate": {
  "value": {
    "day": 10,
    "month": 9,
    "year": 2025
  },
  "meta": null,
  "type": "com.rosetta.model.metafields.FieldWithMetaDate"
}
```

## Key CDM JSON Characteristics

### 1. Type Safety
Every object includes a `type` field indicating its CDM class:
```json
"type": "cdm.product.asset.InterestRatePayout"
```

### 2. Metadata Fields
CDM objects include metadata for tracking and audit:
```json
"meta": {
  "globalKey": "abc123...",
  "externalKey": [...],
  "location": "trade.product.economicTerms.payout[0]"
}
```

### 3. Null Field Inclusion
CDM JSON includes all possible fields, even if null:
```json
"principalPayment": null,
"bondReference": null,
"fixedAmount": null
```
This provides a complete schema view.

### 4. Wrapped Values
Many simple values are wrapped in metadata containers:
```json
"name": {
  "value": "Bank A",
  "meta": null,
  "type": "com.rosetta.model.metafields.FieldWithMetaString"
}
```

### 5. Choice Fields
CDM uses choice patterns for alternatives:
```json
"rateSpecification": {
  "fixedRate": { ... },      // One choice
  "floatingRate": null,      // Alternative choice
  "inflationRate": null      // Alternative choice
}
```

## Cross-Currency Specific Elements

### 1. Multiple Payouts
Cross-currency swaps have separate payouts for each leg:
```json
"payout": [
  { "interestRatePayout": { /* Fixed CLP leg */ } },
  { "interestRatePayout": { /* Floating USD leg */ } }
]
```

### 2. Different Currencies
Each leg specifies its own currency:
```json
"priceQuantity": {
  "quantitySchedule": {
    "unit": { "currency": "CLP" }  // or "USD"
  }
}
```

### 3. Settlement Currency
Both legs settle in the same currency:
```json
"settlementTerms": {
  "settlementCurrency": "USD"
}
```

### 4. FX Observables
For currency conversion (would be in a separate observable):
```json
"fxFeature": {
  "referenceCurrency": "USD",
  "composite": {
    "determinationMethod": "SCHEDULED_DATE",
    "fxSpotRateSource": {
      "primarySource": "BCCh",
      "rateSourcePage": "DOLAR_OBSERVADO"
    }
  }
}
```

## Benefits of CDM JSON

### 1. Interoperability
Standard format across all institutions and systems.

### 2. Completeness
All trade details captured in structured format.

### 3. Auditability
Full lineage and metadata for regulatory compliance.

### 4. Extensibility
New fields and structures can be added without breaking existing systems.

### 5. Validation
JSON structure enforces business rules and data constraints.

## Usage Scenarios

### 1. Trade Capture
```json
POST /trades
Content-Type: application/json
{ /* CDM TradeState JSON */ }
```

### 2. Regulatory Reporting
Transform CDM JSON to regulatory formats (CFTC, ESMA, etc.).

### 3. Risk Management
Parse JSON to extract risk factors and notionals.

### 4. Lifecycle Events
Update TradeState JSON for amendments, terminations.

### 5. Cross-System Integration
Exchange trade data between different platforms.

This JSON representation provides a complete, standardized way to represent your cross-currency interest rate swap that can be understood and processed by any CDM-compliant system.