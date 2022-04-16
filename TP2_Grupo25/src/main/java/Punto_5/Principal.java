package Punto_5;

import java.util.Scanner;

import Punto_10.Muestra;

public class Principal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int salir = 1;
		Muestra unmostrar = new Muestra();
		
		while (salir >= 0)
		{
			System.out.println("Ingrese un numero");
			int numero = entrada.nextInt();		
			
			unmostrar.mostrar_condicionalumno(numero);
			salir = numero;
		}
		
		entrada.close();
	}		
}
