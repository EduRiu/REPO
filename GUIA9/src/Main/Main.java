/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.CadenaServicios;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicios frase = new CadenaServicios();
        
        frase.crearFrase();
        //frase.mostarVocales();
        //frase.invertirFrse();
        //frase.vecesRepetido();
        //frase.compararLongitud();
        //frase.reemplazarLetra();
        frase.contieneLetra();

  
    
}
}