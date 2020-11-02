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
public class VatBreakdown {

    private final String VATcategoryTaxableAmount;
    private final String VATcategoryTaxAmount;
    private final String VATcategoryCode;
    private final String VATcategoryRate;
    private String VATexemptionReasonText = "";
    private String VATexemptionReasonCode = "";

    public VatBreakdown(String VATcategoryTaxableAmount, String VATcategoryTaxAmount, String VATcategoryCode, String VATcategoryRate) {
        this.VATcategoryTaxableAmount = VATcategoryTaxableAmount;
        this.VATcategoryTaxAmount = VATcategoryTaxAmount;
        this.VATcategoryCode = VATcategoryCode;
        this.VATcategoryRate = VATcategoryRate;
    }
    
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getVATcategoryTaxableAmount() {
        return VATcategoryTaxableAmount;
    }
    
    public String getVATcategoryTaxAmount() {
        return VATcategoryTaxAmount;
    }
    
    public String getVATcategoryCode() {
        return VATcategoryCode;
    }
    
    public String getVATcategoryRate() {
        return VATcategoryRate;
    }
    
    public String getVATexemptionReasonText() {
        return VATexemptionReasonText;
    }
    
    public void setVATexemptionReasonText(String VATexemptionReasonText) {
        this.VATexemptionReasonText = VATexemptionReasonText;
    }
    
    public String getVATexemptionReasonCode() {
        return VATexemptionReasonCode;
    }
    
    public void setVATexemptionReasonCode(String VATexemptionReasonCode) {
        this.VATexemptionReasonCode = VATexemptionReasonCode;
    }
//</editor-fold>
    
}
