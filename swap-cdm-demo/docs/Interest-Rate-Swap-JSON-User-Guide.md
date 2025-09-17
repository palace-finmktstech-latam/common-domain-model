# Interest Rate Swap JSON Input User Guide

This guide documents the JSON input format for creating Interest Rate Swaps using the Generic Swap Builder. The format is based on the Scotia-BancoABC sample and supports comprehensive swap configurations including zero-coupon structures.

## Overview

The JSON structure consists of two main sections:
- **Header**: Trade-level information (dates, parties, trade ID)
- **Legs**: Array of swap legs (floating/fixed rate specifications)

## JSON Structure

```json
{
  "header": { ... },
  "legs": [ ... ]
}
```

---

## Header Section

The header contains trade-level information that applies to the entire swap.

### Trade Identification

#### `tradeId` (Required)
**Type**: String
**Description**: Unique identifier for the trade
**Examples**:
- `"7554"` - Simple numeric ID
- `"SWIR-2025-001"` - Structured ID
- `"UTI-7554-2025-SWIR-001"` - Regulatory UTI format

#### `tradeIdType` (Optional)
**Type**: String
**Description**: Specifies the type of trade identifier
**Possible Values**:
- `"UTI"` or `"UNIQUE_TRANSACTION_IDENTIFIER"` - Regulatory Unique Transaction Identifier
- `"USI"` or `"UNIQUE_SWAP_IDENTIFIER"` - Swap-specific identifier
- `"INTERNAL"` - Internal trade reference (maps to USI)
- `null` - Defaults to UTI

**Default**: `UNIQUE_TRANSACTION_IDENTIFIER` if not specified

### Trade Dates

#### `tradeDate` (Required)
**Type**: Object
**Description**: Date when the trade was executed
**Structure**:
```json
{
  "date": "10/09/2025",
  "businessDayConvention": "MODFOLLOWING",
  "businessCenters": ["CLSA"]
}
```

#### `effectiveDate` (Required)
**Type**: Object
**Description**: Date when the swap becomes effective
**Structure**: Same as `tradeDate`

#### `terminationDate` (Required)
**Type**: Object
**Description**: Final maturity date of the swap
**Structure**: Same as `tradeDate`

### Date Components

#### `date` (Required)
**Type**: String
**Format**: `"dd/MM/yyyy"`
**Examples**:
- `"10/09/2025"` - September 10, 2025
- `"05/01/2026"` - January 5, 2026

#### `businessDayConvention` (Required)
**Type**: String
**Description**: How dates are adjusted when they fall on non-business days
**Possible Values**:
- `"FOLLOWING"` - Move to next business day
- `"MODFOLLOWING"` - Modified following (most common)
- `"PRECEDING"` - Move to previous business day
- `"MODPRECEDING"` - Modified preceding
- `"NEAREST"` - Move to nearest business day
- `"NONE"` - No adjustment

**Recommended**: `"MODFOLLOWING"` for most cases

#### `businessCenters` (Required)
**Type**: Array of Strings
**Description**: Financial centers used for business day calculations
**Possible Values**:
- `["CLSA"]` - Santiago, Chile
- `["USNY"]` - New York, US
- `["GBLO"]` - London, UK
- `["JPTO"]` - Tokyo, Japan
- `["EUFR"]` - Frankfurt, Europe
- `["CLSA", "USNY"]` - Multiple centers

### Parties

#### `party1` (Required)
**Type**: Object
**Description**: First counterparty to the trade
**Structure**:
```json
{
  "partyId": "ThisBank",
  "partyName": "Banco ABC"
}
```

#### `party2` (Required)
**Type**: Object
**Description**: Second counterparty to the trade
**Structure**: Same as `party1`

#### Party Components

##### `partyId` (Required)
**Type**: String
**Description**: Internal reference ID for the party
**Examples**:
- `"ThisBank"` - Internal bank reference
- `"OurCounterparty"` - Counterparty reference
- `"BANK-001"` - Structured ID

