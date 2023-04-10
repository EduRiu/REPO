/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_extras;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class G5_extra4 {

    /*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos 
para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado 
cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

     */
    public static void main(String[] args) {
        System.out.println("cuantos alumnos quiere cargar?");
        Scanner leer = new Scanner(System.in);
        int largo = leer.nextInt();

        String[] alumno = new String[largo];
        double[] nota = new double[largo];

        ingresoalumno(alumno, nota, leer);
        mostrar(alumno, nota);
        int retorno = aprobado(nota);

        System.out.println("la cantidad de alumnos aprobados es " + retorno + " los desaprobados son " + (largo - retorno));
    }

    //ingreso alumnos y notas, ademas ya saco el promedio
    public static void ingresoalumno(String[] alumno, double[] nota, Scanner leer) {

        double ptpe = 0.0;
        double stpe = 0.0;
        double pi = 0.0;
        double si = 0.0;
        double calificacion = 0.0;
        int contador = 0;

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("ingrese el alumno " + i);
            alumno[i] = leer.next();

            System.out.println("ingrese la nota para primer trabajo evaluativo");
            ptpe = leer.nextInt();
            ptpe = ptpe * .10;
            System.out.println("ingrese la nota para segundo trabajo evaluativo");
            stpe = leer.nextInt();
            stpe = stpe * .15;
            System.out.println("ingrese la nota para el primer integrador");
            pi = leer.nextInt();
            pi = pi * .25;
            System.out.println("ingrese la nota para el segundo integrador");
            si = leer.nextInt();
            si = si * .5;
            calificacion = (si + pi + stpe + ptpe);
            nota[i] = calificacion;
            System.out.println("nota obtenida " + calificacion);

        }

    }

    // muestro el alumno y la nota final
    public static void mostrar(String[] alumno, double[] nota) {
        /* for (String e_alumno : alumno) {
            System.out.println(e_alumno);
        }
        for (double e_nota : nota) {
            System.out.println("{" + e_nota + "}");

        }*/

        for (int i = 0; i < alumno.length; i++) {

            System.out.println("el alumno" + alumno[i] + " obtuvo nota final " + nota[i]);
        }
    }

    //devuelvo cuantas fueron aprobados
    public static int aprobado(double[] nota) {

        int contador = 0;
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= 7) {
                contador++;
            }
        }

        return contador;
    }

}
