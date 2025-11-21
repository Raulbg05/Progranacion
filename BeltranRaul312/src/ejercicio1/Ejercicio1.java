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
		Scanner teclado = new Scanner(System.in);

		String texto;
		int inicioPalabra = 0, finPalabra;

		System.out.print("Introduce una frase: ");
		texto = teclado.nextLine();

		for (int posicion = 0; posicion <= texto.length(); posicion++) {
		    // Si llegamos a un espacio o al final de la frase se detecta una palabra
		    if (posicion == texto.length() || texto.charAt(posicion) == ' ') {
		        finPalabra = posicion;
		        
		        // Solo imprimir si la palabra no está vacía (evita errores con espacios repetidos)
		        if (finPalabra > inicioPalabra) {
		            System.out.println(texto.substring(inicioPalabra, finPalabra));
		        }

		        inicioPalabra = posicion + 1;  // Mover el inicio a la siguiente palabra
		    }
		}

		teclado.close();
	}
}
