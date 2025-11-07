/*
 * Descripción: Pide un número y le muestra su valor factorial
 * Autor: Raúl Beltrán
 * Fecha: 20/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            long factorial = 1;															//Hace falta usar long porque los factoriales suelen dar resultados muy altos a partir de 10
            for (int condicion = 1; condicion <= numero; condicion++) {
                factorial *= condicion;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        teclado.close();
    }
}
