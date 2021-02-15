
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaapplication43.Conexion;
import javax.swing.JOptionPane;


public class Modelo_Ingreso {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    public boolean guardar_ingreso (Ingreso i){
        boolean dat=false;
        int x=0;
        
        try {
            ps=cnn.prepareStatement("insert into ingreso values(?,?,?,?,?)");
            ps.setString(1, i.getNumserie());
            ps.setString(2, i.getVendedor());
            ps.setString(3, i.getDescrip());
            ps.setString(4, i.getDispon());
            ps.setString(5, i.getPrecio());
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al insertar ingreso"+ e);
        }
        return dat;
                
    }
    
    
        public boolean editar_ingreso (Ingreso i){
        boolean dat=false;
        int x=0;
        
        try {
            ps=cnn.prepareStatement("update ingreso set nomvendedor ="
            + " '"+i.getVendedor()+"' , descripcion = '"+i.getDescrip()+"',"
            + " disponibilidad = '"+i.getDispon()+"', preciocomp = "
            + "'"+i.getPrecio()+"'  where numserie = '"+i.getNumserie()+"'");
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar ingreso"+ e);
        }
        return dat;
                
    }
    
    
    
}
