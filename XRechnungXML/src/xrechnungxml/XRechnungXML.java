/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package xrechnungxml;

/**
 *
 * @author Sikiric
 */
public class XRechnungXML {  

    private String businessProcessType;
    private String specificationIdentifier;
    private String invoiceNumber;
    private String invoiceTypeCode;
    private String invoiceIssueDate;
    private String invoiceNote;
    private String paymentTerms;
    private String invoiceLineIdentifier;
    private String invoiceLineNote;
    private String itemStandardIdentifier;
    private String itemStandardIdentifierIdentificationSchemeIdentifier;
    private String itemSellersIdentifier;
    private String itemBuyersIdentifier;
    private String itemName;
    private String itemDescreption;
    private String itemAttributeName;
    private String itemAttributeValue;
    private String itemClassificationIdentifier;
    private String itemClassificationIdentifierIdentificationSchemeIdentifier;
    private String schemeVersionIdentifer;
    private String itemCountryOfOrigin;
    private String referencedPurchaseOrderLineReference;
    private String itemPriceDiscount;
    private String itemPriceaseQuantity;
    private String itemPriceaseQuantityUnitOfMeasureCode;
    private String invoicedQuantity;
    private String invoicedQuantityUnitOfMeasure;
    private String invoicedItemVATtypeCode;
    private String invoicedItemVATcategoryCode;
    private String invoicedItemVATrate;
    private String invoiceLinePeriodStartDate;
    private String invoiceLinePeriodEndDate;
    private String invoiseLineCharges;
    private String invoiceLineChargePercentage;
    private String invoiceLineChargeChargeAmount;
    private String invoiceLineChargeReasonCode;
    private String invoiceLineChargeReason;
    private String invoiceLineAllowances;
    private String invoiceLineAllowancePercentage;
    private String invoiceLineAllowanceBaseAmount;
    private String invoiceLineAllowancesReasonCode;
    private String invoiceLineAllowancesReason;
    private String invoiceLineNetAmount;
    private String invoiceLineObjectIdentifier;
    private String invoiceLineObjectTypeCode;
    private String invoiceLineObjectIdentifierSchemeIdentifier;
    private String invoiceLineBuyerAccountingReference;
    private String buyerReference;
    private String sellerIdentifier;
    private String sellerIdentifierIdentificationSchemeIdentifier;
    private String sellerName;
    private String sellerAdditionalLegalInformation;
    private String sellerLegalRegistrationIdentifier;
    private String sellerLegalRegistrationIdentifierIdentificationSchemeIdentifier;
    private String sellerTradingName;
    private String sellerContactPoint;
    private String sellerContactDpartmentPoint;
    private String sellerContactTelephonenumber;
    private String sellerContactEmailaddress;
    private String sellerPostcode;
    private String sellerAddressline1;
    private String sellerAddressline2;
    private String sellerAddressline3;
    private String sellerCity;
    private String sellerCountryCodes;
    private String sellerCountrySubdivision;
    private String sellerElectronicaddress;
    private String sellerElectronicaddressIdentificationSchemeIdentifier;
    private String sellerVATidentifier;
    private String sellerTaxregistrationIdentifier;
    private String buyerIdentifier;
    private String buyerIdentifierIdentificationSchemeIdentifier;
    private String buyerName;
    private String buyerLegalRegistrationIdentifier;
    private String buyerLegalRegistrationIdentifierIdentificationSchemeIdentifier;
    private String buyerTradingName;
    private String buyerContactPoint;
    private String buyerContactDpartmentPoint;
    private String buyerContactTelephonenumber;
    private String buyerContactEmailaddress;
    private String buyerPostcode;
    private String buyerAddressline1;
    private String buyerAddressline2;
    private String buyerAddressline3;
    private String buyerCity;
    private String buyerCountryCodes;
    private String buyerCountrySubdivision;
    private String buyerElectronicaddress;
    private String buyerElectronicaddressIdentificationSchemeIdentifier;
    private String buyerVATidentifier;
    private String sellerTaxRepresentativeName;
    private String sellerTaxRepresentativeVATidentifier;
    private String taxRepresentativePostcode;
    private String taxRepresentativeAddressline1;
    private String taxRepresentativeAddressline2;
    private String taxRepresentativeAddressline3;
    private String taxRepresentativeCity;
    private String taxRepresentativeCountryCode;
    private String taxRepresentativeCountrySubdivision;
    private String salesOrderReference;
    private String purchaseOrderReference;
    private String contractReference;
    private String tenderOrLotReference;
    private String tenderOrLotReferenceTypeCode;
    private String invoicedObjectIdentifier;
    private String invoicedObjectTypeCode;
    private String invoicedObjectSchemeIdentifier;
    private String supportingDocumentReference;
    private String externalDocumentLocation;
    private String supportingDocumentTypeCode;
    private String supportingDocumentDescription;
    private String attachedDocument;
    private String attachedDocumentMimecode;
    private String attachedDocumentFilename;
    private String projectReference;
    private String deliverToLocationIdentifier;
    private String deliverToLocationIdentifierIdentificationSchemeIdentifier;
    private String deliverToPartyname;
    private String deliverToPostcode;
    private String deliverToAddressline1;
    private String deliverToAddressline2;
    private String deliverToAddressline3;
    private String deliverToCity;
    private String deliverToCountryCode;
    private String deliverToCountrySubdivision;
    private String actualDeliveryDate;
    private String despatchAdviceReference;
    private String receivingAdviceReference;
    private String bankAssignedCreditorIdentifier;
    private String remittanceInformation;
    private String vatAccountingCurrencyCode;
    private String invoiceCurrencyCode;
    private String payeeIdentifier;
    private String payeeIdentifierIdentificationSchemeIdentifier;
    private String payeeName;
    private String payeeLegalRegistrationIdentifier;
    private String payeeLegalRegistrationIdentifierIdentificationSchemeIdentifier;
    private String paymentMeansTypeCode;
    private String paymentMeansText;
    private String paymentCardPrimaryAccountNumber;
    private String paymentCardHolderName;
    private String debitedAccountIdentifier;
    private String paymentAccountIdentifier;
    private String paymentAccountName;
    private String paymentAccountIdentifierProprietaryID;
    private String paymentServiceProviderIdentifier;
    private String vatCategoryTaxAmount;
    private String vatExemptionReasonText;
    private String vatCategoryTaxableAmount;
    private String vatCategoryCode;
    private String vatExemptionReasonCode;
    private String valueAddedTaxpointDate;
    private String valueAddedTaxpointDateCode;
    private String vatCategoryRate;
    private String invoicingPeriodStartDate;
    private String invoicingPeriodEndDate;
    private String documentLevelCharges;
    private String documentLevelChargePercentage;
    private String documentLevelChargeBaseAmount;
    private String documentLevelChargeAmount;
    private String documentLevelChargereasonCode;
    private String documentLevelChargeReason;
    private String documentLevelChargeVATtypeCode;
    private String documentLevelChargeVATcategoryCode;
    private String documentLevelChargeVATrate;
    private String documentLevelAllowances;
    private String documentLevelAllowancePercentage;
    private String documentLevelAllowanceBaseAmount;
    private String documentLevelAllowanceAmounts;
    private String documentLevelAllowanceReasonCode;
    private String documentLevelAllowanceReason;
    private String documentLevelAllowanceVATtypeCode;
    private String documentLevelAllowanceVATcategoryCode;
    private String documentLevelAllowanceVATrate;
    private String paymentTermsDescription;
    private String paymentDueDate;
    private String mandateReferenceIdentifier;
    private String sumOfInvoiceLineNetAmount;
    private String sumOfAllowancesOnDocumentLevel;
    private String invoiceTotalAmountWithoutVAT;
    private String invoiceTotalVATamount;
    private String invoiceTotalVATamountInAccountingCurrency;
    private String roundingAmount;
    private String invoiceTotalAmountVithVAT;
    private String paidAmount;
    private String amountDueForPayment;
    private String precedingInvoiceNumber;
    private String precedingInvoiceIssueDate;
    private String buyerAccountingReference;

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private String createXML() {
        String emptyXML
                = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<rsm:CrossIndustryInvoice xmlns:ram=\"urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:100\"\n"
                + " xmlns:qdt=\"urn:un:unece:uncefact:data:standard:QualifiedDataType:100\"\n"
                + " xmlns:udt=\"urn:un:unece:uncefact:data:standard:UnqualifiedDataType:100\"\n"
                + " xmlns:rsm=\"urn:un:unece:uncefact:data:standard:CrossIndustryInvoice:100\"\n"
                + " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"> \n"
                + "    <rsm:ExchangedDocumentContext>          \n"
                + "        <ram:BusinessProcessSpecifiedDocumentContextParameter>\n"
                + "            <ram:ID>" + this.getBusinessProcessType() + "</ram:ID>\n"
                + "        </ram:BusinessProcessSpecifiedDocumentContextParameter>\n"
                + "        <ram:GuidelineSpecifiedDocumentContextParameter>\n"
                + "            <ram:ID>" + this.getSpecificationIdentifier() + "</ram:ID>            \n"
                + "        </ram:GuidelineSpecifiedDocumentContextParameter>     \n"
                + "    </rsm:ExchangedDocumentContext>\n"
                + "    <rsm:ExchangedDocument>\n"
                + "        <ram:ID>" + this.getInvoiceNumber() + "</ram:ID>    \n"
                + "        <ram:TypeCode>" + this.getInvoiceTypeCode() + "</ram:TypeCode>\n"
                + "        <ram:IssueDateTime>\n"
                + "            <udt:DateTimeString format=\"102\">" + this.getInvoiceIssueDate() + "</udt:DateTimeString>\n"
                + "        </ram:IssueDateTime>      \n"
                + "        <ram:IncludedNote>     \n"
                + "            <ram:Content>" + this.getInvoiceNote() + "</ram:Content>\n"
                + "            <ram:SubjectCode>" + this.getPaymentTerms() + "</ram:SubjectCode>            \n"
                + "        </ram:IncludedNote>   \n"
                + "    </rsm:ExchangedDocument>\n"
                + "    <rsm:SupplyChainTradeTransaction>\n"
                + "        <ram:IncludedSupplyChainTradeLineItem>            \n"
                + "            <ram:AssociatedDocumentLineDocument>\n"
                + "                <!-- BT-126 Invoice line identifier -->\n"
                + "                <ram:LineID>" + this + "</ram:LineID>                                                \n"
                + "                <ram:IncludedNote>     \n"
                + "                    <!-- BT-127 Invoice line note -->\n"
                + "                    <ram:Content>" + this + "</ram:Content>                   \n"
                + "                </ram:IncludedNote>                \n"
                + "            </ram:AssociatedDocumentLineDocument>\n"
                + "            <ram:SpecifiedTradeProduct>    \n"
                + "                <!-- BT-157 Item standard identifier und BT-157-1 Item standard identifier identification scheme identifier -->\n"
                + "                <ram:GlobalID schemeID=\"xCLkcpkS\">" + this + "</ram:GlobalID>\n"
                + "                <!-- BT-155 Item Seller's identifier -->\n"
                + "                <ram:SellerAssignedID>" + this + "</ram:SellerAssignedID>\n"
                + "                <!-- BT-156 Item Buyer's identifier -->\n"
                + "                <ram:BuyerAssignedID>" + this + "</ram:BuyerAssignedID>   \n"
                + "                <!-- BT-153 Item name -->\n"
                + "                <ram:Name>" + this + "</ram:Name>   \n"
                + "                <!-- BT-154 Item description -->\n"
                + "                <ram:Description>" + this + "</ram:Description>  \n"
                + "                <ram:ApplicableProductCharacteristic>\n"
                + "                    <!-- BT-160 Item attribute name -->\n"
                + "                    <ram:Description>" + this + "</ram:Description>\n"
                + "                    <!-- BT-161 Item attribute value -->\n"
                + "                    <ram:Value>" + this + "</ram:Value>                                                                                \n"
                + "                </ram:ApplicableProductCharacteristic>\n"
                + "                <!-- BT-158 Item classification identifier, BT-158-1 Item classification identifier identification scheme identifier und BT-158-2 Scheme version identifer-->\n"
                + "                <ram:DesignatedProductClassification>\n"
                + "                    <ram:ClassCode listID=\"ruiufhf\" listVersionID=\"iioewrio\">" + this + "</ram:ClassCode>\n"
                + "                </ram:DesignatedProductClassification>\n"
                + "                <!-- BT-159 Item country of origin -->\n"
                + "                <ram:OriginTradeCountry>\n"
                + "                    <ram:ID>" + this + "</ram:ID>                    \n"
                + "                </ram:OriginTradeCountry>               \n"
                + "            </ram:SpecifiedTradeProduct>\n"
                + "            <ram:SpecifiedLineTradeAgreement>                \n"
                + "                <ram:BuyerOrderReferencedDocument> \n"
                + "                    <!-- BT-132 Referenced purchase order line reference -->\n"
                + "                    <ram:LineID>" + this + "</ram:LineID>                    \n"
                + "                </ram:BuyerOrderReferencedDocument>\n"
                + "                <ram:GrossPriceProductTradePrice>\n"
                + "                    <!-- BT-148 Item price discount -->\n"
                + "                    <ram:ChargeAmount>" + this + "</ram:ChargeAmount>\n"
                + "                    <!-- BT-149 Item price base quantity und BT-150 Item price base quantity unit of measure code-->\n"
                + "                    <ram:BasisQuantity unitCode=\"xcqYc-b1\">" + this + "</ram:BasisQuantity>\n"
                + "                    <ram:AppliedTradeAllowanceCharge>       \n"
                + "                        <!-- BT-147 Item price discount -->\n"
                + "                        <ram:ActualAmount>" + this + "</ram:ActualAmount>\n"
                + "                    </ram:AppliedTradeAllowanceCharge>\n"
                + "                </ram:GrossPriceProductTradePrice>\n"
                + "                <ram:NetPriceProductTradePrice>\n"
                + "                    <!-- BT-146 Item net price -->\n"
                + "                    <ram:ChargeAmount>" + this + "</ram:ChargeAmount>\n"
                + "                    <!-- BT-149 Item price base quantity und BT-150 Item price base quantity unit of measure code-->\n"
                + "                    <ram:BasisQuantity unitCode=\"fFEuWM:5\">" + this + "</ram:BasisQuantity>\n"
                + "                </ram:NetPriceProductTradePrice>\n"
                + "            </ram:SpecifiedLineTradeAgreement>\n"
                + "            <ram:SpecifiedLineTradeDelivery>     \n"
                + "                <!-- BT-129 Invoiced quantity und BT-130 Invoiced quantity unit of measure -->\n"
                + "                <ram:BilledQuantity unitCode=\"TwA44.y2\">" + this + "</ram:BilledQuantity>\n"
                + "            </ram:SpecifiedLineTradeDelivery>\n"
                + "            <ram:SpecifiedLineTradeSettlement>                \n"
                + "                <ram:ApplicableTradeTax>\n"
                + "                    <!-- BT-151 Invoiced item VAT category code -->\n"
                + "                    <ram:TypeCode>" + this + "</ram:TypeCode>\n"
                + "                    <!-- BT-151 Invoiced item VAT category code -->\n"
                + "                    <ram:CategoryCode>" + this + "</ram:CategoryCode>\n"
                + "                    <!-- BT-152 Invoiced item VAT rate -->\n"
                + "                    <ram:RateApplicablePercent>" + this + "</ram:RateApplicablePercent>\n"
                + "                </ram:ApplicableTradeTax>\n"
                + "                <ram:BillingSpecifiedPeriod>   \n"
                + "                    <!-- BT-134 Invoice line  period  start date -->\n"
                + "                    <ram:StartDateTime>\n"
                + "                        <udt:DateTimeString format=\"102\">" + this + "</udt:DateTimeString>\n"
                + "                    </ram:StartDateTime>\n"
                + "                    <!-- BT-135 Invoice line period end date -->\n"
                + "                    <ram:EndDateTime>\n"
                + "                        <udt:DateTimeString format=\"102\">" + this + "</udt:DateTimeString>\n"
                + "                    </ram:EndDateTime>\n"
                + "                </ram:BillingSpecifiedPeriod>\n"
                + "                <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                    <!-- BG-28 INVOICE LINE CHARGES -->\n"
                + "                    <ram:ChargeIndicator>                        \n"
                + "                        <udt:Indicator>" + this + "</udt:Indicator>\n"
                + "                    </ram:ChargeIndicator>\n"
                + "                    <!-- BT-143 Invoice line charge percentage -->\n"
                + "                    <ram:CalculationPercent>" + this + "</ram:CalculationPercent>\n"
                + "                    <!-- BT-142 Invoice line charge base amount -->\n"
                + "                    <ram:BasisAmount>" + this + "</ram:BasisAmount>\n"
                + "                    <!-- BT-141 Invoice line charge amount -->\n"
                + "                    <ram:ActualAmount>" + this + "</ram:ActualAmount>\n"
                + "                    <!-- BT-145 Invoice line charge reason code -->\n"
                + "                    <ram:ReasonCode>" + this + "</ram:ReasonCode>\n"
                + "                    <!-- BT-144 Invoice line charge reason -->\n"
                + "                    <ram:Reason>" + this + "</ram:Reason>                    \n"
                + "                </ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                    <!-- BG-27 INVOICE LINE ALLOWANCES -->\n"
                + "                    <ram:ChargeIndicator>                        \n"
                + "                        <udt:Indicator>" + this + "</udt:Indicator>\n"
                + "                    </ram:ChargeIndicator>\n"
                + "                    <!-- BT-138 Invoice line allowance percentage -->\n"
                + "                    <ram:CalculationPercent>" + this + "</ram:CalculationPercent>\n"
                + "                    <!-- BT-137 Invoice line allowance base amount -->\n"
                + "                    <ram:BasisAmount>" + this + "</ram:BasisAmount>\n"
                + "                    <!-- BT-136 Invoice line allowance amount -->\n"
                + "                    <ram:ActualAmount>" + this + "</ram:ActualAmount>\n"
                + "                    <!-- BT-140 Invoice line allowance reason code -->\n"
                + "                    <ram:ReasonCode>" + this + "</ram:ReasonCode>\n"
                + "                    <!-- BT-139 Invoice line allowance reason -->\n"
                + "                    <ram:Reason>" + this + "</ram:Reason>                    \n"
                + "                </ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <ram:SpecifiedTradeSettlementLineMonetarySummation>\n"
                + "                    <!-- BT-131 Invoice line net amount -->\n"
                + "                    <ram:LineTotalAmount>" + this + "</ram:LineTotalAmount>                    \n"
                + "                </ram:SpecifiedTradeSettlementLineMonetarySummation>\n"
                + "                <ram:AdditionalReferencedDocument>\n"
                + "                    <!-- BT-128 Invoice line object identifier -->\n"
                + "                    <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>\n"
                + "                    <!-- BT-128 Invoice line object identifier -->\n"
                + "                    <ram:TypeCode>" + this + "</ram:TypeCode>\n"
                + "                    <!-- BT-128-1 Invoice line object identifier identification scheme identifier -->\n"
                + "                    <ram:ReferenceTypeCode>" + this + "</ram:ReferenceTypeCode>\n"
                + "                </ram:AdditionalReferencedDocument>\n"
                + "                <!-- BT-133 Invoice line Buyer accounting reference -->\n"
                + "                <ram:ReceivableSpecifiedTradeAccountingAccount>\n"
                + "                    <ram:ID>" + this + "</ram:ID>                    \n"
                + "                </ram:ReceivableSpecifiedTradeAccountingAccount>\n"
                + "            </ram:SpecifiedLineTradeSettlement>\n"
                + "        </ram:IncludedSupplyChainTradeLineItem>\n"
                + "        <ram:ApplicableHeaderTradeAgreement>\n"
                + "            <!-- BT-10 Buyer reference -->\n"
                + "            <ram:BuyerReference>" + this + "</ram:BuyerReference>\n"
                + "            <ram:SellerTradeParty>\n"
                + "                <!-- BT-29 Seller identifier -->\n"
                + "                <ram:ID>" + this + "</ram:ID>     \n"
                + "                <!-- BT-29 Seller identifier und BT-29-1 Seller identifier identification scheme identifier -->\n"
                + "                <ram:GlobalID schemeID=\"WprpRLxO\">" + this + "</ram:GlobalID>   \n"
                + "                <!-- BT-27 Seller name -->\n"
                + "                <ram:Name>" + this + "</ram:Name>\n"
                + "                <!-- BT-33 Seller additional legal information -->\n"
                + "                <ram:Description>" + this + "</ram:Description>\n"
                + "                <ram:SpecifiedLegalOrganization>\n"
                + "                    <!-- BT-30 Seller legal registration identifier and BT-30-1 Seller legal registration identifier identificationscheme identifier-->\n"
                + "                    <ram:ID schemeID=\"a3o5MVt6\">" + this + "</ram:ID>\n"
                + "                    <!-- BT-28 Seller trading name -->\n"
                + "                    <ram:TradingBusinessName>" + this + "</ram:TradingBusinessName>                    \n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "                <ram:DefinedTradeContact>\n"
                + "                    <!-- BT-41 Seller contact point -->\n"
                + "                    <ram:PersonName>" + this + "</ram:PersonName>\n"
                + "                    <!-- BT-41 Seller contact point -->\n"
                + "                    <ram:DepartmentName>" + this + "</ram:DepartmentName>\n"
                + "                    <!-- BT-42 Seller contact telephone number -->\n"
                + "                    <ram:TelephoneUniversalCommunication>\n"
                + "                        <ram:CompleteNumber>" + this + "</ram:CompleteNumber>\n"
                + "                    </ram:TelephoneUniversalCommunication>\n"
                + "                    <!-- BT-43 Seller contact email address -->\n"
                + "                    <ram:EmailURIUniversalCommunication>\n"
                + "                        <ram:URIID>" + this + "</ram:URIID>                      \n"
                + "                    </ram:EmailURIUniversalCommunication>                    \n"
                + "                </ram:DefinedTradeContact>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <!-- BT-38 Seller post code -->\n"
                + "                    <ram:PostcodeCode>" + this + "</ram:PostcodeCode>\n"
                + "                    <!-- BT-35 Seller address line 1 -->\n"
                + "                    <ram:LineOne>" + this + "</ram:LineOne>\n"
                + "                    <!-- BT-36 Seller address line 2 -->\n"
                + "                    <ram:LineTwo>" + this + "</ram:LineTwo>\n"
                + "                    <!-- BT-162 Seller address line 3 -->\n"
                + "                    <ram:LineThree>" + this + "</ram:LineThree>\n"
                + "                    <!-- BT-37 Seller city -->\n"
                + "                    <ram:CityName>" + this + "</ram:CityName>\n"
                + "                    <!-- BT-40 Seller country codes -->\n"
                + "                    <ram:CountryID>" + this + "</ram:CountryID>\n"
                + "                    <!-- BT-39 Seller country subdivision -->\n"
                + "                    <ram:CountrySubDivisionName>" + this + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>\n"
                + "                <!-- BT-34 Seller electronic address and BT-34-1 Seller electronic address identification scheme identifier -->\n"
                + "                <ram:URIUniversalCommunication>\n"
                + "                    <ram:URIID schemeID=\"knVXugjN\">" + this + "</ram:URIID>\n"
                + "                </ram:URIUniversalCommunication>  \n"
                + "                <!-- BT-31 Seller VAT identifier -->\n"
                + "                <ram:SpecifiedTaxRegistration>\n"
                + "                    <ram:ID schemeID=\"VA\">" + this + "</ram:ID>                                \n"
                + "                </ram:SpecifiedTaxRegistration>   \n"
                + "                <!-- BT-32 Seller tax registration identifier -->\n"
                + "                <ram:SpecifiedTaxRegistration>                    \n"
                + "                    <ram:ID schemeID=\"FC\">" + this + "</ram:ID>                  \n"
                + "                </ram:SpecifiedTaxRegistration>   \n"
                + "            </ram:SellerTradeParty>\n"
                + "            <ram:BuyerTradeParty>\n"
                + "                <!-- BT-46 Buyer identifier -->\n"
                + "                <ram:ID>" + this + "</ram:ID>\n"
                + "                <!-- BT-46 Buyer identifier und Buyer identifier identification scheme identifier -->\n"
                + "                <ram:GlobalID schemeID=\"atGSXThq\">" + this + "</ram:GlobalID>\n"
                + "                <!-- BT-44 Buyer name -->\n"
                + "                <ram:Name>" + this + "</ram:Name>\n"
                + "                <ram:SpecifiedLegalOrganization>\n"
                + "                    <!-- BT-47 Buyer  legal  registration identifier und BT-47-1 Buyer legal registration identifier identification scheme identifier-->\n"
                + "                    <ram:ID schemeID=\"a3o5MVt6\">" + this + "</ram:ID>\n"
                + "                    <!-- BT-45 Buyer trading name -->\n"
                + "                    <ram:TradingBusinessName>" + this + "</ram:TradingBusinessName>                    \n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "                <ram:DefinedTradeContact>\n"
                + "                    <!-- BT-56 Buyer contact point -->\n"
                + "                    <ram:PersonName>" + this + "</ram:PersonName>\n"
                + "                    <!-- BT-56 Buyer contact point -->\n"
                + "                    <ram:DepartmentName>" + this + "</ram:DepartmentName>\n"
                + "                    <!-- BT-57 Buyer contact telephone number -->\n"
                + "                    <ram:TelephoneUniversalCommunication>\n"
                + "                        <ram:CompleteNumber>" + this + "</ram:CompleteNumber>\n"
                + "                    </ram:TelephoneUniversalCommunication>\n"
                + "                    <!-- BT-58 Buyer contact email address -->\n"
                + "                    <ram:EmailURIUniversalCommunication>\n"
                + "                        <ram:URIID>" + this + "</ram:URIID>                      \n"
                + "                    </ram:EmailURIUniversalCommunication>                    \n"
                + "                </ram:DefinedTradeContact>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <!-- BT-53 Buyer post code -->\n"
                + "                    <ram:PostcodeCode>" + this + "</ram:PostcodeCode>\n"
                + "                    <!-- BT-50 Buyer address line 1 -->\n"
                + "                    <ram:LineOne>" + this + "</ram:LineOne>\n"
                + "                    <!-- BT-51 Buyer address line 2 -->\n"
                + "                    <ram:LineTwo>" + this + "</ram:LineTwo>\n"
                + "                    <!-- BT-163 Buyer address line 3 -->\n"
                + "                    <ram:LineThree>" + this + "</ram:LineThree>\n"
                + "                    <!-- BT-52 Buyer city -->\n"
                + "                    <ram:CityName>" + this + "</ram:CityName>\n"
                + "                    <!-- BT-55 Buyer country code -->\n"
                + "                    <ram:CountryID>" + this + "</ram:CountryID>\n"
                + "                    <!-- BT-54 Buyer country subdivision -->\n"
                + "                    <ram:CountrySubDivisionName>" + this + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>\n"
                + "                <!-- BT-49 Buyer electronic address und BT-49-1 Buyer electronic address identification schemeidentifier -->\n"
                + "                <ram:URIUniversalCommunication>\n"
                + "                    <ram:URIID schemeID=\"knVXugjN\">" + this + "</ram:URIID>\n"
                + "                </ram:URIUniversalCommunication>    \n"
                + "                <!-- BT-48 Buyer  VAT  identifier -->\n"
                + "                <ram:SpecifiedTaxRegistration>\n"
                + "                    <ram:ID schemeID=\"VA\">" + this + "</ram:ID>                    \n"
                + "                </ram:SpecifiedTaxRegistration>\n"
                + "            </ram:BuyerTradeParty>\n"
                + "            <ram:SellerTaxRepresentativeTradeParty>\n"
                + "                <!-- BT-62 Seller tax representative name -->\n"
                + "                <ram:Name>" + this + "</ram:Name>\n"
                + "                <ram:SpecifiedLegalOrganization>  \n"
                + "                    <!-- BT-63 Seller tax representative VAT identifier -->\n"
                + "                    <ram:ID schemeID=\"VA\">" + this + "</ram:ID>\n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <!-- BT-67 Tax representative post code -->\n"
                + "                    <ram:PostcodeCode>" + this + "</ram:PostcodeCode>\n"
                + "                    <!-- BT-64 Tax representative address line 1 -->\n"
                + "                    <ram:LineOne>" + this + "</ram:LineOne>\n"
                + "                    <!-- BT-65 Tax representative address line 2 -->\n"
                + "                    <ram:LineTwo>" + this + "</ram:LineTwo>\n"
                + "                    <!-- BT-164 Tax representative address line 3 -->\n"
                + "                    <ram:LineThree>" + this + "</ram:LineThree>\n"
                + "                    <!-- BT-66 Tax representative city -->\n"
                + "                    <ram:CityName>" + this + "</ram:CityName>\n"
                + "                    <!-- BT-69 Tax representative country code -->\n"
                + "                    <ram:CountryID>" + this + "</ram:CountryID>\n"
                + "                    <!-- BT-68 Tax representative country subdivision -->\n"
                + "                    <ram:CountrySubDivisionName>" + this + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>\n"
                + "            </ram:SellerTaxRepresentativeTradeParty>\n"
                + "            <ram:SellerOrderReferencedDocument>\n"
                + "                <!-- BT-14 Sales order reference -->\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>                \n"
                + "            </ram:SellerOrderReferencedDocument>\n"
                + "            <ram:BuyerOrderReferencedDocument>\n"
                + "                <!-- BT-13 Purchase order reference -->\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>                \n"
                + "            </ram:BuyerOrderReferencedDocument>\n"
                + "            <ram:ContractReferencedDocument>\n"
                + "                <!-- BT-12 Contract reference -->\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>                \n"
                + "            </ram:ContractReferencedDocument>            \n"
                + "            <ram:AdditionalReferencedDocument>\n"
                + "                <!-- BT-17 Tender or lot reference -->\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>   \n"
                + "                <!-- BT-17 Tender or lot reference -->\n"
                + "                <ram:TypeCode>" + this + "</ram:TypeCode>                                \n"
                + "            </ram:AdditionalReferencedDocument>            \n"
                + "            <ram:AdditionalReferencedDocument>\n"
                + "                <!-- BT-18 Invoiced object identifier -->\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>  \n"
                + "                <!-- BT-18 Invoiced object identifier -->\n"
                + "                <ram:TypeCode>" + this + "</ram:TypeCode>  \n"
                + "                <!-- BT 18-1 Scheme identifier -->\n"
                + "                <ram:ReferenceTypeCode>" + this + "</ram:ReferenceTypeCode>\n"
                + "            </ram:AdditionalReferencedDocument>\n"
                + "            <ram:AdditionalReferencedDocument>\n"
                + "                <!-- BT-122 Supporting document reference -->\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>  \n"
                + "                <!-- BT-124 External document location -->\n"
                + "                <ram:URIID>" + this + "</ram:URIID>\n"
                + "                <!-- BT-122 Supporting document reference -->\n"
                + "                <ram:TypeCode>" + this + "</ram:TypeCode>\n"
                + "                <!-- BT-123 Supporting document description -->\n"
                + "                <ram:Name>" + this + "</ram:Name>\n"
                + "                <!-- BT-125 Attached document, BT-125-1 Attached document Mime code und BT-125-2 Attached document Filename -->\n"
                + "                <ram:AttachmentBinaryObject mimeCode=\"y6HcaVc9\" filename=\"whgl6AgVL2Y6Pa63R49yI\">" + this + "</ram:AttachmentBinaryObject>                \n"
                + "            </ram:AdditionalReferencedDocument>\n"
                + "            <!-- BT-11 Project reference -->\n"
                + "            <ram:SpecifiedProcuringProject>                \n"
                + "                <ram:ID>" + this + "</ram:ID>\n"
                + "                <ram:Name>" + this + "</ram:Name>\n"
                + "            </ram:SpecifiedProcuringProject>\n"
                + "        </ram:ApplicableHeaderTradeAgreement>\n"
                + "        <ram:ApplicableHeaderTradeDelivery>\n"
                + "            <ram:ShipToTradeParty>\n"
                + "                <!-- BT-71 Deliver to location identifier -->\n"
                + "                <ram:ID>" + this + "</ram:ID>    \n"
                + "                <!-- BT-71 Deliver to location identifier und BT-71-1 Deliver to location identifier identificationscheme identifier -->\n"
                + "                <ram:GlobalID schemeID=\"yNP8_s8c\">" + this + "</ram:GlobalID>\n"
                + "                <!-- BT-70 Deliver to party name -->\n"
                + "                <ram:Name>" + this + "</ram:Name>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <!-- BT-78 Deliver to post code -->\n"
                + "                    <ram:PostcodeCode>" + this + "</ram:PostcodeCode>\n"
                + "                    <!-- BT-75 Deliver to address line 1 -->\n"
                + "                    <ram:LineOne>" + this + "</ram:LineOne>\n"
                + "                    <!-- BT-76 Deliver to addressline 2 -->\n"
                + "                    <ram:LineTwo>" + this + "</ram:LineTwo>\n"
                + "                    <!-- BT-165 Deliver to address line 3 -->\n"
                + "                    <ram:LineThree>" + this + "</ram:LineThree>\n"
                + "                    <!-- BT-77 Deliver to city -->\n"
                + "                    <ram:CityName>" + this + "</ram:CityName>\n"
                + "                    <!-- BT-80 Deliver to country code -->\n"
                + "                    <ram:CountryID>" + this + "</ram:CountryID>\n"
                + "                    <!-- BT-79 Deliver to country subdivision -->\n"
                + "                    <ram:CountrySubDivisionName>" + this + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>                \n"
                + "            </ram:ShipToTradeParty>            \n"
                + "            <ram:ActualDeliverySupplyChainEvent>     \n"
                + "                <!-- BT-72 Actual delivery date -->\n"
                + "                <ram:OccurrenceDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this + "</udt:DateTimeString>\n"
                + "                </ram:OccurrenceDateTime>\n"
                + "            </ram:ActualDeliverySupplyChainEvent>   \n"
                + "            <!-- BT-16 Despatch advice reference -->\n"
                + "            <ram:DespatchAdviceReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>\n"
                + "            </ram:DespatchAdviceReferencedDocument>\n"
                + "            <!-- BT-15 Receiving advice reference -->\n"
                + "            <ram:ReceivingAdviceReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>       \n"
                + "            </ram:ReceivingAdviceReferencedDocument>\n"
                + "        </ram:ApplicableHeaderTradeDelivery>\n"
                + "        <ram:ApplicableHeaderTradeSettlement>\n"
                + "            <!-- BT-90 Bank assigned creditor identifier -->\n"
                + "            <ram:CreditorReferenceID>" + this + "</ram:CreditorReferenceID>\n"
                + "            <!-- BT-83 Remittance information -->\n"
                + "            <ram:PaymentReference>" + this + "</ram:PaymentReference>\n"
                + "            <!-- BT-6 VAT accounting currency code -->\n"
                + "            <ram:TaxCurrencyCode>" + this + "</ram:TaxCurrencyCode>\n"
                + "            <!-- BT-5 Invoice currency code -->\n"
                + "            <ram:InvoiceCurrencyCode>" + this + "</ram:InvoiceCurrencyCode>\n"
                + "            <ram:PayeeTradeParty>     \n"
                + "                <!-- BT-60 Payee identifier -->\n"
                + "                <ram:ID>" + this + "</ram:ID>\n"
                + "                <!-- BT-60 Payee identifier and BT-60-1 Payee identifier identification scheme identifier -->\n"
                + "                <ram:GlobalID schemeID=\"Yw3WN_p-\">" + this + "</ram:GlobalID>    \n"
                + "                <!-- BT-59 Payee name -->\n"
                + "                <ram:Name>" + this + "</ram:Name>\n"
                + "                <!-- BT-61 Payee legal registration identifier und Payee legal registration identifier-->\n"
                + "                <ram:SpecifiedLegalOrganization>                    \n"
                + "                    <ram:ID schemeID=\"zYLF7wEN\">" + this + "</ram:ID>\n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "            </ram:PayeeTradeParty>                        \n"
                + "            <ram:SpecifiedTradeSettlementPaymentMeans>\n"
                + "                <!-- BT-81 Payment means type code -->\n"
                + "                <ram:TypeCode>" + this + "</ram:TypeCode>\n"
                + "                <!-- BT-82 Payment means text -->\n"
                + "                <ram:Information>" + this + "</ram:Information>\n"
                + "                <ram:ApplicableTradeSettlementFinancialCard>   \n"
                + "                    <!-- BT-87 Payment card primary account number -->\n"
                + "                    <ram:ID>" + this + "</ram:ID>    \n"
                + "                    <!-- BT-88 Payment card holder name -->\n"
                + "                    <ram:CardholderName>" + this + "</ram:CardholderName>                    \n"
                + "                </ram:ApplicableTradeSettlementFinancialCard>\n"
                + "                <ram:PayerPartyDebtorFinancialAccount>\n"
                + "                    <!-- BT-91 Debited account identifier -->\n"
                + "                    <ram:IBANID>" + this + "</ram:IBANID>                    \n"
                + "                </ram:PayerPartyDebtorFinancialAccount>\n"
                + "                <ram:PayeePartyCreditorFinancialAccount>\n"
                + "                    <!-- BT-84 Payment account identifier -->\n"
                + "                    <ram:IBANID>" + this + "</ram:IBANID>\n"
                + "                    <!-- BT-85 Payment account name -->\n"
                + "                    <ram:AccountName>" + this + "</ram:AccountName>\n"
                + "                    <!-- BT-84 Payment account identifier -->\n"
                + "                    <ram:ProprietaryID>" + this + "</ram:ProprietaryID>\n"
                + "                </ram:PayeePartyCreditorFinancialAccount>\n"
                + "                <ram:PayeeSpecifiedCreditorFinancialInstitution>\n"
                + "                    <!-- BT-85 Payment service provider identifier -->\n"
                + "                    <ram:BICID>" + this + "</ram:BICID>\n"
                + "                </ram:PayeeSpecifiedCreditorFinancialInstitution>                \n"
                + "            </ram:SpecifiedTradeSettlementPaymentMeans>                              \n"
                + "            <ram:ApplicableTradeTax>\n"
                + "                <!-- BT-117 VAT category tax amount -->\n"
                + "                <ram:CalculatedAmount>" + this + "</ram:CalculatedAmount>\n"
                + "                <!-- BT-118 VAT category code -->\n"
                + "                <ram:TypeCode>" + this + "</ram:TypeCode> \n"
                + "                <!-- BT-120 VAT exemption reason text -->\n"
                + "                <ram:ExemptionReason>" + this + "</ram:ExemptionReason> \n"
                + "                <!-- BT-116 VAT category taxable amount -->\n"
                + "                <ram:BasisAmount>" + this + "</ram:BasisAmount>\n"
                + "                <!-- BT-118 VAT category code -->\n"
                + "                <ram:CategoryCode>" + this + "</ram:CategoryCode>\n"
                + "                <!-- BT-121 VAT exemption reason code -->\n"
                + "                <ram:ExemptionReasonCode>" + this + "</ram:ExemptionReasonCode>      \n"
                + "                <!-- BT-7 Value added tax point date -->\n"
                + "                <ram:TaxPointDate>\n"
                + "                    <udt:DateString format=\"102\">" + this + "</udt:DateString>                   \n"
                + "                </ram:TaxPointDate>\n"
                + "                <!-- BT-8 Value added tax point date code -->\n"
                + "                <ram:DueDateTypeCode>" + this + "</ram:DueDateTypeCode>          \n"
                + "                <!-- BT-119 VAT category rate -->\n"
                + "                <ram:RateApplicablePercent>" + this + "</ram:RateApplicablePercent>\n"
                + "            </ram:ApplicableTradeTax>\n"
                + "            <ram:BillingSpecifiedPeriod>  \n"
                + "                <!-- BT-73 Invoicing period start date -->\n"
                + "                <ram:StartDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this + "</udt:DateTimeString>                    \n"
                + "                </ram:StartDateTime>\n"
                + "                <!-- BT-74 Invoicing period  end  date -->\n"
                + "                <ram:EndDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this + "</udt:DateTimeString>                   \n"
                + "                </ram:EndDateTime>\n"
                + "            </ram:BillingSpecifiedPeriod>        \n"
                + "            <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <!-- BT-21 DOCUMENT LEVEL CHARGES-->\n"
                + "                <ram:ChargeIndicator>\n"
                + "                    <udt:Indicator>" + this + "</udt:Indicator>\n"
                + "                </ram:ChargeIndicator>\n"
                + "                <!-- BT-101 Document level charge percentage -->\n"
                + "                <ram:CalculationPercent>" + this + "</ram:CalculationPercent>\n"
                + "                <!-- BT-100 Document level chargebase amount -->\n"
                + "                <ram:BasisAmount>" + this + "</ram:BasisAmount>\n"
                + "                <!-- BT-99 Document level charge amount -->\n"
                + "                <ram:ActualAmount>" + this + "</ram:ActualAmount>\n"
                + "                <!-- BT-105 Document level charge reason code -->\n"
                + "                <ram:ReasonCode>" + this + "</ram:ReasonCode>\n"
                + "                <!-- BT-104 Document level charge reason -->\n"
                + "                <ram:Reason>" + this + "</ram:Reason>\n"
                + "                <ram:CategoryTradeTax>\n"
                + "                    <!-- BT-102 Document level charge VAT category code -->\n"
                + "                    <ram:TypeCode>" + this + "</ram:TypeCode>\n"
                + "                    <!-- BT-102 Document level charge VAT category code -->\n"
                + "                    <ram:CategoryCode>" + this + "</ram:CategoryCode>\n"
                + "                    <!-- BT-103 Document level charge VAT rate -->\n"
                + "                    <ram:RateApplicablePercent>" + this + "</ram:RateApplicablePercent>\n"
                + "                </ram:CategoryTradeTax>\n"
                + "            </ram:SpecifiedTradeAllowanceCharge>\n"
                + "            <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <!-- BT-20 DOCUMENT LEVEL ALLOWANCES-->\n"
                + "                <ram:ChargeIndicator>\n"
                + "                    <udt:Indicator>" + this + "</udt:Indicator>\n"
                + "                </ram:ChargeIndicator>\n"
                + "                <!-- BT-94 Document level allowance percentage -->\n"
                + "                <ram:CalculationPercent>" + this + "</ram:CalculationPercent>\n"
                + "                <!-- BT-93 Document level allowance base amount -->\n"
                + "                <ram:BasisAmount>" + this + "</ram:BasisAmount>\n"
                + "                <!-- BT-92 Document level allowance amounts -->\n"
                + "                <ram:ActualAmount>" + this + "</ram:ActualAmount>\n"
                + "                <!-- BT-98 Document level allowance reason code Document level allowance reason code -->\n"
                + "                <ram:ReasonCode>" + this + "</ram:ReasonCode>\n"
                + "                <!-- BT-97 Document level allowance reason -->\n"
                + "                <ram:Reason>" + this + "</ram:Reason>                \n"
                + "                <ram:CategoryTradeTax>\n"
                + "                    <!-- BT-95 Document level allowance VAT category code -->\n"
                + "                    <ram:TypeCode>" + this + "</ram:TypeCode>\n"
                + "                    <!-- BT-95 Document level allowance VAT category code -->\n"
                + "                    <ram:CategoryCode>" + this + "</ram:CategoryCode>\n"
                + "                    <!-- BT-96 Document level allowance VAT rate -->\n"
                + "                    <ram:RateApplicablePercent></ram:RateApplicablePercent>\n"
                + "                </ram:CategoryTradeTax>\n"
                + "            </ram:SpecifiedTradeAllowanceCharge>                \n"
                + "            <ram:SpecifiedTradePaymentTerms>                \n"
                + "                <!-- BT-20 Payment terms -->\n"
                + "                <ram:Description>" + this + "</ram:Description>\n"
                + "                <!-- BT-9 Payment due date -->\n"
                + "                <ram:DueDateDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this + "</udt:DateTimeString>\n"
                + "                </ram:DueDateDateTime>            \n"
                + "                <!-- BT-89 Mandate reference identifier -->\n"
                + "                <ram:DirectDebitMandateID>" + this + "</ram:DirectDebitMandateID>\n"
                + "            </ram:SpecifiedTradePaymentTerms>\n"
                + "            <ram:SpecifiedTradeSettlementHeaderMonetarySummation>\n"
                + "                <!-- BT-106 Sum of Invoice line net amount -->\n"
                + "                <ram:LineTotalAmount>" + this + "</ram:LineTotalAmount>\n"
                + "                <!-- BT-108 Sum of charges on document level -->\n"
                + "                <ram:ChargeTotalAmount>" + this + "</ram:ChargeTotalAmount>\n"
                + "                <!-- BT-107 Sum of allowances on document level -->\n"
                + "                <ram:AllowanceTotalAmount>" + this + "</ram:AllowanceTotalAmount>\n"
                + "                <!-- BT-109 Invoice total amount without VAT -->\n"
                + "                <ram:TaxBasisTotalAmount>" + this + "</ram:TaxBasisTotalAmount>\n"
                + "                <!-- BT-110 Invoice total VAT amount und BT-111 Invoice total VAT amount in accounting currency -->\n"
                + "                <ram:TaxTotalAmount currencyID=\"EUR\"></ram:TaxTotalAmount>\n"
                + "                <!-- BT-114 Rounding amount -->\n"
                + "                <ram:RoundingAmount>" + this + "</ram:RoundingAmount>\n"
                + "                <!-- BT-112 Invoice total amount with VAT -->\n"
                + "                <ram:GrandTotalAmount>" + this + "</ram:GrandTotalAmount>\n"
                + "                <!-- BT-113 Paid amount -->\n"
                + "                <ram:TotalPrepaidAmount>" + this + "</ram:TotalPrepaidAmount>\n"
                + "                <!-- BT-115 Amount due for payment -->\n"
                + "                <ram:DuePayableAmount>" + this + "</ram:DuePayableAmount>                \n"
                + "            </ram:SpecifiedTradeSettlementHeaderMonetarySummation>\n"
                + "            <ram:InvoiceReferencedDocument>\n"
                + "                <!-- BT-25 Preceding Invoice number -->\n"
                + "                <ram:IssuerAssignedID>" + this + "</ram:IssuerAssignedID>   \n"
                + "                <!-- BT-26 Preceding Invoice issue date -->\n"
                + "                <ram:FormattedIssueDateTime>\n"
                + "                    <qdt:DateTimeString format=\"102\">" + this + "</qdt:DateTimeString>\n"
                + "                </ram:FormattedIssueDateTime>\n"
                + "            </ram:InvoiceReferencedDocument>\n"
                + "            <!-- BT-19 Buyer accounting reference -->\n"
                + "            <ram:ReceivableSpecifiedTradeAccountingAccount>\n"
                + "                <ram:ID>" + this + "</ram:ID>\n"
                + "            </ram:ReceivableSpecifiedTradeAccountingAccount>           \n"
                + "        </ram:ApplicableHeaderTradeSettlement>  \n"
                + "    </rsm:SupplyChainTradeTransaction>\n"
                + "   </rsm:CrossIndustryInvoice>";
        
        return "";
    }

