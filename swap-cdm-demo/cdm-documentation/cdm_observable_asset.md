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
- `getBasketConstituent()` → `List` [Getter]
- `setIsExchangeListed(Boolean arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituentValue(List arg0)` → `BasketBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `BasketBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituent(List arg0)` → `BasketBuilder` [Setter]
- `setTaxonomy(List arg0)` → `BasketBuilder` [Setter]
- `setIdentifier(List arg0)` → `BasketBuilder` [Setter]
- `getOrCreateBasketConstituent(int arg0)` → `FieldWithMetaBasketConstituentBuilder` [Getter]

### BasketConstituent
**Implements:** `Observable` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `BasketConstituent` [Builder]
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getQuantity()` → `List` [Getter]

### BasketConstituentBuilder
**Implements:** `BasketConstituent` `Observable$ObservableBuilder` 

**Key Methods:**
- `setIndex(Index arg0)` → `BasketConstituentBuilder` [Setter]
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `setBasket(Basket arg0)` → `BasketConstituentBuilder` [Setter]
- `getQuantity()` → `List` [Getter]
- `getOrCreateQuantity(int arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(List arg0)` → `BasketConstituentBuilder` [Setter]
- `setQuantityValue(List arg0)` → `BasketConstituentBuilder` [Setter]
- `getOrCreateInterimValuationPrice(int arg0)` → `ReferenceWithMetaPriceScheduleBuilder` [Getter]

