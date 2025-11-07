/*
 * Descripción: Almacenar 10 números otorgados por el usuario
 * en un array y mostrarlos en pantalla luego sumados
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		final int TOTAL_NUM = 10;
		double[] numeros;
		numeros = new double [TOTAL_NUM];
		
		double suma = 0;
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
		System.out.println("Introduce un número: ");
		numeros[posicion] = teclado.nextDouble();
		suma += numeros[posicion];
		}
		
		System.out.println("Este es el resultado: ");
		System.out.print(suma);
	teclado.close();
	}

}