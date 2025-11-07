/*
 * Descripción: Calcular lo que ha gastado un cliente en un mes y comprobar si dispone de descuento
 * Autor: Raúl Beltrán
 * Fecha: 07/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduzca los siguientes valores: " + "\nNombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		System.out.print("ImporteGastado1: ");
		double importeGastado1 = teclado.nextDouble();
		System.out.print("ImporteGastado2: ");
		double importeGastado2 = teclado.nextDouble();
		System.out.print("ImporteGastado3: ");
		double importeGastado3 = teclado.nextDouble();
		System.out.print("ImporteGastado4: ");
		double importeGastado4 = teclado.nextDouble();
		
		double importeTotal = importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4;
		double mediaSemanal = importeTotal / 4;
		
		if (importeTotal > 300) {
			System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nImporte Gastado 1: " + importeGastado1 + " euros" +
					"\nImporte Gastado 2: " + importeGastado2 + " euros" + "\nImporte Gastado 3: " + importeGastado3 + " euros" +
					"\nImporte Gastado 4: " + importeGastado4 + " euros" + "\nImporte Medio: " + mediaSemanal + " euros" +
					"\nEnhorabuena! Al haber alcanzado los 300 euros gastados dispone del descuento de 50€!");
		} else {
			System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nImporte Gastado 1: " + importeGastado1 + " euros" +
					"\nImporte Gastado 2: " + importeGastado2 + " euros" + "\nImporte Gastado 3: " + importeGastado3 + " euros" +
					"\nImporte Gastado 4: " + importeGastado4 + " euros" + "\nImporte Medio: " + mediaSemanal + " euros" +
					"\nLo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		}
	teclado.close();
	}

}
