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
public class LineasTransmision extends javax.swing.JFrame {
    //declaramos las variables a utilizar
    //variables para dielectrico
    double permitividad;
    double conductor; //para el conductor
    double getHercios; //hercios
    double getFrecuencia; //frecuencia
    double penetracion; //indice de penetracin
    double W, CD;
    double M, E;
    double A, B, UA, UB; //unidades
    double radio, distancia, radioA, radioB, radioC;//radios
    double unidad, unidad1, unidadA, unidadB, unidadC;
    double L, C, G, R; //variables donde se almacenan los resultados de la fibra
    double Ctan; //tangente
    //se invoca como objeto a la clase que otorga formato
    formatos fmt = new formatos();
    public LineasTransmision() {
        initComponents();
        //iniciamos con los escondiendo los labels donde se encuentran las altas y bajas frecuencias
        Alta.setVisible(false);
        Baja.setVisible(false);
        Alta1.setVisible(false);
        Baja1.setVisible(false);
        this.setTitle("Lineas de transmisión");
    }
//se obtiene del combobox el material dielectrico
    public void GMD(){
        if (dielectrico.getSelectedIndex()==0){
           permitividad=1.00054;
           Ctan=0;
       }
       if (dielectrico.getSelectedIndex()==1){
           permitividad=2.5;
           Ctan=100*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==2){
           permitividad=4.8;
           Ctan=22*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==3){
           permitividad=3.8;
           Ctan=.75*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==4){
          permitividad=5.4;
          Ctan=.60*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==5){
         permitividad=3.45;
         Ctan=30*Math.pow(10,(-3));
       }
        if (dielectrico.getSelectedIndex()==6){
           permitividad=3.5;
           Ctan=8*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==7){
           permitividad=2.6;
           Ctan=.05*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==8){
              permitividad=2.3;
              Ctan=.20*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==9){
              permitividad=6.5;
              Ctan=14*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==10){
              permitividad=2.1;
              Ctan=.30*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==11){
             permitividad=2.25;
             Ctan=.30*Math.pow(10,(-3));
       }
       if (dielectrico.getSelectedIndex()==12){
             permitividad=4.5;
             Ctan=.60*Math.pow(10,(-3));
       }
    }
    //se obtiene del combobox la conductividad

    public void GMC(){
        if (conductividad.getSelectedIndex()==0){
          conductor=3.82*Math.pow(10,7);
       }
       if (conductividad.getSelectedIndex()==1){
          
           conductor=2.80*Math.pow(10,4);
       }
       if (conductividad.getSelectedIndex()==2){
           conductor=5.80*Math.pow(10,7);
       }
       if (conductividad.getSelectedIndex()==3){
           conductor=9.87*Math.pow(10,7);
       }
       if (conductividad.getSelectedIndex()==4){
           conductor=1.03*Math.pow(10,7);
       }
       if (conductividad.getSelectedIndex()==5){
           conductor=1.50*Math.pow(10,7);
       }
        if (conductividad.getSelectedIndex()==6){
          conductor=1.45*Math.pow(10,7);
       }
      if (conductividad.getSelectedIndex()==7){
           conductor=4.10*Math.pow(10,7);
       }
        if (conductividad.getSelectedIndex()==8){
            conductor=6.17*Math.pow(10,7);  
       }
       if (conductividad.getSelectedIndex()==9){
              conductor=1.82*Math.pow(10,7); 
       }
   
       if (conductividad.getSelectedIndex()==10){
              conductor=1.67*Math.pow(10,7); 
       }
      
    }
    
