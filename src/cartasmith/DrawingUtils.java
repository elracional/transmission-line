/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartasmith;

import java.awt.Color;
import java.awt.Graphics;

//clase que dibuja la carta de smith
public class DrawingUtils {
	

	public static void drawArcThroughCenter(Graphics g, int x, int y, int r) {
            //definimos la variables para x, y, alto y ancho
		int tmp_x;
		int tmp_y;
		int tmp_width;
		int tmp_height;
            
                //dibuamos la carta de smith estableciendo distintos circulos
		if (y < 200) {
			tmp_x = 400 - r;
			tmp_y = 200 - 2 * r;
			tmp_width = 2 * r;
			tmp_height = 2 * r;
                        //establecemos los parametros para que dibuje un arco menor a 180 grados
			double angleTmp = (180 / Math.PI) * (Math.acos(((double) r * r - 40000) / (r * r + 40000)));
			int angle = (int) Math.rint(angleTmp);
                        //dibujamos los arcos
			g.drawArc(tmp_x, tmp_y, tmp_width, tmp_height, 270 - angle, angle);
                        //dibujamos el arco en la mitad inferior
		} else {
			tmp_x = 400 - r;
			tmp_y = 200;
			tmp_width = 2 * r;
			tmp_height = 2 * r;
                         //establecemos los parametros para que dibuje un arco menor a 180 grados
			double angleTmp = (180 / Math.PI) * (Math.acos(((double) r * r - 40000) / (r * r + 40000)));
			int angle = (int) Math.rint(angleTmp);
                         //dibujamos el arco
			g.drawArc(tmp_x, tmp_y, tmp_width, tmp_height, 90, angle);
		}
	}

	//clase que dibuja el centro
	public static void drawCircleThroughCenter(Graphics g, int x, int y, int r) {
		int tmp_x = x - r;
		int tmp_y = y - r;
		int tmp_width = 2 * r;
		int tmp_height = 2 * r;
                //dibuajos el circulo central
		g.drawOval(tmp_x, tmp_y, tmp_width, tmp_height);
	}
	
        //dibujamos el circulo corespondiente a la resistencia
	public static void drawResistanceCircle(Graphics g, int x, int y){
		g.setColor(Color.RED);
		int r = (int)((double)x * x + y * y - 800 * x - 400 * y + 200000) / (800 - 2 * x);
		int tmp_x = 400 - r;
		int tmp_y = 200;
		drawCircleThroughCenter(g, tmp_x, tmp_y, r);
	}
	
 //dibujamos el circulo corespondiente a la impedancia
	public static void drawImpedanceArc(Graphics g, int x, int y){
		g.setColor(Color.YELLOW);
		int r = 0;
		
		if(y < 200){
			r = (int)((double)(200000 - 800 * x - 400 * y + x * x + y * y) / (400 - 2 * y));
			y = 200 - r;
		}
		if(y > 200){
			r = (int)((double)(200000 - 800 * x - 400 * y + x * x + y * y) / (2 * y - 400));
			y = 200 + r;
		}
		drawArcThroughCenter(g, x, y, r);
	}
	
 //dibujamos el circulo corespondiente a la reflexion
	public static void drawReflectionCoefficientCircle(Graphics g, int x, int y){
		g.setColor(Color.GREEN);
		int r = (int)Math.sqrt((double)(x - 200) * (x - 200) + (y - 200) * (y - 200));
		drawCircleThroughCenter(g, 200, 200, r);
		g.drawLine(x, y, 200, 200);
	}
}
