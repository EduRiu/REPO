/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.ejercicio2;

/**
 *
 * @author Edu
 */
public class Principal_Circunferencia_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //es necesario tener un constructor vacio para que esta linea no tire error
        
        Clase_Circunferencia_ejercicio2 Ingreso = new Clase_Circunferencia_ejercicio2();
       
        
        //ahora llamo a cada metodo
        //pondo primero el objeto creado " . " y el metodo para que me traiga lo que proceso
        
        Ingreso.crearCirfunferencia();
        Ingreso.area();
        Ingreso.perimetro();
        
    }
    
}