 //se obtiene del combobox la frecuencia
   
public void FH(){
      getHercios=Double.parseDouble(herz.getText());
       if (frecuencia.getSelectedIndex()==0){
           getFrecuencia=getHercios*Math.pow(10,(-1));
       }
       if (frecuencia.getSelectedIndex()==1){
           getFrecuencia=getHercios*Math.pow(10,(-2));
       }
       if (frecuencia.getSelectedIndex()==2){
           getFrecuencia=getHercios*Math.pow(10,(-3));
       }
       if (frecuencia.getSelectedIndex()==3){
           getFrecuencia=getHercios*Math.pow(10,(-6));
       }
       if (frecuencia.getSelectedIndex()==4){
           getFrecuencia=getHercios*Math.pow(10,(-9));
       }
       if (frecuencia.getSelectedIndex()==5){
           getFrecuencia=getHercios*Math.pow(10,(-12));
       }
        if (frecuencia.getSelectedIndex()==6){
           getFrecuencia=getHercios;
       }
       if (frecuencia.getSelectedIndex()==7){
           getFrecuencia=getHercios*Math.pow(10,1);
       }
       if (frecuencia.getSelectedIndex()==8){
              getFrecuencia=getHercios*Math.pow(10,2);
       }
       if (frecuencia.getSelectedIndex()==9){
              getFrecuencia=getHercios*Math.pow(10,3);
       }
       if (frecuencia.getSelectedIndex()==10){
              getFrecuencia=getHercios*Math.pow(10,6);
       }
       if (frecuencia.getSelectedIndex()==11){
             getFrecuencia=getHercios*Math.pow(10,9);
       }
       if (frecuencia.getSelectedIndex()==12){
             getFrecuencia=getHercios*Math.pow(10,12);
       }
   }    
//se obtiene del combobox  las unidades

public void GU(){
    unidad = Double.parseDouble(radiofibra.getText());
    if (unidades.getSelectedIndex()==0){
           radio=unidad*Math.pow(10,(-3));
       }
       if (unidades.getSelectedIndex()==1){
           radio=unidad*Math.pow(10,(-2));
       }
       if (unidades.getSelectedIndex()==2){
           radio=unidad;
       }
}
//se obtiene del combobox  las unidades secundarias

public void GD(){
    unidad1 = Double.parseDouble(dist.getText());
    if (unidades1.getSelectedIndex()==0){
           distancia=unidad1*Math.pow(10,(-3));
       }
       if (unidades1.getSelectedIndex()==1){
           distancia=unidad1*Math.pow(10,(-2));
       }
       if (unidades1.getSelectedIndex()==2){
           distancia=unidad1;
       }
}

//metodo por el cual se obtiene la constante de penetracion
public void constantePenetracion(){
        //se utiliza la libreria math para obtener pi
    W=(2*Math.PI)*getFrecuencia;
     M=Math.PI*(4*Math.pow(10,(-7)));
    E=permitividad*(8.85*Math.pow(10,(-12)));
    penetracion=Math.sqrt(2/(W*M*conductor));
    CD=W*E*Ctan;
    //le otorgamos formato de un valor con 3 decimales
    fmt.setRes(penetracion);
    cons.setText(fmt.getRes());
            
}
//metodo por el cual se obtiene la linea bifilar para altas frecuencias
public void BifilarAlta(){
     L=(M/Math.PI)*(Math.pow(Math.cosh(distancia/(2*radio)), (-1)));
    fmt.setRes(L);
    Lcampo.setText(fmt.getRes());
    C=(Math.PI*E)/(Math.pow(Math.cosh(distancia/(2*radio)), (-1)));
    //le otorgamos formato de un valor con 3 decimales
    fmt.setRes(C);
    Ccampo.setText(fmt.getRes());
    R=1/(Math.PI*radio*penetracion*conductor);
    fmt.setRes(R);
    Rcampo.setText(fmt.getRes());
    G=(Math.PI*CD)/(Math.pow(Math.cosh(distancia/(2*radio)), (-1)));
    fmt.setRes(G);
    Gcampo.setText(fmt.getRes()); 
}
//metodo por el cual se obtiene la linea bifilar para bajas frecuencias
public void BifilarBaja(){
    L=(M/Math.PI)*((1/4)+Math.pow(Math.cosh(distancia/(2*radio)), (-1)));
    fmt.setRes(L);
    Lcampo.setText(fmt.getRes());
    C=((Math.PI*E)/(Math.pow(Math.cosh(distancia/(2*radio)), (-1))));
    fmt.setRes(C);
    Ccampo.setText(fmt.getRes());
    R=2/(Math.PI*Math.pow(radio,2)*conductor);
    fmt.setRes(R);
    Rcampo.setText(fmt.getRes());
    G=(Math.PI*CD)/(Math.pow(Math.cosh(distancia/(2*radio)), (-1)));
    fmt.setRes(G);
    Gcampo.setText(fmt.getRes());
}
//metodo por el cual se obtiene la las placas paralelas
public void PlacasParalelas(){
    L=(M*A)/B;
    fmt.setRes(L);
    Lcampo2.setText(fmt.getRes());
    C=(E*B)/A;
    fmt.setRes(C);
    Ccampo2.setText(fmt.getRes());
    R=2/(conductor*penetracion*B);
    fmt.setRes(R);
    Rcampo2.setText(fmt.getRes());
    G=(CD*B)/A;
    fmt.setRes(G);
    Gcampo2.setText(fmt.getRes());
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        herz = new javax.swing.JTextField();
        frecuencia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dielectrico = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        conductividad = new javax.swing.JComboBox<>();
        Resolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cons = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Resolver1 = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radiofibra = new javax.swing.JTextField();
        unidades = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Lcampo = new javax.swing.JTextField();
        Ccampo = new javax.swing.JTextField();
        Gcampo = new javax.swing.JTextField();
        Rcampo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dist = new javax.swing.JTextField();
        unidades1 = new javax.swing.JComboBox<>();
        Baja = new javax.swing.JLabel();
        Alta = new javax.swing.JLabel();
        resuelve = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        ImpBif = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        resuelve3 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        radiofibraA = new javax.swing.JTextField();
        unidadesA = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        radiofibraB = new javax.swing.JTextField();
        unidadesB = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        radiofibraC = new javax.swing.JTextField();
        unidadesC = new javax.swing.JComboBox<>();
        resuelve1 = new javax.swing.JButton();
        Baja1 = new javax.swing.JLabel();
        Alta1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Lcampo1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Ccampo1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Rcampo1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Gcampo1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        ImpCoa = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        resuelve4 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Ancho = new javax.swing.JTextField();
        unidadesA1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        Largo = new javax.swing.JTextField();
        unidadesB1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        Lcampo2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Ccampo2 = new javax.swing.JTextField();
        Rcampo2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Gcampo2 = new javax.swing.JTextField();
        resuelve2 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        resuelve5 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(922, 640));
        setMinimumSize(new java.awt.Dimension(922, 640));
        setPreferredSize(new java.awt.Dimension(922, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane1.setDividerLocation(280);
        jSplitPane1.setDividerSize(1);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setEnabled(false);
        jSplitPane1.setFocusable(false);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(1024, 340));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1024, 680));

        jPanel4.setPreferredSize(new java.awt.Dimension(1024, 300));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese la frecuencia (f):");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 52, -1, -1));
        jPanel4.add(herz, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 52, 221, 24));

        frecuencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10^(−1) (dHZ) decihercio", "10^(−2)(cHZ) centihercio", "10^(−3) (mHZ) milihercio", "10^(-6) (µHZ) microhercio", "10^(−9) (nHZ) nanohercio", "10^(−12) (pHZ) picohercio", "(HZ) hercio", "10^(1 ) (daHZ) decahercio", "10^(2)(hHZ) hectohercio", "10^(3) (kHZ) kilohercio", "10^(6) (MHZ) megahercio", "10^(9) (GHZ) gigahercio", "10^(12) (THZ) terahercio" }));
        jPanel4.add(frecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 54, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione el material dielectrico:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 100, -1, -1));

        dielectrico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aire", "Alcohol etílico", "Baquelita", "Cuarzo fundido", "Mica", "Plexiglas", "Papel", "Poliestireno", "Polietileno", "Porcelana", "Teflón", "Polipropileno", "Vidrio pirex" }));
        jPanel4.add(dielectrico, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 94, 221, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Seleccione el material conductor:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 152, -1, -1));

        conductividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluminio", "Carbono", "Cobre", "Grafeno", "Hierro", "Latón", "Niquel", "Oro", "Plata", "Tungsteno", "Zinc" }));
        jPanel4.add(conductividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 146, 221, 30));

        Resolver.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Resolver.setText("Obtener constante");
        Resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverActionPerformed(evt);
            }
        });
        jPanel4.add(Resolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 194, -1, 35));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Constante de penetración (δ):");
        jLabel7.setToolTipText("");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 246, -1, -1));

        cons.setEnabled(false);
        jPanel4.add(cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 240, 221, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("m");
        jLabel8.setToolTipText("");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 246, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Constante de Penetración");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 0, -1, -1));

        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Obtenga primero la constante de penetración");
        jLabel46.setToolTipText("");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 30, -1, -1));

        Resolver1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Resolver1.setText("Limpiar");
        Resolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resolver1ActionPerformed(evt);
            }
        });
        jPanel4.add(Resolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 194, -1, 35));

        Volver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Volver.setText("Regresar");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel4.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 100, 40));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/blue.jpg"))); // NOI18N
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 280));

        jSplitPane1.setTopComponent(jPanel4);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linea Bifilar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 250, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/medios-de-transmision-25-638.jpg"))); // NOI18N
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 250, 70));
        jPanel1.add(radiofibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 52, 221, 27));

        unidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel1.add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, 27));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("L:");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 30, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("C:");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 30, 20));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("G:");
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 30, 20));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("R:");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 30, 20));

        Lcampo.setEnabled(false);
        jPanel1.add(Lcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 84, 23));

        Ccampo.setEnabled(false);
        jPanel1.add(Ccampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 85, 23));

        Gcampo.setEnabled(false);
        jPanel1.add(Gcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 90, 23));

        Rcampo.setEnabled(false);
        jPanel1.add(Rcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 89, 23));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ingrese la distancia entre fases (d):");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, 30));
        jPanel1.add(dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 97, 221, 27));

        unidades1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel1.add(unidades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, 27));

        Baja.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Baja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Baja.setText("Baja Frecuencia");
        jPanel1.add(Baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 250, 40));

        Alta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Alta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alta.setText("Alta Frecuencia");
        jPanel1.add(Alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 250, 40));

        resuelve.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resuelve.setText("Resolver");
        resuelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelveActionPerformed(evt);
            }
        });
        jPanel1.add(resuelve, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel30.setText("Impedancia caracteristica:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 210, 30));

        ImpBif.setEnabled(false);
        jPanel1.add(ImpBif, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 180, 30));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel31.setText("H/m");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 40, 20));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel32.setText("F/m");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 50, 20));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel33.setText("Ω/m");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 40, 20));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel34.setText("V/m");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 40, 20));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel35.setText("Ω");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 50, 30));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Ingrese el radio (a):");
        jLabel37.setToolTipText("");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 140, 30));

        resuelve3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resuelve3.setText("Limpiar");
        resuelve3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelve3ActionPerformed(evt);
            }
        });
        jPanel1.add(resuelve3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/purple.jpg"))); // NOI18N
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 320));

        jTabbedPane1.addTab("Linea Bifilar", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cable Coaxial");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 250, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/medios-de-transmision-22-638.jpg"))); // NOI18N
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 200, 190));
        jPanel2.add(radiofibraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 221, 27));

        unidadesA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel2.add(unidadesA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, 27));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Ingrese el radio C:");
        jLabel15.setToolTipText("");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 110, 30));
        jPanel2.add(radiofibraB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 221, 27));

        unidadesB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel2.add(unidadesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, 27));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Ingrese el radio B:");
        jLabel16.setToolTipText("");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));
        jPanel2.add(radiofibraC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 221, 27));

        unidadesC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel2.add(unidadesC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, 27));

        resuelve1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resuelve1.setText("Resolver");
        resuelve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelve1ActionPerformed(evt);
            }
        });
        jPanel2.add(resuelve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        Baja1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Baja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Baja1.setText("Baja Frecuencia");
        jPanel2.add(Baja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 250, 40));

        Alta1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Alta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alta1.setText("Alta Frecuencia");
        jPanel2.add(Alta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 250, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("L:");
        jLabel17.setToolTipText("");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 30, -1));

        Lcampo1.setEnabled(false);
        jPanel2.add(Lcampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 84, 23));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("C:");
        jLabel19.setToolTipText("");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 30, 20));

        Ccampo1.setEnabled(false);
        jPanel2.add(Ccampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 85, 23));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("R:");
        jLabel20.setToolTipText("");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 30, 20));

        Rcampo1.setEnabled(false);
        jPanel2.add(Rcampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 89, 23));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("G:");
        jLabel21.setToolTipText("");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 30, 20));

        Gcampo1.setEnabled(false);
        jPanel2.add(Gcampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 90, 23));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel29.setText("Impedancia caracteristica:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 210, 30));

        ImpCoa.setEnabled(false);
        jPanel2.add(ImpCoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 180, 30));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel40.setText("Ω");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 50, 30));

        jLabel47.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel47.setText("V/m");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 40, 20));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel48.setText("Ω/m");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 40, 20));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel49.setText("F/m");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 50, 20));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel50.setText("H/m");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 40, 20));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Ingrese el radio A:");
        jLabel36.setToolTipText("");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 30));

        resuelve4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resuelve4.setText("Limpiar");
        resuelve4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelve4ActionPerformed(evt);
            }
        });
        jPanel2.add(resuelve4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/red.jpg"))); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 320));

        jTabbedPane1.addTab("Cable Coaxial", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Placas Paralelas");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 250, 40));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Ingrese el ancho (a):");
        jLabel23.setToolTipText("");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 130, 30));
        jPanel3.add(Ancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 221, 27));

        unidadesA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel3.add(unidadesA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, 27));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Ingrese el largo (b):");
        jLabel24.setToolTipText("");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 120, 30));
        jPanel3.add(Largo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 221, 27));

        unidadesB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel3.add(unidadesB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 27));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("L:");
        jLabel25.setToolTipText("");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 30, -1));

        Lcampo2.setEnabled(false);
        jPanel3.add(Lcampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 84, 23));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("C:");
        jLabel26.setToolTipText("");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 20, -1));

        Ccampo2.setEnabled(false);
        jPanel3.add(Ccampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 85, 23));

        Rcampo2.setEnabled(false);
        jPanel3.add(Rcampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 89, 23));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/24131485_460162074385417_9015235522028660494_n.jpg"))); // NOI18N
        jLabel27.setToolTipText("");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 300, 150));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("G:");
        jLabel28.setToolTipText("");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 30, 20));

        Gcampo2.setEnabled(false);
        jPanel3.add(Gcampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 90, 23));

        resuelve2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resuelve2.setText("Resolver");
        resuelve2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelve2ActionPerformed(evt);
            }
        });
        jPanel3.add(resuelve2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel51.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel51.setText("V/m");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 40, 20));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel52.setText("Ω/m");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 40, 20));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel53.setText("F/m");
        jPanel3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 20));

        jLabel54.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel54.setText("H/m");
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 40, 20));

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("R:");
        jLabel55.setToolTipText("");
        jPanel3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 30, -1));

        resuelve5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resuelve5.setText("Limpiar");
        resuelve5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelve5ActionPerformed(evt);
            }
        });
        jPanel3.add(resuelve5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel56.setText("F/m");
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 50, 20));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/purple.jpg"))); // NOI18N
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 320));

        jTabbedPane1.addTab("Placas Paralelas", jPanel3);

        jSplitPane1.setRightComponent(jTabbedPane1);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Placas");

        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverActionPerformed
       if(!herz.getText().equals("")){
        GMD();
        GMC();
        FH();
        //GU();
       // GD();
        constantePenetracion();
       }else{
            javax.swing.JOptionPane.showMessageDialog(this,"Por favor ingrese una frecuencia\n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
        
       /* if(radio>penetracion){
            Alta.setVisible(true);
            BifilarAlta();
        }else{
            Baja.setVisible(true);
            BifilarBaja();
        }*/
       
    }//GEN-LAST:event_ResolverActionPerformed

    
    private void resuelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuelveActionPerformed
        //validacion si los campos se encuentran vacios
    if(!radiofibra.getText().equals("") && !dist.getText().equals("") ){      
       GU();
       GD();
       //valida si es alta frecuencia o baja frecuencia
       if(radio>penetracion){
            Alta.setVisible(true);
            BifilarAlta();
        }else{
            Baja.setVisible(true);
            BifilarBaja();
       }
       ImpedanciaBifilar();
 }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }
    }//GEN-LAST:event_resuelveActionPerformed
