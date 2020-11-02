/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class Invoice {

    //Attributes
    private final String invoiceNumber;
    private final String issueDate;
    private final String invoiceTypeCode;
    private final String invoiceCurrencyCode;
    private String vatAccountingCurrencyCode = "";
    private String valueAddedTaxPointDate = "";
    private String valueAddedTaxPointCode = "";
    private String paymendDueDate = "";
    private final String buyerReference;
    private String projectReference = "";
    private String contractReference = "";
    private String purchaseOrderReference = "";
    private String salesorderReference = "";
    private String receivingAdvieReference = "";
    private String desptachAdviceReference = "";
    private String tenderOrLotReference = "";
    private String invoicedObjectIdentifier = "";
    private String buyerAccountingReference = "";
    private String paymentTerms = "";
    //Classes
    private List<InvoiceNote> invoiceNoteList;
    private final ProcessControl processControl;
    private List <PrecedingInvoiceReference> precedingInvoiceReferenceList;
    private final Seller seller;
    private final Buyer buyer;
    private Payee payee;
    private SellerTaxRepresentativeParty sellerTaxRepresentativeParty;
    private DeliveryInformation deliveryInformation;
    private final PaymentInstructions paymentInstructions;
    private List<DocumentLevelAllowances> documentLevelAllowancesList;
    private List<DocumentLevelCharges> documentLevelChargesList;
    private final DocumentTotals documentTotals;
    private final List<VatBreakdown> vatBreakdownList;
    private List<AdditionalSupportingDocument> additionalSupportingDocumentList;
    private final List<InvoiceLine> invoiceLineList;

    public Invoice(String invoiceNumber, String issueDate, String invoiceTypeCode, String invoiceCurrencyCode, String buyerReference, ProcessControl processControl, Seller seller, Buyer buyer, PaymentInstructions paymentInstructions, DocumentTotals documentTotals, List<VatBreakdown> vatBreakdownList, List<InvoiceLine> invoiceLineList) {
//        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
//        formatter.format();
        
        this.additionalSupportingDocumentList = new ArrayList<>();
        this.documentLevelAllowancesList = new ArrayList<>();
        this.documentLevelChargesList = new ArrayList<>();
        this.deliveryInformation = new DeliveryInformation("", "", "");
        this.payee = new Payee("");
        this.invoiceNoteList = new ArrayList<>();
        this.precedingInvoiceReferenceList = new ArrayList<>();
        this.sellerTaxRepresentativeParty = new SellerTaxRepresentativeParty("", "", new SellerTaxRepresentativePostalAddress(""));
        this.invoiceNumber = invoiceNumber;
        this.issueDate = issueDate;
        this.invoiceTypeCode = invoiceTypeCode;
        this.invoiceCurrencyCode = invoiceCurrencyCode;
        this.buyerReference = buyerReference;
        this.processControl = processControl;
        this.seller = seller;
        this.buyer = buyer;
        this.paymentInstructions = paymentInstructions;
        this.documentTotals = documentTotals;
        this.vatBreakdownList = vatBreakdownList;
        this.invoiceLineList = invoiceLineList;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    public String getVatAccountingCurrencyCode() {
        return vatAccountingCurrencyCode;
    }
    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public String getIssueDate() {
        return issueDate;
    }
    
    public String getInvoiceTypeCode() {
        return invoiceTypeCode;
    }
    
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }
    
    public String getBuyerReference() {
        return buyerReference;
    }
    
    public ProcessControl getProcessControl() {
        return processControl;
    }
    
    public Seller getSeller() {
        return seller;
    }
    
    public Buyer getBuyer() {
        return buyer;
    }
    
    public PaymentInstructions getPaymentInstructions() {
        return paymentInstructions;
    }
    
    public DocumentTotals getDocumentTotals() {
        return documentTotals;
    }
    
    public List<VatBreakdown> getVatBreakdownList() {
        return vatBreakdownList;
    }
    
    public List<InvoiceLine> getInvoiceLineList() {
        return invoiceLineList;
    }
    
    public void setVatAccountingCurrencyCode(String vatAccountingCurrencyCode) {
        this.vatAccountingCurrencyCode = vatAccountingCurrencyCode;
    }
    
    public String getValueAddedTaxPointDate() {
        return valueAddedTaxPointDate;
    }
    
    public void setValueAddedTaxPointDate(String valueAddedTaxPointDate) {
        this.valueAddedTaxPointDate = valueAddedTaxPointDate;
    }
    
    public String getValueAddedTaxPointCode() {
        return valueAddedTaxPointCode;
    }
    
    public void setValueAddedTaxPointCode(String valueAddedTaxPointCode) {
        this.valueAddedTaxPointCode = valueAddedTaxPointCode;
    }
    
    public String getPaymendDueDate() {
        return paymendDueDate;
    }
    
    public void setPaymendDueDate(String paymendDueDate) {
        this.paymendDueDate = paymendDueDate;
    }
    
    public String getProjectReference() {
        return projectReference;
    }
    
    public void setProjectReference(String projectReference) {
        this.projectReference = projectReference;
    }
    
    public String getContractReference() {
        return contractReference;
    }
    
    public void setContractReference(String contractReference) {
        this.contractReference = contractReference;
    }
    
    public String getPurchaseOrderReference() {
        return purchaseOrderReference;
    }
    
    public void setPurchaseOrderReference(String purchaseOrderReference) {
        this.purchaseOrderReference = purchaseOrderReference;
    }
    
    public String getSalesorderReference() {
        return salesorderReference;
    }
    
    public void setSalesorderReference(String salesorderReference) {
        this.salesorderReference = salesorderReference;
    }
    
    public String getReceivingAdvieReference() {
        return receivingAdvieReference;
    }
    
    public void setReceivingAdvieReference(String receivingAdvieReference) {
        this.receivingAdvieReference = receivingAdvieReference;
    }
    
    public String getDesptachAdviceReference() {
        return desptachAdviceReference;
    }
    
    public void setDesptachAdviceReference(String desptachAdviceReference) {
        this.desptachAdviceReference = desptachAdviceReference;
    }
    
    public String getTenderOrLotReference() {
        return tenderOrLotReference;
    }
    
    public void setTenderOrLotReference(String tenderOrLotReference) {
        this.tenderOrLotReference = tenderOrLotReference;
    }
    
    public String getInvoicedObjectIdentifier() {
        return invoicedObjectIdentifier;
    }
    
    public void setInvoicedObjectIdentifier(String invoicedObjectIdentifier) {
        this.invoicedObjectIdentifier = invoicedObjectIdentifier;
    }
    
    public String getBuyerAccountingReference() {
        return buyerAccountingReference;
    }
    
    public void setBuyerAccountingReference(String buyerAccountingReference) {
        this.buyerAccountingReference = buyerAccountingReference;
    }
    
    public String getPaymentTerms() {
        return paymentTerms;
    }
    
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
    
    public List<InvoiceNote> getInvoiceNoteList() {
        return invoiceNoteList;
    }
    
    public void setInvoiceNoteList(List<InvoiceNote> invoiceNoteList) {
        this.invoiceNoteList = invoiceNoteList;
    }
    
    public List<PrecedingInvoiceReference> getPrecedingInvoiceReferenceList() {
        return precedingInvoiceReferenceList;
    }
    
    public void setPrecedingInvoiceReferenceList(List<PrecedingInvoiceReference> precedingInvoiceReferenceList) {
        this.precedingInvoiceReferenceList = precedingInvoiceReferenceList;
    }
    
    public Payee getPayee() {
        return payee;
    }
    
    public void setPayee(Payee payee) {
        this.payee = payee;
    }
    
    public SellerTaxRepresentativeParty getSellerTaxRepresentativeParty() {
        return sellerTaxRepresentativeParty;
    }
    
    public void setSellerTaxRepresentativeParty(SellerTaxRepresentativeParty sellerTaxRepresentativeParty) {
        this.sellerTaxRepresentativeParty = sellerTaxRepresentativeParty;
    }
    
    public DeliveryInformation getDeliveryInformation() {
        return deliveryInformation;
    }
    
    public void setDeliveryInformation(DeliveryInformation deliveryInformation) {
        this.deliveryInformation = deliveryInformation;
    }
    
    public List<DocumentLevelAllowances> getDocumentLevelAllowancesList() {
        return documentLevelAllowancesList;
    }
    
    public void setDocumentLevelAllowancesList(List<DocumentLevelAllowances> documentLevelAllowancesList) {
        this.documentLevelAllowancesList = documentLevelAllowancesList;
    }
    
    public List<DocumentLevelCharges> getDocumentLevelChargesList() {
        return documentLevelChargesList;
    }
    
    public void setDocumentLevelChargesList(List<DocumentLevelCharges> documentLevelChargesList) {
        this.documentLevelChargesList = documentLevelChargesList;
    }
    
    public List<AdditionalSupportingDocument> getAdditionalSupportingDocumentList() {
        return additionalSupportingDocumentList;
    }
    
    public void setAdditionalSupportingDocumentList(List<AdditionalSupportingDocument> additionalSupportingDocumentList) {
        this.additionalSupportingDocumentList = additionalSupportingDocumentList;
    }
//</editor-fold>
   
    
}
