/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.ejercicio3;

/**
 *
 * @author Edu
 */
public class Principal_Operaciones_ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guia7.ejercicio3.Clase_Operaciones_ejercicio3 Respuesta = new Clase_Operaciones_ejercicio3();
        
        System.out.println("vamos a mostrar las operaciones aritmeticas");
        
        
        Respuesta.crearOperacion();
        System.out.println("la suma es " + Respuesta.sumar());
        System.out.println("la resta es " + Respuesta.restar());
        System.out.println("la multiplicacin " + Respuesta.multiplicar());
        System.out.println("la division es " + Respuesta.dividir());
        
        
        
        
        
    }
    
}