//se obtiene las unidades metricas del radio A del combobox
    public void GRA(){
    unidadA = Double.parseDouble(radiofibraA.getText());
    if (unidadesA.getSelectedIndex()==0){
           radioA=unidadA*Math.pow(10,(-3));
       }
       if (unidadesA.getSelectedIndex()==1){
           radioA=unidadA*Math.pow(10,(-2));
       }
       if (unidadesA.getSelectedIndex()==2){
           radioA=unidadA;
       }
}
    //se obtiene las unidades metricas del radio B del combobox
public void GRB(){
    unidadB = Double.parseDouble(radiofibraB.getText());
    if (unidadesB.getSelectedIndex()==0){
           radioB=unidadB*Math.pow(10,(-3));
       }
       if (unidadesB.getSelectedIndex()==1){
           radioB=unidadB*Math.pow(10,(-2));
       }
       if (unidadesB.getSelectedIndex()==2){
           radioB=unidadB;
       }
}
//se obtiene las unidades metricas del radio C del combobox
public void GRC(){
    unidadC = Double.parseDouble(radiofibraC.getText());
    if (unidadesC.getSelectedIndex()==0){
           radioC=unidadC*Math.pow(10,(-3));
       }
       if (unidadesC.getSelectedIndex()==1){
           radioC=unidadC*Math.pow(10,(-2));
       }
       if (unidadesC.getSelectedIndex()==2){
           radioC=unidadC;
       }
}

