/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.pojos.XML;

import com.hoecker.xrechnung.pojos.Invoice;

/**
 *
 * @author Sikiric
 */
public class XMLExchangeDocumentContext {
    //BT-23
    private String businessProcessType;
    //BT-24 MUSS   
    private final String specificationIdentifier;

    public XMLExchangeDocumentContext(Invoice i) {
        this.specificationIdentifier = i.getProcessControl().getSpecificationidentifier();
    }

    public String getBusinessProcessType() {
        return businessProcessType;
    }

    public void setBusinessProcessType(String businessProcessType) {
        this.businessProcessType = businessProcessType;
    }

    public String getSpecificationIdentifier() {
        return specificationIdentifier;
    }
    
    public String getXML() {
        String xml = "    <rsm:ExchangedDocumentContext>\n";
        if (!this.getBusinessProcessType().equals("")) {
            xml = xml + 
                  "        <ram:BusinessProcessSpecifiedDocumentContextParameter>\n"
                + "            <ram:ID>" + this.getBusinessProcessType() + "</ram:ID>\n"
                + "        </ram:BusinessProcessSpecifiedDocumentContextParameter>\n";
        }
        xml = xml +  
                  "        <ram:GuidelineSpecifiedDocumentContextParameter>\n"
                + "            <ram:ID>" + this.getSpecificationIdentifier() + "</ram:ID>\n"
                + "        </ram:GuidelineSpecifiedDocumentContextParameter>\n"
                + "    </rsm:ExchangedDocumentContext>\n";
        return xml;
    }
}