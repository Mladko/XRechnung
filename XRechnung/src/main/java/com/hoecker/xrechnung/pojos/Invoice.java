/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

import java.util.Date;

/**
 *
 * @author Sikiric
 */
public class Invoice {

    //Attributes
    private Long invoiceNumber;
    private Date issueDate;
    private String invoiceTypeCode;
    private String invoiceCurrencyCode;
    private String vatAccountingCurrencyCode;
    private Date valueAddedTaxPointDate;
    private String valueAddedTaxPointCode;
    private Date paymendDueDate;
    private String buyerReference;
    private String projectReference;
    private String contractReference;
    private String purchaseOrderReference;
    private String salesorderReference;
    private String receivingAdvieReference;
    private String desptachAdviceReference;
    private String tenderOrLotReference;
    private String invoicedObjectIdentifier;
    private String buyerAccountingReference;
    private String paymentTerms;

    //Classes
    private InvoiceNote invoiceNote;
    private ProcessControl processControl;
    private PrecedingInvoiceReference precedingInvoiceReference;
    private Seller seller;
    private Buyer buyer;
    private Payee payee;
    private SellerTaxRepresentativeParty sellerTaxRepresentativeParty;
    private DeliveryInformation deliveryInformation;
    private PaymentInstructions paymentInstructions;
    private DocumentLevelAllowances documentLevelAllowances;
    private DocumentLevelCharges documentLevelCharges;
    private DocumentTotals documentTotals;
    private VatBreakdown vatBreakdown;
    private AdditionalSupportingDocument additionalSupportingDocument;
    private InvoiceLine invoiceLine;

    public Invoice(Long invoiceNumber, Date issueDate, String invoiceTypeCode, String invoiceCurrencyCode, String buyerReference) {
        this.invoiceNumber = invoiceNumber;
        this.issueDate = issueDate;
        this.invoiceTypeCode = invoiceTypeCode;
        this.invoiceCurrencyCode = invoiceCurrencyCode;
        this.buyerReference = buyerReference;
    }

    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getVatAccountingCurrencyCode() {
        return vatAccountingCurrencyCode;
    }
    
    public void setVatAccountingCurrencyCode(String vatAccountingCurrencyCode) {
        this.vatAccountingCurrencyCode = vatAccountingCurrencyCode;
    }
    
    public Date getValueAddedTaxPointDate() {
        return valueAddedTaxPointDate;
    }
    
    public void setValueAddedTaxPointDate(Date valueAddedTaxPointDate) {
        this.valueAddedTaxPointDate = valueAddedTaxPointDate;
    }
    
    public String getValueAddedTaxPointCode() {
        return valueAddedTaxPointCode;
    }
    
    public void setValueAddedTaxPointCode(String valueAddedTaxPointCode) {
        this.valueAddedTaxPointCode = valueAddedTaxPointCode;
    }
    
    public Date getPaymendDueDate() {
        return paymendDueDate;
    }
    
    public void setPaymendDueDate(Date paymendDueDate) {
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
    
    public InvoiceNote getInvoiceNote() {
        return invoiceNote;
    }
    
    public void setInvoiceNote(InvoiceNote invoiceNote) {
        this.invoiceNote = invoiceNote;
    }
    
    public ProcessControl getProcessControl() {
        return processControl;
    }
    
    public void setProcessControl(ProcessControl processControl) {
        this.processControl = processControl;
    }
    
    public PrecedingInvoiceReference getPrecedingInvoiceReference() {
        return precedingInvoiceReference;
    }
    
    public void setPrecedingInvoiceReference(PrecedingInvoiceReference precedingInvoiceReference) {
        this.precedingInvoiceReference = precedingInvoiceReference;
    }
    
    public Seller getSeller() {
        return seller;
    }
    
    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    
    public Buyer getBuyer() {
        return buyer;
    }
    
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
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
    
    public PaymentInstructions getPaymentInstructions() {
        return paymentInstructions;
    }
    
    public void setPaymentInstructions(PaymentInstructions paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }
    
    public DocumentLevelAllowances getDocumentLevelAllowances() {
        return documentLevelAllowances;
    }
    
    public void setDocumentLevelAllowances(DocumentLevelAllowances documentLevelAllowances) {
        this.documentLevelAllowances = documentLevelAllowances;
    }
    
    public DocumentLevelCharges getDocumentLevelCharges() {
        return documentLevelCharges;
    }
    
    public void setDocumentLevelCharges(DocumentLevelCharges documentLevelCharges) {
        this.documentLevelCharges = documentLevelCharges;
    }
    
    public DocumentTotals getDocumentTotals() {
        return documentTotals;
    }
    
    public void setDocumentTotals(DocumentTotals documentTotals) {
        this.documentTotals = documentTotals;
    }
    
    public VatBreakdown getVatBreakdown() {
        return vatBreakdown;
    }
    
    public void setVatBreakdown(VatBreakdown vatBreakdown) {
        this.vatBreakdown = vatBreakdown;
    }
    
    public AdditionalSupportingDocument getAdditionalSupportingDocument() {
        return additionalSupportingDocument;
    }
    
    public void setAdditionalSupportingDocument(AdditionalSupportingDocument additionalSupportingDocument) {
        this.additionalSupportingDocument = additionalSupportingDocument;
    }
    
    public InvoiceLine getInvoiceLine() {
        return invoiceLine;
    }
    
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        this.invoiceLine = invoiceLine;
    }
//</editor-fold>
    
}
