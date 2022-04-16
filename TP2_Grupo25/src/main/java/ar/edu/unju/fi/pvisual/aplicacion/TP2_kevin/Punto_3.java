package ar.edu.unju.fi.pvisual.aplicacion.TP2_kevin;

import java.util.Scanner;

public class Punto_3 {
    public void valores(String[] args) {
    	Scanner leer= new Scanner (System.in);
    	int i=0;
    	do {
    	System.out.println("INGRESE UN VALOR");
    	int num = leer.nextInt();
    	   if (num%2==0)
    	   {
    		   System.out.println("el numero es positivo");
    	   }
    	   else
    		   System.out.println("el numero es negativo");
    	   i++;
    			   
    	}while (i<= 10);
    	
    	leer.close();
    }
}
