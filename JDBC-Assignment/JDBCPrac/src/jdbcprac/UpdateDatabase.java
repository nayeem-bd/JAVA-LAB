
package jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateDatabase {
     public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://src\\jdbcprac\\StudentInfo.accdb");
            System.out.println("Connection successfully");
            
            PreparedStatement update = connection.prepareStatement("UPDATE Student SET Age = ? WHERE Name = ?");
            update.setString(2, "Rifat");
            update.setInt(1, 22);
            update.execute();
            
            System.out.println("Update Successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPrac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
