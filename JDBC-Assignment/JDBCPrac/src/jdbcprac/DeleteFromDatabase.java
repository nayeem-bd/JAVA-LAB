
package jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteFromDatabase {
    
        public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://src\\jdbcprac\\StudentInfo.accdb");
            System.out.println("Connection successfully");
            
            String name = "RIFAT";
            
            PreparedStatement delete = connection.prepareStatement("DELETE FROM Student WHERE Name = '"+name+"'");
            
            delete.execute();
            System.out.println("Delete Successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPrac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
