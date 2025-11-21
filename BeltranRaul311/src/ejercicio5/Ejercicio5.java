/*
*  Descripción: Programa guarda los sueldos de varones y mujeres de una empresa un una única matriz
*  y calcula la media de ambos géneros para comprobar si hay brecha salarial
 * Autor: Raúl Beltrán
 * Fecha: 04/11/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	final int N;

	System.out.print("Cantidad de sueldos a registrar: ");
	N = teclado.nextInt();
	
	double[][] brechaSalarial = new double [N][(2)]; 
	
	double sumaVaron = 0, sumaMujer = 0, mediaVaron = 0, mediaMujer = 0, contadorVaron = 0, contadorMujer = 0, sueldo;
	
		for (int posicion = 0; posicion < N; posicion++) {
			byte genero;
			System.out.print("Género del sueldo nº" + (posicion + 1) + " (0 para varón y 1 para mujer): ");
			genero = teclado.nextByte();
			
				while (genero != 0 && genero != 1) {
					System.out.print("Valor no válido. Introduce 0 (varón) o 1 (mujer): ");
					genero = teclado.nextByte();
				}	
			
			System.out.print("Sueldo: ");
			sueldo = teclado.nextDouble();
			
			brechaSalarial[posicion][0] = genero;
			brechaSalarial[posicion][1] = sueldo;
			
			if (genero == 0) {
				sumaVaron += sueldo;
				contadorVaron++;
			}
			else {
				sumaMujer += sueldo;
				contadorMujer++;
			}
		}
	mediaVaron = sumaVaron / contadorVaron;
	mediaMujer = sumaMujer / contadorMujer;
	
	System.out.print("\n" + "El sueldo medio de los varones es de: " + mediaVaron
			+ "\nEl sueldo medio de las mujeres es de: " + mediaMujer);
	teclado.close();
	}

}
