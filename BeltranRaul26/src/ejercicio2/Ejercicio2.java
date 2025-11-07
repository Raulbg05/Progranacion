/*
 * Descripción: Uso de condiciones básicas para comprobar si un alumno tiene las condiciones aptas para acceder a unos estudios
 * Autor: Raúl Beltrán
 * Fecha: 03/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduzca los siguientes datos: " + "\nNombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = teclado.nextInt();
		System.out.print("Nota académica: ");
		double nota = teclado.nextDouble();
		
		if (nota > 0 && nota <= 10) {
			
		if  (edad >= 18 && nota >= 7) { 																								// SI LA EDAD ES MAYOR O IGUAL A 18 Y LA NOTA ES MAYOR O IGUAL A SIETE SALDRA EL MENSAJE DE ABAJO
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		} else {																														// SI NO SE CUMPLEN AMBAS CONDICIONES SALDRÁ EL MENSAJE DE ABAJO
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
		}
		} else {
			 System.out.println("La nota no es válida");
		 }
	}

}

