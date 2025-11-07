package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		        System.out.println("Piensa un número del 1 al 100 y yo intentaré adivinarlo.");
		        System.out.println("Responde con 'mayor', 'menor' o 'igual' según mi intento.");

		        int min = 1;
		        int max = 100;
		        String respuesta = "";

		        while (!respuesta.equalsIgnoreCase("igual")) {
		            int intento = (min + max) / 2; // el ordenador propone el número del medio
		            System.out.println("¿Es tu número " + intento + "?");
		            System.out.print("Respuesta: ");
		            respuesta = teclado.nextLine().trim();

		            if (respuesta.equalsIgnoreCase("mayor")) {
		                min = intento + 1; // el número es mayor, ajustamos el mínimo
		            } else if (respuesta.equalsIgnoreCase("menor")) {
		                max = intento - 1; // el número es menor, ajustamos el máximo
		            } else if (!respuesta.equalsIgnoreCase("igual")) {
		                System.out.println("Por favor, responde solo 'mayor', 'menor' o 'igual'.");
		            }
		        }

		        System.out.println("¡Genial! He adivinado tu número.");
		        teclado.close();
		    }
		}
