/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_e2xtra_ej2;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Estudiante_ej2 {

    /*
Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y 
otro para mostrar por pantalla los estudiantes que tienen una nota media.
     */
    private String nombre;
    private int edad;
    private double notaMedia;

    public Clase_Estudiante_ej2() {
    }

    public Clase_Estudiante_ej2(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void calcularMedia() {

        System.out.println("¿cuantos alumnos va a ingresar?");
        Scanner leer = new Scanner(System.in);

        int n = leer.nextInt();
        double suma = 0;
        int contador = 0;
        double promedio = 0;

        double[] notaMedia = new double[n];
        String[] nombreEstudiante = new String[n];

        for (int i = 0; i < notaMedia.length; i++) {

            System.out.println("ingrese el nombre del estudiante");
            this.nombre = leer.nextLine();
            nombreEstudiante[i] = this.nombre;
            leer.nextLine();

            System.out.println("ingrese la edad de estudiante");
            this.edad = leer.nextInt();

            System.out.println("ingrese la nota media");
            this.notaMedia = leer.nextInt();

            notaMedia[i] = this.notaMedia;

            suma = (suma + this.notaMedia);

            promedio = suma / n;
        }

        for (int i = 0; notaMedia.length > i; i++) {

            if (notaMedia[i] >= promedio) {
                contador++;
            }

        }

        System.out.println("el promedo es " + promedio);
        System.out.println("la cantidad de alumnos que superan la media es " + contador++);

    }

}
