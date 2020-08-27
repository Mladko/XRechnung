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
public class AdditionalSupportingDocument {
    
    private final String supportingDocumentReference;
    private String supportingDocumentDescription;
    private String externalDocumentLocation;
    private String attachedDocument;
    
     public AdditionalSupportingDocument(String supportingDocumentReference) {
        this.supportingDocumentReference = supportingDocumentReference;
    }
     
    //<editor-fold defaultstate="collapsed" desc="Getter & Setter">

    public String getSupportingDocumentReference() {
        return supportingDocumentReference;
    }
   
    
    public String getSupportingDocumentDescription() {
        return supportingDocumentDescription;
    }
    
    public void setSupportingDocumentDescription(String supportingDocumentDescription) {
        this.supportingDocumentDescription = supportingDocumentDescription;
    }
    
    public String getExternalDocumentLocation() {
        return externalDocumentLocation;
    }
    
    public void setExternalDocumentLocation(String externalDocumentLocation) {
        this.externalDocumentLocation = externalDocumentLocation;
    }
    
    public String getAttachedDocument() {
        return attachedDocument;
    }
    
    public void setAttachedDocument(String attachedDocument) {
        this.attachedDocument = attachedDocument;
    }
}
//</editor-fold>
