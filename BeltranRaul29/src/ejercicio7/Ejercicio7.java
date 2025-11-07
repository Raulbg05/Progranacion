/*
 * Descripción: Pedir 100 números no nulos y luego mostrar cuantos numeros 
 * positivos y negativos se han detectado respectivamente
 * Autor: Raúl Beltrán
 * Fecha: 20/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {		
    Scanner teclado = new Scanner(System.in);

    int contadorPositivo = 0;
    int contadorNegativo = 0;
    int numero;

    do {
        System.out.print("Inserte un número (0 para terminar): ");
        numero = teclado.nextInt();

        if (numero > 0) {
            contadorPositivo++;
        } else if (numero < 0) {
            contadorNegativo++;
        }

    } while (numero != 0);

    System.out.println("Hay " + contadorPositivo + " números positivos y "
            + contadorNegativo + " números negativos.");

    teclado.close();
	}
}




