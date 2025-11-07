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

        // 1️⃣ Primero: introducir todas las notas
        for (int i = 0; i < TOTALMAX_ALUM; i++) {
            System.out.println("Introduce las notas del alumno " + (i + 1) + ": ");
            for (int j = 0; j < TOTALMAX_ASIG; j++) {
                System.out.print("Nota nº" + (j + 1) + ": ");
                notas[i][j] = teclado.nextDouble();
            }
            System.out.println();
        }

        // 2️⃣ Luego: calcular y mostrar media, nota más alta y más baja de cada alumno
        for (int i = 0; i < TOTALMAX_ALUM; i++) {
            double suma = 0;
            notaBaja = notas[i][0];
            notaAlta = notas[i][0];

            for (int j = 0; j < TOTALMAX_ASIG; j++) {
                double nota = notas[i][j];
                suma += nota;

                if (nota > notaAlta) {
                    notaAlta = nota;
                } else if (nota < notaBaja) {
                    notaBaja = nota;
                }
            }

        double media = suma / TOTALMAX_ASIG;
        System.out.println("→ Alumno " + (i + 1) + ": media = " + media +
                           ", nota más baja = " + notaBaja +
                           ", nota más alta = " + notaAlta);
        System.out.println("--------------------------------------");
        }

    teclado.close();
    }
}
