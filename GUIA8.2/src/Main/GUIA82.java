/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.CafeteraServicios;

/**
 *
 * @author Edu
 */
public class GUIA82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraServicios cafe = new CafeteraServicios();
        
        
        cafe.llenarCafetera();
        cafe.servirTaza();
        cafe.vaciarCafetera();
        cafe.agregarCafe();
        
        
    }
    
}
