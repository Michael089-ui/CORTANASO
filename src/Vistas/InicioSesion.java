package Vistas;

import Imagenes.Bienvenido;
import Modelos.Login;
import Modelos.Usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

    public static String usu,cla,nom,est,doc;
    
    public InicioSesion() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        contrasena = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1000, 530));
        getContentPane().setLayout(null);

        usuario.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(113, 161, 173));
        usuario.setBorder(null);
        getContentPane().add(usuario);
        usuario.setBounds(690, 170, 190, 30);

        contrasena.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        contrasena.setForeground(new java.awt.Color(113, 161, 173));
        contrasena.setBorder(null);
        getContentPane().add(contrasena);
        contrasena.setBounds(690, 280, 190, 30);

        jButton1.setBackground(new java.awt.Color(95, 148, 158));
        jButton1.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 370, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciarsesion.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String u,c,n,s,d;
        ArrayList<Usuarios> lista=new ArrayList();
        
        u=usuario.getText();
        c=contrasena.getText();
        
        Usuarios dat=new Usuarios();
        Usuarios us=new Usuarios(u, c);
        
        Login lo=new Login();
        lista=lo.loginusu(us);
        
        if (lista.size()>0) {
         
               
                for (int i = 0; i < lista.size(); i++) {
                
                    dat=lista.get(i);
                    usu=dat.getUsuario();
                    cla=dat.getClave();
                    nom=dat.getNombre();
                    est=dat.getEstado();
                    doc=dat.getCedula();
                    
                }
                
                    if (usu.equals(u) && cla.equals(c) && est.equals("A") ) {

                        JOptionPane.showMessageDialog(null, "Bienvenid@"+" "+nom);
                        
                        Ingreso_Servicio obj=new Ingreso_Servicio();
                        obj.setVisible(true);
                        dispose();
                    }
                    
                        else if (usu.equals(u) && cla.equals(c) && est.equals("I")) {

                            JOptionPane.showMessageDialog(null, "Su estado se encuentra en 'INACTIVO' comuniquese con el admnistrador");

                        }
                    
        }
        
        else{

        JOptionPane.showMessageDialog(null, "Datos Incorrectos. Intentelo de nuevo");

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasena;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
