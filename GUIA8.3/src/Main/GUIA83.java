/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class GUIA83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       PersonaServicio cargar = new PersonaServicio();
       
       cargar.cargarPersona();
               
        
        
        /*
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("cuantos personas creas");
        n = leer.nextInt();
        
        //armo el vector
        PersonaServicio [] persona = new PersonaServicio [n];
        
        //corro el for
       
        for (int i = 0; i < persona.length; i++) {
            persona[i] = new PersonaServicio();
            
            persona[i].crearPersona();
                              
        }
        int contador0 = 0;
        int contador1 = 0;
        int contadormenos1 = 0;
        int contadormayor = 0;
        
        int [] cantidadIMC = new int [n];
        
        for (int i = 0; i < cantidadIMC.length; i++) {
            
            if(persona[i].calcularIMC()== 0)
            {
             contador0++;   
            }
            if (persona[i].calcularIMC()== 1) {
                contador1++;
            }
            if (persona[i].calcularIMC()== -1) {
                contadormenos1++;
            }
        }
        
        System.out.println("Indice 0: " + contador0 + " en porcentaje son " + (100*contador0)/n);
        System.out.println("Indice 1: " + contador1  + " en porcentaje son " + (100*contador1)/n);
        System.out.println("Indice -1: " + contadormenos1 + " en porcentaje son " + (100*contadormenos1)/n);
        
        for (int i = 0; i < persona.length; i++) {
            
            
            if(persona[i].esMayorEdad() == true)  {
                contadormayor++;
            }
                    
        }
        
        System.out.println("hay" + contadormayor++ + " mayores");
        
       */ 
        // ------------------------------------------------------ hasta aca anda
        /*
        PersonaServicio persona = new PersonaServicio();
        persona.crearPersona();
        int retornoIMC = persona.calcularIMC();
        System.out.println("el IMC es:" + retornoIMC);
        boolean retornoEdad = persona.esMayorEdad();
        System.out.println("la persona es mayor?" + retornoEdad);
        */
      
    }

}
