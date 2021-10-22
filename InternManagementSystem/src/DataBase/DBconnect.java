package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author perer
 */
public class DBconnect {
    
    public static Connection connect() {
        
        Connection conn = null;
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/users?", "root", "root");

        } catch (Exception e) {

            System.out.println(e);

        }
         return conn;
        
    }
    
}
