/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Meses;
import Servicios.MesesServicios;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MesesServicios objeto = new MesesServicios();
        Meses juego = new Meses();
        
        objeto.juegoNuevo(juego);
    }
    
}