### CalculationAgent
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CalculationAgent` [Builder]
- `getCalculationAgentParty()` → `AncillaryRoleEnum` [Getter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]
- `getCalculationAgentPartyEnum()` → `PartyDeterminationEnum` [Getter]

### CalculationAgentBuilder
**Implements:** `CalculationAgent` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCalculationAgentParty(AncillaryRoleEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `getOrCreateCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setCalculationAgentPartyEnum(PartyDeterminationEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentBusinessCenterValue(BusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]

### CashCollateralValuationMethod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CashCollateralValuationMethod` [Builder]
- `getApplicableCsa()` → `CsaTypeEnum` [Getter]
- `getCashCollateralCurrency()` → `String` [Getter]
- `getAgreedDiscountRate()` → `FieldWithMetaString` [Getter]
- `getProtectedParty()` → `List` [Getter]
- `getCashCollateralInterestRate()` → `FieldWithMetaString` [Getter]
- `getPrescribedDocumentationAdjustment()` → `Boolean` [Getter]

### CashCollateralValuationMethodBuilder
**Implements:** `CashCollateralValuationMethod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setProtectedParty(List arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setApplicableCsa(CsaTypeEnum arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRateValue(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRate(FieldWithMetaString arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setCashCollateralCurrency(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `getAgreedDiscountRate()` → `FieldWithMetaStringBuilder` [Getter]
- `setCashCollateralInterestRateValue(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setPrescribedDocumentationAdjustment(Boolean arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `getOrCreateCashCollateralInterestRate()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateAgreedDiscountRate()` → `FieldWithMetaStringBuilder` [Getter]

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
- `setCashPriceType(CashPriceTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `setPremiumExpression(PremiumExpression arg0)` → `CashPriceBuilder` [Setter]
- `setFeeType(FeeTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `getPremiumExpression()` → `PremiumExpressionBuilder` [Getter]
- `getOrCreatePremiumExpression()` → `PremiumExpressionBuilder` [Getter]

### CreditIndex
**Implements:** `IndexBase` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditIndex` [Builder]
- `getIndexAnnexSource()` → `FieldWithMetaIndexAnnexSourceEnum` [Getter]
- `getIndexAnnexDate()` → `Date` [Getter]
- `getSettledEntityMatrix()` → `SettledEntityMatrix` [Getter]
- `getIndexSeries()` → `Integer` [Getter]
- `getIndexFactor()` → `BigDecimal` [Getter]
- `getExcludedReferenceEntity()` → `List` [Getter]
- `getIndexAnnexVersion()` → `Integer` [Getter]
- `getSeniority()` → `CreditSeniorityEnum` [Getter]

### CreditIndexBuilder
**Implements:** `CreditIndex` `IndexBase$IndexBaseBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `CreditIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `CreditIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `CreditIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `CreditIndexBuilder` [Setter]
- `getIndexAnnexSource()` → `FieldWithMetaIndexAnnexSourceEnumBuilder` [Getter]
- `getSettledEntityMatrix()` → `SettledEntityMatrixBuilder` [Getter]
- `setProvider(LegalEntity arg0)` → `CreditIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `CreditIndexBuilder` [Setter]
- `getExcludedReferenceEntity()` → `List` [Getter]
- `getOrCreateTranche()` → `TrancheBuilder` [Getter]

### CreditNotation
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditNotation` [Builder]
- `getDebt()` → `CreditRatingDebt` [Getter]
- `getAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getScale()` → `FieldWithMetaString` [Getter]
- `getOutlook()` → `CreditRatingOutlookEnum` [Getter]
- `getCreditWatch()` → `CreditRatingCreditWatchEnum` [Getter]
- `getNotation()` → `FieldWithMetaString` [Getter]

### CreditNotationBuilder
**Implements:** `CreditNotation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setScale(FieldWithMetaString arg0)` → `CreditNotationBuilder` [Setter]
- `getDebt()` → `CreditRatingDebtBuilder` [Getter]
- `getScale()` → `FieldWithMetaStringBuilder` [Getter]
- `setAgency(CreditRatingAgencyEnum arg0)` → `CreditNotationBuilder` [Setter]
- `setOutlook(CreditRatingOutlookEnum arg0)` → `CreditNotationBuilder` [Setter]
- `setDebt(CreditRatingDebt arg0)` → `CreditNotationBuilder` [Setter]
- `getNotation()` → `FieldWithMetaStringBuilder` [Getter]
- `setNotation(FieldWithMetaString arg0)` → `CreditNotationBuilder` [Setter]
- `setCreditWatch(CreditRatingCreditWatchEnum arg0)` → `CreditNotationBuilder` [Setter]
- `getOrCreateNotation()` → `FieldWithMetaStringBuilder` [Getter]

### CreditNotations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `CreditNotations` [Builder]
- `getCreditNotations()` → `MultipleCreditNotations` [Getter]
- `getCreditNotation()` → `CreditNotation` [Getter]

### CreditNotationsBuilder
**Implements:** `CreditNotations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]
- `getOrCreateCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]
- `setCreditNotations(MultipleCreditNotations arg0)` → `CreditNotationsBuilder` [Setter]
- `setCreditNotation(CreditNotation arg0)` → `CreditNotationsBuilder` [Setter]
- `getOrCreateCreditNotation()` → `CreditNotationBuilder` [Getter]
- `getCreditNotation()` → `CreditNotationBuilder` [Getter]

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
- `getOrCreateDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(FieldWithMetaString arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtTypes(MultipleDebtTypes arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]
- `setDebtTypeValue(String arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getOrCreateDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]

### Curve
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Curve` [Builder]
- `getInterestRateCurve()` → `InterestRateCurve` [Getter]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnum` [Getter]

### CurveBuilder
**Implements:** `Curve` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]
- `setInterestRateCurve(InterestRateCurve arg0)` → `CurveBuilder` [Setter]
- `setCommodityCurveValue(CommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]
- `getInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]
- `getOrCreateCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `setCommodityCurve(FieldWithMetaCommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]

### DividendApplicability
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `DividendApplicability` [Builder]
- `getOptionsExchangeDividends()` → `Boolean` [Getter]
- `getAllDividends()` → `Boolean` [Getter]
- `getAdditionalDividends()` → `Boolean` [Getter]

### DividendApplicabilityBuilder
**Implements:** `DividendApplicability` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setOptionsExchangeDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setAdditionalDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setAllDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]

### EquityIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `EquityIndex` [Builder]

### EquityIndexBuilder
**Implements:** `EquityIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `EquityIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `EquityIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `EquityIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `EquityIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `EquityIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `EquityIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `EquityIndexBuilder` [Setter]

### FallbackReferencePrice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FallbackReferencePrice` [Builder]
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getFallbackSurveyValuationPostponement()` → `Boolean` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgent` [Getter]
- `getValuationPostponement()` → `ValuationPostponement` [Getter]

### FallbackReferencePriceBuilder
**Implements:** `FallbackReferencePrice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `getOrCreateFallBackSettlementRateOption(int arg0)` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getOrCreateCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `setFallBackSettlementRateOptionValue(List arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `setCalculationAgentDetermination(CalculationAgent arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `setFallBackSettlementRateOption(List arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `setFallbackSurveyValuationPostponement(Boolean arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `getOrCreateValuationPostponement()` → `ValuationPostponementBuilder` [Getter]
- `getValuationPostponement()` → `ValuationPostponementBuilder` [Getter]

### FloatingRateIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FloatingRateIndex` [Builder]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]

### FloatingRateIndexBuilder
**Implements:** `FloatingRateIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `FloatingRateIndexBuilder` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `FloatingRateIndexBuilder` [Setter]

### ForeignExchangeRateIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ForeignExchangeRateIndex` [Builder]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPair` [Getter]
- `getPrimaryFxSpotRateSource()` → `InformationSource` [Getter]
- `getSecondaryFxSpotRateSource()` → `InformationSource` [Getter]

### ForeignExchangeRateIndexBuilder
**Implements:** `ForeignExchangeRateIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPairBuilder` [Getter]
- `getPrimaryFxSpotRateSource()` → `InformationSourceBuilder` [Getter]
- `setTaxonomy(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]

### FxInformationSource
**Implements:** `InformationSource` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxInformationSource` [Builder]
- `getFixingTime()` → `BusinessCenterTime` [Getter]

### FxInformationSourceBuilder
**Implements:** `FxInformationSource` `InformationSource$InformationSourceBuilder` 

**Key Methods:**
- `setSourcePage(FieldWithMetaString arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProviderValue(InformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePageValue(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePageHeading(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxInformationSourceBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]

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
- `setRate(BigDecimal arg0)` → `FxRateBuilder` [Setter]
- `getOrCreateQuotedCurrencyPair()` → `QuotedCurrencyPairBuilder` [Getter]
- `setQuotedCurrencyPair(QuotedCurrencyPair arg0)` → `FxRateBuilder` [Setter]

### FxRateSourceFixing
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `FxRateSourceFixing` [Builder]
- `getSettlementRateSource()` → `FxSettlementRateSource` [Getter]
- `getFixingDate()` → `AdjustableDate` [Getter]

### FxRateSourceFixingBuilder
**Implements:** `FxRateSourceFixing` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]
- `getOrCreateFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]
- `getFixingDate()` → `AdjustableDateBuilder` [Getter]
- `setSettlementRateSource(FxSettlementRateSource arg0)` → `FxRateSourceFixingBuilder` [Setter]
- `setFixingDate(AdjustableDate arg0)` → `FxRateSourceFixingBuilder` [Setter]

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
- `setSettlementRateOption(FieldWithMetaString arg0)` → `FxSettlementRateSourceBuilder` [Setter]
- `getSettlementRateOption()` → `FieldWithMetaStringBuilder` [Getter]
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
- `getSecondarySource()` → `InformationSource` [Getter]
- `getPrimarySource()` → `InformationSource` [Getter]

### FxSpotRateSourceBuilder
**Implements:** `FxSpotRateSource` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSecondarySource()` → `InformationSourceBuilder` [Getter]
- `getPrimarySource()` → `InformationSourceBuilder` [Getter]
- `getOrCreatePrimarySource()` → `InformationSourceBuilder` [Getter]
- `getOrCreateSecondarySource()` → `InformationSourceBuilder` [Getter]
- `setSecondarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]
- `setPrimarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]

### Index
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Index` [Builder]
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndex` [Getter]
- `getEquityIndex()` → `EquityIndex` [Getter]
- `getOtherIndex()` → `OtherIndex` [Getter]
- `getCreditIndex()` → `CreditIndex` [Getter]
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
- `setIsExchangeListed(Boolean arg0)` → `IndexBaseBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `IndexBaseBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `IndexBaseBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `IndexBaseBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `IndexBaseBuilder` [Setter]
- `setTaxonomy(List arg0)` → `IndexBaseBuilder` [Setter]
- `setIdentifier(List arg0)` → `IndexBaseBuilder` [Setter]

### IndexBuilder
**Implements:** `Index` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndexBuilder` [Getter]
- `setInterestRateIndexValue(InterestRateIndex arg0)` → `IndexBuilder` [Setter]
- `getEquityIndex()` → `EquityIndexBuilder` [Getter]
- `getOtherIndex()` → `OtherIndexBuilder` [Getter]
- `getCreditIndex()` → `CreditIndexBuilder` [Getter]
- `setCreditIndex(CreditIndex arg0)` → `IndexBuilder` [Setter]
- `setInterestRateIndex(FieldWithMetaInterestRateIndex arg0)` → `IndexBuilder` [Setter]
- `setOtherIndex(OtherIndex arg0)` → `IndexBuilder` [Setter]
- `getOrCreateEquityIndex()` → `EquityIndexBuilder` [Getter]
- `getOrCreateCreditIndex()` → `CreditIndexBuilder` [Getter]

### InflationIndex
**Implements:** `IndexBase` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InflationIndex` [Builder]
- `getInflationRateIndex()` → `FieldWithMetaInflationRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]

### InflationIndexBuilder
**Implements:** `InflationIndex` `IndexBase$IndexBaseBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `InflationIndexBuilder` [Setter]
- `setIsExchangeListed(Boolean arg0)` → `InflationIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `InflationIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `InflationIndexBuilder` [Setter]
- `getInflationRateIndex()` → `FieldWithMetaInflationRateIndexEnumBuilder` [Getter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setProvider(LegalEntity arg0)` → `InflationIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `InflationIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `InflationIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `InflationIndexBuilder` [Setter]

### InformationSource
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InformationSource` [Builder]
- `getSourcePageHeading()` → `String` [Getter]
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnum` [Getter]
- `getSourcePage()` → `FieldWithMetaString` [Getter]

### InformationSourceBuilder
**Implements:** `InformationSource` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]
- `getSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `setSourcePage(FieldWithMetaString arg0)` → `InformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `InformationSourceBuilder` [Setter]
- `setSourceProviderValue(InformationProviderEnum arg0)` → `InformationSourceBuilder` [Setter]
- `setSourcePageValue(String arg0)` → `InformationSourceBuilder` [Setter]
- `getOrCreateSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]
- `setSourcePageHeading(String arg0)` → `InformationSourceBuilder` [Setter]

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
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getTenor()` → `PeriodBuilder` [Getter]
- `setTenor(Period arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateTenor()` → `PeriodBuilder` [Getter]

### InterestRateIndex
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `InterestRateIndex` [Builder]
- `getFloatingRateIndex()` → `FloatingRateIndex` [Getter]
- `getInflationIndex()` → `InflationIndex` [Getter]

### InterestRateIndexBuilder
**Implements:** `InterestRateIndex` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateInflationIndex()` → `InflationIndexBuilder` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]
- `setInflationIndex(InflationIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `setFloatingRateIndex(FloatingRateIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `getInflationIndex()` → `InflationIndexBuilder` [Getter]
- `getOrCreateFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]

### MakeWholeAmount
**Implements:** `SwapCurveValuation` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MakeWholeAmount` [Builder]
- `getEarlyCallDate()` → `FieldWithMetaDate` [Getter]
- `getInterpolationMethod()` → `InterpolationMethodEnum` [Getter]

### MakeWholeAmountBuilder
**Implements:** `MakeWholeAmount` `SwapCurveValuation$SwapCurveValuationBuilder` 

**Key Methods:**
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setSide(QuotationSideEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setEarlyCallDate(FieldWithMetaDate arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setEarlyCallDateValue(Date arg0)` → `MakeWholeAmountBuilder` [Setter]
- `getEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `getOrCreateEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setInterpolationMethod(InterpolationMethodEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
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
- `setDatedValue(List arg0)` → `MoneyBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `MoneyBuilder` [Setter]
- `setUnit(UnitType arg0)` → `MoneyBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `MoneyBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

### MultipleCreditNotations
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `MultipleCreditNotations` [Builder]
- `getReferenceAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getMismatchResolution()` → `CreditNotationMismatchResolutionEnum` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]
- `getCreditNotation()` → `List` [Getter]

### MultipleCreditNotationsBuilder
**Implements:** `MultipleCreditNotations` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setCondition(QuantifierEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setCreditNotation(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `getOrCreateCreditNotation(int arg0)` → `FieldWithMetaCreditNotationBuilder` [Getter]
- `getCreditNotation()` → `List` [Getter]
- `setMismatchResolution(CreditNotationMismatchResolutionEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setCreditNotationValue(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]
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
- `getOrCreateDebtType(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(List arg0)` → `MultipleDebtTypesBuilder` [Setter]
- `getDebtType()` → `List` [Getter]
- `setCondition(QuantifierEnum arg0)` → `MultipleDebtTypesBuilder` [Setter]
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
- `getBasket()` → `Basket` [Getter]
- `getAsset()` → `Asset` [Getter]

### ObservableBuilder
**Implements:** `Observable` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getIndex()` → `IndexBuilder` [Getter]
- `setIndex(Index arg0)` → `ObservableBuilder` [Setter]
- `getOrCreateIndex()` → `IndexBuilder` [Getter]
- `getOrCreateBasket()` → `BasketBuilder` [Getter]
- `setBasket(Basket arg0)` → `ObservableBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `getBasket()` → `BasketBuilder` [Getter]
- `setAsset(Asset arg0)` → `ObservableBuilder` [Setter]
- `getAsset()` → `AssetBuilder` [Getter]

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
- `setIsExchangeListed(Boolean arg0)` → `OtherIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `OtherIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `OtherIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `OtherIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `OtherIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `OtherIndexBuilder` [Setter]
- `setDescription(String arg0)` → `OtherIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `OtherIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `OtherIndexBuilder` [Setter]

### PerformanceValuationDates
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PerformanceValuationDates` [Builder]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationTimeType()` → `TimeTypeEnum` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PerformanceValuationDatesBuilder
**Implements:** `PerformanceValuationDates` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `setValuationDates(AdjustableRelativeOrPeriodicDates arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `setValuationTime(BusinessCenterTime arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `setValuationDate(AdjustableOrRelativeDate arg0)` → `PerformanceValuationDatesBuilder` [Setter]

### PremiumExpression
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PremiumExpression` [Builder]
- `getPercentageOfNotional()` → `BigDecimal` [Getter]
- `getPricePerOption()` → `Money` [Getter]
- `getPremiumType()` → `PremiumTypeEnum` [Getter]

### PremiumExpressionBuilder
**Implements:** `PremiumExpression` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreatePricePerOption()` → `MoneyBuilder` [Getter]
- `getPricePerOption()` → `MoneyBuilder` [Getter]
- `setPremiumType(PremiumTypeEnum arg0)` → `PremiumExpressionBuilder` [Setter]
- `setPricePerOption(Money arg0)` → `PremiumExpressionBuilder` [Setter]
- `setPercentageOfNotional(BigDecimal arg0)` → `PremiumExpressionBuilder` [Setter]

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
- `setPriceType(PriceTypeEnum arg0)` → `PriceBuilder` [Setter]
- `setCashPrice(CashPrice arg0)` → `PriceBuilder` [Setter]
- `setDatedValue(List arg0)` → `PriceBuilder` [Setter]
- `setComposite(PriceComposite arg0)` → `PriceBuilder` [Setter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `PriceBuilder` [Setter]
- `setUnit(UnitType arg0)` → `PriceBuilder` [Setter]

### PriceComposite
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceComposite` [Builder]
- `getBaseValue()` → `BigDecimal` [Getter]
- `getOperandType()` → `PriceOperandEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `getOperand()` → `BigDecimal` [Getter]

### PriceCompositeBuilder
**Implements:** `PriceComposite` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setOperandType(PriceOperandEnum arg0)` → `PriceCompositeBuilder` [Setter]
- `setBaseValue(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]
- `setOperand(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceCompositeBuilder` [Setter]

### PriceQuantity
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceQuantity` [Builder]
- `getObservable()` → `FieldWithMetaObservable` [Getter]
- `getQuantity()` → `List` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `getPrice()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PriceQuantityBuilder
**Implements:** `PriceQuantity` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreatePrice(int arg0)` → `FieldWithMetaPriceScheduleBuilder` [Getter]
- `getOrCreateObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `setEffectiveDate(AdjustableOrRelativeDate arg0)` → `PriceQuantityBuilder` [Setter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `getQuantity()` → `List` [Getter]
- `getOrCreateQuantity(int arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(List arg0)` → `PriceQuantityBuilder` [Setter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]

### PriceSchedule
**Implements:** `MeasureSchedule` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceSchedule` [Builder]
- `getPerUnitOf()` → `UnitType` [Getter]
- `getComposite()` → `PriceComposite` [Getter]
- `getCashPrice()` → `CashPrice` [Getter]
- `getPriceType()` → `PriceTypeEnum` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]

### PriceScheduleBuilder
**Implements:** `PriceSchedule` `MeasureSchedule$MeasureScheduleBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `PriceScheduleBuilder` [Setter]
- `getOrCreateCashPrice()` → `CashPriceBuilder` [Getter]
- `getOrCreatePerUnitOf()` → `UnitTypeBuilder` [Getter]
- `getOrCreateComposite()` → `PriceCompositeBuilder` [Getter]
- `getPerUnitOf()` → `UnitTypeBuilder` [Getter]
- `getComposite()` → `PriceCompositeBuilder` [Getter]
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `setPerUnitOf(UnitType arg0)` → `PriceScheduleBuilder` [Setter]
- `setPriceType(PriceTypeEnum arg0)` → `PriceScheduleBuilder` [Setter]
- `setCashPrice(CashPrice arg0)` → `PriceScheduleBuilder` [Setter]

### PriceSourceDisruption
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `PriceSourceDisruption` [Builder]
- `getFallbackReferencePrice()` → `FallbackReferencePrice` [Getter]

### PriceSourceDisruptionBuilder
**Implements:** `PriceSourceDisruption` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getFallbackReferencePrice()` → `FallbackReferencePriceBuilder` [Getter]
- `setFallbackReferencePrice(FallbackReferencePrice arg0)` → `PriceSourceDisruptionBuilder` [Setter]
- `getOrCreateFallbackReferencePrice()` → `FallbackReferencePriceBuilder` [Getter]

### QuotedCurrencyPair
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `QuotedCurrencyPair` [Builder]
- `getCurrency1()` → `FieldWithMetaString` [Getter]
- `getCurrency2()` → `FieldWithMetaString` [Getter]
- `getQuoteBasis()` → `QuoteBasisEnum` [Getter]

### QuotedCurrencyPairBuilder
**Implements:** `QuotedCurrencyPair` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateCurrency1()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateCurrency2()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency1(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency1Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency2Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency2(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setQuoteBasis(QuoteBasisEnum arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `getCurrency1()` → `FieldWithMetaStringBuilder` [Getter]
- `getCurrency2()` → `FieldWithMetaStringBuilder` [Getter]

### RateObservation
**Implements:** `RosettaModelObject` `GlobalKey` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `RateObservation` [Builder]
- `getResetDate()` → `Date` [Getter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `getTreatedRate()` → `BigDecimal` [Getter]
- `getRateReference()` → `ReferenceWithMetaRateObservation` [Getter]
- `getObservedRate()` → `BigDecimal` [Getter]
- `getObservationWeight()` → `Integer` [Getter]
- `getAdjustedFixingDate()` → `Date` [Getter]
- `getTreatedForecastRate()` → `BigDecimal` [Getter]

### RateObservationBuilder
**Implements:** `RateObservation` `RosettaModelObjectBuilder` `GlobalKey$GlobalKeyBuilder` 

**Key Methods:**
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `setForecastRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `getRateReference()` → `ReferenceWithMetaRateObservationBuilder` [Getter]
- `setTreatedForecastRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `setObservedRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `getOrCreateRateReference()` → `ReferenceWithMetaRateObservationBuilder` [Getter]
- `setAdjustedFixingDate(Date arg0)` → `RateObservationBuilder` [Setter]
- `setTreatedRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `setObservationWeight(Integer arg0)` → `RateObservationBuilder` [Setter]
- `setRateReferenceValue(RateObservation arg0)` → `RateObservationBuilder` [Setter]

### ReferenceSwapCurve
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ReferenceSwapCurve` [Builder]
- `getSwapUnwindValue()` → `SwapCurveValuation` [Getter]
- `getMakeWholeAmount()` → `MakeWholeAmount` [Getter]

### ReferenceSwapCurveBuilder
**Implements:** `ReferenceSwapCurve` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]
- `setSwapUnwindValue(SwapCurveValuation arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `setMakeWholeAmount(MakeWholeAmount arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `getOrCreateSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]
- `getSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]
- `getMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]

### SettlementRateOption
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `SettlementRateOption` [Builder]
- `getPriceSourceDisruption()` → `PriceSourceDisruption` [Getter]
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnum` [Getter]

### SettlementRateOptionBuilder
**Implements:** `SettlementRateOption` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]
- `setPriceSourceDisruption(PriceSourceDisruption arg0)` → `SettlementRateOptionBuilder` [Setter]
- `getPriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getOrCreateSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getOrCreatePriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]
- `setSettlementRateOptionValue(SettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]

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
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `getSide()` → `QuotationSideEnum` [Getter]
- `getSpread()` → `BigDecimal` [Getter]

### SwapCurveValuationBuilder
**Implements:** `SwapCurveValuation` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `setSide(QuotationSideEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `SwapCurveValuationBuilder` [Setter]
- `setSpread(BigDecimal arg0)` → `SwapCurveValuationBuilder` [Setter]

### TransactedPrice
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `TransactedPrice` [Builder]
- `getInitialPoints()` → `BigDecimal` [Getter]
- `getQuotationStyle()` → `QuotationStyleEnum` [Getter]
- `getMarketPrice()` → `BigDecimal` [Getter]
- `getMarketFixedRate()` → `BigDecimal` [Getter]

### TransactedPriceBuilder
**Implements:** `TransactedPrice` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setQuotationStyle(QuotationStyleEnum arg0)` → `TransactedPriceBuilder` [Setter]
- `setMarketFixedRate(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setInitialPoints(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setMarketPrice(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]

### ValuationDates
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationDates` [Builder]
- `getInitialValuationDate()` → `PerformanceValuationDates` [Getter]
- `getFinalValuationDate()` → `PerformanceValuationDates` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDates` [Getter]

### ValuationDatesBuilder
**Implements:** `ValuationDates` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `setInitialValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setFinalValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setInterimValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `getOrCreateInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]

### ValuationMethod
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `ValuationMethod` [Builder]
- `getValuationSource()` → `ValuationSource` [Getter]
- `getQuotationAmount()` → `Money` [Getter]
- `getMinimumQuotationAmount()` → `Money` [Getter]
- `getQuotationMethod()` → `QuotationRateTypeEnum` [Getter]
- `getValuationMethod()` → `ValuationMethodEnum` [Getter]
- `getCashCollateralValuationMethod()` → `CashCollateralValuationMethod` [Getter]

### ValuationMethodBuilder
**Implements:** `ValuationMethod` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setValuationMethod(ValuationMethodEnum arg0)` → `ValuationMethodBuilder` [Setter]
- `setValuationSource(ValuationSource arg0)` → `ValuationMethodBuilder` [Setter]
- `getQuotationAmount()` → `MoneyBuilder` [Getter]
- `getMinimumQuotationAmount()` → `MoneyBuilder` [Getter]
- `setMinimumQuotationAmount(Money arg0)` → `ValuationMethodBuilder` [Setter]
- `getOrCreateValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setQuotationAmount(Money arg0)` → `ValuationMethodBuilder` [Setter]
- `setQuotationMethod(QuotationRateTypeEnum arg0)` → `ValuationMethodBuilder` [Setter]
- `getOrCreateQuotationAmount()` → `MoneyBuilder` [Getter]

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
- `getQuotedCurrencyPair()` → `ReferenceWithMetaQuotedCurrencyPair` [Getter]
- `getDealerOrCCP()` → `AncillaryEntity` [Getter]
- `getSettlementRateOption()` → `SettlementRateOption` [Getter]
- `getReferenceBanks()` → `ReferenceBanks` [Getter]
- `getInformationSource()` → `FxSpotRateSource` [Getter]

### ValuationSourceBuilder
**Implements:** `ValuationSource` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getQuotedCurrencyPair()` → `ReferenceWithMetaQuotedCurrencyPairBuilder` [Getter]
- `getOrCreateReferenceBanks()` → `ReferenceBanksBuilder` [Getter]
- `setSettlementRateOption(SettlementRateOption arg0)` → `ValuationSourceBuilder` [Setter]
- `setDealerOrCCP(AncillaryEntity arg0)` → `ValuationSourceBuilder` [Setter]
- `setReferenceBanks(ReferenceBanks arg0)` → `ValuationSourceBuilder` [Setter]
- `getOrCreateDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `getDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `getSettlementRateOption()` → `SettlementRateOptionBuilder` [Getter]
- `getReferenceBanks()` → `ReferenceBanksBuilder` [Getter]
- `getOrCreateSettlementRateOption()` → `SettlementRateOptionBuilder` [Getter]

## Concrete Classes

### BasketBuilderImpl
**Extends:** `AssetBase$AssetBaseBuilderImpl` 
**Implements:** `Basket$BasketBuilder` 

**Fields:**
- `List (List) basketConstituent`

**Key Methods:**
- `build()` → `Basket` [Builder]
- `getBasketConstituent()` → `List` [Getter]
- `setIsExchangeListed(Boolean arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituentValue(List arg0)` → `BasketBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `BasketBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `BasketBuilder` [Setter]
- `setBasketConstituent(List arg0)` → `BasketBuilder` [Setter]
- `setTaxonomy(List arg0)` → `BasketBuilder` [Setter]
- `setIdentifier(List arg0)` → `BasketBuilder` [Setter]
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
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `setBasket(Basket arg0)` → `BasketConstituentBuilder` [Setter]
- `getQuantity()` → `List` [Getter]
- `getOrCreateQuantity(int arg0)` → `ReferenceWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(List arg0)` → `BasketConstituentBuilder` [Setter]
- `setQuantityValue(List arg0)` → `BasketConstituentBuilder` [Setter]

### BasketConstituentImpl
**Extends:** `Observable$ObservableImpl` 
**Implements:** `BasketConstituent` 

**Key Methods:**
- `build()` → `BasketConstituent` [Builder]
- `getInterimValuationPrice()` → `List` [Getter]
- `getFinalValuationPrice()` → `List` [Getter]
- `getInitialValuationPrice()` → `List` [Getter]
- `getQuantity()` → `List` [Getter]
- `setBuilderFields(BasketConstituentBuilder arg0)` → `void` [Setter]

### BasketImpl
**Extends:** `AssetBase$AssetBaseImpl` 
**Implements:** `Basket` 

**Key Methods:**
- `build()` → `Basket` [Builder]
- `getBasketConstituent()` → `List` [Getter]
- `setBuilderFields(BasketBuilder arg0)` → `void` [Setter]

### CalculationAgentBuilderImpl
**Implements:** `CalculationAgent$CalculationAgentBuilder` 

**Fields:**
- `AncillaryRoleEnum calculationAgentParty`
- `PartyDeterminationEnum calculationAgentPartyEnum`
- `FieldWithMetaBusinessCenterEnumBuilder calculationAgentBusinessCenter`

**Key Methods:**
- `build()` → `CalculationAgent` [Builder]
- `getCalculationAgentParty()` → `AncillaryRoleEnum` [Getter]
- `setCalculationAgentParty(AncillaryRoleEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `getOrCreateCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `setCalculationAgentPartyEnum(PartyDeterminationEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentBusinessCenterValue(BusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `setCalculationAgentBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)` → `CalculationAgentBuilder` [Setter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnumBuilder` [Getter]
- `getCalculationAgentPartyEnum()` → `PartyDeterminationEnum` [Getter]

### CalculationAgentImpl
**Implements:** `CalculationAgent` 

**Key Methods:**
- `build()` → `CalculationAgent` [Builder]
- `getCalculationAgentParty()` → `AncillaryRoleEnum` [Getter]
- `setBuilderFields(CalculationAgentBuilder arg0)` → `void` [Setter]
- `getCalculationAgentBusinessCenter()` → `FieldWithMetaBusinessCenterEnum` [Getter]
- `getCalculationAgentPartyEnum()` → `PartyDeterminationEnum` [Getter]

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
- `setProtectedParty(List arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setApplicableCsa(CsaTypeEnum arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRateValue(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setAgreedDiscountRate(FieldWithMetaString arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `setCashCollateralCurrency(String arg0)` → `CashCollateralValuationMethodBuilder` [Setter]
- `getApplicableCsa()` → `CsaTypeEnum` [Getter]
- `getCashCollateralCurrency()` → `String` [Getter]
- `getAgreedDiscountRate()` → `FieldWithMetaStringBuilder` [Getter]
- `getProtectedParty()` → `List` [Getter]

### CashCollateralValuationMethodImpl
**Implements:** `CashCollateralValuationMethod` 

**Key Methods:**
- `build()` → `CashCollateralValuationMethod` [Builder]
- `setBuilderFields(CashCollateralValuationMethodBuilder arg0)` → `void` [Setter]
- `getApplicableCsa()` → `CsaTypeEnum` [Getter]
- `getCashCollateralCurrency()` → `String` [Getter]
- `getAgreedDiscountRate()` → `FieldWithMetaString` [Getter]
- `getProtectedParty()` → `List` [Getter]
- `getCashCollateralInterestRate()` → `FieldWithMetaString` [Getter]
- `getPrescribedDocumentationAdjustment()` → `Boolean` [Getter]

### CashPriceBuilderImpl
**Implements:** `CashPrice$CashPriceBuilder` 

**Fields:**
- `CashPriceTypeEnum cashPriceType`
- `PremiumExpressionBuilder premiumExpression`
- `FeeTypeEnum feeType`

**Key Methods:**
- `build()` → `CashPrice` [Builder]
- `setCashPriceType(CashPriceTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `setPremiumExpression(PremiumExpression arg0)` → `CashPriceBuilder` [Setter]
- `setFeeType(FeeTypeEnum arg0)` → `CashPriceBuilder` [Setter]
- `getCashPriceType()` → `CashPriceTypeEnum` [Getter]
- `getPremiumExpression()` → `PremiumExpressionBuilder` [Getter]
- `getFeeType()` → `FeeTypeEnum` [Getter]
- `getOrCreatePremiumExpression()` → `PremiumExpressionBuilder` [Getter]

### CashPriceImpl
**Implements:** `CashPrice` 

**Key Methods:**
- `build()` → `CashPrice` [Builder]
- `getCashPriceType()` → `CashPriceTypeEnum` [Getter]
- `getPremiumExpression()` → `PremiumExpression` [Getter]
- `setBuilderFields(CashPriceBuilder arg0)` → `void` [Setter]
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
- `setIsExchangeListed(Boolean arg0)` → `CreditIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `CreditIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `CreditIndexBuilder` [Setter]
- `getIndexAnnexSource()` → `FieldWithMetaIndexAnnexSourceEnumBuilder` [Getter]
- `getIndexAnnexDate()` → `Date` [Getter]
- `getSettledEntityMatrix()` → `SettledEntityMatrixBuilder` [Getter]
- `getIndexSeries()` → `Integer` [Getter]
- `getIndexFactor()` → `BigDecimal` [Getter]

### CreditIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `CreditIndex` 

**Key Methods:**
- `build()` → `CreditIndex` [Builder]
- `getIndexAnnexSource()` → `FieldWithMetaIndexAnnexSourceEnum` [Getter]
- `getIndexAnnexDate()` → `Date` [Getter]
- `getSettledEntityMatrix()` → `SettledEntityMatrix` [Getter]
- `getIndexSeries()` → `Integer` [Getter]
- `getIndexFactor()` → `BigDecimal` [Getter]
- `getExcludedReferenceEntity()` → `List` [Getter]
- `getIndexAnnexVersion()` → `Integer` [Getter]
- `getSeniority()` → `CreditSeniorityEnum` [Getter]
- `setBuilderFields(CreditIndexBuilder arg0)` → `void` [Setter]

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
- `getDebt()` → `CreditRatingDebtBuilder` [Getter]
- `getAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getScale()` → `FieldWithMetaStringBuilder` [Getter]
- `getOutlook()` → `CreditRatingOutlookEnum` [Getter]
- `setAgency(CreditRatingAgencyEnum arg0)` → `CreditNotationBuilder` [Setter]
- `setOutlook(CreditRatingOutlookEnum arg0)` → `CreditNotationBuilder` [Setter]
- `setDebt(CreditRatingDebt arg0)` → `CreditNotationBuilder` [Setter]
- `getCreditWatch()` → `CreditRatingCreditWatchEnum` [Getter]

### CreditNotationImpl
**Implements:** `CreditNotation` 

**Key Methods:**
- `build()` → `CreditNotation` [Builder]
- `setBuilderFields(CreditNotationBuilder arg0)` → `void` [Setter]
- `getDebt()` → `CreditRatingDebt` [Getter]
- `getAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getScale()` → `FieldWithMetaString` [Getter]
- `getOutlook()` → `CreditRatingOutlookEnum` [Getter]
- `getCreditWatch()` → `CreditRatingCreditWatchEnum` [Getter]
- `getNotation()` → `FieldWithMetaString` [Getter]

### CreditNotationsBuilderImpl
**Implements:** `CreditNotations$CreditNotationsBuilder` 

**Fields:**
- `CreditNotationBuilder creditNotation`
- `MultipleCreditNotationsBuilder creditNotations`

**Key Methods:**
- `build()` → `CreditNotations` [Builder]
- `getCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]
- `getOrCreateCreditNotations()` → `MultipleCreditNotationsBuilder` [Getter]
- `setCreditNotations(MultipleCreditNotations arg0)` → `CreditNotationsBuilder` [Setter]
- `setCreditNotation(CreditNotation arg0)` → `CreditNotationsBuilder` [Setter]
- `getOrCreateCreditNotation()` → `CreditNotationBuilder` [Getter]
- `getCreditNotation()` → `CreditNotationBuilder` [Getter]

### CreditNotationsImpl
**Implements:** `CreditNotations` 

**Key Methods:**
- `build()` → `CreditNotations` [Builder]
- `setBuilderFields(CreditNotationsBuilder arg0)` → `void` [Setter]
- `getCreditNotations()` → `MultipleCreditNotations` [Getter]
- `getCreditNotation()` → `CreditNotation` [Getter]

### CreditRatingDebtBuilderImpl
**Implements:** `CreditRatingDebt$CreditRatingDebtBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder debtType`
- `MultipleDebtTypesBuilder debtTypes`

**Key Methods:**
- `build()` → `CreditRatingDebt` [Builder]
- `getOrCreateDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(FieldWithMetaString arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getDebtType()` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtTypes(MultipleDebtTypes arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]
- `setDebtTypeValue(String arg0)` → `CreditRatingDebtBuilder` [Setter]
- `getOrCreateDebtTypes()` → `MultipleDebtTypesBuilder` [Getter]

### CreditRatingDebtImpl
**Implements:** `CreditRatingDebt` 

**Key Methods:**
- `build()` → `CreditRatingDebt` [Builder]
- `getDebtType()` → `FieldWithMetaString` [Getter]
- `setBuilderFields(CreditRatingDebtBuilder arg0)` → `void` [Setter]
- `getDebtTypes()` → `MultipleDebtTypes` [Getter]

### CurveBuilderImpl
**Implements:** `Curve$CurveBuilder` 

**Fields:**
- `InterestRateCurveBuilder interestRateCurve`
- `FieldWithMetaCommodityReferencePriceEnumBuilder commodityCurve`

**Key Methods:**
- `build()` → `Curve` [Builder]
- `getOrCreateInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]
- `setInterestRateCurve(InterestRateCurve arg0)` → `CurveBuilder` [Setter]
- `setCommodityCurveValue(CommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]
- `getInterestRateCurve()` → `InterestRateCurveBuilder` [Getter]
- `getOrCreateCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnumBuilder` [Getter]
- `setCommodityCurve(FieldWithMetaCommodityReferencePriceEnum arg0)` → `CurveBuilder` [Setter]

### CurveImpl
**Implements:** `Curve` 

**Key Methods:**
- `build()` → `Curve` [Builder]
- `setBuilderFields(CurveBuilder arg0)` → `void` [Setter]
- `getInterestRateCurve()` → `InterestRateCurve` [Getter]
- `getCommodityCurve()` → `FieldWithMetaCommodityReferencePriceEnum` [Getter]

### DividendApplicabilityBuilderImpl
**Implements:** `DividendApplicability$DividendApplicabilityBuilder` 

**Fields:**
- `Boolean optionsExchangeDividends`
- `Boolean additionalDividends`
- `Boolean allDividends`

**Key Methods:**
- `build()` → `DividendApplicability` [Builder]
- `getOptionsExchangeDividends()` → `Boolean` [Getter]
- `getAllDividends()` → `Boolean` [Getter]
- `getAdditionalDividends()` → `Boolean` [Getter]
- `setOptionsExchangeDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setAdditionalDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]
- `setAllDividends(Boolean arg0)` → `DividendApplicabilityBuilder` [Setter]

### DividendApplicabilityImpl
**Implements:** `DividendApplicability` 

**Key Methods:**
- `build()` → `DividendApplicability` [Builder]
- `setBuilderFields(DividendApplicabilityBuilder arg0)` → `void` [Setter]
- `getOptionsExchangeDividends()` → `Boolean` [Getter]
- `getAllDividends()` → `Boolean` [Getter]
- `getAdditionalDividends()` → `Boolean` [Getter]

### EquityIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `EquityIndex$EquityIndexBuilder` 

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `EquityIndexBuilder` [Setter]
- `build()` → `EquityIndex` [Builder]
- `setIsExchangeListed(Boolean arg0)` → `EquityIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `EquityIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `EquityIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `EquityIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `EquityIndexBuilder` [Setter]
- `setIdentifier(List arg0)` → `EquityIndexBuilder` [Setter]
- `setNameValue(String arg0)` → `EquityIndexBuilder` [Setter]

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
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getFallbackSurveyValuationPostponement()` → `Boolean` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `getOrCreateFallBackSettlementRateOption(int arg0)` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getOrCreateCalculationAgentDetermination()` → `CalculationAgentBuilder` [Getter]
- `setFallBackSettlementRateOptionValue(List arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `setCalculationAgentDetermination(CalculationAgent arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `setFallBackSettlementRateOption(List arg0)` → `FallbackReferencePriceBuilder` [Setter]
- `setFallbackSurveyValuationPostponement(Boolean arg0)` → `FallbackReferencePriceBuilder` [Setter]

### FallbackReferencePriceImpl
**Implements:** `FallbackReferencePrice` 

**Key Methods:**
- `build()` → `FallbackReferencePrice` [Builder]
- `setBuilderFields(FallbackReferencePriceBuilder arg0)` → `void` [Setter]
- `getFallBackSettlementRateOption()` → `List` [Getter]
- `getFallbackSurveyValuationPostponement()` → `Boolean` [Getter]
- `getCalculationAgentDetermination()` → `CalculationAgent` [Getter]
- `getValuationPostponement()` → `ValuationPostponement` [Getter]

### FloatingRateIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `FloatingRateIndex$FloatingRateIndexBuilder` 

**Fields:**
- `FieldWithMetaFloatingRateIndexEnumBuilder floatingRateIndex`
- `PeriodBuilder indexTenor`

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `FloatingRateIndexBuilder` [Setter]
- `build()` → `FloatingRateIndex` [Builder]
- `setIsExchangeListed(Boolean arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `FloatingRateIndexBuilder` [Setter]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `FloatingRateIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `FloatingRateIndexBuilder` [Setter]

### FloatingRateIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `FloatingRateIndex` 

**Key Methods:**
- `build()` → `FloatingRateIndex` [Builder]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `setBuilderFields(FloatingRateIndexBuilder arg0)` → `void` [Setter]

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
- `setIsExchangeListed(Boolean arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPairBuilder` [Getter]
- `getPrimaryFxSpotRateSource()` → `InformationSourceBuilder` [Getter]
- `setTaxonomy(List arg0)` → `ForeignExchangeRateIndexBuilder` [Setter]

### ForeignExchangeRateIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `ForeignExchangeRateIndex` 

**Key Methods:**
- `build()` → `ForeignExchangeRateIndex` [Builder]
- `getQuotedCurrencyPair()` → `FieldWithMetaQuotedCurrencyPair` [Getter]
- `getPrimaryFxSpotRateSource()` → `InformationSource` [Getter]
- `setBuilderFields(ForeignExchangeRateIndexBuilder arg0)` → `void` [Setter]
- `getSecondaryFxSpotRateSource()` → `InformationSource` [Getter]

### FxInformationSourceBuilderImpl
**Extends:** `InformationSource$InformationSourceBuilderImpl` 
**Implements:** `FxInformationSource$FxInformationSourceBuilder` 

**Fields:**
- `BusinessCenterTimeBuilder fixingTime`

**Key Methods:**
- `build()` → `FxInformationSource` [Builder]
- `setSourcePage(FieldWithMetaString arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourceProviderValue(InformationProviderEnum arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePageValue(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setSourcePageHeading(String arg0)` → `FxInformationSourceBuilder` [Setter]
- `setFixingTime(BusinessCenterTime arg0)` → `FxInformationSourceBuilder` [Setter]
- `getFixingTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getOrCreateFixingTime()` → `BusinessCenterTimeBuilder` [Getter]

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
- `getRate()` → `BigDecimal` [Getter]
- `setRate(BigDecimal arg0)` → `FxRateBuilder` [Setter]
- `getOrCreateQuotedCurrencyPair()` → `QuotedCurrencyPairBuilder` [Getter]
- `setQuotedCurrencyPair(QuotedCurrencyPair arg0)` → `FxRateBuilder` [Setter]

### FxRateImpl
**Implements:** `FxRate` 

**Key Methods:**
- `build()` → `FxRate` [Builder]
- `getQuotedCurrencyPair()` → `QuotedCurrencyPair` [Getter]
- `setBuilderFields(FxRateBuilder arg0)` → `void` [Setter]
- `getRate()` → `BigDecimal` [Getter]

### FxRateSourceFixingBuilderImpl
**Implements:** `FxRateSourceFixing$FxRateSourceFixingBuilder` 

**Fields:**
- `FxSettlementRateSourceBuilder settlementRateSource`
- `AdjustableDateBuilder fixingDate`

**Key Methods:**
- `build()` → `FxRateSourceFixing` [Builder]
- `getOrCreateSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]
- `getOrCreateFixingDate()` → `AdjustableDateBuilder` [Getter]
- `getSettlementRateSource()` → `FxSettlementRateSourceBuilder` [Getter]
- `getFixingDate()` → `AdjustableDateBuilder` [Getter]
- `setSettlementRateSource(FxSettlementRateSource arg0)` → `FxRateSourceFixingBuilder` [Setter]
- `setFixingDate(AdjustableDate arg0)` → `FxRateSourceFixingBuilder` [Setter]

### FxRateSourceFixingImpl
**Implements:** `FxRateSourceFixing` 

**Key Methods:**
- `build()` → `FxRateSourceFixing` [Builder]
- `setBuilderFields(FxRateSourceFixingBuilder arg0)` → `void` [Setter]
- `getSettlementRateSource()` → `FxSettlementRateSource` [Getter]
- `getFixingDate()` → `AdjustableDate` [Getter]

### FxSettlementRateSourceBuilderImpl
**Implements:** `FxSettlementRateSource$FxSettlementRateSourceBuilder` 

**Fields:**
- `FieldWithMetaStringBuilder settlementRateOption`
- `FxInformationSourceBuilder nonstandardSettlementRate`

**Key Methods:**
- `build()` → `FxSettlementRateSource` [Builder]
- `setSettlementRateOption(FieldWithMetaString arg0)` → `FxSettlementRateSourceBuilder` [Setter]
- `getSettlementRateOption()` → `FieldWithMetaStringBuilder` [Getter]
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
- `getSecondarySource()` → `InformationSourceBuilder` [Getter]
- `getPrimarySource()` → `InformationSourceBuilder` [Getter]
- `getOrCreatePrimarySource()` → `InformationSourceBuilder` [Getter]
- `getOrCreateSecondarySource()` → `InformationSourceBuilder` [Getter]
- `setSecondarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]
- `setPrimarySource(InformationSource arg0)` → `FxSpotRateSourceBuilder` [Setter]

### FxSpotRateSourceImpl
**Implements:** `FxSpotRateSource` 

**Key Methods:**
- `build()` → `FxSpotRateSource` [Builder]
- `getSecondarySource()` → `InformationSource` [Getter]
- `setBuilderFields(FxSpotRateSourceBuilder arg0)` → `void` [Setter]
- `getPrimarySource()` → `InformationSource` [Getter]

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
- `setIsExchangeListed(Boolean arg0)` → `IndexBaseBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `IndexBaseBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `IndexBaseBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `IndexBaseBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `IndexBaseBuilder` [Setter]
- `getAssetClass()` → `AssetClassEnum` [Getter]

### IndexBaseImpl
**Extends:** `AssetBase$AssetBaseImpl` 
**Implements:** `IndexBase` 

**Key Methods:**
- `getName()` → `FieldWithMetaString` [Getter]
- `build()` → `IndexBase` [Builder]
- `getProvider()` → `LegalEntity` [Getter]
- `getAssetClass()` → `AssetClassEnum` [Getter]
- `setBuilderFields(IndexBaseBuilder arg0)` → `void` [Setter]

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
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndexBuilder` [Getter]
- `setInterestRateIndexValue(InterestRateIndex arg0)` → `IndexBuilder` [Setter]
- `getEquityIndex()` → `EquityIndexBuilder` [Getter]
- `getOtherIndex()` → `OtherIndexBuilder` [Getter]
- `getCreditIndex()` → `CreditIndexBuilder` [Getter]
- `setCreditIndex(CreditIndex arg0)` → `IndexBuilder` [Setter]
- `setInterestRateIndex(FieldWithMetaInterestRateIndex arg0)` → `IndexBuilder` [Setter]
- `setOtherIndex(OtherIndex arg0)` → `IndexBuilder` [Setter]
- `getOrCreateEquityIndex()` → `EquityIndexBuilder` [Getter]

### IndexImpl
**Implements:** `Index` 

**Key Methods:**
- `build()` → `Index` [Builder]
- `getInterestRateIndex()` → `FieldWithMetaInterestRateIndex` [Getter]
- `getEquityIndex()` → `EquityIndex` [Getter]
- `getOtherIndex()` → `OtherIndex` [Getter]
- `getCreditIndex()` → `CreditIndex` [Getter]
- `setBuilderFields(IndexBuilder arg0)` → `void` [Setter]
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
- `setIsExchangeListed(Boolean arg0)` → `InflationIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `InflationIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `InflationIndexBuilder` [Setter]
- `getInflationRateIndex()` → `FieldWithMetaInflationRateIndexEnumBuilder` [Getter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setProvider(LegalEntity arg0)` → `InflationIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `InflationIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `InflationIndexBuilder` [Setter]

### InflationIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `InflationIndex` 

**Key Methods:**
- `build()` → `InflationIndex` [Builder]
- `getInflationRateIndex()` → `FieldWithMetaInflationRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `setBuilderFields(InflationIndexBuilder arg0)` → `void` [Setter]

### InformationSourceBuilderImpl
**Implements:** `InformationSource$InformationSourceBuilder` 

**Fields:**
- `FieldWithMetaInformationProviderEnumBuilder sourceProvider`
- `FieldWithMetaStringBuilder sourcePage`
- `String sourcePageHeading`

**Key Methods:**
- `build()` → `InformationSource` [Builder]
- `getSourcePageHeading()` → `String` [Getter]
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]
- `getSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateSourcePage()` → `FieldWithMetaStringBuilder` [Getter]
- `setSourcePage(FieldWithMetaString arg0)` → `InformationSourceBuilder` [Setter]
- `setSourceProvider(FieldWithMetaInformationProviderEnum arg0)` → `InformationSourceBuilder` [Setter]
- `setSourceProviderValue(InformationProviderEnum arg0)` → `InformationSourceBuilder` [Setter]
- `setSourcePageValue(String arg0)` → `InformationSourceBuilder` [Setter]
- `getOrCreateSourceProvider()` → `FieldWithMetaInformationProviderEnumBuilder` [Getter]

### InformationSourceImpl
**Implements:** `InformationSource` 

**Key Methods:**
- `build()` → `InformationSource` [Builder]
- `getSourcePageHeading()` → `String` [Getter]
- `getSourceProvider()` → `FieldWithMetaInformationProviderEnum` [Getter]
- `getSourcePage()` → `FieldWithMetaString` [Getter]
- `setBuilderFields(InformationSourceBuilder arg0)` → `void` [Setter]

### InterestRateCurveBuilderImpl
**Implements:** `InterestRateCurve$InterestRateCurveBuilder` 

**Fields:**
- `FieldWithMetaFloatingRateIndexEnumBuilder floatingRateIndex`
- `PeriodBuilder tenor`

**Key Methods:**
- `build()` → `InterestRateCurve` [Builder]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndex(FieldWithMetaFloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getTenor()` → `PeriodBuilder` [Getter]
- `setTenor(Period arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnumBuilder` [Getter]
- `setFloatingRateIndexValue(FloatingRateIndexEnum arg0)` → `InterestRateCurveBuilder` [Setter]
- `getOrCreateTenor()` → `PeriodBuilder` [Getter]

### InterestRateCurveImpl
**Implements:** `InterestRateCurve` 

**Key Methods:**
- `build()` → `InterestRateCurve` [Builder]
- `getFloatingRateIndex()` → `FieldWithMetaFloatingRateIndexEnum` [Getter]
- `setBuilderFields(InterestRateCurveBuilder arg0)` → `void` [Setter]
- `getTenor()` → `Period` [Getter]

### InterestRateIndexBuilderImpl
**Implements:** `InterestRateIndex$InterestRateIndexBuilder` 

**Fields:**
- `FloatingRateIndexBuilder floatingRateIndex`
- `InflationIndexBuilder inflationIndex`

**Key Methods:**
- `build()` → `InterestRateIndex` [Builder]
- `getOrCreateInflationIndex()` → `InflationIndexBuilder` [Getter]
- `getFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]
- `setInflationIndex(InflationIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `setFloatingRateIndex(FloatingRateIndex arg0)` → `InterestRateIndexBuilder` [Setter]
- `getInflationIndex()` → `InflationIndexBuilder` [Getter]
- `getOrCreateFloatingRateIndex()` → `FloatingRateIndexBuilder` [Getter]

### InterestRateIndexImpl
**Implements:** `InterestRateIndex` 

**Key Methods:**
- `build()` → `InterestRateIndex` [Builder]
- `getFloatingRateIndex()` → `FloatingRateIndex` [Getter]
- `getInflationIndex()` → `InflationIndex` [Getter]
- `setBuilderFields(InterestRateIndexBuilder arg0)` → `void` [Setter]

### MakeWholeAmountBuilderImpl
**Extends:** `SwapCurveValuation$SwapCurveValuationBuilderImpl` 
**Implements:** `MakeWholeAmount$MakeWholeAmountBuilder` 

**Fields:**
- `InterpolationMethodEnum interpolationMethod`
- `FieldWithMetaDateBuilder earlyCallDate`

**Key Methods:**
- `build()` → `MakeWholeAmount` [Builder]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setSide(QuotationSideEnum arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setEarlyCallDate(FieldWithMetaDate arg0)` → `MakeWholeAmountBuilder` [Setter]
- `setEarlyCallDateValue(Date arg0)` → `MakeWholeAmountBuilder` [Setter]
- `getEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `getOrCreateEarlyCallDate()` → `FieldWithMetaDateBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `MakeWholeAmountBuilder` [Setter]
- `getInterpolationMethod()` → `InterpolationMethodEnum` [Getter]
- `setInterpolationMethod(InterpolationMethodEnum arg0)` → `MakeWholeAmountBuilder` [Setter]

### MakeWholeAmountImpl
**Extends:** `SwapCurveValuation$SwapCurveValuationImpl` 
**Implements:** `MakeWholeAmount` 

**Key Methods:**
- `build()` → `MakeWholeAmount` [Builder]
- `setBuilderFields(MakeWholeAmountBuilder arg0)` → `void` [Setter]
- `getEarlyCallDate()` → `FieldWithMetaDate` [Getter]
- `getInterpolationMethod()` → `InterpolationMethodEnum` [Getter]

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
- `setDatedValue(List arg0)` → `MoneyBuilder` [Setter]
- `setFrequency(Frequency arg0)` → `MoneyBuilder` [Setter]
- `setUnit(UnitType arg0)` → `MoneyBuilder` [Setter]
- `setMeta(MetaFields arg0)` → `MoneyBuilder` [Setter]
- `getMeta()` → `MetaFieldsBuilder` [Getter]

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
- `getReferenceAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getMismatchResolution()` → `CreditNotationMismatchResolutionEnum` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]
- `setCreditNotation(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `getOrCreateCreditNotation(int arg0)` → `FieldWithMetaCreditNotationBuilder` [Getter]
- `getCreditNotation()` → `List` [Getter]
- `setMismatchResolution(CreditNotationMismatchResolutionEnum arg0)` → `MultipleCreditNotationsBuilder` [Setter]
- `setCreditNotationValue(List arg0)` → `MultipleCreditNotationsBuilder` [Setter]

### MultipleCreditNotationsImpl
**Implements:** `MultipleCreditNotations` 

**Key Methods:**
- `build()` → `MultipleCreditNotations` [Builder]
- `setBuilderFields(MultipleCreditNotationsBuilder arg0)` → `void` [Setter]
- `getReferenceAgency()` → `CreditRatingAgencyEnum` [Getter]
- `getMismatchResolution()` → `CreditNotationMismatchResolutionEnum` [Getter]
- `getCondition()` → `QuantifierEnum` [Getter]
- `getCreditNotation()` → `List` [Getter]

### MultipleDebtTypesBuilderImpl
**Implements:** `MultipleDebtTypes$MultipleDebtTypesBuilder` 

**Fields:**
- `QuantifierEnum condition`
- `List (List) debtType`

**Key Methods:**
- `build()` → `MultipleDebtTypes` [Builder]
- `getOrCreateDebtType(int arg0)` → `FieldWithMetaStringBuilder` [Getter]
- `setDebtType(List arg0)` → `MultipleDebtTypesBuilder` [Setter]
- `getDebtType()` → `List` [Getter]
- `setCondition(QuantifierEnum arg0)` → `MultipleDebtTypesBuilder` [Setter]
- `getCondition()` → `QuantifierEnum` [Getter]
- `setDebtTypeValue(List arg0)` → `MultipleDebtTypesBuilder` [Setter]

### MultipleDebtTypesImpl
**Implements:** `MultipleDebtTypes` 

**Key Methods:**
- `build()` → `MultipleDebtTypes` [Builder]
- `getDebtType()` → `List` [Getter]
- `setBuilderFields(MultipleDebtTypesBuilder arg0)` → `void` [Setter]
- `getCondition()` → `QuantifierEnum` [Getter]

### MultipleValuationDatesBuilderImpl
**Extends:** `SingleValuationDate$SingleValuationDateBuilderImpl` 
**Implements:** `MultipleValuationDates$MultipleValuationDatesBuilder` 

**Fields:**
- `Integer businessDaysThereafter`
- `Integer numberValuationDates`

**Key Methods:**
- `build()` → `MultipleValuationDates` [Builder]
- `getNumberValuationDates()` → `Integer` [Getter]
- `getBusinessDaysThereafter()` → `Integer` [Getter]
- `setBusinessDays(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]
- `setNumberValuationDates(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]
- `setBusinessDaysThereafter(Integer arg0)` → `MultipleValuationDatesBuilder` [Setter]

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
- `getOrCreateIndex()` → `IndexBuilder` [Getter]
- `getOrCreateBasket()` → `BasketBuilder` [Getter]
- `setBasket(Basket arg0)` → `ObservableBuilder` [Setter]
- `getOrCreateAsset()` → `AssetBuilder` [Getter]
- `getBasket()` → `BasketBuilder` [Getter]
- `setAsset(Asset arg0)` → `ObservableBuilder` [Setter]
- `getAsset()` → `AssetBuilder` [Getter]

### ObservableImpl
**Implements:** `Observable` 

**Key Methods:**
- `getIndex()` → `Index` [Getter]
- `build()` → `Observable` [Builder]
- `setBuilderFields(ObservableBuilder arg0)` → `void` [Setter]
- `getBasket()` → `Basket` [Getter]
- `getAsset()` → `Asset` [Getter]

### OtherIndexBuilderImpl
**Extends:** `IndexBase$IndexBaseBuilderImpl` 
**Implements:** `OtherIndex$OtherIndexBuilder` 

**Fields:**
- `String description`

**Key Methods:**
- `setName(FieldWithMetaString arg0)` → `OtherIndexBuilder` [Setter]
- `build()` → `OtherIndex` [Builder]
- `setIsExchangeListed(Boolean arg0)` → `OtherIndexBuilder` [Setter]
- `setRelatedExchange(List arg0)` → `OtherIndexBuilder` [Setter]
- `setExchange(LegalEntity arg0)` → `OtherIndexBuilder` [Setter]
- `setProvider(LegalEntity arg0)` → `OtherIndexBuilder` [Setter]
- `setAssetClass(AssetClassEnum arg0)` → `OtherIndexBuilder` [Setter]
- `setTaxonomy(List arg0)` → `OtherIndexBuilder` [Setter]
- `getDescription()` → `String` [Getter]
- `setDescription(String arg0)` → `OtherIndexBuilder` [Setter]

### OtherIndexImpl
**Extends:** `IndexBase$IndexBaseImpl` 
**Implements:** `OtherIndex` 

**Key Methods:**
- `build()` → `OtherIndex` [Builder]
- `getDescription()` → `String` [Getter]
- `setBuilderFields(OtherIndexBuilder arg0)` → `void` [Setter]

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
- `getValuationTime()` → `BusinessCenterTimeBuilder` [Getter]
- `getValuationTimeType()` → `TimeTypeEnum` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `setDeterminationMethod(DeterminationMethodEnum arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `setValuationDates(AdjustableRelativeOrPeriodicDates arg0)` → `PerformanceValuationDatesBuilder` [Setter]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDatesBuilder` [Getter]
- `getOrCreateValuationDate()` → `AdjustableOrRelativeDateBuilder` [Getter]

### PerformanceValuationDatesImpl
**Implements:** `PerformanceValuationDates` 

**Key Methods:**
- `build()` → `PerformanceValuationDates` [Builder]
- `setBuilderFields(PerformanceValuationDatesBuilder arg0)` → `void` [Setter]
- `getValuationTime()` → `BusinessCenterTime` [Getter]
- `getValuationTimeType()` → `TimeTypeEnum` [Getter]
- `getValuationDate()` → `AdjustableOrRelativeDate` [Getter]
- `getDeterminationMethod()` → `DeterminationMethodEnum` [Getter]
- `getValuationDates()` → `AdjustableRelativeOrPeriodicDates` [Getter]
- `getMeta()` → `MetaFields` [Getter]

### PremiumExpressionBuilderImpl
**Implements:** `PremiumExpression$PremiumExpressionBuilder` 

**Fields:**
- `PremiumTypeEnum premiumType`
- `MoneyBuilder pricePerOption`
- `BigDecimal percentageOfNotional`

**Key Methods:**
- `build()` → `PremiumExpression` [Builder]
- `getPercentageOfNotional()` → `BigDecimal` [Getter]
- `getOrCreatePricePerOption()` → `MoneyBuilder` [Getter]
- `getPricePerOption()` → `MoneyBuilder` [Getter]
- `setPremiumType(PremiumTypeEnum arg0)` → `PremiumExpressionBuilder` [Setter]
- `setPricePerOption(Money arg0)` → `PremiumExpressionBuilder` [Setter]
- `getPremiumType()` → `PremiumTypeEnum` [Getter]
- `setPercentageOfNotional(BigDecimal arg0)` → `PremiumExpressionBuilder` [Setter]

### PremiumExpressionImpl
**Implements:** `PremiumExpression` 

**Key Methods:**
- `build()` → `PremiumExpression` [Builder]
- `getPercentageOfNotional()` → `BigDecimal` [Getter]
- `getPricePerOption()` → `Money` [Getter]
- `getPremiumType()` → `PremiumTypeEnum` [Getter]
- `setBuilderFields(PremiumExpressionBuilder arg0)` → `void` [Setter]

### PriceBuilderImpl
**Extends:** `PriceSchedule$PriceScheduleBuilderImpl` 
**Implements:** `Price$PriceBuilder` 

**Key Methods:**
- `setValue(BigDecimal arg0)` → `PriceBuilder` [Setter]
- `build()` → `Price` [Builder]
- `setPerUnitOf(UnitType arg0)` → `PriceBuilder` [Setter]
- `setPriceType(PriceTypeEnum arg0)` → `PriceBuilder` [Setter]
- `setCashPrice(CashPrice arg0)` → `PriceBuilder` [Setter]
- `setDatedValue(List arg0)` → `PriceBuilder` [Setter]
- `setComposite(PriceComposite arg0)` → `PriceBuilder` [Setter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceBuilder` [Setter]
- `setPriceExpression(PriceExpressionEnum arg0)` → `PriceBuilder` [Setter]
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
- `setOperandType(PriceOperandEnum arg0)` → `PriceCompositeBuilder` [Setter]
- `setBaseValue(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]
- `setOperand(BigDecimal arg0)` → `PriceCompositeBuilder` [Setter]
- `getBaseValue()` → `BigDecimal` [Getter]
- `getOperandType()` → `PriceOperandEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `setArithmeticOperator(ArithmeticOperationEnum arg0)` → `PriceCompositeBuilder` [Setter]
- `getOperand()` → `BigDecimal` [Getter]

### PriceCompositeImpl
**Implements:** `PriceComposite` 

**Key Methods:**
- `build()` → `PriceComposite` [Builder]
- `getBaseValue()` → `BigDecimal` [Getter]
- `getOperandType()` → `PriceOperandEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `setBuilderFields(PriceCompositeBuilder arg0)` → `void` [Setter]
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
- `getOrCreatePrice(int arg0)` → `FieldWithMetaPriceScheduleBuilder` [Getter]
- `getOrCreateObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `setEffectiveDate(AdjustableOrRelativeDate arg0)` → `PriceQuantityBuilder` [Setter]
- `getOrCreateEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]
- `getObservable()` → `FieldWithMetaObservableBuilder` [Getter]
- `getQuantity()` → `List` [Getter]
- `getOrCreateQuantity(int arg0)` → `FieldWithMetaNonNegativeQuantityScheduleBuilder` [Getter]
- `setQuantity(List arg0)` → `PriceQuantityBuilder` [Setter]
- `getEffectiveDate()` → `AdjustableOrRelativeDateBuilder` [Getter]

### PriceQuantityImpl
**Implements:** `PriceQuantity` 

**Key Methods:**
- `build()` → `PriceQuantity` [Builder]
- `getObservable()` → `FieldWithMetaObservable` [Getter]
- `getQuantity()` → `List` [Getter]
- `getEffectiveDate()` → `AdjustableOrRelativeDate` [Getter]
- `setBuilderFields(PriceQuantityBuilder arg0)` → `void` [Setter]
- `getPrice()` → `List` [Getter]
- `getMeta()` → `MetaFields` [Getter]

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
- `getOrCreateCashPrice()` → `CashPriceBuilder` [Getter]
- `getOrCreatePerUnitOf()` → `UnitTypeBuilder` [Getter]
- `getOrCreateComposite()` → `PriceCompositeBuilder` [Getter]
- `getPerUnitOf()` → `UnitTypeBuilder` [Getter]
- `getComposite()` → `PriceCompositeBuilder` [Getter]
- `getCashPrice()` → `CashPriceBuilder` [Getter]
- `getPriceType()` → `PriceTypeEnum` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]

### PriceScheduleImpl
**Extends:** `MeasureSchedule$MeasureScheduleImpl` 
**Implements:** `PriceSchedule` 

**Key Methods:**
- `build()` → `PriceSchedule` [Builder]
- `getPerUnitOf()` → `UnitType` [Getter]
- `getComposite()` → `PriceComposite` [Getter]
- `getCashPrice()` → `CashPrice` [Getter]
- `getPriceType()` → `PriceTypeEnum` [Getter]
- `getPriceExpression()` → `PriceExpressionEnum` [Getter]
- `getArithmeticOperator()` → `ArithmeticOperationEnum` [Getter]
- `setBuilderFields(PriceScheduleBuilder arg0)` → `void` [Setter]

### PriceSourceDisruptionBuilderImpl
**Implements:** `PriceSourceDisruption$PriceSourceDisruptionBuilder` 

**Fields:**
- `FallbackReferencePriceBuilder fallbackReferencePrice`

**Key Methods:**
- `build()` → `PriceSourceDisruption` [Builder]
- `getFallbackReferencePrice()` → `FallbackReferencePriceBuilder` [Getter]
- `setFallbackReferencePrice(FallbackReferencePrice arg0)` → `PriceSourceDisruptionBuilder` [Setter]
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
- `getOrCreateCurrency1()` → `FieldWithMetaStringBuilder` [Getter]
- `getOrCreateCurrency2()` → `FieldWithMetaStringBuilder` [Getter]
- `setCurrency1(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency1Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency2Value(String arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setCurrency2(FieldWithMetaString arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `setQuoteBasis(QuoteBasisEnum arg0)` → `QuotedCurrencyPairBuilder` [Setter]
- `getCurrency1()` → `FieldWithMetaStringBuilder` [Getter]
- `getCurrency2()` → `FieldWithMetaStringBuilder` [Getter]

### QuotedCurrencyPairImpl
**Implements:** `QuotedCurrencyPair` 

**Key Methods:**
- `build()` → `QuotedCurrencyPair` [Builder]
- `setBuilderFields(QuotedCurrencyPairBuilder arg0)` → `void` [Setter]
- `getCurrency1()` → `FieldWithMetaString` [Getter]
- `getCurrency2()` → `FieldWithMetaString` [Getter]
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
- `getResetDate()` → `Date` [Getter]
- `getOrCreateMeta()` → `MetaFieldsBuilder` [Getter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `setForecastRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `getTreatedRate()` → `BigDecimal` [Getter]
- `getRateReference()` → `ReferenceWithMetaRateObservationBuilder` [Getter]
- `setTreatedForecastRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]
- `getObservedRate()` → `BigDecimal` [Getter]
- `setObservedRate(BigDecimal arg0)` → `RateObservationBuilder` [Setter]

### RateObservationImpl
**Implements:** `RateObservation` 

**Key Methods:**
- `build()` → `RateObservation` [Builder]
- `getResetDate()` → `Date` [Getter]
- `setBuilderFields(RateObservationBuilder arg0)` → `void` [Setter]
- `getForecastRate()` → `BigDecimal` [Getter]
- `getTreatedRate()` → `BigDecimal` [Getter]
- `getRateReference()` → `ReferenceWithMetaRateObservation` [Getter]
- `getObservedRate()` → `BigDecimal` [Getter]
- `getObservationWeight()` → `Integer` [Getter]
- `getAdjustedFixingDate()` → `Date` [Getter]
- `getTreatedForecastRate()` → `BigDecimal` [Getter]

### ReferenceSwapCurveBuilderImpl
**Implements:** `ReferenceSwapCurve$ReferenceSwapCurveBuilder` 

**Fields:**
- `SwapCurveValuationBuilder swapUnwindValue`
- `MakeWholeAmountBuilder makeWholeAmount`

**Key Methods:**
- `build()` → `ReferenceSwapCurve` [Builder]
- `getOrCreateMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]
- `setSwapUnwindValue(SwapCurveValuation arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `setMakeWholeAmount(MakeWholeAmount arg0)` → `ReferenceSwapCurveBuilder` [Setter]
- `getOrCreateSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]
- `getSwapUnwindValue()` → `SwapCurveValuationBuilder` [Getter]
- `getMakeWholeAmount()` → `MakeWholeAmountBuilder` [Getter]

### ReferenceSwapCurveImpl
**Implements:** `ReferenceSwapCurve` 

**Key Methods:**
- `build()` → `ReferenceSwapCurve` [Builder]
- `setBuilderFields(ReferenceSwapCurveBuilder arg0)` → `void` [Setter]
- `getSwapUnwindValue()` → `SwapCurveValuation` [Getter]
- `getMakeWholeAmount()` → `MakeWholeAmount` [Getter]

### SettlementRateOptionBuilderImpl
**Implements:** `SettlementRateOption$SettlementRateOptionBuilder` 

**Fields:**
- `FieldWithMetaSettlementRateOptionEnumBuilder settlementRateOption`
- `PriceSourceDisruptionBuilder priceSourceDisruption`

**Key Methods:**
- `build()` → `SettlementRateOption` [Builder]
- `setSettlementRateOption(FieldWithMetaSettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]
- `setPriceSourceDisruption(PriceSourceDisruption arg0)` → `SettlementRateOptionBuilder` [Setter]
- `getPriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getOrCreateSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnumBuilder` [Getter]
- `getOrCreatePriceSourceDisruption()` → `PriceSourceDisruptionBuilder` [Getter]
- `setSettlementRateOptionValue(SettlementRateOptionEnum arg0)` → `SettlementRateOptionBuilder` [Setter]

### SettlementRateOptionImpl
**Implements:** `SettlementRateOption` 

**Key Methods:**
- `build()` → `SettlementRateOption` [Builder]
- `setBuilderFields(SettlementRateOptionBuilder arg0)` → `void` [Setter]
- `getPriceSourceDisruption()` → `PriceSourceDisruption` [Getter]
- `getSettlementRateOption()` → `FieldWithMetaSettlementRateOptionEnum` [Getter]

### SingleValuationDateBuilderImpl
**Implements:** `SingleValuationDate$SingleValuationDateBuilder` 

**Fields:**
- `Integer businessDays`

**Key Methods:**
- `build()` → `SingleValuationDate` [Builder]
- `getBusinessDays()` → `Integer` [Getter]
- `setBusinessDays(Integer arg0)` → `SingleValuationDateBuilder` [Setter]

### SingleValuationDateImpl
**Implements:** `SingleValuationDate` 

**Key Methods:**
- `build()` → `SingleValuationDate` [Builder]
- `getBusinessDays()` → `Integer` [Getter]
- `setBuilderFields(SingleValuationDateBuilder arg0)` → `void` [Setter]

### SwapCurveValuationBuilderImpl
**Implements:** `SwapCurveValuation$SwapCurveValuationBuilder` 

**Fields:**
- `FloatingRateIndexEnum floatingRateIndex`
- `PeriodBuilder indexTenor`
- `BigDecimal spread`
- `QuotationSideEnum side`

**Key Methods:**
- `build()` → `SwapCurveValuation` [Builder]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `PeriodBuilder` [Getter]
- `setFloatingRateIndex(FloatingRateIndexEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `setSide(QuotationSideEnum arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getSide()` → `QuotationSideEnum` [Getter]
- `getOrCreateIndexTenor()` → `PeriodBuilder` [Getter]
- `setIndexTenor(Period arg0)` → `SwapCurveValuationBuilder` [Setter]
- `getSpread()` → `BigDecimal` [Getter]
- `setSpread(BigDecimal arg0)` → `SwapCurveValuationBuilder` [Setter]

### SwapCurveValuationImpl
**Implements:** `SwapCurveValuation` 

**Key Methods:**
- `build()` → `SwapCurveValuation` [Builder]
- `getFloatingRateIndex()` → `FloatingRateIndexEnum` [Getter]
- `getIndexTenor()` → `Period` [Getter]
- `getSide()` → `QuotationSideEnum` [Getter]
- `setBuilderFields(SwapCurveValuationBuilder arg0)` → `void` [Setter]
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
- `setMarketFixedRate(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setInitialPoints(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `setMarketPrice(BigDecimal arg0)` → `TransactedPriceBuilder` [Setter]
- `getInitialPoints()` → `BigDecimal` [Getter]
- `getQuotationStyle()` → `QuotationStyleEnum` [Getter]
- `getMarketPrice()` → `BigDecimal` [Getter]
- `getMarketFixedRate()` → `BigDecimal` [Getter]

### TransactedPriceImpl
**Implements:** `TransactedPrice` 

**Key Methods:**
- `build()` → `TransactedPrice` [Builder]
- `setBuilderFields(TransactedPriceBuilder arg0)` → `void` [Setter]
- `getInitialPoints()` → `BigDecimal` [Getter]
- `getQuotationStyle()` → `QuotationStyleEnum` [Getter]
- `getMarketPrice()` → `BigDecimal` [Getter]
- `getMarketFixedRate()` → `BigDecimal` [Getter]

### ValuationDatesBuilderImpl
**Implements:** `ValuationDates$ValuationDatesBuilder` 

**Fields:**
- `PerformanceValuationDatesBuilder initialValuationDate`
- `PerformanceValuationDatesBuilder interimValuationDate`
- `PerformanceValuationDatesBuilder finalValuationDate`

**Key Methods:**
- `build()` → `ValuationDates` [Builder]
- `getInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `setInitialValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setFinalValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `setInterimValuationDate(PerformanceValuationDates arg0)` → `ValuationDatesBuilder` [Setter]
- `getOrCreateInterimValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateFinalValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]
- `getOrCreateInitialValuationDate()` → `PerformanceValuationDatesBuilder` [Getter]

### ValuationDatesImpl
**Implements:** `ValuationDates` 

**Key Methods:**
- `build()` → `ValuationDates` [Builder]
- `getInitialValuationDate()` → `PerformanceValuationDates` [Getter]
- `setBuilderFields(ValuationDatesBuilder arg0)` → `void` [Setter]
- `getFinalValuationDate()` → `PerformanceValuationDates` [Getter]
- `getInterimValuationDate()` → `PerformanceValuationDates` [Getter]

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
- `getValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setValuationMethod(ValuationMethodEnum arg0)` → `ValuationMethodBuilder` [Setter]
- `setValuationSource(ValuationSource arg0)` → `ValuationMethodBuilder` [Setter]
- `getQuotationAmount()` → `MoneyBuilder` [Getter]
- `getMinimumQuotationAmount()` → `MoneyBuilder` [Getter]
- `setMinimumQuotationAmount(Money arg0)` → `ValuationMethodBuilder` [Setter]
- `getOrCreateValuationSource()` → `ValuationSourceBuilder` [Getter]
- `setQuotationAmount(Money arg0)` → `ValuationMethodBuilder` [Setter]
- `setQuotationMethod(QuotationRateTypeEnum arg0)` → `ValuationMethodBuilder` [Setter]

### ValuationMethodImpl
**Implements:** `ValuationMethod` 

**Key Methods:**
- `build()` → `ValuationMethod` [Builder]
- `setBuilderFields(ValuationMethodBuilder arg0)` → `void` [Setter]
- `getValuationSource()` → `ValuationSource` [Getter]
- `getQuotationAmount()` → `Money` [Getter]
- `getMinimumQuotationAmount()` → `Money` [Getter]
- `getQuotationMethod()` → `QuotationRateTypeEnum` [Getter]
- `getValuationMethod()` → `ValuationMethodEnum` [Getter]
- `getCashCollateralValuationMethod()` → `CashCollateralValuationMethod` [Getter]

### ValuationPostponementBuilderImpl
**Implements:** `ValuationPostponement$ValuationPostponementBuilder` 

**Fields:**
- `Integer maximumDaysOfPostponement`

**Key Methods:**
- `build()` → `ValuationPostponement` [Builder]
- `getMaximumDaysOfPostponement()` → `Integer` [Getter]
- `setMaximumDaysOfPostponement(Integer arg0)` → `ValuationPostponementBuilder` [Setter]

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
- `getQuotedCurrencyPair()` → `ReferenceWithMetaQuotedCurrencyPairBuilder` [Getter]
- `getOrCreateReferenceBanks()` → `ReferenceBanksBuilder` [Getter]
- `setSettlementRateOption(SettlementRateOption arg0)` → `ValuationSourceBuilder` [Setter]
- `setDealerOrCCP(AncillaryEntity arg0)` → `ValuationSourceBuilder` [Setter]
- `setReferenceBanks(ReferenceBanks arg0)` → `ValuationSourceBuilder` [Setter]
- `getOrCreateDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `getDealerOrCCP()` → `AncillaryEntityBuilder` [Getter]
- `getSettlementRateOption()` → `SettlementRateOptionBuilder` [Getter]
- `getReferenceBanks()` → `ReferenceBanksBuilder` [Getter]

### ValuationSourceImpl
**Implements:** `ValuationSource` 

**Key Methods:**
- `build()` → `ValuationSource` [Builder]
- `getQuotedCurrencyPair()` → `ReferenceWithMetaQuotedCurrencyPair` [Getter]
- `setBuilderFields(ValuationSourceBuilder arg0)` → `void` [Setter]
- `getDealerOrCCP()` → `AncillaryEntity` [Getter]
- `getSettlementRateOption()` → `SettlementRateOption` [Getter]
- `getReferenceBanks()` → `ReferenceBanks` [Getter]
- `getInformationSource()` → `FxSpotRateSource` [Getter]

