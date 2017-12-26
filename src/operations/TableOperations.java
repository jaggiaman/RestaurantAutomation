/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import beans.table;
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
public class TableOperations {
    

    private static final String TABLE = "resturant.table";

    public List<table> getAlltable() throws ClassNotFoundException, SQLException {
        List<table> tables = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE;
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            table t = new table(set.getInt("table_id"),  
                    set.getString("table_status"),
                    set.getInt("emp_id"));
            tables.add(t);
        }
        return tables;
    }
    
    public table getTableByID(int id) throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM " + TABLE + " WHERE table_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        set.next();
        table t = new table(set.getInt("table_id"),  
                    set.getString("table_status"),
                    set.getInt("emp_id"));
        return t;
    }
    
    
    
    public List<table> getTableByEmp(int id) throws ClassNotFoundException, SQLException {
        List<table> tables = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE + " WHERE emp_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            table t = new table(set.getInt("table_id"),  
                    set.getString("table_status"),
                    set.getInt("emp_id"));
            tables.add(t);
        }
        return tables;
    }
    public boolean UpdateTbaleStatus(int id,String OrderStatus) throws ClassNotFoundException, SQLException {
        boolean insert=false;
        String query = "Update " + TABLE + " Set table_status = ? where table_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setString(1, OrderStatus);
        statement.setInt(2, id);
        if(statement.executeUpdate()==1)
                {
                    insert = true;
                }
        return insert;
    }
     public boolean UpdateTableAssignation(int id ,int emp_id) throws ClassNotFoundException, SQLException {
        boolean insert=false;
        String query = "Update " + TABLE + " Set emp_id = ? where table_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, emp_id);
        statement.setInt(2, id);
        if(statement.executeUpdate()==1)
                {
                    insert = true;
                }
        return insert;
     }
}
