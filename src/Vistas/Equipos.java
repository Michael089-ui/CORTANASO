
package Vistas;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import Modelo.Modelo_Equipos;
import appcortana.conexion;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Equipos extends javax.swing.JFrame {

    conexion con=new conexion();
    Connection cnn=con.conexionbd();

    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public Equipos() {
        initComponents();
        Cargar_equipos(jTable_Equipos);
        this.setExtendedState(6);
    }
    
    private void Cargar_equipos (JTable tb){
                
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("Número de serie");
        tabla.addColumn("Fotografía");
        tabla.addColumn("Documento cliente");
        
       tb.setDefaultRenderer(Object.class, new Tabla_Imagen());

        jTable_Equipos.setModel(tabla);
        try {  
            ps=cnn.prepareStatement("SELECT * FROM equipo");
            rs=ps.executeQuery();
            while(rs.next()){
                Object[] arr = new Object[4];
                arr [0] = rs.getString(1);               
                Blob blob = rs.getBlob(2);

                    if(blob != null){
                       try{       
                           byte[] data = blob.getBytes(1, (int)blob.length());
                           BufferedImage img = null;

                           try {
                               img = ImageIO.read(new ByteArrayInputStream(data));
                                  }
                           catch (IOException ex) {
                                  JOptionPane.showMessageDialog(null, ex);
                                  } 
                           ImageIcon icono=new ImageIcon(img);
                           arr [1] = new JLabel(icono);                
                          }
                       catch (Exception ex) {
                           arr [1] = "No imagen";
                           }
                        }
                    else{
                        arr [1] = "No imagen";
                    }
                arr [2] = rs.getString(3);
                tabla.addRow(arr);
            }
            tb.setModel (tabla);
          
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar tabla equipos"+ e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jText_Equi_Nserie = new javax.swing.JTextField();
        jButton_Equi_Verificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jText_Imagen = new javax.swing.JTextField();
        jText_Equi_Docli = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Equipos = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabelfoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem24 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        Factura = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        jButton29.setText("Equipos");
        jButton29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton30.setText("Equipos");
        jButton30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CORTANA SOLCIONES");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel5.setBackground(new java.awt.Color(157, 216, 244));
        jPanel5.setLayout(null);

        jText_Equi_Nserie.setBorder(null);
        jText_Equi_Nserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Equi_NserieActionPerformed(evt);
            }
        });
        jPanel5.add(jText_Equi_Nserie);
        jText_Equi_Nserie.setBounds(90, 40, 270, 30);

        jButton_Equi_Verificar.setBackground(new java.awt.Color(71, 172, 205));
        jButton_Equi_Verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_equi.jpeg"))); // NOI18N
        jButton_Equi_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Equi_VerificarActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_Equi_Verificar);
        jButton_Equi_Verificar.setBounds(70, 90, 210, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exam.jpeg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(370, 110, 60, 40);

        jText_Imagen.setBorder(null);
        jPanel5.add(jText_Imagen);
        jText_Imagen.setBounds(100, 160, 320, 30);

        jText_Equi_Docli.setBorder(null);
        jText_Equi_Docli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Equi_DocliActionPerformed(evt);
            }
        });
        jPanel5.add(jText_Equi_Docli);
        jText_Equi_Docli.setBounds(80, 250, 170, 20);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton1);
        jToggleButton1.setBounds(260, 230, 180, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboBox1);
        jComboBox1.setBounds(50, 330, 140, 30);

        jTextField3.setBorder(null);
        jPanel5.add(jTextField3);
        jTextField3.setBounds(230, 330, 220, 30);

        jTable_Equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_EquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Equipos);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 380, 1140, 220);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton2);
        jToggleButton2.setBounds(510, 320, 180, 50);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarequipo.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton3);
        jToggleButton3.setBounds(710, 320, 180, 50);

        jLabelfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabelfoto);
        jLabelfoto.setBounds(510, 10, 640, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tabla_equipo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 0, 1170, 680);

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Equiposheader.jpg"))); // NOI18N

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(150, 181, 213));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INGRESO (1).gif"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.gif"))); // NOI18N
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EQUIPO.gif"))); // NOI18N
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ENTREGA.gif"))); // NOI18N
        jButton27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INVENTARIO.gif"))); // NOI18N
        jButton28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FACTURACION.gif"))); // NOI18N
        jButton31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTES.gif"))); // NOI18N
        jButton32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel2);

        jMenu3.setText("Gestión de Tablas");

        jMenu4.setText("Mantenimiento");

        jMenuItem14.setText("Clientes");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);
        jMenu4.add(jSeparator2);

        jMenuItem15.setText("Usuarios");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);
        jMenu4.add(jSeparator3);

        jMenuItem16.setText("Equipo");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);
        jMenu4.add(jSeparator4);

        jMenuItem17.setText("Ficha Técnica");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);
        jMenu4.add(jSeparator5);

        jMenuItem18.setText("Diagnosticó");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);
        jMenu4.add(jSeparator6);

        jMenuItem19.setText("Servicio");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);
        jMenu4.add(jSeparator7);

        jMenuItem20.setText("Cotización");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);
        jMenu4.add(jSeparator8);

        jMenu8.setText("Factura");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem21.setText("Factura");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem21);
        jMenu8.add(jSeparator19);

        jMenuItem22.setText("Detalle Servicio");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem22);
        jMenu8.add(jSeparator10);

        jMenu4.add(jMenu8);
        jMenu4.add(jSeparator9);
        jMenu4.add(jSeparator17);

        jMenu3.add(jMenu4);
        jMenu3.add(jSeparator16);

        jMenu7.setText("Venta");

        jMenuItem23.setText("Clientes");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem23);
        jMenu7.add(jSeparator11);

        jMenuItem24.setText("Usuarios");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem24);
        jMenu7.add(jSeparator12);

        jMenu5.setText("Ingreso");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem25.setText("Ingreso");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem25);
        jMenu5.add(jSeparator18);

        jMenuItem26.setText("Productos Venta");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem26);

        jMenu7.add(jMenu5);
        jMenu7.add(jSeparator13);

        jMenu6.setText("Factura");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem27.setText("Factura");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem27);
        jMenu6.add(Factura);

        jMenuItem28.setText("Detalle Factura");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);
        jMenu6.add(jSeparator15);

        jMenu7.add(jMenu6);
        jMenu7.add(jSeparator14);

        jMenu3.add(jMenu7);
        jMenu3.add(jSeparator1);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Vistas");
        jMenuBar1.add(jMenu1);

        jMenu9.setText("Procedimientos Almacenados");
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed

        GestionClientes mos= new GestionClientes();
        mos.setVisible(true);
        mos.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

        GestionUsuarios ho= new GestionUsuarios();
        ho.setVisible(true);
        ho.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

        GestionEquipos mo= new GestionEquipos();
        mo.setVisible(true);
        mo.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed

        GestionFichaTecnica hol= new GestionFichaTecnica();
        hol.setVisible(true);
        hol.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed

        GestionDiagnostico m= new GestionDiagnostico();
        m.setVisible(true);
        m.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed

        GestionServicio moss= new GestionServicio();
        moss.setVisible(true);
        moss.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

        GestionCotizacion mosss= new GestionCotizacion();
        mosss.setVisible(true);
        mosss.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed

        GestionFacturaServicio mmosss= new GestionFacturaServicio();
        mmosss.setVisible(true);
        mmosss.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed

        GestionDetalleServicio hola= new GestionDetalleServicio();
        hola.setVisible(true);
        hola.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed

        //factura

    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed

        GestionClientes moos= new GestionClientes();
        moos.setVisible(true);
        moos.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed

        //Usuarios

    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed

        GestionIngreso mmos= new GestionIngreso();
        mmos.setVisible(true);
        mmos.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed

        GestionProductoVenta mooos= new GestionProductoVenta();
        mooos.setVisible(true);
        mooos.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

        //nosirve

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed

        GestionFacturaServicio mmossss= new GestionFacturaServicio();
        mmossss.setVisible(true);
        mmossss.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed

        GestionDetalleVenta mmoss= new GestionDetalleVenta();
        mmoss.setVisible(true);
        mmoss.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed

        //factura

    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jText_Equi_NserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Equi_NserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Equi_NserieActionPerformed

    private void jButton_Equi_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Equi_VerificarActionPerformed
        //        veerificarequipo();
    }//GEN-LAST:event_jButton_Equi_VerificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivo JPEG (*.JPG;*.JPEG))", "jpg","jpeg");
        JFileChooser archivo=new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Seleccionar imagen");
        int ventana = archivo.showOpenDialog(null);

        if(ventana == JFileChooser.APPROVE_OPTION){
            File file =archivo.getSelectedFile();
            jText_Imagen.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(jText_Imagen.getText());

            Icon fondo1=new ImageIcon(foto.getScaledInstance (jLabelfoto.getWidth(), jLabelfoto.getHeight(), Image.SCALE_DEFAULT));
            jLabelfoto.setIcon(fondo1);
            this.repaint();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jText_Equi_DocliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Equi_DocliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Equi_DocliActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        jText_Equi_Nserie.setText(null);
        jText_Imagen.setText(null);
        jText_Equi_Docli.setText(null);
        jLabelfoto.setIcon(null);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTable_EquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_EquiposMouseClicked
        jText_Imagen.setText(null);
        listar_datos();
    }//GEN-LAST:event_jTable_EquiposMouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String nser, img, doc;
        boolean dat;

        nser=jText_Equi_Nserie.getText();
        img=jText_Imagen.getText();
        doc=jText_Equi_Docli.getText();

        Modelo.Equipos eq=new Modelo.Equipos(nser, img, doc);
        Modelo_Equipos me=new Modelo_Equipos();
        dat=me.Guardar_equipo(eq);

        if(dat){
            JOptionPane.showMessageDialog(null, "Datos guardos exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, datos NO guardados");
        }
        Cargar_equipos(jTable_Equipos);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        String nser, img, doc;
        boolean dat = false;

        nser=jText_Equi_Nserie.getText();
        img=jText_Imagen.getText();
        doc=jText_Equi_Docli.getText();

        Modelo.Equipos eq=new Modelo.Equipos(nser, img, doc);
        Modelo_Equipos me=new Modelo_Equipos();

        if(img.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "If" +img);
            dat=me.Editar_equipo_Sinfoto(eq);
        }
        else{
            JOptionPane.showMessageDialog(null, "ELSE" +img);
            dat=me.Editar_equipo(eq);
        }

        if(dat){
            JOptionPane.showMessageDialog(null, "Datos actualizados exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, datos NO actualizados");
        }
        Cargar_equipos(jTable_Equipos);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    
    private void listar_datos (){
        int lista=jTable_Equipos.getSelectedRow();
          String nserie = null;
        if(lista>=0){
           nserie=jTable_Equipos.getValueAt(lista, 0).toString();
           jText_Equi_Nserie.setText(jTable_Equipos.getValueAt(lista, 0).toString());
           jText_Equi_Docli.setText(jTable_Equipos.getValueAt(lista, 2).toString());
        }
                
         try {  
            ps=cnn.prepareStatement("SELECT efotografica FROM equipo WHERE nserie = '"+nserie+"'");
            rs=ps.executeQuery();
            while(rs.next()){
                Object[] arr = new Object[2];               
                Blob blob = rs.getBlob(1);

                    if(blob != null){
                       try{       
                           byte[] data = blob.getBytes(1, (int)blob.length());
                           BufferedImage img = null;

                           try {
                                  img = ImageIO.read(new ByteArrayInputStream(data));
                                  }
                           catch (IOException ex) {
                                  JOptionPane.showMessageDialog(null, ex);
                                  } 
                           ImageIcon icono=new ImageIcon(img);
                                           
        Icon fondo1=new ImageIcon(icono.getImage().getScaledInstance (jLabelfoto.getWidth(), jLabelfoto.getHeight(), Image.SCALE_DEFAULT));
        jLabelfoto.setIcon(fondo1);
        this.repaint();
                          }
                       catch (Exception ex) {
                           jLabelfoto.setText("No imagen");
                           }
                        }
                    else{
                       jLabelfoto.setText("No imagen");
                    }
            }

          
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar tabla equipos"+ e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Factura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton_Equi_Verificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabelfoto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTable jTable_Equipos;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jText_Equi_Docli;
    private javax.swing.JTextField jText_Equi_Nserie;
    private javax.swing.JTextField jText_Imagen;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
