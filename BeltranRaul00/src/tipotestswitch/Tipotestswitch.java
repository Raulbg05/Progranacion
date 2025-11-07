/*
 * Descripción: Cálculo de nota de exámen tipo test usando switch
 * Autor: Raúl Beltrán
 * Fecha: 07/10/2025
 */
package tipotestswitch;

import java.util.Scanner;

public class Tipotestswitch {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Introduzca el número de preguntas acertadas: ");
		int aciertos = teclado.nextInt();
		System.out.print("Introduzca el número de preguntas falladas: ");
		int fallos = teclado.nextInt();

		String resultado;
		
		if (aciertos + fallos <= 20) {
			
					double notaAciertos = aciertos * 0.5;
					double notaFallos = fallos * 0.25;
					double nota = notaAciertos - notaFallos;
					
				if (nota < 0) {
					nota = 0;
				}
			
		int notaEntera = (int) Math.round(nota);
			
				switch (notaEntera) {
				case 0,1,2,3,4:
					resultado = "INSUFICIENTE";
					break;
				case 5:
					resultado = "SUFICIENTE";
					break;
				case 6:
					resultado = "BIEN";
					break;
				case 7,8:
					resultado = "NOTABLE";
					break;
				case 9,10:
					resultado = "SOBRESALEINTE";
					break;
				default:
					resultado = "Datos erroneos";
				}
		System.out.print("Tu nota es " + resultado + " un " + nota);
	}
teclado.close();
}
}
