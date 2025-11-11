/*
* Descripción: Programa que multiplica 2 numeros pedidos al usuario
* utilizando una función
* Autor: Raúl Beltrán
* Fecha: 11/11/2025
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);

		double a,b, resultado;
				
		System.out.print("Introduce un número real: ");
		a = teclado.nextDouble();
		System.out.print("Introduce otro número real: ");
		b = teclado.nextDouble();
				
		resultado = multiplica(a,b);
				
		System.out.print("El resultado de multiplicar los números es: " + resultado);
	teclado.close();
	}
			
	// Devuelve la multiplicación de 2 números
	public static double multiplica(double a, double b) {
		double resultado;
		resultado = a * b;
	return resultado;
	}

}