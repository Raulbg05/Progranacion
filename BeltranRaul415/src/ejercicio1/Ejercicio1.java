/*
* Descripción: Programa que compara 2 nombres y dice si son o no iguales
 mediante un metodo.
* Autor: Raúl Beltrán
* Fecha: 19/11/2025
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);

		String NombreA, NombreB;
		boolean resultado;
		
			System.out.print("Introduce el primer nombre: ");
			NombreA = teclado.nextLine();
			
			System.out.print("Introduce el segundo nombre: ");
			NombreB = teclado.nextLine();
			
			resultado = comparaNombres(NombreA, NombreB);
			
				System.out.print("¿Son los nombres iguales?" + "\n"
				+ resultado);
	
	teclado.close();
	}
	// Metodo que compara si los nombres son iguales
	public static boolean comparaNombres(String a, String b) {
		return a.equals(b);
	}

}
