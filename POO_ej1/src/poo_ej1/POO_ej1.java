/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej1;

import poo_ej1.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class POO_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        crearpersona();
      
        
    }
    public static void crearpersona()
    {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        p1.nombre = leer.next();
        p1.apodo = leer.next();
        p1.documento = leer.nextInt();
        p1.edad = leer.nextInt();
        p1.nacionalidad = leer.next();
        
        
        
    }
    
    public static void mostrarperona(Scanner leer){
        
        System.out.println("Ingrese un mensaje de bienvenida");
        
        
        String mensaje = leer.nextLine();
    }

   
    
}
