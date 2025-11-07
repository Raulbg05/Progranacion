/*
 * Descripción: Uso de condiciones básicas para comprobar si un alumno tiene la edad requerida para acceder a unos estudios
 * Autor: Raúl Beltrán
 * Fecha: 07/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		int edad = teclado.nextInt();
		
		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		} else {
			System.out.print("Introduzca los siguientes datos: " + "\nNombre: ");
			teclado.nextLine();
			String nombre = teclado.nextLine();
			System.out.print("Apellidos: ");
			String apellidos = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre + 
					"\nApellidos: " + apellidos + 
					"\nEdad:" + edad + 
					"\n\nUsted ha sido admitido.");
		}
		

	}

}
