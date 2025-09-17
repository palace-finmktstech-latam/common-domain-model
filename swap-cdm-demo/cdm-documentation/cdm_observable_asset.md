# Package: cdm.observable.asset

## Enums

### CashPriceTypeEnum
**Values:**
- `Premium`
- `Fee`
- `Discount`

### CommodityReferencePriceEnum
**Values:**
- `ALUMINIUM ALLOY-LME 15 MONTH`
- `COAL-CENTRAL APPALACHIAN-NYMEX`
- `COCOA-ICE`
- `COFFEE ARABICA-ICE`
- `COFFEE ROBUSTA-ICE`
- `COPPER-COMEX`
- `CORN-CBOT`
- `COTTON NO. 2-ICE`
- `ETHANOL-CBOT`
- `FEEDER CATTLE-CME`
- `FROZEN CONCENTRATED ORANGE JUICE NO. 1-ICE`
- `GASOLINE-RBOB-NEW YORK-ICE`
- `GASOLINE-RBOB-NEW YORK-NYMEX`
- `GOLD-COMEX`
- `HEATING OIL-NEW YORK-NYMEX`
- `LEAN HOGS-CME`
- `LIVE CATTLE-CME`
- `LUMBER-CME`
- `MILK-CLASS III-CME`
- `MILK-NONFAT-DRY-CME`
- `NATURAL GAS-NYMEX`
- `NATURAL GAS-PEPL (TEXOK MAINLINE)-INSIDE FERC`
- `NATURAL GAS-W. TEXAS (WAHA)-INSIDE FERC`
- `OATS-CBOT`
- `OIL-WTI-NYMEX`
- `PALLADIUM-NYMEX`
- `PLATINUM-NYMEX`
- `RICE-CBOT`
- `SILVER-COMEX`
- `SOYBEANS-CBOT`
- `SOYBEAN MEAL-CBOT`
- `SOYBEAN OIL-CBOT`
- `SUGAR # 11 (WORLD)-ICE`
- `SUGAR # 16 (US)-ICE`
- `WHEAT-CBOT`
- `WHEAT HRW-KCBOT`
- `WHEAT RED SPRING-MGE`

### CreditNotationBoundaryEnum
**Values:**
- `Minimum`
- `Maximum`

### CreditNotationMismatchResolutionEnum
**Values:**
- `Lowest`
- `Highest`
- `ReferenceAgency`
- `Average`
- `SecondBest`
- `Other`

### CreditRatingAgencyEnum
**Values:**
- `AMBest`
- `CBRS`
- `DBRS`
- `Fitch`
- `Japanagency`
- `Moodys`
- `RatingAndInvestmentInformation`
- `StandardAndPoors`

### CreditRatingCreditWatchEnum
**Values:**
- `Positive`
- `Negative`
- `Developing`

### CreditRatingOutlookEnum
**Values:**
- `Positive`
- `Negative`
- `Stable`
- `Developing`

### CsaTypeEnum
**Values:**
- `NoCSA`
- `ExistingCSA`
- `ReferenceVMCSA`

### FeeTypeEnum
**Values:**
- `Assignment`
- `BrokerageCommission`
- `Increase`
- `Novation`
- `PartialTermination`
- `Premium`
- `Renegotiation`
- `Termination`
- `Upfront`
- `CreditEvent`
- `CorporateAction`

### InformationProviderEnum
**Values:**
- `AssocBanksSingapore`
- `BancoCentralChile`
- `BankOfCanada`
- `BankOfEngland`
- `BankOfJapan`
- `Bloomberg`
- `EuroCentralBank`
- `FederalReserve`
- `FHLBSF`
- `ICESWAP`
- `ISDA`
- `Refinitiv`
- `ReserveBankAustralia`
- `ReserveBankNewZealand`
- `Reuters`
- `SAFEX`
- `Telerate`
- `TOKYOSWAP`

### InterpolationMethodEnum
**Values:**
- `Linear`
- `LinearZeroYield`
- `None`

### PartyDeterminationEnum
**Values:**
- `ExercisingParty`
- `NonExercisingParty`
- `AsSpecifiedInMasterAgreement`
- `AsSpecifiedInStandardTermsSupplement`
- `Both`

### PremiumTypeEnum
**Values:**
- `PrePaid`
- `PostPaid`
- `Variable`
- `Fixed`

### PriceExpressionEnum
**Values:**
- `AbsoluteTerms`
- `PercentageOfNotional`
- `ParValueFraction`
- `PerOption`

### PriceOperandEnum
**Values:**
- `AccruedInterest`
- `Commission`
- `ForwardPoint`

### PriceTypeEnum
**Values:**
- `AssetPrice`
- `CashPrice`
- `Correlation`
- `Dividend`
- `ExchangeRate`
- `InterestRate`
- `Variance`
- `Volatility`

### QuotationRateTypeEnum
**Values:**
- `Bid`
- `Ask`
- `Mid`
- `ExercisingPartyPays`

### QuotationSideEnum
**Values:**
- `Afternoon`
- `Ask`
- `Bid`
- `Closing`
- `High`
- `Index`
- `MeanOfBidAndAsk`
- `LocationalMarginal`
- `Low`
- `MarginalHourly`
- `MarketClearing`
- `MeanOfHighAndLow`
- `Morning`
- `Official`
- `Opening`
- `OSP`
- `Settlement`
- `Spot`
- `Mid`
- `NationalSingle`
- `WeightedAverage`
- `UnWeightedAverage`

### QuotationStyleEnum
**Values:**
- `PointsUpFront`
- `TradedSpread`
- `Price`

### QuoteBasisEnum
**Values:**
- `Currency1PerCurrency2`
- `Currency2PerCurrency1`

### SettlementRateOptionEnum
**Values:**
- `ARS.BNAR/ARS01`
- `ARS.EMTA.INDICATIVE.SURVEY.RATE/ARS04`
- `ARS.EMTA.INDUSTRY.SURVEY.RATE/ARS03`
- `ARS.MAE/ARS05`
- `ARS.OFFICIAL.RATE/ARS02`
- `BRL.BRBY/BRL01`
- `BRL.EMTA.INDICATIVE.SURVEY.RATE/BRL13`
- `BRL.EMTA.INDUSTRY.SURVEY.RATE/BRL12`
- `BRL.OFFICIAL.RATE/BRL02`
- `BRL.PCOT-COMMERCIAL/BRL03`
- `BRL.PCOT-FLOATING/BRL04`
- `BRL.PTAX/BRL09`
- `BRL.PTAX-COMMERCIAL/BRL05`
- `BRL.PTAX-COMMERCIAL.BRFR/BRL06`
- `BRL.PTAX-FLOATING/BRL07`
- `BRL.PTAX-FLOATING.BRFR/BRL08`
- `CLP.BCCH/CLP01`
- `CLP.CHILD-INFORMAL/CLP02`
- `CLP.CHILD-INTERBANK/CLP03`
- `CLP.CHILD-OBSERVADO/CLP04`
- `CLP.CHILG-INFORMAL/CLP05`
- `CLP.CHILG-INTERBANK/CLP06`
- `CLP.CHILG-OBSERVADO/CLP07`
- `CLP.DOLAR.OBS/CLP10`
- `CLP.EMTA.INDICATIVE.SURVEY.RATE/CLP11`
- `CLP.OFFICIAL.RATE/CLP08`
- `CLP.TELERATE.38942/CLP09`
- `CNY.SAEC/CNY01`
- `CNY.SFEMC.INDICATIVE.SURVEY.RATE/CNY02`
- `COP.CO/COL03/COP01`
- `COP.EMTA.INDICATIVE.SURVEY.RATE/COP03`
- `COP.TRM/COP02`
- `CURRENCY-IMPLIED.RATE.(ADR)/CURA1`
- `CURRENCY-IMPLIED.RATE.(LOCAL.ASSET)/CURA2`
- `CURRENCY-MUTUAL.AGREEMENT/CURA3`
- `CURRENCY-REFERENCE.DEALERS/CURA4`
- `CURRENCY-WHOLESALE.MARKET/CURA5`
- `ECS.DNRP/ECS01`
- `IDR.ABS/IDR01`
- `IDR.JISDOR/IDR04`
- `IDR.SFEMC.INDICATIVE.SURVEY.RATE/IDR02`
- `IDR.VWAP/IDR03`
- `ILS.BOIJ/ILS01`
- `ILS.FXIL/ILS02`
- `INR.FBIL/INR01`
- `INR.RBIB/INR01`
- `INR.SFEMC.INDICATIVE.SURVEY.RATE/INR02`
- `KRW.KEBEY/KRW01`
- `KRW.KFTC18/KRW02`
- `KRW.SFEMC.INDICATIVE.SURVEY.RATE/KRW04`
- `KRW.TELERATE.45644/KRW03`
- `KZT.EMTA.INDICATIVE.SURVEY.RATE/KZT02`
- `KZT.KASE/KZT01`
- `LBP.BDLX/LBP01`
- `MAD.OFFICIAL.RATE/MAD01`
- `MXP.BNMX/MXP01`
- `MXP.FIXING.RATE/MXP02`
- `MXP.MEX01/MXP03`
- `MXP.PUBLISHED/MXP04`
- `MYR.ABS/MYR01`
- `MYR.KL.REF/MYR04`
- `MYR.PPKM/MYR03`
- `MYR.SFEMC.INDICATIVE.SURVEY.RATE/MYR02`
- `PEN.EMTA.INDICATIVE.SURVEY.RATE/PEN04`
- `PEN.INTERBANK.AVE/PEN05`
- `PEN.PDSB/PEN01`
- `PEN.WT.AVE/PEN03`
- `PHP.BAPPESO/PHP06`
- `PHP.PDSPESO/PHP06`
- `PHP.PHPESO/PHP01`
- `PHP.SFEMC.INDICATIVE.SURVEY.RATE/PHP05`
- `PHP.TELERATE.15439/PHP03`
- `PHP.TELERATE.2920/PHP02`
- `PKR.SBPK/PKR01`
- `PKR.SFEMC.INDICATIVE.SURVEY.RATE/PKR02`
- `PLZ.NBPQ/PLZ01`
- `PLZ.NBPR/PLZ02`
- `RUB.CME-EMTA/RUB03`
- `RUB.EMTA.INDICATIVE.SURVEY.RATE/RUB04`
- `RUB.MICEXFRX/RUB01`
- `RUB.MMVB/RUB02`
- `SGD.VWAP/SGD3`
- `SKK.NBSB/SKK01`
- `THB.ABS/THB01`
- `THB.VWAP/THB01`
- `TWD.SFEMC.INDICATIVE.SURVEY.RATE/TWD04`
- `TWD.TAIFX1/TWD03`
- `TWD.TELERATE.6161/TWD01`
- `TWD.TFEMA/TWD02`
- `UAH.EMTA.INDICATIVE.SURVEY.RATE/UAH03`
- `UAH.EMTA.INDUSTRY.SURVEY.RATE/UAH02`
- `UAH.GFI/UAH01`
- `VEF.FIX/VEF01`
- `VND.ABS/VND01`
- `VND.FX/VND02`
- `VND.SFEMC.INDICATIVE.SURVEY.RATE/VND03`

### ValuationMethodEnum
**Values:**
- `Market`
- `Highest`
- `AverageMarket`
- `AverageHighest`
- `BlendedMarket`
- `BlendedHighest`
- `AverageBlendedMarket`
- `AverageBlendedHighest`

## Interfaces

### Basket
**Implements:** `AssetBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Basket` [Builder]
- `getBasketConstituent()` → `List` [Getter]

### BasketBuilder
**Implements:** `Basket` `AssetBase$AssetBaseBuilder` 

**Key Methods:**
- `setIdentifier(List arg0)` → `BasketBuilder` [Setter]
- `setTaxonomy(List arg0)` → `BasketBuilder` [Setter]
- `getBasketConstituent()` → `List` [Getter]
- `setExchange(LegalEntity arg0)` → `BasketBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituent(List arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituentValue(List arg0)` → `BasketBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `BasketBuilder` [Setter]
- `getOrCreateBasketConstituent(int arg0)` → `FieldWithMetaBasketConstituentBuilder` [Getter]

### BasketConstituent
**Implements:** `Observable` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BasketConstituent` [Builder]
- `getQuantity()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInterimValuationPrice()` → `List` [Getter]

### BasketConstituentBuilder
**Implements:** `BasketConstituent` `Observable$ObservableBuilder` 

**Key Methods:**
- `setIndex(Index arg0)` → `BasketConstituentBuilder` [Setter]
- `getQuantity()` → `List` [Getter]
- `setQuantity(List arg0)` → `BasketConstituentBuilder` [Setter]
- `getOrCreateQuantity(int arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setAsset(Asset arg0)` → `BasketConstituentBuilder` [Setter]
- `setQuantityValue(List arg0)` → `BasketConstituentBuilder` [Setter]
- `setBasket(Basket arg0)` → `BasketConstituentBuilder` [Setter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInterimValuationPrice()` → `List` [Getter]

### CalculationAgent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationAgent` [Builder]
- `getCalculationAgentParty()` → `AncillaryRoleEnum` [Getter]
- `getCalculationAgentPartyEnum()` → `PartyDeterminationEnum` [Getter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]

### CalculationAgentBuilder
**Implements:** `CalculationAgent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationAgentParty(AncillaryRoleEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentBusinessCenterValue(BusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentPartyEnum(PartyDeterminationEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `getOrCreateCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]

