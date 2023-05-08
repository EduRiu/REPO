/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Curso;
import Servicios.CursoServicios;
import java.util.Arrays;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Curso alumnos = new Curso();
        
        CursoServicios objeto = new CursoServicios();
      
        objeto.crearCurso(alumnos);
        System.out.println("Por el curso" + alumnos.getNombreCurso() +  "cobra: " + objeto.calcularGanancias(alumnos) + " pesos");  
      
        System.out.println(" Los alumnos que asisten son" + Arrays.toString(alumnos.getAlumnos()));
        

       
        
        
       
       
     
        
    }
    
}