##### `partyName` (Required)
**Type**: String
**Description**: Legal name of the party
**Examples**:
- `"Banco ABC"`
- `"Scotiabank Chile"`
- `"Goldman Sachs International"`

---

## Legs Section

The legs array contains specifications for each leg of the swap. Typically contains 2 legs (one floating, one fixed) but can support more complex structures.

### Leg Identification

#### `legId` (Required)
**Type**: String
**Description**: Unique identifier for this leg within the trade
**Examples**:
- `"Pata-ICP-ZeroCoupon"` - Descriptive ID
- `"FLOATING-LEG"` - Simple ID
- `"USD-FIXED-LEG"` - Currency-specific ID

### Party References

#### `payerPartyReference` (Required)
**Type**: String
**Description**: Reference to the party that pays this leg
**Values**: Must match a `partyId` from the header section
**Examples**:
- `"ThisBank"`
- `"OurCounterparty"`

#### `receiverPartyReference` (Required)
**Type**: String
**Description**: Reference to the party that receives this leg
**Values**: Must match a `partyId` from the header section

### Notional

#### `notionalAmount` (Required)
**Type**: Number
**Description**: Principal amount for calculations
**Examples**:
- `300000000000` - 300 billion (Chilean Pesos)
- `100000000` - 100 million (US Dollars)
- `50000000` - 50 million

#### `notionalCurrency` (Required)
**Type**: String
**Description**: Currency of the notional amount
**Possible Values**:
- `"CLP"` - Chilean Peso
- `"USD"` - US Dollar
- `"EUR"` - Euro
- `"GBP"` - British Pound
- `"JPY"` - Japanese Yen

### Rate Specification

#### `rateType` (Required)
**Type**: String
**Description**: Type of interest rate for this leg
**Possible Values**:
- `"FLOATING"` - Variable rate based on an index
- `"FIXED"` - Fixed rate for the life of the swap

### Fixed Rate Legs

#### `fixedRate` (Required for FIXED legs)
**Type**: Number
**Description**: Annual fixed interest rate (as decimal)
**Examples**:
- `0.04715` - 4.715% annual rate
- `0.035` - 3.5% annual rate
- `0.025` - 2.5% annual rate

### Floating Rate Legs

#### `floatingRateIndex` (Required for FLOATING legs)
**Type**: String
**Description**: Reference rate index for floating calculations. The system supports comprehensive automatic mapping to CDM enums.

**Major Supported Indices**:
- `"USD-SOFR"` - USD Secured Overnight Financing Rate
- `"USD-SOFR-COMPOUND"` - USD SOFR with compounding
- `"USD-SOFR Average 30D"` - USD SOFR 30-day average
- `"USD-SOFR Average 90D"` - USD SOFR 90-day average
- `"USD-SOFR Average 180D"` - USD SOFR 180-day average
- `"USD-LIBOR"` - USD LIBOR (legacy)
- `"USD-Federal Funds"` - US Federal Funds Rate
- `"USD-AMERIBOR"` - American Interbank Offered Rate
- `"USD-BSBY"` - Bloomberg Short-Term Bank Yield Index
- `"EUR-EURIBOR"` - Euro Interbank Offered Rate
- `"EUR-EONIA"` - Euro Overnight Index Average
- `"GBP-SONIA"` - Sterling Overnight Index Average
- `"GBP-LIBOR"` - GBP LIBOR (legacy)
- `"JPY-TONA"` - Tokyo Overnight Average rate
- `"JPY-TIBOR"` - Tokyo Interbank Offered Rate
- `"CHF-SARON"` - Swiss Average Rate Overnight
- `"AUD-AONIA"` - AUD Overnight Index Average
- `"AUD-BBSW"` - Bank Bill Swap Rate
- `"CAD-CORRA"` - Canadian Overnight Repo Rate Average
- `"CAD-CDOR"` - Canadian Dollar Offered Rate
- `"CLP-TNA"` - Chilean Tasa No Ajustable
- `"CLP-ICP"` - Chilean Interbank Average Rate

