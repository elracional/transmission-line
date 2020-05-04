/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartasmith;


//en esta clase realizamos los calculos
public class ComputingUtils {
	
	//obtenemos X
	public static double translateX(int x){
		return ((double)(x - 200) / 200);
	}
	
        //obtenemos Y
	public static double translateY(int y){
		return ((double)(y - 200) / 200);
	}
	
        //ingresamos una cadena y regresamos los caracteres de la posicion 0 a la 9
        //utilizamos para dar formato a los valores retornados
	public static String subString(String string){
		if(string.length() > 10){
			string = string.substring(0, 5);
		}
		return string;
	}
	
        //calculamos el coeficiente de reflexion obteniendo las coordenadas
	public static double calGamma(int x, int y){
		double tmpX = translateX(x);
		double tmpY = translateY(y);
		return tmpX * tmpX + tmpY * tmpY;
	}
	
	  //calculamos el ROE obteniendo las coordenadas
	public static double calRho(int x, int y){
		double tmpGamma = calGamma(x, y);
		return (1 + tmpGamma) / (1 - tmpGamma);
	}
	
	  //calculamos la impedancia obteniendo las coordenadas
	public static double calZReal(int x, int y){
		double r = (((double)x * x + y * y - 800 * x - 400 * y + 200000) / (800 - 2 * x)) / 200;
		return (1 - r) / r;
	}
	
          //calculamos la impendancia imaginaria obteniendo las coordenadas
	public static double calZImag(int x, int y){
		double r = 0;
		
		if(y < 200){
			r = ((double)(200000 - 800 * x - 400 * y + x * x + y * y) / (400 - 2 * y)) / 200;
		}
		if(y > 200){
			r = ((double)(200000 - 800 * x - 400 * y + x * x + y * y) / (2 * y - 400)) / 200;
		}
		
		return 1/ r;
	}
	
}