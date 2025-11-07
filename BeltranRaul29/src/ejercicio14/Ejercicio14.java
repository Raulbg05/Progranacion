/*
 * Descripción: Cuantos billetes de cada hacen falta para igualar 
 * la cantidad que introduce el usuario (multiplo de 5)
 * Autor: Raúl Beltrán
 * Fecha: 24/10/2025
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");			 // Pedir cantidad al usuario
        int cantidad = teclado.nextInt();

        																				// Verificar que sea múltiplo de 5
        if (cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser múltiplo de 5.");
        } 
        else {																			// Array con los valores de los billetes disponibles
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        System.out.println("\nDesglose de billetes para " + cantidad + "€:");

            for (int contador = 0; contador < billetes.length; contador++) {			// Bucle clásico
                int valor = billetes[contador]; 										// Accedemos al billete en la posición contador
                int numBilletes = cantidad / valor; 									// Cuántos billetes de este tipo se necesitan

                if (numBilletes > 0) {
                    System.out.println(numBilletes + " billete(s) de " + valor + "€");
                    cantidad = cantidad % valor; 										// Actualizamos la cantidad restante
                }
            }
        }

        teclado.close();
    }
}