**Automatic Mapping**: The system uses intelligent fallback logic to map any floating rate index from the CDM documentation (600+ indices) by converting naming conventions. For example:
- `"USD-SOFR Average 180D"` → `USD_SOFR_AVERAGE_180_D` enum
- `"EUR-EURIBOR-6M"` → `EUR_EURIBOR_6_M` enum
- Handles spaces, hyphens, and various formatting automatically

**Note**: If an index is not recognized, the system logs a warning and continues processing without failure.

#### `spread` (Optional for FLOATING legs)
**Type**: Number
**Description**: Spread added to the floating rate (as decimal)
**Examples**:
- `0.0` - No spread
- `0.0015` - 15 basis points (0.15%)
- `-0.001` - Negative 10 basis points
- `0.025` - 250 basis points (2.5%)

**Default**: `0.0` if not specified

### Day Count Conventions

#### `dayCountFraction` (Required)
**Type**: String
**Description**: Method for calculating interest accrual
**Possible Values**:
- `"ACT/360"` - Actual days/360 (most common for floating)
- `"30/360"` - 30/360 (common for fixed USD)
- `"ACT/365.FIXED"` - Actual days/365
- `"ACT/365"` - Same as ACT/365.FIXED
- `"ACT/ACT.ISDA"` - Actual/Actual ISDA

**Recommendations**:
- Floating rates: `"ACT/360"`
- Fixed USD rates: `"30/360"`
- Fixed non-USD rates: `"ACT/365.FIXED"`

### Frequency Specifications

#### `calculationPeriodFrequency` (Required)
**Type**: String
**Description**: How often interest is calculated
**Possible Values**:
- `"1M"` - Monthly
- `"3M"` - Quarterly
- `"6M"` - Semi-annually
- `"1Y"` - Annually
- `"TERM"` - Single period (zero-coupon)

#### `paymentFrequency` (Required)
**Type**: String
**Description**: How often payments are made
**Possible Values**:
- `"1M"` - Monthly payments
- `"3M"` - Quarterly payments
- `"6M"` - Semi-annual payments
- `"1Y"` - Annual payments
- `"ATMATURITY"` - Single payment at maturity (zero-coupon)

#### `resetFrequency` (Optional for FLOATING legs)
**Type**: String
**Description**: How often the floating rate resets
**Possible Values**:
- `"1M"` - Monthly resets
- `"3M"` - Quarterly resets
- `"6M"` - Semi-annual resets
- `"TERM"` - Single reset (zero-coupon OIS)

**Default**: Same as `paymentFrequency` if not specified

### Business Day Adjustments

#### `paymentDayConvention` (Required)
**Type**: String
**Description**: How payment dates are adjusted for holidays
**Values**: Same as header `businessDayConvention`
**Special Value**: `"NONE"` - No adjustment (rare)

#### `paymentBusinessCenters` (Required)
**Type**: Array of Strings
**Description**: Business centers for payment date adjustments
**Values**: Same options as header `businessCenters`

#### `calculationDayConvention` (Optional)
**Type**: String
**Description**: How calculation period end dates are adjusted for holidays (separate from payment dates)
**Possible Values**:
- `"MODFOLLOWING"` - Modified following (most common)
- `"FOLLOWING"` - Move to next business day
- `"PRECEDING"` - Move to previous business day
- Same options as other business day conventions

**Default**: Uses `paymentDayConvention` if not specified
**Use Case**: Important for swaps where calculation periods and payment dates have different holiday adjustment rules

#### `calculationBusinessCenters` (Optional)
**Type**: Array of Strings
**Description**: Business centers for calculation period date adjustments
**Values**: Same options as header `businessCenters`

