
package jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowInfoFromDatabase {
    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://src\\jdbcprac\\StudentInfo.accdb");
            System.out.println("Connection successfully");
            
            PreparedStatement show = connection.prepareStatement("SELECT * FROM Student");
            
            ResultSet resultSet = show.executeQuery();
            
            while(resultSet.next()){
                System.out.println("Name : "+resultSet.getString("Name"));
                System.out.println("Id : "+resultSet.getString("Id"));
                System.out.println("Age : "+resultSet.getInt("Age"));
                System.out.println("-----------------------");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPrac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
