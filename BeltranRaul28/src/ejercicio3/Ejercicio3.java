/*
 * Descripción: Mostrar números del 100 al 1 usando do-while
 * Autor: Raúl Beltrán
 * Fecha: 14/10/2025
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero = 101;
		
		do {
			numero--;
			System.out.println(numero);
		}
		while (numero > 1);
	}

}