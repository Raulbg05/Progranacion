/*
* Descripción: Programa que comprueba el descuento aplicado a un valor
* mediante una función
* Autor: Raúl Beltrán
* Fecha: 14/11/2025
*/
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		double precio, precioDescuento, resultado;
		
		System.out.print("Introduce el precio SIN el descuento aplicado: ");
		precio = teclado.nextDouble();
		
		System.out.print("Introduce el precio CON el descuento aplicado: ");
		precioDescuento = teclado.nextDouble();
	
			while (precioDescuento > precio) {
				System.out.print("La cantidad es incorrecta, el precio con el descuento aplicado no puede ser mayor al precio sin descuento, introduzca de nuevo el precio CON descuento: ");
				precioDescuento = teclado.nextDouble();
			}
			
		resultado = comprobacion(precio, precioDescuento);
		
		System.out.print("El descuento es del " + resultado + "%");
		
	teclado.close();	
	}
	
	// Calcula el descuento de un valor
	public static double comprobacion(double precio, double precioDescuento) {
	double comprobacion, comprobacionFinal;
		comprobacion = (precioDescuento * 100) / precio;
		comprobacionFinal = 100 - comprobacion;
	return comprobacionFinal;
	}

}