**Default**: Uses `paymentBusinessCenters` if not specified
**Use Case**: For multi-currency swaps where calculation periods follow different business calendars than payments

#### `resetDayConvention` (Optional for FLOATING legs)
**Type**: String
**Description**: How reset dates are adjusted
**Possible Values**:
- `"PRECEDING"` - Common for lookback structures
- `"MODFOLLOWING"` - Modified following
- Same options as other business day conventions

#### `resetBusinessCenters` (Optional for FLOATING legs)
**Type**: Array of Strings
**Description**: Business centers for reset date adjustments
**Values**: Same options as other business centers

### Date Offsets

#### `paymentDateOffset` (Optional)
**Type**: Integer
**Description**: Business days offset for payment dates
**Examples**:
- `0` - No offset (payment on calculation date)
- `1` - 1 business day after calculation date
- `2` - 2 business days after (common for USD)

#### `resetDateOffset` (Optional for FLOATING legs)
**Type**: Integer
**Description**: Business days offset for rate fixings (lookback)
**Examples**:
- `0` - No lookback
- `2` - 2 day lookback (common for SOFR)
- `5` - 5 day lookback

### Roll Conventions

#### `rollConvention` (Optional)
**Type**: String or null
**Description**: How payment dates roll forward
**Possible Values**:
- `"5"` - 5th of each month
- `"10"` - 10th of each month
- `"15"` - 15th of each month
- `"EOM"` - End of month
- `"IMM"` - IMM dates (3rd Wednesday)
- `null` - No specific roll convention

### Interest Rate Calculation Rounding

#### `rateRoundingPrecision` (Optional for FLOATING legs)
**Type**: Integer
**Description**: Number of decimal places for final interest rate calculations
**Examples**:
- `5` - 5 decimal places (0.12345%)
- `4` - 4 decimal places (0.1234%)
- `3` - 3 decimal places (0.123%)
- `2` - 2 decimal places (0.12%)

**Common Use Cases**:
- **SOFR Compounding**: `4` or `5` decimal places
- **ICP Compounding**: `5` decimal places (Chilean standard)
- **Basic Floating Rates**: `3` or `4` decimal places

#### `rateRoundingDirection` (Optional for FLOATING legs)
**Type**: String
**Description**: How to round the calculated interest rate
**Possible Values**:
- `"NEAREST"` - Round to nearest (most common)
- `"UP"` - Always round up (conservative for payers)
- `"DOWN"` - Always round down (conservative for receivers)

**Default**: No rounding applied if not specified

### Settlement

#### `settlementCurrency` (Required)
**Type**: String
**Description**: Currency for net settlement
**Values**: Same options as `notionalCurrency`

#### `settlementType` (Required)
**Type**: String
**Description**: Method of settlement
**Possible Values**:
- `"CASH"` - Cash settlement (most common)
- `"PHYSICAL"` - Physical delivery

**Recommended**: `"CASH"` for most swaps

### Settlement Information

**Note**: Advanced payment method fields (`cashSettlementMethod`, `deliveryMethod`, `settlementCentre`) have been removed from the leg-level specification to maintain clean, focused configuration. The current settlement model focuses on the essential `settlementCurrency` and `settlementType` fields for practical swap implementation.

---

## Common Patterns

### Zero-Coupon Interest Rate Swap
```json
{
  "calculationPeriodFrequency": "TERM",
  "paymentFrequency": "ATMATURITY",
  "resetFrequency": "TERM"
}
```

