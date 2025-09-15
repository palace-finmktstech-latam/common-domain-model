# NovationInstructionMappingProcessor

**Full Name:** `cdm.event.common.processor.NovationInstructionMappingProcessor`

**Package:** `cdm.event.common.processor`

## Type: Concrete Class

### Inheritance

**Extends:**
- `com.regnosys.rosetta.common.translation.MappingProcessor`

### Methods

#### Setter Methods

- `void setQuantity(QuantityScheduleBuilder arg0, Path arg1)`
- `void setAsset(AssetBuilder arg0, Path arg1)`

#### Getter Methods

- `Optional getTransferInstruction(Path arg0)`
- `Optional getIncomingPartyChangeInstruction(Path arg0)`
- `Optional getIncomingQuantityChangeInstruction(Path arg0)`
- `Optional getOutgoingQuantityChangeInstruction(Path arg0)`

#### Other Methods

- `void map(Path arg0, List arg1, RosettaModelObjectBuilder arg2)`

