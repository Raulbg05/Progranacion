/*
*  Descripción: Programa que pide que te 
*  separen las diferentes palabras de una cadena de caracteres
 * Autor: Raúl Beltrán
 * Fecha: 07/11/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	String Texto;
	
	int inicioPalabra = 0, finPalabra;
    String[] palabra = new String [3];
	
	System.out.print("Introduce una frase: ");
	Texto = teclado.nextLine();
		
		for (int posicion = 0; posicion <= Texto.length(); posicion++) {
			if (posicion == Texto.length() || Texto.charAt(posicion) == ' ') {
				for (int lugar = 0; lugar < 3; lugar++) {
					finPalabra = posicion;
					palabra[lugar] = Texto.substring(inicioPalabra, finPalabra);
					System.out.print(palabra + "\n");
					inicioPalabra = posicion + 1;
				}
			}
		}
	teclado.close();
	}

}
