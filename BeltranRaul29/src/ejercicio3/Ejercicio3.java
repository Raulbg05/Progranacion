/*
 * Descripción: Programa que muestra los números pares entre el 1 y el 200 pero sumando de 1 en 1
 * Autor: Raúl Beltrán
 * Fecha: 20/10/2025
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		for (int numerosPares = 0; numerosPares < 200;) {
			numerosPares = numerosPares + 1;
			if (numerosPares % 2 == 0) {
			System.out.println(numerosPares);
			}
		}
		
	}

}
