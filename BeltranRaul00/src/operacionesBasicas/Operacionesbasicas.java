/*
 * Descripción: Prueba operaciones básicas
 * Autor: Raúl Beltrán
 * Fecha: 25/09/2025
 */
package operacionesBasicas;

import java.util.Scanner;

public class Operacionesbasicas {

	public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in); // AL PONER SCANNER TE PONES ENCIMA Y LE DAS A SCANNER UTIL
		
//		System.out.print("Dame el dato 1: ");
//		double dato1 = teclado.nextDouble();
//		System.out.print("Dame el dato 2: ");
//		double dato2 = teclado.nextDouble();  //ESTO ES PARA PEDIRLE AL USUARIO QUE INTRODUZCA LOS 3 DATOS POR SI MISMO, RECUERDA PONER EL SCANNER SIEMPRE
//		System.out.print("Dame el dato 3: ");
//		double dato3 = teclado.nextDouble();
		
		double dato1 = 4; 					// SE PONEN LOS DATOS USANDO DOUBLE EN VEZ DE BYTE PARA QUE AL HACER LAS DIVISIONES DEL EL RESULTADO CON DECIMALES
		double dato2 = 11;
		double dato3 = 6;
		
		
		double suma = dato1 + dato2;
		System.out.println("La suma es: " + suma);
		
		double resta = dato1 + dato2;
		double multiplicacion = dato1 * dato2;
		double division = dato1 / dato2;
		System.out.println("La resta es: " + resta + "\nLa multiplicación es: " + multiplicacion + "\nLa división es: " + division);
		
		double resto = dato1 % dato3;			// EL RESTO DE LA DIVION ENTRE EL DATO1 Y DATO2 EN ESTE CASO
		System.out.println("El resto es: " + resto);
		
		boolean comparacion1 = dato1 == dato2; 	// IGUAL QUE
		boolean comparacion2 = dato1 != dato2; 	// DIFERENTE QUE
		boolean comparacion3 = dato1 > dato2; 	// MAYOR QUE
		boolean comparacion4 = dato1 < dato2;	// MENOR QUE
		boolean comparacion5 = dato1 >= dato2;	// MAYOR O IGUAL QUE
		boolean comparacion6 = dato1 <= dato2;	// MENOR O IGUAL QUE
		
		System.out.println("El primer número es igual que el segundo: " + comparacion1 + "\nEl primer número es diferente que el segundo: " + comparacion2 + "\nEl primer número es mayor que el segundo: " + comparacion3 + "\nEl primer número es menor que el segundo: " + comparacion4 + "\nEl primer número es mayor o igual que el segundo: " + comparacion5 + "\nEl primer número es menor o igual que el segundo: " + comparacion6);
	
		boolean condicion1, condicion2, resultado1, resultado2;
		condicion1 = (dato1>10); 				// SI UNA LA CONDICION QUE QUIERES ES QUE EL DATO SEA MAYOR DE 10 PONER ESTO
		condicion2 = (dato2>10);
		
		resultado1 = condicion1 || condicion2;	// UNA DE LAS 2 CONDICIONES SE CUMPLEN
		resultado2 = condicion1 && condicion2;	// AMBAS CONDICIONES SE CUMPLEN
		System.out.println("El primer o el segundo número son mayor que 10: " + resultado1 + "\nAmbos números son mayor que 10: " + resultado2);
		
		String resultado;
		resultado = (dato1 > 18) ? "Mayor" : "Menor"; // ES EL DATO1 MAYOR A 18(POR EJEMPLO)? LAS PRIMERAS COMILLAS ES LA RESPUESTA SI ES VERDADERO Y LAS SEGUNDAS ES SI ES FALSO (PUEDES PONER LO QUE QUIERAS)
		System.out.println(resultado);
	
	}
	

}
