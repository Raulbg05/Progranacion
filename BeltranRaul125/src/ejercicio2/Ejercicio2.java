/*
 * Descripción: Pedir al usuario sus datos y crearle una ficha
 * Autor: Raúl Beltrán
 * Fecha: 09/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		String nombre, apellidos, direccion;
		long numTlfn;
		
		System.out.print("Introduzca sus datos para crear una ficha." + "\nNombre: ");
		nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Dirección: ");
		direccion = teclado.nextLine();
		System.out.print("Número de teléfono: ");
		numTlfn = teclado.nextLong();
		
		System.out.print("--------------------" + "\nFICHA:" 
		+ "\nNombre:" + nombre
		+ "\nApellidos: " + apellidos
		+ "\nDirección: " + direccion
		+ "\nNúmero de teléfono: " + numTlfn);
	}

}
