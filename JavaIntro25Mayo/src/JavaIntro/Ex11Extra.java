/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntro;

import java.util.Scanner;

public class Ex11Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numAlumnos = 2;
        double[] promedios = new double[numAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numAlumnos; i++) {
            double promedio = 0.0;

            // Obtener las notas del alumno
            System.out.println("Alumno " + (i + 1));
            System.out.print("Primer trabajo práctico evaluativo: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Segundo trabajo práctico evaluativo: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Primer integrador: ");
            double nota3 = scanner.nextDouble();
            System.out.print("Segundo integrador: ");
            double nota4 = scanner.nextDouble();

            // Calcular el promedio ponderado
            promedio = nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5;

            // Guardar el promedio en el arreglo
            promedios[i] = promedio;

            // Verificar si el alumno aprobó o desaprobó
            if (promedio >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Imprimir resultados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

        scanner.close();
        }
        
    }