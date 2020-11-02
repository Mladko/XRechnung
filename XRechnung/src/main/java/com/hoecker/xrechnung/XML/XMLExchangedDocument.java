/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.XML;

import com.hoecker.xrechnung.pojos.Invoice;
import com.hoecker.xrechnung.pojos.InvoiceNote;
import java.util.List;

/**
 *
 * @author Sikiric
 */
public class XMLExchangedDocument {

    //BT-1 MUSS
    private final String invoiceNumber;
    //BT-3 MUSS
    private final String invoiceTypeCode;
    //BT-2 MUSS
    private final String invoiceIssueDate;
    private List<InvoiceNote> invoiceNodeList;

    public XMLExchangedDocument(Invoice i) {
        this.invoiceNumber = i.getInvoiceNumber();
        this.invoiceTypeCode = i.getInvoiceTypeCode();
//        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");        
        this.invoiceIssueDate = i.getIssueDate();
    }

    public void setInvoiceNodeList(List<InvoiceNote> invoiceNodeList) {
        this.invoiceNodeList = invoiceNodeList;
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

    public List<InvoiceNote> getInvoiceNodeList() {
        return invoiceNodeList;
    }

    public String getXML() {
        String xml = "    <rsm:ExchangedDocument>\n"
                + "        <ram:ID>" + this.getInvoiceNumber() + "</ram:ID>    \n"
                + "        <ram:TypeCode>" + this.getInvoiceTypeCode() + "</ram:TypeCode>\n"
                + "        <ram:IssueDateTime>\n"
                + "            <udt:DateTimeString format=\"102\">" + this.getInvoiceIssueDate() + "</udt:DateTimeString>\n"
                + "        </ram:IssueDateTime>      \n";
        if (invoiceNodeList != null && !invoiceNodeList.isEmpty()) {
            for (InvoiceNote in : invoiceNodeList) {
                xml = xml + "        <ram:IncludedNote>     \n"
                        + "            <ram:Content>" + in.getInvoiceNote() + "</ram:Content>\n"
                        + "            <ram:SubjectCode>" + in.getPaymentTerms() + "</ram:SubjectCode>\n"
                        + "        </ram:IncludedNote>   \n";
            }
        }
        xml = xml + "    </rsm:ExchangedDocument>\n";
        return xml;
    }
}
