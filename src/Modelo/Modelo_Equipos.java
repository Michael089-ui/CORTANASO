/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.sun.javafx.fxml.expression.BinaryExpression;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.BinaryOperator;
import javaapplication43.Conexion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BinaryNode;

/**
 *
 * @author neyde
 */
public class Modelo_Equipos {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
     public boolean Guardar_equipo (Equipos eq){
        boolean dat=false;
        int x=0;
        try {
            FileInputStream archivofoto;
            archivofoto = new FileInputStream(eq.getImagen());
            ps=cnn.prepareStatement("INSERT INTO equipo VALUES (?,?,?)");
            ps.setString(1, eq.getNserie());
            ps.setBinaryStream(2, archivofoto);
            ps.setString(3, eq.getDocuequipo());
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (FileNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos NO guardados" + e);
        }
        return dat;  
    }
    
     public boolean Editar_equipo_Sinfoto (Equipos eq){
        boolean dat=false;
        int x=0;
        
                JOptionPane.showMessageDialog(null, "Sin imagen");
        
        try {
            ps=cnn.prepareStatement("UPDATE equipo SET documentoc ="
            + " '"+eq.getDocuequipo()+"' WHERE nserie = '"+eq.getNserie()+"'");
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos NO guardados" + e);
        }
        return dat;  
    }
     
        public boolean Editar_equipo(Equipos eq){
        boolean dat=false;
        int x=0;
        
        JOptionPane.showMessageDialog(null, "Con imagen" + eq.getImagen());
        
        
        try {
            FileInputStream archivofoto;
            archivofoto = new FileInputStream(eq.getImagen());

             Blob blob = null;
//             blob.getBinaryStream(archivofoto); hpta codigoooooooooooooooooooooooooooooooo!!!!!!!!! :,C
            
            ps=cnn.prepareStatement("UPDATE equipo SET efotografica = "
            + "'"+archivofoto+"', documentoc = '"+eq.getDocuequipo()+"'"
            + " WHERE nserie = '"+eq.getNserie()+"'");
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } catch (FileNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos NO guardados" + e);
        }
        return dat;  
    }
}
