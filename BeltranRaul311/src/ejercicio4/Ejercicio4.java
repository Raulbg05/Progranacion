/*
*  Descripción: Programa que pide al usuario que introduzca 5 notas de 4 alumnos distintos
*  y le diga la media, nota más alta y nota más baja de cada uno.
 * Autor: Raúl Beltrán
 * Fecha: 04/11/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double notaBaja, notaAlta;
    final int TOTALMAX_ALUM = 4, TOTALMAX_ASIG = 5;
    double[][] notas = new double[TOTALMAX_ALUM][TOTALMAX_ASIG];

        // introducir todas las notas
        for (int posicion = 0; posicion < TOTALMAX_ALUM; posicion++) {
            System.out.println("Introduce las notas del alumno " + (posicion + 1) + ": ");
            for (int lugar = 0; lugar < TOTALMAX_ASIG; lugar++) {
                System.out.print("Nota nº" + (lugar + 1) + ": ");
                notas[posicion][lugar] = teclado.nextDouble();
            }
            System.out.println();
        }

        // calcular y mostrar media, nota más alta y más baja de cada alumno
        for (int posicion = 0; posicion < TOTALMAX_ALUM; posicion++) {
            double suma = 0;
            notaBaja = notas[posicion][0];
            notaAlta = notas[posicion][0];

            for (int lugar = 0; lugar < TOTALMAX_ASIG; lugar++) {
                double nota = notas[posicion][lugar];
                suma += nota;

                if (nota > notaAlta) {
                    notaAlta = nota;
                } else if (nota < notaBaja) {
                    notaBaja = nota;
                }
            }

        double media = suma / TOTALMAX_ASIG;
        System.out.println("→ Alumno " + (posicion + 1) + ": media = " + media +
                           ", nota más baja = " + notaBaja +
                           ", nota más alta = " + notaAlta);
        System.out.println("--------------------------------------");
        }

    teclado.close();
    }
}