//se resuelve mediante las formulas para la fibra de cable coaxial bajas
    public void CoaxialBaja(){
    L=(M/(2*Math.PI))*((Math.log(radioB/radioA)+(1/4)+(1/(4*(Math.pow(radioC,2)-Math.pow(radioB,2)))))*(Math.pow(radioB,2)-(3*Math.pow(radioC,2))+((4*Math.pow(radioC, 2))/(4*(Math.pow(radioC,2)-Math.pow(radioB,2)))*Math.log(radioC/radioB))));
    fmt.setRes(L);
    Lcampo1.setText(fmt.getRes());
    C=(2*Math.PI*E)/Math.log(radioB/radioA);
    fmt.setRes(C);
    Ccampo1.setText(fmt.getRes());
    R=(1/(permitividad*Math.PI))*((1/Math.pow(radioA,2)+(1/(Math.pow(radioC, 2)*Math.pow(radioB,2)))));
    fmt.setRes(R);
    Rcampo1.setText(fmt.getRes());
    G=(2*Math.PI*CD)/Math.log(radioB/radioA);
    fmt.setRes(G);
    Gcampo1.setText(fmt.getRes());
    }
    
    //se resuelve mediante las formulas para la fibra de cable coaxial altas
    public void CoaxialAlta(){
    L=(M/(2*Math.PI))*Math.log(radioB/radioA);
    fmt.setRes(L);
    Lcampo1.setText(fmt.getRes());
    C=(2*Math.PI*E)/Math.log(radioB/radioA);
    fmt.setRes(C);
    Ccampo1.setText(fmt.getRes());
    R=(1/((2*Math.PI)*conductor*penetracion))*((1/radioA)+(1/radioB));
    fmt.setRes(R);
    Rcampo1.setText(fmt.getRes());
    G=(2*Math.PI*CD)/Math.log(radioB/radioA);
    fmt.setRes(G);
    Gcampo1.setText(fmt.getRes());
    }
    private void resuelve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuelve1ActionPerformed
    //valida que que ningun campo se encuentre vacio
        if(!radiofibraA.getText().equals("") && !radiofibraB.getText().equals("") && !radiofibraC.getText().equals("")){
        GRC();
        GRB();
        GRA();
        //validar si es mayor que A B y C
      if(radioC>radioB && radioB>radioA){  
        if(radioC>penetracion){
            Alta1.setVisible(true);
             Baja1.setVisible(false);
            CoaxialAlta();
        }else{
            Alta1.setVisible(false);
            Baja1.setVisible(true);
            CoaxialBaja();
       }
       ImpedanciaCoaxial();
      }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Revise la informacion de sus campos \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }
      }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }
    }//GEN-LAST:event_resuelve1ActionPerformed

    //se obtiene las unidades del ancho de la linea bifilar  mediante una validacion if del combobox
    public void GA(){
    UA = Double.parseDouble(Ancho.getText());
    if (unidadesA1.getSelectedIndex()==0){
           A=UA*Math.pow(10,(-3));
       }
       if (unidadesB.getSelectedIndex()==1){
           A=UA*Math.pow(10,(-2));
       }
       if (unidadesB.getSelectedIndex()==2){
           A=UA;
       }
}
     //se obtiene las unidades del largo de la linea bifilar mediante una validacion if del combobox
