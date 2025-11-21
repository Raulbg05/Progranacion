/*
* Descripción: Programa que crea un array de 50 de capacidad y le da numeros entre 50 y 99.
* Posteriormente dice la suma total y la media de los 50 números mediante una función.
* Autor: Raúl Beltrán
* Fecha: 18/11/2025
*/
package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {
	
	double total, media;
	
	final int TOTAL_NUM = 50;	
		
	double[] array = new double[TOTAL_NUM];
		
		// Bucle que le da un valor entre 50 y 99 a todas las posiciones del array
		for (int posicion = 0; posicion < array.length; posicion++) {
			array[posicion] = (Math.random() * 50) + 50;
		}
		
	total = sumaTotal(array);
	media = mediaTotal(total);
	
	System.out.print("La suma total de todas las posiciones del array es: " + total
			+ "\nLa media de la suma total de todas las posiciones del array es: " + media);

	}
	
	// funcion que devuelve la suma total de todas las posiciones del array
	public static double sumaTotal (double [] array) {
		double total = 0;
			for (int posicion = 0; posicion < array.length; posicion++) {
				total += array[posicion];
			}
		return total;
	}
	
	// funcion que devuelve la media de la suma total de todas las posiciones del array
	public static double mediaTotal (double total) {
		double media = 0;
			media = total / 50;
		return media;
	}

}
