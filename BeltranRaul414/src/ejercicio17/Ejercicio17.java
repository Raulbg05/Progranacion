/*
* Descripción: Programa que comprueba si los números introducidos son o no primos
 mediante una función.
* Autor: Raúl Beltrán
* Fecha: 19/11/2025
*/
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
		
		int primo;
		boolean resultado;
		
			do {
			System.out.print("Introduce un número entero: ");
			primo = teclado.nextInt();
			
			resultado = esPrimo(primo);
			
			System.out.println("¿Es el número introducido primo?" + "\n" + resultado);
			}
			while (primo != 0);
	
	teclado.close();
	}
	//Función que comprueba si un número es o no primo
	public static boolean esPrimo(int primo) {
		if (primo < 2) return false;
		
			for (int comprobante = 2; comprobante * comprobante <= primo; comprobante++) {
				if (primo % comprobante == 0) return false;
				
			}
		return true;
	}
}
