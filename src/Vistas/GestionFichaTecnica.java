/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Stefania
 */
public class GestionFichaTecnica extends javax.swing.JFrame {

    /**
     * Creates new form GestionFichaTecnica
     */
    public GestionFichaTecnica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        nombre1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        nombre2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        nombre3 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        nombre4 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        nombre5 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        bguardar = new javax.swing.JButton();
        bmodificar = new javax.swing.JButton();
        beliminar1 = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        nombre6 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(null);

        nombre.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(113, 161, 173));
        nombre.setBorder(null);
        getContentPane().add(nombre);
        nombre.setBounds(240, 250, 320, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(240, 280, 320, 10);

        nombre1.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre1.setForeground(new java.awt.Color(113, 161, 173));
        nombre1.setBorder(null);
        getContentPane().add(nombre1);
        nombre1.setBounds(240, 350, 320, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(240, 380, 320, 10);

        nombre2.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre2.setForeground(new java.awt.Color(113, 161, 173));
        nombre2.setBorder(null);
        getContentPane().add(nombre2);
        nombre2.setBounds(240, 450, 320, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(240, 480, 320, 10);

        nombre3.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre3.setForeground(new java.awt.Color(113, 161, 173));
        nombre3.setBorder(null);
        getContentPane().add(nombre3);
        nombre3.setBounds(240, 550, 320, 30);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(240, 580, 320, 10);

        nombre4.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre4.setForeground(new java.awt.Color(113, 161, 173));
        nombre4.setBorder(null);
        getContentPane().add(nombre4);
        nombre4.setBounds(740, 250, 320, 30);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(740, 280, 320, 10);

        nombre5.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre5.setForeground(new java.awt.Color(113, 161, 173));
        nombre5.setBorder(null);
        getContentPane().add(nombre5);
        nombre5.setBounds(740, 350, 320, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(740, 380, 320, 10);

        bguardar.setBackground(new java.awt.Color(255, 255, 255));
        bguardar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bguardar.setText("GUARDAR");
        getContentPane().add(bguardar);
        bguardar.setBounds(790, 420, 200, 40);

        bmodificar.setBackground(new java.awt.Color(255, 255, 255));
        bmodificar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bmodificar.setText("MODIFICAR");
        getContentPane().add(bmodificar);
        bmodificar.setBounds(790, 480, 200, 40);

        beliminar1.setBackground(new java.awt.Color(255, 255, 255));
        beliminar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        beliminar1.setText("ELIMINAR");
        getContentPane().add(beliminar1);
        beliminar1.setBounds(790, 540, 200, 40);

        beliminar.setBackground(new java.awt.Color(255, 255, 255));
        beliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        beliminar.setText("Tabla GFT");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });
        getContentPane().add(beliminar);
        beliminar.setBounds(790, 600, 200, 40);

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
        jToggleButton1.setBounds(1100, 0, 105, 30);

        nombre6.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre6.setForeground(new java.awt.Color(113, 161, 173));
        nombre6.setBorder(null);
        getContentPane().add(nombre6);
        nombre6.setBounds(240, 640, 320, 30);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(240, 670, 320, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DOCUMENTO_ (11).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed

        TablaGFT mos= new TablaGFT();
        mos.setVisible(true);
        mos.setLocationRelativeTo(null);

    }//GEN-LAST:event_beliminarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionFichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionFichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionFichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionFichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionFichaTecnica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beliminar;
    private javax.swing.JButton beliminar1;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre3;
    private javax.swing.JTextField nombre4;
    private javax.swing.JTextField nombre5;
    private javax.swing.JTextField nombre6;
    // End of variables declaration//GEN-END:variables
}