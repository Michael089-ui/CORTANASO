package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DetalleVentaModelo {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    
    public int insertarfacturav(DetalleVenta se){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("INSERT INTO detalle_venta VALUES(?,?,?)");
            ps.setString(1, se.getSerie());
            ps.setString(2, se.getCodigo());
            ps.setString(3, se.getPreciocompra());
            
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
    
    
    
    public boolean modificarusuario(DetalleVenta ser){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("UPDATE detalle_venta SET preciocomp='"+ser.getPreciocompra()+"' "+ "WHERE numserie='"+ser.getSerie()+"'   ");
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
    
    public boolean eliminarusuario(DetalleVenta  serv){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("DELETE FROM detalle_venta WHERE detalle_venta.numserie='"+serv.getSerie()+"' ");
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
    
    
    
    
    
    
    public int ejemploinsertarfacturav(DetalleVenta se){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("insert into detalle_venta values (?,?,?)");
            
            ps.setString(1, se.getSerie());
            ps.setString(2, se.getCodigo());
            ps.setString(3, se.getPreciocompra());
            
            int dat = ps.executeUpdate();
            
            if (dat>0) {
                
                respuesta=1;
                
            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al insertar kkkkk"+ ex);
            
        }
    
    
    return respuesta;
    
    }
    
}
