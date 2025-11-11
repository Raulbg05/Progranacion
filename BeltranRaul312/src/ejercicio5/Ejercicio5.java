/*
*  Descripción: Programa que comprueba si la frase/palabra
*  introducida por teclado es o no un palíndromo.
 * Autor: Raúl Beltrán
 * Fecha: 10/11/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	String Frase, Clean;
	
	char[] Frasechar, Frasechar1;
	
	int contadorNegativo = 0;
	
	System.out.print("Introduce una frase: ");
	Frase = teclado.nextLine();
	
	Clean = Frase.toLowerCase().replace(" ", "");
	
	Frasechar = Clean.toCharArray();
	Frasechar1 = Clean.toCharArray();
	
			for (int posicion = 0; posicion < Frasechar.length; posicion++) {
				Frasechar1[posicion] = Frasechar[Frasechar.length - 1 - posicion];
			}
			
			for (int posicion = 0; posicion < Frasechar.length; posicion++) {
				if (Frasechar[posicion] != Frasechar1[posicion]) {
					contadorNegativo++;
				}
			}
		
		if (contadorNegativo > 0) {
			System.out.println("La frase NO es un palíndromo");
		}
		else {
			System.out.println("La frase ES un palíndromo");
		}
		
		
	teclado.close();
	}

}
