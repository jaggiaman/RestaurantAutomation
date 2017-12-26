/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aman
 */
public class Order {
    private int orderID;
    private String orderStatus;
    private int tableID;
    private String orderDescription;
    private List<itemSelected> itemsSelected;
   // private static int index;

    public Order() {
        itemsSelected= new ArrayList<>(); 
        
    }

    public Order(int orderID, String orderStatus, int tableID, String orderDescription) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.tableID = tableID;
        this.orderDescription = orderDescription;
    }

    public int getOrderID() {
        return orderID;
    }

    public List<itemSelected> getItems() {
        return itemsSelected;
    }

    public void setItems(itemSelected item) {
         itemsSelected.add(item);
    }
    
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }
    
    
    
    
}
