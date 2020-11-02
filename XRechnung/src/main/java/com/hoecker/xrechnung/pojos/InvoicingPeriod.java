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
public class InvoicingPeriod {

    private final String periodStartDate;
    private final String periodEndDate;

    public InvoicingPeriod(String periodStartDate, String periodEndDate) {
        this.periodStartDate = periodStartDate;
        this.periodEndDate = periodEndDate;
    }

    public String getPeriodStartDate() {
        return periodStartDate;
    }

    public String getPeriodEndDate() {
        return periodEndDate;
    }

    
}
