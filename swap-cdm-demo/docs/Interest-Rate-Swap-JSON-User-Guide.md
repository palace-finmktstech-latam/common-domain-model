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
**Description**: Reference rate index for floating calculations
**Possible Values**:
- `"CLP-ICP"` - Chilean Interbank Average Rate
- `"USD-SOFR-COMPOUND"` - USD Secured Overnight Financing Rate
- `"USD-LIBOR"` - USD LIBOR (legacy)
- `"EUR-EURIBOR-6M"` - EUR 6-month EURIBOR
- `"EUR-EURIBOR-3M"` - EUR 3-month EURIBOR
- `"GBP-SONIA-COMPOUND"` - GBP Sterling Overnight Index Average

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

### Advanced Payment Methods (Optional)

#### `cashSettlementMethod` (Optional for CASH settlement)
**Type**: String
**Description**: Specific cash settlement methodology
**Possible Values**:
- `"CASH_PRICE_METHOD"` - Standard cash price method
- `"CASH_PRICE_ALTERNATE_METHOD"` - Alternative cash price method
- `"MID_MARKET_CALCULATION_AGENT_DETERMINATION"` - Mid-market calc agent determination
- `"MID_MARKET_INDICATIVE_QUOTATIONS"` - Mid-market indicative quotations
- `"CROSS_CURRENCY_METHOD"` - Cross-currency settlement method
- `"PAR_YIELD_CURVE_ADJUSTED_METHOD"` - Par yield curve adjusted method
- `"ZERO_COUPON_YIELD_ADJUSTED_METHOD"` - Zero coupon yield adjusted method

**Use Cases**:
- **Sophisticated swaps**: Mid-market calculation agent determination
- **Cross-currency swaps**: Cross-currency method
- **Credit derivatives**: Par yield curve methods

#### `deliveryMethod` (Optional for PHYSICAL settlement)
**Type**: String
**Description**: Physical delivery method
**Possible Values**:
- `"DELIVERY_VERSUS_PAYMENT"` - DVP settlement (most common)
- `"FREE_OF_PAYMENT"` - FOP settlement
- `"PRE_DELIVERY"` - Pre-delivery settlement
- `"PRE_PAYMENT"` - Pre-payment settlement

**Recommended**: `"DELIVERY_VERSUS_PAYMENT"` for physical settlement

#### `settlementCentre` (Optional)
**Type**: String
**Description**: Settlement infrastructure provider - supports both standard CDM systems and regional variations

**Standard CDM Settlement Centres** (set in CDM model):
- `"EUROCLEAR_BANK"` - Euroclear settlement system
- `"CLEARSTREAM_BANKING_LUXEMBOURG"` - Clearstream settlement system

**Regional Settlement Systems** (preserved in JSON, descriptive info logged):
- `"LBTR"` - Chilean Large Value Transfer System (real-time gross settlement)
- `"COMBANC"` - Chilean Compensation and Liquidation Chamber (net settlement)
- `"CORRESPONDENT_BANK"` - Correspondent banking arrangement
- `"CURRENT_ACCOUNT"` - Direct current account settlement
- Any regional bank names containing "BANCO"

**Important Notes**:
- **European systems**: Mapped to standard CDM enums and included in the CDM model
- **Regional systems**: Information preserved in input JSON with descriptive logging, but NOT mapped to European equivalents to avoid misleading associations
- **Custom metadata**: Regional settlement information could be extended using CDM's MetaFields capability for full preservation

**Use Cases**:
- **European trades**: Use `"EUROCLEAR_BANK"` or `"CLEARSTREAM_BANKING_LUXEMBOURG"`
- **Chilean trades**: Use `"LBTR"` or `"COMBANC"` - information will be preserved and logged
- **Multi-jurisdiction trades**: Mix European and regional systems as appropriate per leg

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
  "floatingRateIndex": "USD-SOFR-COMPOUND",
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

### Chilean ICP Floating Leg
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "CLP-ICP",
  "spread": 0.0,
  "resetDayConvention": "PRECEDING",
  "resetBusinessCenters": ["CLSA"],
  "dayCountFraction": "ACT/360",
  "rateRoundingPrecision": 5,
  "rateRoundingDirection": "NEAREST"
}
```

### SOFR Floating Leg with Compounding Rounding
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "USD-SOFR-COMPOUND",
  "spread": 0.0015,
  "calculationPeriodFrequency": "3M",
  "paymentFrequency": "3M",
  "dayCountFraction": "ACT/360",
  "rateRoundingPrecision": 4,
  "rateRoundingDirection": "UP"
}
```

### Sophisticated Cash Settlement
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "USD-SOFR-COMPOUND",
  "spread": 0.002,
  "calculationPeriodFrequency": "3M",
  "paymentFrequency": "3M",
  "settlementCurrency": "USD",
  "settlementType": "CASH",
  "cashSettlementMethod": "MID_MARKET_CALCULATION_AGENT_DETERMINATION",
  "settlementCentre": "EUROCLEAR_BANK"
}
```

### Physical Settlement with DVP
```json
{
  "rateType": "FIXED",
  "fixedRate": 0.035,
  "calculationPeriodFrequency": "6M",
  "paymentFrequency": "6M",
  "settlementCurrency": "EUR",
  "settlementType": "PHYSICAL",
  "deliveryMethod": "DELIVERY_VERSUS_PAYMENT",
  "settlementCentre": "CLEARSTREAM_BANKING_LUXEMBOURG"
}
```

### Chilean Market Settlement (LBTR)
```json
{
  "rateType": "FLOATING",
  "floatingRateIndex": "CLP-CAMARA-PROMEDIO",
  "spread": 0.001,
  "calculationPeriodFrequency": "1M",
  "paymentFrequency": "1M",
  "settlementCurrency": "CLP",
  "settlementType": "CASH",
  "cashSettlementMethod": "MID_MARKET_CALCULATION_AGENT_DETERMINATION",
  "settlementCentre": "LBTR"
}
```
*Note: LBTR information is preserved in JSON and logged descriptively. CDM model will not include a settlement centre enum to avoid misleading European mapping.*

### Chilean Market Settlement (COMBANC)
```json
{
  "rateType": "FIXED",
  "fixedRate": 0.045,
  "calculationPeriodFrequency": "3M",
  "paymentFrequency": "3M",
  "settlementCurrency": "CLP",
  "settlementType": "CASH",
  "cashSettlementMethod": "COLLATERALIZED_CASH_PRICE_METHOD",
  "settlementCentre": "COMBANC"
}
```
*Note: COMBANC information is preserved in JSON and logged descriptively. CDM model will not include a settlement centre enum to avoid misleading European mapping.*

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

## Error Handling

The system provides warnings for:
- Unknown business day conventions (defaults to MODFOLLOWING)
- Unknown business centers (defaults to appropriate center)
- Unknown floating rate indices (defaults to USD-SOFR-COMPOUND)
- Invalid frequencies (defaults to appropriate values)
- Unknown settlement types (defaults to CASH)

All warnings are logged to help identify potential issues while maintaining system stability.