/*
 * Descripción: Generar 30 números en un array bidimensional, mostrar cuales son menores que un 
 * numero posteriormente pedido al usuario, y mostrar numeros impares entre un rango que da el usuario
 * Autor: Raúl Beltrán
 * Fecha: 12/11/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	
	int[][] aleatorios = new int [10][3];
	int numero, n, m, contadorImpar = 0;
	
	// Bucle para darle el valor aleatorio entero entre 0 y 300 a todas las posiciones de la matriz
		for (int fila = 0; fila < 10; fila++) {
			for (int columna = 0; columna < 3; columna++) {
				aleatorios[fila][columna] = (int)(Math.random() * 301);
			}
		}
		
	System.out.print("Introduce un número entero entre 0 y 300: ");
	numero = teclado.nextInt();
	
			// Bucle para pedir otro número en caso de haber puesto un número fuera de rango
			while (numero < 0 || numero > 300) {
				System.out.print("Número erróneo, Introduce un número entero entre 0 y 300: ");
				numero = teclado.nextInt();
			}
		
		// Bucle que muestra todos  los valores menores al número pedido anteriormente
		System.out.println("Estos números son menores que el introducido: ");
		for (int fila = 0; fila < 10; fila++) {
			for (int columna = 0; columna < 3; columna++) {
				if (aleatorios[fila][columna] < numero) {
					System.out.print(aleatorios[fila][columna] + "\t ");
				}
			}
		}
		
	System.out.print("\n" + "Introduce una posicion de fila (entre 1 y 10): ");
	n = teclado.nextInt();
	
		// Bucle para pedir otro número en caso de haber puesto un número fuera de rango
		while (n <= 0 || n > 10) {
			System.out.print("Número erróneo, Introduce una posicion entera entre 0 y 10: ");
			n = teclado.nextInt();
		}
		
	System.out.print("Introduce otra posicion de columna (entre 1 y 3): ");
	m = teclado.nextInt();
	
		// Bucle para pedir otro número en caso de haber puesto un número fuera de rango
		while (m <= 0 || m > 10) {
			System.out.print("Número erróneo, Introduce una posicion entera entre 0 y 3: ");
			m = teclado.nextInt();
		}
		
		// Bucle que muestra todos los valores impares en el rango introducido por el usuario
		System.out.println("Estos son los valores impares en el rango introducido: ");
		for (int fila = 0; fila < n; fila++) {
			for (int columna = 0; columna < m; columna++)
				if (aleatorios[fila][columna] % 2 != 0) {
					System.out.print(aleatorios[fila][columna] + "\t");
					contadorImpar++;
				}
				
		}
		
		// En caso de que no haya ningún número impar en el rango introducido por el usuario saldrá este mensaje
		if (contadorImpar == 0) {
			System.out.print("No hay numeros impares en el rango que has puesto.");
		}
		
	teclado.close();
	}

}
