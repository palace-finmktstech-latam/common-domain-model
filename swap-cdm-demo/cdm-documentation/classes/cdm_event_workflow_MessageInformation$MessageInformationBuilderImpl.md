# MessageInformationBuilderImpl

**Full Name:** `cdm.event.workflow.MessageInformation$MessageInformationBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.MessageInformation$MessageInformationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| messageId | `FieldWithMetaStringBuilder` |  |
| sentBy | `FieldWithMetaStringBuilder` |  |
| sentTo | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |
| copyTo | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |

### Methods

#### Builder Methods

- `MessageInformation build()`

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

- `MessageInformationBuilder addSentToValue(List arg0)`
- `MessageInformationBuilder addSentToValue(String arg0)`
- `MessageInformationBuilder addSentToValue(String arg0, int arg1)`
- `MessageInformationBuilder addCopyToValue(List arg0)`
- `MessageInformationBuilder addCopyToValue(String arg0)`
- `MessageInformationBuilder addCopyToValue(String arg0, int arg1)`
- `MessageInformationBuilder addCopyTo(List arg0)`
- `MessageInformationBuilder addCopyTo(FieldWithMetaString arg0, int arg1)`
- `MessageInformationBuilder addCopyTo(FieldWithMetaString arg0)`
- `MessageInformationBuilder addSentTo(FieldWithMetaString arg0)`
- `MessageInformationBuilder addSentTo(FieldWithMetaString arg0, int arg1)`
- `MessageInformationBuilder addSentTo(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MessageInformationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MessageInformationBuilder prune()`
- `MessageInformationBuilder toBuilder()`
- `boolean hasData()`

