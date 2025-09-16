Okay. So far what we've built are very specific Java structures in order to represent in the CDM very specific traits. However what I need to do is build a generic class. Maybe that's not the right term. I'm not familiar really with Java. Or a generic programme that basically I can provide a number of different inputs to the programme regarding a swap trade that I want to represent and for that programme to take those inputs and generate a CDM representation and corresponding JSON file for that trade. So therefore this programme needs to be able to receive values of different types so there can be trades that are fixed against fixed fixed against floating floating against floating different floating rates different currencies different date bases different counterparties etc etc etc. And it needs to be able to receive all of those and put them into a CDM representation. The purpose of this is essentially in the future what I want to do is be able to take trades that come from a number of different sources standardise them into the CDM model and then be able to make a direct comparison between two or more trades.

I am more familiar with Python and if we were to do this in Python I would ask you to expose it as an endpoint or an API that I can call from other applications. I am not sure whether that same concept applies in the same way to Java but we need to be able to call this from other locations.

Can you help me think this through and design it together? And then the output I will ask you to do is text that I can put into this very same markdown document that will define our specs for this programme.

---

## Generic Swap Builder Specification

### 1. Overview
A flexible, parameterized swap trade builder that can construct CDM-compliant representations of various swap types from standardized input parameters. The system will accept trade specifications and output both CDM objects and JSON representations.

**BC** I will provide the inputs as values that the CDM understands. For example, the floating rate indexes will have names such as USD-SOFR-COMPOUND, CLP-ICP, etc, business day conventions will be MODFOLLOWING, FOLLOWING, PRECEDING, etc.**END BC**

#### CDM Value Conventions
All input values will use CDM-standard formats:
- **Floating Rate Indices**: USD-SOFR-COMPOUND, EUR-EURIBOR-6M, CLP-ICP, etc.
- **Business Day Conventions**: MODFOLLOWING, FOLLOWING, PRECEDING, NONE, FRN
- **Day Count Fractions**: ACT/360, ACT/365.FIXED, 30/360, 30E/360, ACT/ACT.ISDA
- **Business Centers**: USNY, GBLO, EUTA, JPTO, CLSA, etc.

### 2. Architecture

#### 2.1 Core Components

**BC** Do we need a component for the overall Swap, i.e. header attributes, number of legs, etc? For example, we need a place to define:
- Trade Date, together with business day convention and business centers
- Effective Date, together with business day convention and business centers
- Termination Date, together with business day convention and business centers
- Parties and Counterparties**END BC**

**SwapHeader** (Trade-Level Component)
- Manages trade-level dates with their business day adjustments
- Handles party and counterparty information with roles
- Stores trade identifiers and metadata
- Coordinates overall swap structure

**SwapTradeBuilder** (Main Class)
- Entry point for building swap trades
- Validates input parameters
- Orchestrates CDM object construction
- Generates JSON output

**SwapParameters** (Input Model)
- Encapsulates all possible swap configuration parameters
- Uses builder pattern for flexible construction
- Supports validation of parameter combinations

**LegBuilder** (Component Builder)
- Constructs individual swap legs (payer/receiver)
- Handles fixed, floating, and amortizing schedules
- Manages rate calculations and day count conventions
**BC** Concepts that must be considered include:
- Payer/receiver
- Notional amounts
- Notional currencies
- Rate specifications
- Coupon specifications with dates, business day conventions, business centers, frequencies
- Initial, intermediate and final principal payments with associated payer/receivers, dates, business day conventions, business centers, amounts, currencies, frequencies
- Payment dates, business day conventions, business centers, offsets, frequencies
- Settlement currencies
- Settlement type (cash or physical)
- FX Fixing reference (for settlement conversion)
- FX Fixing offset (for settlement conversion)
- FX Fixing offset business day convention (for settlement conversion)
- FX Fixing business centers (for settlement conversion)**END BC**

**CDMMapper** (Transformation Layer)
- Maps input parameters to CDM objects
- Handles CDM-specific requirements and conventions
- Ensures compliance with CDM schema

### 3. Input Parameters Structure

