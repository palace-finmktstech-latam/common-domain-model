# BusinessCentersBuilder

**Full Name:** `cdm.base.datetime.BusinessCenters$BusinessCentersBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.BusinessCenters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `BusinessCentersBuilder setMeta(MetaFields arg0)`
- `BusinessCentersBuilder setCommodityBusinessCalendarValue(List arg0)`
- `BusinessCentersBuilder setCommodityBusinessCalendar(List arg0)`
- `BusinessCentersBuilder setBusinessCenterValue(List arg0)`
- `BusinessCentersBuilder setBusinessCenter(List arg0)`
- `BusinessCentersBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `BusinessCentersBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaCommodityBusinessCalendarEnumBuilder getOrCreateCommodityBusinessCalendar(int arg0)`
- `List getBusinessCenter()`
- `FieldWithMetaBusinessCenterEnumBuilder getOrCreateBusinessCenter(int arg0)`
- `List getCommodityBusinessCalendar()`
- `ReferenceWithMetaBusinessCentersBuilder getOrCreateBusinessCentersReference()`
- `ReferenceWithMetaBusinessCentersBuilder getBusinessCentersReference()`

#### Adder Methods

- `BusinessCentersBuilder addBusinessCenterValue(List arg0)`
- `BusinessCentersBuilder addBusinessCenterValue(BusinessCenterEnum arg0, int arg1)`
- `BusinessCentersBuilder addBusinessCenterValue(BusinessCenterEnum arg0)`
- `BusinessCentersBuilder addBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)`
- `BusinessCentersBuilder addBusinessCenter(FieldWithMetaBusinessCenterEnum arg0, int arg1)`
- `BusinessCentersBuilder addBusinessCenter(List arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendar(List arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendar(FieldWithMetaCommodityBusinessCalendarEnum arg0, int arg1)`
- `BusinessCentersBuilder addCommodityBusinessCalendar(FieldWithMetaCommodityBusinessCalendarEnum arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendarValue(List arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendarValue(CommodityBusinessCalendarEnum arg0)`
- `BusinessCentersBuilder addCommodityBusinessCalendarValue(CommodityBusinessCalendarEnum arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BusinessCentersBuilder prune()`

