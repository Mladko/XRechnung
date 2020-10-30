/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;
import com.hoecker.xrechnung.pojos.VatBreakdown;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLApplicableTradeTax {

    private final List<VatBreakdown> vatBreakdownList;   
    private final String valueAddedTaxpointDate;
    public XMLApplicableTradeTax(Invoice i) {
        this.vatBreakdownList = i.getVatBreakdownList();    
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        this.valueAddedTaxpointDate = formatter.format(i.getValueAddedTaxPointDate());
    }
    
    public String getXML() {
        String xml = "";
        if (this.vatBreakdownList != null && !this.vatBreakdownList.isEmpty()){
            for (VatBreakdown vb : this.vatBreakdownList) {
                xml = xml + "            <ram:ApplicableTradeTax>\n"
                + "                <ram:CalculatedAmount>" + vb.getVATcategoryTaxAmount() + "</ram:CalculatedAmount>\n"
                + "                <ram:TypeCode>VAT</ram:TypeCode> \n";
                 if (!vb.getVATexemptionReasonText().equals("")) {
                     xml = xml + "                <ram:ExemptionReason>" + vb.getVATexemptionReasonText() + "</ram:ExemptionReason> \n";
                 }                
                xml = xml + "                <ram:BasisAmount>" + vb.getVATcategoryTaxableAmount() + "</ram:BasisAmount>\n"
                + "                <ram:CategoryCode>" + vb.getVATcategoryCode() + "</ram:CategoryCode>\n";
                if (!vb.getVATexemptionReasonCode().equals("")) {
                   xml = xml + "                <ram:ExemptionReasonCode>" + vb.getVATexemptionReasonCode() + "</ram:ExemptionReasonCode>\n";
                }                
                xml = xml + "                <ram:TaxPointDate>\n"
                + "                    <udt:DateString format=\"102\">" + this.getValueAddedTaxpointDate() + "</udt:DateString>\n"
                + "                </ram:TaxPointDate>\n"              
                + "                <ram:RateApplicablePercent>" + vb.getVATcategoryRate() + "</ram:RateApplicablePercent>\n"
                + "            </ram:ApplicableTradeTax>\n";
            }
        }
        return xml;
    }

    public List<VatBreakdown> getVatBreakdownList() {
        return vatBreakdownList;
    }

    public String getValueAddedTaxpointDate() {
        return valueAddedTaxpointDate;
    }

}
