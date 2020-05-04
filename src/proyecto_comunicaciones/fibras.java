/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_comunicaciones;

/**
 *
 * @author quemagatos
 */
public class fibras extends javax.swing.JFrame {
    double volt,volt1, amperio, amperio1, pot, pot1;
    double getVoltaje, getVoltaje1, getAmperio, getAmperio1, getPotencia, getPotencia1;
    double dB;
    double C=3*Math.pow(10,8);
    double metros, getMetros;
    double fv, dist, time;
    double n1,n2;
    double oi, or, vmi, vmr;
    double AC, aceptacion, NA;
    double permitividad, permitividad2;
    double unidad, radioA, LC, delta;
    
    formatos fmt = new formatos();
    public fibras() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        V1.setVisible(false);
        V2.setVisible(false);
        P1.setVisible(false);
        P2.setVisible(false);
        I1.setVisible(false);
        I2.setVisible(false);
        voltaje.setVisible(false);
        watts.setVisible(false);
        amperaje.setVisible(false);
        voltaje1.setVisible(false);
        watts1.setVisible(false);
        amperaje1.setVisible(false);
        check();
    }
    public void check(){
        if(boton1.isSelected()){
         jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        V1.setVisible(true);
        V2.setVisible(true);
        P1.setVisible(false);
        P2.setVisible(false);
        I1.setVisible(false);
        I2.setVisible(false);
        voltaje.setVisible(true);
        watts.setVisible(false);
        amperaje.setVisible(false);
        voltaje1.setVisible(true);
        watts1.setVisible(false);
        amperaje1.setVisible(false);  
        P1.setText("");
        P2.setText("");
        I1.setText("");
        I2.setText("");
        }else if(boton2.isSelected()){
            jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        V1.setVisible(false);
        V2.setVisible(false);
        P1.setVisible(false);
        P2.setVisible(false);
        I1.setVisible(true);
        I2.setVisible(true);
        voltaje.setVisible(false);
        watts.setVisible(false);
        amperaje.setVisible(true);
        voltaje1.setVisible(false);
        watts1.setVisible(false);
        amperaje1.setVisible(true);
         P1.setText("");
        P2.setText("");
        V1.setText("");
        V2.setText("");    
         
        }else if(boton3.isSelected()){
           jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        V1.setVisible(false);
        V2.setVisible(false);
        P1.setVisible(true);
        P2.setVisible(true);
        I1.setVisible(false);
        I2.setVisible(false);
        voltaje.setVisible(false);
        watts.setVisible(true);
        amperaje.setVisible(false);
        voltaje1.setVisible(false);
        watts1.setVisible(true);
        amperaje1.setVisible(false); 
         V1.setText("");
        V2.setText("");
        I1.setText("");
        I2.setText("");
        }
    }
    
    public void perdidaVolt(){
     if(!V1.getText().equals("")&& !V2.getText().equals("")){
         getVolt();
         getVolt1();
         dB=20*Math.log10(volt1/volt);
         fmt.setRes(dB);
         DB.setText(fmt.getRes());
     } else{
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }  
    }
     public void perdidaCor(){
        if(!I1.getText().equals("")&& !I2.getText().equals("")){
         getCorriente();
         getCorriente1();
         dB=20*Math.log10(amperio1/amperio);
         fmt.setRes(dB);
         DB.setText(fmt.getRes());
     }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }
    }
      public void perdidaPot(){
        if(!P1.getText().equals("")&& !P2.getText().equals("")){
         getPot();
         getPot1();
             dB=10*Math.log10(pot1/pot);
             fmt.setRes(dB);
             DB.setText(fmt.getRes());
     }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }
    }

      public void getVolt(){
      getVoltaje=Double.parseDouble(V1.getText());
      if (voltaje.getSelectedIndex()==0){
          volt=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un voltaje","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
       if (voltaje.getSelectedIndex()==1){
          volt=getVoltaje*Math.pow(10,(-1));
       }
       if (voltaje.getSelectedIndex()==2){
          volt=getVoltaje*Math.pow(10,(-2));
       }
       if (voltaje.getSelectedIndex()==3){
          volt=getVoltaje*Math.pow(10,(-3));
       }
       if (voltaje.getSelectedIndex()==4){
          volt=getVoltaje*Math.pow(10,(-6));
       }
       if (voltaje.getSelectedIndex()==5){
          volt=getVoltaje*Math.pow(10,(-9));
       }
       if (voltaje.getSelectedIndex()==6){
          volt=getVoltaje*Math.pow(10,(-12));
       }
        if (voltaje.getSelectedIndex()==7){
          volt=getVoltaje;
       }
       if (voltaje.getSelectedIndex()==8){
          volt=getVoltaje*Math.pow(10,1);
       }
       if (voltaje.getSelectedIndex()==9){
             volt=getVoltaje*Math.pow(10,2);
       }
       if (voltaje.getSelectedIndex()==10){
             volt=getVoltaje*Math.pow(10,3);
       }
       if (voltaje.getSelectedIndex()==11){
             volt=getVoltaje*Math.pow(10,6);
       }
       if (voltaje.getSelectedIndex()==12){
            volt=getVoltaje*Math.pow(10,9);
       }
       if (voltaje.getSelectedIndex()==13){
            volt=getVoltaje*Math.pow(10,12);
       }
   }    
      public void getVolt1(){
      getVoltaje1=Double.parseDouble(V2.getText());
         if (voltaje.getSelectedIndex()==0){
          volt1=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un voltaje","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
       
       if (voltaje1.getSelectedIndex()==1){
          volt1=getVoltaje1*Math.pow(10,(-1));
       }
       if (voltaje1.getSelectedIndex()==2){
          volt1=getVoltaje1*Math.pow(10,(-2));
       }
       if (voltaje1.getSelectedIndex()==3){
          volt1=getVoltaje1*Math.pow(10,(-3));
       }
       if (voltaje1.getSelectedIndex()==4){
          volt1=getVoltaje1*Math.pow(10,(-6));
       }
       if (voltaje1.getSelectedIndex()==5){
          volt1=getVoltaje1*Math.pow(10,(-9));
       }
       if (voltaje1.getSelectedIndex()==6){
          volt1=getVoltaje1*Math.pow(10,(-12));
       }
        if (voltaje1.getSelectedIndex()==7){
          volt1=getVoltaje1;
       }
       if (voltaje1.getSelectedIndex()==8){
          volt1=getVoltaje1*Math.pow(10,1);
       }
       if (voltaje1.getSelectedIndex()==9){
             volt1=getVoltaje1*Math.pow(10,2);
       }
       if (voltaje1.getSelectedIndex()==10){
             volt1=getVoltaje1*Math.pow(10,3);
       }
       if (voltaje1.getSelectedIndex()==11){
             volt1=getVoltaje1*Math.pow(10,6);
       }
       if (voltaje1.getSelectedIndex()==12){
            volt1=getVoltaje1*Math.pow(10,9);
       }
       if (voltaje1.getSelectedIndex()==13){
            volt1=getVoltaje1*Math.pow(10,12);
       }
   }  
      public void getCorriente(){
         getAmperio=Double.parseDouble(I1.getText());
        if (amperaje.getSelectedIndex()==0){
          amperio=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un amperaje","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
       if (amperaje.getSelectedIndex()==1){
          amperio=getAmperio*Math.pow(10,(-1));
       }
       if (amperaje.getSelectedIndex()==2){
          amperio=getAmperio*Math.pow(10,(-2));
       }
       if (amperaje.getSelectedIndex()==3){
          amperio=getAmperio*Math.pow(10,(-3));
       }
       if (amperaje.getSelectedIndex()==4){
          amperio=getAmperio*Math.pow(10,(-6));
       }
       if (amperaje.getSelectedIndex()==5){
          amperio=getAmperio*Math.pow(10,(-9));
       }
       if (amperaje.getSelectedIndex()==6){
          amperio=getAmperio*Math.pow(10,(-12));
       }
        if (amperaje.getSelectedIndex()==7){
          amperio=getAmperio;
       }
       if (amperaje.getSelectedIndex()==8){
          amperio=getAmperio*Math.pow(10,1);
       }
       if (amperaje.getSelectedIndex()==9){
             amperio=getAmperio*Math.pow(10,2);
       }
       if (amperaje.getSelectedIndex()==10){
             amperio=getAmperio*Math.pow(10,3);
       }
       if (amperaje.getSelectedIndex()==11){
             amperio=getAmperio*Math.pow(10,6);
       }
       if (amperaje.getSelectedIndex()==12){
            amperio=getAmperio*Math.pow(10,9);
       }
       if (amperaje.getSelectedIndex()==13){
            amperio=getAmperio*Math.pow(10,12);
       } 
      }
       public void getCorriente1(){
         getAmperio1=Double.parseDouble(I2.getText());
       if (amperaje1.getSelectedIndex()==0){
          amperio1=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un amperaje","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
       if (amperaje1.getSelectedIndex()==1){
          amperio1=getAmperio1*Math.pow(10,(-1));
       }
       if (amperaje1.getSelectedIndex()==2){
          amperio1=getAmperio1*Math.pow(10,(-2));
       }
       if (amperaje1.getSelectedIndex()==3){
          amperio1=getAmperio1*Math.pow(10,(-3));
       }
       if (amperaje1.getSelectedIndex()==4){
          amperio1=getAmperio1*Math.pow(10,(-6));
       }
       if (amperaje1.getSelectedIndex()==5){
          amperio1=getAmperio1*Math.pow(10,(-9));
       }
       if (amperaje1.getSelectedIndex()==6){
          amperio1=getAmperio1*Math.pow(10,(-12));
       }
        if (amperaje1.getSelectedIndex()==7){
          amperio1=getAmperio1;
       }
       if (amperaje1.getSelectedIndex()==8){
          amperio1=getAmperio1*Math.pow(10,1);
       }
       if (amperaje1.getSelectedIndex()==9){
             amperio1=getAmperio1*Math.pow(10,2);
       }
       if (amperaje1.getSelectedIndex()==10){
             amperio1=getAmperio1*Math.pow(10,3);
       }
       if (amperaje1.getSelectedIndex()==11){
             amperio1=getAmperio1*Math.pow(10,6);
       }
       if (amperaje1.getSelectedIndex()==12){
            amperio1=getAmperio1*Math.pow(10,9);
       }
       if (amperaje1.getSelectedIndex()==13){
            amperio1=getAmperio1*Math.pow(10,12);
       } 
      }
        public void getPot(){
         getPotencia=Double.parseDouble(P1.getText());
            if (watts.getSelectedIndex()==0){
          pot=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un wataje","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
       if (watts.getSelectedIndex()==1){
          pot=getPotencia*Math.pow(10,(-1));
       }
       if (watts.getSelectedIndex()==2){
          pot=getPotencia*Math.pow(10,(-2));
       }
       if (watts.getSelectedIndex()==3){
          pot=getPotencia*Math.pow(10,(-3));
       }
       if (watts.getSelectedIndex()==4){
          pot=getPotencia*Math.pow(10,(-6));
       }
       if (watts.getSelectedIndex()==5){
          pot=getPotencia*Math.pow(10,(-9));
       }
       if (watts.getSelectedIndex()==6){
          pot=getPotencia*Math.pow(10,(-12));
       }
        if (watts.getSelectedIndex()==7){
          pot=getPotencia;
       }
       if (watts.getSelectedIndex()==8){
          pot=getPotencia*Math.pow(10,1);
       }
       if (watts.getSelectedIndex()==9){
             pot=getPotencia*Math.pow(10,2);
       }
       if (watts.getSelectedIndex()==10){
             pot=getPotencia*Math.pow(10,3);
       }
       if (watts.getSelectedIndex()==11){
             pot=getPotencia*Math.pow(10,6);
       }
       if (watts.getSelectedIndex()==12){
            pot=getPotencia*Math.pow(10,9);
       }
       if (watts.getSelectedIndex()==13){
            pot=getPotencia*Math.pow(10,12);
       } 
      }
         public void getPot1(){
         getPotencia1=Double.parseDouble(P2.getText());
        if (watts1.getSelectedIndex()==0){
          pot1=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un wataje","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
       if (watts1.getSelectedIndex()==1){
          pot1=getPotencia1*Math.pow(10,(-1));
       }
       if (watts1.getSelectedIndex()==2){
          pot1=getPotencia1*Math.pow(10,(-2));
       }
       if (watts1.getSelectedIndex()==3){
          pot1=getPotencia1*Math.pow(10,(-3));
       }
       if (watts1.getSelectedIndex()==4){
          pot1=getPotencia1*Math.pow(10,(-6));
       }
       if (watts1.getSelectedIndex()==5){
          pot1=getPotencia1*Math.pow(10,(-9));
       }
       if (watts1.getSelectedIndex()==6){
          pot1=getPotencia1*Math.pow(10,(-12));
       }
        if (watts1.getSelectedIndex()==7){
          pot1=getPotencia1;
       }
       if (watts1.getSelectedIndex()==8){
          pot1=getPotencia1*Math.pow(10,1);
       }
       if (watts1.getSelectedIndex()==9){
             pot1=getPotencia1*Math.pow(10,2);
       }
       if (watts1.getSelectedIndex()==10){
             pot1=getPotencia1*Math.pow(10,3);
       }
       if (watts1.getSelectedIndex()==11){
             pot1=getPotencia1*Math.pow(10,6);
       }
       if (watts1.getSelectedIndex()==12){
            pot1=getPotencia1*Math.pow(10,9);
       }
       if (watts1.getSelectedIndex()==13){
            pot1=getPotencia1*Math.pow(10,12);
       } 
      }
         
         public void fallaDist(){
             if(!FV.getText().equals("")&& !tiempo.getText().equals("")){
                 fv=Double.parseDouble(FV.getText());
                 time=Double.parseDouble(tiempo.getText());
                 dist=(fv*C)*time/2;
                 fmt.setRes(dist);
                 distancia.setText(fmt.getRes());
             }else  if(!FV.getText().equals("")&& !distancia.getText().equals("")){
                 fv=Double.parseDouble(FV.getText());
                 dist=Double.parseDouble(distancia.getText());
                 time=(2*dist)/(fv*C);
                  fmt.setRes(time);
                  tiempo.setText(fmt.getRes());
             }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Revise los campos llenados \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);  
      }
         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        V1 = new javax.swing.JTextField();
        V2 = new javax.swing.JTextField();
        I1 = new javax.swing.JTextField();
        I2 = new javax.swing.JTextField();
        P1 = new javax.swing.JTextField();
        P2 = new javax.swing.JTextField();
        DB = new javax.swing.JTextField();
        voltaje = new javax.swing.JComboBox<>();
        voltaje1 = new javax.swing.JComboBox<>();
        watts1 = new javax.swing.JComboBox<>();
        watts = new javax.swing.JComboBox<>();
        amperaje = new javax.swing.JComboBox<>();
        amperaje1 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        boton1 = new javax.swing.JRadioButton();
        boton2 = new javax.swing.JRadioButton();
        boton3 = new javax.swing.JRadioButton();
        resultado = new javax.swing.JButton();
        ganancia = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        distancia = new javax.swing.JTextField();
        FV = new javax.swing.JTextField();
        tiempo = new javax.swing.JTextField();
        resuelve = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        resultado1 = new javax.swing.JButton();
        resultado2 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        Volver3 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        critico = new javax.swing.JLabel();
        Medio1 = new javax.swing.JComboBox<>();
        Medio2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        OR = new javax.swing.JTextField();
        OI = new javax.swing.JTextField();
        RSnell = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VMI = new javax.swing.JLabel();
        VMR = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        RIT = new javax.swing.JLabel();
        acepta = new javax.swing.JLabel();
        apertura = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        RSnell1 = new javax.swing.JButton();
        Volver4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        dielectrico = new javax.swing.JComboBox<>();
        dielectrico1 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        radio = new javax.swing.JTextField();
        unidades = new javax.swing.JComboBox<>();
        LongCorte = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        longitud = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Volver5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 590));
        setMinimumSize(new java.awt.Dimension(1024, 590));
        setPreferredSize(new java.awt.Dimension(1024, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1025, 538));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese el voltaje de entrada:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese el voltaje de salida:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese la corriente de entrada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ingrese la corriente de salida:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingrese la potencia de entrada:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingrese la potencia de salida:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));
        jPanel1.add(V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 110, 30));
        jPanel1.add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 110, 30));
        jPanel1.add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 110, 30));
        jPanel1.add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 110, 30));

        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });
        jPanel1.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 110, 30));
        jPanel1.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 110, 30));
        jPanel1.add(DB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 120, 30));

        voltaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un voltaje", "10^(−1) (dV) decivoltio", "10^(−2)(cV) centivoltio", "10^(−3) (mV) milivoltio", "10^(-6) (µV) microvoltio", "10^(−9) (nV) nanovoltio", "10^(−12) (pV) picovoltio", "(V) voltio", "10^(1 ) (daV) decavoltio", "10^(2)(hV) hectovoltio", "10^(3) (kV) kilovoltio", "10^(6) (MV) megavoltio", "10^(9) (GV) gigavoltio", "10^(12) (TV) teravoltio" }));
        jPanel1.add(voltaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 130, 30));

        voltaje1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un voltaje", "10^(−1) (dV) decivoltio", "10^(−2)(cV) centivoltio", "10^(−3) (mV) milivoltio", "10^(-6) (µV) microvoltio", "10^(−9) (nV) nanovoltio", "10^(−12) (pV) picovoltio", "(V) voltio", "10^(1 ) (daV) decavoltio", "10^(2)(hV) hectovoltio", "10^(3) (kV) kilovoltio", "10^(6) (MV) megavoltio", "10^(9) (GV) gigavoltio", "10^(12) (TV) teravoltio" }));
        jPanel1.add(voltaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 130, 30));

        watts1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una unidad", "10^(−1) (dW) decivatio", "10^(−2)(cW) centivatio", "10^(−3) (mW) milivatio", "10^(-6) (µW) microvatio", "10^(−9) (nW) nanovatio", "10^(−12) (pW) picovatio", "(W) vatio", "10^(1 ) (daW) decavatio", "10^(2)(hW) hectovatio", "10^(3) (kW) kilovatio", "10^(6) (MW) megavatio", "10^(9) (GW) gigavatio", "10^(12) (TW) teravatio" }));
        jPanel1.add(watts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 130, 30));

        watts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una unidad", "10^(−1) (dW) decivatio", "10^(−2)(cW) centivatio", "10^(−3) (mW) milivatio", "10^(-6) (µW) microvatio", "10^(−9) (nW) nanovatio", "10^(−12) (pW) picovatio", "(W) vatio", "10^(1 ) (daW) decavatio", "10^(2)(hW) hectovatio", "10^(3) (kW) kilovatio", "10^(6) (MW) megavatio", "10^(9) (GW) gigavatio", "10^(12) (TW) teravatio" }));
        jPanel1.add(watts, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 130, 30));

        amperaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un amperaje", "10^(−1) (dA) deciamperio", "10^(−2)(cA) centiamperio", "10^(−3) (mA) miliamperio", "10^(-6) (µA) microamperio", "10^(−9) (nA) nanoamperio", "10^(−12) (pA) picoamperio", "(A) amperio", "10^(1 ) (daA) decaamperio", "10^(2)(hA) hectoamperio", "10^(3) (kA) kiloamperio", "10^(6) (MA) megaamperio", "10^(9) (GA) gigaamperio", "10^(12) (TA) teraamperio" }));
        jPanel1.add(amperaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 130, 30));

        amperaje1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un amperaje", "10^(−1) (dA) deciamperio", "10^(−2)(cA) centiamperio", "10^(−3) (mA) miliamperio", "10^(-6) (µA) microamperio", "10^(−9) (nA) nanoamperio", "10^(−12) (pA) picoamperio", "(A) amperio", "10^(1 ) (daA) decaamperio", "10^(2)(hA) hectoamperio", "10^(3) (kA) kiloamperio", "10^(6) (MA) megaamperio", "10^(9) (GA) gigaamperio", "10^(12) (TA) teraamperio" }));
        jPanel1.add(amperaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 130, 30));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Seleccione el método por el cual desea obtener las perdidas o ganancias en decibeles");
        jLabel35.setToolTipText("");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        boton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(boton1);
        boton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        boton1.setText("Voltaje");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        buttonGroup1.add(boton2);
        boton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        boton2.setSelected(true);
        boton2.setText("Corriente");
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
        });
        jPanel1.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        buttonGroup1.add(boton3);
        boton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        boton3.setText("Potencia");
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
        });
        jPanel1.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        resultado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resultado.setText("Obtener perdida");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 170, 30));

        ganancia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 30));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Distancia de la falla");
        jLabel24.setToolTipText("");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tiempo transcurrido:");
        jLabel25.setToolTipText("");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Factor de velocidad:");
        jLabel26.setToolTipText("");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));
        jPanel1.add(distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 120, 30));
        jPanel1.add(FV, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 120, 30));
        jPanel1.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 120, 30));

        resuelve.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resuelve.setText("Resolver");
        resuelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelveActionPerformed(evt);
            }
        });
        jPanel1.add(resuelve, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 110, 30));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("s");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 30, 30));

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("m");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 30, 30));

        resultado1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resultado1.setText("Limpiar");
        resultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado1ActionPerformed(evt);
            }
        });
        jPanel1.add(resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 120, 30));

        resultado2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        resultado2.setText("Limpiar");
        resultado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado2ActionPerformed(evt);
            }
        });
        jPanel1.add(resultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 120, 30));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("dB");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 30, 30));

        Volver3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Volver3.setText("Regresar");
        Volver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver3ActionPerformed(evt);
            }
        });
        jPanel1.add(Volver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 100, 40));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/1.jpg"))); // NOI18N
        jLabel42.setPreferredSize(new java.awt.Dimension(960, 455));
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1020, 610));

        jTabbedPane1.addTab("Decibeles", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        critico.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        critico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(critico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 340, 40));

        Medio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un medio", "Aire", "Agua", "Alcohol etílico", "Hielo", "Sal común", "Diamante", "Vidrio", "Benceno", "Cuarzo", "Glicerina", "Aceite" }));
        Medio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medio1ActionPerformed(evt);
            }
        });
        jPanel2.add(Medio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 180, 30));

        Medio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un medio", "Aire", "Agua", "Alcohol etílico", "Hielo", "Sal común", "Diamante", "Vidrio", "Benceno", "Cuarzo", "Glicerina", "Aceite" }));
        Medio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medio2ActionPerformed(evt);
            }
        });
        jPanel2.add(Medio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 180, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Seleccione el medio incidente (n1):");
        jLabel13.setToolTipText("");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Seleccione el medio refractado(n2):");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("°");
        jLabel15.setToolTipText("");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 20, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/250px-Refracción.png"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 240, -1));

        OR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ORMouseClicked(evt);
            }
        });
        OR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORActionPerformed(evt);
            }
        });
        jPanel2.add(OR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, 30));

        OI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OIMouseClicked(evt);
            }
        });
        OI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OIActionPerformed(evt);
            }
        });
        jPanel2.add(OI, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 120, 30));

        RSnell.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RSnell.setText("Resuelve");
        RSnell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSnellActionPerformed(evt);
            }
        });
        jPanel2.add(RSnell, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Velocidad de propagacion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 180, 20));
        jPanel2.add(VMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 120, 30));
        jPanel2.add(VMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 120, 30));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Ley de Snell");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        RIT.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        RIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(RIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 340, 40));

        acepta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        acepta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(acepta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 340, 40));

        apertura.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        apertura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(apertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 340, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Angulo incidente (θ1):");
        jLabel17.setToolTipText("");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("°");
        jLabel18.setToolTipText("");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 20, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Angulo refractado (θ2):");
        jLabel19.setToolTipText("");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        RSnell1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RSnell1.setText("Limpiar");
        RSnell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSnell1ActionPerformed(evt);
            }
        });
        jPanel2.add(RSnell1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, 30));

        Volver4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Volver4.setText("Regresar");
        Volver4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver4ActionPerformed(evt);
            }
        });
        jPanel2.add(Volver4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 100, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/9.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 570));

        jTabbedPane1.addTab("Ley de Snell", jPanel2);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Longitud de onda de corte");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        dielectrico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un material dielectrico", "Aire", "Alcohol etílico", "Baquelita", "Cuarzo fundido", "Mica", "Plexiglas", "Papel", "Poliestireno", "Polietileno", "Porcelana", "Teflón", "Polipropileno", "Vidrio pirex" }));
        jPanel5.add(dielectrico, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 190, 30));

        dielectrico1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un material dielectrico", "Aire", "Alcohol etílico", "Baquelita", "Cuarzo fundido", "Mica", "Plexiglas", "Papel", "Poliestireno", "Polietileno", "Porcelana", "Teflón", "Polipropileno", "Vidrio pirex" }));
        jPanel5.add(dielectrico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 190, 30));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Longitud de onda de corte:");
        jLabel38.setToolTipText("");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Ingrese el material de refracción del núcleo:");
        jLabel39.setToolTipText("");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Ingrese el material de refracción del revestimiento:");
        jLabel40.setToolTipText("");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));
        jPanel5.add(radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 190, 30));

        unidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mm) milimetros", "(cm) centimetros", "(m) metros" }));
        jPanel5.add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, 30));

        LongCorte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LongCorte.setText("Obtener onda de corte");
        LongCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LongCorteActionPerformed(evt);
            }
        });
        jPanel5.add(LongCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, 40));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Ingrese el radio del núcleo:");
        jLabel41.setToolTipText("");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        longitud.setEnabled(false);
        longitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudActionPerformed(evt);
            }
        });
        jPanel5.add(longitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 130, 30));

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("m");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 30, 30));

        Volver5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Volver5.setText("Regresar");
        Volver5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver5ActionPerformed(evt);
            }
        });
        jPanel5.add(Volver5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 100, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_comunicaciones/imagenes/4.jpeg"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 460));

        jTabbedPane1.addTab("Longitud de onda de corte", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
       
    }//GEN-LAST:event_P1ActionPerformed

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
      check();
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
      check();
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
       check();
    }//GEN-LAST:event_boton3MouseClicked

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        if(boton1.isSelected()){
            perdidaVolt();
        }  if(boton2.isSelected()){
            perdidaCor();
        }
          if(boton3.isSelected()){
            perdidaPot();
        } if(dB>0){
            ganancia.setText("Ganancia");
        } 
        if(dB<0){
            ganancia.setText("Perdida");
        }
    }//GEN-LAST:event_resultadoActionPerformed

    private void resuelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuelveActionPerformed
       fallaDist();
    }//GEN-LAST:event_resuelveActionPerformed

    private void RSnellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSnellActionPerformed
        if(n1>=n2){
        Snell();
        AnguloCritico();
        }else{
           javax.swing.JOptionPane.showMessageDialog(this,"Revise los materiales de los medios \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           Medio1.setSelectedIndex(0);
           Medio2.setSelectedIndex(0);
        }
    }//GEN-LAST:event_RSnellActionPerformed

    private void Medio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medio1ActionPerformed
         VMI.setText("");
         OI.setText("");
          Vpropagacion(); 
    }//GEN-LAST:event_Medio1ActionPerformed

    private void Medio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medio2ActionPerformed
         VMR.setText("");
         OR.setText("");
          Vpropagacion();
    }//GEN-LAST:event_Medio2ActionPerformed

    private void OIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OIActionPerformed
        OR.setEditable(false);
    }//GEN-LAST:event_OIActionPerformed

    private void ORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORActionPerformed
        OI.setEditable(false);
    }//GEN-LAST:event_ORActionPerformed

    private void OIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OIMouseClicked
        OR.setEditable(false);
    }//GEN-LAST:event_OIMouseClicked

    private void ORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ORMouseClicked
        OI.setEditable(false);
    }//GEN-LAST:event_ORMouseClicked

    private void RSnell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSnell1ActionPerformed
        OR.setText("");
        OI.setText("");
        OR.setEditable(true);
        OI.setEditable(true);
    }//GEN-LAST:event_RSnell1ActionPerformed

    private void resultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado1ActionPerformed
                V1.setText("");
                V2.setText("");
                DB.setText("");
    }//GEN-LAST:event_resultado1ActionPerformed

    private void resultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado2ActionPerformed
                FV.setText("");
                tiempo.setText("");
                distancia.setText("");
    }//GEN-LAST:event_resultado2ActionPerformed

    private void LongCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LongCorteActionPerformed
        if(!radio.getText().equals("") && dielectrico.getSelectedIndex()!=0 && dielectrico1.getSelectedIndex()!=0){
            LongCort();
        }else if(radio.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this,"Por favor ingrese el radio \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else if( dielectrico.getSelectedIndex()==0 || dielectrico1.getSelectedIndex()==0){
            javax.swing.JOptionPane.showMessageDialog(this,"Por seleccione el material \n","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_LongCorteActionPerformed

    private void longitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longitudActionPerformed

    private void Volver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver3ActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_Volver3ActionPerformed

    private void Volver4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver4ActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_Volver4ActionPerformed

    private void Volver5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver5ActionPerformed
      dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_Volver5ActionPerformed

  public void getN1(){
     if (Medio1.getSelectedIndex()==0){
           VMI.setVisible(false);
       }
      if (Medio1.getSelectedIndex()==1){
          VMI.setVisible(true);
         n1=1; 
       }
       if (Medio1.getSelectedIndex()==2){
           VMI.setVisible(true);
          n1=1.33; 
       }
       if (Medio1.getSelectedIndex()==3){
           VMI.setVisible(true);
          n1=1.36; 
       }
       if (Medio1.getSelectedIndex()==4){
           VMI.setVisible(true);
          n1=1.31; 
       }
       if (Medio1.getSelectedIndex()==5){
           VMI.setVisible(true);
         n1=1.54; 
       }
       if (Medio1.getSelectedIndex()==6){
           VMI.setVisible(true);
          n1=2.43; 
       }
       if (Medio1.getSelectedIndex()==7){
           VMI.setVisible(true);
         n1=1.52; 
       }
        if (Medio1.getSelectedIndex()==8){
            VMI.setVisible(true);
          n1=1.50; 
       }
       if (Medio1.getSelectedIndex()==9){
           VMI.setVisible(true);
          n1=1.51; 
       }
       if (Medio1.getSelectedIndex()==10){
           VMI.setVisible(true);
           n1=1.47;  
       }
       if (Medio1.getSelectedIndex()==11){
           VMI.setVisible(true);
            n1=1.50; 
       }
       
  }
  
  public void getN2(){
       if (Medio2.getSelectedIndex()==0){
           VMR.setVisible(false);
       }
       if (Medio2.getSelectedIndex()==1){
           VMR.setVisible(true);
         n2=1; 
       }
       if (Medio2.getSelectedIndex()==2){
           VMR.setVisible(true);
          n2=1.33; 
       }
       if (Medio2.getSelectedIndex()==3){
           VMR.setVisible(true);
          n2=1.36; 
       }
       if (Medio2.getSelectedIndex()==4){
           VMR.setVisible(true);
          n2=1.31; 
       }
       if (Medio2.getSelectedIndex()==5){
           VMR.setVisible(true);
         n2=1.54; 
       }
       if (Medio2.getSelectedIndex()==6){
           VMR.setVisible(true);
          n2=2.43; 
       }
       if (Medio2.getSelectedIndex()==7){
           VMR.setVisible(true);
         n2=1.52; 
       }
        if (Medio2.getSelectedIndex()==8){
            VMR.setVisible(true);
          n2=1.50; 
       }
       if (Medio2.getSelectedIndex()==9){
           VMR.setVisible(true);
          n2=1.51; 
       }
       if (Medio2.getSelectedIndex()==10){
           VMR.setVisible(true);
           n2=1.47;  
       }
       if (Medio2.getSelectedIndex()==11){
           VMR.setVisible(true);
            n2=1.50; 
       }
  }
  
  public void Snell(){
      if(!OI.getText().equals("") && OR.getText().equals("")){
          oi= Math.toRadians(Double.parseDouble(OI.getText()));
          getN1();
          getN2();
          or=Math.toDegrees(Math.asin((n1*Math.sin(oi)/n2)));
          fmt.setRes(or);
          OR.setText(fmt.getRes1());
          
      }
      else if(!OR.getText().equals("") && OI.getText().equals("")){
          or= Math.toRadians(Double.parseDouble(OR.getText()));
          getN1();
          getN2();
          oi=Math.toDegrees(Math.asin((n2*Math.sin(or)/n1)));
          fmt.setRes(oi);
            OI.setText(fmt.getRes1());
          
      }
      else if (OI.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
      
      }
      else if (OR.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(this,"Faltan campos por llenar","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
      }
  }
  
  public void Vpropagacion(){
      getN1();
      getN2();
      vmi=C/n1;
      fmt.setRes(vmi);
      VMI.setText(fmt.getRes()+" m/s");
      vmr=C/n2;
      fmt.setRes(vmr);
      VMR.setText(fmt.getRes()+" m/s");
  }
  
  public void AnguloCritico(){
      
      AC=Math.toDegrees(Math.asin(n2/n1));
      if(oi>AC){
          RIT.setText("Se produjo el fenómeno RIT");
      }else {
          RIT.setText("");
      }
      fmt.setRes(AC);
      critico.setText("El angulo crítico es: "+fmt.getRes1());
      aceptacion=Math.toDegrees(Math.toRadians(90)-Math.toRadians(AC));
      fmt.setRes(aceptacion);
      acepta.setText("El angulo de aceptación es: "+fmt.getRes1());
      
      NA=Math.sqrt(Math.pow(n1,2)-Math.pow(n1,2));
       fmt.setRes(aceptacion);
      apertura.setText("La apertura numérica es: "+fmt.getRes1());
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
            java.util.logging.Logger.getLogger(fibras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fibras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fibras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fibras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fibras().setVisible(true);
            }
        });
    }
    
     public void GMD(){
      if (dielectrico.getSelectedIndex()==0){
          permitividad=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un material","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
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
 
  public void GMD2(){
        if (dielectrico1.getSelectedIndex()==0){
          permitividad2=0;
           javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un material","CUIDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
        if (dielectrico1.getSelectedIndex()==1){
           permitividad2=1.00054;
           
       }
       if (dielectrico1.getSelectedIndex()==2){
           permitividad2=2.5;
           
       }
       if (dielectrico1.getSelectedIndex()==3){
           permitividad2=4.8;
           
       }
       if (dielectrico1.getSelectedIndex()==4){
           permitividad2=3.8;
           
       }
       if (dielectrico1.getSelectedIndex()==5){
          permitividad2=5.4;
          
       }
       if (dielectrico1.getSelectedIndex()==6){
         permitividad2=3.45;
        
       }
        if (dielectrico1.getSelectedIndex()==7){
           permitividad2=3.5;
          
       }
       if (dielectrico1.getSelectedIndex()==8){
           permitividad2=2.6;
         
       }
       if (dielectrico1.getSelectedIndex()==9){
              permitividad2=2.3;
             
       }
       if (dielectrico1.getSelectedIndex()==10){
              permitividad2=6.5;
            
       }
       if (dielectrico1.getSelectedIndex()==11){
              permitividad2=2.1;
             
       }
       if (dielectrico1.getSelectedIndex()==12){
             permitividad2=2.25;
           
       }
       if (dielectrico1.getSelectedIndex()==13){
             permitividad2=4.5;
           
       }
    }
  
  public void Unidades(){
    unidad = Double.parseDouble(radio.getText());
    if (unidades.getSelectedIndex()==0){
           radioA=unidad*Math.pow(10,(-3));
       }
       if (unidades.getSelectedIndex()==1){
           radioA=unidad*Math.pow(10,(-2));
       }
       if (unidades.getSelectedIndex()==2){
           radioA=unidad;
       }
}
  
  public void LongCort(){
      GMD();
      GMD2();
      Unidades();
      delta=(permitividad-permitividad2)/permitividad;
      LC=(2*Math.PI*radioA*Math.sqrt(2*delta))/2.405;
      fmt.setRes(LC);
      longitud.setText(fmt.getRes());
      
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DB;
    private javax.swing.JTextField FV;
    private javax.swing.JTextField I1;
    private javax.swing.JTextField I2;
    private javax.swing.JButton LongCorte;
    private javax.swing.JComboBox<String> Medio1;
    private javax.swing.JComboBox<String> Medio2;
    private javax.swing.JTextField OI;
    private javax.swing.JTextField OR;
    private javax.swing.JTextField P1;
    private javax.swing.JTextField P2;
    private javax.swing.JLabel RIT;
    private javax.swing.JButton RSnell;
    private javax.swing.JButton RSnell1;
    private javax.swing.JTextField V1;
    private javax.swing.JTextField V2;
    private javax.swing.JLabel VMI;
    private javax.swing.JLabel VMR;
    private javax.swing.JButton Volver3;
    private javax.swing.JButton Volver4;
    private javax.swing.JButton Volver5;
    private javax.swing.JLabel acepta;
    private javax.swing.JComboBox<String> amperaje;
    private javax.swing.JComboBox<String> amperaje1;
    private javax.swing.JLabel apertura;
    private javax.swing.JRadioButton boton1;
    private javax.swing.JRadioButton boton2;
    private javax.swing.JRadioButton boton3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel critico;
    private javax.swing.JComboBox<String> dielectrico;
    private javax.swing.JComboBox<String> dielectrico1;
    private javax.swing.JTextField distancia;
    private javax.swing.JLabel ganancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField longitud;
    private javax.swing.JTextField radio;
    private javax.swing.JButton resuelve;
    private javax.swing.JButton resultado;
    private javax.swing.JButton resultado1;
    private javax.swing.JButton resultado2;
    private javax.swing.JTextField tiempo;
    private javax.swing.JComboBox<String> unidades;
    private javax.swing.JComboBox<String> voltaje;
    private javax.swing.JComboBox<String> voltaje1;
    private javax.swing.JComboBox<String> watts;
    private javax.swing.JComboBox<String> watts1;
    // End of variables declaration//GEN-END:variables
}
