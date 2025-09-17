# MessageInformationBuilder

**Full Name:** `cdm.event.workflow.MessageInformation$MessageInformationBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.MessageInformation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MessageInformationBuilder setMessageId(FieldWithMetaString arg0)`
- `MessageInformationBuilder setMessageIdValue(String arg0)`
- `MessageInformationBuilder setSentToValue(List arg0)`
- `MessageInformationBuilder setSentByValue(String arg0)`
- `MessageInformationBuilder setCopyToValue(List arg0)`
- `MessageInformationBuilder setSentBy(FieldWithMetaString arg0)`
- `MessageInformationBuilder setCopyTo(List arg0)`
- `MessageInformationBuilder setSentTo(List arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getMessageId()`
- `FieldWithMetaStringBuilder getOrCreateCopyTo(int arg0)`
- `FieldWithMetaStringBuilder getOrCreateMessageId()`
- `FieldWithMetaStringBuilder getOrCreateSentBy()`
- `FieldWithMetaStringBuilder getOrCreateSentTo(int arg0)`
- `List getSentTo()`
- `FieldWithMetaStringBuilder getSentBy()`
- `List getCopyTo()`

#### Adder Methods

- `MessageInformationBuilder addSentToValue(String arg0, int arg1)`
- `MessageInformationBuilder addSentToValue(List arg0)`
- `MessageInformationBuilder addSentToValue(String arg0)`
- `MessageInformationBuilder addCopyToValue(List arg0)`
- `MessageInformationBuilder addCopyToValue(String arg0, int arg1)`
- `MessageInformationBuilder addCopyToValue(String arg0)`
- `MessageInformationBuilder addCopyTo(FieldWithMetaString arg0, int arg1)`
- `MessageInformationBuilder addCopyTo(List arg0)`
- `MessageInformationBuilder addCopyTo(FieldWithMetaString arg0)`
- `MessageInformationBuilder addSentTo(FieldWithMetaString arg0)`
- `MessageInformationBuilder addSentTo(FieldWithMetaString arg0, int arg1)`
- `MessageInformationBuilder addSentTo(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MessageInformationBuilder prune()`

