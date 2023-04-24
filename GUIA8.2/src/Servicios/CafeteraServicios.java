/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidad.Cafetera;

/**
 *
 * @author Edu
 */
public class CafeteraServicios {

    Cafetera cafe = new Cafetera();
    Scanner leer = new Scanner(System.in);

    /*
    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
     */
    public void llenarCafetera() {

        cafe.setCantidadActual(cafe.getCapacidadMaxima());

        System.out.println("la capacidad maxima de la cafetera es  " + cafe.getCapacidadMaxima() + "mm3");
        System.out.println("llenando cafetera");
        System.out.println("la capidad actual de la cafetera es " + cafe.getCantidadActual() + "mm3");
    }

    /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
    simula la acción de servir la taza con la capacidad indicada. 
    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
    El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
     */
    public void servirTaza() {

        System.out.println("ingrese el tamaño de la taza expresado en mm3");
        System.out.println("TAZA GRANDE = 500 mm3");
        System.out.println("TAZA MEDIA = 300 mm3");
        System.out.println("TAZA CHICA = 150 mm3");

        int taza = leer.nextInt();

        if (taza > cafe.getCantidadActual()) {
            System.out.println("la capacidad de cafe no llena la taza");
            System.out.println("su taza quedo a " + (taza - cafe.getCantidadActual()) + " de ser llenada");

        } else {
            System.out.println("Taza llena");
            cafe.setCantidadActual(taza - cafe.getCantidadActual());
        }

    }

    /*
           Método vaciarCafetera(): pone la cantidad de café actual en cero. 
     */
    public void vaciarCafetera() {

        cafe.setCantidadActual(0);
        System.out.println("cafe es " + cafe.getCantidadActual());
        
    }

    
    /*
    Método agregarCafe(int): se le pide al usuario una cantidad de café, 
    el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    */
    
    public void agregarCafe(){
        
        System.out.println("Cuanto cafe agrega?");
        int agrega = leer.nextInt();
        
        agrega = agrega + cafe.getCantidadActual();
        
        if (cafe.getCapacidadMaxima()>agrega) {
            
            System.out.println("la cantidad actual de cafe es " + agrega);
            
        }
        else
        {
            System.out.println("sobrepasa la capacidad de la cafetera");
        }
        
    }
    
    
    
}
