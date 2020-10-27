/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.controller;

import com.hoecker.xrechnung.pojos.Buyer;
import com.hoecker.xrechnung.pojos.BuyerContact;
import com.hoecker.xrechnung.pojos.BuyerPostalAddress;
import com.hoecker.xrechnung.pojos.DocumentTotals;
import com.hoecker.xrechnung.pojos.Invoice;
import com.hoecker.xrechnung.pojos.InvoiceLine;
import com.hoecker.xrechnung.pojos.ItemInformation;
import com.hoecker.xrechnung.pojos.LineVATinformation;
import com.hoecker.xrechnung.pojos.PaymentInstructions;
import com.hoecker.xrechnung.pojos.PriceDetails;
import com.hoecker.xrechnung.pojos.ProcessControl;
import com.hoecker.xrechnung.pojos.Seller;
import com.hoecker.xrechnung.pojos.SellerContact;
import com.hoecker.xrechnung.pojos.SellerPostalAddress;
import com.hoecker.xrechnung.pojos.VatBreakdown;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private String itemNetPrice;
    private String itemPriceDiscount;
    private String itemPriceBaseQuantity;
    private String itemPriceBaseQuantityUnitOfMeasureCode;
    private String invoicedQuantity;
    private String invoicedQuantityUnitOfMeasure;
    private String invoicedItemVATtypeCode;
    private String invoicedItemVATcategoryCode;
    private String invoicedItemVATrate;
    private String invoiceLinePeriodStartDate;
    private String invoiceLinePeriodEndDate;
    private String invoiceLineCharges;
    private String invoiceLineChargePercentage;
    private String invoiceLineChargeBaseAmount;
    private String invoiceLineChargeAmount;
    private String invoiceLineChargeReasonCode;
    private String invoiceLineChargeReason;
    private String invoiceLineAllowances;
    private String invoiceLineAllowancePercentage;
    private String invoiceLineAllowanceBaseAmount;
    private String invoiceLineAllowanceAmount;
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
    private String sellerContactDepartmentPoint;
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
    private String buyerContactDepartmentPoint;
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
    private String projectName;
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
    private String vatTypeCode;
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
    private String sumOfChargesOnDocumentLevel;    
    private String sumOfAllowancesOnDocumentLevel;
    private String invoiceTotalAmountWithoutVAT;
    private String invoiceTotalVATamount;
    private String invoiceTotalVATamountInAccountingCurrency;
    private String roundingAmount;
    private String invoiceTotalAmountWithVAT;
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
    
    
    private Invoice createInvoice() {              
        
        ProcessControl processControl = new ProcessControl("specificationidentifier");
        SellerContact sellerContact = new SellerContact("Stadt", "Postleitzahl", "Land");
        SellerPostalAddress sellerPostalAddress = new SellerPostalAddress("Name des Kontakts", "Telefonnummer des Kontakts", "Emailadresse des Kontakts"); 
        Seller seller = new Seller("Firmenname", sellerContact, sellerPostalAddress);
        BuyerPostalAddress buyerPostalAddress = new BuyerPostalAddress("Name des Kontakts", "Telefonnummer des Kontakts", "Emailadresse des Kontakts"); 
        Buyer buyer = new Buyer("Firmenname", buyerPostalAddress);
        PaymentInstructions paymentInstructions = new PaymentInstructions("UN/ECE 4461");
        DocumentTotals documentTotals = new DocumentTotals("Summe aller netto Rechnungsbeträge", "Der Gesamtbetrag der Rechnung ohne Umsatzsteuer", "Der ausstehende Betrag inklusive Umsatzsteuer");
        List<VatBreakdown> vatBreakdownList = new ArrayList<>();        
        VatBreakdown vatBreakdown = new VatBreakdown("Summe aller zu versteuernden Beträge", 
                "Die Berechnung erfolgt durch Multiplikation des VAT category taxable amount mit der VAT categoryrate der jeweiligen VAT category",
                "Codierte Bezeichnung einer Umsatzsteuerkategorie: S, Z, E, AE, K, G, O, L, M",
                "Der Umsatzsteuersatz, angegeben als für die betreffende Umsatzsteuerkategorie geltender Prozentsatz. Null falls ohne");
        vatBreakdownList.add(vatBreakdown);
        List<InvoiceLine> invoiceLineList = new ArrayList<>();
        PriceDetails priceDetails = new PriceDetails("NettoPreis der Produkts");
        LineVATinformation lineVATinformation = new LineVATinformation("Codierte Bezeichnung einer Umsatzsteuerkategorie: S, Z, E, AE, K, G, O, L, M");
        ItemInformation itemInformation = new ItemInformation("Name des Produkts");
        InvoiceLine invoiceLine = new InvoiceLine("Bezeichner der Rechnungsposition", "Menge", "Maßeinheit",
                "Der Gesamtbetrag der Rechnungsposition ohne Umsatzsteuer", priceDetails, lineVATinformation, itemInformation);
        invoiceLineList.add(invoiceLine);
        Invoice i = new Invoice("Rechnungsnummer", new Date(), "380", "EUR", "Hier steht der Empfänger",
                    processControl, seller, buyer, paymentInstructions, documentTotals, vatBreakdownList, invoiceLineList);
        
        return i;   
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
                + "                <ram:LineID>" + this.getInvoiceLineIdentifier() + "</ram:LineID>                                                \n"
                + "                <ram:IncludedNote>     \n"
                + "                    <ram:Content>" + this.getInvoiceLineNote() + "</ram:Content>                   \n"
                + "                </ram:IncludedNote>                \n"
                + "            </ram:AssociatedDocumentLineDocument>\n"
                + "            <ram:SpecifiedTradeProduct>    \n"
                + "                <ram:GlobalID schemeID=\"" + this.getItemStandardIdentifierIdentificationSchemeIdentifier() + "\">"
                                   + this.getItemStandardIdentifier() + "</ram:GlobalID>\n"
                + "                <ram:SellerAssignedID>" + this.getItemSellersIdentifier() + "</ram:SellerAssignedID>\n"
                + "                <ram:BuyerAssignedID>" + this.getItemBuyersIdentifier() + "</ram:BuyerAssignedID>   \n"
                + "                <ram:Name>" + this.getItemName() + "</ram:Name>   \n"
                + "                <ram:Description>" + this.getItemDescreption() + "</ram:Description>  \n"
                + "                <ram:ApplicableProductCharacteristic>\n"
                + "                    <ram:Description>" + this.getItemAttributeName() + "</ram:Description>\n"
                + "                    <ram:Value>" + this.getItemAttributeValue() + "</ram:Value>                                                                                \n"
                + "                </ram:ApplicableProductCharacteristic>\n"
                + "                <ram:DesignatedProductClassification>\n"
                + "                    <ram:ClassCode listID=\"" + this.getItemClassificationIdentifierIdentificationSchemeIdentifier() 
                                        + "\" listVersionID=\"iioewrio\">" 
                                        + this.getItemClassificationIdentifier() + "</ram:ClassCode>\n"
                + "                </ram:DesignatedProductClassification>\n"
                + "                <ram:OriginTradeCountry>\n"
                + "                    <ram:ID>" + this.getItemCountryOfOrigin() + "</ram:ID>                    \n"
                + "                </ram:OriginTradeCountry>               \n"
                + "            </ram:SpecifiedTradeProduct>\n"
                + "            <ram:SpecifiedLineTradeAgreement>                \n"
                + "                <ram:BuyerOrderReferencedDocument> \n"
                + "                    <ram:LineID>" + this.getReferencedPurchaseOrderLineReference() + "</ram:LineID>                    \n"
                + "                </ram:BuyerOrderReferencedDocument>\n"
                + "                <ram:GrossPriceProductTradePrice>\n"
                + "                    <ram:ChargeAmount>" + this.getItemPriceDiscount() + "</ram:ChargeAmount>\n"
                + "                    <ram:BasisQuantity unitCode=\"" + this.getItemPriceBaseQuantityUnitOfMeasureCode() + "\">" 
                                        + this.getItemPriceBaseQuantity() + "</ram:BasisQuantity>\n"
                + "                    <ram:AppliedTradeAllowanceCharge>       \n"
                + "                        <ram:ActualAmount>" + this.getItemPriceDiscount() + "</ram:ActualAmount>\n"
                + "                    </ram:AppliedTradeAllowanceCharge>\n"
                + "                </ram:GrossPriceProductTradePrice>\n"
                + "                <ram:NetPriceProductTradePrice>\n"
                + "                    <ram:ChargeAmount>" + this.getItemNetPrice() + "</ram:ChargeAmount>\n"
                + "                    <ram:BasisQuantity unitCode=\"" + this.getItemPriceBaseQuantityUnitOfMeasureCode() + "\">" 
                                        + this.getItemPriceBaseQuantity() + "</ram:BasisQuantity>\n"
                + "                </ram:NetPriceProductTradePrice>\n"
                + "            </ram:SpecifiedLineTradeAgreement>\n"
                + "            <ram:SpecifiedLineTradeDelivery>     \n"
                + "                <ram:BilledQuantity unitCode=\"" + this.getInvoicedQuantityUnitOfMeasure() + "\">"
                                   + this.getInvoicedQuantity() + "</ram:BilledQuantity>\n"
                + "            </ram:SpecifiedLineTradeDelivery>\n"
                + "            <ram:SpecifiedLineTradeSettlement>                \n"
                + "                <ram:ApplicableTradeTax>\n"
                + "                    <ram:TypeCode>" + this.getInvoicedItemVATtypeCode() + "</ram:TypeCode>\n"
                + "                    <ram:CategoryCode>" + this.getInvoicedItemVATcategoryCode() + "</ram:CategoryCode>\n"
                + "                    <ram:RateApplicablePercent>" + this.getInvoicedItemVATrate() + "</ram:RateApplicablePercent>\n"
                + "                </ram:ApplicableTradeTax>\n"
                + "                <ram:BillingSpecifiedPeriod>   \n"
                + "                    <ram:StartDateTime>\n"
                + "                        <udt:DateTimeString format=\"102\">" + this.getInvoiceLinePeriodStartDate() + "</udt:DateTimeString>\n"
                + "                    </ram:StartDateTime>\n"
                + "                    <ram:EndDateTime>\n"
                + "                        <udt:DateTimeString format=\"102\">" + this.getInvoiceLinePeriodEndDate() + "</udt:DateTimeString>\n"
                + "                    </ram:EndDateTime>\n"
                + "                </ram:BillingSpecifiedPeriod>\n"
                + "                <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                    <ram:ChargeIndicator>                        \n"
                + "                        <udt:Indicator>" + this.getInvoiceLineCharges() + "</udt:Indicator>\n"
                + "                    </ram:ChargeIndicator>\n"
                + "                    <ram:CalculationPercent>" + this.getInvoiceLineChargePercentage() + "</ram:CalculationPercent>\n"
                + "                    <ram:BasisAmount>" + this.getInvoiceLineChargeBaseAmount() + "</ram:BasisAmount>\n"
                + "                    <ram:ActualAmount>" + this.getInvoiceLineChargeAmount() + "</ram:ActualAmount>\n"
                + "                    <ram:ReasonCode>" + this.getInvoiceLineChargeReasonCode() + "</ram:ReasonCode>\n"
                + "                    <ram:Reason>" + this.getInvoiceLineChargeReason() + "</ram:Reason>                    \n"
                + "                </ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                    <ram:ChargeIndicator>                        \n"
                + "                        <udt:Indicator>" + this.getInvoiceLineAllowances() + "</udt:Indicator>\n"
                + "                    </ram:ChargeIndicator>\n"
                + "                    <ram:CalculationPercent>" + this.getInvoiceLineAllowancePercentage() + "</ram:CalculationPercent>\n"
                + "                    <ram:BasisAmount>" + this.getInvoiceLineAllowanceBaseAmount() + "</ram:BasisAmount>\n"
                + "                    <ram:ActualAmount>" + this.getInvoiceLineAllowanceAmount() + "</ram:ActualAmount>\n"
                + "                    <ram:ReasonCode>" + this.getInvoiceLineAllowancesReasonCode() + "</ram:ReasonCode>\n"
                + "                    <ram:Reason>" + this.getInvoiceLineAllowancesReason() + "</ram:Reason>                    \n"
                + "                </ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <ram:SpecifiedTradeSettlementLineMonetarySummation>\n"
                + "                    <ram:LineTotalAmount>" + this.getInvoiceLineNetAmount() + "</ram:LineTotalAmount>                    \n"
                + "                </ram:SpecifiedTradeSettlementLineMonetarySummation>\n"
                + "                <ram:AdditionalReferencedDocument>\n"
                + "                    <ram:IssuerAssignedID>" + this.getInvoiceLineObjectIdentifier() + "</ram:IssuerAssignedID>\n"
                + "                    <ram:TypeCode>" + this.getInvoiceLineObjectTypeCode() + "</ram:TypeCode>\n"
                + "                    <ram:ReferenceTypeCode>" + this.getInvoiceLineObjectIdentifierSchemeIdentifier() + "</ram:ReferenceTypeCode>\n"
                + "                </ram:AdditionalReferencedDocument>\n"
                + "                <ram:ReceivableSpecifiedTradeAccountingAccount>\n"
                + "                    <ram:ID>" + this.getInvoiceLineBuyerAccountingReference() + "</ram:ID>                    \n"
                + "                </ram:ReceivableSpecifiedTradeAccountingAccount>\n"
                + "            </ram:SpecifiedLineTradeSettlement>\n"
                + "        </ram:IncludedSupplyChainTradeLineItem>\n"
                + "        <ram:ApplicableHeaderTradeAgreement>\n"
                + "            <ram:BuyerReference>" + this.getBuyerReference() + "</ram:BuyerReference>\n"
                + "            <ram:SellerTradeParty>\n"
                + "                <ram:ID>" + this.getSellerIdentifier() + "</ram:ID>     \n"                
                + "                <ram:GlobalID schemeID=\"" + this.getSellerIdentifierIdentificationSchemeIdentifier() + "\">"
                                   + this.getSellerIdentifier() + "</ram:GlobalID>   \n"
                + "                <ram:Name>" + this.getSellerName() + "</ram:Name>\n"
                + "                <ram:Description>" + this.getSellerAdditionalLegalInformation() + "</ram:Description>\n"
                + "                <ram:SpecifiedLegalOrganization>\n"
                + "                    <ram:ID schemeID=\"" + this.getSellerLegalRegistrationIdentifierIdentificationSchemeIdentifier() + "\">"
                                        + this.getSellerLegalRegistrationIdentifier() + "</ram:ID>\n"
                + "                    <ram:TradingBusinessName>" + this.getSellerTradingName() + "</ram:TradingBusinessName>                    \n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "                <ram:DefinedTradeContact>\n"
                + "                    <ram:PersonName>" + this.getSellerContactPoint() + "</ram:PersonName>\n"
                + "                    <ram:DepartmentName>" + this.getSellerContactDepartmentPoint() + "</ram:DepartmentName>\n"
                + "                    <ram:TelephoneUniversalCommunication>\n"
                + "                        <ram:CompleteNumber>" + this.getSellerContactTelephonenumber() + "</ram:CompleteNumber>\n"
                + "                    </ram:TelephoneUniversalCommunication>\n"
                + "                    <ram:EmailURIUniversalCommunication>\n"
                + "                        <ram:URIID>" + this.getSellerContactEmailaddress() + "</ram:URIID>                      \n"
                + "                    </ram:EmailURIUniversalCommunication>                    \n"
                + "                </ram:DefinedTradeContact>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <ram:PostcodeCode>" + this.getSellerPostcode() + "</ram:PostcodeCode>\n"
                + "                    <ram:LineOne>" + this.getSellerAddressline1() + "</ram:LineOne>\n"
                + "                    <ram:LineTwo>" + this.getSellerAddressline2() + "</ram:LineTwo>\n"
                + "                    <ram:LineThree>" + this.getSellerAddressline3() + "</ram:LineThree>\n"
                + "                    <ram:CityName>" + this.getSellerCity() + "</ram:CityName>\n"
                + "                    <ram:CountryID>" + this.getSellerCountryCodes() + "</ram:CountryID>\n"
                + "                    <ram:CountrySubDivisionName>" + this.getSellerCountrySubdivision() + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>\n"
                + "                <ram:URIUniversalCommunication>\n"
                + "                    <ram:URIID schemeID=\"" + this.getSellerElectronicaddressIdentificationSchemeIdentifier() + "\">"
                                        + this.getSellerElectronicaddress() + "</ram:URIID>\n"
                + "                </ram:URIUniversalCommunication>  \n"
                + "                <ram:SpecifiedTaxRegistration>\n"
                + "                    <ram:ID schemeID=\"VA\">" + this.getSellerVATidentifier() + "</ram:ID>                                \n"
                + "                </ram:SpecifiedTaxRegistration>   \n"
                + "                <ram:SpecifiedTaxRegistration>                    \n"
                + "                    <ram:ID schemeID=\"FC\">" + this.getSellerTaxregistrationIdentifier() + "</ram:ID>                  \n"
                + "                </ram:SpecifiedTaxRegistration>   \n"
                + "            </ram:SellerTradeParty>\n"
                + "            <ram:BuyerTradeParty>\n"
                + "                <ram:ID>" + this.getBuyerIdentifier() + "</ram:ID>\n"
                + "                <ram:GlobalID schemeID=\"" + this.getBuyerIdentifierIdentificationSchemeIdentifier() + "\">"
                                    + this.getBuyerIdentifier() + "</ram:GlobalID>\n"
                + "                <ram:Name>" + this.getBuyerName() + "</ram:Name>\n"
                + "                <ram:SpecifiedLegalOrganization>\n"
                + "                    <ram:ID schemeID=\"" + this.getBuyerLegalRegistrationIdentifierIdentificationSchemeIdentifier() + "\">"
                                        + this.getBuyerLegalRegistrationIdentifier() + "</ram:ID>\n"
                + "                    <ram:TradingBusinessName>" + this.getBuyerTradingName() + "</ram:TradingBusinessName>                    \n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "                <ram:DefinedTradeContact>\n"
                + "                    <ram:PersonName>" + this.getBuyerContactPoint() + "</ram:PersonName>\n"
                + "                    <ram:DepartmentName>" + this.getBuyerContactDepartmentPoint() + "</ram:DepartmentName>\n"
                + "                    <ram:TelephoneUniversalCommunication>\n"
                + "                        <ram:CompleteNumber>" + this.getBuyerContactTelephonenumber() + "</ram:CompleteNumber>\n"
                + "                    </ram:TelephoneUniversalCommunication>\n"
                + "                    <ram:EmailURIUniversalCommunication>\n"
                + "                        <ram:URIID>" + this.getBuyerContactEmailaddress() + "</ram:URIID>                      \n"
                + "                    </ram:EmailURIUniversalCommunication>                    \n"
                + "                </ram:DefinedTradeContact>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <ram:PostcodeCode>" + this.getBuyerPostcode() + "</ram:PostcodeCode>\n"
                + "                    <ram:LineOne>" + this.getBuyerAddressline1() + "</ram:LineOne>\n"
                + "                    <ram:LineTwo>" + this.getBuyerAddressline2() + "</ram:LineTwo>\n"
                + "                    <ram:LineThree>" + this.getBuyerAddressline3() + "</ram:LineThree>\n"
                + "                    <ram:CityName>" + this.getBuyerCity() + "</ram:CityName>\n"
                + "                    <ram:CountryID>" + this.getBuyerCountryCodes() + "</ram:CountryID>\n"
                + "                    <ram:CountrySubDivisionName>" + this.getBuyerCountrySubdivision() + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>\n"
                + "                <ram:URIUniversalCommunication>\n"
                + "                    <ram:URIID schemeID=\"" + this.getBuyerElectronicaddressIdentificationSchemeIdentifier() + "\">"
                                        + this.getBuyerElectronicaddress() + "</ram:URIID>\n"
                + "                </ram:URIUniversalCommunication>    \n"
                + "                <ram:SpecifiedTaxRegistration>\n"
                + "                    <ram:ID schemeID=\"VA\">" + this.getBuyerVATidentifier() + "</ram:ID>                    \n"
                + "                </ram:SpecifiedTaxRegistration>\n"
                + "            </ram:BuyerTradeParty>\n"
                + "            <ram:SellerTaxRepresentativeTradeParty>\n"
                + "                <ram:Name>" + this.getSellerTaxRepresentativeName() + "</ram:Name>\n"
                + "                <ram:SpecifiedLegalOrganization>  \n"
                + "                    <ram:ID schemeID=\"VA\">" + this.getSellerTaxRepresentativeVATidentifier() + "</ram:ID>\n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <ram:PostcodeCode>" + this.getTaxRepresentativePostcode() + "</ram:PostcodeCode>\n"
                + "                    <ram:LineOne>" + this.getTaxRepresentativeAddressline1() + "</ram:LineOne>\n"
                + "                    <ram:LineTwo>" + this.getTaxRepresentativeAddressline2() + "</ram:LineTwo>\n"
                + "                    <ram:LineThree>" + this.getTaxRepresentativeAddressline3() + "</ram:LineThree>\n"
                + "                    <ram:CityName>" + this.getTaxRepresentativeCity() + "</ram:CityName>\n"
                + "                    <ram:CountryID>" + this.getTaxRepresentativeCountryCode() + "</ram:CountryID>\n"
                + "                    <ram:CountrySubDivisionName>" + this.getTaxRepresentativeCountrySubdivision() + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>\n"
                + "            </ram:SellerTaxRepresentativeTradeParty>\n"
                + "            <ram:SellerOrderReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getSalesOrderReference() + "</ram:IssuerAssignedID>                \n"
                + "            </ram:SellerOrderReferencedDocument>\n"
                + "            <ram:BuyerOrderReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getPurchaseOrderReference() + "</ram:IssuerAssignedID>                \n"
                + "            </ram:BuyerOrderReferencedDocument>\n"
                + "            <ram:ContractReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getContractReference() + "</ram:IssuerAssignedID>                \n"
                + "            </ram:ContractReferencedDocument>            \n"
                + "            <ram:AdditionalReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getTenderOrLotReference() + "</ram:IssuerAssignedID>   \n"
                + "                <ram:TypeCode>" + this.getTenderOrLotReferenceTypeCode() + "</ram:TypeCode>                                \n"
                + "            </ram:AdditionalReferencedDocument>            \n"
                + "            <ram:AdditionalReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getInvoicedObjectIdentifier() + "</ram:IssuerAssignedID>  \n"
                + "                <ram:TypeCode>" + this.getInvoicedObjectTypeCode() + "</ram:TypeCode>  \n"
                + "                <ram:ReferenceTypeCode>" + this.getInvoicedObjectSchemeIdentifier() + "</ram:ReferenceTypeCode>\n"
                + "            </ram:AdditionalReferencedDocument>\n"
                + "            <ram:AdditionalReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getSupportingDocumentReference() + "</ram:IssuerAssignedID>  \n"
                + "                <ram:URIID>" + this.getExternalDocumentLocation() + "</ram:URIID>\n"
                + "                <ram:TypeCode>" + this.getSupportingDocumentTypeCode() + "</ram:TypeCode>\n"
                + "                <ram:Name>" + this.getSupportingDocumentDescription() + "</ram:Name>\n"
                + "                <ram:AttachmentBinaryObject mimeCode=\"" + this.getAttachedDocumentMimecode() 
                                    + "\" filename=\"" + this.getAttachedDocumentFilename() + "\">" 
                                    + this.getAttachedDocument() + "</ram:AttachmentBinaryObject>                \n"
                + "            </ram:AdditionalReferencedDocument>\n"
                + "            <ram:SpecifiedProcuringProject>                \n"
                + "                <ram:ID>" + this.getProjectReference() + "</ram:ID>\n"
                + "                <ram:Name>" + this.getProjectName() + "</ram:Name>\n"
                + "            </ram:SpecifiedProcuringProject>\n"
                + "        </ram:ApplicableHeaderTradeAgreement>\n"
                + "        <ram:ApplicableHeaderTradeDelivery>\n"
                + "            <ram:ShipToTradeParty>\n"
                + "                <ram:ID>" + this.getDeliverToLocationIdentifier() + "</ram:ID>    \n"
                + "                <ram:GlobalID schemeID=\"" + this.getDeliverToLocationIdentifierIdentificationSchemeIdentifier() + "\">" 
                                    + this.getDeliverToLocationIdentifier() + "</ram:GlobalID>\n"
                + "                <ram:Name>" + this.getDeliverToPartyname() + "</ram:Name>\n"
                + "                <ram:PostalTradeAddress>\n"
                + "                    <ram:PostcodeCode>" + this.getDeliverToPostcode() + "</ram:PostcodeCode>\n"
                + "                    <ram:LineOne>" + this.getDeliverToAddressline1() + "</ram:LineOne>\n"
                + "                    <ram:LineTwo>" + this.getDeliverToAddressline2() + "</ram:LineTwo>\n"
                + "                    <ram:LineThree>" + this.getDeliverToAddressline3() + "</ram:LineThree>\n"
                + "                    <ram:CityName>" + this.getDeliverToCity() + "</ram:CityName>\n"
                + "                    <ram:CountryID>" + this.getDeliverToCountryCode() + "</ram:CountryID>\n"
                + "                    <ram:CountrySubDivisionName>" + this.getDeliverToCountrySubdivision() + "</ram:CountrySubDivisionName>                    \n"
                + "                </ram:PostalTradeAddress>                \n"
                + "            </ram:ShipToTradeParty>            \n"
                + "            <ram:ActualDeliverySupplyChainEvent>     \n"
                + "                <ram:OccurrenceDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this.getActualDeliveryDate() + "</udt:DateTimeString>\n"
                + "                </ram:OccurrenceDateTime>\n"
                + "            </ram:ActualDeliverySupplyChainEvent>   \n"
                + "            <ram:DespatchAdviceReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getDespatchAdviceReference() + "</ram:IssuerAssignedID>\n"
                + "            </ram:DespatchAdviceReferencedDocument>\n"
                + "            <ram:ReceivingAdviceReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getReceivingAdviceReference() + "</ram:IssuerAssignedID>       \n"
                + "            </ram:ReceivingAdviceReferencedDocument>\n"
                + "        </ram:ApplicableHeaderTradeDelivery>\n"
                + "        <ram:ApplicableHeaderTradeSettlement>\n"
                + "            <ram:CreditorReferenceID>" + this.getBankAssignedCreditorIdentifier() + "</ram:CreditorReferenceID>\n"
                + "            <ram:PaymentReference>" + this.getRemittanceInformation() + "</ram:PaymentReference>\n"
                + "            <ram:TaxCurrencyCode>" + this.getVatAccountingCurrencyCode() + "</ram:TaxCurrencyCode>\n"
                + "            <ram:InvoiceCurrencyCode>" + this.getInvoiceCurrencyCode() + "</ram:InvoiceCurrencyCode>\n"
                + "            <ram:PayeeTradeParty>     \n"
                + "                <ram:ID>" + this.getPayeeIdentifier() + "</ram:ID>\n"
                + "                <ram:GlobalID schemeID=\"" + this.getPayeeIdentifierIdentificationSchemeIdentifier() + "\">" 
                                    + this.getPayeeIdentifier() + "</ram:GlobalID>    \n"
                + "                <ram:Name>" + this.getPayeeName() + "</ram:Name>\n"
                + "                <ram:SpecifiedLegalOrganization>                    \n"
                + "                    <ram:ID schemeID=\"" + this.getPayeeLegalRegistrationIdentifierIdentificationSchemeIdentifier() + "\">" 
                                        + this.getPayeeLegalRegistrationIdentifier() + "</ram:ID>\n"
                + "                </ram:SpecifiedLegalOrganization>\n"
                + "            </ram:PayeeTradeParty>                        \n"
                + "            <ram:SpecifiedTradeSettlementPaymentMeans>\n"
                + "                <ram:TypeCode>" + this.getPaymentMeansTypeCode() + "</ram:TypeCode>\n"
                + "                <ram:Information>" + this.getPaymentMeansText() + "</ram:Information>\n"
                + "                <ram:ApplicableTradeSettlementFinancialCard>   \n"
                + "                    <ram:ID>" + this.getPaymentCardPrimaryAccountNumber() + "</ram:ID>    \n"
                + "                    <ram:CardholderName>" + this.getPaymentCardHolderName() + "</ram:CardholderName>                    \n"
                + "                </ram:ApplicableTradeSettlementFinancialCard>\n"
                + "                <ram:PayerPartyDebtorFinancialAccount>\n"
                + "                    <ram:IBANID>" + this.getDebitedAccountIdentifier() + "</ram:IBANID>                    \n"
                + "                </ram:PayerPartyDebtorFinancialAccount>\n"
                + "                <ram:PayeePartyCreditorFinancialAccount>\n"
                + "                    <ram:IBANID>" + this.getPaymentAccountIdentifier() + "</ram:IBANID>\n"
                + "                    <ram:AccountName>" + this.getPaymentAccountName() + "</ram:AccountName>\n"
                + "                    <ram:ProprietaryID>" + this.getPaymentAccountIdentifierProprietaryID() + "</ram:ProprietaryID>\n"
                + "                </ram:PayeePartyCreditorFinancialAccount>\n"
                + "                <ram:PayeeSpecifiedCreditorFinancialInstitution>\n"
                + "                    <ram:BICID>" + this.getPaymentServiceProviderIdentifier() + "</ram:BICID>\n"
                + "                </ram:PayeeSpecifiedCreditorFinancialInstitution>                \n"
                + "            </ram:SpecifiedTradeSettlementPaymentMeans>                              \n"
                + "            <ram:ApplicableTradeTax>\n"
                + "                <ram:CalculatedAmount>" + this.getVatCategoryTaxAmount() + "</ram:CalculatedAmount>\n"
                + "                <ram:TypeCode>" + this.getVatTypeCode() + "</ram:TypeCode> \n"
                + "                <ram:ExemptionReason>" + this.getVatExemptionReasonText() + "</ram:ExemptionReason> \n"
                + "                <ram:BasisAmount>" + this.getVatCategoryTaxableAmount() + "</ram:BasisAmount>\n"
                + "                <ram:CategoryCode>" + this.getVatCategoryCode() + "</ram:CategoryCode>\n"
                + "                <ram:ExemptionReasonCode>" + this.getVatExemptionReasonCode() + "</ram:ExemptionReasonCode>      \n"
                + "                <ram:TaxPointDate>\n"
                + "                    <udt:DateString format=\"102\">" + this.getValueAddedTaxpointDate() + "</udt:DateString>                   \n"
                + "                </ram:TaxPointDate>\n"
                + "                <ram:DueDateTypeCode>" + this.getValueAddedTaxpointDateCode() + "</ram:DueDateTypeCode>          \n"
                + "                <ram:RateApplicablePercent>" + this.getVatCategoryRate() + "</ram:RateApplicablePercent>\n"
                + "            </ram:ApplicableTradeTax>\n"
                + "            <ram:BillingSpecifiedPeriod>  \n"
                + "                <ram:StartDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this.getInvoicingPeriodStartDate() + "</udt:DateTimeString>                    \n"
                + "                </ram:StartDateTime>\n"
                + "                <ram:EndDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this.getInvoicingPeriodEndDate() + "</udt:DateTimeString>                   \n"
                + "                </ram:EndDateTime>\n"
                + "            </ram:BillingSpecifiedPeriod>        \n"
                + "            <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <ram:ChargeIndicator>\n"
                + "                    <udt:Indicator>" + this.getDocumentLevelCharges() + "</udt:Indicator>\n"
                + "                </ram:ChargeIndicator>\n"
                + "                <ram:CalculationPercent>" + this.getDocumentLevelChargePercentage() + "</ram:CalculationPercent>\n"
                + "                <ram:BasisAmount>" + this.getDocumentLevelChargeBaseAmount() + "</ram:BasisAmount>\n"
                + "                <ram:ActualAmount>" + this.getDocumentLevelChargeAmount() + "</ram:ActualAmount>\n"
                + "                <ram:ReasonCode>" + this.getDocumentLevelChargereasonCode() + "</ram:ReasonCode>\n"
                + "                <ram:Reason>" + this.getDocumentLevelChargeReason() + "</ram:Reason>\n"
                + "                <ram:CategoryTradeTax>\n"
                + "                    <ram:TypeCode>" + this.getDocumentLevelChargeVATtypeCode() + "</ram:TypeCode>\n"
                + "                    <ram:CategoryCode>" + this.getDocumentLevelChargeVATcategoryCode() + "</ram:CategoryCode>\n"
                + "                    <ram:RateApplicablePercent>" + this.getDocumentLevelChargeVATrate() + "</ram:RateApplicablePercent>\n"
                + "                </ram:CategoryTradeTax>\n"
                + "            </ram:SpecifiedTradeAllowanceCharge>\n"
                + "            <ram:SpecifiedTradeAllowanceCharge>\n"
                + "                <ram:ChargeIndicator>\n"
                + "                    <udt:Indicator>" + this.getDocumentLevelAllowances() + "</udt:Indicator>\n"
                + "                </ram:ChargeIndicator>\n"
                + "                <ram:CalculationPercent>" + this.getDocumentLevelAllowancePercentage() + "</ram:CalculationPercent>\n"
                + "                <ram:BasisAmount>" + this.getDocumentLevelAllowanceBaseAmount() + "</ram:BasisAmount>\n"
                + "                <ram:ActualAmount>" + this.getDocumentLevelAllowanceAmounts() + "</ram:ActualAmount>\n"
                + "                <ram:ReasonCode>" + this.getDocumentLevelAllowanceReasonCode() + "</ram:ReasonCode>\n"
                + "                <ram:Reason>" + this.getDocumentLevelAllowanceReason() + "</ram:Reason>                \n"
                + "                <ram:CategoryTradeTax>\n"
                + "                    <ram:TypeCode>" + this.getDocumentLevelAllowanceVATtypeCode() + "</ram:TypeCode>\n"
                + "                    <ram:CategoryCode>" + this.getDocumentLevelAllowanceVATcategoryCode() + "</ram:CategoryCode>\n"
                + "                    <ram:RateApplicablePercent>" + this.getDocumentLevelAllowanceVATrate() + "</ram:RateApplicablePercent>\n"
                + "                </ram:CategoryTradeTax>\n"
                + "            </ram:SpecifiedTradeAllowanceCharge>                \n"
                + "            <ram:SpecifiedTradePaymentTerms>                \n"
                + "                <ram:Description>" + this.getPaymentTerms() + "</ram:Description>\n"
                + "                <ram:DueDateDateTime>\n"
                + "                    <udt:DateTimeString format=\"102\">" + this.getPaymentDueDate() + "</udt:DateTimeString>\n"
                + "                </ram:DueDateDateTime>            \n"
                + "                <ram:DirectDebitMandateID>" + this.getMandateReferenceIdentifier() + "</ram:DirectDebitMandateID>\n"
                + "            </ram:SpecifiedTradePaymentTerms>\n"
                + "            <ram:SpecifiedTradeSettlementHeaderMonetarySummation>\n"
                + "                <ram:LineTotalAmount>" + this.getSumOfInvoiceLineNetAmount() + "</ram:LineTotalAmount>\n"
                + "                <ram:ChargeTotalAmount>" + this.getSumOfChargesOnDocumentLevel() + "</ram:ChargeTotalAmount>\n"
                + "                <ram:AllowanceTotalAmount>" + this.getSumOfAllowancesOnDocumentLevel() + "</ram:AllowanceTotalAmount>\n"
                + "                <ram:TaxBasisTotalAmount>" + this.getInvoiceTotalAmountWithoutVAT() + "</ram:TaxBasisTotalAmount>\n"
                + "                <ram:TaxTotalAmount currencyID=\"" + this.getInvoiceTotalVATamountInAccountingCurrency() + "\">"
                                    + this.getInvoiceTotalVATamount() + "</ram:TaxTotalAmount>\n"
                + "                <ram:RoundingAmount>" + this.getRoundingAmount() + "</ram:RoundingAmount>\n"
                + "                <ram:GrandTotalAmount>" + this.getInvoiceTotalAmountWithVAT() + "</ram:GrandTotalAmount>\n"
                + "                <ram:TotalPrepaidAmount>" + this.getPaidAmount() + "</ram:TotalPrepaidAmount>\n"
                + "                <ram:DuePayableAmount>" + this.getAmountDueForPayment() + "</ram:DuePayableAmount>                \n"
                + "            </ram:SpecifiedTradeSettlementHeaderMonetarySummation>\n"
                + "            <ram:InvoiceReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getPrecedingInvoiceNumber() + "</ram:IssuerAssignedID>   \n"
                + "                <ram:FormattedIssueDateTime>\n"
                + "                    <qdt:DateTimeString format=\"102\">" + this.getPrecedingInvoiceIssueDate() + "</qdt:DateTimeString>\n"
                + "                </ram:FormattedIssueDateTime>\n"
                + "            </ram:InvoiceReferencedDocument>\n"
                + "            <ram:ReceivableSpecifiedTradeAccountingAccount>\n"
                + "                <ram:ID>" + this.getBuyerAccountingReference() + "</ram:ID>\n"
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

    public String getItemNetPrice() {
        return itemNetPrice;
    }    
    
    public String getItemPriceBaseQuantity() {
        return itemPriceBaseQuantity;
    }

    public String getItemPriceBaseQuantityUnitOfMeasureCode() {
        return itemPriceBaseQuantityUnitOfMeasureCode;
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

    public String getInvoiceLineCharges() {
        return invoiceLineCharges;
    }

    public String getInvoiceLineChargePercentage() {
        return invoiceLineChargePercentage;
    }

    public String getInvoiceLineChargeBaseAmount() {
        return invoiceLineChargeBaseAmount;
    }

    public String getInvoiceLineChargeAmount() {
        return invoiceLineChargeAmount;
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

    public String getInvoiceLineAllowanceAmount() {
        return invoiceLineAllowanceAmount;
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

    public String getSellerContactDepartmentPoint() {
        return sellerContactDepartmentPoint;
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

    public String getBuyerContactDepartmentPoint() {
        return buyerContactDepartmentPoint;
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

    public String getProjectName() {
        return projectName;
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

    public String getVatTypeCode() {
        return vatTypeCode;
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

    public String getSumOfChargesOnDocumentLevel() {
        return sumOfChargesOnDocumentLevel;
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

    public String getInvoiceTotalAmountWithVAT() {
        return invoiceTotalAmountWithVAT;
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
