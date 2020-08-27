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
public class DirectDebt {
    
    private final String mandateReferenceIdentifier;
    private final String bankAssignedCreditorIdentifier;
    private final String debitedAccountIdentifier;

    public DirectDebt(String mandateReferenceIdentifier, String bankAssignedCreditorIdentifier, String debitedAccountIdentifier) {
        this.mandateReferenceIdentifier = mandateReferenceIdentifier;
        this.bankAssignedCreditorIdentifier = bankAssignedCreditorIdentifier;
        this.debitedAccountIdentifier = debitedAccountIdentifier;
    }

    public String getMandateReferenceIdentifier() {
        return mandateReferenceIdentifier;
    }

    public String getBankAssignedCreditorIdentifier() {
        return bankAssignedCreditorIdentifier;
    }

    public String getDebitedAccountIdentifier() {
        return debitedAccountIdentifier;
    }
    
    
}
