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
public class GestionEquipos extends javax.swing.JFrame {

    /**
     * Creates new form GestionEquipos
     */
    public GestionEquipos() {
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

        beliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        bmodificar = new javax.swing.JButton();
        filtros = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        bconsultar1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        direccion = new javax.swing.JTextField();
        bguardar = new javax.swing.JButton();
        bconsultar = new javax.swing.JButton();
        celular = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        documento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(null);

        beliminar.setBackground(new java.awt.Color(255, 255, 255));
        beliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        beliminar.setText("ELIMINAR");
        getContentPane().add(beliminar);
        beliminar.setBounds(680, 610, 200, 60);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(170, 500, 320, 10);

        bmodificar.setBackground(new java.awt.Color(255, 255, 255));
        bmodificar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bmodificar.setText("MODIFICAR");
        getContentPane().add(bmodificar);
        bmodificar.setBounds(410, 610, 200, 60);

        filtros.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        filtros.setForeground(new java.awt.Color(113, 161, 173));
        filtros.setBorder(null);
        getContentPane().add(filtros);
        filtros.setBounds(620, 200, 290, 30);

        nombre.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(113, 161, 173));
        nombre.setBorder(null);
        getContentPane().add(nombre);
        nombre.setBounds(170, 380, 320, 30);

        bconsultar1.setBackground(new java.awt.Color(255, 255, 255));
        bconsultar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bconsultar1.setText("FILTRAR");
        getContentPane().add(bconsultar1);
        bconsultar1.setBounds(950, 190, 210, 60);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(170, 410, 320, 10);

        direccion.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        direccion.setForeground(new java.awt.Color(113, 161, 173));
        direccion.setBorder(null);
        getContentPane().add(direccion);
        direccion.setBounds(170, 560, 320, 30);

        bguardar.setBackground(new java.awt.Color(255, 255, 255));
        bguardar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bguardar.setText("GUARDAR");
        getContentPane().add(bguardar);
        bguardar.setBounds(150, 610, 200, 60);

        bconsultar.setBackground(new java.awt.Color(255, 255, 255));
        bconsultar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bconsultar.setText("CONSULTAR");
        getContentPane().add(bconsultar);
        bconsultar.setBounds(950, 610, 210, 60);

        celular.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        celular.setForeground(new java.awt.Color(113, 161, 173));
        celular.setBorder(null);
        getContentPane().add(celular);
        celular.setBounds(170, 470, 320, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(170, 320, 320, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(620, 230, 290, 30);

        documento.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        documento.setForeground(new java.awt.Color(113, 161, 173));
        documento.setBorder(null);
        getContentPane().add(documento);
        documento.setBounds(170, 300, 320, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(170, 590, 320, 10);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(79, 127, 133));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 260, 610, 340);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DOCUMENTO_ (4).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bconsultar;
    private javax.swing.JButton bconsultar1;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bmodificar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField filtros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
