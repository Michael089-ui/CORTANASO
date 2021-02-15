
package Vistas;

import appcortana.conexion;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Modelo.Clientes;
import Modelo.Modelo_Clientes;
import javax.swing.table.DefaultTableModel;


public class Cliente extends javax.swing.JFrame {

    conexion con=new conexion();
    Connection cnn=con.conexionbd();

    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public Cliente() {
        initComponents();
        
        this.setExtendedState(6);
        Cargar_Clientes();
        cobobox_filtro();
    }
    
    private void Cargar_Clientes (){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documento");
        tab.addColumn("Nombres");
        tab.addColumn("Celular");
        tab.addColumn("Direccion");
        jTableCliente.setModel(tab);
        String arr[]=new String[10];
    try{
        ps=cnn.prepareStatement("SELECT * FROM cliente");
        rs=ps.executeQuery();
        while(rs.next()){
        arr[0]=rs.getString(1);
        arr[1]=rs.getString(2);
        arr[2]=rs.getString(3);
        arr[3]=rs.getString(4);
        tab.addRow(arr);
        }
    }
     catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la consulta con la tabla clientes"+ex);
    }
    }
    
    private void Filtra_todo(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documento");
        tab.addColumn("Nombres");
        tab.addColumn("Celular");
        tab.addColumn("Direccion");
        jTableCliente.setModel(tab);
        String bus=jText_Cli_Buscar.getText();
        String arr[]=new String[10];
    try{
        ps=cnn.prepareStatement("select * from cliente where documentoc like"
        + " '%"+bus+"%' or nombrec like '%"+bus+"%' or celularc like '%"+bus+"%'"
        + " or direccionc like '%"+bus+"%'");
        rs=ps.executeQuery();
        while(rs.next()){
        arr[0]=rs.getString(1);
        arr[1]=rs.getString(2);
        arr[2]=rs.getString(3);
        arr[3]=rs.getString(4);
        tab.addRow(arr);
        }
    }
     catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la consulta con la tabla clientes"+ex);
    }
    }
    
    private void Filtra_Documento (){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documento");
        tab.addColumn("Nombres");
        tab.addColumn("Celular");
        tab.addColumn("Direccion");
        jTableCliente.setModel(tab);
        String bus=jText_Cli_Buscar.getText();;
        String arr[]=new String[10];
    try{
        ps=cnn.prepareStatement("select * from cliente where documentoc like '%"+bus+"%'");
        rs=ps.executeQuery();
        while(rs.next()){
        arr[0]=rs.getString(1);
        arr[1]=rs.getString(2);
        arr[2]=rs.getString(3);
        arr[3]=rs.getString(4);
        tab.addRow(arr);
        }
    }
     catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la consulta con la tabla clientes"+ex);
    }
    }
    
    private void Filtra_Nombre(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documento");
        tab.addColumn("Nombres");
        tab.addColumn("Celular");
        tab.addColumn("Direccion");
        jTableCliente.setModel(tab);
        String bus=jText_Cli_Buscar.getText();
        String arr[]=new String[10];
    try{
        ps=cnn.prepareStatement("select * from cliente where nombrec like '%"+bus+"%'");
        rs=ps.executeQuery();
        while(rs.next()){
        arr[0]=rs.getString(1);
        arr[1]=rs.getString(2);
        arr[2]=rs.getString(3);
        arr[3]=rs.getString(4);
        tab.addRow(arr);
        }
    }
     catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la consulta con la tabla clientes"+ex);
    }
    }
    
    private void Filtra_Celular(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documento");
        tab.addColumn("Nombres");
        tab.addColumn("Celular");
        tab.addColumn("Direccion");
        jTableCliente.setModel(tab);
        String bus=jText_Cli_Buscar.getText();
        String arr[]=new String[10];
    try{
        ps=cnn.prepareStatement("select * from cliente where celularc like '%"+bus+"%'");
        rs=ps.executeQuery();
        while(rs.next()){
        arr[0]=rs.getString(1);
        arr[1]=rs.getString(2);
        arr[2]=rs.getString(3);
        arr[3]=rs.getString(4);
        tab.addRow(arr);
        }
    }
     catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la consulta con la tabla clientes"+ex);
    }
    }
    
    private void Filtra_Direccion(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documento");
        tab.addColumn("Nombres");
        tab.addColumn("Celular");
        tab.addColumn("Direccion");
        jTableCliente.setModel(tab);
        String bus=jText_Cli_Buscar.getText();
        String arr[]=new String[10];
    try{
        ps=cnn.prepareStatement("select * from cliente where direccionc like '%"+bus+"%'");
        rs=ps.executeQuery();
        while(rs.next()){
        arr[0]=rs.getString(1);
        arr[1]=rs.getString(2);
        arr[2]=rs.getString(3);
        arr[3]=rs.getString(4);
        tab.addRow(arr);
        }
    }
     catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la consulta con la tabla clientes"+ex);
    }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jText_Cli_Buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jComboBox_Filtro = new javax.swing.JComboBox<>();
        jText_Cli_Documento = new javax.swing.JTextField();
        jText_Cli_Nombre = new javax.swing.JTextField();
        jText_Cli_Celular = new javax.swing.JTextField();
        jText_Cli_Direccion = new javax.swing.JTextField();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CORTANA SOLCIONES");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setSize(new java.awt.Dimension(1366, 768));

        jPanel5.setBackground(new java.awt.Color(157, 216, 244));
        jPanel5.setLayout(null);

        jText_Cli_Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Cli_Buscar.setBorder(null);
        jText_Cli_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_BuscarActionPerformed(evt);
            }
        });
        jPanel5.add(jText_Cli_Buscar);
        jText_Cli_Buscar.setBounds(860, 120, 220, 35);

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(490, 220, 610, 280);

        jPanel5.add(jComboBox_Filtro);
        jComboBox_Filtro.setBounds(510, 120, 210, 30);

        jText_Cli_Documento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Cli_Documento.setBorder(null);
        jText_Cli_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_DocumentoActionPerformed(evt);
            }
        });
        jPanel5.add(jText_Cli_Documento);
        jText_Cli_Documento.setBounds(170, 120, 220, 35);

        jText_Cli_Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Cli_Nombre.setBorder(null);
        jText_Cli_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_NombreActionPerformed(evt);
            }
        });
        jPanel5.add(jText_Cli_Nombre);
        jText_Cli_Nombre.setBounds(170, 230, 220, 35);

        jText_Cli_Celular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Cli_Celular.setBorder(null);
        jText_Cli_Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_CelularActionPerformed(evt);
            }
        });
        jPanel5.add(jText_Cli_Celular);
        jText_Cli_Celular.setBounds(170, 340, 220, 35);

        jText_Cli_Direccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Cli_Direccion.setBorder(null);
        jText_Cli_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_DireccionActionPerformed(evt);
            }
        });
        jPanel5.add(jText_Cli_Direccion);
        jText_Cli_Direccion.setBounds(170, 450, 220, 35);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton4);
        jToggleButton4.setBounds(170, 520, 180, 50);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTGCLI2.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton2);
        jToggleButton2.setBounds(370, 520, 230, 50);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTECLI2.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton3);
        jToggleButton3.setBounds(610, 520, 240, 50);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTECLI3.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton1);
        jToggleButton1.setBounds(860, 520, 240, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientetabla.jpeg"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, -40, 1170, 685);

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientesheader.jpg"))); // NOI18N

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(150, 181, 213));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INGRESO (1).gif"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jText_Cli_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_BuscarActionPerformed

    private void jText_Cli_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_DocumentoActionPerformed

    private void jText_Cli_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_NombreActionPerformed

    private void jText_Cli_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_CelularActionPerformed

    private void jText_Cli_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_DireccionActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        jText_Cli_Documento.setText(null);
        jText_Cli_Nombre.setText(null);
        jText_Cli_Celular.setText(null);
        jText_Cli_Direccion.setText(null);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String doc, nom, cel, dir;
        boolean dat;

        doc=jText_Cli_Documento.getText();
        nom=jText_Cli_Nombre.getText();
        cel=jText_Cli_Celular.getText();
        dir=jText_Cli_Direccion.getText();

        Clientes cli=new Clientes(doc, nom, cel, dir);
        Modelo_Clientes mc=new Modelo_Clientes();
        dat=mc.Guardar_cliente(cli);

        if(dat == true){
            JOptionPane.showMessageDialog(null, "Cliente guardado exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos no guardados");
        }
        Cargar_Clientes();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        String doc, nom, cel, dir;
        boolean dat;

        doc=jText_Cli_Documento.getText();
        nom=jText_Cli_Nombre.getText();
        cel=jText_Cli_Celular.getText();
        dir=jText_Cli_Direccion.getText();

        Clientes cli=new Clientes(doc, nom, cel, dir);
        Modelo_Clientes mc=new Modelo_Clientes();
        dat=mc.Editar_cliente(cli);

        if(dat == true){
            JOptionPane.showMessageDialog(null, "Datos actualiados exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al actualizar cliente");
        }
        Cargar_Clientes();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String doc;
        boolean dat;

        doc=jText_Cli_Documento.getText();

        Clientes cli=new Clientes(doc);
        Modelo_Clientes mc=new Modelo_Clientes();
        dat=mc.Eliminar_cliente(cli);

        if(dat == true){
            JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
        }
        Cargar_Clientes();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
    
        listar_datos();
        
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
     
        Ingreso_Servicio obj=new Ingreso_Servicio();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton12ActionPerformed

    public void listar_datos (){
    int lista=jTableCliente.getSelectedRow();
    if(lista>=0){
    jText_Cli_Documento.setText(jTableCliente.getValueAt(lista, 0).toString());
    jText_Cli_Nombre.setText(jTableCliente.getValueAt(lista, 1).toString());
    jText_Cli_Celular.setText(jTableCliente.getValueAt(lista, 2).toString());
    jText_Cli_Direccion.setText(jTableCliente.getValueAt(lista, 3).toString());
        }
    }
    
    private void cobobox_filtro (){
        jComboBox_Filtro.addItem("Todos los campos");
        jComboBox_Filtro.addItem("Documento");
        jComboBox_Filtro.addItem("Nombre");
        jComboBox_Filtro.addItem("Celular");
        jComboBox_Filtro.addItem("Dirección");
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Factura;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JComboBox<String> jComboBox_Filtro;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel52;
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
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jText_Cli_Buscar;
    private javax.swing.JTextField jText_Cli_Celular;
    private javax.swing.JTextField jText_Cli_Direccion;
    private javax.swing.JTextField jText_Cli_Documento;
    private javax.swing.JTextField jText_Cli_Nombre;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
