/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Alumno;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class AlumnoServicios {

    Scanner leer = new Scanner(System.in);
    Alumno alumno = new Alumno();

    
    //INGRESO LOS DATOS DEL ALUMNO
    public void cargarAlumno() {

        System.out.println("ingrese el nombre del alumno");
        alumno.setNombre(leer.nextLine());

        System.out.println("ingrese la nota");
        alumno.setNota(leer.nextDouble());
        leer.nextLine();

    }

    //ARMO ESTE METODO PARA ACCEDER A LA NOTA
    public double promedioNota() {
        double suma = alumno.getNota();
        return suma;
    }
    //ARMO ESTE METODO PARA ACCEDER AL NOMBRE
    public String alumnoA() {
        String retorno = alumno.getNombre();
        return retorno;
    }

    //ESTE METODO ME ARMA PRIMERO UN VECTOR DE OBJETOS
    //ESTE VECTOR CREA OBJETOS TIPO "FOR"
    
    public void resumen() {
        
        System.out.println("cuantos alumnos va a ingresar?");
        
        int t = leer.nextInt();
        int contador = 0;
        AlumnoServicios[] carga = new AlumnoServicios[t];

        for (int i = 0; i < carga.length; i++) {

            carga[i] = new AlumnoServicios();

            //ACA PARA CADA OBJETO LLAMA AL METODO CARGAALUMNO
            carga[i].cargarAlumno();

        }
        
        //SUMA LAS NOTAS
        double suma = 0;
        for (int i = 0; i < carga.length; i++) {
            suma += carga[i].promedioNota();
        }

        double promedio = suma / t;

        System.out.println("el promedio es: " + promedio);
        
        //ME SACA LA CANTIDAD DE NOTAS SUPERA... PARA ARMAR EL VECTOR DEL LOS ALUMNOS
        for (int i = 0; i < carga.length; i++) {

            if (promedio <= carga[i].promedioNota()) {
                contador++;
            }
            System.out.println(contador);
        }
        //ACA ARMO LA ESTRUCTURA PARA EL VECTOR DE NOMBRES
        String[] nombre = new String[contador];
        int a = 0;

        for (int i = 0; i < carga.length; i++) {

            if (promedio <= carga[i].promedioNota()) {
               
                nombre[a] = carga[i].alumnoA();

            }
            a++;
        }
        
        //MUESTRA EL VECTOR CON NOMBRES
        for (int i = 0; i < nombre.length; i++) {
            
                System.out.print(nombre[i]);
            if (i < nombre.length) {
                System.out.print(" - ");
            }
 
            if (i == nombre.length-1) {
                System.out.print(" : ");
            }
         }
            if (contador == 1) {
                System.out.print("APROBADO");
            } else if (contador > 1) {
                System.out.print("APROBADOS");
            } else {
                System.out.print("NO HAY APROBADOS");
            }

        }

    }
