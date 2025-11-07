package prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		double numero = teclado.nextDouble();	
		
		double sumaPositiva = numero;
		double sumaNegativa = numero;
		int contadorPositivo = 1;
		int contadorNegativo = 1;
		int contadorCeros = 1;
		double mediaPositiva = 0;
		double mediaNegativa = 0;
		
		
		do {

			if (numero > 0) {
			contadorPositivo = contadorPositivo + 1;																			// contador
			sumaPositiva = sumaPositiva + numero; 																				// acumulador
			mediaPositiva = sumaPositiva / contadorPositivo;
			}
			
			else if (numero < 0) {
				contadorNegativo = contadorNegativo + 1;																		// contador
				sumaNegativa = sumaNegativa + numero; 																			// acumulador
				mediaNegativa = sumaNegativa / contadorNegativo;
			}
			
			else {
				contadorCeros = contadorCeros + 1;																				// contador
			}
			
			System.out.print("Dame otro número: ");
			numero = teclado.nextInt();
			
		}
			
			while (contadorPositivo + contadorNegativo + contadorCeros <= 10); {		
				}
			
			
		System.out.println("La cantidad de números introducidos positivos es: " + contadorPositivo + ". Y el valor medio es: " + mediaPositiva 
				+ "\nLa cantidad de números negativos introducidos es: " + contadorNegativo + ". Y el valor medio es: " + mediaNegativa
				+ "\nEl número de ceros introducidos es: " + contadorCeros);
	}
			
}