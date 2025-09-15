# PrincipalPaymentScheduleMappingProcessor

**Full Name:** `cdm.product.common.settlement.processor.PrincipalPaymentScheduleMappingProcessor`

**Package:** `cdm.product.common.settlement.processor`

## Type: Concrete Class

### Inheritance

**Extends:**
- `com.regnosys.rosetta.common.translation.MappingProcessor`

### Methods

#### Setter Methods

- `void setCurrency(Path arg0, MoneyBuilder arg1)`
- `void setPayerReceiver(Path arg0, PrincipalPaymentBuilder arg1, BigDecimal arg2)`
- `void setCounterpartyRoleEnum(Path arg0, Consumer arg1)`

#### Getter Methods

- `Optional getPrincipalPayment(Path arg0, Path arg1)`
- `LocalDate getAdjustedOrUnadjustedDate(PrincipalPayment arg0)`
- `LinkedList getPrincipalPayments(Path arg0)`

#### Other Methods

- `void map(Path arg0, RosettaModelObjectBuilder arg1, RosettaModelObjectBuilder arg2)`

