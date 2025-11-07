/*
 * Descripción: Hacer la suma y el producto de los 10 primeros números naturales
 * Autor: Raúl Beltrán
 * Fecha: 24/10/2025
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int suma = 1;
		int sumaTotal = 0;
		
		final int TOTAL_NUM = 10;
		
		int[] numeroSuma;
		numeroSuma = new int [TOTAL_NUM];
		
		int producto = 1;
		int productoTotal = 1;
		
		int[] numeroProducto;
		numeroProducto = new int [TOTAL_NUM]; 
		
		
		
		for (int posicion = 0; posicion < numeroSuma.length; posicion++) {		//Bucle para almacenar los 10 primeros números naturales en cada posicion del array
			numeroSuma[posicion] = suma;
			suma++;
		}
		
		for (int posicion = 0; posicion < numeroSuma.length; posicion++) {		 
			sumaTotal += numeroSuma[posicion];									//Bucle para sumar cada uno de los números de cada array por el siguiente hasta llegar al final
		}
		
		System.out.println("La suma de los 10 primeros números naturales es: " + sumaTotal);
		
		
		
		for (int posicion = 0; posicion < numeroProducto.length; posicion++) {	//Bucle para almacenar los 10 primeros números naturales en cada posicion del array (mismo que el primero de arriba, se debería reciclar pero lo he hecho 2 veces para practicar)
			numeroProducto[posicion] = producto;
			producto++;
		}
		
		for (int posicion = 0; posicion < numeroProducto.length; posicion++) {
			productoTotal *= numeroProducto[posicion];							//Bucle para multiplicar cada uno de los números de cada array por el siguiente hasta llegar al final
		}
		
		System.out.println("El producto de los 10 primeros números naturales es: " + productoTotal);
	}

}