### CashCollateralValuationMethod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashCollateralValuationMethod` [Builder]
- `getProtectedParty()` → `List` [Getter]
- `getApplicableCsa()` → `CsaTypeEnum` [Getter]
- `getAgreedDiscountRate()` → `FieldWithMetaString` [Getter]
- `getCashCollateralCurrency()` → `String` [Getter]
- `getPrescribedDocumentationAdjustment()` → `Boolean` [Getter]
- `getCashCollateralInterestRate()` → `FieldWithMetaString` [Getter]

### CashCollateralValuationMethodBuilder
**Implements:** `CashCollateralValuationMethod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getAgreedDiscountRate()` → `FieldWithMetaStringBuilder` [Getter]
- `setCashCollateralCurrency(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRateValue(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRate(FieldWithMetaString arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setApplicableCsa(CsaTypeEnum arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setProtectedParty(List arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `getOrCreateAgreedDiscountRate()` → `FieldWithMetaStringBuilder` [Getter]
- `setPrescribedDocumentationAdjustment(Boolean arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `getCashCollateralInterestRate()` → `FieldWithMetaStringBuilder` [Getter]
- `setCashCollateralInterestRate(FieldWithMetaString arg0)` → `CashCollateralValuationMethodBuilder` [Setter]

### CashPrice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashPrice` [Builder]
- `getCashPriceType()` → `CashPriceTypeEnum` [Getter]
- `getPremiumExpression()` → `PremiumExpression` [Getter]
- `getFeeType()` → `FeeTypeEnum` [Getter]

### CashPriceBuilder
**Implements:** `CashPrice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPremiumExpression()` → `PremiumExpressionBuilder` [Getter]
- `setFeeType(FeeTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `setCashPriceType(CashPriceTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `setPremiumExpression(PremiumExpression arg0)` → `CashPriceBuilder` [Setter]
- `getOrCreatePremiumExpression()` → `PremiumExpressionBuilder` [Getter]

### CreditIndex
**Implements:** `IndexBase` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditIndex` [Builder]
- `getMeta()` → `MetaFields` [Getter]
- `getTranche()` → `Tranche` [Getter]
- `getIndexSeries()` → `Integer` [Getter]
- `getIndexAnnexDate()` → `Date` [Getter]
- `getExcludedReferenceEntity()` → `List` [Getter]
- `getIndexAnnexSource()` → `FieldWithMetaIndexAnnexSourceEnum` [Getter]
- `getIndexAnnexVersion()` → `Integer` [Getter]
- `getSeniority()` → `CreditSeniorityEnum` [Getter]

### CreditIndexBuilder
**Implements:** `CreditIndex` `IndexBase$IndexBaseBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `CreditIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `CreditIndexBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CreditIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `CreditIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `CreditIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `CreditIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `CreditIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `CreditIndexBuilder` [Setter]

### CreditNotation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditNotation` [Builder]
- `getNotation()` → `FieldWithMetaString` [Getter]
- `getAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getScale()` → `FieldWithMetaString` [Getter]
- `getDebt()` → `CreditRatingDebt` [Getter]
- `getOutlook()` → `CreditRatingOutlookEnum` [Getter]
- `getCreditWatch()` → `CreditRatingCreditWatchEnum` [Getter]

### CreditNotationBuilder
**Implements:** `CreditNotation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setScale(FieldWithMetaString arg0)` → `CreditNotationBuilder` [Setter]
- `getNotation()` → `FieldWithMetaStringBuilder` [Getter]
- `getScale()` → `FieldWithMetaStringBuilder` [Getter]
- `getDebt()` → `CreditRatingDebtBuilder` [Getter]
- `setAgency(CreditRatingAgencyEnum arg0)` → `CreditNotationBuilder` [Setter]
- `setDebt(CreditRatingDebt arg0)` → `CreditNotationBuilder` [Setter]
- `setOutlook(CreditRatingOutlookEnum arg0)` → `CreditNotationBuilder` [Setter]
- `getOrCreateDebt()` → `CreditRatingDebtBuilder` [Getter]
- `setCreditWatch(CreditRatingCreditWatchEnum arg0)` → `CreditNotationBuilder` [Setter]
- `setNotation(FieldWithMetaString arg0)` → `CreditNotationBuilder` [Setter]

### CreditNotations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditNotations` [Builder]
- `getCreditNotation()` → `CreditNotation` [Getter]
- `getCreditNotations()` → `MultipleCreditNotations` [Getter]

### CreditNotationsBuilder
**Implements:** `CreditNotations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCreditNotation(CreditNotation arg0)` → `CreditNotationsBuilder` [Setter]
- `getCreditNotation()` → `CreditNotationBuilder` [Getter]
- `getCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]
- `setCreditNotations(MultipleCreditNotations arg0)` → `CreditNotationsBuilder` [Setter]
- `getOrCreateCreditNotation()` → `CreditNotationBuilder` [Getter]
- `getOrCreateCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]

### CreditRatingDebt
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditRatingDebt` [Builder]
- `getDebtType()` → `FieldWithMetaString` [Getter]
- `getDebtTypes()` → `MultipleDebtTypes` [Getter]

### CreditRatingDebtBuilder
**Implements:** `CreditRatingDebt` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(FieldWithMetaString arg0)` → `CreditRatingDebtBuilder` [Setter]
- `setDebtTypeValue(String arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getOrCreateDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]
- `setDebtTypes(MultipleDebtTypes arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]

### Curve
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Curve` [Builder]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnum` [Getter]
- `getInterestRateCurve()` → `InterestRateCurve` [Getter]

### CurveBuilder
**Implements:** `Curve` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setInterestRateCurve(InterestRateCurve arg0)` → `CurveBuilder` [Setter]
- `setCommodityCurveValue(CommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]
- `getOrCreateCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `setCommodityCurve(FieldWithMetaCommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]
- `getInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]
- `getOrCreateInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]

### DividendApplicability
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendApplicability` [Builder]
- `getAllDividends()` → `Boolean` [Getter]
- `getAdditionalDividends()` → `Boolean` [Getter]
- `getOptionsExchangeDividends()` → `Boolean` [Getter]

### DividendApplicabilityBuilder
**Implements:** `DividendApplicability` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setAllDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setAdditionalDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setOptionsExchangeDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]

### EquityIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EquityIndex` [Builder]

### EquityIndexBuilder
**Implements:** `EquityIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `EquityIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `EquityIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `EquityIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `EquityIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `EquityIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `EquityIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `EquityIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]

### FallbackReferencePrice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FallbackReferencePrice` [Builder]
- `getValuationPostponement()` → `ValuationPostponement` [Getter]
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getFallbackSurveyValuationPostponement()` → `Boolean` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgent` [Getter]

### FallbackReferencePriceBuilder
**Implements:** `FallbackReferencePrice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setValuationPostponement(ValuationPostponement arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `getValuationPostponement()` → `ValuationPostponementBuilder` [Getter]
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `setCalculationAgentDetermination(CalculationAgent arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `getOrCreateValuationPostponement()` → `ValuationPostponementBuilder` [Getter]
- `getOrCreateCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `setFallBackSettlementRateOptionValue(List arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `getOrCreateFallBackSettlementRateOption(int arg0)` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `setFallBackSettlementRateOption(List arg0)` → `FallbackReferencePriceBuilder` [Setter]

### FloatingRateIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateIndex` [Builder]
- `getIndexTenor()` → `Period` [Getter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]

### FloatingRateIndexBuilder
**Implements:** `FloatingRateIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `FloatingRateIndexBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `FloatingRateIndexBuilder` [Setter]

### ForeignExchangeRateIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ForeignExchangeRateIndex` [Builder]
- `getPrimaryFxSpotRateSource()` → `InformationSource` [Getter]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPair` [Getter]
- `getSecondaryFxSpotRateSource()` → `InformationSource` [Getter]

### ForeignExchangeRateIndexBuilder
**Implements:** `ForeignExchangeRateIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `getPrimaryFxSpotRateSource()` → `InformationSourceBuilder` [Getter]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPairBuilder` [Getter]
- `setQuotedCurrencyPair(FieldWithMetaQuotedCurrencyPair arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]

### FxInformationSource
**Implements:** `InformationSource` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxInformationSource` [Builder]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### FxInformationSourceBuilder
**Implements:** `FxInformationSource` `InformationSource$InformationSourceBuilder` 

**Key Methods:**
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxInformationSourceBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setSourcePageHeading(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePageValue(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePage(FieldWithMetaString arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProviderValue(InformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]

### FxRate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxRate` [Builder]
- `getQuotedCurrencyPair()` → `QuotedCurrencyPair` [Getter]
- `getRate()` → `BigDecimal` [Getter]

### FxRateBuilder
**Implements:** `FxRate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getQuotedCurrencyPair()` → `QuotedCurrencyPairBuilder` [Getter]
- `setQuotedCurrencyPair(QuotedCurrencyPair arg0)` → `FxRateBuilder` [Setter]
- `getOrCreateQuotedCurrencyPair()` → `QuotedCurrencyPairBuilder` [Getter]
- `setRate(BigDecimal arg0)` → `FxRateBuilder` [Setter]

### FxRateSourceFixing
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxRateSourceFixing` [Builder]
- `getFixingDate()` → `AdjustableDate` [Getter]
- `getSettlementRateSource()` → `FxSettlementRateSource` [Getter]

### FxRateSourceFixingBuilder
**Implements:** `FxRateSourceFixing` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFixingDate()` → `AdjustableDateBuilder` [Getter]
- `setSettlementRateSource(FxSettlementRateSource arg0)` → `FxRateSourceFixingBuilder` [Setter]
- `setFixingDate(AdjustableDate arg0)` → `FxRateSourceFixingBuilder` [Setter]
- `getSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]
- `getOrCreateFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getOrCreateSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]

### FxSettlementRateSource
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxSettlementRateSource` [Builder]
- `getSettlementRateOption()` → `FieldWithMetaString` [Getter]
- `getNonstandardSettlementRate()` → `FxInformationSource` [Getter]

### FxSettlementRateSourceBuilder
**Implements:** `FxSettlementRateSource` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSettlementRateOption()` → `FieldWithMetaStringBuilder` [Getter]
- `setSettlementRateOption(FieldWithMetaString arg0)` → `FxSettlementRateSourceBuilder` [Setter]
- `getOrCreateSettlementRateOption()` → `FieldWithMetaStringBuilder` [Getter]
- `setSettlementRateOptionValue(String arg0)` → `FxSettlementRateSourceBuilder` [Setter]
- `getNonstandardSettlementRate()` → `FxInformationSourceBuilder` [Getter]
- `getOrCreateNonstandardSettlementRate()` → `FxInformationSourceBuilder` [Getter]
- `setNonstandardSettlementRate(FxInformationSource arg0)` → `FxSettlementRateSourceBuilder` [Setter]

### FxSpotRateSource
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxSpotRateSource` [Builder]
- `getPrimarySource()` → `InformationSource` [Getter]
- `getSecondarySource()` → `InformationSource` [Getter]

### FxSpotRateSourceBuilder
**Implements:** `FxSpotRateSource` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getPrimarySource()` → `InformationSourceBuilder` [Getter]
- `getOrCreateSecondarySource()` → `InformationSourceBuilder` [Getter]
- `setSecondarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]
- `setPrimarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]
- `getOrCreatePrimarySource()` → `InformationSourceBuilder` [Getter]
- `getSecondarySource()` → `InformationSourceBuilder` [Getter]

### Index
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Index` [Builder]
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndex` [Getter]
- `getOtherIndex()` → `OtherIndex` [Getter]
- `getCreditIndex()` → `CreditIndex` [Getter]
- `getEquityIndex()` → `EquityIndex` [Getter]
- `getForeignExchangeRateIndex()` → `ForeignExchangeRateIndex` [Getter]

### IndexBase
**Implements:** `AssetBase` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `getType()` → `Class` [Getter]
- `build()` → `IndexBase` [Builder]
- `getProvider()` → `LegalEntity` [Getter]
- `getAssetClass()` → `AssetClassEnum` [Getter]

### IndexBaseBuilder
**Implements:** `IndexBase` `AssetBase$AssetBaseBuilder` 

**Key Methods:**
- `getName()` → `FieldWithMetaStringBuilder` [Getter]
- `setName(FieldWithMetaString arg0)` → `IndexBaseBuilder` [Setter]
- `getProvider()` → `LegalEntityBuilder` [Getter]
- `setIdentifier(List arg0)` → `IndexBaseBuilder` [Setter]
- `setTaxonomy(List arg0)` → `IndexBaseBuilder` [Setter]
- `setNameValue(String arg0)` → `IndexBaseBuilder` [Setter]
- `getOrCreateName()` → `FieldWithMetaStringBuilder` [Getter]
- `setExchange(LegalEntity arg0)` → `IndexBaseBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `IndexBaseBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `IndexBaseBuilder` [Setter]

