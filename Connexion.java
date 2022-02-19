
package emploidutemps;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connexion {
    
        public boolean connect = false;
        public Connection cn=null;
        public PreparedStatement pst=null;
        public Statement st;
        public ResultSet rs=null;
     public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
     public boolean connecte() throws SQLException{
         
      try{
            cn=DriverManager.getConnection("com.mysql.cj.jdbc.Driver://localhost/emploidutemps?useLegacyDatetimeCode=false&serverTimezone=America/New_York","root","");
           //JOptionPane.showMessageDialog(null,"OK !");
            //System.out.println("ok");
            connect = true;
           
            
        } catch (SQLException  | HeadlessException ex) {
            JOptionPane.showMessageDialog(null,ex);
            //System.out.println("okay");
            connect = false;
            
        }
      
      if(connect){
          JOptionPane.showMessageDialog(null,"Connexion reussie");
          return true;  
         
      }
      else{
          return false;
           
      }
     }
    
    
   
   
    
}