    public String getBusinessProcessType() {
        return businessProcessType;
    }

    public String getSpecificationIdentifier() {
        return specificationIdentifier;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    public String getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    public String getInvoiceNote() {
        return invoiceNote;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public String getInvoiceLineIdentifier() {
        return invoiceLineIdentifier;
    }

    public String getInvoiceLineNote() {
        return invoiceLineNote;
    }

    public String getItemStandardIdentifier() {
        return itemStandardIdentifier;
    }

    public String getItemStandardIdentifierIdentificationSchemeIdentifier() {
        return itemStandardIdentifierIdentificationSchemeIdentifier;
    }

    public String getItemSellersIdentifier() {
        return itemSellersIdentifier;
    }

    public String getItemBuyersIdentifier() {
        return itemBuyersIdentifier;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescreption() {
        return itemDescreption;
    }

    public String getItemAttributeName() {
        return itemAttributeName;
    }

    public String getItemAttributeValue() {
        return itemAttributeValue;
    }

    public String getItemClassificationIdentifier() {
        return itemClassificationIdentifier;
    }

    public String getItemClassificationIdentifierIdentificationSchemeIdentifier() {
        return itemClassificationIdentifierIdentificationSchemeIdentifier;
    }

    public String getSchemeVersionIdentifer() {
        return schemeVersionIdentifer;
    }

    public String getItemCountryOfOrigin() {
        return itemCountryOfOrigin;
    }

    public String getReferencedPurchaseOrderLineReference() {
        return referencedPurchaseOrderLineReference;
    }

    public String getItemPriceDiscount() {
        return itemPriceDiscount;
    }

    public String getItemPriceaseQuantity() {
        return itemPriceaseQuantity;
    }

    public String getItemPriceaseQuantityUnitOfMeasureCode() {
        return itemPriceaseQuantityUnitOfMeasureCode;
    }

    public String getInvoicedQuantity() {
        return invoicedQuantity;
    }

    public String getInvoicedQuantityUnitOfMeasure() {
        return invoicedQuantityUnitOfMeasure;
    }

    public String getInvoicedItemVATtypeCode() {
        return invoicedItemVATtypeCode;
    }

    public String getInvoicedItemVATcategoryCode() {
        return invoicedItemVATcategoryCode;
    }

    public String getInvoicedItemVATrate() {
        return invoicedItemVATrate;
    }

    public String getInvoiceLinePeriodStartDate() {
        return invoiceLinePeriodStartDate;
    }

    public String getInvoiceLinePeriodEndDate() {
        return invoiceLinePeriodEndDate;
    }

    public String getInvoiseLineCharges() {
        return invoiseLineCharges;
    }

    public String getInvoiceLineChargePercentage() {
        return invoiceLineChargePercentage;
    }

    public String getInvoiceLineChargeChargeAmount() {
        return invoiceLineChargeChargeAmount;
    }

    public String getInvoiceLineChargeReasonCode() {
        return invoiceLineChargeReasonCode;
    }

    public String getInvoiceLineChargeReason() {
        return invoiceLineChargeReason;
    }

    public String getInvoiceLineAllowances() {
        return invoiceLineAllowances;
    }

    public String getInvoiceLineAllowancePercentage() {
        return invoiceLineAllowancePercentage;
    }

    public String getInvoiceLineAllowanceBaseAmount() {
        return invoiceLineAllowanceBaseAmount;
    }

    public String getInvoiceLineAllowancesReasonCode() {
        return invoiceLineAllowancesReasonCode;
    }

    public String getInvoiceLineAllowancesReason() {
        return invoiceLineAllowancesReason;
    }

    public String getInvoiceLineNetAmount() {
        return invoiceLineNetAmount;
    }

    public String getInvoiceLineObjectIdentifier() {
        return invoiceLineObjectIdentifier;
    }

    public String getInvoiceLineObjectTypeCode() {
        return invoiceLineObjectTypeCode;
    }

    public String getInvoiceLineObjectIdentifierSchemeIdentifier() {
        return invoiceLineObjectIdentifierSchemeIdentifier;
    }

    public String getInvoiceLineBuyerAccountingReference() {
        return invoiceLineBuyerAccountingReference;
    }

    public String getBuyerReference() {
        return buyerReference;
    }

    public String getSellerIdentifier() {
        return sellerIdentifier;
    }

    public String getSellerIdentifierIdentificationSchemeIdentifier() {
        return sellerIdentifierIdentificationSchemeIdentifier;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getSellerAdditionalLegalInformation() {
        return sellerAdditionalLegalInformation;
    }

    public String getSellerLegalRegistrationIdentifier() {
        return sellerLegalRegistrationIdentifier;
    }

    public String getSellerLegalRegistrationIdentifierIdentificationSchemeIdentifier() {
        return sellerLegalRegistrationIdentifierIdentificationSchemeIdentifier;
    }

    public String getSellerTradingName() {
        return sellerTradingName;
    }

    public String getSellerContactPoint() {
        return sellerContactPoint;
    }

    public String getSellerContactDpartmentPoint() {
        return sellerContactDpartmentPoint;
    }

    public String getSellerContactTelephonenumber() {
        return sellerContactTelephonenumber;
    }

    public String getSellerContactEmailaddress() {
        return sellerContactEmailaddress;
    }

    public String getSellerPostcode() {
        return sellerPostcode;
    }

    public String getSellerAddressline1() {
        return sellerAddressline1;
    }

    public String getSellerAddressline2() {
        return sellerAddressline2;
    }

    public String getSellerAddressline3() {
        return sellerAddressline3;
    }

    public String getSellerCity() {
        return sellerCity;
    }

    public String getSellerCountryCodes() {
        return sellerCountryCodes;
    }

    public String getSellerCountrySubdivision() {
        return sellerCountrySubdivision;
    }

    public String getSellerElectronicaddress() {
        return sellerElectronicaddress;
    }

    public String getSellerElectronicaddressIdentificationSchemeIdentifier() {
        return sellerElectronicaddressIdentificationSchemeIdentifier;
    }

    public String getSellerVATidentifier() {
        return sellerVATidentifier;
    }

    public String getSellerTaxregistrationIdentifier() {
        return sellerTaxregistrationIdentifier;
    }

    public String getBuyerIdentifier() {
        return buyerIdentifier;
    }

    public String getBuyerIdentifierIdentificationSchemeIdentifier() {
        return buyerIdentifierIdentificationSchemeIdentifier;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getBuyerLegalRegistrationIdentifier() {
        return buyerLegalRegistrationIdentifier;
    }

    public String getBuyerLegalRegistrationIdentifierIdentificationSchemeIdentifier() {
        return buyerLegalRegistrationIdentifierIdentificationSchemeIdentifier;
    }

    public String getBuyerTradingName() {
        return buyerTradingName;
    }

    public String getBuyerContactPoint() {
        return buyerContactPoint;
    }

    public String getBuyerContactDpartmentPoint() {
        return buyerContactDpartmentPoint;
    }

    public String getBuyerContactTelephonenumber() {
        return buyerContactTelephonenumber;
    }

    public String getBuyerContactEmailaddress() {
        return buyerContactEmailaddress;
    }

    public String getBuyerPostcode() {
        return buyerPostcode;
    }

    public String getBuyerAddressline1() {
        return buyerAddressline1;
    }

    public String getBuyerAddressline2() {
        return buyerAddressline2;
    }

    public String getBuyerAddressline3() {
        return buyerAddressline3;
    }

    public String getBuyerCity() {
        return buyerCity;
    }

    public String getBuyerCountryCodes() {
        return buyerCountryCodes;
    }

    public String getBuyerCountrySubdivision() {
        return buyerCountrySubdivision;
    }

    public String getBuyerElectronicaddress() {
        return buyerElectronicaddress;
    }

    public String getBuyerElectronicaddressIdentificationSchemeIdentifier() {
        return buyerElectronicaddressIdentificationSchemeIdentifier;
    }

    public String getBuyerVATidentifier() {
        return buyerVATidentifier;
    }

    public String getSellerTaxRepresentativeName() {
        return sellerTaxRepresentativeName;
    }

    public String getSellerTaxRepresentativeVATidentifier() {
        return sellerTaxRepresentativeVATidentifier;
    }

    public String getTaxRepresentativePostcode() {
        return taxRepresentativePostcode;
    }

    public String getTaxRepresentativeAddressline1() {
        return taxRepresentativeAddressline1;
    }

    public String getTaxRepresentativeAddressline2() {
        return taxRepresentativeAddressline2;
    }

    public String getTaxRepresentativeAddressline3() {
        return taxRepresentativeAddressline3;
    }

    public String getTaxRepresentativeCity() {
        return taxRepresentativeCity;
    }

    public String getTaxRepresentativeCountryCode() {
        return taxRepresentativeCountryCode;
    }

    public String getTaxRepresentativeCountrySubdivision() {
        return taxRepresentativeCountrySubdivision;
    }

    public String getSalesOrderReference() {
        return salesOrderReference;
    }

    public String getPurchaseOrderReference() {
        return purchaseOrderReference;
    }

    public String getContractReference() {
        return contractReference;
    }

    public String getTenderOrLotReference() {
        return tenderOrLotReference;
    }

    public String getTenderOrLotReferenceTypeCode() {
        return tenderOrLotReferenceTypeCode;
    }

    public String getInvoicedObjectIdentifier() {
        return invoicedObjectIdentifier;
    }

    public String getInvoicedObjectTypeCode() {
        return invoicedObjectTypeCode;
    }

    public String getInvoicedObjectSchemeIdentifier() {
        return invoicedObjectSchemeIdentifier;
    }

    public String getSupportingDocumentReference() {
        return supportingDocumentReference;
    }

    public String getExternalDocumentLocation() {
        return externalDocumentLocation;
    }

    public String getSupportingDocumentTypeCode() {
        return supportingDocumentTypeCode;
    }

    public String getSupportingDocumentDescription() {
        return supportingDocumentDescription;
    }

    public String getAttachedDocument() {
        return attachedDocument;
    }

    public String getAttachedDocumentMimecode() {
        return attachedDocumentMimecode;
    }

    public String getAttachedDocumentFilename() {
        return attachedDocumentFilename;
    }

    public String getProjectReference() {
        return projectReference;
    }

    public String getDeliverToLocationIdentifier() {
        return deliverToLocationIdentifier;
    }

    public String getDeliverToLocationIdentifierIdentificationSchemeIdentifier() {
        return deliverToLocationIdentifierIdentificationSchemeIdentifier;
    }

    public String getDeliverToPartyname() {
        return deliverToPartyname;
    }

    public String getDeliverToPostcode() {
        return deliverToPostcode;
    }

    public String getDeliverToAddressline1() {
        return deliverToAddressline1;
    }

    public String getDeliverToAddressline2() {
        return deliverToAddressline2;
    }

    public String getDeliverToAddressline3() {
        return deliverToAddressline3;
    }

    public String getDeliverToCity() {
        return deliverToCity;
    }

    public String getDeliverToCountryCode() {
        return deliverToCountryCode;
    }

    public String getDeliverToCountrySubdivision() {
        return deliverToCountrySubdivision;
    }

    public String getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public String getDespatchAdviceReference() {
        return despatchAdviceReference;
    }

    public String getReceivingAdviceReference() {
        return receivingAdviceReference;
    }

    public String getBankAssignedCreditorIdentifier() {
        return bankAssignedCreditorIdentifier;
    }

    public String getRemittanceInformation() {
        return remittanceInformation;
    }

    public String getVatAccountingCurrencyCode() {
        return vatAccountingCurrencyCode;
    }

    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public String getPayeeIdentifier() {
        return payeeIdentifier;
    }

    public String getPayeeIdentifierIdentificationSchemeIdentifier() {
        return payeeIdentifierIdentificationSchemeIdentifier;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public String getPayeeLegalRegistrationIdentifier() {
        return payeeLegalRegistrationIdentifier;
    }

    public String getPayeeLegalRegistrationIdentifierIdentificationSchemeIdentifier() {
        return payeeLegalRegistrationIdentifierIdentificationSchemeIdentifier;
    }

    public String getPaymentMeansTypeCode() {
        return paymentMeansTypeCode;
    }

    public String getPaymentMeansText() {
        return paymentMeansText;
    }

    public String getPaymentCardPrimaryAccountNumber() {
        return paymentCardPrimaryAccountNumber;
    }

    public String getPaymentCardHolderName() {
        return paymentCardHolderName;
    }

    public String getDebitedAccountIdentifier() {
        return debitedAccountIdentifier;
    }

    public String getPaymentAccountIdentifier() {
        return paymentAccountIdentifier;
    }

    public String getPaymentAccountName() {
        return paymentAccountName;
    }

    public String getPaymentAccountIdentifierProprietaryID() {
        return paymentAccountIdentifierProprietaryID;
    }

    public String getPaymentServiceProviderIdentifier() {
        return paymentServiceProviderIdentifier;
    }

    public String getVatCategoryTaxAmount() {
        return vatCategoryTaxAmount;
    }

    public String getVatExemptionReasonText() {
        return vatExemptionReasonText;
    }

    public String getVatCategoryTaxableAmount() {
        return vatCategoryTaxableAmount;
    }

    public String getVatCategoryCode() {
        return vatCategoryCode;
    }

    public String getVatExemptionReasonCode() {
        return vatExemptionReasonCode;
    }

    public String getValueAddedTaxpointDate() {
        return valueAddedTaxpointDate;
    }

    public String getValueAddedTaxpointDateCode() {
        return valueAddedTaxpointDateCode;
    }

    public String getVatCategoryRate() {
        return vatCategoryRate;
    }

    public String getInvoicingPeriodStartDate() {
        return invoicingPeriodStartDate;
    }

    public String getInvoicingPeriodEndDate() {
        return invoicingPeriodEndDate;
    }

    public String getDocumentLevelCharges() {
        return documentLevelCharges;
    }

    public String getDocumentLevelChargePercentage() {
        return documentLevelChargePercentage;
    }

    public String getDocumentLevelChargeBaseAmount() {
        return documentLevelChargeBaseAmount;
    }

    public String getDocumentLevelChargeAmount() {
        return documentLevelChargeAmount;
    }

    public String getDocumentLevelChargereasonCode() {
        return documentLevelChargereasonCode;
    }

    public String getDocumentLevelChargeReason() {
        return documentLevelChargeReason;
    }

    public String getDocumentLevelChargeVATtypeCode() {
        return documentLevelChargeVATtypeCode;
    }

    public String getDocumentLevelChargeVATcategoryCode() {
        return documentLevelChargeVATcategoryCode;
    }

    public String getDocumentLevelChargeVATrate() {
        return documentLevelChargeVATrate;
    }

    public String getDocumentLevelAllowances() {
        return documentLevelAllowances;
    }

    public String getDocumentLevelAllowancePercentage() {
        return documentLevelAllowancePercentage;
    }

    public String getDocumentLevelAllowanceBaseAmount() {
        return documentLevelAllowanceBaseAmount;
    }

    public String getDocumentLevelAllowanceAmounts() {
        return documentLevelAllowanceAmounts;
    }

    public String getDocumentLevelAllowanceReasonCode() {
        return documentLevelAllowanceReasonCode;
    }

    public String getDocumentLevelAllowanceReason() {
        return documentLevelAllowanceReason;
    }

    public String getDocumentLevelAllowanceVATtypeCode() {
        return documentLevelAllowanceVATtypeCode;
    }

    public String getDocumentLevelAllowanceVATcategoryCode() {
        return documentLevelAllowanceVATcategoryCode;
    }

    public String getDocumentLevelAllowanceVATrate() {
        return documentLevelAllowanceVATrate;
    }

    public String getPaymentTermsDescription() {
        return paymentTermsDescription;
    }

    public String getPaymentDueDate() {
        return paymentDueDate;
    }

    public String getMandateReferenceIdentifier() {
        return mandateReferenceIdentifier;
    }

    public String getSumOfInvoiceLineNetAmount() {
        return sumOfInvoiceLineNetAmount;
    }

    public String getSumOfAllowancesOnDocumentLevel() {
        return sumOfAllowancesOnDocumentLevel;
    }

    public String getInvoiceTotalAmountWithoutVAT() {
        return invoiceTotalAmountWithoutVAT;
    }

    public String getInvoiceTotalVATamount() {
        return invoiceTotalVATamount;
    }

    public String getInvoiceTotalVATamountInAccountingCurrency() {
        return invoiceTotalVATamountInAccountingCurrency;
    }

    public String getRoundingAmount() {
        return roundingAmount;
    }

    public String getInvoiceTotalAmountVithVAT() {
        return invoiceTotalAmountVithVAT;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public String getAmountDueForPayment() {
        return amountDueForPayment;
    }

    public String getPrecedingInvoiceNumber() {
        return precedingInvoiceNumber;
    }

    public String getPrecedingInvoiceIssueDate() {
        return precedingInvoiceIssueDate;
    }

    public String getBuyerAccountingReference() {
        return buyerAccountingReference;
    }

    
    
}
