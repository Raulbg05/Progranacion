/*
 * Descripción: Pedir al usuario su nombre y saludarle
 * Autor: Raúl Beltrán
 * Fecha: 09/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Cómo te llamas?");
		nombre = teclado.nextLine();
		
		System.out.print("Hola " + nombre);
		
		teclado.close();
	}

}
