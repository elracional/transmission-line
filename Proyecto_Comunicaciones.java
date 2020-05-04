/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_comunicaciones;

import java.util.Scanner;

public class Proyecto_Comunicaciones {

      
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
      formatos mundo=new formatos();
        int n=entra.nextInt();
        double resi=n*Math.pow(10,23);
        mundo.setRes(resi);
        System.out.println(""+mundo.getRes());
        
    }
    
}
