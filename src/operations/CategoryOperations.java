/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import beans.Category;
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
public class CategoryOperations {
        
     private static final String TABLE = "order";

    public static List<Category> getAllCategory() throws ClassNotFoundException, SQLException {
        List<Category> Categories = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE;
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            Category category = new Category(set.getInt("category_id"),  
                    set.getString("category_name"));
            Categories.add(category);
        }
        return Categories;
    }
    
    public static Category getICtegoryID(int id) throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM " + TABLE + " WHERE category_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        set.next();
            Category category = new Category(set.getInt("category_id"),  
                    set.getString("category_name"));
        return category;
    }

}
