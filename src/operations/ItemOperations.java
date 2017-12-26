/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import beans.FoodItem;
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
public class ItemOperations {
    
     private static final String TABLE = "food_item";

    public ItemOperations(){
        
    }
    public List<FoodItem> getAllItem(int category_id) throws ClassNotFoundException, SQLException {
        List<FoodItem> FoodItems = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE + " WHERE category_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, category_id);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            FoodItem foodItem = new FoodItem(set.getInt("item_id"),  
                    set.getString("item_name"),
                    set.getString("item_status"),
                    set.getInt("category_id"),
                    set.getString("food_description"));
            FoodItems.add(foodItem);
        }
        return FoodItems;
    }
    
    public FoodItem getItemByID(int id) throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM " + TABLE + " WHERE item_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        set.next();
        FoodItem foodItem = new FoodItem(set.getInt("item_id"),  
                    set.getString("item_name"),
                    set.getString("item_status"),
                    set.getInt("category_id"),
                    set.getString("food_description"));
        return foodItem;
    }
    public FoodItem getItemByName(String name) throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM " + TABLE + " WHERE item_name = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setString(1, name);
        ResultSet set = statement.executeQuery();
        set.next();
        FoodItem foodItem = new FoodItem(set.getInt("item_id"),  
                    set.getString("item_name"),
                    set.getString("item_status"),
                    set.getInt("category_id"),
                    set.getString("food_description"));
        return foodItem;
    }
    
//    public static boolean CreateOrder(int id, String OrderStatus, int TableId, String OrderDescription) throws ClassNotFoundException, SQLException {
//        boolean insert=false;
//        String query = "Insert into " + TABLE + " values "+"(?,?,?,?)";
//        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
//        statement.setInt(1, id);
//        statement.setString(1, OrderStatus);
//        statement.setInt(1, TableId);
//        statement.setString(1, OrderDescription);
//        if(statement.executeUpdate()==1)
//                {
//                    insert = true;
//                }
//        return insert;
//    }
    
//    public static boolean UpdateOrderStatus(int id,String OrderStatus) throws ClassNotFoundException, SQLException {
//        boolean insert=false;
//        String query = "Update " + TABLE + " Set order_status = ? where order_id = ?";
//        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
//        statement.setString(1, OrderStatus);
//        statement.setInt(1, id);
//        if(statement.executeUpdate()==1)
//                {
//                    insert = true;
//                }
//        return insert;
//    }
//    
//    public static boolean DeleteOrder(int id) throws ClassNotFoundException, SQLException {
//        boolean insert=false;
//        String query = "Delete from  " + TABLE + " where order_id = ?";
//        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
//        statement.setInt(1, id);
//        if(statement.executeUpdate()==1)
//                {
//                    insert = true;
//                }
//        return insert;
//    }
//    
}
