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

public class Modelo_Ficha {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
     public boolean Guardar_ficha (Fichatecnica ft){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("INSERT INTO ftecnica VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, ft.getNficha());
            ps.setString(2, ft.getNumserie());
            ps.setString(3, ft.getMarca());
            ps.setString(4, ft.getSoperativo());
            ps.setString(5, ft.getProcesador());
            ps.setString(6, ft.getRam());
            ps.setString(7, ft.getRom());
            ps.setString(8, ft.getPerifericos());
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        return dat;  
    }
     
        public boolean Editar_ficha (Fichatecnica ft){
        boolean dat=false;
        int x=0;
         try {
            ps=cnn.prepareStatement("update ftecnica set nserie ="
            + " '"+ft.getNumserie()+"', marca = '"+ft.getMarca()+"',"
            + " soperativo = '"+ft.getSoperativo()+"', procesador = "
            + "'"+ft.getProcesador()+"', ram = '"+ft.getRam()+"',"
            + " rom= '"+ft.getRom()+"', perifericos="
            + " '"+ft.getPerifericos()+"' where nficha= '"+ft.getNficha()+"'");
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
