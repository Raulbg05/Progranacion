/*
 * Descripción: Hacer la suma de los numeros pares e impares (por separado) entre 100 y 200
 * Autor: Raúl Beltrán
 * Fecha: 29/10/2025
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int par = 98;
		int impar = 99;
		
		int sumaPar = 0;
		int sumaImpar = 0;
		
		final int TOTAL_NUM_PAR = 51;
		final int TOTAL_NUM_IMPAR = 50;
		int[] numeroPar, numeroImpar;
		numeroPar = new int [TOTAL_NUM_PAR];
		numeroImpar = new int [TOTAL_NUM_IMPAR];
		
		for (int posicionPar = 0; posicionPar < numeroPar.length; posicionPar++) {
			par = par + 2;
			numeroPar[posicionPar] = par;			
		}
		
		for (int posicionPares = 0; posicionPares < numeroPar.length; posicionPares++) {
			sumaPar += numeroPar[posicionPares];
		}
		
		for (int posicionImpar = 0; posicionImpar < numeroImpar.length; posicionImpar++) {
			impar = impar + 2;
			numeroImpar[posicionImpar] = impar;
		}
		
		for (int posicionImpares = 0; posicionImpares < numeroImpar.length; posicionImpares++) {
			sumaImpar += numeroImpar[posicionImpares];
		}
		System.out.println("El resultado de la suma de los números pares es: " + sumaPar);
		System.out.print("El resultado de la suma de los números impares es: " + sumaImpar);
	}

}
