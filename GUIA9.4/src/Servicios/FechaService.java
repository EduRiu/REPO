/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNaciemiento() {

        Date usuario;

        System.out.println("ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("ingrese su anio de nacimiento");
        int anio = leer.nextInt();
        
        
        return new Date(anio, mes, dia);
        
    }

    public Date fechaActual() {

        Date fechaActual = new Date();
             
        return fechaActual;
    }

    public int diferencia(){
        
               
        int anioActual = fechaActual().getYear()+1900;
        int diferencia = anioActual -  (fechaNaciemiento().getYear());
        
        System.out.println("la diferencia en años es " + diferencia + " años");
        return diferencia;
        
        
    }
    
}
