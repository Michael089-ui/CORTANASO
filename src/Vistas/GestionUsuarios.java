package Vistas;

import Modelos.Usuarios;
import Modelos.UsuariosModelo;
import appcortana.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionUsuarios extends javax.swing.JFrame {
    
    conexion con=new conexion();
    Connection cnn=con.conexionbd();
    
    PreparedStatement ps=null;
    ResultSet rs=null;

    public GestionUsuarios() {
        initComponents();
        
        cargartabla();
        
    }
    
    public void cargartabla(){
        
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("CEDULA");
        tabla.addColumn("CELULAR");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("USUARIO");
        tabla.addColumn("CONTRASEÑA");
        tabla.addColumn("ESTADO");
        
        tablausuarios.setModel(tabla);
        
        String arr[]=new String[10];
        
        try {
            
            ps=cnn.prepareStatement("SELECT * FROM tecnico");
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                arr[0]=rs.getString(1);
                arr[1]=rs.getString(2);
                arr[2]=rs.getString(3);
                arr[3]=rs.getString(4);
                arr[4]=rs.getString(5);
                arr[5]=rs.getString(6);
                
                tabla.addRow(arr);

            }
            
        } 
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error en la consulta" + ex);
            
        }
        
        

    }
    
    public void listadatos(){
        
        int lista=tablausuarios.getSelectedRow();
        
        if (lista >= 0) {
            
            cedula.setText(tablausuarios.getValueAt(lista, 0).toString());
            celular.setText(tablausuarios.getValueAt(lista, 1).toString());
            nombre.setText(tablausuarios.getValueAt(lista, 2).toString());
            usuario.setText(tablausuarios.getValueAt(lista, 3).toString());
            clave.setText(tablausuarios.getValueAt(lista, 4).toString());
            estado.setSelectedItem(tablausuarios.getValueAt(lista, 5).toString());
            
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bmodificar = new javax.swing.JButton();
        bguardar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        cedula = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        celular = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        usuario = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        clave = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        beliminar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        estado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(null);

        bmodificar.setBackground(new java.awt.Color(255, 255, 255));
        bmodificar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bmodificar.setText("MODIFICAR");
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(bmodificar);
        bmodificar.setBounds(510, 180, 200, 40);

        bguardar.setBackground(new java.awt.Color(255, 255, 255));
        bguardar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bguardar.setText("GUARDAR");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bguardar);
        bguardar.setBounds(270, 180, 200, 40);

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("CERRAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(1100, 0, 105, 25);

        cedula.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        cedula.setForeground(new java.awt.Color(113, 161, 173));
        cedula.setBorder(null);
        getContentPane().add(cedula);
        cedula.setBounds(240, 280, 320, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(240, 310, 320, 10);

        celular.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        celular.setForeground(new java.awt.Color(113, 161, 173));
        celular.setBorder(null);
        getContentPane().add(celular);
        celular.setBounds(240, 380, 320, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(240, 410, 320, 10);

        nombre.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(113, 161, 173));
        nombre.setBorder(null);
        getContentPane().add(nombre);
        nombre.setBounds(240, 480, 320, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(240, 510, 320, 10);

        usuario.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(113, 161, 173));
        usuario.setBorder(null);
        getContentPane().add(usuario);
        usuario.setBounds(240, 580, 320, 30);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(240, 610, 320, 10);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(740, 310, 320, 10);

        clave.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        clave.setForeground(new java.awt.Color(113, 161, 173));
        clave.setBorder(null);
        getContentPane().add(clave);
        clave.setBounds(740, 380, 320, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(740, 410, 320, 10);

        beliminar1.setBackground(new java.awt.Color(255, 255, 255));
        beliminar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        beliminar1.setText("ELIMINAR");
        beliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminar1ActionPerformed(evt);
            }
        });
        getContentPane().add(beliminar1);
        beliminar1.setBounds(750, 180, 200, 40);

        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(650, 480, 452, 100);

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));
        getContentPane().add(estado);
        estado.setBounds(840, 280, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DOCUMENTO_ (12).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        dispose();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
    
        String c,ce,n,u,co,e;
        int dato;
        
        c=cedula.getText();
        ce=celular.getText();
        n=nombre.getText();
        u=usuario.getText();
        co=clave.getText();
        e=(String) estado.getSelectedItem();
        
        Usuarios usu=new Usuarios(c, ce, n, u, co, e);
        
        UsuariosModelo usubd=new UsuariosModelo();
        dato=usubd.insertarusuario(usu);
        
        if (dato==1) {
            
            JOptionPane.showMessageDialog(null, "Datos guardados");
            cargartabla();
            
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "Sus datos no fueron guardados");

        }
        
    }//GEN-LAST:event_bguardarActionPerformed

    private void tablausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuariosMouseClicked
     
        listadatos();
        
    }//GEN-LAST:event_tablausuariosMouseClicked

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarActionPerformed
    
        String c,ce,n,u,co,e;
        boolean dato;
        
        c=cedula.getText();
        ce=celular.getText();
        n=nombre.getText();
        u=usuario.getText();
        co=clave.getText();
        e=(String) estado.getSelectedItem();
        
        Usuarios usu=new Usuarios(c, ce, n, u, co, e);
        
        UsuariosModelo usubd=new UsuariosModelo();
        dato=usubd.modificarusuario(usu);
        
        if (dato==true) {
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
            cargartabla();
            
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "Sus datos no fueron modificados");

        }
        
    }//GEN-LAST:event_bmodificarActionPerformed

    private void beliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminar1ActionPerformed
    
        String c,ce,n,u,co,e;
        boolean dato;
        
        c=cedula.getText();
        ce=celular.getText();
        n=nombre.getText();
        u=usuario.getText();
        co=clave.getText();
        e=(String) estado.getSelectedItem();
        
        Usuarios usu=new Usuarios(c, ce, n, u, co, e);
        
        UsuariosModelo usubd=new UsuariosModelo();
        dato=usubd.eliminarusuario(usu);
        
        if (dato==true) {
            
            JOptionPane.showMessageDialog(null,"Datos eliminados");
            cargartabla();
            
        }
        
        else{
        
            JOptionPane.showMessageDialog(null,"Sus datos no fueron eliminados");
            
        }
        
    }//GEN-LAST:event_beliminar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beliminar1;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmodificar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField clave;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
