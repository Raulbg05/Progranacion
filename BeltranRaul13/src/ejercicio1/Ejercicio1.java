/*
 * Descripción: Calcular el salario del usuario
 * Autor: Raúl Beltrán
 * Fecha: 30/09/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca los siguientes datos:" + "\nNombre: ");
		String nombreUsuario = teclado.nextLine();
		
		System.out.print("Apellidos: ");
		String apellidosUsuario = teclado.nextLine();
		
		System.out.print("Fecha de nacimiento: ");
		String fechaUsuario = teclado.nextLine();
		
		System.out.print("Salario bruto: ");
		double salarioBruto = teclado.nextDouble();
		
		System.out.print("Años trabajando en la empresa: ");
		double annosEmpresa = teclado.nextInt();
		
		double salarioNeto = salarioBruto * 0.85;
		
		double porcentajeAumento = annosEmpresa * 2;
		double aumento = porcentajeAumento / 100;
		double salarioTotalbruto = salarioBruto + (aumento * salarioBruto);
		double salarioTotal = salarioTotalbruto * 0.85;
		
		System.out.println("Estimad@ " + nombreUsuario + " " + apellidosUsuario + ", su salario bruto es " + 
		salarioBruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioNeto + ".");
		
		System.out.println("Debido a sus " + annosEmpresa + " años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de "
		+ porcentajeAumento + "% y el salario total es " + salarioTotal);
		
		
	}

}
