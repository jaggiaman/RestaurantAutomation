package operations;

import beans.Employee;
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
public class EmployeeOperations {

    private static final String TABLE = "employee";

    public EmployeeOperations() {
    }
    
    
    public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE;
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            Employee e = new Employee(set.getInt("emp_id"), 
                    set.getString("position_name"), 
                    set.getString("emp_name"), 
                    set.getString("emp_address"), 
                    set.getString("pass"), 
                    set.getInt("position_id"));
            employees.add(e);
        }
        return employees;
    }
    
    public List<Employee> getAllWaiters() throws ClassNotFoundException, SQLException {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE+" where position_id = 2";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        ResultSet set = statement.executeQuery();
        while (set.next()) {
            Employee e = new Employee(set.getInt("emp_id"), 
                    set.getString("position_name"), 
                    set.getString("emp_name"), 
                    set.getString("emp_address"), 
                    set.getString("pass"), 
                    set.getInt("position_id"));
            employees.add(e);
        }
        return employees;
    }
    
    public  Employee getEmployeeByID(int id) throws ClassNotFoundException, SQLException {
       
        String query = "SELECT * FROM " + TABLE + " WHERE emp_id = ?";
        PreparedStatement statement = ResturantConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        set.next();
        Employee employee = new Employee(set.getInt("emp_id"), 
                    set.getString("position_name"), 
                    set.getString("emp_name"), 
                    set.getString("emp_address"), 
                    set.getString("pass"), 
                    set.getInt("position_id"));
        
        return employee;
    }
    
    
    
    public Boolean isEmployee(int id) throws ClassNotFoundException, SQLException {
        boolean value=false;
        for(int i=0; i<getAllEmployees().size();i++){
             if(id==getAllEmployees().get(i).getEmployeeID())
                 value = true;
        }
        return value;
    }
}
