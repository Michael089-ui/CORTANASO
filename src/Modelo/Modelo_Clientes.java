
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javaapplication43.Conexion;
import javax.swing.JOptionPane;

public class Modelo_Clientes {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public boolean Guardar_cliente (Clientes cli){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("INSERT INTO cliente VALUES (?,?,?,?)");
            ps.setString(1, cli.getDocumento());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getCelular());
            ps.setString(4, cli.getDireccion());
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return dat;  
    }  
    
        public boolean Editar_cliente (Clientes cli){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("UPDATE cliente SET nombrec = "
            + "'"+cli.getNombre()+"', celularc = '"+cli.getCelular()+"',"
            + " direccionc = '"+cli.getDireccion()+"' WHERE documentoc ="
            + " '"+cli.getDocumento()+"'");
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return dat;  
    }  
        
        public boolean Eliminar_cliente (Clientes cli){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("DELETE FROM cliente WHERE documentoc = '"+cli.getDocumento()+"'");
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return dat;  
    }  
    
    
}
