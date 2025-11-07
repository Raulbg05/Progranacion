/*
 * Descripción: Uso básico de for
 * Autor: Raúl Beltrán
 * Fecha: 14/10/2025
 */

package ejercicioBucles;

public class Ejerciciobucles4 {

	public static void main(String[] args) {
		int contador, numero = 5; 
		
		for (contador = 10; contador >= 1; contador--) {
			System.out.println(numero + " por " + contador + " es igual a " + numero * contador);
		}
		System.out.println("Después del bucle, la variable contador contiene: " + contador);
	}

}
