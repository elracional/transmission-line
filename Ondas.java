/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_comunicaciones;

/**
 *
 * @author Chocodrilo
 */
public class Ondas extends javax.swing.JFrame {

    double roe, reflexion;
    double vi, vr, pf, pr;
    double permitividad;
    double vf, vp;
    double C=3*Math.pow(10,8);
    double getHercios, getFrecuencia, Hz, getVolts, getVolts1, getVolts2;
    double hl, grad, rad;
    double GRADOS, RADIANES;
    double v1, v2, n1, n2, i1, i2, n;
    double  pi, potr, pl, gamma;
    formatos fmt = new formatos();
    public Ondas() {
        initComponents();
      
    }

    public void ROE(){
        if(!VI.getText().equals("") && !VR.getText().equals("") && PF.getText().equals("") && PR.getText().equals("")){
        vi=Double.parseDouble(VI.getText());
        vr=Double.parseDouble(VR.getText());
        roe=(vi+vr)/(vi-vr);
         fmt.setRes(roe);
    resultado.setText(fmt.getRes());
        reflexion=vr/vi;
          fmt.setRes(reflexion);
    reflex.setText(fmt.getRes());
        }else    if(VI.getText().equals("") && VR.getText().equals("") && !PF.getText().equals("") && !PR.getText().equals("")){
        pf=Double.parseDouble(PF.getText());
        pr=Double.parseDouble(PR.getText());
        roe=(Math.sqrt(pf)+Math.sqrt(pr))/(Math.sqrt(pf)-Math.sqrt(pr));
         fmt.setRes(roe);
    resultado.setText(fmt.getRes());
        reflexion=(roe-1)/(roe+1);
          fmt.setRes(reflexion);
    reflex.setText(fmt.getRes());
        }else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Resolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        VI = new javax.swing.JTextField();
        VR = new javax.swing.JTextField();
        PF = new javax.swing.JTextField();
        PR = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        reflex = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Resolver1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dielectrico = new javax.swing.JComboBox<>();
        VF = new javax.swing.JTextField();
        VP = new javax.swing.JTextField();
        frecuencia = new javax.swing.JComboBox<>();
        herz = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lambda = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Resolver2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        grados = new javax.swing.JTextField();
        radianes = new javax.swing.JTextField();
        Resolver3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        vueltas = new javax.swing.JTextField();
        V1 = new javax.swing.JTextField();
        NV1 = new javax.swing.JTextField();
        I1 = new javax.swing.JTextField();
        V2 = new javax.swing.JTextField();
        NV2 = new javax.swing.JTextField();
        I2 = new javax.swing.JTextField();
        Obtener1 = new javax.swing.JButton();
        Obtener2 = new javax.swing.JButton();
        Obtener3 = new javax.swing.JButton();
        Obtener4 = new javax.swing.JButton();
        Obtener5 = new javax.swing.JButton();
        Obtener6 = new javax.swing.JButton();
        Obtener7 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        PI = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        PotR = new javax.swing.JTextField();
        voltaje = new javax.swing.JComboBox<>();
        voltaje1 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        PA = new javax.swing.JTextField();
        RC = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        voltaje2 = new javax.swing.JComboBox<>();
        potencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 680));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Relación de onda estacionaria");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 30));

        Resolver.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Resolver.setText("Obtener ROE");
        Resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverActionPerformed(evt);
            }
        });
        jPanel1.add(Resolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Potencia reflejada (Pr):");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 200, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Relación de onda estacionaria (ROE):");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Onda incidente (Vi):");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Onda reflejada (Vr):");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Potencia directa (Pf)");
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        VI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIActionPerformed(evt);
            }
        });
        jPanel1.add(VI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, 30));
        jPanel1.add(VR, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 160, 30));

        PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFActionPerformed(evt);
            }
        });
        jPanel1.add(PF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 150, 30));
        jPanel1.add(PR, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 160, 30));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("En caso de existir potencia llene los siguientes campos");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Coeficiente de reflexión ( Γ ):");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));
        jPanel1.add(reflex, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 200, 30));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Ingrese los siguientes datos");
        jLabel37.setToolTipText("");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jTabbedPane1.addTab("Relacion de onda estacionaria", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Velocidad de propagación");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Factor de velocidad (Vf):");
        jLabel13.setToolTipText("");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Velocidad de propagacion (Vp):");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        Resolver1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Resolver1.setText("Resolver");
        Resolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resolver1ActionPerformed(evt);
            }
        });
        jPanel2.add(Resolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione el material dielectrico:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        dielectrico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un material dielectrico", "Aire", "Alcohol etílico", "Baquelita", "Cuarzo fundido", "Mica", "Plexiglas", "Papel", "Poliestireno", "Polietileno", "Porcelana", "Teflón", "Polipropileno", "Vidrio pirex" }));
        jPanel2.add(dielectrico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 190, 30));
        jPanel2.add(VF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, 30));
        jPanel2.add(VP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 190, 30));

        frecuencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una frecuencia", "10^(−1) (dHZ) decihercio", "10^(−2)(cHZ) centihercio", "10^(−3) (mHZ) milihercio", "10^(-6) (µHZ) microhercio", "10^(−9) (nHZ) nanohercio", "10^(−12) (pHZ) picohercio", "(HZ) hercio", "10^(1 ) (daHZ) decahercio", "10^(2)(hHZ) hectohercio", "10^(3) (kHZ) kilohercio", "10^(6) (MHZ) megahercio", "10^(9) (GHZ) gigahercio", "10^(12) (THZ) terahercio" }));
        jPanel2.add(frecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 30));
        jPanel2.add(herz, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 190, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese la frecuencia (hercios):");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 200, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Longitud de onda (λ):");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 130, 20));
        jPanel2.add(lambda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 190, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Desfase de onda");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        Resolver2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Resolver2.setText("Resolver");
        Resolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resolver2ActionPerformed(evt);
            }
        });
        jPanel2.add(Resolver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Grados:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 50, 20));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Radianes:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 70, 20));

        grados.setEnabled(false);
        jPanel2.add(grados, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 100, 30));

        radianes.setEnabled(false);
        jPanel2.add(radianes, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 100, 30));

        Resolver3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Resolver3.setText("Convertir");
        Resolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resolver3ActionPerformed(evt);
            }
        });
        jPanel2.add(Resolver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, -1, 30));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Convertir λ a grados y radianes");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Ingrese al menos uno de los siguientes datos");
        jLabel36.setToolTipText("");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("m/s");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 70, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Metros");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 70, 30));

        jTabbedPane1.addTab("Velocidad de propagación de la línea", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Transformador");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Voltaje primario (V1):");
        jLabel16.setToolTipText("");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Voltaje secundario (V2):");
        jLabel17.setToolTipText("");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("No de vueltas bobina primaria (N1):");
        jLabel24.setToolTipText("");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Corriente primaria (I1):");
        jLabel25.setToolTipText("");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("No de vueltas bobina secundaria (N2):");
        jLabel26.setToolTipText("");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Corriente secundaria (I2):");
        jLabel27.setToolTipText("");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Razón de vueltas (n):");
        jLabel28.setToolTipText("");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));
        jPanel3.add(vueltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 180, 30));
        jPanel3.add(V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 110, 30));
        jPanel3.add(NV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, 30));
        jPanel3.add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, 30));
        jPanel3.add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 90, 30));
        jPanel3.add(NV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 90, 30));
        jPanel3.add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 90, 30));

        Obtener1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Obtener1.setText("Obtener");
        Obtener1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener1ActionPerformed(evt);
            }
        });
        jPanel3.add(Obtener1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 30));

        Obtener2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Obtener2.setText("Obtener");
        Obtener2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener2ActionPerformed(evt);
            }
        });
        jPanel3.add(Obtener2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, 30));

        Obtener3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Obtener3.setText("Obtener");
        Obtener3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener3ActionPerformed(evt);
            }
        });
        jPanel3.add(Obtener3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 30));

        Obtener4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Obtener4.setText("Obtener");
        Obtener4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener4ActionPerformed(evt);
            }
        });
        jPanel3.add(Obtener4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, -1, 30));

        Obtener5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Obtener5.setText("Obtener");
        Obtener5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener5ActionPerformed(evt);
            }
        });
        jPanel3.add(Obtener5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, 30));

        Obtener6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Obtener6.setText("Obtener");
        Obtener6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener6ActionPerformed(evt);
            }
        });
        jPanel3.add(Obtener6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, -1, 30));

        Obtener7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Obtener7.setText("Obtener");
        Obtener7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obtener7ActionPerformed(evt);
            }
        });
        jPanel3.add(Obtener7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, 30));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Ingrese al menos 2 de los siguientes datos");
        jLabel34.setToolTipText("");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel38.setText("V");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 20, 30));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel39.setText("A");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 30, 30));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel40.setText("V");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, 30));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel42.setText("A");
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, 30));

        jTabbedPane1.addTab("Transformador", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Transferencia de potencia");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Potencia reflejada:");
        jLabel30.setToolTipText("");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));
        jPanel4.add(PI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, 30));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Potencia incidente:");
        jLabel31.setToolTipText("");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel4.add(PotR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 190, 30));

        voltaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una unidad", "10^(−1) (dW) decivatio", "10^(−2)(cW) centivatio", "10^(−3) (mW) milivatio", "10^(-6) (µW) microvatio", "10^(−9) (nW) nanovatio", "10^(−12) (pW) picovatio", "(W) vatio", "10^(1 ) (daW) decavatio", "10^(2)(hW) hectovatio", "10^(3) (kW) kilovatio", "10^(6) (MW) megavatio", "10^(9) (GW) gigavatio", "10^(12) (TW) teravatio" }));
        jPanel4.add(voltaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 30));

        voltaje1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una unidad", "10^(−1) (dW) decivatio", "10^(−2)(cW) centivatio", "10^(−3) (mW) milivatio", "10^(-6) (µW) microvatio", "10^(−9) (nW) nanovatio", "10^(−12) (pW) picovatio", "(W) vatio", "10^(1 ) (daW) decavatio", "10^(2)(hW) hectovatio", "10^(3) (kW) kilovatio", "10^(6) (MW) megavatio", "10^(9) (GW) gigavatio", "10^(12) (TW) teravatio" }));
        jPanel4.add(voltaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 130, 30));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Potencia absorbida:");
        jLabel32.setToolTipText("");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Coeficiente de reflexión al cuadrado ( Γ² ):");
        jLabel33.setToolTipText("");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
        jPanel4.add(PA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 190, 30));
        jPanel4.add(RC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, 30));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Ingrese al menos 2 de los siguientes datos");
        jLabel35.setToolTipText("");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        voltaje2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una unidad", "10^(−1) (dW) decivatio", "10^(−2)(cW) centivatio", "10^(−3) (mW) milivatio", "10^(-6) (µW) microvatio", "10^(−9) (nW) nanovatio", "10^(−12) (pW) picovatio", "(W) vatio", "10^(1 ) (daW) decavatio", "10^(2)(hW) hectovatio", "10^(3) (kW) kilovatio", "10^(6) (MW) megavatio", "10^(9) (GW) gigavatio", "10^(12) (TW) teravatio" }));
        jPanel4.add(voltaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 130, 30));

        potencia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        potencia.setText("Resolver");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });
        jPanel4.add(potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, 30));

        jTabbedPane1.addTab("Transferencia de Potencia", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverActionPerformed
      ROE();

    }//GEN-LAST:event_ResolverActionPerformed
    public void GMD(){
        if (dielectrico.getSelectedIndex()==1){
           permitividad=1.00054;
           
       }
       if (dielectrico.getSelectedIndex()==2){
           permitividad=2.5;
           
       }
       if (dielectrico.getSelectedIndex()==3){
           permitividad=4.8;
           
       }
       if (dielectrico.getSelectedIndex()==4){
           permitividad=3.8;
           
       }
       if (dielectrico.getSelectedIndex()==5){
          permitividad=5.4;
         
       }
       if (dielectrico.getSelectedIndex()==6){
         permitividad=3.45;
         
       }
        if (dielectrico.getSelectedIndex()==7){
           permitividad=3.5;
           
       }
       if (dielectrico.getSelectedIndex()==8){
           permitividad=2.6;
           
       }
       if (dielectrico.getSelectedIndex()==9){
              permitividad=2.3;
              
       }
       if (dielectrico.getSelectedIndex()==10){
              permitividad=6.5;
              
       }
       if (dielectrico.getSelectedIndex()==11){
              permitividad=2.1;
              
       }
       if (dielectrico.getSelectedIndex()==12){
             permitividad=2.25;
             
       }
       if (dielectrico.getSelectedIndex()==13){
             permitividad=4.5;
             
       }
    }
    public void FH(){
      getHercios=Double.parseDouble(herz.getText());
      if (frecuencia.getSelectedIndex()==0){
                     javax.swing.JOptionPane.showMessageDialog(this,"Olvidó elegir una frecuencia\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);   
           getFrecuencia=0;
           
       }
       if (frecuencia.getSelectedIndex()==1){
           getFrecuencia=getHercios*Math.pow(10,(-1));
       }
       if (frecuencia.getSelectedIndex()==2){
           getFrecuencia=getHercios*Math.pow(10,(-2));
       }
       if (frecuencia.getSelectedIndex()==3){
           getFrecuencia=getHercios*Math.pow(10,(-3));
       }
       if (frecuencia.getSelectedIndex()==4){
           getFrecuencia=getHercios*Math.pow(10,(-6));
       }
       if (frecuencia.getSelectedIndex()==5){
           getFrecuencia=getHercios*Math.pow(10,(-9));
       }
       if (frecuencia.getSelectedIndex()==6){
           getFrecuencia=getHercios*Math.pow(10,(-12));
       }
        if (frecuencia.getSelectedIndex()==7){
           getFrecuencia=getHercios;
       }
       if (frecuencia.getSelectedIndex()==8){
           getFrecuencia=getHercios*Math.pow(10,1);
       }
       if (frecuencia.getSelectedIndex()==9){
              getFrecuencia=getHercios*Math.pow(10,2);
       }
       if (frecuencia.getSelectedIndex()==10){
              getFrecuencia=getHercios*Math.pow(10,3);
       }
       if (frecuencia.getSelectedIndex()==11){
              getFrecuencia=getHercios*Math.pow(10,6);
       }
       if (frecuencia.getSelectedIndex()==12){
             getFrecuencia=getHercios*Math.pow(10,9);
       }
       if (frecuencia.getSelectedIndex()==13){
             getFrecuencia=getHercios*Math.pow(10,12);
       }
   }    
    public void getPI(){
      getVolts=Double.parseDouble(PI.getText());
      if (voltaje.getSelectedIndex()==0){
          javax.swing.JOptionPane.showMessageDialog(this,"Olvidó elegir los voltios\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);   
            pi=0;
       }
       if (voltaje.getSelectedIndex()==1){
           pi=getVolts*Math.pow(10,(-1));
       }
       if (voltaje.getSelectedIndex()==2){
           pi=getVolts*Math.pow(10,(-2));
       }
       if (voltaje.getSelectedIndex()==3){
           pi=getVolts*Math.pow(10,(-3));
       }
       if (voltaje.getSelectedIndex()==4){
           pi=getVolts*Math.pow(10,(-6));
       }
       if (voltaje.getSelectedIndex()==5){
           pi=getVolts*Math.pow(10,(-9));
       }
       if (voltaje.getSelectedIndex()==6){
           pi=getVolts*Math.pow(10,(-12));
       }
        if (voltaje.getSelectedIndex()==7){
           pi=getVolts;
       }
       if (voltaje.getSelectedIndex()==8){
           pi=getVolts*Math.pow(10,1);
       }
       if (voltaje.getSelectedIndex()==9){
              pi=getVolts*Math.pow(10,2);
       }
       if (voltaje.getSelectedIndex()==10){
              pi=getVolts*Math.pow(10,3);
       }
       if (voltaje.getSelectedIndex()==11){
              pi=getVolts*Math.pow(10,6);
       }
       if (voltaje.getSelectedIndex()==12){
             pi=getVolts*Math.pow(10,9);
       }
       if (voltaje.getSelectedIndex()==13){
             pi=getVolts*Math.pow(10,12);
       }
   }    
    public void getPR(){
      getVolts1=Double.parseDouble(PotR.getText());
      if (voltaje1.getSelectedIndex()==0){
           potr=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Olvidó elegir los voltios\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);   

       }
       if (voltaje1.getSelectedIndex()==1){
           potr=getVolts1*Math.pow(10,(-1));
       }
       if (voltaje1.getSelectedIndex()==2){
           potr=getVolts1*Math.pow(10,(-2));
       }
       if (voltaje1.getSelectedIndex()==3){
          potr=getVolts1*Math.pow(10,(-3));
       }
       if (voltaje1.getSelectedIndex()==4){
           potr=getVolts1*Math.pow(10,(-6));
       }
       if (voltaje1.getSelectedIndex()==5){
           potr=getVolts1*Math.pow(10,(-9));
       }
       if (voltaje1.getSelectedIndex()==6){
           potr=getVolts1*Math.pow(10,(-12));
       }
        if (voltaje1.getSelectedIndex()==7){
           potr=getVolts1;
       }
       if (voltaje1.getSelectedIndex()==8){
           potr=getVolts1*Math.pow(10,1);
       }
       if (voltaje1.getSelectedIndex()==9){
             potr=getVolts1*Math.pow(10,2);
       }
       if (voltaje1.getSelectedIndex()==10){
              potr=getVolts1*Math.pow(10,3);
       }
       if (voltaje1.getSelectedIndex()==11){
              potr=getVolts1*Math.pow(10,6);
       }
       if (voltaje1.getSelectedIndex()==12){
             potr=getVolts1*Math.pow(10,9);
       }
       if (voltaje1.getSelectedIndex()==13){
             potr=getVolts1*Math.pow(10,12);
       }
   }    
    public void getPA(){
      getVolts2=Double.parseDouble(PA.getText());
      if (voltaje2.getSelectedIndex()==0){
           javax.swing.JOptionPane.showMessageDialog(this,"Olvidó elegir los voltios\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);   
           pl=0;
       }
       if (voltaje2.getSelectedIndex()==1){
           pl=getVolts2*Math.pow(10,(-1));
       }
       if (voltaje2.getSelectedIndex()==2){
           pl=getVolts2*Math.pow(10,(-2));
       }
       if (voltaje2.getSelectedIndex()==3){
           pl=getVolts2*Math.pow(10,(-3));
       }
       if (voltaje2.getSelectedIndex()==4){
           pl=getVolts2*Math.pow(10,(-6));
       }
       if (voltaje2.getSelectedIndex()==5){
           pl=getVolts2*Math.pow(10,(-9));
       }
       if (voltaje2.getSelectedIndex()==6){
           pl=getVolts2*Math.pow(10,(-12));
       }
        if (voltaje2.getSelectedIndex()==7){
           pl=getVolts2;
       }
       if (voltaje2.getSelectedIndex()==8){
           pl=getVolts2*Math.pow(10,1);
       }
       if (voltaje2.getSelectedIndex()==9){
              pl=getVolts2*Math.pow(10,2);
       }
       if (voltaje2.getSelectedIndex()==10){
              pl=getVolts2*Math.pow(10,3);
       }
       if (voltaje2.getSelectedIndex()==11){
              pl=getVolts2*Math.pow(10,6);
       }
       if (voltaje2.getSelectedIndex()==12){
             pl=getVolts2*Math.pow(10,9);
       }
       if (voltaje2.getSelectedIndex()==13){
             pl=getVolts2*Math.pow(10,12);
       }
   }    
      
      
    public void VPL(){
        GMD();
        
        try{
        if(VP.getText().equals("") && VF.getText().equals("") && dielectrico.getSelectedIndex()!=0){
            vf=1/Math.sqrt(permitividad);
            fmt.setRes(vf);
            VF.setText(fmt.getRes());
            vp=vf*C;
            fmt.setRes(vp);
            VP.setText(fmt.getRes());
            
        }
         if(!VP.getText().equals("") && VF.getText().equals("")){
             vp=Double.parseDouble(VP.getText());
            vf=vp/C;
             fmt.setRes(vf);
            VF.setText(fmt.getRes());
            
        }
          if(VP.getText().equals("") && !VF.getText().equals("")){
             vf=Double.parseDouble(VF.getText());
            vp=vf*C;
             fmt.setRes(vp);
            VP.setText(fmt.getRes());
            
        }else{
              javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
          }
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void Desfase(){
        
        //try{
        if(frecuencia.getSelectedIndex()!=0 && !herz.getText().equals("")){
         FH();
        hl=vp/getFrecuencia;
         fmt.setRes(hl);
            lambda.setText(fmt.getRes());
        }
       else if(!lambda.getText().equals("")){
           hl=Double.parseDouble(lambda.getText());
            Hz=hl*vp;
            frecuencia.setSelectedIndex(7);
             fmt.setRes(Hz);
            herz.setText(fmt.getRes());
        }else if(frecuencia.getSelectedIndex()==0 && lambda.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this,"Por favor ingrese la frencuencia o la longitud de onda\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
       /* }catch (Exception e){
             javax.swing.JOptionPane.showMessageDialog(this,"Revise los campos ingresados\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }*/
    }
    private void VIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VIActionPerformed

    private void PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PFActionPerformed

    private void Resolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resolver1ActionPerformed
       VPL();
    }//GEN-LAST:event_Resolver1ActionPerformed

    private void Resolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resolver2ActionPerformed
        if(!VP.getText().equals("")){
        Desfase();
        }
        else{
           javax.swing.JOptionPane.showMessageDialog(this,"Por favor obtenga la velocidad de propagacion\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_Resolver2ActionPerformed

    private void Resolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resolver3ActionPerformed
        if(!lambda.getText().equals("")){
            GRADOS=((hl/6)*180)/(hl/2);
            fmt.setRes(GRADOS);
            grados.setText(fmt.getRes1()+"°");
            RADIANES=(GRADOS*Math.PI)/180;
            fmt.setRes(RADIANES);
            radianes.setText(fmt.getRes());
        }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Por favor obtenga la longitud de onda\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_Resolver3ActionPerformed

    
    
    
    
    private void Obtener1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener1ActionPerformed
         getV1();
       
       V2.setText("");
       NV1.setText("");
       NV2.setText("");
       I1.setText("");
       vueltas.setText("");
       I2.setText("");
    }//GEN-LAST:event_Obtener1ActionPerformed

    private void Obtener2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener2ActionPerformed
        getN1();
        V1.setText("");
       V2.setText("");
       
       NV2.setText("");
       I1.setText("");
       vueltas.setText("");
       I2.setText("");
    }//GEN-LAST:event_Obtener2ActionPerformed

    private void Obtener3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener3ActionPerformed
        getI1();
         V1.setText("");
       V2.setText("");
       NV1.setText("");
       NV2.setText("");
      
       vueltas.setText("");
       I2.setText("");
    }//GEN-LAST:event_Obtener3ActionPerformed

    private void Obtener4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener4ActionPerformed
       getV2();
       V1.setText("");
       NV1.setText("");
       NV2.setText("");
       I1.setText("");
       vueltas.setText("");
       I2.setText("");
    }//GEN-LAST:event_Obtener4ActionPerformed

    private void Obtener5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener5ActionPerformed
       getN2();
        V1.setText("");
       V2.setText("");
       NV1.setText("");
      
       I1.setText("");
       vueltas.setText("");
       I2.setText("");
    }//GEN-LAST:event_Obtener5ActionPerformed

    private void Obtener6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener6ActionPerformed
       getI2();
        V1.setText("");
       V2.setText("");
       NV1.setText("");
       NV2.setText("");
       I1.setText("");
       vueltas.setText("");
      
    }//GEN-LAST:event_Obtener6ActionPerformed

    private void Obtener7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obtener7ActionPerformed
       getn();
        V1.setText("");
       V2.setText("");
       NV1.setText("");
       NV2.setText("");
       I1.setText("");
     
       I2.setText("");
    }//GEN-LAST:event_Obtener7ActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
         potencias();
    }//GEN-LAST:event_potenciaActionPerformed

    public void getn(){
       //n 
        if(!V1.getText().equals("") && !V2.getText().equals("")){
            v1=Double.parseDouble(V1.getText());
            v2=Double.parseDouble(V2.getText());
            n=v2/v1;
             fmt.setRes(n);
            vueltas.setText(fmt.getRes());
        }
         else if( !NV1.getText().equals("") && !NV2.getText().equals("") ){
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            n=n2/n1;
            fmt.setRes(n);
            vueltas.setText(fmt.getRes());
        } else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        } 
    }
    public void getN1(){
       //N1
          if(!NV2.getText().equals("") && !vueltas.getText().equals("")){
            n=Double.parseDouble(vueltas.getText());
            n2=Double.parseDouble(NV2.getText());
            n1=n2/n;
            fmt.setRes(n1);
            NV1.setText(fmt.getRes());
        }   
          else if(!NV2.getText().equals("") && !I1.getText().equals("") && !I2.getText().equals("")){
            i1=Double.parseDouble(I1.getText());
            n2=Double.parseDouble(NV2.getText());
            i2=Double.parseDouble(I2.getText());
            n1=(i2/i1)*n2;
            fmt.setRes(n1);
            NV1.setText(fmt.getRes());
        }  
          else  if(!V1.getText().equals("") && !V2.getText().equals("") && !NV2.getText().equals("")){
            v1=Double.parseDouble(V1.getText());
            n2=Double.parseDouble(NV2.getText());
            v2=Double.parseDouble(V2.getText());
            n1=(v1/v2)*n2;
            fmt.setRes(n1);
            NV1.setText(fmt.getRes());
        }  else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }   
    }
    public void getN2(){
            //N2
        if( !NV1.getText().equals("") && !vueltas.getText().equals("")){
            n=Double.parseDouble(vueltas.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=n*n1;
            fmt.setRes(n2);
            NV2.setText(fmt.getRes());
        }   
       else  if( !NV1.getText().equals("") && !I1.getText().equals("") && !I2.getText().equals("")){
            i1=Double.parseDouble(I1.getText());
            n1=Double.parseDouble(NV1.getText());
            i2=Double.parseDouble(I2.getText());
            n2=(i1/i2)*n1;
            fmt.setRes(n2);
            NV2.setText(fmt.getRes());
        }  
        else if(!V1.getText().equals("") && !V2.getText().equals("") && !NV1.getText().equals("")){
            v1=Double.parseDouble(V1.getText());
            n1=Double.parseDouble(NV1.getText());
            v2=Double.parseDouble(V2.getText());
            n2=(v2/v1)*n1;
            fmt.setRes(n1);
            NV2.setText(fmt.getRes());
        }     else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }  
    }
    public void getI1(){
       
            //I1
        if(!NV1.getText().equals("") && !NV2.getText().equals("") && !I2.getText().equals("")){
            i2=Double.parseDouble(I2.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            i1=(n2/n1)*i2;
            fmt.setRes(i1);
            I1.setText(fmt.getRes());
        }   else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void getI2(){
    
            //I2
       
          if(!NV1.getText().equals("") && !NV2.getText().equals("") && !I1.getText().equals("")){
            i1=Double.parseDouble(I1.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            i2=(n1/n2)*i1;
            fmt.setRes(i2);
            I2.setText(fmt.getRes());
        }   else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }   
    }
    
    public void getV1(){
        
            //v1
               if(!V2.getText().equals("") && !NV1.getText().equals("") && !NV2.getText().equals("") ){
            v2=Double.parseDouble(V2.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            v1=(n1/n2)*v2;
            fmt.setRes(v1);
            V1.setText(fmt.getRes());
        }
        
       else if(!V2.getText().equals("") && !vueltas.getText().equals("")){
            
            n=Double.parseDouble(vueltas.getText());
            v2=Double.parseDouble(V2.getText());
            v1=(v2/n);
            fmt.setRes(v1);
            V1.setText(fmt.getRes());
        } else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
            
    }
    
    public void getV2(){
        //v2
        if(!V1.getText().equals("")/* && V2.getText().equals("")*/ && !NV1.getText().equals("") && !NV2.getText().equals("") && I1.getText().equals("") && I2.getText().equals("")/* && vueltas.getText().equals("")*/){
            v1=Double.parseDouble(V1.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            v2=(n2/n1)*v1;
            fmt.setRes(v2);
            V2.setText(fmt.getRes());
        }
        
       else  if(!V1.getText().equals("") /*&& V2.getText().equals("") && NV1.getText().equals("") && NV2.getText().equals("") */&& I1.getText().equals("") && I2.getText().equals("") && !vueltas.getText().equals("")){
            
            n=Double.parseDouble(vueltas.getText());
            v1=Double.parseDouble(V1.getText());
            v2=v1*n;
            fmt.setRes(v2);
            V2.setText(fmt.getRes());
        } else{
             javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
    }
   

        //transferencia de potencias
        public void potencias(){
            if(!PI.getText().equals("") && !PotR.getText().equals("")){
                getPR();
                getPI();
                pl=pi-potr;
                fmt.setRes(pl);
                voltaje2.setSelectedIndex(7);
                PA.setText(fmt.getRes());
                gamma=potr/pi;
                fmt.setRes(gamma);
                RC.setText(fmt.getRes());
            }
            
            else if(!PotR.getText().equals("") && !RC.getText().equals("") ){
                getPR();
                gamma=Double.parseDouble(RC.getText());
                pi=pr/gamma;
                fmt.setRes(pi);
                voltaje.setSelectedIndex(7);
                PI.setText(fmt.getRes());
                 pl=pi-potr;
                fmt.setRes(pl);
                voltaje2.setSelectedIndex(7);
                PA.setText(fmt.getRes());
            }else if(!PI.getText().equals("") && !RC.getText().equals("") ){
                getPI();
                gamma=Double.parseDouble(RC.getText());
                potr=gamma*pi;
                fmt.setRes(potr);
                voltaje1.setSelectedIndex(7);
                PotR.setText(fmt.getRes());
                pl=pi-potr;
                fmt.setRes(pl);
                voltaje2.setSelectedIndex(7);
                PA.setText(fmt.getRes());
            }else if(!PA.getText().equals("") && !PotR.getText().equals("") ){
                getPA();
                getPR();
                pi=pl+potr;
                fmt.setRes(pi);
                voltaje.setSelectedIndex(7);
                PI.setText(fmt.getRes());
                gamma=potr/pi;
                fmt.setRes(gamma);
                RC.setText(fmt.getRes());
            }else if(!PI.getText().equals("") && !PA.getText().equals("") ){
                getPA();
                getPI();
                potr=pi-pl;
                voltaje1.setSelectedIndex(7);
                fmt.setRes(potr);
                PotR.setText(fmt.getRes());
                gamma=potr/pi;
                fmt.setRes(gamma);
                RC.setText(fmt.getRes());
            }else{
                 javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información llenada en los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);   
            }
        }
       
    
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
            java.util.logging.Logger.getLogger(Ondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ondas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField I1;
    private javax.swing.JTextField I2;
    private javax.swing.JTextField NV1;
    private javax.swing.JTextField NV2;
    private javax.swing.JButton Obtener1;
    private javax.swing.JButton Obtener2;
    private javax.swing.JButton Obtener3;
    private javax.swing.JButton Obtener4;
    private javax.swing.JButton Obtener5;
    private javax.swing.JButton Obtener6;
    private javax.swing.JButton Obtener7;
    private javax.swing.JTextField PA;
    private javax.swing.JTextField PF;
    private javax.swing.JTextField PI;
    private javax.swing.JTextField PR;
    private javax.swing.JTextField PotR;
    private javax.swing.JTextField RC;
    private javax.swing.JButton Resolver;
    private javax.swing.JButton Resolver1;
    private javax.swing.JButton Resolver2;
    private javax.swing.JButton Resolver3;
    private javax.swing.JTextField V1;
    private javax.swing.JTextField V2;
    private javax.swing.JTextField VF;
    private javax.swing.JTextField VI;
    private javax.swing.JTextField VP;
    private javax.swing.JTextField VR;
    private javax.swing.JComboBox<String> dielectrico;
    private javax.swing.JComboBox<String> frecuencia;
    private javax.swing.JTextField grados;
    private javax.swing.JTextField herz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lambda;
    private javax.swing.JButton potencia;
    private javax.swing.JTextField radianes;
    private javax.swing.JTextField reflex;
    private javax.swing.JTextField resultado;
    private javax.swing.JComboBox<String> voltaje;
    private javax.swing.JComboBox<String> voltaje1;
    private javax.swing.JComboBox<String> voltaje2;
    private javax.swing.JTextField vueltas;
    // End of variables declaration//GEN-END:variables
}
/*
 public void Trans(){
        //n
        if(!V1.getText().equals("") && !V2.getText().equals("")){
            v1=Double.parseDouble(V1.getText());
            v2=Double.parseDouble(V2.getText());
            n=v2/v1;
             fmt.setRes(n);
            vueltas.setText(fmt.getRes());
        }
          else if(!NV1.getText().equals("") && !NV2.getText().equals("")){
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            n=n2/n1;
            fmt.setRes(n);
            vueltas.setText(fmt.getRes());
        }
           //N1
          else if(!vueltas.getText().equals("") && !NV2.getText().equals("")){
            n=Double.parseDouble(vueltas.getText());
            n2=Double.parseDouble(NV2.getText());
            n1=n2/n;
            fmt.setRes(n1);
            NV1.setText(fmt.getRes());
        }   
           else if(!I1.getText().equals("") && !NV2.getText().equals("") && !I2.getText().equals("")){
            i1=Double.parseDouble(I1.getText());
            n2=Double.parseDouble(NV2.getText());
            i2=Double.parseDouble(I2.getText());
            n1=(i2/i1)*n2;
            fmt.setRes(n1);
            NV1.setText(fmt.getRes());
        }  
           else if(!V1.getText().equals("") && !NV2.getText().equals("") && !V2.getText().equals("")){
            v1=Double.parseDouble(V1.getText());
            n2=Double.parseDouble(NV2.getText());
            v2=Double.parseDouble(V2.getText());
            n1=(v1/v2)*n2;
            fmt.setRes(n1);
            NV1.setText(fmt.getRes());
        }  
            
            //N2
        else if(!vueltas.getText().equals("") && !NV1.getText().equals("")){
            n=Double.parseDouble(vueltas.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=n*n1;
            fmt.setRes(n2);
            NV2.setText(fmt.getRes());
        }   
         else if(!I1.getText().equals("") && !NV1.getText().equals("") && !I2.getText().equals("")){
            i1=Double.parseDouble(I1.getText());
            n1=Double.parseDouble(NV1.getText());
            i2=Double.parseDouble(I2.getText());
            n2=(i1/i2)*n1;
            fmt.setRes(n2);
            NV2.setText(fmt.getRes());
        }  
          else  if(!V1.getText().equals("") && !NV1.getText().equals("") && !V2.getText().equals("")){
            v1=Double.parseDouble(V1.getText());
            n2=Double.parseDouble(NV1.getText());
            v2=Double.parseDouble(V2.getText());
            n2=(v2/v1)*n1;
            fmt.setRes(n1);
            NV2.setText(fmt.getRes());
        }     
            //I2
       
         else   if(!I1.getText().equals("") && !NV1.getText().equals("") && !NV2.getText().equals("")){
            i1=Double.parseDouble(I1.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            i2=(n1/n2)*i1;
            fmt.setRes(i2);
            I2.setText(fmt.getRes());
        }  
            //I1
        else  if(!I2.getText().equals("") && !NV1.getText().equals("") && !NV2.getText().equals("")){
            i2=Double.parseDouble(I2.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            i1=(n2/n1)*i2;
            fmt.setRes(i1);
            I1.setText(fmt.getRes());
        } 
            
            //v1
       else if(!V2.getText().equals("") && !NV1.getText().equals("") && !NV2.getText().equals("")){
            v2=Double.parseDouble(V2.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            v1=(n1/n2)*v2;
            fmt.setRes(v1);
            V1.setText(fmt.getRes());
        }
        
         else  if(!vueltas.getText().equals("") && !V2.getText().equals("")){
            
            n=Double.parseDouble(vueltas.getText());
            v2=Double.parseDouble(V2.getText());
            v1=(v2/n);
            fmt.setRes(v1);
            V1.setText(fmt.getRes());
        }
                   //v2
         else if(!V1.getText().equals("") && !NV1.getText().equals("") && !NV2.getText().equals("")){
            v1=Double.parseDouble(V1.getText());
            n1=Double.parseDouble(NV1.getText());
            n2=Double.parseDouble(NV2.getText());
            v2=(n2/n1)*v1;
            fmt.setRes(v2);
            V2.setText(fmt.getRes());
        }
        
         else  if(!vueltas.getText().equals("") && !V1.getText().equals("")){
            
            n=Double.parseDouble(vueltas.getText());
            v1=Double.parseDouble(V2.getText());
            v2=v1*n;
            fmt.setRes(v2);
            V2.setText(fmt.getRes());
        }else{
               javax.swing.JOptionPane.showMessageDialog(this,"Revise bien la información de los campos\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
           }
    }
*/