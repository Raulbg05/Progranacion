/*
* Descripción: Programa que devuelve el minimo entre 3 números solo
* usando una funcion con 2 de los números
* Autor: Raúl Beltrán
* Fecha: 13/11/2025
*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	int a, b, c, resultado;
	
		System.out.print("Introduce 3 valores." + "\nIntroduce el primero: ");
		a = teclado.nextInt();
		
		System.out.print("Introduce el segundo: ");
		b = teclado.nextInt();
		
		System.out.print("Introduce el tercero: ");
		c = teclado.nextInt();
		
		resultado = minimo(a,b);
		resultado = minimo(resultado, c);
		
		System.out.print("El número más pequeño es: " + resultado);
		
	teclado.close();
	}
	
	// Devuelve el valor más pequeño entre 2 números
	public static int minimo (int a, int b) {
		int minimo;
			minimo = Math.min(a, b);
		return minimo;
	}

}
