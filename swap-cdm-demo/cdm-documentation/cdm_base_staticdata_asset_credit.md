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
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `NotDomesticCurrencyBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `NotDomesticCurrencyBuilder` [Setter]

### Obligations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Obligations` [Builder]
- `getListed()` → `Boolean` [Getter]
- `getCategory()` → `ObligationCategoryEnum` [Getter]
- `getExcluded()` → `String` [Getter]
- `getDesignatedPriority()` → `FieldWithMetaString` [Getter]
- `getCashSettlementOnly()` → `Boolean` [Getter]
- `getDeliveryOfCommitments()` → `Boolean` [Getter]
- `getContinuity()` → `Boolean` [Getter]
- `getOthReferenceEntityObligations()` → `String` [Getter]

### ObligationsBuilder
**Implements:** `Obligations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getDesignatedPriority()` → `FieldWithMetaStringBuilder` [Getter]
- `setContinuity(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setCashSettlementOnly(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setDesignatedPriority(FieldWithMetaString arg0)` → `ObligationsBuilder` [Setter]
- `setDesignatedPriorityValue(String arg0)` → `ObligationsBuilder` [Setter]
- `setDeliveryOfCommitments(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setListed(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setNotContingent(Boolean arg0)` → `ObligationsBuilder` [Setter]
- `setNotDomesticCurrency(NotDomesticCurrency arg0)` → `ObligationsBuilder` [Setter]
- `setNotSubordinated(Boolean arg0)` → `ObligationsBuilder` [Setter]

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
- `getOrCreateCurrency()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrencyValue(String arg0)` → `SpecifiedCurrencyBuilder` [Setter]
- `setApplicable(Boolean arg0)` → `SpecifiedCurrencyBuilder` [Setter]

