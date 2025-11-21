/*
* Descripción: Programa comprueba si una fecha es correcta
* Autor: Raúl Beltrán
* Fecha: 13/11/2025
*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		int anno, mes, dia;
		String verificacion;
		
		System.out.print("Introduce el día de la fecha: ");
		dia = teclado.nextInt();
		
		System.out.print("Introduce el mes de la fecha: ");
		mes = teclado.nextInt();
		
		System.out.print("Introduce el año de la fecha: ");
		anno = teclado.nextInt();
		
		verificacion = fechaOk(dia, mes, anno);
		
		System.out.print(verificacion);

	teclado.close();
	}
	
	// Funcion que verifica la legitimidad de la fecha (limite 2026)
	public static String fechaOk(int dia, int mes, int anno) {
	String resultado;
		if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && anno > 0 && anno < 2026) {
			resultado = "La fecha es válida.";
		}
		else {
			resultado = "La fecho NO es válida.";
		}
	return resultado;
	}

}
