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
public class itemSelected {
    private int item_id;
    private int quantity;
    private String item_name;

    
    public itemSelected(){
        
    }
    public itemSelected(int id, int quantity, String name) {
        this.item_id = id;
        this.quantity = quantity;
        this.item_name=name;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item) {
        this.item_id = item;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
