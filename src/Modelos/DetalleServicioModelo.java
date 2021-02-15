package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DetalleServicioModelo {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    
    public int insertarfacturas(DetalleServicio se){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("INSERT INTO detalle_servicio VALUES(?,?,?)");
            ps.setString(1, se.getSerie());
            ps.setString(2, se.getPrecio());
            ps.setString(3, se.getFactura());
            
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
    
    public boolean modificardetalles(DetalleServicio ser){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("UPDATE detalle_servicio SET precio='"+ser.getPrecio()+"' "+ "WHERE nserie='"+ser.getSerie()+"'   ");
            int x=ps.executeUpdate();
            
            if (x>0) {
                
                dat=true;

            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al modificar"+ex);
            
        }
    
        return dat;
        
    }
    
    public boolean eliminardetalles(DetalleVenta  serv){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("DELETE FROM detalle_servicio WHERE detalle_servicio.nserie='"+serv.getSerie()+"' ");
            int x=ps.executeUpdate();
            
            if (x>0) {
                
                dat=true;

            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al eliminar"+ex);
            
        }
    
        return dat;
        
    }
    
}
