/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class CursoServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Curso a = new Curso();
    
    public void  cargarAlumnos(Curso alumnos){
        
        String [] nomina = new String [5];
        
        for (int i = 0; i < nomina.length; i++) {
            
            System.out.println("Ingrese el nombre de los alumnos");
            
            nomina [i] = leer.nextLine();
            
            alumnos.setAlumnos(nomina);

        }
        
      
        
    }
    
    
     public void crearCurso(Curso alumnos){
       
         System.out.println("ingrese el nombre del curso");
         alumnos.setNombreCurso(leer.nextLine());
         System.out.println("ingrese la cantidad de horas por dia");
         alumnos.setCantidadHorasDiarias(leer.nextInt());
         System.out.println("ingrese la cantidad de dias a la semana");
         alumnos.setCantidadDiasSemananal(leer.nextInt());
         System.out.println("ingrese el turno");
         leer.nextLine();
         alumnos.setTurno(leer.nextLine());
         System.out.println("ingrese precio por hora");
         alumnos.setPrecioHora(leer.nextInt());
         leer.nextLine();
         cargarAlumnos(alumnos);
         } 

     public double calcularGanancias(Curso alumnos){
         
         double retorno = alumnos.getCantidadDiasSemananal() * alumnos.getCantidadHorasDiarias() * alumnos.getPrecioHora();
         return retorno;
         
     }
     
}