### Standard Quarterly Floating Leg
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "USD-SOFR Average 90D",
  "spread": 0.0015,
  "calculationPeriodFrequency": "3M",
  "paymentFrequency": "3M",
  "dayCountFraction": "ACT/360"
}
```

### Standard Semi-Annual Fixed Leg
```json
{
  "rateType": "FIXED",
  "fixedRate": 0.035,
  "calculationPeriodFrequency": "6M",
  "paymentFrequency": "6M",
  "dayCountFraction": "30/360"
}
```

### Chilean ICP Floating Leg with Calculation Periods
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "CLP-ICP",
  "spread": 0.0,
  "resetDayConvention": "PRECEDING",
  "resetBusinessCenters": ["CLSA"],
  "calculationDayConvention": "MODFOLLOWING",
  "calculationBusinessCenters": ["CLSA"],
  "dayCountFraction": "ACT/360",
  "rateRoundingPrecision": 5,
  "rateRoundingDirection": "NEAREST"
}
```

### SOFR Floating Leg with Compounding Rounding
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "USD-SOFR Average 180D",
  "spread": 0.0015,
  "calculationPeriodFrequency": "6M",
  "paymentFrequency": "6M",
  "dayCountFraction": "ACT/360",
  "rateRoundingPrecision": 4,
  "rateRoundingDirection": "UP"
}
```

### Multi-Currency Swap with Different Business Day Rules
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "EUR-EURIBOR",
  "spread": 0.002,
  "calculationPeriodFrequency": "3M",
  "paymentFrequency": "3M",
  "paymentDayConvention": "MODFOLLOWING",
  "paymentBusinessCenters": ["EUFR"],
  "calculationDayConvention": "FOLLOWING",
  "calculationBusinessCenters": ["EUFR", "GBLO"],
  "settlementCurrency": "EUR",
  "settlementType": "CASH"
}
```

---

## Validation Rules

### Required Combinations
- `FLOATING` legs must have `floatingRateIndex`
- `FIXED` legs must have `fixedRate`
- Party references must exist in header
- Business centers must be consistent
- Currencies should be valid ISO codes

### Date Logic
- `effectiveDate` ≥ `tradeDate`
- `terminationDate` > `effectiveDate`
- All dates must use same format

### Frequency Compatibility
- `resetFrequency` ≤ `paymentFrequency`
- Zero-coupon legs should use `"TERM"` and `"ATMATURITY"`

---

## Examples by Use Case

### 1. Standard USD Interest Rate Swap
- **Fixed Leg**: 3.5% semi-annual, 30/360
- **Floating Leg**: SOFR + 15bps quarterly, ACT/360

### 2. Chilean Zero-Coupon IRS
- **Fixed Leg**: 4.715% at maturity, ACT/360
- **Floating Leg**: ICP at maturity, ACT/360

### 3. Cross-Currency Swap
- Different `notionalCurrency` for each leg
- Settlement in specific currency

### 4. Basis Swap
- Both legs floating with different indices
- Different reset frequencies

---

## Error Handling and Automatic Mapping

The system provides robust error handling with warnings for:
- **Unknown business day conventions** (defaults to MODFOLLOWING)
- **Unknown business centers** (defaults to appropriate center)
- **Unknown floating rate indices**: Uses comprehensive automatic mapping to CDM enums
  - Supports 600+ floating rate indices from CDM documentation
  - Converts naming conventions automatically (spaces to underscores, handles special suffixes)
  - Only defaults to USD-SOFR-COMPOUND if all mapping attempts fail
- **Invalid frequencies** (defaults to appropriate values)
- **Unknown settlement types** (defaults to CASH)

### Floating Rate Index Mapping Examples
The system automatically handles these conversions:
- `"USD-SOFR Average 180D"` → Successfully mapped to CDM enum
- `"EUR-EURIBOR-6M"` → Mapped to appropriate CDM enum
- `"GBP-SONIA Compounded Index"` → Mapped to CDM enum
- `"JPY-TONA Average 30D"` → Mapped to CDM enum
- `"Unknown-Index"` → Warning logged, defaults to USD-SOFR-COMPOUND

All warnings are logged to help identify potential issues while maintaining system stability. The enhanced floating rate index mapping ensures that almost all standard market indices are recognized automatically.