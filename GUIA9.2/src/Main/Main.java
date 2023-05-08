/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.ParDeNumerosServicios;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParDeNumerosServicios objeto = new ParDeNumerosServicios();
        
        
        objeto.mostrarNumeros();
        System.out.println("el mayor es " + objeto.devolverMayor());
        System.out.println("la potencia es " + objeto.calcularPotencia() );
        System.out.println("la raiz es "  + objeto.calculaRaiz() );
        
        
        
    }
    
}