### IndexBuilder
**Implements:** `Index` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setInterestRateIndexValue(InterestRateIndex arg0)` → `IndexBuilder` [Setter]
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndexBuilder` [Getter]
- `getOtherIndex()` → `OtherIndexBuilder` [Getter]
- `setCreditIndex(CreditIndex arg0)` → `IndexBuilder` [Setter]
- `setOtherIndex(OtherIndex arg0)` → `IndexBuilder` [Setter]
- `setEquityIndex(EquityIndex arg0)` → `IndexBuilder` [Setter]
- `getCreditIndex()` → `CreditIndexBuilder` [Getter]
- `getEquityIndex()` → `EquityIndexBuilder` [Getter]
- `getOrCreateOtherIndex()` → `OtherIndexBuilder` [Getter]
- `getOrCreateCreditIndex()` → `CreditIndexBuilder` [Getter]

### InflationIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InflationIndex` [Builder]
- `getIndexTenor()` → `Period` [Getter]
- `getInflationRateIndex()` → `FieldWithMetaInflationRateIndexEnum` [Getter]

### InflationIndexBuilder
**Implements:** `InflationIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `InflationIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `InflationIndexBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `InflationIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `InflationIndexBuilder` [Setter]
- `setInflationRateIndexValue(InflationRateIndexEnum arg0)` → `InflationIndexBuilder` [Setter]
- `setInflationRateIndex(FieldWithMetaInflationRateIndexEnum arg0)` → `InflationIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `InflationIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `InflationIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `InflationIndexBuilder` [Setter]

### InformationSource
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InformationSource` [Builder]
- `getSourcePage()` → `FieldWithMetaString` [Getter]
- `getSourcePageHeading()` → `String` [Getter]
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnum` [Getter]

### InformationSourceBuilder
**Implements:** `InformationSource` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `setSourcePageHeading(String arg0)` → `InformationSourceBuilder` [Setter]
- `getOrCreateSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]
- `setSourcePageValue(String arg0)` → `InformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `InformationSourceBuilder` [Setter]
- `setSourcePage(FieldWithMetaString arg0)` → `InformationSourceBuilder` [Setter]
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]
- `setSourceProviderValue(InformationProviderEnum arg0)` → `InformationSourceBuilder` [Setter]

### InterestRateCurve
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InterestRateCurve` [Builder]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getTenor()` → `Period` [Getter]

### InterestRateCurveBuilder
**Implements:** `InterestRateCurve` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getTenor()` → `PeriodBuilder` [Getter]
- `setTenor(Period arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateTenor()` → `PeriodBuilder` [Getter]

### InterestRateIndex
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InterestRateIndex` [Builder]
- `getInflationIndex()` → `InflationIndex` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndex` [Getter]

