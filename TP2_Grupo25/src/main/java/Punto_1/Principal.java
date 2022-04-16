package Punto_1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		
		int numero = entrada.nextInt();		
		while (numero > 10 || numero < 0)
		{
			System.out.println("Ingrese un numero entre 0 y 10");
			numero = entrada.nextInt();
		}
		Factorial unfactor = new Factorial();
		unfactor.calcula_factorial(numero);
		
		entrada.close();
	}
	
}
