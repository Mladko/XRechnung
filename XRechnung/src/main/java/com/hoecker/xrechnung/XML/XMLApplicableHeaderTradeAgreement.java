/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;

/**
 *
 * @author Sikiric
 */
public class XMLApplicableHeaderTradeAgreement {

    private final String buyerReference;    
    private final String salesOrderReference;
    private final String purchaseOrderReference;
    private final String contractReference;
    //private final String tenderOrLotReference;
    //private final String tenderOrLotReferenceTypeCode;
    //private final String invoicedObjectIdentifier;
    //private final String invoicedObjectTypeCode;
    //private final String invoicedObjectSchemeIdentifier;
    //private final String supportingDocumentReference;
    //private final String externalDocumentLocation;
    //private final String supportingDocumentTypeCode;
    //private final String supportingDocumentDescription;
    //private final String attachedDocument;
    //private final String attachedDocumentMimecode;
    //private final String attachedDocumentFilename;
    private final String projectReference;
    private final String projectName;
    private final XMLSellerTradeParty sellerTradeParty;
    private final XMLBuyerTradeParty buyerTradeParty;
    private final XMLSellerTaxRepresentativeTradeParty sellerTaxRepresentativeTradeParty;

    public XMLApplicableHeaderTradeAgreement(Invoice i) {
        this.buyerReference = i.getBuyerReference();
        this.salesOrderReference = i.getSalesorderReference();
        this.purchaseOrderReference = i.getPurchaseOrderReference();
        this.contractReference = i.getContractReference();       
        this.projectReference = i.getProjectReference();
        this.projectName = "Project reference";
        this.sellerTradeParty = new XMLSellerTradeParty(i);
        this.buyerTradeParty = new XMLBuyerTradeParty(i);
        this.sellerTaxRepresentativeTradeParty = new XMLSellerTaxRepresentativeTradeParty(i);
    }  

    public String getXML() {
        String xml = "        <ram:ApplicableHeaderTradeAgreement>\n"
                + "            <ram:BuyerReference>" + this.getBuyerReference() + "</ram:BuyerReference>\n";
        xml = xml + sellerTradeParty.getXML();
        xml = xml + buyerTradeParty.getXML();
        xml = xml + sellerTaxRepresentativeTradeParty.getXML();
        if (!this.getSalesOrderReference().equals("")) {
            xml = xml + "            <ram:SellerOrderReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getSalesOrderReference() + "</ram:IssuerAssignedID>\n"
                + "            </ram:SellerOrderReferencedDocument>\n";
        }
        if (!this.getPurchaseOrderReference().equals("")) {
            xml = xml + "            <ram:BuyerOrderReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getPurchaseOrderReference() + "</ram:IssuerAssignedID>\n"
                + "            </ram:BuyerOrderReferencedDocument>\n";
        }
        if (!this.getContractReference().equals("")) {
            xml = xml + "            <ram:ContractReferencedDocument>\n"
                + "                <ram:IssuerAssignedID>" + this.getContractReference() + "</ram:IssuerAssignedID>\n"
                + "            </ram:ContractReferencedDocument>\n";
        }
        if (!this.getProjectReference().equals("")) {
            xml = xml + "            <ram:SpecifiedProcuringProject>                \n"
                + "                <ram:ID>" + this.getProjectReference() + "</ram:ID>\n"
                + "                <ram:Name>" + this.getProjectName() + "</ram:Name>\n"
                + "            </ram:SpecifiedProcuringProject>\n";
        }       
        xml = xml + "        </ram:ApplicableHeaderTradeAgreement>\n";
        return xml;
    }

    public String getBuyerReference() {
        return buyerReference;
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

    public String getProjectReference() {
        return projectReference;
    }

    public String getProjectName() {
        return projectName;
    }

    public XMLSellerTradeParty getSellerTradeParty() {
        return sellerTradeParty;
    }

    public XMLBuyerTradeParty getBuyerTradeParty() {
        return buyerTradeParty;
    }

    public XMLSellerTaxRepresentativeTradeParty getSellerTaxRepresentativeTradeParty() {
        return sellerTaxRepresentativeTradeParty;
    }

   
    
}
