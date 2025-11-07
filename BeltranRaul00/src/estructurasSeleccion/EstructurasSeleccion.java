/*
 * Descripción: ejemplos de if y else muy básicos
 * Autor: Raúl Beltrán
 * Fecha: 01/10/2025
 */
package estructurasSeleccion;

import java.util.Scanner;

public class EstructurasSeleccion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce edad: ");
		
		byte edad = teclado.nextByte();
		System.out.println ("Comprobando edad...");
		
		if (edad > 18) {
		System.out.println("Usted es mayor de edad");
		}
		
		else {  
			System.out.println("Usted es menor de edad");
		}
	}

}