public void GB(){
    UB = Double.parseDouble(Largo.getText());
    if (unidadesB1.getSelectedIndex()==0){
           B=UB*Math.pow(10,(-3));
       }
       if (unidadesB.getSelectedIndex()==1){
           B=UB*Math.pow(10,(-2));
       }
       if (unidadesB.getSelectedIndex()==2){
           B=UB;
       }
}
    private void resuelve2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuelve2ActionPerformed
       //valida que los campos no se encuentren vacios
        if(!Ancho.getText().equals("") && !Largo.getText().equals("")){
        GA();
        GB();
        PlacasParalelas();
      }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }
    }//GEN-LAST:event_resuelve2ActionPerformed

    private void Resolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resolver1ActionPerformed
        //limpia los demas campos
        herz.setText("");
        cons.setText("");
    }//GEN-LAST:event_Resolver1ActionPerformed

    private void resuelve3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuelve3ActionPerformed
      //al resolver se limpian los campos
        radiofibra.setText("");
       dist.setText("");
       Lcampo.setText("");
       Ccampo.setText("");
       Gcampo.setText("");
       Rcampo.setText("");
       ImpBif.setText("");
    }//GEN-LAST:event_resuelve3ActionPerformed

    private void resuelve4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuelve4ActionPerformed
       //al resolver se limpian los campos
        radiofibraA.setText("");
       radiofibraB.setText("");
       radiofibraC.setText("");
       Lcampo1.setText("");
       Ccampo1.setText("");
       Gcampo1.setText("");
       Rcampo1.setText("");
       ImpCoa.setText("");
    }//GEN-LAST:event_resuelve4ActionPerformed

    private void resuelve5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuelve5ActionPerformed
        //al resolver se limpian los campos
        Largo.setText("");
       Ancho.setText("");
       Lcampo2.setText("");
       Ccampo2.setText("");
       Gcampo2.setText("");
       Rcampo2.setText("");
    }//GEN-LAST:event_resuelve5ActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    //obtencion de la impedancia coaxial utilizando las libreria Math
    public void ImpedanciaCoaxial(){
        double Zo=(138/Math.sqrt(permitividad))*Math.log((2*radioA)/(2*radioB));
         fmt.setRes(Zo);
        ImpCoa.setText(fmt.getRes());
    }
    //obtencion de la impedancia bifilar utilizando las libreria Math
      public void ImpedanciaBifilar(){
        double Zob=(276)*Math.log(distancia/radio);
         fmt.setRes(Zob);
        ImpBif.setText(fmt.getRes());
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
            java.util.logging.Logger.getLogger(LineasTransmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineasTransmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineasTransmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineasTransmision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineasTransmision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alta;
    private javax.swing.JLabel Alta1;
    private javax.swing.JTextField Ancho;
    private javax.swing.JLabel Baja;
    private javax.swing.JLabel Baja1;
    private javax.swing.JTextField Ccampo;
    private javax.swing.JTextField Ccampo1;
    private javax.swing.JTextField Ccampo2;
    private javax.swing.JTextField Gcampo;
    private javax.swing.JTextField Gcampo1;
    private javax.swing.JTextField Gcampo2;
    private javax.swing.JTextField ImpBif;
    private javax.swing.JTextField ImpCoa;
    private javax.swing.JTextField Largo;
    private javax.swing.JTextField Lcampo;
    private javax.swing.JTextField Lcampo1;
    private javax.swing.JTextField Lcampo2;
    private javax.swing.JTextField Rcampo;
    private javax.swing.JTextField Rcampo1;
    private javax.swing.JTextField Rcampo2;
    private javax.swing.JButton Resolver;
    private javax.swing.JButton Resolver1;
    private javax.swing.JButton Volver;
    private javax.swing.JComboBox<String> conductividad;
    private javax.swing.JTextField cons;
    private javax.swing.JComboBox<String> dielectrico;
    private javax.swing.JTextField dist;
    private javax.swing.JComboBox<String> frecuencia;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField radiofibra;
    private javax.swing.JTextField radiofibraA;
    private javax.swing.JTextField radiofibraB;
    private javax.swing.JTextField radiofibraC;
    private javax.swing.JButton resuelve;
    private javax.swing.JButton resuelve1;
    private javax.swing.JButton resuelve2;
    private javax.swing.JButton resuelve3;
    private javax.swing.JButton resuelve4;
    private javax.swing.JButton resuelve5;
    private javax.swing.JComboBox<String> unidades;
    private javax.swing.JComboBox<String> unidades1;
    private javax.swing.JComboBox<String> unidadesA;
    private javax.swing.JComboBox<String> unidadesA1;
    private javax.swing.JComboBox<String> unidadesB;
    private javax.swing.JComboBox<String> unidadesB1;
    private javax.swing.JComboBox<String> unidadesC;
    // End of variables declaration//GEN-END:variables
}
