/*
 * Descripción: Programa que convierte en expresiones algorítmicas 4 expresiones físicas
 * y/o matemáticas usando los valores que introduce el usuario para cada una
 * Autor: Raúl Beltrán
 * Fecha: 29/10/2025
 */
package BeltranRaul;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		double x, masa, tiempo, frecuencia, radio, operacion, fPeso, numVueltasCompletadas, area;
		
		System.out.print("CÁLCULO DE EXPRESIONES FÍSICAS/MATEMÁTICAS" 
		+ "\n----------------------------" 
		+ "\nIntroduce el valor de X: ");
		x = teclado.nextDouble();
		System.out.print("Introduce la masa (kg): ");
		masa = teclado.nextDouble();
		System.out.print("Introduce el tiempo (s): ");
		tiempo = teclado.nextDouble();
		System.out.print("Introduce la frecuencia (hz): ");
		frecuencia = teclado.nextDouble();
		System.out.print("Introduce el radio del círculo (m): ");
		radio = teclado.nextDouble();
		
		operacion = (x + (x/4)) / (6- (x/2));
		fPeso = masa * 9.8;
		numVueltasCompletadas = frecuencia * tiempo;
		area = Math.PI * (radio * 2);
		
		System.out.print("RESULTADOS" 
			+ "\n----------------------------" 
			+ "\nOPERACION: " + operacion
		 	+ "\nFUERZA_PESO: " + fPeso
		 	+ "\nNUMERO_VUELTAS: " + numVueltasCompletadas
		 	+ "\nAREA_CIRCULO" + area);
					
	}

}
