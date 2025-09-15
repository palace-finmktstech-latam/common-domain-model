# BusinessCentersBuilderImpl

**Full Name:** `cdm.base.datetime.BusinessCenters$BusinessCentersBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.BusinessCenters$BusinessCentersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessCenter | `java.util.List<cdm.base.datetime.metafields.FieldWithMetaBusinessCenterEnum$FieldWithMetaBusinessCenterEnumBuilder>` |  |
| commodityBusinessCalendar | `java.util.List<cdm.base.datetime.metafields.FieldWithMetaCommodityBusinessCalendarEnum$FieldWithMetaCommodityBusinessCalendarEnumBuilder>` |  |
| businessCentersReference | `ReferenceWithMetaBusinessCentersBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `BusinessCenters build()`

#### Setter Methods

- `BusinessCentersBuilder setBusinessCenterValue(List arg0)`
- `BusinessCentersBuilder setBusinessCenter(List arg0)`
- `BusinessCentersBuilder setCommodityBusinessCalendarValue(List arg0)`
- `BusinessCentersBuilder setCommodityBusinessCalendar(List arg0)`
- `BusinessCentersBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`
- `BusinessCentersBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `BusinessCentersBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaBusinessCenterEnumBuilder getOrCreateBusinessCenter(int arg0)`
- `MetaFieldsBuilder getOrCreateMeta()`
- `List getBusinessCenter()`
- `FieldWithMetaCommodityBusinessCalendarEnumBuilder getOrCreateCommodityBusinessCalendar(int arg0)`
- `List getCommodityBusinessCalendar()`
- `ReferenceWithMetaBusinessCentersBuilder getBusinessCentersReference()`
- `ReferenceWithMetaBusinessCentersBuilder getOrCreateBusinessCentersReference()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `BusinessCentersBuilder addBusinessCenterValue(BusinessCenterEnum arg0, int arg1)`
- `BusinessCentersBuilder addBusinessCenterValue(List arg0)`
- `BusinessCentersBuilder addBusinessCenterValue(BusinessCenterEnum arg0)`
- `BusinessCentersBuilder addBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)`
- `BusinessCentersBuilder addBusinessCenter(List arg0)`
- `BusinessCentersBuilder addBusinessCenter(FieldWithMetaBusinessCenterEnum arg0, int arg1)`
- `BusinessCentersBuilder addCommodityBusinessCalendar(List arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendar(FieldWithMetaCommodityBusinessCalendarEnum arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendar(FieldWithMetaCommodityBusinessCalendarEnum arg0, int arg1)`
- `BusinessCentersBuilder addCommodityBusinessCalendarValue(CommodityBusinessCalendarEnum arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendarValue(List arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendarValue(CommodityBusinessCalendarEnum arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BusinessCentersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BusinessCentersBuilder toBuilder()`
- `BusinessCentersBuilder prune()`

