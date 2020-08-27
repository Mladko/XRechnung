/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoecker.xrechnung.pojos;

import java.util.List;

/**
 *
 * @author Sikiric
 */
public class ItemInformation {
    //Attribute
    private final String itemName;
    private String itemDescription;
    private String itemSellersIdentifier;
    private String itemBuyersIdentifier;
    private String itemStandardIdentifier;
    private List<String> itemClassificationIdentifierList;
    private String itemCountryOfOrigin;
    //Klassen
    private List<ItemAttributes> itemAttributesList;

    public ItemInformation(String itemName) {
        this.itemName = itemName;
    }
//<editor-fold defaultstate="collapsed" desc="Getter & Setter">
    
    public String getItemName() {
        return itemName;
    }
    
    public String getItemDescription() {
        return itemDescription;
    }
    
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    public String getItemSellersIdentifier() {
        return itemSellersIdentifier;
    }
    
    public void setItemSellersIdentifier(String itemSellersIdentifier) {
        this.itemSellersIdentifier = itemSellersIdentifier;
    }
    
    public String getItemBuyersIdentifier() {
        return itemBuyersIdentifier;
    }
    
    public void setItemBuyersIdentifier(String itemBuyersIdentifier) {
        this.itemBuyersIdentifier = itemBuyersIdentifier;
    }
    
    public String getItemStandardIdentifier() {
        return itemStandardIdentifier;
    }
    
    public void setItemStandardIdentifier(String itemStandardIdentifier) {
        this.itemStandardIdentifier = itemStandardIdentifier;
    }
    
    public List<String> getItemClassificationIdentifierList() {
        return itemClassificationIdentifierList;
    }
    
    public void setItemClassificationIdentifierList(List<String> itemClassificationIdentifierList) {
        this.itemClassificationIdentifierList = itemClassificationIdentifierList;
    }
    
    public String getItemCountryOfOrigin() {
        return itemCountryOfOrigin;
    }
    
    public void setItemCountryOfOrigin(String itemCountryOfOrigin) {
        this.itemCountryOfOrigin = itemCountryOfOrigin;
    }
    
    public List<ItemAttributes> getItemAttributesList() {
        return itemAttributesList;
    }
    
    public void setItemAttributesList(List<ItemAttributes> itemAttributesList) {
        this.itemAttributesList = itemAttributesList;
    }
    
//</editor-fold>

}
