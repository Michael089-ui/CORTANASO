package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FacturaVentaModelo {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    
    public int insertarfacturav(FacturaVenta se){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("INSERT INTO factura_venta VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, se.getCodigo());
            ps.setString(2, se.getFecha());
            ps.setString(3, se.getFormapago());
            ps.setString(4, se.getValor());
            ps.setString(5, se.getDocumento());
            ps.setString(6, se.getNombre());
            ps.setString(7, se.getCelular());
            
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
    
    public boolean modificarusuario(FacturaVenta ser){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("UPDATE factura_venta SET fecha='"+ser.getFecha()+"',formapago='"+ser.getFormapago()+"',valortot='"+ser.getValor()+"',documentoc='"+ser.getDocumento()+"',nombrec='"+ser.getNombre()+"',celularc='"+ser.getCelular()+"' "+ "WHERE numerofac='"+ser.getCodigo()+"'   ");
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
    
    public boolean eliminarusuario(FacturaVenta serv){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("DELETE FROM factura_venta WHERE factura_venta.numerofac='"+serv.getCodigo()+"' ");
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