### InterestRateIndexBuilder
**Implements:** `InterestRateIndex` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateInflationIndex()` → `InflationIndexBuilder` [Getter]
- `getInflationIndex()` → `InflationIndexBuilder` [Getter]
- `setInflationIndex(InflationIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `getFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]

### MakeWholeAmount
**Implements:** `SwapCurveValuation` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MakeWholeAmount` [Builder]
- `getInterpolationMethod()` → `InterpolationMethodEnum` [Getter]
- `getEarlyCallDate()` → `FieldWithMetaDate` [Getter]

### MakeWholeAmountBuilder
**Implements:** `MakeWholeAmount` `SwapCurveValuation$SwapCurveValuationBuilder` 

**Key Methods:**
- `setSide(QuotationSideEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setIndexTenor(Period arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setInterpolationMethod(InterpolationMethodEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `getEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `setEarlyCallDateValue(Date arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setEarlyCallDate(FieldWithMetaDate arg0)` → `MakeWholeAmountBuilder` [Setter]
- `getOrCreateEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setSpread(BigDecimal arg0)` → `MakeWholeAmountBuilder` [Setter]

### Money
**Implements:** `Quantity` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Money` [Builder]
- `getMeta()` → `MetaFields` [Getter]

### MoneyBuilder
**Implements:** `Money` `Quantity$QuantityBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `MoneyBuilder` [Setter]
- `setMultiplier(Measure arg0)` → `MoneyBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `MoneyBuilder` [Setter]
- `setDatedValue(List arg0)` → `MoneyBuilder` [Setter]
- `setUnit(UnitType arg0)` → `MoneyBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `MoneyBuilder` [Setter]

### MultipleCreditNotations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MultipleCreditNotations` [Builder]
- `getCreditNotation()` → `List` [Getter]
- `getMismatchResolution()` → `CreditNotationMismatchResolutionEnum` [Getter]
- `getReferenceAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]

### MultipleCreditNotationsBuilder
**Implements:** `MultipleCreditNotations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCondition(QuantifierEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setCreditNotation(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `getCreditNotation()` → `List` [Getter]
- `getOrCreateCreditNotation(int arg0)` → `FieldWithMetaCreditNotationBuilder` [Getter]
- `setCreditNotationValue(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setMismatchResolution(CreditNotationMismatchResolutionEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setReferenceAgency(CreditRatingAgencyEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]

### MultipleDebtTypes
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MultipleDebtTypes` [Builder]
- `getDebtType()` → `List` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]

### MultipleDebtTypesBuilder
**Implements:** `MultipleDebtTypes` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCondition(QuantifierEnum arg0)` → `MultipleDebtTypesBuilder` [Setter]
- `getDebtType()` → `List` [Getter]
- `getOrCreateDebtType(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(List arg0)` → `MultipleDebtTypesBuilder` [Setter]
- `setDebtTypeValue(List arg0)` → `MultipleDebtTypesBuilder` [Setter]

### MultipleValuationDates
**Implements:** `SingleValuationDate` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MultipleValuationDates` [Builder]
- `getNumberValuationDates()` → `Integer` [Getter]
- `getBusinessDaysThereafter()` → `Integer` [Getter]

### MultipleValuationDatesBuilder
**Implements:** `MultipleValuationDates` `SingleValuationDate$SingleValuationDateBuilder` 

**Key Methods:**
- `setBusinessDays(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]
- `setNumberValuationDates(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]
- `setBusinessDaysThereafter(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]

### Observable
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `getIndex()` → `Index` [Getter]
- `build()` → `Observable` [Builder]
- `getAsset()` → `Asset` [Getter]
- `getBasket()` → `Basket` [Getter]

### ObservableBuilder
**Implements:** `Observable` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getIndex()` → `IndexBuilder` [Getter]
- `setIndex(Index arg0)` → `ObservableBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `getOrCreateIndex()` → `IndexBuilder` [Getter]
- `getAsset()` → `AssetBuilder` [Getter]
- `setAsset(Asset arg0)` → `ObservableBuilder` [Setter]
- `getOrCreateBasket()` → `BasketBuilder` [Getter]
- `setBasket(Basket arg0)` → `ObservableBuilder` [Setter]
- `getBasket()` → `BasketBuilder` [Getter]

### OtherIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `OtherIndex` [Builder]
- `getDescription()` → `String` [Getter]

### OtherIndexBuilder
**Implements:** `OtherIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `OtherIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `OtherIndexBuilder` [Setter]
- `setDescription(String arg0)` → `OtherIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `OtherIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `OtherIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `OtherIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `OtherIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `OtherIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `OtherIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `OtherIndexBuilder` [Setter]

### PerformanceValuationDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PerformanceValuationDates` [Builder]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationTimeType()` → `TimeTypeEnum` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PerformanceValuationDatesBuilder
**Implements:** `PerformanceValuationDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setValuationDates(AdjustableRelativeOrPeriodicDates arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getOrCreateValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setValuationTime(BusinessCenterTime arg0)` → `PerformanceValuationDatesBuilder` [Setter]

### PremiumExpression
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PremiumExpression` [Builder]
- `getPercentageOfNotional()` → `BigDecimal` [Getter]
- `getPremiumType()` → `PremiumTypeEnum` [Getter]
- `getPricePerOption()` → `Money` [Getter]

### PremiumExpressionBuilder
**Implements:** `PremiumExpression` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setPercentageOfNotional(BigDecimal arg0)` → `PremiumExpressionBuilder` [Setter]
- `getOrCreatePricePerOption()` → `MoneyBuilder` [Getter]
- `setPricePerOption(Money arg0)` → `PremiumExpressionBuilder` [Setter]
- `setPremiumType(PremiumTypeEnum arg0)` → `PremiumExpressionBuilder` [Setter]
- `getPricePerOption()` → `MoneyBuilder` [Getter]

### Price
**Implements:** `PriceSchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Price` [Builder]

### PriceBuilder
**Implements:** `Price` `PriceSchedule$PriceScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `PriceBuilder` [Setter]
- `setPerUnitOf(UnitType arg0)` → `PriceBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `PriceBuilder` [Setter]
- `setDatedValue(List arg0)` → `PriceBuilder` [Setter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceBuilder` [Setter]
- `setPriceType(PriceTypeEnum arg0)` → `PriceBuilder` [Setter]
- `setComposite(PriceComposite arg0)` → `PriceBuilder` [Setter]
- `setCashPrice(CashPrice arg0)` → `PriceBuilder` [Setter]
- `setUnit(UnitType arg0)` → `PriceBuilder` [Setter]

### PriceComposite
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceComposite` [Builder]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `getOperandType()` → `PriceOperandEnum` [Getter]
- `getBaseValue()` → `BigDecimal` [Getter]
- `getOperand()` → `BigDecimal` [Getter]

### PriceCompositeBuilder
**Implements:** `PriceComposite` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceCompositeBuilder` [Setter]
- `setOperand(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]
- `setOperandType(PriceOperandEnum arg0)` → `PriceCompositeBuilder` [Setter]
- `setBaseValue(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]

### PriceQuantity
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceQuantity` [Builder]
- `getObservable()` → `FieldWithMetaObservable` [Getter]
- `getQuantity()` → `List` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getPrice()` → `List` [Getter]

### PriceQuantityBuilder
**Implements:** `PriceQuantity` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `getQuantity()` → `List` [Getter]
- `setQuantity(List arg0)` → `PriceQuantityBuilder` [Setter]
- `getOrCreateQuantity(int arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreatePrice(int arg0)` → `FieldWithMetaPriceScheduleBuilder` [Getter]
- `getOrCreateObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `setObservableValue(Observable arg0)` → `PriceQuantityBuilder` [Setter]
- `setObservable(FieldWithMetaObservable arg0)` → `PriceQuantityBuilder` [Setter]

### PriceSchedule
**Implements:** `MeasureSchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceSchedule` [Builder]
- `getPerUnitOf()` → `UnitType` [Getter]
- `getPriceType()` → `PriceTypeEnum` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `getComposite()` → `PriceComposite` [Getter]
- `getCashPrice()` → `CashPrice` [Getter]

### PriceScheduleBuilder
**Implements:** `PriceSchedule` `MeasureSchedule$MeasureScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `PriceScheduleBuilder` [Setter]
- `getPerUnitOf()` → `UnitTypeBuilder` [Getter]
- `getComposite()` → `PriceCompositeBuilder` [Getter]
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `setPerUnitOf(UnitType arg0)` → `PriceScheduleBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `PriceScheduleBuilder` [Setter]
- `setDatedValue(List arg0)` → `PriceScheduleBuilder` [Setter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceScheduleBuilder` [Setter]
- `setPriceType(PriceTypeEnum arg0)` → `PriceScheduleBuilder` [Setter]
- `setComposite(PriceComposite arg0)` → `PriceScheduleBuilder` [Setter]

### PriceSourceDisruption
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceSourceDisruption` [Builder]
- `getFallbackReferencePrice()` → `FallbackReferencePrice` [Getter]

### PriceSourceDisruptionBuilder
**Implements:** `PriceSourceDisruption` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setFallbackReferencePrice(FallbackReferencePrice arg0)` → `PriceSourceDisruptionBuilder` [Setter]
- `getFallbackReferencePrice()` → `FallbackReferencePriceBuilder` [Getter]
- `getOrCreateFallbackReferencePrice()` → `FallbackReferencePriceBuilder` [Getter]

### QuotedCurrencyPair
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `QuotedCurrencyPair` [Builder]
- `getCurrency2()` → `FieldWithMetaString` [Getter]
- `getCurrency1()` → `FieldWithMetaString` [Getter]
- `getQuoteBasis()` → `QuoteBasisEnum` [Getter]

### QuotedCurrencyPairBuilder
**Implements:** `QuotedCurrencyPair` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCurrency2Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency1(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `getOrCreateCurrency1()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency1Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency2(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setQuoteBasis(QuoteBasisEnum arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `getOrCreateCurrency2()` → `FieldWithMetaStringBuilder` [Getter]
- `getCurrency2()` → `FieldWithMetaStringBuilder` [Getter]
- `getCurrency1()` → `FieldWithMetaStringBuilder` [Getter]

### RateObservation
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `RateObservation` [Builder]
- `getResetDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `getRateReference()` → `ReferenceWithMetaRateObservation` [Getter]
- `getTreatedForecastRate()` → `BigDecimal` [Getter]
- `getObservationWeight()` → `Integer` [Getter]
- `getAdjustedFixingDate()` → `Date` [Getter]
- `getTreatedRate()` → `BigDecimal` [Getter]

### RateObservationBuilder
**Implements:** `RateObservation` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setResetDate(Date arg0)` → `RateObservationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `RateObservationBuilder` [Setter]
- `setForecastRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `getRateReference()` → `ReferenceWithMetaRateObservationBuilder` [Getter]
- `setObservedRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `setObservationWeight(Integer arg0)` → `RateObservationBuilder` [Setter]
- `setRateReference(ReferenceWithMetaRateObservation arg0)` → `RateObservationBuilder` [Setter]
- `setRateReferenceValue(RateObservation arg0)` → `RateObservationBuilder` [Setter]

### ReferenceSwapCurve
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceSwapCurve` [Builder]
- `getMakeWholeAmount()` → `MakeWholeAmount` [Getter]
- `getSwapUnwindValue()` → `SwapCurveValuation` [Getter]

### ReferenceSwapCurveBuilder
**Implements:** `ReferenceSwapCurve` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]
- `getSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]
- `getOrCreateMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]
- `setMakeWholeAmount(MakeWholeAmount arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `setSwapUnwindValue(SwapCurveValuation arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `getOrCreateSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]

### SettlementRateOption
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementRateOption` [Builder]
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnum` [Getter]
- `getPriceSourceDisruption()` → `PriceSourceDisruption` [Getter]

### SettlementRateOptionBuilder
**Implements:** `SettlementRateOption` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getPriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]
- `setSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]
- `setPriceSourceDisruption(PriceSourceDisruption arg0)` → `SettlementRateOptionBuilder` [Setter]
- `getOrCreateSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `setSettlementRateOptionValue(SettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]
- `getOrCreatePriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]

### SingleValuationDate
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SingleValuationDate` [Builder]
- `getBusinessDays()` → `Integer` [Getter]

### SingleValuationDateBuilder
**Implements:** `SingleValuationDate` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setBusinessDays(Integer arg0)` → `SingleValuationDateBuilder` [Setter]

### SwapCurveValuation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SwapCurveValuation` [Builder]
- `getSide()` → `QuotationSideEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getSpread()` → `BigDecimal` [Getter]

### SwapCurveValuationBuilder
**Implements:** `SwapCurveValuation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSide(QuotationSideEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `setSpread(BigDecimal arg0)` → `SwapCurveValuationBuilder` [Setter]

### TransactedPrice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransactedPrice` [Builder]
- `getInitialPoints()` → `BigDecimal` [Getter]
- `getQuotationStyle()` → `QuotationStyleEnum` [Getter]
- `getMarketFixedRate()` → `BigDecimal` [Getter]
- `getMarketPrice()` → `BigDecimal` [Getter]

### TransactedPriceBuilder
**Implements:** `TransactedPrice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setQuotationStyle(QuotationStyleEnum arg0)` → `TransactedPriceBuilder` [Setter]
- `setMarketFixedRate(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setMarketPrice(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setInitialPoints(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]

### ValuationDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationDates` [Builder]
- `getFinalValuationDate()` → `PerformanceValuationDates` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDates` [Getter]
- `getInitialValuationDate()` → `PerformanceValuationDates` [Getter]

### ValuationDatesBuilder
**Implements:** `ValuationDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `setInitialValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setFinalValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setInterimValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `getOrCreateFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]

### ValuationMethod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationMethod` [Builder]
- `getValuationMethod()` → `ValuationMethodEnum` [Getter]
- `getQuotationAmount()` → `Money` [Getter]
- `getMinimumQuotationAmount()` → `Money` [Getter]
- `getQuotationMethod()` → `QuotationRateTypeEnum` [Getter]
- `getValuationSource()` → `ValuationSource` [Getter]
- `getCashCollateralValuationMethod()` → `CashCollateralValuationMethod` [Getter]

### ValuationMethodBuilder
**Implements:** `ValuationMethod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setValuationMethod(ValuationMethodEnum arg0)` → `ValuationMethodBuilder` [Setter]
- `getQuotationAmount()` → `MoneyBuilder` [Getter]
- `getMinimumQuotationAmount()` → `MoneyBuilder` [Getter]
- `getValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setValuationSource(ValuationSource arg0)` → `ValuationMethodBuilder` [Setter]
- `getOrCreateValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setQuotationMethod(QuotationRateTypeEnum arg0)` → `ValuationMethodBuilder` [Setter]
- `getOrCreateQuotationAmount()` → `MoneyBuilder` [Getter]
- `setMinimumQuotationAmount(Money arg0)` → `ValuationMethodBuilder` [Setter]
- `setQuotationAmount(Money arg0)` → `ValuationMethodBuilder` [Setter]

### ValuationPostponement
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationPostponement` [Builder]
- `getMaximumDaysOfPostponement()` → `Integer` [Getter]

### ValuationPostponementBuilder
**Implements:** `ValuationPostponement` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMaximumDaysOfPostponement(Integer arg0)` → `ValuationPostponementBuilder` [Setter]

### ValuationSource
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationSource` [Builder]
- `getInformationSource()` → `FxSpotRateSource` [Getter]
- `getReferenceBanks()` → `ReferenceBanks` [Getter]
- `getSettlementRateOption()` → `SettlementRateOption` [Getter]
- `getDealerOrCCP()` → `AncillaryEntity` [Getter]
- `getQuotedCurrencyPair()` → `ReferenceWithMetaQuotedCurrencyPair` [Getter]

### ValuationSourceBuilder
**Implements:** `ValuationSource` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInformationSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setInformationSource(FxSpotRateSource arg0)` → `ValuationSourceBuilder` [Setter]
- `getReferenceBanks()` → `ReferenceBanksBuilder` [Getter]
- `getSettlementRateOption()` → `SettlementRateOptionBuilder` [Getter]
- `getDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `getOrCreateDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `setDealerOrCCP(AncillaryEntity arg0)` → `ValuationSourceBuilder` [Setter]
- `setSettlementRateOption(SettlementRateOption arg0)` → `ValuationSourceBuilder` [Setter]
- `getOrCreateReferenceBanks()` → `ReferenceBanksBuilder` [Getter]
- `setReferenceBanks(ReferenceBanks arg0)` → `ValuationSourceBuilder` [Setter]

## Concrete Classes

### BasketBuilderImpl
**Extends:** `AssetBase$AssetBaseBuilderImpl` 
**Implements:** `Basket$BasketBuilder` 

**Fields:**
- `List (List) basketConstituent`

**Key Methods:**
- `build()` → `Basket` [Builder]
- `setIdentifier(List arg0)` → `BasketBuilder` [Setter]
- `setTaxonomy(List arg0)` → `BasketBuilder` [Setter]
- `getBasketConstituent()` → `List` [Getter]
- `setExchange(LegalEntity arg0)` → `BasketBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituent(List arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituentValue(List arg0)` → `BasketBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `BasketBuilder` [Setter]
- `getOrCreateBasketConstituent(int arg0)` → `FieldWithMetaBasketConstituentBuilder` [Getter]

### BasketConstituentBuilderImpl
**Extends:** `Observable$ObservableBuilderImpl` 
**Implements:** `BasketConstituent$BasketConstituentBuilder` 

**Fields:**
- `List (List) quantity`
- `List (List) initialValuationPrice`
- `List (List) interimValuationPrice`
- `List (List) finalValuationPrice`

**Key Methods:**
- `build()` → `BasketConstituent` [Builder]
- `setIndex(Index arg0)` → `BasketConstituentBuilder` [Setter]
- `getQuantity()` → `List` [Getter]
- `setQuantity(List arg0)` → `BasketConstituentBuilder` [Setter]
- `getOrCreateQuantity(int arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setAsset(Asset arg0)` → `BasketConstituentBuilder` [Setter]
- `setQuantityValue(List arg0)` → `BasketConstituentBuilder` [Setter]
- `setBasket(Basket arg0)` → `BasketConstituentBuilder` [Setter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]

### BasketConstituentImpl
**Extends:** `Observable$ObservableImpl` 
**Implements:** `BasketConstituent` 

**Key Methods:**
- `build()` → `BasketConstituent` [Builder]
- `getQuantity()` → `List` [Getter]
- `setBuilderFields(BasketConstituentBuilder arg0)` → `void` [Setter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInterimValuationPrice()` → `List` [Getter]

### BasketImpl
**Extends:** `AssetBase$AssetBaseImpl` 
**Implements:** `Basket` 

**Key Methods:**
- `build()` → `Basket` [Builder]
- `setBuilderFields(BasketBuilder arg0)` → `void` [Setter]
- `getBasketConstituent()` → `List` [Getter]

### CalculationAgentBuilderImpl
**Implements:** `CalculationAgent$CalculationAgentBuilder` 

**Fields:**
- `AncillaryRoleEnum calculationAgentParty`
- `PartyDeterminationEnum calculationAgentPartyEnum`
- `FieldWithMetaBusinessCenterEnumBuilder calculationAgentBusinessCenter`

**Key Methods:**
- `build()` → `CalculationAgent` [Builder]
- `setCalculationAgentParty(AncillaryRoleEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `getCalculationAgentParty()` → `AncillaryRoleEnum` [Getter]
- `setCalculationAgentBusinessCenterValue(BusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentPartyEnum(PartyDeterminationEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `getCalculationAgentPartyEnum()` → `PartyDeterminationEnum` [Getter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `getOrCreateCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]

### CalculationAgentImpl
**Implements:** `CalculationAgent` 

**Key Methods:**
- `build()` → `CalculationAgent` [Builder]
- `setBuilderFields(CalculationAgentBuilder arg0)` → `void` [Setter]
- `getCalculationAgentParty()` → `AncillaryRoleEnum` [Getter]
- `getCalculationAgentPartyEnum()` → `PartyDeterminationEnum` [Getter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]

### CashCollateralValuationMethodBuilderImpl
**Implements:** `CashCollateralValuationMethod$CashCollateralValuationMethodBuilder` 

**Fields:**
- `CsaTypeEnum applicableCsa`
- `String cashCollateralCurrency`
- `FieldWithMetaStringBuilder cashCollateralInterestRate`
- `FieldWithMetaStringBuilder agreedDiscountRate`
- `List (List) protectedParty`
- `Boolean prescribedDocumentationAdjustment`

**Key Methods:**
- `build()` → `CashCollateralValuationMethod` [Builder]
- `getProtectedParty()` → `List` [Getter]
- `getApplicableCsa()` → `CsaTypeEnum` [Getter]
- `getAgreedDiscountRate()` → `FieldWithMetaStringBuilder` [Getter]
- `getCashCollateralCurrency()` → `String` [Getter]
- `setCashCollateralCurrency(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRateValue(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRate(FieldWithMetaString arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setApplicableCsa(CsaTypeEnum arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setProtectedParty(List arg0)` → `CashCollateralValuationMethodBuilder` [Setter]

### CashCollateralValuationMethodImpl
**Implements:** `CashCollateralValuationMethod` 

**Key Methods:**
- `build()` → `CashCollateralValuationMethod` [Builder]
- `setBuilderFields(CashCollateralValuationMethodBuilder arg0)` → `void` [Setter]
- `getProtectedParty()` → `List` [Getter]
- `getApplicableCsa()` → `CsaTypeEnum` [Getter]
- `getAgreedDiscountRate()` → `FieldWithMetaString` [Getter]
- `getCashCollateralCurrency()` → `String` [Getter]
- `getPrescribedDocumentationAdjustment()` → `Boolean` [Getter]
- `getCashCollateralInterestRate()` → `FieldWithMetaString` [Getter]

### CashPriceBuilderImpl
**Implements:** `CashPrice$CashPriceBuilder` 

**Fields:**
- `CashPriceTypeEnum cashPriceType`
- `PremiumExpressionBuilder premiumExpression`
- `FeeTypeEnum feeType`

**Key Methods:**
- `build()` → `CashPrice` [Builder]
- `getCashPriceType()` → `CashPriceTypeEnum` [Getter]
- `getPremiumExpression()` → `PremiumExpressionBuilder` [Getter]
- `setFeeType(FeeTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `setCashPriceType(CashPriceTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `setPremiumExpression(PremiumExpression arg0)` → `CashPriceBuilder` [Setter]
- `getOrCreatePremiumExpression()` → `PremiumExpressionBuilder` [Getter]
- `getFeeType()` → `FeeTypeEnum` [Getter]

### CashPriceImpl
**Implements:** `CashPrice` 

**Key Methods:**
- `build()` → `CashPrice` [Builder]
- `setBuilderFields(CashPriceBuilder arg0)` → `void` [Setter]
- `getCashPriceType()` → `CashPriceTypeEnum` [Getter]
- `getPremiumExpression()` → `PremiumExpression` [Getter]
- `getFeeType()` → `FeeTypeEnum` [Getter]

### CreditIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `CreditIndex$CreditIndexBuilder` 

**Fields:**
- `Integer indexSeries`
- `Integer indexAnnexVersion`
- `Date indexAnnexDate`
- `FieldWithMetaIndexAnnexSourceEnumBuilder indexAnnexSource`
- `List (List) excludedReferenceEntity`
- `TrancheBuilder tranche`
- `SettledEntityMatrixBuilder settledEntityMatrix`
- `BigDecimal indexFactor`
- `CreditSeniorityEnum seniority`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `CreditIndexBuilder` [Setter]
- `build()` → `CreditIndex` [Builder]
- `setIdentifier(List arg0)` → `CreditIndexBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `CreditIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `CreditIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `CreditIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `CreditIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `CreditIndexBuilder` [Setter]

### CreditIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `CreditIndex` 

**Key Methods:**
- `build()` → `CreditIndex` [Builder]
- `setBuilderFields(CreditIndexBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]
- `getTranche()` → `Tranche` [Getter]
- `getIndexSeries()` → `Integer` [Getter]
- `getIndexAnnexDate()` → `Date` [Getter]
- `getExcludedReferenceEntity()` → `List` [Getter]
- `getIndexAnnexSource()` → `FieldWithMetaIndexAnnexSourceEnum` [Getter]
- `getIndexAnnexVersion()` → `Integer` [Getter]
- `getSeniority()` → `CreditSeniorityEnum` [Getter]

### CreditNotationBuilderImpl
**Implements:** `CreditNotation$CreditNotationBuilder` 

**Fields:**
- `CreditRatingAgencyEnum agency`
- `FieldWithMetaStringBuilder notation`
- `FieldWithMetaStringBuilder scale`
- `CreditRatingDebtBuilder debt`
- `CreditRatingOutlookEnum outlook`
- `CreditRatingCreditWatchEnum creditWatch`

**Key Methods:**
- `build()` → `CreditNotation` [Builder]
- `setScale(FieldWithMetaString arg0)` → `CreditNotationBuilder` [Setter]
- `getNotation()` → `FieldWithMetaStringBuilder` [Getter]
- `getAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getScale()` → `FieldWithMetaStringBuilder` [Getter]
- `getDebt()` → `CreditRatingDebtBuilder` [Getter]
- `getOutlook()` → `CreditRatingOutlookEnum` [Getter]
- `setAgency(CreditRatingAgencyEnum arg0)` → `CreditNotationBuilder` [Setter]
- `setDebt(CreditRatingDebt arg0)` → `CreditNotationBuilder` [Setter]
- `setOutlook(CreditRatingOutlookEnum arg0)` → `CreditNotationBuilder` [Setter]

### CreditNotationImpl
**Implements:** `CreditNotation` 

**Key Methods:**
- `build()` → `CreditNotation` [Builder]
- `setBuilderFields(CreditNotationBuilder arg0)` → `void` [Setter]
- `getNotation()` → `FieldWithMetaString` [Getter]
- `getAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getScale()` → `FieldWithMetaString` [Getter]
- `getDebt()` → `CreditRatingDebt` [Getter]
- `getOutlook()` → `CreditRatingOutlookEnum` [Getter]
- `getCreditWatch()` → `CreditRatingCreditWatchEnum` [Getter]

### CreditNotationsBuilderImpl
**Implements:** `CreditNotations$CreditNotationsBuilder` 

**Fields:**
- `CreditNotationBuilder creditNotation`
- `MultipleCreditNotationsBuilder creditNotations`

**Key Methods:**
- `build()` → `CreditNotations` [Builder]
- `setCreditNotation(CreditNotation arg0)` → `CreditNotationsBuilder` [Setter]
- `getCreditNotation()` → `CreditNotationBuilder` [Getter]
- `getCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]
- `setCreditNotations(MultipleCreditNotations arg0)` → `CreditNotationsBuilder` [Setter]
- `getOrCreateCreditNotation()` → `CreditNotationBuilder` [Getter]
- `getOrCreateCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]

### CreditNotationsImpl
**Implements:** `CreditNotations` 

**Key Methods:**
- `build()` → `CreditNotations` [Builder]
- `setBuilderFields(CreditNotationsBuilder arg0)` → `void` [Setter]
- `getCreditNotation()` → `CreditNotation` [Getter]
- `getCreditNotations()` → `MultipleCreditNotations` [Getter]

### CreditRatingDebtBuilderImpl
**Implements:** `CreditRatingDebt$CreditRatingDebtBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder debtType`
- `MultipleDebtTypesBuilder debtTypes`

**Key Methods:**
- `build()` → `CreditRatingDebt` [Builder]
- `getDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(FieldWithMetaString arg0)` → `CreditRatingDebtBuilder` [Setter]
- `setDebtTypeValue(String arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getOrCreateDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]
- `setDebtTypes(MultipleDebtTypes arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]

### CreditRatingDebtImpl
**Implements:** `CreditRatingDebt` 

**Key Methods:**
- `build()` → `CreditRatingDebt` [Builder]
- `setBuilderFields(CreditRatingDebtBuilder arg0)` → `void` [Setter]
- `getDebtType()` → `FieldWithMetaString` [Getter]
- `getDebtTypes()` → `MultipleDebtTypes` [Getter]

### CurveBuilderImpl
**Implements:** `Curve$CurveBuilder` 

**Fields:**
- `InterestRateCurveBuilder interestRateCurve`
- `FieldWithMetaCommodityReferencePriceEnumBuilder commodityCurve`

**Key Methods:**
- `build()` → `Curve` [Builder]
- `setInterestRateCurve(InterestRateCurve arg0)` → `CurveBuilder` [Setter]
- `setCommodityCurveValue(CommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]
- `getOrCreateCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `setCommodityCurve(FieldWithMetaCommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]
- `getInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]
- `getOrCreateInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]

### CurveImpl
**Implements:** `Curve` 

**Key Methods:**
- `build()` → `Curve` [Builder]
- `setBuilderFields(CurveBuilder arg0)` → `void` [Setter]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnum` [Getter]
- `getInterestRateCurve()` → `InterestRateCurve` [Getter]

### DividendApplicabilityBuilderImpl
**Implements:** `DividendApplicability$DividendApplicabilityBuilder` 

**Fields:**
- `Boolean optionsExchangeDividends`
- `Boolean additionalDividends`
- `Boolean allDividends`

**Key Methods:**
- `build()` → `DividendApplicability` [Builder]
- `getAllDividends()` → `Boolean` [Getter]
- `getAdditionalDividends()` → `Boolean` [Getter]
- `getOptionsExchangeDividends()` → `Boolean` [Getter]
- `setAllDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setAdditionalDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setOptionsExchangeDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]

### DividendApplicabilityImpl
**Implements:** `DividendApplicability` 

**Key Methods:**
- `build()` → `DividendApplicability` [Builder]
- `setBuilderFields(DividendApplicabilityBuilder arg0)` → `void` [Setter]
- `getAllDividends()` → `Boolean` [Getter]
- `getAdditionalDividends()` → `Boolean` [Getter]
- `getOptionsExchangeDividends()` → `Boolean` [Getter]

### EquityIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `EquityIndex$EquityIndexBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `EquityIndexBuilder` [Setter]
- `build()` → `EquityIndex` [Builder]
- `setIdentifier(List arg0)` → `EquityIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `EquityIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `EquityIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `EquityIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `EquityIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `EquityIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]

### EquityIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `EquityIndex` 

**Key Methods:**
- `build()` → `EquityIndex` [Builder]
- `setBuilderFields(EquityIndexBuilder arg0)` → `void` [Setter]

### FallbackReferencePriceBuilderImpl
**Implements:** `FallbackReferencePrice$FallbackReferencePriceBuilder` 

**Fields:**
- `ValuationPostponementBuilder valuationPostponement`
- `List (List) fallBackSettlementRateOption`
- `Boolean fallbackSurveyValuationPostponement`
- `CalculationAgentBuilder calculationAgentDetermination`

**Key Methods:**
- `build()` → `FallbackReferencePrice` [Builder]
- `setValuationPostponement(ValuationPostponement arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `getValuationPostponement()` → `ValuationPostponementBuilder` [Getter]
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getFallbackSurveyValuationPostponement()` → `Boolean` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `setCalculationAgentDetermination(CalculationAgent arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `getOrCreateValuationPostponement()` → `ValuationPostponementBuilder` [Getter]
- `getOrCreateCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `setFallBackSettlementRateOptionValue(List arg0)` → `FallbackReferencePriceBuilder` [Setter]

### FallbackReferencePriceImpl
**Implements:** `FallbackReferencePrice` 

**Key Methods:**
- `build()` → `FallbackReferencePrice` [Builder]
- `setBuilderFields(FallbackReferencePriceBuilder arg0)` → `void` [Setter]
- `getValuationPostponement()` → `ValuationPostponement` [Getter]
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getFallbackSurveyValuationPostponement()` → `Boolean` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgent` [Getter]

### FloatingRateIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `FloatingRateIndex$FloatingRateIndexBuilder` 

**Fields:**
- `FieldWithMetaFloatingRateIndexEnumBuilder floatingRateIndex`
- `PeriodBuilder indexTenor`

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `FloatingRateIndexBuilder` [Setter]
- `build()` → `FloatingRateIndex` [Builder]
- `setIdentifier(List arg0)` → `FloatingRateIndexBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `FloatingRateIndexBuilder` [Setter]

### FloatingRateIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `FloatingRateIndex` 

**Key Methods:**
- `build()` → `FloatingRateIndex` [Builder]
- `setBuilderFields(FloatingRateIndexBuilder arg0)` → `void` [Setter]
- `getIndexTenor()` → `Period` [Getter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]

### ForeignExchangeRateIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `ForeignExchangeRateIndex$ForeignExchangeRateIndexBuilder` 

**Fields:**
- `FieldWithMetaQuotedCurrencyPairBuilder quotedCurrencyPair`
- `InformationSourceBuilder primaryFxSpotRateSource`
- `InformationSourceBuilder secondaryFxSpotRateSource`

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `build()` → `ForeignExchangeRateIndex` [Builder]
- `setIdentifier(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `getPrimaryFxSpotRateSource()` → `InformationSourceBuilder` [Getter]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPairBuilder` [Getter]

### ForeignExchangeRateIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `ForeignExchangeRateIndex` 

**Key Methods:**
- `build()` → `ForeignExchangeRateIndex` [Builder]
- `setBuilderFields(ForeignExchangeRateIndexBuilder arg0)` → `void` [Setter]
- `getPrimaryFxSpotRateSource()` → `InformationSource` [Getter]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPair` [Getter]
- `getSecondaryFxSpotRateSource()` → `InformationSource` [Getter]

### FxInformationSourceBuilderImpl
**Extends:** `InformationSource$InformationSourceBuilderImpl` 
**Implements:** `FxInformationSource$FxInformationSourceBuilder` 

**Fields:**
- `BusinessCenterTimeBuilder fixingTime`

**Key Methods:**
- `build()` → `FxInformationSource` [Builder]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxInformationSourceBuilder` [Setter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setSourcePageHeading(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePageValue(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePage(FieldWithMetaString arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProviderValue(InformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]

### FxInformationSourceImpl
**Extends:** `InformationSource$InformationSourceImpl` 
**Implements:** `FxInformationSource` 

**Key Methods:**
- `build()` → `FxInformationSource` [Builder]
- `setBuilderFields(FxInformationSourceBuilder arg0)` → `void` [Setter]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### FxRateBuilderImpl
**Implements:** `FxRate$FxRateBuilder` 

**Fields:**
- `QuotedCurrencyPairBuilder quotedCurrencyPair`
- `BigDecimal rate`

**Key Methods:**
- `build()` → `FxRate` [Builder]
- `getQuotedCurrencyPair()` → `QuotedCurrencyPairBuilder` [Getter]
- `setQuotedCurrencyPair(QuotedCurrencyPair arg0)` → `FxRateBuilder` [Setter]
- `getOrCreateQuotedCurrencyPair()` → `QuotedCurrencyPairBuilder` [Getter]
- `setRate(BigDecimal arg0)` → `FxRateBuilder` [Setter]
- `getRate()` → `BigDecimal` [Getter]

### FxRateImpl
**Implements:** `FxRate` 

**Key Methods:**
- `build()` → `FxRate` [Builder]
- `setBuilderFields(FxRateBuilder arg0)` → `void` [Setter]
- `getQuotedCurrencyPair()` → `QuotedCurrencyPair` [Getter]
- `getRate()` → `BigDecimal` [Getter]

### FxRateSourceFixingBuilderImpl
**Implements:** `FxRateSourceFixing$FxRateSourceFixingBuilder` 

**Fields:**
- `FxSettlementRateSourceBuilder settlementRateSource`
- `AdjustableDateBuilder fixingDate`

**Key Methods:**
- `build()` → `FxRateSourceFixing` [Builder]
- `getFixingDate()` → `AdjustableDateBuilder` [Getter]
- `setSettlementRateSource(FxSettlementRateSource arg0)` → `FxRateSourceFixingBuilder` [Setter]
- `setFixingDate(AdjustableDate arg0)` → `FxRateSourceFixingBuilder` [Setter]
- `getSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]
- `getOrCreateFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getOrCreateSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]

### FxRateSourceFixingImpl
**Implements:** `FxRateSourceFixing` 

**Key Methods:**
- `build()` → `FxRateSourceFixing` [Builder]
- `setBuilderFields(FxRateSourceFixingBuilder arg0)` → `void` [Setter]
- `getFixingDate()` → `AdjustableDate` [Getter]
- `getSettlementRateSource()` → `FxSettlementRateSource` [Getter]

### FxSettlementRateSourceBuilderImpl
**Implements:** `FxSettlementRateSource$FxSettlementRateSourceBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder settlementRateOption`
- `FxInformationSourceBuilder nonstandardSettlementRate`

**Key Methods:**
- `build()` → `FxSettlementRateSource` [Builder]
- `getSettlementRateOption()` → `FieldWithMetaStringBuilder` [Getter]
- `setSettlementRateOption(FieldWithMetaString arg0)` → `FxSettlementRateSourceBuilder` [Setter]
- `getOrCreateSettlementRateOption()` → `FieldWithMetaStringBuilder` [Getter]
- `setSettlementRateOptionValue(String arg0)` → `FxSettlementRateSourceBuilder` [Setter]
- `getNonstandardSettlementRate()` → `FxInformationSourceBuilder` [Getter]
- `getOrCreateNonstandardSettlementRate()` → `FxInformationSourceBuilder` [Getter]
- `setNonstandardSettlementRate(FxInformationSource arg0)` → `FxSettlementRateSourceBuilder` [Setter]

### FxSettlementRateSourceImpl
**Implements:** `FxSettlementRateSource` 

**Key Methods:**
- `build()` → `FxSettlementRateSource` [Builder]
- `setBuilderFields(FxSettlementRateSourceBuilder arg0)` → `void` [Setter]
- `getSettlementRateOption()` → `FieldWithMetaString` [Getter]
- `getNonstandardSettlementRate()` → `FxInformationSource` [Getter]

### FxSpotRateSourceBuilderImpl
**Implements:** `FxSpotRateSource$FxSpotRateSourceBuilder` 

**Fields:**
- `InformationSourceBuilder primarySource`
- `InformationSourceBuilder secondarySource`

**Key Methods:**
- `build()` → `FxSpotRateSource` [Builder]
- `getPrimarySource()` → `InformationSourceBuilder` [Getter]
- `getOrCreateSecondarySource()` → `InformationSourceBuilder` [Getter]
- `setSecondarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]
- `setPrimarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]
- `getOrCreatePrimarySource()` → `InformationSourceBuilder` [Getter]
- `getSecondarySource()` → `InformationSourceBuilder` [Getter]

### FxSpotRateSourceImpl
**Implements:** `FxSpotRateSource` 

**Key Methods:**
- `build()` → `FxSpotRateSource` [Builder]
- `setBuilderFields(FxSpotRateSourceBuilder arg0)` → `void` [Setter]
- `getPrimarySource()` → `InformationSource` [Getter]
- `getSecondarySource()` → `InformationSource` [Getter]

### IndexBaseBuilderImpl
**Extends:** `AssetBase$AssetBaseBuilderImpl` 
**Implements:** `IndexBase$IndexBaseBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder name`
- `LegalEntityBuilder provider`
- `AssetClassEnum assetClass`

**Key Methods:**
- `getName()` → `FieldWithMetaStringBuilder` [Getter]
- `setName(FieldWithMetaString arg0)` → `IndexBaseBuilder` [Setter]
- `build()` → `IndexBase` [Builder]
- `getProvider()` → `LegalEntityBuilder` [Getter]
- `setIdentifier(List arg0)` → `IndexBaseBuilder` [Setter]
- `setTaxonomy(List arg0)` → `IndexBaseBuilder` [Setter]
- `setNameValue(String arg0)` → `IndexBaseBuilder` [Setter]
- `getOrCreateName()` → `FieldWithMetaStringBuilder` [Getter]
- `setExchange(LegalEntity arg0)` → `IndexBaseBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `IndexBaseBuilder` [Setter]

### IndexBaseImpl
**Extends:** `AssetBase$AssetBaseImpl` 
**Implements:** `IndexBase` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `build()` → `IndexBase` [Builder]
- `getProvider()` → `LegalEntity` [Getter]
- `setBuilderFields(IndexBaseBuilder arg0)` → `void` [Setter]
- `getAssetClass()` → `AssetClassEnum` [Getter]

### IndexBuilderImpl
**Implements:** `Index$IndexBuilder` 

**Fields:**
- `CreditIndexBuilder creditIndex`
- `EquityIndexBuilder equityIndex`
- `FieldWithMetaInterestRateIndexBuilder interestRateIndex`
- `ForeignExchangeRateIndexBuilder foreignExchangeRateIndex`
- `OtherIndexBuilder otherIndex`

**Key Methods:**
- `build()` → `Index` [Builder]
- `setInterestRateIndexValue(InterestRateIndex arg0)` → `IndexBuilder` [Setter]
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndexBuilder` [Getter]
- `getOtherIndex()` → `OtherIndexBuilder` [Getter]
- `setCreditIndex(CreditIndex arg0)` → `IndexBuilder` [Setter]
- `setOtherIndex(OtherIndex arg0)` → `IndexBuilder` [Setter]
- `setEquityIndex(EquityIndex arg0)` → `IndexBuilder` [Setter]
- `getCreditIndex()` → `CreditIndexBuilder` [Getter]
- `getEquityIndex()` → `EquityIndexBuilder` [Getter]
- `getOrCreateOtherIndex()` → `OtherIndexBuilder` [Getter]

### IndexImpl
**Implements:** `Index` 

**Key Methods:**
- `build()` → `Index` [Builder]
- `setBuilderFields(IndexBuilder arg0)` → `void` [Setter]
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndex` [Getter]
- `getOtherIndex()` → `OtherIndex` [Getter]
- `getCreditIndex()` → `CreditIndex` [Getter]
- `getEquityIndex()` → `EquityIndex` [Getter]
- `getForeignExchangeRateIndex()` → `ForeignExchangeRateIndex` [Getter]

### InflationIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `InflationIndex$InflationIndexBuilder` 

**Fields:**
- `FieldWithMetaInflationRateIndexEnumBuilder inflationRateIndex`
- `PeriodBuilder indexTenor`

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `InflationIndexBuilder` [Setter]
- `build()` → `InflationIndex` [Builder]
- `setIdentifier(List arg0)` → `InflationIndexBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `InflationIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `InflationIndexBuilder` [Setter]
- `setInflationRateIndexValue(InflationRateIndexEnum arg0)` → `InflationIndexBuilder` [Setter]
- `setInflationRateIndex(FieldWithMetaInflationRateIndexEnum arg0)` → `InflationIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `InflationIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `InflationIndexBuilder` [Setter]

### InflationIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `InflationIndex` 

**Key Methods:**
- `build()` → `InflationIndex` [Builder]
- `setBuilderFields(InflationIndexBuilder arg0)` → `void` [Setter]
- `getIndexTenor()` → `Period` [Getter]
- `getInflationRateIndex()` → `FieldWithMetaInflationRateIndexEnum` [Getter]

### InformationSourceBuilderImpl
**Implements:** `InformationSource$InformationSourceBuilder` 

**Fields:**
- `FieldWithMetaInformationProviderEnumBuilder sourceProvider`
- `FieldWithMetaStringBuilder sourcePage`
- `String sourcePageHeading`

**Key Methods:**
- `build()` → `InformationSource` [Builder]
- `getSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `getSourcePageHeading()` → `String` [Getter]
- `setSourcePageHeading(String arg0)` → `InformationSourceBuilder` [Setter]
- `getOrCreateSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]
- `setSourcePageValue(String arg0)` → `InformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `InformationSourceBuilder` [Setter]
- `setSourcePage(FieldWithMetaString arg0)` → `InformationSourceBuilder` [Setter]
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]

### InformationSourceImpl
**Implements:** `InformationSource` 

**Key Methods:**
- `build()` → `InformationSource` [Builder]
- `setBuilderFields(InformationSourceBuilder arg0)` → `void` [Setter]
- `getSourcePage()` → `FieldWithMetaString` [Getter]
- `getSourcePageHeading()` → `String` [Getter]
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnum` [Getter]

### InterestRateCurveBuilderImpl
**Implements:** `InterestRateCurve$InterestRateCurveBuilder` 

**Fields:**
- `FieldWithMetaFloatingRateIndexEnumBuilder floatingRateIndex`
- `PeriodBuilder tenor`

**Key Methods:**
- `build()` → `InterestRateCurve` [Builder]
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getTenor()` → `PeriodBuilder` [Getter]
- `setTenor(Period arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateTenor()` → `PeriodBuilder` [Getter]

### InterestRateCurveImpl
**Implements:** `InterestRateCurve` 

**Key Methods:**
- `build()` → `InterestRateCurve` [Builder]
- `setBuilderFields(InterestRateCurveBuilder arg0)` → `void` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getTenor()` → `Period` [Getter]

### InterestRateIndexBuilderImpl
**Implements:** `InterestRateIndex$InterestRateIndexBuilder` 

**Fields:**
- `FloatingRateIndexBuilder floatingRateIndex`
- `InflationIndexBuilder inflationIndex`

**Key Methods:**
- `build()` → `InterestRateIndex` [Builder]
- `getOrCreateInflationIndex()` → `InflationIndexBuilder` [Getter]
- `getInflationIndex()` → `InflationIndexBuilder` [Getter]
- `setInflationIndex(InflationIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `getFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]

### InterestRateIndexImpl
**Implements:** `InterestRateIndex` 

**Key Methods:**
- `build()` → `InterestRateIndex` [Builder]
- `setBuilderFields(InterestRateIndexBuilder arg0)` → `void` [Setter]
- `getInflationIndex()` → `InflationIndex` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndex` [Getter]

### MakeWholeAmountBuilderImpl
**Extends:** `SwapCurveValuation$SwapCurveValuationBuilderImpl` 
**Implements:** `MakeWholeAmount$MakeWholeAmountBuilder` 

**Fields:**
- `InterpolationMethodEnum interpolationMethod`
- `FieldWithMetaDateBuilder earlyCallDate`

**Key Methods:**
- `build()` → `MakeWholeAmount` [Builder]
- `setSide(QuotationSideEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setIndexTenor(Period arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setInterpolationMethod(InterpolationMethodEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `getInterpolationMethod()` → `InterpolationMethodEnum` [Getter]
- `getEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `setEarlyCallDateValue(Date arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setEarlyCallDate(FieldWithMetaDate arg0)` → `MakeWholeAmountBuilder` [Setter]
- `getOrCreateEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `MakeWholeAmountBuilder` [Setter]

### MakeWholeAmountImpl
**Extends:** `SwapCurveValuation$SwapCurveValuationImpl` 
**Implements:** `MakeWholeAmount` 

**Key Methods:**
- `build()` → `MakeWholeAmount` [Builder]
- `setBuilderFields(MakeWholeAmountBuilder arg0)` → `void` [Setter]
- `getInterpolationMethod()` → `InterpolationMethodEnum` [Getter]
- `getEarlyCallDate()` → `FieldWithMetaDate` [Getter]

### MoneyBuilderImpl
**Extends:** `Quantity$QuantityBuilderImpl` 
**Implements:** `Money$MoneyBuilder` 

**Fields:**
- `MetaFieldsBuilder meta`

**Key Methods:**
- `setValue(BigDecimal arg0)` → `MoneyBuilder` [Setter]
- `build()` → `Money` [Builder]
- `setMultiplier(Measure arg0)` → `MoneyBuilder` [Setter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `MoneyBuilder` [Setter]
- `setDatedValue(List arg0)` → `MoneyBuilder` [Setter]
- `setUnit(UnitType arg0)` → `MoneyBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `MoneyBuilder` [Setter]

### MoneyImpl
**Extends:** `Quantity$QuantityImpl` 
**Implements:** `Money` 

**Key Methods:**
- `build()` → `Money` [Builder]
- `setBuilderFields(MoneyBuilder arg0)` → `void` [Setter]
- `getMeta()` → `MetaFields` [Getter]

### MultipleCreditNotationsBuilderImpl
**Implements:** `MultipleCreditNotations$MultipleCreditNotationsBuilder` 

**Fields:**
- `QuantifierEnum condition`
- `List (List) creditNotation`
- `CreditNotationMismatchResolutionEnum mismatchResolution`
- `CreditRatingAgencyEnum referenceAgency`

**Key Methods:**
- `build()` → `MultipleCreditNotations` [Builder]
- `setCondition(QuantifierEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setCreditNotation(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `getCreditNotation()` → `List` [Getter]
- `getMismatchResolution()` → `CreditNotationMismatchResolutionEnum` [Getter]
- `getReferenceAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getOrCreateCreditNotation(int arg0)` → `FieldWithMetaCreditNotationBuilder` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]
- `setCreditNotationValue(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setMismatchResolution(CreditNotationMismatchResolutionEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]

### MultipleCreditNotationsImpl
**Implements:** `MultipleCreditNotations` 

**Key Methods:**
- `build()` → `MultipleCreditNotations` [Builder]
- `setBuilderFields(MultipleCreditNotationsBuilder arg0)` → `void` [Setter]
- `getCreditNotation()` → `List` [Getter]
- `getMismatchResolution()` → `CreditNotationMismatchResolutionEnum` [Getter]
- `getReferenceAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]

### MultipleDebtTypesBuilderImpl
**Implements:** `MultipleDebtTypes$MultipleDebtTypesBuilder` 

**Fields:**
- `QuantifierEnum condition`
- `List (List) debtType`

**Key Methods:**
- `build()` → `MultipleDebtTypes` [Builder]
- `setCondition(QuantifierEnum arg0)` → `MultipleDebtTypesBuilder` [Setter]
- `getDebtType()` → `List` [Getter]
- `getOrCreateDebtType(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(List arg0)` → `MultipleDebtTypesBuilder` [Setter]
- `getCondition()` → `QuantifierEnum` [Getter]
- `setDebtTypeValue(List arg0)` → `MultipleDebtTypesBuilder` [Setter]

### MultipleDebtTypesImpl
**Implements:** `MultipleDebtTypes` 

**Key Methods:**
- `build()` → `MultipleDebtTypes` [Builder]
- `setBuilderFields(MultipleDebtTypesBuilder arg0)` → `void` [Setter]
- `getDebtType()` → `List` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]

### MultipleValuationDatesBuilderImpl
**Extends:** `SingleValuationDate$SingleValuationDateBuilderImpl` 
**Implements:** `MultipleValuationDates$MultipleValuationDatesBuilder` 

**Fields:**
- `Integer businessDaysThereafter`
- `Integer numberValuationDates`

**Key Methods:**
- `build()` → `MultipleValuationDates` [Builder]
- `setBusinessDays(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]
- `setNumberValuationDates(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]
- `getNumberValuationDates()` → `Integer` [Getter]
- `setBusinessDaysThereafter(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]
- `getBusinessDaysThereafter()` → `Integer` [Getter]

### MultipleValuationDatesImpl
**Extends:** `SingleValuationDate$SingleValuationDateImpl` 
**Implements:** `MultipleValuationDates` 

**Key Methods:**
- `build()` → `MultipleValuationDates` [Builder]
- `setBuilderFields(MultipleValuationDatesBuilder arg0)` → `void` [Setter]
- `getNumberValuationDates()` → `Integer` [Getter]
- `getBusinessDaysThereafter()` → `Integer` [Getter]

### ObservableBuilderImpl
**Implements:** `Observable$ObservableBuilder` 

**Fields:**
- `AssetBuilder asset`
- `BasketBuilder basket`
- `IndexBuilder index`

**Key Methods:**
- `getIndex()` → `IndexBuilder` [Getter]
- `build()` → `Observable` [Builder]
- `setIndex(Index arg0)` → `ObservableBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `getOrCreateIndex()` → `IndexBuilder` [Getter]
- `getAsset()` → `AssetBuilder` [Getter]
- `setAsset(Asset arg0)` → `ObservableBuilder` [Setter]
- `getOrCreateBasket()` → `BasketBuilder` [Getter]
- `setBasket(Basket arg0)` → `ObservableBuilder` [Setter]
- `getBasket()` → `BasketBuilder` [Getter]

### ObservableImpl
**Implements:** `Observable` 

**Key Methods:**
- `getIndex()` → `Index` [Getter]
- `build()` → `Observable` [Builder]
- `setBuilderFields(ObservableBuilder arg0)` → `void` [Setter]
- `getAsset()` → `Asset` [Getter]
- `getBasket()` → `Basket` [Getter]

### OtherIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `OtherIndex$OtherIndexBuilder` 

**Fields:**
- `String description`

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `OtherIndexBuilder` [Setter]
- `build()` → `OtherIndex` [Builder]
- `setIdentifier(List arg0)` → `OtherIndexBuilder` [Setter]
- `getDescription()` → `String` [Getter]
- `setDescription(String arg0)` → `OtherIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `OtherIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `OtherIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `OtherIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `OtherIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `OtherIndexBuilder` [Setter]

### OtherIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `OtherIndex` 

**Key Methods:**
- `build()` → `OtherIndex` [Builder]
- `setBuilderFields(OtherIndexBuilder arg0)` → `void` [Setter]
- `getDescription()` → `String` [Getter]

### PerformanceValuationDatesBuilderImpl
**Implements:** `PerformanceValuationDates$PerformanceValuationDatesBuilder` 

**Fields:**
- `DeterminationMethodEnum determinationMethod`
- `AdjustableRelativeOrPeriodicDatesBuilder valuationDates`
- `AdjustableOrRelativeDateBuilder valuationDate`
- `BusinessCenterTimeBuilder valuationTime`
- `TimeTypeEnum valuationTimeType`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PerformanceValuationDates` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `setValuationDates(AdjustableRelativeOrPeriodicDates arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getValuationTimeType()` → `TimeTypeEnum` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### PerformanceValuationDatesImpl
**Implements:** `PerformanceValuationDates` 

**Key Methods:**
- `build()` → `PerformanceValuationDates` [Builder]
- `setBuilderFields(PerformanceValuationDatesBuilder arg0)` → `void` [Setter]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationTimeType()` → `TimeTypeEnum` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PremiumExpressionBuilderImpl
**Implements:** `PremiumExpression$PremiumExpressionBuilder` 

**Fields:**
- `PremiumTypeEnum premiumType`
- `MoneyBuilder pricePerOption`
- `BigDecimal percentageOfNotional`

**Key Methods:**
- `build()` → `PremiumExpression` [Builder]
- `setPercentageOfNotional(BigDecimal arg0)` → `PremiumExpressionBuilder` [Setter]
- `getOrCreatePricePerOption()` → `MoneyBuilder` [Getter]
- `setPricePerOption(Money arg0)` → `PremiumExpressionBuilder` [Setter]
- `getPercentageOfNotional()` → `BigDecimal` [Getter]
- `setPremiumType(PremiumTypeEnum arg0)` → `PremiumExpressionBuilder` [Setter]
- `getPremiumType()` → `PremiumTypeEnum` [Getter]
- `getPricePerOption()` → `MoneyBuilder` [Getter]

### PremiumExpressionImpl
**Implements:** `PremiumExpression` 

**Key Methods:**
- `build()` → `PremiumExpression` [Builder]
- `setBuilderFields(PremiumExpressionBuilder arg0)` → `void` [Setter]
- `getPercentageOfNotional()` → `BigDecimal` [Getter]
- `getPremiumType()` → `PremiumTypeEnum` [Getter]
- `getPricePerOption()` → `Money` [Getter]

### PriceBuilderImpl
**Extends:** `PriceSchedule$PriceScheduleBuilderImpl` 
**Implements:** `Price$PriceBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `PriceBuilder` [Setter]
- `build()` → `Price` [Builder]
- `setPerUnitOf(UnitType arg0)` → `PriceBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `PriceBuilder` [Setter]
- `setDatedValue(List arg0)` → `PriceBuilder` [Setter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceBuilder` [Setter]
- `setPriceType(PriceTypeEnum arg0)` → `PriceBuilder` [Setter]
- `setComposite(PriceComposite arg0)` → `PriceBuilder` [Setter]
- `setCashPrice(CashPrice arg0)` → `PriceBuilder` [Setter]
- `setUnit(UnitType arg0)` → `PriceBuilder` [Setter]

### PriceCompositeBuilderImpl
**Implements:** `PriceComposite$PriceCompositeBuilder` 

**Fields:**
- `BigDecimal baseValue`
- `BigDecimal operand`
- `ArithmeticOperationEnum arithmeticOperator`
- `PriceOperandEnum operandType`

**Key Methods:**
- `build()` → `PriceComposite` [Builder]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceCompositeBuilder` [Setter]
- `getOperandType()` → `PriceOperandEnum` [Getter]
- `getBaseValue()` → `BigDecimal` [Getter]
- `setOperand(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]
- `setOperandType(PriceOperandEnum arg0)` → `PriceCompositeBuilder` [Setter]
- `setBaseValue(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]
- `getOperand()` → `BigDecimal` [Getter]

### PriceCompositeImpl
**Implements:** `PriceComposite` 

**Key Methods:**
- `build()` → `PriceComposite` [Builder]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `setBuilderFields(PriceCompositeBuilder arg0)` → `void` [Setter]
- `getOperandType()` → `PriceOperandEnum` [Getter]
- `getBaseValue()` → `BigDecimal` [Getter]
- `getOperand()` → `BigDecimal` [Getter]

### PriceImpl
**Extends:** `PriceSchedule$PriceScheduleImpl` 
**Implements:** `Price` 

**Key Methods:**
- `build()` → `Price` [Builder]
- `setBuilderFields(PriceBuilder arg0)` → `void` [Setter]

### PriceQuantityBuilderImpl
**Implements:** `PriceQuantity$PriceQuantityBuilder` 

**Fields:**
- `List (List) price`
- `List (List) quantity`
- `FieldWithMetaObservableBuilder observable`
- `AdjustableOrRelativeDateBuilder effectiveDate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `PriceQuantity` [Builder]
- `getObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `getQuantity()` → `List` [Getter]
- `setQuantity(List arg0)` → `PriceQuantityBuilder` [Setter]
- `getOrCreateQuantity(int arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreatePrice(int arg0)` → `FieldWithMetaPriceScheduleBuilder` [Getter]
- `getOrCreateObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `setObservableValue(Observable arg0)` → `PriceQuantityBuilder` [Setter]

### PriceQuantityImpl
**Implements:** `PriceQuantity` 

**Key Methods:**
- `build()` → `PriceQuantity` [Builder]
- `getObservable()` → `FieldWithMetaObservable` [Getter]
- `getQuantity()` → `List` [Getter]
- `setBuilderFields(PriceQuantityBuilder arg0)` → `void` [Setter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getPrice()` → `List` [Getter]

### PriceScheduleBuilderImpl
**Extends:** `MeasureSchedule$MeasureScheduleBuilderImpl` 
**Implements:** `PriceSchedule$PriceScheduleBuilder` 

**Fields:**
- `UnitTypeBuilder perUnitOf`
- `PriceTypeEnum priceType`
- `PriceExpressionEnum priceExpression`
- `PriceCompositeBuilder composite`
- `ArithmeticOperationEnum arithmeticOperator`
- `CashPriceBuilder cashPrice`

**Key Methods:**
- `setValue(BigDecimal arg0)` → `PriceScheduleBuilder` [Setter]
- `build()` → `PriceSchedule` [Builder]
- `getPerUnitOf()` → `UnitTypeBuilder` [Getter]
- `getPriceType()` → `PriceTypeEnum` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `getComposite()` → `PriceCompositeBuilder` [Getter]
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `setPerUnitOf(UnitType arg0)` → `PriceScheduleBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `PriceScheduleBuilder` [Setter]

### PriceScheduleImpl
**Extends:** `MeasureSchedule$MeasureScheduleImpl` 
**Implements:** `PriceSchedule` 

**Key Methods:**
- `build()` → `PriceSchedule` [Builder]
- `getPerUnitOf()` → `UnitType` [Getter]
- `getPriceType()` → `PriceTypeEnum` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `getComposite()` → `PriceComposite` [Getter]
- `getCashPrice()` → `CashPrice` [Getter]
- `setBuilderFields(PriceScheduleBuilder arg0)` → `void` [Setter]

### PriceSourceDisruptionBuilderImpl
**Implements:** `PriceSourceDisruption$PriceSourceDisruptionBuilder` 

**Fields:**
- `FallbackReferencePriceBuilder fallbackReferencePrice`

**Key Methods:**
- `build()` → `PriceSourceDisruption` [Builder]
- `setFallbackReferencePrice(FallbackReferencePrice arg0)` → `PriceSourceDisruptionBuilder` [Setter]
- `getFallbackReferencePrice()` → `FallbackReferencePriceBuilder` [Getter]
- `getOrCreateFallbackReferencePrice()` → `FallbackReferencePriceBuilder` [Getter]

### PriceSourceDisruptionImpl
**Implements:** `PriceSourceDisruption` 

**Key Methods:**
- `build()` → `PriceSourceDisruption` [Builder]
- `setBuilderFields(PriceSourceDisruptionBuilder arg0)` → `void` [Setter]
- `getFallbackReferencePrice()` → `FallbackReferencePrice` [Getter]

### QuotedCurrencyPairBuilderImpl
**Implements:** `QuotedCurrencyPair$QuotedCurrencyPairBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder currency1`
- `FieldWithMetaStringBuilder currency2`
- `QuoteBasisEnum quoteBasis`

**Key Methods:**
- `build()` → `QuotedCurrencyPair` [Builder]
- `setCurrency2Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency1(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `getOrCreateCurrency1()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency1Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency2(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setQuoteBasis(QuoteBasisEnum arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `getOrCreateCurrency2()` → `FieldWithMetaStringBuilder` [Getter]
- `getCurrency2()` → `FieldWithMetaStringBuilder` [Getter]
- `getCurrency1()` → `FieldWithMetaStringBuilder` [Getter]

### QuotedCurrencyPairImpl
**Implements:** `QuotedCurrencyPair` 

**Key Methods:**
- `build()` → `QuotedCurrencyPair` [Builder]
- `setBuilderFields(QuotedCurrencyPairBuilder arg0)` → `void` [Setter]
- `getCurrency2()` → `FieldWithMetaString` [Getter]
- `getCurrency1()` → `FieldWithMetaString` [Getter]
- `getQuoteBasis()` → `QuoteBasisEnum` [Getter]

### RateObservationBuilderImpl
**Implements:** `RateObservation$RateObservationBuilder` 

**Fields:**
- `Date resetDate`
- `Date adjustedFixingDate`
- `BigDecimal observedRate`
- `BigDecimal treatedRate`
- `Integer observationWeight`
- `ReferenceWithMetaRateObservationBuilder rateReference`
- `BigDecimal forecastRate`
- `BigDecimal treatedForecastRate`
- `MetaFieldsBuilder meta`

**Key Methods:**
- `build()` → `RateObservation` [Builder]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getResetDate()` → `Date` [Getter]
- `setResetDate(Date arg0)` → `RateObservationBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]
- `setMeta(MetaFields arg0)` → `RateObservationBuilder` [Setter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `setForecastRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `getRateReference()` → `ReferenceWithMetaRateObservationBuilder` [Getter]
- `setObservedRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]

### RateObservationImpl
**Implements:** `RateObservation` 

**Key Methods:**
- `build()` → `RateObservation` [Builder]
- `setBuilderFields(RateObservationBuilder arg0)` → `void` [Setter]
- `getResetDate()` → `Date` [Getter]
- `getMeta()` → `MetaFields` [Getter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `getRateReference()` → `ReferenceWithMetaRateObservation` [Getter]
- `getTreatedForecastRate()` → `BigDecimal` [Getter]
- `getObservationWeight()` → `Integer` [Getter]
- `getAdjustedFixingDate()` → `Date` [Getter]
- `getTreatedRate()` → `BigDecimal` [Getter]

### ReferenceSwapCurveBuilderImpl
**Implements:** `ReferenceSwapCurve$ReferenceSwapCurveBuilder` 

**Fields:**
- `SwapCurveValuationBuilder swapUnwindValue`
- `MakeWholeAmountBuilder makeWholeAmount`

**Key Methods:**
- `build()` → `ReferenceSwapCurve` [Builder]
- `getMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]
- `getSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]
- `getOrCreateMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]
- `setMakeWholeAmount(MakeWholeAmount arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `setSwapUnwindValue(SwapCurveValuation arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `getOrCreateSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]

### ReferenceSwapCurveImpl
**Implements:** `ReferenceSwapCurve` 

**Key Methods:**
- `build()` → `ReferenceSwapCurve` [Builder]
- `setBuilderFields(ReferenceSwapCurveBuilder arg0)` → `void` [Setter]
- `getMakeWholeAmount()` → `MakeWholeAmount` [Getter]
- `getSwapUnwindValue()` → `SwapCurveValuation` [Getter]

### SettlementRateOptionBuilderImpl
**Implements:** `SettlementRateOption$SettlementRateOptionBuilder` 

**Fields:**
- `FieldWithMetaSettlementRateOptionEnumBuilder settlementRateOption`
- `PriceSourceDisruptionBuilder priceSourceDisruption`

**Key Methods:**
- `build()` → `SettlementRateOption` [Builder]
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getPriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]
- `setSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]
- `setPriceSourceDisruption(PriceSourceDisruption arg0)` → `SettlementRateOptionBuilder` [Setter]
- `getOrCreateSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `setSettlementRateOptionValue(SettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]
- `getOrCreatePriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]

### SettlementRateOptionImpl
**Implements:** `SettlementRateOption` 

**Key Methods:**
- `build()` → `SettlementRateOption` [Builder]
- `setBuilderFields(SettlementRateOptionBuilder arg0)` → `void` [Setter]
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnum` [Getter]
- `getPriceSourceDisruption()` → `PriceSourceDisruption` [Getter]

### SingleValuationDateBuilderImpl
**Implements:** `SingleValuationDate$SingleValuationDateBuilder` 

**Fields:**
- `Integer businessDays`

**Key Methods:**
- `build()` → `SingleValuationDate` [Builder]
- `setBusinessDays(Integer arg0)` → `SingleValuationDateBuilder` [Setter]
- `getBusinessDays()` → `Integer` [Getter]

### SingleValuationDateImpl
**Implements:** `SingleValuationDate` 

**Key Methods:**
- `build()` → `SingleValuationDate` [Builder]
- `setBuilderFields(SingleValuationDateBuilder arg0)` → `void` [Setter]
- `getBusinessDays()` → `Integer` [Getter]

### SwapCurveValuationBuilderImpl
**Implements:** `SwapCurveValuation$SwapCurveValuationBuilder` 

**Fields:**
- `FloatingRateIndexEnum floatingRateIndex`
- `PeriodBuilder indexTenor`
- `BigDecimal spread`
- `QuotationSideEnum side`

**Key Methods:**
- `build()` → `SwapCurveValuation` [Builder]
- `getSide()` → `QuotationSideEnum` [Getter]
- `setSide(QuotationSideEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `setSpread(BigDecimal arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getSpread()` → `BigDecimal` [Getter]

### SwapCurveValuationImpl
**Implements:** `SwapCurveValuation` 

**Key Methods:**
- `build()` → `SwapCurveValuation` [Builder]
- `setBuilderFields(SwapCurveValuationBuilder arg0)` → `void` [Setter]
- `getSide()` → `QuotationSideEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getSpread()` → `BigDecimal` [Getter]

### TransactedPriceBuilderImpl
**Implements:** `TransactedPrice$TransactedPriceBuilder` 

**Fields:**
- `BigDecimal marketFixedRate`
- `BigDecimal initialPoints`
- `BigDecimal marketPrice`
- `QuotationStyleEnum quotationStyle`

**Key Methods:**
- `build()` → `TransactedPrice` [Builder]
- `setQuotationStyle(QuotationStyleEnum arg0)` → `TransactedPriceBuilder` [Setter]
- `getInitialPoints()` → `BigDecimal` [Getter]
- `getQuotationStyle()` → `QuotationStyleEnum` [Getter]
- `setMarketFixedRate(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setMarketPrice(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setInitialPoints(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `getMarketFixedRate()` → `BigDecimal` [Getter]
- `getMarketPrice()` → `BigDecimal` [Getter]

### TransactedPriceImpl
**Implements:** `TransactedPrice` 

**Key Methods:**
- `build()` → `TransactedPrice` [Builder]
- `setBuilderFields(TransactedPriceBuilder arg0)` → `void` [Setter]
- `getInitialPoints()` → `BigDecimal` [Getter]
- `getQuotationStyle()` → `QuotationStyleEnum` [Getter]
- `getMarketFixedRate()` → `BigDecimal` [Getter]
- `getMarketPrice()` → `BigDecimal` [Getter]

### ValuationDatesBuilderImpl
**Implements:** `ValuationDates$ValuationDatesBuilder` 

**Fields:**
- `PerformanceValuationDatesBuilder initialValuationDate`
- `PerformanceValuationDatesBuilder interimValuationDate`
- `PerformanceValuationDatesBuilder finalValuationDate`

**Key Methods:**
- `build()` → `ValuationDates` [Builder]
- `getFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `setInitialValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setFinalValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setInterimValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `getOrCreateFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]

### ValuationDatesImpl
**Implements:** `ValuationDates` 

**Key Methods:**
- `build()` → `ValuationDates` [Builder]
- `setBuilderFields(ValuationDatesBuilder arg0)` → `void` [Setter]
- `getFinalValuationDate()` → `PerformanceValuationDates` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDates` [Getter]
- `getInitialValuationDate()` → `PerformanceValuationDates` [Getter]

### ValuationMethodBuilderImpl
**Implements:** `ValuationMethod$ValuationMethodBuilder` 

**Fields:**
- `ValuationSourceBuilder valuationSource`
- `QuotationRateTypeEnum quotationMethod`
- `ValuationMethodEnum valuationMethod`
- `MoneyBuilder quotationAmount`
- `MoneyBuilder minimumQuotationAmount`
- `CashCollateralValuationMethodBuilder cashCollateralValuationMethod`

**Key Methods:**
- `build()` → `ValuationMethod` [Builder]
- `setValuationMethod(ValuationMethodEnum arg0)` → `ValuationMethodBuilder` [Setter]
- `getValuationMethod()` → `ValuationMethodEnum` [Getter]
- `getQuotationAmount()` → `MoneyBuilder` [Getter]
- `getMinimumQuotationAmount()` → `MoneyBuilder` [Getter]
- `getQuotationMethod()` → `QuotationRateTypeEnum` [Getter]
- `getValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setValuationSource(ValuationSource arg0)` → `ValuationMethodBuilder` [Setter]
- `getOrCreateValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setQuotationMethod(QuotationRateTypeEnum arg0)` → `ValuationMethodBuilder` [Setter]

### ValuationMethodImpl
**Implements:** `ValuationMethod` 

**Key Methods:**
- `build()` → `ValuationMethod` [Builder]
- `setBuilderFields(ValuationMethodBuilder arg0)` → `void` [Setter]
- `getValuationMethod()` → `ValuationMethodEnum` [Getter]
- `getQuotationAmount()` → `Money` [Getter]
- `getMinimumQuotationAmount()` → `Money` [Getter]
- `getQuotationMethod()` → `QuotationRateTypeEnum` [Getter]
- `getValuationSource()` → `ValuationSource` [Getter]
- `getCashCollateralValuationMethod()` → `CashCollateralValuationMethod` [Getter]

### ValuationPostponementBuilderImpl
**Implements:** `ValuationPostponement$ValuationPostponementBuilder` 

**Fields:**
- `Integer maximumDaysOfPostponement`

**Key Methods:**
- `build()` → `ValuationPostponement` [Builder]
- `setMaximumDaysOfPostponement(Integer arg0)` → `ValuationPostponementBuilder` [Setter]
- `getMaximumDaysOfPostponement()` → `Integer` [Getter]

### ValuationPostponementImpl
**Implements:** `ValuationPostponement` 

**Key Methods:**
- `build()` → `ValuationPostponement` [Builder]
- `setBuilderFields(ValuationPostponementBuilder arg0)` → `void` [Setter]
- `getMaximumDaysOfPostponement()` → `Integer` [Getter]

### ValuationSourceBuilderImpl
**Implements:** `ValuationSource$ValuationSourceBuilder` 

**Fields:**
- `ReferenceWithMetaQuotedCurrencyPairBuilder quotedCurrencyPair`
- `FxSpotRateSourceBuilder informationSource`
- `SettlementRateOptionBuilder settlementRateOption`
- `ReferenceBanksBuilder referenceBanks`
- `AncillaryEntityBuilder dealerOrCCP`

**Key Methods:**
- `build()` → `ValuationSource` [Builder]
- `getInformationSource()` → `FxSpotRateSourceBuilder` [Getter]
- `setInformationSource(FxSpotRateSource arg0)` → `ValuationSourceBuilder` [Setter]
- `getReferenceBanks()` → `ReferenceBanksBuilder` [Getter]
- `getSettlementRateOption()` → `SettlementRateOptionBuilder` [Getter]
- `getDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `getOrCreateDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `setDealerOrCCP(AncillaryEntity arg0)` → `ValuationSourceBuilder` [Setter]
- `setSettlementRateOption(SettlementRateOption arg0)` → `ValuationSourceBuilder` [Setter]
- `getOrCreateReferenceBanks()` → `ReferenceBanksBuilder` [Getter]

### ValuationSourceImpl
**Implements:** `ValuationSource` 

**Key Methods:**
- `build()` → `ValuationSource` [Builder]
- `setBuilderFields(ValuationSourceBuilder arg0)` → `void` [Setter]
- `getInformationSource()` → `FxSpotRateSource` [Getter]
- `getReferenceBanks()` → `ReferenceBanks` [Getter]
- `getSettlementRateOption()` → `SettlementRateOption` [Getter]
- `getDealerOrCCP()` → `AncillaryEntity` [Getter]
- `getQuotedCurrencyPair()` → `ReferenceWithMetaQuotedCurrencyPair` [Getter]

