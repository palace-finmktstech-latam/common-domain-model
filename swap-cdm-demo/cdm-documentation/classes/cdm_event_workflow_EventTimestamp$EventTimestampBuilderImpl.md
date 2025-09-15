# EventTimestampBuilderImpl

**Full Name:** `cdm.event.workflow.EventTimestamp$EventTimestampBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.EventTimestamp$EventTimestampBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dateTime | `ZonedDateTime` |  |
| qualification | `EventTimestampQualificationEnum` |  |

### Methods

#### Builder Methods

- `EventTimestamp build()`

#### Setter Methods

- `EventTimestampBuilder setQualification(EventTimestampQualificationEnum arg0)`
- `EventTimestampBuilder setDateTime(ZonedDateTime arg0)`

#### Getter Methods

- `ZonedDateTime getDateTime()`
- `EventTimestampQualificationEnum getQualification()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EventTimestampBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EventTimestampBuilder toBuilder()`
- `EventTimestampBuilder prune()`

