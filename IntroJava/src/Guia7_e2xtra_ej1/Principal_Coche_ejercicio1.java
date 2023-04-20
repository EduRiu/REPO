/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_e2xtra_ej1;

/**
 *
 * @author Edu
 */
public class Principal_Coche_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guia7_e2xtra_ej1.Clase_Coche_ejercicio1 coche1 = new Guia7_e2xtra_ej1.Clase_Coche_ejercicio1();
        Guia7_e2xtra_ej1.Clase_Coche_ejercicio1 coche2 = new Guia7_e2xtra_ej1.Clase_Coche_ejercicio1();
        Guia7_e2xtra_ej1.Clase_Coche_ejercicio1 coche3 = new Guia7_e2xtra_ej1.Clase_Coche_ejercicio1();
        
      coche1.crearCoche();
      coche2.crearCoche();  
      coche3.crearCoche();
        
      coche1.mostrarCoche();
      coche2.mostrarCoche();
      coche3.mostrarCoche();
    }
    
}
