/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.NIFServicios;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        NIFServicios usuario = new NIFServicios();
        NIFServicios usuario1 = new NIFServicios();
        NIFServicios usuario2 = new NIFServicios();
        
        usuario.crearNif();
        usuario.mostrarNif();
        
        usuario1.crearNif();
        usuario1.mostrarNif();
        
        System.out.println("mostrar");
        usuario.mostrarNif();
        usuario1.mostrarNif();
        
      
      
       
        
        
    }
    
}
