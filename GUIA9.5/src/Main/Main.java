/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Persona;
import Servicios.PersonaServicios;
import java.util.Scanner;
/**
 *
 * @author Edu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //instancias -- (linkear)
        PersonaServicios obj = new PersonaServicios();
        
        
        //craer dentro del entidad >objetos<
        //obtengo los datos parametros del ENTIDAD con los metodos del SERVICIO
        Persona persona = obj.crearPersona();
       
        
        System.out.println(obj.calcularEdad(persona)); 
        System.out.println("ingrese una edad");
        int edad = leer.nextInt();
        System.out.println("la persona es menor?" + obj.menorQue(persona, edad));
        obj.mostrarPersona(persona);
        

        
    }
}
