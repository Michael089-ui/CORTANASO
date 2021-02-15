/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaapplication43.Conexion;
import javax.swing.JOptionPane;


public class Modelo_cotizacion {
    
        Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
     public boolean Guardar_cotizacion (Cotizacion cot){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("INSERT INTO cotizacion VALUES (?,?,?,?,?)");
            ps.setString(1, cot.getCodigoCot());
            ps.setString(2, cot.getCServicio());
            ps.setString(3, cot.getCRepuestos());
            ps.setString(4, cot.getCedulaTec());
            ps.setString(5, cot.getNuSerie());
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return dat;  
    }
    
      public boolean Editar_cotizacion (Cotizacion cot){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("UPDATE cotizacion SET costoserv ="
            + " '"+cot.getCServicio()+"', costorrep = '"+cot.getCRepuestos()+"',"
            + " cedulat = '"+cot.getCedulaTec()+"', nserie = '"+cot.getNuSerie()+"'"
            + " WHERE codigoc = '"+cot.getCodigoCot()+"'");
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
