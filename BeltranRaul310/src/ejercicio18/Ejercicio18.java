/*
*  Descripción: Programa crea un array de 30 números, le da valor aleatorio y luego ordena sus valores
 * Autor: Raúl Beltrán
 * Fecha: 31/10/2025
 */
package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		
	final int TOTAL_NUM = 30;
		
	double[] aleatorio = new double [TOTAL_NUM];
	
		for (int posicion = 0; posicion < aleatorio.length; posicion++) {
			aleatorio[posicion] = (Math.random() * 10);
		}
	
	Arrays.sort(aleatorio);

	for (int posicion = 0; posicion < aleatorio.length; posicion++) {
		System.out.println(aleatorio[posicion]);
	}
	
	}

}
