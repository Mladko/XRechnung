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
public class PrecedingInvoiceReference {

    private final String precedingInvoiceReference;
    private String precedingInvoiceIssueDate = "";

    public PrecedingInvoiceReference(String precedingInvoiceReference) {
        this.precedingInvoiceReference = precedingInvoiceReference;
    }

    public String getPrecedingInvoiceReference() {
        return precedingInvoiceReference;
    }

    public String getPrecedingInvoiceIssueDate() {
        return precedingInvoiceIssueDate;
    }

    public void setPrecedingInvoiceIssueDate(String precedingInvoiceIssueDate) {
        this.precedingInvoiceIssueDate = precedingInvoiceIssueDate;
    }
    
    
}
