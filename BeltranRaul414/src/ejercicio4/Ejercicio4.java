/*
* Descripción: Programa que verifica si un numero que introduce el usuario es positivo, negativo o igual a 0
* utilizando una función
* Autor: Raúl Beltrán
* Fecha: 11/11/2025
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);

		int a, resultado;
						
		System.out.print("Introduce un número: ");
		a = teclado.nextInt();
		
		resultado = dimeSigno(a);
		
		System.out.print(resultado);
	
	teclado.close();
	}
	
	// Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
	public static int dimeSigno(int a) {
		int signo;
			if (a > 0) {
				signo = 1;
			}
			else if (a == 0) {
				signo = 0;
			}
			else {
				signo = -1;
			}
	return signo;
	}

}
