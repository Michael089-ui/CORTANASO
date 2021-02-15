package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ServicioModelo {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
 
    public int insertarservicio(Servicio se){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("INSERT INTO servicio VALUES(?,?,?,?)");
            ps.setString(1, se.getCodigo());
            ps.setString(2, se.getFecha());
            ps.setString(3, se.getEstado());
            ps.setString(4, se.getSerie());
            
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
    
    public boolean modificarusuario(Servicio ser){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("UPDATE servicio SET fecha='"+ser.getFecha()+"',estado='"+ser.getEstado()+"' "+ "WHERE cod='"+ser.getCodigo()+"'   ");
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
    
    public boolean eliminarusuario(Servicio serv){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("DELETE FROM servicio WHERE servicio.cod='"+serv.getCodigo()+"' ");
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
