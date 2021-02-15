package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosModelo {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    
    public int insertarusuario(Usuarios us){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("INSERT INTO tecnico VALUES(?,?,?,?,?,?)");
            ps.setString(1, us.getCedula());
            ps.setString(2, us.getCelular());
            ps.setString(3, us.getNombre());
            ps.setString(4, us.getUsuario());
            ps.setString(5, us.getClave());
            ps.setString(6, us.getEstado());
            
            int dat = ps.executeUpdate();
            
            if (dat>0) {
                
                respuesta=1;
                
            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al insertar"+ ex);
            
        }
    
    
    return respuesta;
    
    }
    
    public boolean modificarusuario(Usuarios usu){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("UPDATE tecnico SET celulart='"+usu.getCelular()+"',nombret='"+usu.getNombre()+"',usuario='"+usu.getUsuario()+"',contraseña='"+usu.getClave()+"',estado='"+usu.getEstado()+"'"+ "WHERE cedulat='"+usu.getCedula()+"'   ");
            int x=ps.executeUpdate();
            
            if (x>0) {
                
                dat=true;

            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al modificarcliente"+ex);
            
        }
    
        return dat;
        
    }
    
    public boolean eliminarusuario(Usuarios cl){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("DELETE FROM tecnico WHERE tecnico.cedulat='"+cl.getCedula()+"' ");
            int x=ps.executeUpdate();
            
            if (x>0) {
                
                dat=true;

            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al eliminar Clientes"+ex);
            
        }
    
        return dat;
        
    }
    
}
