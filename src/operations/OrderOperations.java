/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;
import beans.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.ResturantConnection;
/**
 *
 * @author Aman
 */
public class OrderOperations {
    

    private static final String TABLE = "resturant.order";

    public List<Order> getAllOrder() throws ClassNotFoundException, SQLException {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE;
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            Order o = new Order(set.getInt("order_id"),  
                    set.getString("order_status"),
                    set.getInt("table_id"),
                    set.getString("order_description"));
            orders.add(o);
        }
        return orders;
    }
    
    public Order getOrderByID(int id) throws ClassNotFoundException, SQLException {
        Order order;
        String query = "SELECT * FROM " + TABLE + " WHERE order_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        set.next();
        order = new Order(set.getInt("order_id"),  
        set.getString("order_status"),
        set.getInt("table_id"),
        set.getString("order_description"));
        return order;
    }
    
     public List<Order> getOrderByTable(int id) throws ClassNotFoundException, SQLException {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE + " WHERE table_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            Order o = new Order(set.getInt("order_id"),  
                    set.getString("order_status"),
                    set.getInt("table_id"),
                    set.getString("order_description"));
            orders.add(o);
        }
        return orders;
    }
    
    public boolean CreateOrder(String OrderStatus, int TableId, String OrderDescription) throws ClassNotFoundException, SQLException {
        boolean insert=false;
        String query = "Insert into " + TABLE + "(order_status,table_id,order_description) values "+"(?,?,?)";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setString(1, OrderStatus);
        statement.setInt(2, TableId);
        statement.setString(3, OrderDescription);
        if(statement.executeUpdate()==1)
                {
                    insert = true;
                }
        return insert;
    }
    
    public boolean UpdateOrderStatus(int id,String OrderStatus) throws ClassNotFoundException, SQLException {
        boolean insert=false;
        String query = "Update " + TABLE + " Set order_status = ? where order_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setString(1, OrderStatus);
        statement.setInt(1, id);
        if(statement.executeUpdate()==1)
                {
                    insert = true;
                }
        return insert;
    }
    
    public boolean DeleteOrder(int id) throws ClassNotFoundException, SQLException {
        boolean insert=false;
        String query = "Delete from  " + TABLE + " where order_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        if(statement.executeUpdate()==1)
                {
                    insert = true;
                }
        return insert;
    }
}