```java
class SwapParameters {
    // Trade Header
    SwapHeader header;

    // Swap Legs (can support 2+ legs)
    List<LegParameters> legs;

    // Optional: Amortization
    AmortizationSchedule amortizationSchedule;
}

class SwapHeader {
    // Trade Identifiers
    String tradeId;

    // Trade Dates with Adjustments
    DateWithAdjustment tradeDate;
    DateWithAdjustment effectiveDate;
    DateWithAdjustment terminationDate;

    // Parties
    Party party1;
    Party party2;
}

class DateWithAdjustment {
    LocalDate date;
    String businessDayConvention; // MODFOLLOWING, FOLLOWING, etc.
    List<String> businessCenters; // ["USNY", "GBLO"]
}

class Party {
    String partyId;
    String partyName;
    String role; // PAYER, RECEIVER
}

class LegParameters {
    // Party Role
    String payerPartyReference; // Reference to party ID
    String receiverPartyReference;

    // Notional
    BigDecimal notionalAmount;
    String notionalCurrency;

    // Rate Specification
    RateType rateType; // FIXED, FLOATING

    // Fixed Rate Parameters
    BigDecimal fixedRate;

    // Floating Rate Parameters
    String floatingRateIndex; // USD-SOFR-COMPOUND, EUR-EURIBOR-6M
    BigDecimal spread;
    String resetFrequency;
    String resetDayConvention;
    List<String> resetBusinessCenters;
    Integer resetDateOffset; // days before payment

    // Coupon Schedule
    String paymentFrequency; // 3M, 6M, 1Y
    String dayCountFraction; // ACT/360, 30/360
    String paymentDayConvention;
    List<String> paymentBusinessCenters;
    Integer paymentDateOffset; // days after period end

    // Principal Exchanges
    PrincipalExchange initialExchange;
    PrincipalExchange finalExchange;
    List<PrincipalExchange> intermediateExchanges;

    // Settlement
    String settlementCurrency;
    String settlementType; // CASH, PHYSICAL
    FxFixingParameters fxFixing; // For cross-currency

    // Roll Convention
    String rollConvention; // EOM, IMM, etc.
}

class PrincipalExchange {
    BigDecimal amount;
    String currency;
    LocalDate date;
    String dayConvention;
    List<String> businessCenters;
    String payerPartyReference;
    String receiverPartyReference;
}

class FxFixingParameters {
    String fxFixingReference; // e.g., "ECB", "WM/Reuters"
    Integer fxFixingOffset; // days before payment
    String fxFixingDayConvention;
    List<String> fxFixingBusinessCenters;
}
```

### 4. Supported Swap Types

1. **Fixed vs Fixed** (Cross-currency)
   - Different currencies on each leg
   - Fixed rates on both legs
   - Optional principal exchanges

2. **Fixed vs Floating**
   - Single or cross-currency
   - One fixed leg, one floating leg
   - Configurable reset and payment frequencies

3. **Floating vs Floating** (Basis swap)
   - Same or different currencies
   - Different floating indices or tenors
   - Spreads on either/both legs

4. **Amortizing Swaps**
   - Any of the above with notional reduction schedule
   - Step-down or custom amortization profiles

### 5. API Design

#### 5.1 Java API
```java
public class SwapTradeBuilder {
    public TradeState buildTrade(SwapParameters parameters);
    public String buildTradeAsJson(SwapParameters parameters);
    public ValidationResult validateParameters(SwapParameters parameters);
}
```

#### 5.2 REST API Service (using Spring Boot)
```
POST /api/swap/build
Content-Type: application/json

Request Body: SwapParameters JSON
Response: CDM Trade JSON

POST /api/swap/validate
Content-Type: application/json

Request Body: SwapParameters JSON
Response: Validation results
```

#### 5.3 Command-Line Interface
```bash
java -jar swap-builder.jar --config swap-params.json --output trade.json
```

### 6. Validation Rules

1. **Mandatory Fields**
   - Trade ID, dates, counterparties
   - At least two legs defined
   - Valid currencies and notionals

2. **Business Logic**
   - Effective date <= Termination date
   - Payment frequencies align with term
   - Valid day count/business day conventions
   - Floating indices exist in reference data

3. **Cross-Currency Rules**
   - FX rate required if currencies differ
   - Principal exchanges typically required

### 7. Output Format

#### 7.1 CDM Object
- Fully populated `TradeState` object
- All required CDM fields populated
- Optional fields included where provided

#### 7.2 JSON Output
- CDM-compliant JSON structure
- Human-readable formatting
- Includes metadata (generation timestamp, version)

### 8. Implementation Approach

#### Phase 1: Core Builder
1. Create parameter models
2. Implement basic fixed vs fixed swap
3. Add validation framework
4. Generate JSON output

#### Phase 2: Extended Functionality
1. Add floating rate support
2. Implement amortization schedules
3. Add cross-currency features
4. Enhanced validation rules

#### Phase 3: Service Layer
1. REST API using Spring Boot
2. Swagger/OpenAPI documentation
3. Request/response logging
4. Error handling framework

#### Phase 4: Testing & Documentation
1. Unit tests for each component
2. Integration tests for full workflows
3. Example configurations
4. User documentation

