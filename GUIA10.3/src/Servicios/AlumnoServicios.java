/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class AlumnoServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> alumnoNuevo = new ArrayList<>();

    public void cargarAlumno() {
        boolean seguir = false;

        do {

            System.out.println("ingrese el nombre del alumno");

            String alumno = leer.nextLine();

            ArrayList<Integer> tresNotas = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese la nota: " + (i + 1));
                tresNotas.add(leer.nextInt());
            }

            alumnoNuevo.add(new Alumno(alumno, tresNotas));

            leer.nextLine();
            
            System.out.println("desea cargar otro alumno?");

            if (!"s".equals(leer.nextLine())) {
                seguir = false;
            } else {
                seguir = true;
            }

        } while (seguir);

    }

    public double notaFinal() {
        int suma = 0;
        double promedio = 0;

        System.out.println("que alumno desea calcular el promedio?");
        
        String buscaAlumno = leer.nextLine();

        Iterator<Alumno> busqueda = alumnoNuevo.iterator();
        //A TENER EN CUENTA... CON EL INTERADOR, PARA ACCEDER AL DATO, SE NECESITA EL NEXT y el GET

        while (busqueda.hasNext()) {
            
            Alumno aux = busqueda.next();
           
            if (aux.getAlumno().equals(buscaAlumno)) {
               
                for (Integer nota : aux.getNotas()) {
                    suma += nota;
                }
                
            }

           promedio = suma / aux.getNotas().size(); 

        }

        return promedio;
    }

}
