/*
 * Descripción: Solicitar al usuario numeros comprendidos entre 0 y 100,
 * mostrar cuantos numeros hay de cada decena, y el valor medio de cada decena
 * Autor: Raúl Beltrán
 * Fecha: 12/11/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	// Inicializo todas las variables
	int numero;
	double contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0, contador7 = 0, contador8 = 0, contador9 = 0, contador10 = 0, 
		suma1 = 0, suma2 = 0, suma3 = 0, suma4 = 0, suma5 = 0, suma6 = 0, suma7 = 0, suma8 = 0, suma9 = 0, suma10 = 0,
		media1, media2, media3, media4, media5, media6, media7, media8, media9, media10; 
	
		// Bucle que pide números hasta que el usuario introduzca un 0
		do {
			System.out.print("Introduce un número entre 0 y 100 (introduce 0 para parar): ");
			numero = teclado.nextInt();
				// Bucle por si el usuario mete un número que no esté entre el 0 y el 100
				while (numero <0 || numero > 99) {
					System.out.print("Número erróneo. Introduce un número entre 0 y 100 (introduce 0 para parar): ");
					numero = teclado.nextInt();
				
				// Todos estos if e if else cuentan cuantos números hay de cada decena y los suman para luego hacer la media
				}
				if (numero >= 0 && numero < 10) {
					contador1++;
					suma1 += numero;
				}
				else if (numero >= 10 && numero < 20) {
					contador2++;
					suma2 += numero;
				}
				else if (numero >= 20 && numero < 30) {
					contador3++;
					suma3 += numero;
				}
				else if (numero >= 30 && numero < 40) {
					contador4++;
					suma4 += numero;
				}
				else if (numero >= 40 && numero < 50) {
					contador5++;
					suma5 += numero;
				}
				else if (numero >= 50 && numero < 60) {
					contador6++;
					suma6 += numero;
				}
				else if (numero >= 60 && numero < 70) {
					contador7++;
					suma7 += numero;
				}
				else if (numero >= 70 && numero < 80) {
					contador8++;
					suma8 += numero;
				}
				else if (numero >= 80 && numero < 90) {
					contador9++;
					suma9 += numero;
				}
				else if (numero >= 90 && numero < 100) {
					contador10++;
					suma10 += numero;
				}
				
		// Condicion del bucle principal	
		} while (numero != 0);
	
	
	// Se hace la media de cada decena con los datos obtenidos en el bucle
	media1 = suma1 / contador1;
	media2 = suma2 / contador2;
	media3 = suma3 / contador3;
	media4 = suma4 / contador4;
	media5 = suma5 / contador5;
	media6 = suma6 / contador6;
	media7 = suma7 / contador7;
	media8 = suma8 / contador8;
	media9 = suma9 / contador9;
	media10 = suma10 / contador10;
	
	// Se muestra en pantalla todo el ejercicio
	System.out.print("\n"
			+ "Hay " + contador1 + " numeros en la primera decena. Y la media de la decena es: " + media1
			+ "\nHay " + contador2 + " numeros en la segunda decena. Y la media de la decena es:" + media2
			+ "\nHay " + contador3 + " numeros en la tercera decena. Y la media de la decena es:" + media3
			+ "\nHay " + contador4 + " numeros en la cuarta decena. Y la media de la decena es:" + media4
			+ "\nHay " + contador5 + " numeros en la quinta decena. Y la media de la decena es:" + media5
			+ "\nHay " + contador6 + " numeros en la sexta decena. Y la media de la decena es:" + media6
			+ "\nHay " + contador7 + " numeros en la septima decena. Y la media de la decena es:" + media7
			+ "\nHay " + contador8 + " numeros en la octava decena. Y la media de la decena es:" + media8
			+ "\nHay " + contador9 + " numeros en la novena decena. Y la media de la decena es:" + media9
			+ "\nHay " + contador10 + " numeros en la decima decena. Y la media de la decena es:" + media10);

	teclado.close();
	}

}
