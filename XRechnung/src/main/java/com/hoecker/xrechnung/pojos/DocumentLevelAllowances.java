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
public class DocumentLevelAllowances {
    
    private final String documentLevelAllowancesAmount;
    private String documentLevelAllowancesBaseAmount;
    private String documentLevelAllowancesPercentages;
    private final String documentLevelAllowancesVATcategoryCode;
    private String documentLevelAllowancesVATrate;
    private String documentLevelAllowancesReason;
    private String documentLevelAllowancesReasonCode;

    public DocumentLevelAllowances(String documentLevelAllowancesAmount, String documentLevelAllowancesVATcategoryCode) {
        this.documentLevelAllowancesAmount = documentLevelAllowancesAmount;
        this.documentLevelAllowancesVATcategoryCode = documentLevelAllowancesVATcategoryCode;
    }

    
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getDocumentLevelAllowancesAmount() {
        return documentLevelAllowancesAmount;
    }
    
    public String getDocumentLevelAllowancesBaseAmount() {
        return documentLevelAllowancesBaseAmount;
    }
    
    public void setDocumentLevelAllowancesBaseAmount(String documentLevelAllowancesBaseAmount) {
        this.documentLevelAllowancesBaseAmount = documentLevelAllowancesBaseAmount;
    }
    
    public String getDocumentLevelAllowancesPercentages() {
        return documentLevelAllowancesPercentages;
    }
    
    public void setDocumentLevelAllowancesPercentages(String documentLevelAllowancesPercentages) {
        this.documentLevelAllowancesPercentages = documentLevelAllowancesPercentages;
    }
    
    public String getDocumentLevelAllowancesVATcategoryCode() {
        return documentLevelAllowancesVATcategoryCode;
    }
        
    public String getDocumentLevelAllowancesVATrate() {
        return documentLevelAllowancesVATrate;
    }
    
    public void setDocumentLevelAllowancesVATrate(String documentLevelAllowancesVATrate) {
        this.documentLevelAllowancesVATrate = documentLevelAllowancesVATrate;
    }
    
    public String getDocumentLevelAllowancesReason() {
        return documentLevelAllowancesReason;
    }
    
    public void setDocumentLevelAllowancesReason(String documentLevelAllowancesReason) {
        this.documentLevelAllowancesReason = documentLevelAllowancesReason;
    }
    
    public String getDocumentLevelAllowancesReasonCode() {
        return documentLevelAllowancesReasonCode;
    }
    
    public void setDocumentLevelAllowancesReasonCode(String documentLevelAllowancesReasonCode) {
        this.documentLevelAllowancesReasonCode = documentLevelAllowancesReasonCode;
    }
    
//</editor-fold>
}
