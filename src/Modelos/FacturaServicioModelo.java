package Modelos;

import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FacturaServicioModelo {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    
    public int insertarfacturas(FacturaServicio se){
        
        int respuesta=0;
        
        try {
            
            ps=cnn.prepareStatement("INSERT INTO factura_servicio VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, se.getFactura());
            ps.setString(2, se.getFecha());
            ps.setString(3, se.getFormapago());
            ps.setString(4, se.getDescripcion());
            ps.setString(5, se.getValor());
            ps.setString(6, se.getDocumento());
            ps.setString(7, se.getCedula());
            ps.setString(8, se.getFicha());
            ps.setString(9, se.getDiagnostico());
            ps.setString(10, se.getCotizacion());
            
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
    
    public boolean modificarfacturas(FacturaServicio ser){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("UPDATE factura_servicio SET fecha='"+ser.getFecha()+"',formapago='"+ser.getFormapago()+"',descripcion='"+ser.getDescripcion()+"',valortot='"+ser.getValor()+"' "+ "WHERE numerof='"+ser.getFactura()+"'   ");
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
    
    public boolean eliminarusuario(FacturaServicio serv){
        
        boolean dat=false;
        
        try {
            
            ps=cnn.prepareStatement("DELETE FROM factura_servicio WHERE factura_servicio.numerof='"+serv.getFactura()+"' ");
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
