/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

/**
 *
 * @author Sikiric
 */
public class DocumentLevelCharges {

    private final String documentLevelChargeAmount;
    private String documentLevelChargeBaseAmount;
    private String documentLevelChargePercentage;
    private final String documentLevelChargeVATcategoryCode;
    private String documentLevelChargeVATrate;
    private String documentLevelChargeReason;
    private String documentLevelChargeReasonCode;

    public DocumentLevelCharges(String documentLevelChargeAmount, String documentLevelChargeVATcategoryCode) {
        this.documentLevelChargeAmount = documentLevelChargeAmount;
        this.documentLevelChargeVATcategoryCode = documentLevelChargeVATcategoryCode;
    }
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getDocumentLevelChargeAmount() {
        return documentLevelChargeAmount;
    }
    
    public String getDocumentLevelChargeVATcategoryCode() {
        return documentLevelChargeVATcategoryCode;
    }
    
    public String getDocumentLevelChargeBaseAmount() {
        return documentLevelChargeBaseAmount;
    }
    
    public void setDocumentLevelChargeBaseAmount(String documentLevelChargeBaseAmount) {
        this.documentLevelChargeBaseAmount = documentLevelChargeBaseAmount;
    }
    
    public String getDocumentLevelChargePercentage() {
        return documentLevelChargePercentage;
    }
    
    public void setDocumentLevelChargePercentage(String documentLevelChargePercentage) {
        this.documentLevelChargePercentage = documentLevelChargePercentage;
    }
    
    public String getDocumentLevelChargeVATrate() {
        return documentLevelChargeVATrate;
    }
    
    public void setDocumentLevelChargeVATrate(String documentLevelChargeVATrate) {
        this.documentLevelChargeVATrate = documentLevelChargeVATrate;
    }
    
    public String getDocumentLevelChargeReason() {
        return documentLevelChargeReason;
    }
    
    public void setDocumentLevelChargeReason(String documentLevelChargeReason) {
        this.documentLevelChargeReason = documentLevelChargeReason;
    }
    
    public String getDocumentLevelChargeReasonCode() {
        return documentLevelChargeReasonCode;
    }
    
    public void setDocumentLevelChargeReasonCode(String documentLevelChargeReasonCode) {
        this.documentLevelChargeReasonCode = documentLevelChargeReasonCode;
    }
//</editor-fold>

   

}
