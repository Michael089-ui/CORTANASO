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

public class Modelo_Diagnostico {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
        public boolean Guardar_diagnostico (Diagnostico di){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("INSERT INTO diagnostico VALUES (?,?,?,?,?)");
            ps.setString(1, di.getCodigodiag());
            ps.setString(2, di.getHardware());
            ps.setString(3, di.getSoftware());
            ps.setString(4, di.getCedulat());
            ps.setString(5, di.getNumeroSer());
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return dat;  
    }
        
        public boolean Editar_diagnostico (Diagnostico di){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("UPDATE diagnostico SET ehardware"
            + " = '"+di.getHardware()+"', esoftware = '"+di.getSoftware()+"',"
            + " cedulat = '"+di.getCedulat()+"', nserie = '"+di.getNumeroSer()+"'"
            + " where codigod = '"+di.getCodigodiag()+"'");
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
