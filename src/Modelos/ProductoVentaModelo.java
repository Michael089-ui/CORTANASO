package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductoVentaModelo {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    
    public int insertarproducto(ProductoVenta se){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("INSERT INTO productos_venta VALUES(?,?)");
            ps.setString(1, se.getSerie());
            ps.setString(2, se.getDisponibilidad());
            
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
    
    public boolean modificarproducto(ProductoVenta ser){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("UPDATE productos_venta SET disponibilidad='"+ser.getDisponibilidad()+"' "+ "WHERE numserie='"+ser.getSerie()+"'   ");
            int x=ps.executeUpdate();
            
            if (x>0) {
                
                dat=true;

            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al modificarproducto"+ex);
            
        }
    
        return dat;
        
    }
    
    public boolean eliminarproducto(ProductoVenta serv){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("DELETE FROM productos_venta WHERE productos_venta.numserie='"+serv.getSerie()+"' ");
            int x=ps.executeUpdate();
            
            if (x>0) {
                
                dat=true;

            }
            
        } 
        
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al eliminar producto"+ex);
            
        }
    
        return dat;
        
    }
    
}
