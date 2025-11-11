/*
*  Descripción: Programa que te dice el número vocales que 
*  tiene la frase que ha introducido el usuario
 * Autor: Raúl Beltrán
 * Fecha: 10/11/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	String Frase, FraseMinus;
	int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
	
	System.out.print("Introduce una frase: ");
	Frase = teclado.nextLine();
	
	FraseMinus = Frase.toLowerCase();
	
	char[] fraseChar;
	
	fraseChar = FraseMinus.toCharArray();
	
		for (int posicion = 0; posicion < fraseChar.length; posicion++) {
			if (fraseChar[posicion] == 'a') {
				contadorA++;
			}
			else if (fraseChar[posicion] == 'e') {
				contadorE++;
			}
			else if (fraseChar[posicion] == 'i') {
				contadorI++;
			}
			else if (fraseChar[posicion] == 'o') {
				contadorO++;
			}
			else if (fraseChar[posicion] == 'u') {
				contadorU++;
			}
		}
	
		for (int posicion = 0; posicion < fraseChar.length; posicion++) {
			System.out.print(fraseChar[posicion]);
		}
		
	System.out.println("Nº de A's: " + contadorA
			+ "\nNº de E's: " + contadorE
			+ "\nNº de I's: " + contadorI
			+ "\nNº de O's: " + contadorO
			+ "\nNº de U's: " + contadorU);
	
	teclado.close();
	}

}
