/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartasmith;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

//clase que dibuja la carta de smith
public class ChartPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public static boolean flag = true;

	public void paint(Graphics g) {
		super.paint(g);
		//aqui invocamos los metodos para dibujar todos los circulos en la carta de smith
		g.setColor(Color.BLACK);
		DrawingUtils.drawCircleThroughCenter(g, 200, 200, 200);
		g.drawLine(0, 200, 400, 200);
                //dibujamos distintos circulos incrementando su tamaño
		for (int i = 1; i < 8; i++) {
			int x = 400 - 25 * i;
			int y = 200;
			int r = 25 * i;
                        
			DrawingUtils.drawCircleThroughCenter(g, x, y, r);
		}
                //dibujamos los arcos incrementando su tamaño
		for (int i = 1; i < 5; i++) {
			int x = 400;
			int y = 200 - 50 * i;
			int r = 50 * i;
			DrawingUtils.drawArcThroughCenter(g, x, y, r);
		}
                
		DrawingUtils.drawArcThroughCenter(g, 400, 100, 300);
		DrawingUtils.drawArcThroughCenter(g, 400, -100, 500);
		DrawingUtils.drawArcThroughCenter(g, 400, -800, 1200);

		for (int i = 0; i < 5; i++) {
			int x = 400;
			int y = 200 + 50 * i;
			int r = 50 * i;
			DrawingUtils.drawArcThroughCenter(g, x, y, r);
		}

		DrawingUtils.drawArcThroughCenter(g, 400, 500, 300);
		DrawingUtils.drawArcThroughCenter(g, 400, 700, 500);
		DrawingUtils.drawArcThroughCenter(g, 400, 1400, 1200);

		MouseAction action = new MouseAction();
		this.addMouseMotionListener(action);
	}
	
	int tmp_x = 0, tmp_y = 0;
//este metodo es utilizado para dibujar constantemento los circulos correspondientes a la impedancia, resistencia, coeficiente de reflexion etc.
	class MouseAction implements MouseMotionListener {
//obtenemos el evento del mouse en caso de que se mueva el cursor por el panel
		public void mouseMoved(MouseEvent e) {
			if (flag) {
				Point mousePoint = e.getPoint();
                                //almacenamos las coordenadas del cursor en las variables
				int x = mousePoint.x;
				int y = mousePoint.y;

				if (tmp_x == x && tmp_y == y) {
					return;
				}

				//System.out.println("x --> " + x + ", y --> " + y);
				Graphics g = ChartPanel.this.getGraphics();
				update(g);
                                //variables temporales para X y Y
				tmp_x = x;
				tmp_y = y;
                                
				long tmp = (x - 200) * (x - 200) + (y - 200) * (y - 200);
                                //condicional dibuje constantemente los circulos al momento de mover el mouse
				if (tmp < 40000) {
					DrawingUtils.drawResistanceCircle(g, x, y);
					DrawingUtils.drawImpedanceArc(g, x, y);
					DrawingUtils.drawReflectionCoefficientCircle(g, x, y);
				} else {
					return;
				}
			}
		}

		public void mouseDragged(MouseEvent e) {
			
			
		}
	}
}
