package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ArrayList<Usuarios> loginusu (Usuarios us){
        ArrayList lista=new ArrayList();
    
        try {
            
            ps=cnn.prepareStatement("select cedulat, nombret, usuario, contraseña, estado from tecnico where usuario ='"+us.getUsuario()+"' AND contraseña='"+us.getClave()+"'");
            rs=ps.executeQuery();
            
            while (rs.next()){
                
                Usuarios usu=new Usuarios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(usu);
            
            }
            
        } 
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "error al ingresar usuario, contraseña y rol"+ex);
            
        }
    
        return lista;
        
    }
    
}
