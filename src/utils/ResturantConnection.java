package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aman
 */
public class ResturantConnection {

    static Connection conn = null;
    
    private static final String HOST = "jdbc:mysql://localhost:3306/resturant";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if(conn == null || conn.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(HOST, USER, PASSWORD);
        }
        return conn;
    }
    
    public static void closeConnection() throws SQLException {
        if(conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
