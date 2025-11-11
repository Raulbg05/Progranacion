/*
* Descripción: Programa suma el Iva a 5 precios introducidos por teclado
* utilizando una función
* Autor: Raúl Beltrán
* Fecha: 11/11/2025
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		double precio, resultado;
		
			for (int posicion = 0; posicion < 5; posicion++) {
				System.out.print("Introduce un precio: ");
				precio = teclado.nextDouble();
				resultado = precioConIva(precio);
				System.out.println("El precio CON Iva es: " + resultado);
			}
			
			System.out.println("--------"
					 + "\nFIN");
		
	teclado.close();
	}
	
	// Devuelve el precio tras sumarle un 21% de IVA
	public static double precioConIva(double precio) {
		double iva;
			iva = precio + (precio * 0.21);
	return iva;
	}

}
