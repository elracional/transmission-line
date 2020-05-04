/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_comunicaciones;

import java.text.*;
import java.math.*;
public class formatos {
    double res;
 NumberFormat fmt = new  DecimalFormat();
   
   
    public void inicializar(double res ){
        
    }
   
    public String getRes() {
         fmt = new  DecimalFormat("0.###E0");
        return fmt.format(res);
    }

      public String getRes1() {
         fmt = new  DecimalFormat("0.##");
        return fmt.format(res);
    }


    public void setRes(double res) {
        this.res = res;
    }
}
