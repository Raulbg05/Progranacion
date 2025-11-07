/*
 * Descripción: Cálculo de nota de exámen tipo test usando if y else
 * Autor: Raúl Beltrán
 * Fecha: 07/10/2025
 */
package tipotest;

import java.util.Scanner;

public class Tipotest {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduzca el número de preguntas acertadas: ");
		int aciertos = teclado.nextInt();
		System.out.print("Introduzca el número de preguntas falladas: ");
		int fallos = teclado.nextInt();

		double notaAciertos = aciertos * 0.5;
		double notaFallos = fallos * 0.25;
		
		double nota = notaAciertos - notaFallos;
		
		if (aciertos + fallos <0 && aciertos + fallos > 20) {
			System.out.print("Datos erróneos");
		} else if ( nota < 5 )
            {
                System.out.println ("INSUFICIENTE y la nota cuantitativa es: " + nota);
            }
            else if ( nota < 6  )
            {
                System.out.println ("SUFICIENTE y la nota cuantitativa es: " + nota);
            }
            else if (  nota < 7  )
            {
                System.out.println  ("BIEN y la nota cuantitativa es: " + nota);
            }
            else if ( nota < 9 )
            {
                System.out.println  ("NOTABLE y la nota cuantitativa es: " + nota);
            }
            else 
            {
                System.out.println  ("SOBRESALIENTE y la nota cuantitativa es: " + nota);
            }
		teclado.close();
        }
        

		
	}


