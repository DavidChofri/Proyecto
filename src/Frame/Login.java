/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import com.placeholder.PlaceHolder;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author David Cruz
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    boolean internet;
   
    PlaceHolder holder;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        internet = false;
        
        holder = new PlaceHolder(txt_usuario,"Ingrese Usuario");
       //holder = new PlaceHolder(txt_contra,"Ingrese Contraseña");
    }

   public void OpenInternet(){
     try{
         Desktop.getDesktop().browse(URI.create("www.google.com"));
        
     }catch(Exception e){
        JOptionPane.showConfirmDialog(this, e);
     }  
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmenu = new javax.swing.JPanel();
        pastel = new javax.swing.JLabel();
        pastel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        estrella = new javax.swing.JLabel();
        portada = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        inicio = new javax.swing.JPanel();
        menuj = new javax.swing.JLabel();
        nuevo_pe = new javax.swing.JLabel();
        reloj = new javax.swing.JLabel();
        pedi_re = new javax.swing.JLabel();
        ajustes = new javax.swing.JLabel();
        ajustesd = new javax.swing.JLabel();
        notas = new javax.swing.JLabel();
        notasd = new javax.swing.JLabel();
        ventas = new javax.swing.JLabel();
        ventasd = new javax.swing.JLabel();
        archivo = new javax.swing.JLabel();
        archivod = new javax.swing.JLabel();
        jp_ingreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_contra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        men = new javax.swing.JLabel();
        j_internet = new javax.swing.JLabel();
        j_musica = new javax.swing.JLabel();
        txt_aceptar = new javax.swing.JToggleButton();
        j_calculadora = new javax.swing.JLabel();
        up = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        menud = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jPanel8 = new javax.swing.JPanel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();

        panelmenu.setBackground(new java.awt.Color(204, 255, 255));
        panelmenu.setMaximumSize(new java.awt.Dimension(290, 510));
        panelmenu.setOpaque(false);
        panelmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pastel.setFont(new java.awt.Font("David", 2, 36)); // NOI18N
        pastel.setText("\"Estrella\"");
        panelmenu.add(pastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, -1));

        pastel1.setFont(new java.awt.Font("David", 2, 48)); // NOI18N
        pastel1.setText("Pasteleria");
        panelmenu.add(pastel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fg.jpg"))); // NOI18N
        panelmenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 240, 200, 170));

        estrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fr.png"))); // NOI18N
        estrella.setOpaque(true);
        panelmenu.add(estrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 170));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 580));
        setMinimumSize(new java.awt.Dimension(1050, 580));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 580));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        portada.setBackground(new java.awt.Color(255, 255, 204));
        portada.setForeground(new java.awt.Color(255, 204, 204));
        portada.setMaximumSize(new java.awt.Dimension(760, 550));
        portada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pasti.jpg"))); // NOI18N
        portada.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 550));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Decker", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 102));
        jLabel18.setText("\"Estrella\"");
        portada.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 210, 50));

        jLabel20.setBackground(new java.awt.Color(0, 204, 51));
        jLabel20.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 0, 102));
        jLabel20.setText("Pasteleria ");
        portada.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 190, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        portada.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 390, 50));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        portada.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        portada.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 390, 50));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        portada.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("David", 2, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 0, 102));
        jLabel19.setText("\"No dejes que ");
        portada.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jLabel21.setFont(new java.awt.Font("David", 2, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 0, 102));
        jLabel21.setText("de tu vida\"");
        portada.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 110, 30));

        jLabel22.setFont(new java.awt.Font("David", 2, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 102));
        jLabel22.setText(" nada se robe el color");
        portada.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 210, 20));

        getContentPane().add(portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 550));

        inicio.setBackground(new java.awt.Color(247, 248, 228));
        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setToolTipText("");
        inicio.setMaximumSize(new java.awt.Dimension(660, 470));
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newImages/new.png"))); // NOI18N
        menuj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuj.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menujMouseMoved(evt);
            }
        });
        menuj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menujMouseExited(evt);
            }
        });
        inicio.add(menuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 150));

        nuevo_pe.setBackground(new java.awt.Color(51, 0, 102));
        nuevo_pe.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        nuevo_pe.setForeground(new java.awt.Color(51, 0, 102));
        nuevo_pe.setText("Nuevo Pedido");
        inicio.add(nuevo_pe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 110, 40));

        reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newImages/clod.png"))); // NOI18N
        reloj.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                relojMouseMoved(evt);
            }
        });
        reloj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                relojMouseExited(evt);
            }
        });
        inicio.add(reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 190, 150));

        pedi_re.setBackground(new java.awt.Color(255, 99, 71));
        pedi_re.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        pedi_re.setForeground(new java.awt.Color(51, 0, 102));
        pedi_re.setText("Pedidos Recibidos");
        inicio.add(pedi_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 160, 20));

        ajustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newImages/ajustes.png"))); // NOI18N
        ajustes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ajustesMouseMoved(evt);
            }
        });
        ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajustesMouseExited(evt);
            }
        });
        inicio.add(ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 170, 150));

        ajustesd.setBackground(new java.awt.Color(255, 99, 71));
        ajustesd.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        ajustesd.setForeground(new java.awt.Color(51, 0, 102));
        ajustesd.setText("Ajustes");
        inicio.add(ajustesd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 90, 20));

        notas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newImages/ide.png"))); // NOI18N
        notas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                notasMouseMoved(evt);
            }
        });
        notas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notasMouseExited(evt);
            }
        });
        inicio.add(notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 150));

        notasd.setBackground(new java.awt.Color(255, 99, 71));
        notasd.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        notasd.setForeground(new java.awt.Color(51, 0, 102));
        notasd.setText("Notas");
        notasd.setToolTipText("");
        inicio.add(notasd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 80, 20));

        ventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newImages/venbe.png"))); // NOI18N
        ventas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ventasMouseMoved(evt);
            }
        });
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ventasMouseExited(evt);
            }
        });
        inicio.add(ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 180, 150));

        ventasd.setBackground(new java.awt.Color(255, 99, 71));
        ventasd.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        ventasd.setForeground(new java.awt.Color(51, 0, 102));
        ventasd.setText("Ventas");
        ventasd.setToolTipText("");
        inicio.add(ventasd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, 20));

        archivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newImages/ard.png"))); // NOI18N
        archivo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                archivoMouseMoved(evt);
            }
        });
        archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                archivoMouseExited(evt);
            }
        });
        inicio.add(archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 190, 150));

        archivod.setBackground(new java.awt.Color(255, 99, 71));
        archivod.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        archivod.setForeground(new java.awt.Color(51, 0, 102));
        archivod.setText("Archivos");
        archivod.setToolTipText("");
        inicio.add(archivod, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 20));

        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 590));

        jp_ingreso.setBackground(new java.awt.Color(204, 255, 255));
        jp_ingreso.setForeground(new java.awt.Color(255, 255, 255));
        jp_ingreso.setMaximumSize(new java.awt.Dimension(230, 405));
        jp_ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Contraseña");
        jp_ingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Usuario");
        jp_ingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 0, 204));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/us.png"))); // NOI18N
        jp_ingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 90, 80));

        txt_usuario.setForeground(new java.awt.Color(153, 153, 153));
        txt_usuario.setToolTipText("");
        txt_usuario.setBorder(null);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jp_ingreso.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 170, 30));
        jp_ingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 170, 10));
        jp_ingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 170, 10));

        txt_contra.setForeground(new java.awt.Color(153, 153, 153));
        txt_contra.setBorder(null);
        jp_ingreso.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, 30));
        jp_ingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ud.png"))); // NOI18N
        jp_ingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/llaves.png"))); // NOI18N
        jp_ingreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        men.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        men.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        men.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menMouseExited(evt);
            }
        });
        jp_ingreso.add(men, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        j_internet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newImages/intbuebo.png"))); // NOI18N
        j_internet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_internet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_internetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j_internetMouseEntered(evt);
            }
        });
        jp_ingreso.add(j_internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 60, 120, 40));

        j_musica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Musical_Notes_32px.png"))); // NOI18N
        j_musica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_ingreso.add(j_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-35, 120, -1, 30));

        txt_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/acep_norm.png"))); // NOI18N
        txt_aceptar.setBorder(null);
        txt_aceptar.setBorderPainted(false);
        txt_aceptar.setContentAreaFilled(false);
        txt_aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/acep_roll.png"))); // NOI18N
        txt_aceptar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/acep_roll.png"))); // NOI18N
        txt_aceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/acep_press.png"))); // NOI18N
        txt_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_aceptarMouseClicked(evt);
            }
        });
        txt_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aceptarActionPerformed(evt);
            }
        });
        jp_ingreso.add(txt_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        j_calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Calculator_32px.png"))); // NOI18N
        j_calculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_calculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_calculadoraMouseClicked(evt);
            }
        });
        jp_ingreso.add(j_calculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-35, 90, -1, 30));

        getContentPane().add(jp_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 750));

        up.setBackground(new java.awt.Color(204, 255, 204));
        up.setForeground(new java.awt.Color(255, 255, 255));
        up.setMaximumSize(new java.awt.Dimension(1000, 50));
        up.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        up.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        up.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 30, 40));

        jPanel5.setBackground(new java.awt.Color(102, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Menu_32px_1.png"))); // NOI18N
        menud.setToolTipText("Menú"); // NOI18N
        menud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menudMouseClicked(evt);
            }
        });
        jPanel5.add(menud, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        up.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 140, 50));

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(238, 112, 82));
        salir.setForeground(new java.awt.Color(238, 112, 82));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/salir_norm.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/salir_press.png"))); // NOI18N
        salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/salir_roll.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel6.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        up.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 150, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 153));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        up.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 150, -1));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        up.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
    this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desesa Salir del Login","Salir",dialog);
        if(result == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void menujMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menujMouseMoved
      menuj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_menujMouseMoved

    private void menujMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menujMouseExited
     menuj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,204)));
    }//GEN-LAST:event_menujMouseExited

    private void j_internetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_internetMouseClicked
    
    OpenInternet();    
        
    }//GEN-LAST:event_j_internetMouseClicked

    private void j_calculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_calculadoraMouseClicked
    try{
        Runtime rt = Runtime.getRuntime();
        Process p = rt.exec("calc");
        p.waitFor();
    }catch(Exception e){
        
    }
    }//GEN-LAST:event_j_calculadoraMouseClicked

    private void ajustesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesMouseMoved
      ajustes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_ajustesMouseMoved

    private void ajustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesMouseExited
      ajustes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,204)));
    }//GEN-LAST:event_ajustesMouseExited

    private void notasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notasMouseMoved
      notas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));  
    }//GEN-LAST:event_notasMouseMoved

    private void notasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notasMouseExited
     notas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,204)));
    }//GEN-LAST:event_notasMouseExited

    private void archivoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoMouseMoved
       archivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153))); 
    }//GEN-LAST:event_archivoMouseMoved

    private void archivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoMouseExited
     archivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,204)));
    }//GEN-LAST:event_archivoMouseExited

    private void ventasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseMoved
     ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_ventasMouseMoved

    private void ventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseExited
    ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,204)));
    }//GEN-LAST:event_ventasMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
      jp_ingreso.setVisible(true);
      up.setVisible(true);
      inicio.setVisible(false);
     portada.setVisible(true);
      
    panelmenu.setVisible(false);
    salir.setVisible(false);
    menud.setVisible(false);
   j_internet.setVisible(true);
        
    }//GEN-LAST:event_formWindowOpened

    private void txt_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aceptarActionPerformed
    
    inicio.setVisible(true);
    
  portada.setVisible(false);
  
  jp_ingreso.setVisible(false);
  
 panelmenu.setVisible(true);
    
 salir.setVisible(true);
 menud.setVisible(true);
    
    }//GEN-LAST:event_txt_aceptarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     inicio.setVisible(false);
     portada.setVisible(true);
     jp_ingreso.setVisible(true);
     panelmenu.setVisible(false);
     salir.setVisible(false);
     menud.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void relojMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relojMouseExited
        reloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,204)));
    }//GEN-LAST:event_relojMouseExited

    private void relojMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relojMouseMoved
        reloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_relojMouseMoved

    private void menMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menMouseClicked

        
       
        
        /*
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-35 ,0, 10, 5, j_internet);
        // regresar
        AnimationClass internett = new AnimationClass();
        internett.jLabelXLeft(0 ,-35, 10, 5, j_internet);

        AnimationClass un = new AnimationClass();
        internet.jLabelXRight(-35 ,0, 10, 5, j_calculadora);
        // regresar
        AnimationClass ffd = new AnimationClass();
        internett.jLabelXLeft(0 ,-35, 10, 5, j_calculadora);

        AnimationClass inss = new AnimationClass();
        internet.jLabelXRight(-35 ,0, 10, 5, j_musica);
        // regresar
        AnimationClass ias = new AnimationClass();
        internett.jLabelXLeft(0 ,-35, 10, 5, j_musica);
*/
    }//GEN-LAST:event_menMouseClicked

    private void txt_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_aceptarMouseClicked
   
       
        
        
        
    }//GEN-LAST:event_txt_aceptarMouseClicked

    private void menudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudMouseClicked
   
 
        
        /*
    AnimationClass nuevo = new AnimationClass();
        nuevo.jLabelXRight(-120,10, 10, 5, menuj);
        // regresar
        AnimationClass nuevor = new AnimationClass();
        nuevor.jLabelXLeft(10,-120, 10, 5, menuj);
        
        AnimationClass nuevorr = new AnimationClass();
        nuevo.jLabelXRight(-110,20, 10, 5, nuevo_pe);
        // regresar
        AnimationClass nuevorrr = new AnimationClass();
        nuevor.jLabelXLeft(20,-110, 10, 5, nuevo_pe);
        
         AnimationClass nuevorrf = new AnimationClass();
        nuevo.jLabelXRight(-140,140, 10, 5, reloj);
        // regresar
        AnimationClass nuevorrrf = new AnimationClass();
        nuevor.jLabelXLeft(140,-140, 10, 5, reloj);
        
         AnimationClass nuevorrdf = new AnimationClass();
        nuevo.jLabelXRight(-140,140, 10, 5, pedi_re);
        // regresar
        AnimationClass nuevorrrdf = new AnimationClass();
        nuevor.jLabelXLeft(140,-140, 10, 5, pedi_re);
        
           AnimationClass nuevorrdfg = new AnimationClass();
        nuevo.jLabelXRight(-120,10, 10, 5, notas);
        // regresar
        AnimationClass nuevorrrdfg = new AnimationClass();
        nuevor.jLabelXLeft(10,-120, 10, 5, notas);
        
           AnimationClass nuevorrddfg = new AnimationClass();
        nuevo.jLabelXRight(-50,50, 10, 5, notasd);
        // regresar
        AnimationClass nuevorrrddfg = new AnimationClass();
        nuevor.jLabelXLeft(50,-50, 10, 5, notasd);
        
          AnimationClass nuevorrdfgf = new AnimationClass();
        nuevo.jLabelXRight(-140,140, 10, 5, ventas);
        // regresar
        AnimationClass nuevorrrdffg = new AnimationClass();
        nuevor.jLabelXLeft(140,-140, 10, 5, ventas);
        
           AnimationClass nuevorrdddfg = new AnimationClass();
        nuevo.jLabelXRight(-50,180, 10, 5, ventasd);
        // regresar
        AnimationClass nuevorrrdddfg = new AnimationClass();
        nuevor.jLabelXLeft(180,-50, 10, 5, ventasd);
        
          AnimationClass nuevorrdfgsf = new AnimationClass();
        nuevo.jLabelXRight(-120,10, 10, 5, archivo);
        // regresar
        AnimationClass nuevorrrdfsfg = new AnimationClass();
        nuevor.jLabelXLeft(10,-120, 10, 5, archivo);
        
           AnimationClass nuevorrdddsfg = new AnimationClass();
        nuevo.jLabelXRight(-60,40, 10, 5, archivod);
        // regresar
        AnimationClass nuevorrsrdddfg = new AnimationClass();
        nuevor.jLabelXLeft(40,-60, 10, 5, archivod);
        
         AnimationClass nuevorrdfgssf = new AnimationClass();
        nuevo.jLabelXRight(-140,140, 10, 5, ajustes);
        // regresar
        AnimationClass nuevorrrdfssfg = new AnimationClass();
        nuevor.jLabelXLeft(140,-140, 10, 5, ajustes);
        
           AnimationClass nuevorrdfddsfg = new AnimationClass();
        nuevo.jLabelXRight(-50,180, 10, 5, ajustesd);
        // regresar
        AnimationClass nuevorrsrdddffg = new AnimationClass();
        nuevor.jLabelXLeft(180,-50, 10, 5, ajustesd);
        
               AnimationClass nuevorrdfxddsfg = new AnimationClass();
        nuevo.jLabelXRight(0,-300, 10, 5, estrella);
        // regresar
        AnimationClass nuevorrsrdddxffg = new AnimationClass();
        nuevor.jLabelXLeft(-300,0, 10, 5, estrella);
        */
    }//GEN-LAST:event_menudMouseClicked

    private void menMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menMouseExited
    
