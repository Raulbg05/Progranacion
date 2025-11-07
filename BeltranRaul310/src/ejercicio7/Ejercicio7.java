/*
* Programa que pide dos valores enteros P y Q, luego almacena en un array que contenga
 todos los valores desde P hasta Q, y lo muestra por pantalla.
 * Autor: Raúl Beltrán
 * Fecha: 30/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
	
	Scanner teclado= new Scanner(System.in);
		
	int p, q, r, numeroMayor, numeroMenor;
	
	System.out.print("Dame un número entero: ");
	p = teclado.nextInt();
	
	System.out.print("Dame otro número entero: ");
	q = teclado.nextInt();
	
	numeroMayor = Math.max(p, q);
	numeroMenor = Math.min(p, q);
	
	r = numeroMayor - numeroMenor;
	
	int suma = numeroMenor;
	
	int[] array = new int [r];
	array [0] = numeroMenor;
	
		for (int posicion = 0; posicion < array.length; posicion++) {
			suma = suma + 1;
			array[posicion] = suma;
		}
		
		for (int posicion = 0; posicion < array.length; posicion++) {
			System.out.println(array[posicion]);
		}
		
	teclado.close();
	}

}