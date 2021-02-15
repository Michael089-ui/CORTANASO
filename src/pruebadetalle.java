import Modelos.FacturaVenta;
import Modelos.FacturaVentaModelo;
import Modelos.DetalleVenta;
import Modelos.DetalleVentaModelo;
import appcortana.conexion;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pruebadetalle extends javax.swing.JFrame {

    conexion con=new conexion();
    Connection cnn=con.conexionbd();

    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    public pruebadetalle() {
        initComponents();
        
        cargartablad();
        cargartablaf();
        
    }
    
    public void cargartablaf(){
        
        DefaultTableModel tablaa=new DefaultTableModel();
        tablaa.addColumn("NÚMERO FACTURA");
        tablaa.addColumn("FECHA");
        tablaa.addColumn("FORMAPAGO");
        tablaa.addColumn("VALOR TOTAL");
        tablaa.addColumn("DOCUMENTO");
        tablaa.addColumn("NOMBRE");
        tablaa.addColumn("CELULAR");
        
        tablafactura.setModel(tablaa);
        
        String arr[]=new String[10];
        
        try {
            
            ps=cnn.prepareStatement("SELECT * FROM factura_venta");
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                arr[0]=rs.getString(1);
                arr[1]=rs.getString(2);
                arr[2]=rs.getString(3);
                arr[3]=rs.getString(4);
                arr[4]=rs.getString(5);
                arr[5]=rs.getString(6);
                arr[6]=rs.getString(7);
                
                tablaa.addRow(arr);

            }
            
        } 
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error en la consulta" + ex);
            
        }
        
    }
    
    public void cargartablad(){
        
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("NÚMERO DE SERIE");
        tabla.addColumn("NÚMERO FACTURA");
        tabla.addColumn("PRECIO COMPRA");
        
        tabladetalle.setModel(tabla);
        
        String arr[]=new String[10];
        
        try {
            
            ps=cnn.prepareStatement("SELECT * FROM detalle_venta");
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                arr[0]=rs.getString(1);
                arr[1]=rs.getString(2);
                arr[2]=rs.getString(3);
                
                tabla.addRow(arr);

            }
            
        } 
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error en la consulta" + ex);
            
        }
        
    }
    
    public void listadatos(){
        int p=1;
        int lista=tabladetalle.getSelectedRow();
        int lista2=tabladetalle.getSelectedRow();
        
        if (lista >= 0) {
            
            if (serie != null  && factura != null  && compra != null ){
            
            serie.setText(tabladetalle.getValueAt(lista, 0).toString());
            factura.setText(tabladetalle.getValueAt(lista, 1).toString());
            compra.setText(tabladetalle.getValueAt(lista, 2).toString());
            serie.setEditable(true);
                factura.setEditable(true);
                compra.setEditable(true);
            }
            
            if(serie != null && factura != null && compra != null){
            
            serie2.setText(tabladetalle.getValueAt(lista, 0).toString());
            factura2.setText(tabladetalle.getValueAt(lista, 1).toString());
            compra2.setText(tabladetalle.getValueAt(lista, 2).toString());
            }
            
            else if(serie3 != null && factura3 != null && compra3 != null){
            
            serie3.setText(tabladetalle.getValueAt(lista2, 0).toString());
            factura3.setText(tabladetalle.getValueAt(lista2, 1).toString());
            compra3.setText(tabladetalle.getValueAt(lista2, 2).toString());
            
            }
            
            else if(serie4 != null && factura4 != null && compra4 != null){
            
            serie4.setText(tabladetalle.getValueAt(lista2, 0).toString());
            factura4.setText(tabladetalle.getValueAt(lista2, 1).toString());
            compra4.setText(tabladetalle.getValueAt(lista2, 2).toString());
            
            }
            
            else if(serie5 != null && factura5 != null && compra5 != null){
            
            serie5.setText(tabladetalle.getValueAt(lista2, 0).toString());
            factura5.setText(tabladetalle.getValueAt(lista2, 1).toString());
            compra5.setText(tabladetalle.getValueAt(lista2, 2).toString());
            
            }
            
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        serie = new javax.swing.JTextField();
        factura2 = new javax.swing.JTextField();
        factura = new javax.swing.JTextField();
        compra = new javax.swing.JTextField();
        compra2 = new javax.swing.JTextField();
        serie2 = new javax.swing.JTextField();
        compra3 = new javax.swing.JTextField();
        serie3 = new javax.swing.JTextField();
        factura3 = new javax.swing.JTextField();
        serie4 = new javax.swing.JTextField();
        factura4 = new javax.swing.JTextField();
        compra4 = new javax.swing.JTextField();
        serie5 = new javax.swing.JTextField();
        factura5 = new javax.swing.JTextField();
        compra5 = new javax.swing.JTextField();
        cantidad = new javax.swing.JComboBox<>();
        totalcompra = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        pago = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        documento = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablafactura = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        serie.setBorder(null);

        factura2.setBorder(null);

        factura.setBorder(null);

        compra.setBorder(null);

        compra2.setBorder(null);

        serie2.setBorder(null);
        serie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serie2ActionPerformed(evt);
            }
        });

        compra3.setBorder(null);

        serie3.setBorder(null);

        factura3.setBorder(null);

        serie4.setBorder(null);

        factura4.setBorder(null);

        compra4.setBorder(null);

        serie5.setBorder(null);

        factura5.setBorder(null);

        compra5.setBorder(null);

        cantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadMouseClicked(evt);
            }
        });
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        totalcompra.setBorder(null);
        totalcompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalcompraMouseClicked(evt);
            }
        });
        totalcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcompraActionPerformed(evt);
            }
        });

        fecha.setBorder(null);
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        pago.setBorder(null);

        total.setBorder(null);

        codigo.setBorder(null);

        documento.setBorder(null);

        celular.setBorder(null);

        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabladetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladetalleMouseClicked(evt);
            }
        });
        tabladetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabladetalleKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabladetalle);

        tablafactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablafactura);

        jButton1.setText("Guardar Detalle factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar Factura Venta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nombre.setBorder(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/detalle.png"))); // NOI18N
        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(serie2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(factura2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(compra2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(compra3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(serie5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(totalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(serie4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(factura4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(compra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(serie3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(factura5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(750, 750, 750)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(compra5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(compra4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(factura3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serie2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factura2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compra2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(compra3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(serie5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(totalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(serie4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(factura4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(740, 740, 740)
                .addComponent(serie3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(factura5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(compra5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(940, 940, 940)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(compra4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(740, 740, 740)
                .addComponent(factura3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel17)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1110, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serie2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serie2ActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String s,s2,s3,s4,s5,f,f2,f3,f4,f5,p,p2,p3,p4,p5,opcion;
        int dato;
       
        opcion = (String)cantidad.getSelectedItem();
        
        if (opcion.equals("1")) {
        
            s=serie.getText();
            f=factura.getText();
            p=compra.getText();
            
            DetalleVenta usu=new DetalleVenta(s, f, p);
            
            DetalleVentaModelo usubd=new DetalleVentaModelo();
            dato=usubd.ejemploinsertarfacturav(usu);
            
            if (dato==1) {
            
            JOptionPane.showMessageDialog(null, "Datos guardados");
            cargartablad();
            
            }
        
             else{
            
                JOptionPane.showMessageDialog(null, "Sus datos no fueron guardados");
                cargartablad();
                }
        }
        
        else if (opcion.equals("2")) {
        
            s=serie.getText();
            s2=serie2.getText();
            f=factura.getText();
            f2=factura2.getText();
            p=compra.getText();
            p2=compra2.getText();
            
            DetalleVenta usu=new DetalleVenta(s, f, p);
            DetalleVenta usua=new DetalleVenta(s2, f2, p2);
            
            DetalleVentaModelo usubd=new DetalleVentaModelo();
            dato=usubd.ejemploinsertarfacturav(usu);
            
            DetalleVentaModelo usubdd=new DetalleVentaModelo();
            dato=usubdd.ejemploinsertarfacturav(usua);
            
            if (dato==1) {
            
            JOptionPane.showMessageDialog(null, "Datos guardados");
            cargartablad();
            
            }
        
             else{
            
                JOptionPane.showMessageDialog(null, "Sus datos no fueron guardados");
                cargartablad();
                }
        }
        
        else if (opcion.equals("3")) {
        
            s=serie.getText();
            s2=serie2.getText();
            s3=serie3.getText();
            f=factura.getText();
            f2=factura2.getText();
            f3=factura3.getText();
            p=compra.getText();
            p2=compra2.getText();
            p3=compra3.getText();
            
            DetalleVenta usu=new DetalleVenta(s, f, p);
            DetalleVenta usua=new DetalleVenta(s2, f2, p2);
            DetalleVenta us=new DetalleVenta(s3, f3, p3);
            
            DetalleVentaModelo usubd=new DetalleVentaModelo();
            dato=usubd.ejemploinsertarfacturav(usu);
            
            DetalleVentaModelo usubdd=new DetalleVentaModelo();
            dato=usubdd.ejemploinsertarfacturav(usua);
            
            DetalleVentaModelo usubddd=new DetalleVentaModelo();
            dato=usubddd.ejemploinsertarfacturav(us);
            
            if (dato==1) {
            
            JOptionPane.showMessageDialog(null, "Datos guardados");
            cargartablad();
            
            }
        
             else{
            
                JOptionPane.showMessageDialog(null, "Sus datos no fueron guardados");
                cargartablad();
                }
        }
        
        else if (opcion.equals("4")) {
        
            s=serie.getText();
            s2=serie2.getText();
            s3=serie3.getText();
            s4=serie4.getText();
            f=factura.getText();
            f2=factura2.getText();
            f3=factura3.getText();
            f4=factura4.getText();
            p=compra.getText();
            p2=compra2.getText();
            p3=compra3.getText();
            p4=compra4.getText();
            
            DetalleVenta usu=new DetalleVenta(s, f, p);
            DetalleVenta usua=new DetalleVenta(s2, f2, p2);
            DetalleVenta us=new DetalleVenta(s3, f3, p3);
            DetalleVenta u=new DetalleVenta(s4, f4, p4);
            
            DetalleVentaModelo usubd=new DetalleVentaModelo();
            dato=usubd.ejemploinsertarfacturav(usu);
            
            DetalleVentaModelo usubdd=new DetalleVentaModelo();
            dato=usubdd.ejemploinsertarfacturav(usua);
            
            DetalleVentaModelo usubddd=new DetalleVentaModelo();
            dato=usubddd.ejemploinsertarfacturav(us);
            
            DetalleVentaModelo usubdddd=new DetalleVentaModelo();
            dato=usubdddd.ejemploinsertarfacturav(u);
            
                if (dato==1) {
            
                JOptionPane.showMessageDialog(null, "Datos guardados");
                cargartablad();
            
                }
        
                else{
            
                    JOptionPane.showMessageDialog(null, "Sus datos no fueron guardados");
                    cargartablad();
                    }
        }
        
        else if (opcion.equals("5")) {
        
            s=serie.getText();
            s2=serie2.getText();
            s3=serie3.getText();
            s4=serie4.getText();
            f=factura.getText();
            f2=factura2.getText();
            f3=factura3.getText();
            f4=factura4.getText();
            p=compra.getText();
            p2=compra2.getText();
            p3=compra3.getText();
            p4=compra4.getText();
            s5=serie5.getText();
            f5=factura5.getText();
            p5=compra5.getText();
            
            DetalleVenta usu=new DetalleVenta(s, f, p);
            DetalleVenta usua=new DetalleVenta(s2, f2, p2);
            DetalleVenta us=new DetalleVenta(s3, f3, p3);
            DetalleVenta u=new DetalleVenta(s4, f4, p4);
            DetalleVenta usuar=new DetalleVenta(s5, f5, p5);
            
            DetalleVentaModelo usubd=new DetalleVentaModelo();
            dato=usubd.ejemploinsertarfacturav(usu);
            
            DetalleVentaModelo usubdd=new DetalleVentaModelo();
            dato=usubdd.ejemploinsertarfacturav(usua);
            
            DetalleVentaModelo usubddd=new DetalleVentaModelo();
            dato=usubddd.ejemploinsertarfacturav(us);
            
            DetalleVentaModelo usubdddd=new DetalleVentaModelo();
            dato=usubdddd.ejemploinsertarfacturav(u);
            
            DetalleVentaModelo usubddddd=new DetalleVentaModelo();
            dato=usubddddd.ejemploinsertarfacturav(usuar);
            
                if (dato==1) {
            
                JOptionPane.showMessageDialog(null, "Datos guardados");
                cargartablad();
            
                }
        
                else{
            
                    JOptionPane.showMessageDialog(null, "Sus datos no fueron guardados");
                    cargartablad();
                    }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        String c,f,fp,v,d,n,ce;
        int dato;
        
        c=codigo.getText();
        f=fecha.getText();
        fp=pago.getText();
        v=total.getText();
        d=documento.getText();
        n=nombre.getText();
        ce=celular.getText();
        
        
        FacturaVenta usu=new FacturaVenta(c, f, fp, v, d, n, ce);
        
        FacturaVentaModelo usubd=new FacturaVentaModelo();
        dato=usubd.insertarfacturav(usu);
        
        if (dato==1) {
            
            JOptionPane.showMessageDialog(null, "Datos guardados");
            cargartablaf();
            
        }
        
        else{
            
            JOptionPane.showMessageDialog(null, "Sus datos no fueron guardados");

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseClicked
    
    }//GEN-LAST:event_cantidadMouseClicked

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
    
        String opcion;
        opcion = (String)cantidad.getSelectedItem();
        
        if (opcion.equals("1")) {
            
            serie2.setEnabled(false);
            serie3.setEnabled(false);
            serie4.setEnabled(false);
            serie5.setEnabled(false);
            
            
            factura2.setEnabled(false);
            factura3.setEnabled(false);
            factura4.setEnabled(false);
            factura5.setEnabled(false);
            
            compra2.setEnabled(false);
            compra3.setEnabled(false);
            compra4.setEnabled(false);
            compra5.setEnabled(false);
            
        }
        
        else if (opcion.equals("2")) {
            
            serie2.setEnabled(true);
            serie3.setEnabled(false);
            serie4.setEnabled(false);
            serie5.setEnabled(false);
            
            factura2.setEnabled(true);
            factura3.setEnabled(false);
            factura4.setEnabled(false);
            factura5.setEnabled(false);
            
            compra2.setEnabled(true);
            compra3.setEnabled(false);
            compra4.setEnabled(false);
            compra5.setEnabled(false);
            
        }
        
        else if (opcion.equals("3")) {
            
            serie2.setEnabled(true);
            serie3.setEnabled(true);
            serie4.setEnabled(false);
            serie5.setEnabled(false);
            
            factura2.setEnabled(true);
            factura3.setEnabled(true);
            factura4.setEnabled(false);
            factura5.setEnabled(false);
            
            compra2.setEnabled(true);
            compra3.setEnabled(true);
            compra4.setEnabled(false);
            compra5.setEnabled(false);
            
        }
        
        else if (opcion.equals("4")) {
            
            serie2.setEnabled(true);
            serie3.setEnabled(true);
            serie4.setEnabled(true);
            serie5.setEnabled(false);
            
            factura2.setEnabled(true);
            factura3.setEnabled(true);
            factura4.setEnabled(true);
            factura5.setEnabled(false);
            
            compra2.setEnabled(true);
            compra3.setEnabled(true);
            compra4.setEnabled(true);
            compra5.setEnabled(false);
            
        }
        
        else if (opcion.equals("5")) {
            
            serie2.setEnabled(true);
            serie3.setEnabled(true);
            serie4.setEnabled(true);
            serie5.setEnabled(true);
            
            factura2.setEnabled(true);
            factura3.setEnabled(true);
            factura4.setEnabled(true);
            factura5.setEnabled(true);
            
            compra2.setEnabled(true);
            compra3.setEnabled(true);
            compra4.setEnabled(true);
            compra5.setEnabled(true);
            
        }
        
    }//GEN-LAST:event_cantidadActionPerformed

    private void totalcompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalcompraMouseClicked
    
        int num1, num2, num3, num4, num5, total;
        
        num1=Integer.parseInt(compra.getText());
        num2=Integer.parseInt(compra2.getText());
        num3=Integer.parseInt(compra3.getText());
        num4=Integer.parseInt(compra4.getText());
        num5=Integer.parseInt(compra5.getText());
        
        total=num1+num2+num3+num4+num5;
        
        totalcompra.setText(String.valueOf(total));
        
    }//GEN-LAST:event_totalcompraMouseClicked

    private void totalcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcompraActionPerformed
    
        int num1, num2, num3, num4, num5, total;
        
        num1=Integer.parseInt(compra.getText());
        num2=Integer.parseInt(compra2.getText());
        num3=Integer.parseInt(compra3.getText());
        num4=Integer.parseInt(compra4.getText());
        num5=Integer.parseInt(compra5.getText());
        
        total=num1+num2+num3+num4+num5;
        
        totalcompra.setText(String.valueOf(total));
        
    }//GEN-LAST:event_totalcompraActionPerformed

    private void tabladetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladetalleMouseClicked
    
        listadatos();
        
    }//GEN-LAST:event_tabladetalleMouseClicked

    private void tabladetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabladetalleKeyReleased
    
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        
            conexion con=new conexion();
            Connection cnn=con.conexionbd();
            
            String numserie = tabladetalle.getValueAt(tabladetalle.getSelectedRow(), 0).toString();
            String numerofac = tabladetalle.getValueAt(tabladetalle.getSelectedRow(), 1).toString();
            String preciocomp = tabladetalle.getValueAt(tabladetalle.getSelectedRow(), 2).toString();
            
            String SQL = "UPDATE detalle_venta SET preciocomp='"+preciocomp+"' WHERE numserie = '"+numserie+"'  ";
            
        }
        
    }//GEN-LAST:event_tabladetalleKeyReleased

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
            java.util.logging.Logger.getLogger(pruebadetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pruebadetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pruebadetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pruebadetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pruebadetalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cantidad;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField compra;
    private javax.swing.JTextField compra2;
    private javax.swing.JTextField compra3;
    private javax.swing.JTextField compra4;
    private javax.swing.JTextField compra5;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField factura;
    private javax.swing.JTextField factura2;
    private javax.swing.JTextField factura3;
    private javax.swing.JTextField factura4;
    private javax.swing.JTextField factura5;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pago;
    private javax.swing.JTextField serie;
    private javax.swing.JTextField serie2;
    private javax.swing.JTextField serie3;
    private javax.swing.JTextField serie4;
    private javax.swing.JTextField serie5;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTable tablafactura;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalcompra;
    // End of variables declaration//GEN-END:variables
}
