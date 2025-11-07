/*
 * Descripción: Pasar unidades de metros a otras unidades
 * Autor: Raúl Beltrán
 * Fecha: 30/09/2025
 */
package cambioUnidades;

import java.util.Scanner;

public class Cambiounidades {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de metros que desea transformar: ");
		double numeroMetros = teclado.nextDouble();
		double numeroDecimetros = numeroMetros * 10;
		double numeroCentimetros = numeroMetros * 100;
		double numeroMilimetros = numeroMetros * 1000;
		double numeroPulgadas = numeroMetros / 0.0254;
		double numeroPies = numeroPulgadas / 12;
		double numeroYardas = numeroPies / 3;
		
		System.out.println("---------------" + "\nRESULTADOS" + "\nLa medida " + numeroMetros + " en metros en Sistema Internacional son:" 
		+ "\nDecímetros: " + numeroDecimetros + "\nCentímetros: " + numeroCentimetros + "\nMilímetros: " + numeroMilimetros + "\n---------------" + "\nLa medida: " 
		+ numeroMetros + " en metros en Sistema anglosajón son:" + "\nPulgadas: " + numeroPulgadas + "\nPies: " + numeroPies + "\nYardas: " + numeroYardas);
	}

}
