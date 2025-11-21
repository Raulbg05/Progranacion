/*
* Descripción: Programa que pasa de kilómetros introducidos por el usuario a millas
* mediante una función
* Autor: Raúl Beltrán
* Fecha: 14/11/2025
*/
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
		
		double km, resultado;
		
		System.out.print("Introduce una cantidad de kilómetros: ");
		km = teclado.nextDouble();
		
		resultado = kmAmillas(km);
		
		System.out.print(km + " kilómetros son: " + resultado + " millas.");
		
	teclado.close();
	}
	
	// Función que pasa de kilómetros a millas
	 public static double kmAmillas(double km) {
		 double millas;
		 	millas = km * 0.621371;
		 return millas;
	 }

}
