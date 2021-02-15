package appcortana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection cnn;
    
    public Connection conexionbd(){

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            try {
                
                cnn=DriverManager.getConnection("jdbc:mysql://localhost/cortana", "root","");
                JOptionPane.showMessageDialog(null,"conexion ok");
                
            } 
            
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"error conexion de datos"+ ex);
                
            }
                    
        } 
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "error divers"+ex);
            
        }
    return cnn;
    }
    
    public static void main(String[]args){

    conexion con= new conexion();
    con.conexionbd();
    
    }
    
}
