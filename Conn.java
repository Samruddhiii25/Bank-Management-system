package bank.management.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
           // Class.forName(com.mysql.cj.jdbc.Driver);
            c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","Samu@2000");
            s=c.createStatement();
            
        } 
        catch (Exception e)
        {
            
        }
    }
}
