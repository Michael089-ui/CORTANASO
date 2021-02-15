
package Vistas;

import Modelo.Clientes;
import Modelo.Cotizacion;
import Modelo.Diagnostico;
import Modelo.Fichatecnica;
import Modelo.Ingreso;
import Modelo.Modelo_Clientes;
import Modelo.Modelo_Diagnostico;
import Modelo.Modelo_Equipos;
import Modelo.Modelo_Ficha;
import Modelo.Modelo_cotizacion;
import appcortana.conexion;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Ingreso_Servicio extends javax.swing.JFrame {
    conexion con=new conexion();
    Connection cnn=con.conexionbd();

    PreparedStatement ps=null;
    ResultSet rs=null;

    public Ingreso_Servicio() {
        initComponents();
        this.setExtendedState(6);
        cargamarca();
        cargarsistema();
        cargarRam();
        cargarRom();
    }

private void cargamarca (){
    jComboBox_Ficha_Marca.addItem("Acer");
    jComboBox_Ficha_Marca.addItem("Apple");
    jComboBox_Ficha_Marca.addItem("Asus");
    jComboBox_Ficha_Marca.addItem("Alienware");
    
    jComboBox_Ficha_Marca.addItem("Compaq");
    jComboBox_Ficha_Marca.addItem("Canaima");
    
    jComboBox_Ficha_Marca.addItem("Dell");
    
    jComboBox_Ficha_Marca.addItem("Exo");
    
    jComboBox_Ficha_Marca.addItem("Gateway");
    
    jComboBox_Ficha_Marca.addItem("HP");
    jComboBox_Ficha_Marca.addItem("Huawey");
            
    jComboBox_Ficha_Marca.addItem("Lanix");
    jComboBox_Ficha_Marca.addItem("Lenovo");
    jComboBox_Ficha_Marca.addItem("LG");
  
    jComboBox_Ficha_Marca.addItem("Microsoft");
    jComboBox_Ficha_Marca.addItem("MSI");
    
    jComboBox_Ficha_Marca.addItem("Razer");
    
    jComboBox_Ficha_Marca.addItem("Samsung");
    jComboBox_Ficha_Marca.addItem("Sony");
   
    jComboBox_Ficha_Marca.addItem("Toshiba");
 
    jComboBox_Ficha_Marca.addItem("Xiaomi");
    
    jComboBox_Ficha_Marca.addItem("Otra");   
         
}

private void cargarsistema (){
    jComboBox_Ficha_SOperativo.addItem("Windows 10x");
    jComboBox_Ficha_SOperativo.addItem("Windows 10");
    jComboBox_Ficha_SOperativo.addItem("Windows 8.1");
    jComboBox_Ficha_SOperativo.addItem("Windows 8");
    jComboBox_Ficha_SOperativo.addItem("Windows 7");
    jComboBox_Ficha_SOperativo.addItem("Windows Vista");
    jComboBox_Ficha_SOperativo.addItem("Windows XP");
    jComboBox_Ficha_SOperativo.addItem("Windows Me");
    jComboBox_Ficha_SOperativo.addItem("Windows 2000");
    jComboBox_Ficha_SOperativo.addItem("Windows 98");
    jComboBox_Ficha_SOperativo.addItem("Windows 95");
    jComboBox_Ficha_SOperativo.addItem("Mac OS");
    jComboBox_Ficha_SOperativo.addItem("Linux");
    jComboBox_Ficha_SOperativo.addItem("Chrome OS");
    jComboBox_Ficha_SOperativo.addItem("Google Chrome OS(GNU/Linux)");
    jComboBox_Ficha_SOperativo.addItem("Android-x86");
    jComboBox_Ficha_SOperativo.addItem("Unix");
    jComboBox_Ficha_SOperativo.addItem("Solaris");
    jComboBox_Ficha_SOperativo.addItem("FreeBSD");
    jComboBox_Ficha_SOperativo.addItem("FreeDOS");
    jComboBox_Ficha_SOperativo.addItem("Illumos");
    jComboBox_Ficha_SOperativo.addItem("ReactOS");
    jComboBox_Ficha_SOperativo.addItem("Haiku");
    jComboBox_Ficha_SOperativo.addItem("MorphOS");
    jComboBox_Ficha_SOperativo.addItem("Aros");
    jComboBox_Ficha_SOperativo.addItem("MenuetOS");
    jComboBox_Ficha_SOperativo.addItem("PrimeOS");
    jComboBox_Ficha_SOperativo.addItem("Otros");
}

private void cargarRam (){
    jComboBox_Ficha_RAM.addItem("1GB");
    jComboBox_Ficha_RAM.addItem("2GB");
    jComboBox_Ficha_RAM.addItem("3GB");
    jComboBox_Ficha_RAM.addItem("4GB");
    jComboBox_Ficha_RAM.addItem("5GB");
    jComboBox_Ficha_RAM.addItem("6GB");
    jComboBox_Ficha_RAM.addItem("8GB");
    jComboBox_Ficha_RAM.addItem("10GB");
    jComboBox_Ficha_RAM.addItem("12GB");
    jComboBox_Ficha_RAM.addItem("16GB");
    jComboBox_Ficha_RAM.addItem("32GB");
    jComboBox_Ficha_RAM.addItem("64GB");
    jComboBox_Ficha_RAM.addItem("128GB");
    jComboBox_Ficha_RAM.addItem("265GB");
    jComboBox_Ficha_RAM.addItem("512GB");
}

private void cargarRom (){
    jComboBox_Ficha_ROM.addItem("32GB");
    jComboBox_Ficha_ROM.addItem("64GB");
    jComboBox_Ficha_ROM.addItem("128GB");
    jComboBox_Ficha_ROM.addItem("256GB");
    jComboBox_Ficha_ROM.addItem("500GB");
    jComboBox_Ficha_ROM.addItem("1TB");
    jComboBox_Ficha_ROM.addItem("2TB"); 
    jComboBox_Ficha_ROM.addItem("3TB");
    jComboBox_Ficha_ROM.addItem("4TB"); 
    jComboBox_Ficha_ROM.addItem("5TB"); 
    jComboBox_Ficha_ROM.addItem("6TB"); 
    jComboBox_Ficha_ROM.addItem("7TB"); 
    jComboBox_Ficha_ROM.addItem("8TB");
    jComboBox_Ficha_ROM.addItem("9TB"); 
    jComboBox_Ficha_ROM.addItem("10TB o mas"); 
}

public void verificarcliente (){
       String doc, docc = null, nom = null, cel = null, dir = null; 
       doc=jText_Cli_Documento.getText();    
          try {
            ps=cnn.prepareStatement("select documentoc, nombrec, celularc,"
                + "  direccionc from cliente where documentoc = '"+doc+"'");
            rs=ps.executeQuery();
            while(rs.next()){
                docc=rs.getString(1);
                nom=rs.getString(2);
                cel=rs.getString(3);
                dir=rs.getString(4);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if(docc == null){  
            JOptionPane.showMessageDialog(null, "Documento NO registrado");
        }
        else{
            JOptionPane.showMessageDialog(null,"Documento registrado,\n"
           + " Cliente: " +nom+ "\n N° Celular: " +cel+ "\n Dirección del domicilio: "+dir);
        } 
}

public void veerificarequipo (){
           String nser, serbd = null;
       nser=jText_Equi_Nserie.getText();    
          try {
            ps=cnn.prepareStatement("select nserie from equipo where nserie = '"+nser+"'");
            rs=ps.executeQuery();
            while(rs.next()){
                serbd=rs.getString(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if(serbd == null){  
            JOptionPane.showMessageDialog(null, "Equipo NO registrado");
        }
        else{
            JOptionPane.showMessageDialog(null,"Equipo registrado");
        }  
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jText_Cli_Documento = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jText_Cli_Nombre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jText_Cli_Celular = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jText_Cli_Direccion = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jText_Ficha_Procesador = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox_Ficha_Marca = new javax.swing.JComboBox<>();
        jComboBox_Ficha_SOperativo = new javax.swing.JComboBox<>();
        jComboBox_Ficha_RAM = new javax.swing.JComboBox<>();
        jComboBox_Ficha_ROM = new javax.swing.JComboBox<>();
        jCheckBox_Teclado = new javax.swing.JCheckBox();
        jCheckBox_Mouse = new javax.swing.JCheckBox();
        jCheckBox_Microfono = new javax.swing.JCheckBox();
        jCheckBox_CamaraWeb = new javax.swing.JCheckBox();
        jCheckBox_Joystick = new javax.swing.JCheckBox();
        jCheckBox_Touchpad = new javax.swing.JCheckBox();
        jCheckBox_Monitor = new javax.swing.JCheckBox();
        jCheckBox_Impresora = new javax.swing.JCheckBox();
        jCheckBox_Parlante = new javax.swing.JCheckBox();
        jCheckBox_AlmExterno = new javax.swing.JCheckBox();
        jCheckBox_Cascovirtual = new javax.swing.JCheckBox();
        jCheckBox_Proyector = new javax.swing.JCheckBox();
        jCheckBox_Cables = new javax.swing.JCheckBox();
        jCheckBox_Ninguno = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField_Diag_nserie = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton_Cli_Verificar = new javax.swing.JButton();
        jButton_Equi_Verificar = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField_Cot_Servicio = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton_Equi_Abrir = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_Diag_Hard = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_Diag_Software = new javax.swing.JTextArea();
        jButton_Cli_Guardar = new javax.swing.JButton();
        jButton_Equi_guardar = new javax.swing.JButton();
        jText_Equi_Nserie = new javax.swing.JTextField();
        jText_Equi_Docli = new javax.swing.JTextField();
        jText_Ficha_Nserie = new javax.swing.JTextField();
        jButton_Equi_Verificar2 = new javax.swing.JButton();
        jButton_Equi_Verificar3 = new javax.swing.JButton();
        jButton_Equi_Verificar4 = new javax.swing.JButton();
        jTextField_Cot_Repuestos = new javax.swing.JTextField();
        jTextField_Cot_Nserie = new javax.swing.JTextField();
        jLabelfoto = new javax.swing.JLabel();
        jText_Imagen = new javax.swing.JTextField();
        jButton_Limpiar = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton_Ingreso = new javax.swing.JButton();
        jButton_Cliente = new javax.swing.JButton();
        jButton_Equipo = new javax.swing.JButton();
        jButton_Entrega = new javax.swing.JButton();
        jButton_Inventario = new javax.swing.JButton();
        jButton_Factura = new javax.swing.JButton();
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

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Nuevo equipo");

        jText_Cli_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_DocumentoActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Nombre");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("N° Celular");

        jText_Cli_Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_CelularActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Dirección");

        jText_Cli_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Cli_DireccionActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("N° Serie");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Imagen");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Documento C");

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("N° Documento");

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("N° Serie");

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("S.O");

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Marca");

        jText_Ficha_Procesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Ficha_ProcesadorActionPerformed(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("RAM (GB)");

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Perifericos");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("ROM (GB)");

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Procesador");

        jLabel41.setBackground(new java.awt.Color(51, 51, 51));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Nuevo cliente");

        jComboBox_Ficha_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Ficha_MarcaActionPerformed(evt);
            }
        });

        jCheckBox_Teclado.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Teclado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Teclado.setText("Teclado");

        jCheckBox_Mouse.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Mouse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Mouse.setText("Mouse");

        jCheckBox_Microfono.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Microfono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Microfono.setText("Microfono");

        jCheckBox_CamaraWeb.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_CamaraWeb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_CamaraWeb.setText("Cámara web");

        jCheckBox_Joystick.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Joystick.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Joystick.setText("Joystick");

        jCheckBox_Touchpad.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Touchpad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Touchpad.setText("Touchpad");

        jCheckBox_Monitor.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Monitor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Monitor.setText("Monitor");

        jCheckBox_Impresora.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Impresora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Impresora.setText("Impresora");

        jCheckBox_Parlante.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Parlante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Parlante.setText("Altavoz/parlante");

        jCheckBox_AlmExterno.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_AlmExterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_AlmExterno.setText("Almacenamiento externo");

        jCheckBox_Cascovirtual.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Cascovirtual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Cascovirtual.setText("Casco virtual");

        jCheckBox_Proyector.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Proyector.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Proyector.setText("Proyector");
        jCheckBox_Proyector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ProyectorActionPerformed(evt);
            }
        });

        jCheckBox_Cables.setBackground(new java.awt.Color(138, 188, 205));
        jCheckBox_Cables.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Cables.setText("Cables USB, VGA, HDMI, PODER");
        jCheckBox_Cables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CablesActionPerformed(evt);
            }
        });

        jCheckBox_Ninguno.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_Ninguno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Ninguno.setText("Ninguno");
        jCheckBox_Ninguno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_NingunoActionPerformed(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Hardware");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Software");

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Equípo");

        jLabel48.setBackground(new java.awt.Color(51, 51, 51));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("Diagnóstico");

        jLabel49.setBackground(new java.awt.Color(51, 51, 51));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("Ficha Técnica");

        jButton_Cli_Verificar.setBackground(new java.awt.Color(86, 145, 164));
        jButton_Cli_Verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_cli.jpeg"))); // NOI18N
        jButton_Cli_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cli_VerificarActionPerformed(evt);
            }
        });

        jButton_Equi_Verificar.setBackground(new java.awt.Color(71, 172, 205));
        jButton_Equi_Verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_equi.jpeg"))); // NOI18N
        jButton_Equi_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Equi_VerificarActionPerformed(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Cotización");

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("Servicio $");

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Repuestos $");

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("Equipo");

        jButton_Equi_Abrir.setBackground(new java.awt.Color(41, 104, 150));
        jButton_Equi_Abrir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Equi_Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exam.jpeg"))); // NOI18N
        jButton_Equi_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Equi_AbrirActionPerformed(evt);
            }
        });

        jTextArea_Diag_Hard.setColumns(20);
        jTextArea_Diag_Hard.setRows(5);
        jScrollPane5.setViewportView(jTextArea_Diag_Hard);

        jTextArea_Diag_Software.setColumns(20);
        jTextArea_Diag_Software.setRows(5);
        jScrollPane6.setViewportView(jTextArea_Diag_Software);

        jButton_Cli_Guardar.setBackground(new java.awt.Color(86, 145, 164));
        jButton_Cli_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btgcliente.png"))); // NOI18N
        jButton_Cli_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cli_GuardarActionPerformed(evt);
            }
        });

        jButton_Equi_guardar.setBackground(new java.awt.Color(71, 172, 205));
        jButton_Equi_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btgequipo.png"))); // NOI18N
        jButton_Equi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Equi_guardarActionPerformed(evt);
            }
        });

        jText_Equi_Nserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Equi_NserieActionPerformed(evt);
            }
        });

        jText_Equi_Docli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Equi_DocliActionPerformed(evt);
            }
        });

        jButton_Equi_Verificar2.setBackground(new java.awt.Color(71, 172, 205));
        jButton_Equi_Verificar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btgficja.png"))); // NOI18N
        jButton_Equi_Verificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Equi_Verificar2ActionPerformed(evt);
            }
        });

        jButton_Equi_Verificar3.setBackground(new java.awt.Color(71, 172, 205));
        jButton_Equi_Verificar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btgdiagnostico.png"))); // NOI18N
        jButton_Equi_Verificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Equi_Verificar3ActionPerformed(evt);
            }
        });

        jButton_Equi_Verificar4.setBackground(new java.awt.Color(71, 172, 205));
        jButton_Equi_Verificar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btgcoti.png"))); // NOI18N
        jButton_Equi_Verificar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Equi_Verificar4ActionPerformed(evt);
            }
        });

        jLabelfoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jText_Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ImagenActionPerformed(evt);
            }
        });

        jButton_Limpiar.setBackground(new java.awt.Color(71, 172, 205));
        jButton_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel26))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel27))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel28))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel29))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel25))))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jText_Cli_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Cli_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Cli_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Cli_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Cli_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Cli_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(jText_Equi_Nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Equi_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(jText_Equi_Docli, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_Equi_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jText_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel34))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel36))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel35))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel40))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel37))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel39))
                    .addComponent(jButton_Equi_Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jText_Ficha_Nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Ficha_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Ficha_SOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Ficha_Procesador, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Ficha_RAM, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Ficha_ROM, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jCheckBox_Teclado)
                                .addGap(44, 44, 44)
                                .addComponent(jCheckBox_Microfono))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jCheckBox_Mouse)
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox_CamaraWeb))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jCheckBox_Monitor)
                                .addGap(40, 40, 40)
                                .addComponent(jCheckBox_Joystick))
                            .addComponent(jCheckBox_Cascovirtual)
                            .addComponent(jCheckBox_AlmExterno)
                            .addComponent(jCheckBox_Cables)
                            .addComponent(jCheckBox_Ninguno)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_Touchpad)
                                    .addComponent(jCheckBox_Impresora))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_Proyector)
                                    .addComponent(jCheckBox_Parlante))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel53))
                                        .addComponent(jLabel55)))
                                .addGap(4, 4, 4))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton_Equi_Verificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel48)
                        .addComponent(jTextField_Diag_nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Equi_Verificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Cot_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)
                        .addComponent(jTextField_Cot_Repuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Cot_Nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Equi_Verificar4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(jScrollPane6))
                    .addComponent(jButton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel32)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel25)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel26)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel27)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel28)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel29))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel41)
                        .addGap(6, 6, 6)
                        .addComponent(jText_Cli_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton_Cli_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jText_Cli_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jText_Cli_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jText_Cli_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton_Cli_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel24)
                        .addGap(8, 8, 8)
                        .addComponent(jText_Equi_Nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton_Equi_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel34)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel36)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel35)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel40)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addGap(168, 168, 168)
                        .addComponent(jButton_Equi_Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_Ficha_Nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(7, 7, 7)
                        .addComponent(jComboBox_Ficha_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jComboBox_Ficha_SOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jText_Ficha_Procesador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jComboBox_Ficha_RAM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox_Ficha_ROM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel38)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Teclado)
                            .addComponent(jCheckBox_Microfono))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Mouse)
                            .addComponent(jCheckBox_CamaraWeb))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Monitor)
                            .addComponent(jCheckBox_Joystick))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Touchpad)
                            .addComponent(jCheckBox_Parlante))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Impresora)
                            .addComponent(jCheckBox_Proyector))
                        .addGap(3, 3, 3)
                        .addComponent(jCheckBox_Cascovirtual)
                        .addGap(3, 3, 3)
                        .addComponent(jCheckBox_AlmExterno)
                        .addGap(3, 3, 3)
                        .addComponent(jCheckBox_Cables)
                        .addGap(3, 3, 3)
                        .addComponent(jCheckBox_Ninguno))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Diag_nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47))
                                .addGap(9, 9, 9)
                                .addComponent(jButton_Equi_Verificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Cot_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel53))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Cot_Repuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Cot_Nserie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58))
                                .addGap(10, 10, 10)
                                .addComponent(jButton_Equi_Verificar4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel30))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jText_Equi_Docli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Equi_Verificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Equi_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jText_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Untitled design.jpg"))); // NOI18N

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(150, 181, 213));

        jButton_Ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INGRESO (1).gif"))); // NOI18N
        jButton_Ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.gif"))); // NOI18N
        jButton_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClienteActionPerformed(evt);
            }
        });

        jButton_Equipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EQUIPO.gif"))); // NOI18N
        jButton_Equipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EquipoActionPerformed(evt);
            }
        });

        jButton_Entrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ENTREGA.gif"))); // NOI18N
        jButton_Entrega.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton_Entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntregaActionPerformed(evt);
            }
        });

        jButton_Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INVENTARIO.gif"))); // NOI18N
        jButton_Inventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InventarioActionPerformed(evt);
            }
        });

        jButton_Factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FACTURACION.gif"))); // NOI18N
        jButton_Factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTES.gif"))); // NOI18N
        jButton32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jMenuItem18.setText("Diagnóstico");
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
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_EntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EntregaActionPerformed

    private void jButton_EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EquipoActionPerformed
        Equipos eq=new Equipos();
        eq.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_EquipoActionPerformed

    private void jButton_Equi_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Equi_AbrirActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivo JPEG (*.JPG;*.JPEG))", "jpg","jpeg");
        JFileChooser archivo=new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Seleccionar imagen");
        int ventana = archivo.showOpenDialog(null);
        
            if(ventana == JFileChooser.APPROVE_OPTION){
            File file =archivo.getSelectedFile();
            jText_Imagen.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(jText_Imagen.getText());
            foto = foto.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            jLabelfoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jButton_Equi_AbrirActionPerformed

    private void jButton_Equi_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Equi_VerificarActionPerformed
        veerificarequipo();
    }//GEN-LAST:event_jButton_Equi_VerificarActionPerformed

    private void jButton_Cli_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cli_VerificarActionPerformed
        verificarcliente();
    }//GEN-LAST:event_jButton_Cli_VerificarActionPerformed

    private void jCheckBox_NingunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_NingunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_NingunoActionPerformed

    private void jCheckBox_CablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_CablesActionPerformed

    private void jCheckBox_ProyectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ProyectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ProyectorActionPerformed

    private void jText_Cli_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_DireccionActionPerformed

    private void jButton_Equi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Equi_guardarActionPerformed
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
    }//GEN-LAST:event_jButton_Equi_guardarActionPerformed

    private void jButton_Cli_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cli_GuardarActionPerformed
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
    }//GEN-LAST:event_jButton_Cli_GuardarActionPerformed

    private void jText_Equi_NserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Equi_NserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Equi_NserieActionPerformed

    private void jText_Equi_DocliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Equi_DocliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Equi_DocliActionPerformed

    private void jButton_Equi_Verificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Equi_Verificar2ActionPerformed
       String nfic, nser, mar, so, pro, ram, rom, per=null;
       Boolean dat;
       
       nfic=null;
       nser=jText_Ficha_Nserie.getText();
       mar=(String) jComboBox_Ficha_Marca.getSelectedItem();
       so= (String) jComboBox_Ficha_SOperativo.getSelectedItem();
       pro=jText_Ficha_Procesador.getText();
       ram=(String) jComboBox_Ficha_RAM.getSelectedItem();
       rom=(String) jComboBox_Ficha_ROM.getSelectedItem();
       
       String tec="", mouse="", monit="", touch="", imp="", cas="",
        alm="", cab="", mic="", cam="", joys="", alt="", proyec="", nin="";
        
       if(jCheckBox_Teclado.isSelected()){
           tec="Teclado, ";
       }
       if(jCheckBox_Mouse.isSelected()){
           mouse="Mouse, ";
       }
       if(jCheckBox_Monitor.isSelected()){
           monit="Monitor, ";
       }
       if(jCheckBox_Touchpad.isSelected()){
           touch="Touchpad, ";
       }
       if(jCheckBox_Impresora.isSelected()){
           imp="Impresora, ";
       }
       if(jCheckBox_Cascovirtual.isSelected()){
           cas="Cascos virtuales";
       }
       if(jCheckBox_AlmExterno.isSelected()){
           alm="Almacenamoento externo";
       }
       if(jCheckBox_Cables.isSelected()){
           cab="Cables, ";
       }
       if(jCheckBox_Microfono.isSelected()){
           mic="Micorofono, ";
       }
       if(jCheckBox_CamaraWeb.isSelected()){
           cam="Cámara, ";
       }
       if(jCheckBox_Joystick.isSelected()){
            joys="Joystick, ";
       }
       if(jCheckBox_Parlante.isSelected()){
           alt="Alvoz/Parlante, ";
       }
       if(jCheckBox_Proyector.isSelected()){
           proyec="Proyector, ";
       }
       
        per=(tec+ mouse+ monit+ touch+ imp+ cas+ alm+ cab+ mic+ cam+ joys+ alt+ proyec+ nin);

       if(jCheckBox_Ninguno.isSelected()){
           per=("Ninguno");
       }
              
       JOptionPane.showMessageDialog(null, per);
             
        Fichatecnica ft=new Fichatecnica(nfic, nser, mar, so, pro, ram, rom, per);
        Modelo_Ficha mf=new Modelo_Ficha();
        dat=mf.Guardar_ficha(ft);
        
        if(dat){
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Los datos NO fueron guardados");
        }
       
    }//GEN-LAST:event_jButton_Equi_Verificar2ActionPerformed

    private void jButton_Equi_Verificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Equi_Verificar3ActionPerformed
        boolean dat;
        String cod, har, sof, cedt, nserie;
        
        cod=null;
        har=jTextArea_Diag_Hard.getText();
        sof=jTextArea_Diag_Software.getText();
        cedt="1000345123";
        nserie=jTextField_Diag_nserie.getText();
        
        Diagnostico di=new Diagnostico(cod, har, sof, cedt, nserie);
        Modelo_Diagnostico md=new Modelo_Diagnostico();
        dat=md.Guardar_diagnostico(di);
        
        if(dat){
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos NO guardados");
        }     
    }//GEN-LAST:event_jButton_Equi_Verificar3ActionPerformed

    private void jButton_Equi_Verificar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Equi_Verificar4ActionPerformed
        boolean dat;
        String cod, ser, rep, cedt, nserie;
        
        cod=null;
        ser=jTextField_Cot_Servicio.getText();
        rep=jTextField_Cot_Repuestos.getText();
        cedt="1000345123";
        nserie=jTextField_Cot_Nserie.getText();
        
        Cotizacion di=new Cotizacion(cod, ser, rep, cedt, nserie);
        Modelo_cotizacion mc=new Modelo_cotizacion();
        dat=mc.Guardar_cotizacion(di);
        
        if(dat){
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos NO guardados");
        } 
    }//GEN-LAST:event_jButton_Equi_Verificar4ActionPerformed

    private void jText_Cli_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_DocumentoActionPerformed

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

    private void jText_ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_ImagenActionPerformed

    private void jText_Cli_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Cli_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Cli_CelularActionPerformed

    private void jComboBox_Ficha_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Ficha_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Ficha_MarcaActionPerformed

    private void jText_Ficha_ProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Ficha_ProcesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Ficha_ProcesadorActionPerformed

    private void jButton_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClienteActionPerformed
        Cliente obj=new Cliente();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_ClienteActionPerformed

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    private void jButton_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InventarioActionPerformed
        Inventario in=new Inventario();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_InventarioActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Servicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Factura;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton_Cli_Guardar;
    private javax.swing.JButton jButton_Cli_Verificar;
    private javax.swing.JButton jButton_Cliente;
    private javax.swing.JButton jButton_Entrega;
    private javax.swing.JButton jButton_Equi_Abrir;
    private javax.swing.JButton jButton_Equi_Verificar;
    private javax.swing.JButton jButton_Equi_Verificar2;
    private javax.swing.JButton jButton_Equi_Verificar3;
    private javax.swing.JButton jButton_Equi_Verificar4;
    private javax.swing.JButton jButton_Equi_guardar;
    private javax.swing.JButton jButton_Equipo;
    private javax.swing.JButton jButton_Factura;
    private javax.swing.JButton jButton_Ingreso;
    private javax.swing.JButton jButton_Inventario;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JCheckBox jCheckBox_AlmExterno;
    private javax.swing.JCheckBox jCheckBox_Cables;
    private javax.swing.JCheckBox jCheckBox_CamaraWeb;
    private javax.swing.JCheckBox jCheckBox_Cascovirtual;
    private javax.swing.JCheckBox jCheckBox_Impresora;
    private javax.swing.JCheckBox jCheckBox_Joystick;
    private javax.swing.JCheckBox jCheckBox_Microfono;
    private javax.swing.JCheckBox jCheckBox_Monitor;
    private javax.swing.JCheckBox jCheckBox_Mouse;
    private javax.swing.JCheckBox jCheckBox_Ninguno;
    private javax.swing.JCheckBox jCheckBox_Parlante;
    private javax.swing.JCheckBox jCheckBox_Proyector;
    private javax.swing.JCheckBox jCheckBox_Teclado;
    private javax.swing.JCheckBox jCheckBox_Touchpad;
    private javax.swing.JComboBox<String> jComboBox_Ficha_Marca;
    private javax.swing.JComboBox<String> jComboBox_Ficha_RAM;
    private javax.swing.JComboBox<String> jComboBox_Ficha_ROM;
    private javax.swing.JComboBox<String> jComboBox_Ficha_SOperativo;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JTextArea jTextArea_Diag_Hard;
    private javax.swing.JTextArea jTextArea_Diag_Software;
    private javax.swing.JTextField jTextField_Cot_Nserie;
    private javax.swing.JTextField jTextField_Cot_Repuestos;
    private javax.swing.JTextField jTextField_Cot_Servicio;
    private javax.swing.JTextField jTextField_Diag_nserie;
    private javax.swing.JTextField jText_Cli_Celular;
    private javax.swing.JTextField jText_Cli_Direccion;
    private javax.swing.JTextField jText_Cli_Documento;
    private javax.swing.JTextField jText_Cli_Nombre;
    private javax.swing.JTextField jText_Equi_Docli;
    private javax.swing.JTextField jText_Equi_Nserie;
    private javax.swing.JTextField jText_Ficha_Nserie;
    private javax.swing.JTextField jText_Ficha_Procesador;
    private javax.swing.JTextField jText_Imagen;
    // End of variables declaration//GEN-END:variables
}
