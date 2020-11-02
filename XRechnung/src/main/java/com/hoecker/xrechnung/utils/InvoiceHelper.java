/*
 * Mladen Sikiric
 * Höcker Project Managers GmbH
 */
package com.hoecker.xrechnung.utils;

/**
 *
 * @author Sikiric
 */
public class InvoiceHelper {

    public static Object returnEmptyStringOnNull(Object o) {
        String emptyString = "";
        if (o != null) {
            if (o.equals("")) {
                return emptyString;
            } else {
                return o;
            }
        } else {
            return emptyString;
        }      
    }    
}