### 9. Technology Stack

- **Core**: Java 11+, CDM Java libraries
- **Build**: Maven
- **API**: Spring Boot (for REST service)
- **JSON**: Jackson
- **Testing**: JUnit 5
- **Documentation**: OpenAPI/Swagger

### 10. Example Usage

```java
// Programmatic usage - Cross-currency swap example
SwapParameters params = SwapParameters.builder()
    .header(SwapHeader.builder()
        .tradeId("TRADE-001")
        .tradeDate(DateWithAdjustment.of(
            LocalDate.now(), "FOLLOWING", Arrays.asList("USNY", "GBLO")))
        .effectiveDate(DateWithAdjustment.of(
            LocalDate.now().plusDays(2), "MODFOLLOWING", Arrays.asList("USNY", "GBLO")))
        .terminationDate(DateWithAdjustment.of(
            LocalDate.now().plusYears(5), "MODFOLLOWING", Arrays.asList("USNY", "GBLO")))
        .party1(Party.of("BANK-A", "Bank A Corp", "PAYER"))
        .party2(Party.of("BANK-B", "Bank B Corp", "RECEIVER"))
        .build())
    .addLeg(LegParameters.builder()
        .payerPartyReference("BANK-A")
        .receiverPartyReference("BANK-B")
        .notionalAmount(10_000_000)
        .notionalCurrency("USD")
        .rateType(RateType.FIXED)
        .fixedRate(0.025)
        .paymentFrequency("6M")
        .dayCountFraction("ACT/360")
        .paymentDayConvention("MODFOLLOWING")
        .paymentBusinessCenters(Arrays.asList("USNY"))
        .settlementCurrency("USD")
        .settlementType("CASH")
        .initialExchange(PrincipalExchange.builder()
            .amount(10_000_000)
            .currency("USD")
            .date(LocalDate.now().plusDays(2))
            .dayConvention("MODFOLLOWING")
            .businessCenters(Arrays.asList("USNY"))
            .payerPartyReference("BANK-B")
            .receiverPartyReference("BANK-A")
            .build())
        .finalExchange(PrincipalExchange.builder()
            .amount(10_000_000)
            .currency("USD")
            .date(LocalDate.now().plusYears(5))
            .dayConvention("MODFOLLOWING")
            .businessCenters(Arrays.asList("USNY"))
            .payerPartyReference("BANK-A")
            .receiverPartyReference("BANK-B")
            .build())
        .build())
    .addLeg(LegParameters.builder()
        .payerPartyReference("BANK-B")
        .receiverPartyReference("BANK-A")
        .notionalAmount(8_500_000)
        .notionalCurrency("EUR")
        .rateType(RateType.FLOATING)
        .floatingRateIndex("EUR-EURIBOR-6M")
        .spread(0.001)
        .resetFrequency("6M")
        .resetDayConvention("MODFOLLOWING")
        .resetBusinessCenters(Arrays.asList("EUTA"))
        .resetDateOffset(-2)
        .paymentFrequency("6M")
        .dayCountFraction("ACT/360")
        .paymentDayConvention("MODFOLLOWING")
        .paymentBusinessCenters(Arrays.asList("EUTA"))
        .settlementCurrency("EUR")
        .settlementType("CASH")
        .fxFixing(FxFixingParameters.builder()
            .fxFixingReference("ECB")
            .fxFixingOffset(-2)
            .fxFixingDayConvention("PRECEDING")
            .fxFixingBusinessCenters(Arrays.asList("EUTA"))
            .build())
        .initialExchange(PrincipalExchange.builder()
            .amount(8_500_000)
            .currency("EUR")
            .date(LocalDate.now().plusDays(2))
            .dayConvention("MODFOLLOWING")
            .businessCenters(Arrays.asList("EUTA"))
            .payerPartyReference("BANK-A")
            .receiverPartyReference("BANK-B")
            .build())
        .finalExchange(PrincipalExchange.builder()
            .amount(8_500_000)
            .currency("EUR")
            .date(LocalDate.now().plusYears(5))
            .dayConvention("MODFOLLOWING")
            .businessCenters(Arrays.asList("EUTA"))
            .payerPartyReference("BANK-B")
            .receiverPartyReference("BANK-A")
            .build())
        .build())
    .build();

SwapTradeBuilder builder = new SwapTradeBuilder();
TradeState trade = builder.buildTrade(params);
String json = builder.buildTradeAsJson(params);
```

### 11. Comparison Features

For trade comparison (future enhancement):
- Normalize trades to common structure
- Identify differences in economic terms
- Generate comparison reports
- Support for multiple trade sources/formats 