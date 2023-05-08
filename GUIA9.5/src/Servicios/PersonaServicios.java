/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class PersonaServicios {

    Scanner leer = new Scanner(System.in);

    /*
    Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.
     */
    Persona obj = new Persona();

    public Persona crearPersona() {

        Persona persona = new Persona();

        System.out.println("ingrese su nombre y apellido");
        persona.setNombre(leer.nextLine());

        System.out.println("ingrese dia");
        int dia = leer.nextInt();

        System.out.println("ingrese mes");
        int mes = leer.nextInt()-1;

        System.out.println("ingrese anio");
        int anio = leer.nextInt() - 1900;

        persona.setFechaNacimiento(new Date(anio, mes, dia));
        
        return persona;

    }

    /*
    Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
     */
    public int calcularEdad(Persona persona) {

        persona.getFechaNacimiento();

        Date fechaActual = new Date();
               
        int diaA = fechaActual.getDay() - persona.getFechaNacimiento().getDay();
        System.out.println(diaA + "dia");
        int mesA = fechaActual.getMonth() - persona.getFechaNacimiento().getMonth();
        System.out.println(mesA + "mes");
        int anioA = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
        System.out.println(anioA + "año");
        //System.out.println(dia + " " + mes + " " + anio);
        if (mesA < 0 || (mesA == 0 && diaA < 0)) {

            return anioA - 1;
        } else {
            return anioA;
        }

    }

    /*
    Método menorQue recibe como parámetro una Persona y una edad. 
    Retorna true si la persona es menor que la edad consultada o false en caso contrario.
     */
    public boolean menorQue(Persona persona, int edad) {

        boolean respuesta = true;

        if (persona.getFechaNacimiento().getYear() < edad) {
            respuesta = true;
        } else {
            respuesta = false;
        }

        return respuesta;
    }

    public void mostrarPersona (Persona persona){
        
        persona.getFechaNacimiento();
        
        System.out.println(persona.toString());
        System.out.println("el nombre es: " + persona.getNombre());
        
        System.out.println("la fecha de naciemiento es " + persona.getFechaNacimiento().getDay() + "/" + persona.getFechaNacimiento().getMonth() + "/" + persona.getFechaNacimiento().getYear());
        
    }
    
}
