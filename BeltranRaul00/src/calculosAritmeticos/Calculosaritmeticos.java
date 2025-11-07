/*
 * Descripción: Cálculo aritméticos básicos
 * Autor: Raúl Beltrán
 * Fecha: 30/09/2025
 */
package calculosAritmeticos;

import java.util.Scanner;

public class Calculosaritmeticos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame el primer número: ");
		double numero1 = teclado.nextDouble();
		System.out.print("Dame el segundo número: ");
		double numero2 = teclado.nextDouble();
		
		double dobleNumero1 = numero1 * 2;
		double mitadNumero2 = numero2 / 2;
		double cuadradoSuma = Math.pow(numero1 + numero2, 2); //EL MATH.POW SE USA PARA ELEVAR A CUALQUIER POTENCIA, EN ESTE CASO EL RESULTADO DE UNA SUMA. SE ELEVA AL CUADRADO PORQUE YO HE PUESTO AL FINAL EN NUMERO 2 AL FINAL DEL PARENTESIS (EN AZUL) PERO SI QUISIERA ELEVARLO AL CUBO SOLO TENDRIA QUE PONER UN 3 Y VICEVERSA
		
		System.out.println(cuadradoSuma);

	}

}
