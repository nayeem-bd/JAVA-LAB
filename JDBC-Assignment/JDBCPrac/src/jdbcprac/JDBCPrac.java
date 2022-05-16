package jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

// Insert into database

public class JDBCPrac {

    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://src\\jdbcprac\\StudentInfo.accdb");
            System.out.println("Connection successfully");
            
            PreparedStatement insert = connection.prepareStatement("INSERT INTO Student (Name,Id,Age) VALUES(?,?,?)");
            insert.setString(1, "Rifat");
            insert.setString(2, "1810577155");
            insert.setInt(3, 24);
            
            insert.execute();
            
            System.out.println("Inserted Successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPrac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
