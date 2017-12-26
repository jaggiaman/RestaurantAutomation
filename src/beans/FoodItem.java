/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Aman
 */
public class FoodItem {
    private int itemID;
    private String itemName;
    private float itemPrice;
    private String itemStatus;
    private int categoryId;
    private String itemDescription;

    public FoodItem(int itemID, String itemName, String itemStatus, int categoryId, String itemDescription) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemStatus = itemStatus;
        this.categoryId = categoryId;
        this.itemDescription = itemDescription;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String isItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    
    
}
