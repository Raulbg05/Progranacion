/*
 * Descripción: Calcular un número aleatorio entre el 0 y el 50 e ir pidiendo al usuario que introduzca números hasta que acierte
 * Autor: Raúl Beltrán
 * Fecha: 16/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int aleatorio, numero;
		
		aleatorio = (int) (Math.random() * 51); 				// Math.random() genera un número entre 0.0 y 1.0;  Al multiplicar por 51, se obtiene un rango entre 0 y 50; El (int) elimina los decimales
		
		do {
			System.out.print("Introduce el número entre 0 y 50!: ");
			numero = teclado.nextInt();
			
				if (numero > aleatorio) {
					System.out.println("mayor");
				}
				
				else if (numero < aleatorio) {
					System.out.println("menor");
				}
				
				else {											// Si el número no es ni mayor ni menor que el generado aleatoriamente, significa que es el mismo
					System.out.println("Has acertado!");
				}
		}
		
		while (numero != aleatorio); {
		}
	teclado.close();
	}
}
