/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection cnn;
    
    public Connection conexionbd (){
         
        try {
             Class.forName("com.mysql.jdbc.Driver");
            try {
            cnn=DriverManager.getConnection("jdbc:mysql://localhost/Cortana","root","");
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error de conexion con la base de datos "+ ex);
            }    
                    
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error con drivers o no ha importado la libreria "+ ex);
        }
        return cnn; 
     }
    
}
