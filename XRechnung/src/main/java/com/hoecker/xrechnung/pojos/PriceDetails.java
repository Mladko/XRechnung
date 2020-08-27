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
public class PriceDetails {
    
    private final String itemNetPrice;
    private String itemPriceDiscount;
    private String itemGrossPrice;
    private String itemPriceBaseQuantity;
    private String itemPriceBaseQuantityUnitOfMeasure;

    public PriceDetails(String itemNetPrice) {
        this.itemNetPrice = itemNetPrice;
    }
    
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getItemPriceDiscount() {
        return itemPriceDiscount;
    }
    
    public void setItemPriceDiscount(String itemPriceDiscount) {
        this.itemPriceDiscount = itemPriceDiscount;
    }
    
    public String getItemGrossPrice() {
        return itemGrossPrice;
    }
    
    public void setItemGrossPrice(String itemGrossPrice) {
        this.itemGrossPrice = itemGrossPrice;
    }
    
    public String getItemPriceBaseQuantity() {
        return itemPriceBaseQuantity;
    }
    
    public void setItemPriceBaseQuantity(String itemPriceBaseQuantity) {
        this.itemPriceBaseQuantity = itemPriceBaseQuantity;
    }
    
    public String getItemPriceBaseQuantityUnitOfMeasure() {
        return itemPriceBaseQuantityUnitOfMeasure;
    }
    
    public void setItemPriceBaseQuantityUnitOfMeasure(String itemPriceBaseQuantityUnitOfMeasure) {
        this.itemPriceBaseQuantityUnitOfMeasure = itemPriceBaseQuantityUnitOfMeasure;
    }
    
    public String getItemNetPrice() {
        return itemNetPrice;
    }
    
//</editor-fold>
    
}
