/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidad.Persona;

/**
 *
 * @author Edu
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Entidad.Persona persona = new Entidad.Persona();

    /*
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
    y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
    Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    */

    public void crearPersona() {

        System.out.println("ingrese el nombre de la persona");
        persona.setNombre(leer.nextLine());

        System.out.println("ingrese la edad de " + persona.getNombre());
        persona.setEdad(leer.nextInt());

        System.out.println("ingrese el sexo de " + persona.getNombre());
        System.out.println("H - hombre");
        System.out.println("M - mujer");
        System.out.println("O - otros");

        String eleccion = leer.next();

        if (eleccion.equals("H")) {
            persona.setSexo("hombre");

        } else if (eleccion.equals("M")) {
            persona.setSexo("mujer");

        } else {
            persona.setSexo("otros");
        }

        System.out.println("ingrese la altura de " + persona.getNombre());
        persona.setAltura(leer.nextDouble());
        
        System.out.println("ingrese el peso de " + persona.getNombre());
        persona.setPeso(leer.nextDouble());
    }

    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    */
        public boolean esMayorEdad(){
         
         boolean respuesta = true;
        
            if (persona.getEdad()<18) {
                respuesta = false;
            }
         
         return respuesta;
        } 

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y 
    la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor 
    que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
    */

        
      public int calcularIMC(){
          
          int respuesta = 0;
          double indice;
          
          indice = persona.getPeso()*(Math.pow(persona.getAltura(), 2));
         
          
          if (indice <= 20) {
              respuesta = 0;
              
          }
          
          if (indice >20 && indice < 25){
              respuesta = -1;
          }
          
           if ( indice <= 25){
              respuesta = 1;
          }
          
          return respuesta;
      }  
   
}
