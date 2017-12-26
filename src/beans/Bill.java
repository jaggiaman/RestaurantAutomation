/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Date;

/**
 *
 * @author Aman
 */
public class Bill {
    private int billID;
    private int orderID;
    private Date billDate;
    private float billAmount;
    private float tax;

    public Bill(int billID, int orderID, Date billDate, float billAmount, float tax) {
        this.billID = billID;
        this.orderID = orderID;
        this.billDate = billDate;
        this.billAmount = billAmount;
        this.tax = tax;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
    
    
    
    
}
