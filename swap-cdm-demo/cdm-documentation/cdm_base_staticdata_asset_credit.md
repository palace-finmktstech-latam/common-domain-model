# Package: cdm.base.staticdata.asset.credit

## Enums

### ObligationCategoryEnum
**Values:**
- `Payment`
- `BorrowedMoney`
- `ReferenceObligationsOnly`
- `Bond`
- `Loan`
- `BondOrLoan`

## Interfaces

### NotDomesticCurrency
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `NotDomesticCurrency` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### NotDomesticCurrencyBuilder
**Implements:** `NotDomesticCurrency` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `NotDomesticCurrencyBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `NotDomesticCurrencyBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `NotDomesticCurrencyBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]

### Obligations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Obligations` [Builder]
- `getGeneralFundObligationLiability()` → `Boolean` [Getter]
- `getRevenueObligationLiability()` → `Boolean` [Getter]
- `getFullFaithAndCreditObLiability()` → `Boolean` [Getter]
- `getNotDomesticLaw()` → `Boolean` [Getter]
- `getNotContingent()` → `Boolean` [Getter]
- `getSpecifiedCurrency()` → `SpecifiedCurrency` [Getter]
- `getNotDomesticIssuance()` → `Boolean` [Getter]
- `getNotDomesticCurrency()` → `NotDomesticCurrency` [Getter]

### ObligationsBuilder
**Implements:** `Obligations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSpecifiedCurrency(SpecifiedCurrency arg0)` → `ObligationsBuilder` [Setter]
- `setNotSovereignLender(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setCategory(ObligationCategoryEnum arg0)` → `ObligationsBuilder` [Setter]
- `setNotSubordinated(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setNotContingent(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setNotDomesticIssuance(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setNotDomesticCurrency(NotDomesticCurrency arg0)` → `ObligationsBuilder` [Setter]
- `setNotDomesticLaw(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setExcluded(String arg0)` → `ObligationsBuilder` [Setter]
- `setDesignatedPriority(FieldWithMetaString arg0)` → `ObligationsBuilder` [Setter]

### SpecifiedCurrency
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SpecifiedCurrency` [Builder]
- `getCurrency()` → `FieldWithMetaString` [Getter]
- `getApplicable()` → `Boolean` [Getter]

### SpecifiedCurrencyBuilder
**Implements:** `SpecifiedCurrency` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency(FieldWithMetaString arg0)` → `SpecifiedCurrencyBuilder` [Setter]
- `setCurrencyValue(String arg0)` → `SpecifiedCurrencyBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `SpecifiedCurrencyBuilder` [Setter]
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]

