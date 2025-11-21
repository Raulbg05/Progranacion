/*
* Descripción: Programa que devuelve el sumatorio, productorio y valor intermedio
* entre 1 y el número que da el usuario
* Autor: Raúl Beltrán
* Fecha: 13/11/2025
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
		
		int n;
		double resultado1, resultado2, resultado3;
		
		System.out.print("Introduce un número entero: ");
		n = teclado.nextInt();
		
		resultado1 = sumario(n);
		resultado2 = productorio(n);
		resultado3 = intermedio(n);
		
		System.out.print("El sumatorio de 1 a " + n + " es: "  + resultado1 
				+ "\nEl productorio de 1 a " + n + " es: "  + resultado2
				+ "\nEl intermedio entre 1 a " + n + " es: "  + resultado3);
	
	teclado.close();
	}
	
	//  Devuelve la suma de enteros de 1 a n
	public static int sumario(int n) {
		int sumario = 0, suma = 0;
			for (int posicion = 0; posicion < n; posicion++) {
				suma = suma + 1;
				sumario += suma;
			}
	return sumario;
	}
	
	// Devuelve el producto de enteros de 1 a n
	public static int productorio(int n) {
		int productorio = 1, producto = 0;
			for (int posicion = 0; posicion < n; posicion++) {
				producto = producto + 1;
				productorio *= producto;
			}
	return productorio;
	}
	
	// Devuelve el valor intermedio entre 1 y n
	public static double intermedio(int n) {
		double intermedio, nConvertido;
			nConvertido = n;
			intermedio = (1 + nConvertido) / 2;
	return intermedio;
	}
		
}
