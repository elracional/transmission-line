/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartasmith;

//se importan las librerias graficas para el entorno
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SmithChart extends JFrame implements ActionListener{
        //se define las variables para dibujar el entorno e invocar los paquetes
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel chartPane;
	private JTextField swrText;
	private JTextField clcText;
	private JTextField reIi;
	private JTextField imIi;
         JButton  resolver = new JButton();


	public static void main(String[] args) {
             
		EventQueue.invokeLater(new Runnable() {
			public void run() {
                            //metodo try para que arroje una excepcion en caso de error
				try {
                                    //invocamos el objeto que dibuja el bloque de la carta de smith
					SmithChart frame = new SmithChart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SmithChart() {
            //titulo de la ventana
		setTitle("Carta de smith");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //definimos bordes
		setBounds(300, 100, 780, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
                //definimos el panel principal y sus bordes
		chartPane = new ChartPanel();
                //se define el color de fondo
		chartPane.setBackground(Color.WHITE);
		chartPane.setBounds(25, 25, 400, 400);
		chartPane.setSize(new Dimension(400, 400));
                //agregamos un evento del mouse para que las lineas sigan al cursor
		MouseAction action = new MouseAction();
		chartPane.addMouseListener(action);
		contentPane.add(chartPane);

		JPanel dataPanel = new JPanel();
		dataPanel.setBounds(435, 25, 320, 476);
		contentPane.add(dataPanel);
		dataPanel.setLayout(null);
		
		//definimos el panel donde se encontrara el coeficiente de reflexion
		JPanel reflectionCoefficient = new JPanel();
		reflectionCoefficient.setBorder(new LineBorder(new Color(0, 0, 255)));
		reflectionCoefficient.setBounds(20, 10, 278, 122);
		dataPanel.add(reflectionCoefficient);
		reflectionCoefficient.setLayout(null);
		
                //aqui se almacenara los resultados otrogados por el coeficiente de reflexion
		JLabel rcTitleLabel = new JLabel("Coeficiente de reflexión");
		rcTitleLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		rcTitleLabel.setBounds(5, 5, 200, 22);
		reflectionCoefficient.add(rcTitleLabel);
		
		JLabel swrLabel = new JLabel("ROE");
		swrLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		swrLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		swrLabel.setBounds(20, 35, 90, 18);
		reflectionCoefficient.add(swrLabel);
		
		JLabel crcLabel = new JLabel("Coef. de reflexión");
		crcLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		crcLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		crcLabel.setBounds(5, 60, 105, 18);
		reflectionCoefficient.add(crcLabel);
		
		JLabel elLabel = new JLabel("Coeficiente de reflexion");
		elLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		elLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		elLabel.setBounds(20,120, 85, 25);;
		reflectionCoefficient.add(elLabel);
		
                //definimos las variables para los textfields
		swrText = new JTextField();
                //los campos textfield no son editables, solo reciben datos
		swrText.setEditable(false);
		swrText.setHorizontalAlignment(SwingConstants.TRAILING);
		swrText.setBounds(115, 35, 66, 25);
		reflectionCoefficient.add(swrText);
		swrText.setColumns(10);
		
		clcText = new JTextField();
		clcText.setHorizontalAlignment(SwingConstants.RIGHT);
		clcText.setEditable(false);
		clcText.setColumns(10);
		clcText.setBounds(115, 60, 66, 25);
		reflectionCoefficient.add(clcText);
		
                //se define el panel donde almacenaremos la impedancia
		JPanel inputImpedance = new JPanel();
		inputImpedance.setBorder(new LineBorder(Color.BLUE));
		inputImpedance.setBounds(20, 150, 278, 122);
		dataPanel.add(inputImpedance);
		inputImpedance.setLayout(null);
		//definimos titulos, fuente y tamaño de letra
		JLabel iiTitleLabel = new JLabel("Impedancia");
		iiTitleLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		iiTitleLabel.setBounds(5, 5, 150, 22);
		inputImpedance.add(iiTitleLabel);
		
		JLabel iiLabel = new JLabel("Impedancia Z:");
		iiLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		iiLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		iiLabel.setBounds(0, 50, 110, 18);
		inputImpedance.add(iiLabel);
		
                //agregamos los campos textfield donde se almacenaran los resultados
		reIi = new JTextField();
		reIi.setHorizontalAlignment(SwingConstants.TRAILING);
		reIi.setEditable(false);
		reIi.setColumns(10);
		reIi.setBounds(115, 50, 66, 25);
		inputImpedance.add(reIi);
		
		JLabel lblNewLabel = new JLabel("+j");
		lblNewLabel.setBounds(185, 50, 15, 18);
		inputImpedance.add(lblNewLabel);
		//agregamos los campos textfield donde se almacenaran los resultados
		imIi = new JTextField();
		imIi.setHorizontalAlignment(SwingConstants.TRAILING);
		imIi.setEditable(false);
		imIi.setColumns(10);
		imIi.setBounds(200, 50, 66, 25);
		inputImpedance.add(imIi);
		
                //resistencia, impedancia, reflexion
                JPanel reference = new JPanel();
		reference.setBorder(new LineBorder(new Color(0, 0, 255)));
		reference.setBounds(20, 280, 278, 122);
		dataPanel.add(reference);
		reference.setLayout(null);
                
              
               /* 
                JLabel resistencia = new JLabel("Resistencia");
		resistencia.setHorizontalAlignment(SwingConstants.RIGHT);
		resistencia.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		resistencia.setBounds(20, 5, 110, 18);
		reference.add(resistencia);
                
                 JLabel impedancia= new JLabel("Impedancia");
		impedancia.setHorizontalAlignment(SwingConstants.RIGHT);
		impedancia.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		impedancia.setBounds(30, 50, 110, 18);
		reference.add(impedancia);
                
                 JLabel reflexion = new JLabel("Coeficiente de Reflexión");
		reflexion.setHorizontalAlignment(SwingConstants.LEFT);
		reflexion.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		reflexion.setBounds(60, 95, 180, 18);
		reference.add(reflexion);*/
                
               resolver = new JButton("Regresar");
               resolver.setBounds(100, 45, 90, 30);
               resolver.addActionListener(this);
             reference.add(resolver);
    
                 
                
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(100, 435, 260, 50);
		contentPane.add(titlePanel);
		JLabel appTitle = new JLabel("De clic en una coordenada");
		titlePanel.add(appTitle);
		appTitle.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		appTitle.setHorizontalAlignment(SwingConstants.CENTER);
		/********************************************************************/
	}
	//eventos del mouse
	class MouseAction implements MouseListener{
		//agregamos un evento que se lanza cuando se clickea un lugar en el pael
		public void mouseClicked(MouseEvent e) {
			System.out.println("Coordenadas");
			//almacenamos la cordenada en la variable mousepoint que devuelve un valor dependiendo de la coordenada
			Point mousePoint = e.getPoint();
			int x = mousePoint.x;
			int y = mousePoint.y;
			System.out.println("x " + x + "- y " + y);
			//temporizador para que el panel vuelva a reiniciarse despues del clic (definido a 4s)
			long tmp = (x - 200) * (x - 200) + (y - 200) * (y - 200);
			if (tmp < 40000) {
				ChartPanel.flag = !ChartPanel.flag;
				if(ChartPanel.flag == false){
					swrText.setText(ComputingUtils.subString(ComputingUtils.calRho(x, y) + ""));
					clcText.setText(ComputingUtils.subString(ComputingUtils.calGamma(x, y) + ""));
					reIi.setText(ComputingUtils.subString(ComputingUtils.calZReal(x, y) + ""));
					imIi.setText(ComputingUtils.subString(ComputingUtils.calZImag(x, y) + ""));
				}
			}
		}

		public void mouseEntered(MouseEvent e) {
			
			
		}

		public void mouseExited(MouseEvent e) {
			
			
		}

		public void mousePressed(MouseEvent e) {
			
			
		}

		public void mouseReleased(MouseEvent e) {
			
			
		}
	}
          public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resolver) {
           
         dispose();
        new proyecto_comunicaciones.Menu().setVisible(true);
        }
          }
}