if(!internet)
    Animacion.Animacion.mover_izquierda(0,-80,1,2,j_internet);
        
        
        
    }//GEN-LAST:event_menMouseExited

    private void j_internetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_internetMouseEntered
    
   if(!internet)
       Animacion.Animacion.mover_derecha(-80,0,1,2, j_internet);
        
     
    }//GEN-LAST:event_j_internetMouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajustes;
    private javax.swing.JLabel ajustesd;
    private javax.swing.JLabel archivo;
    private javax.swing.JLabel archivod;
    private javax.swing.JLabel estrella;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel j_calculadora;
    private javax.swing.JLabel j_internet;
    private javax.swing.JLabel j_musica;
    private javax.swing.JPanel jp_ingreso;
    private javax.swing.JLabel men;
    private javax.swing.JLabel menud;
    private javax.swing.JLabel menuj;
    private javax.swing.JLabel notas;
    private javax.swing.JLabel notasd;
    private javax.swing.JLabel nuevo_pe;
    private javax.swing.JPanel panelmenu;
    private javax.swing.JLabel pastel;
    private javax.swing.JLabel pastel1;
    private javax.swing.JLabel pedi_re;
    private javax.swing.JPanel portada;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JLabel reloj;
    private javax.swing.JButton salir;
    private javax.swing.JToggleButton txt_aceptar;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JPanel up;
    private javax.swing.JLabel ventas;
    private javax.swing.JLabel ventasd;
    // End of variables declaration//GEN-END:variables
}
