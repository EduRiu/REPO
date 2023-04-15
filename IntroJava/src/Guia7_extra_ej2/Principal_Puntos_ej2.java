/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_extra_ej2;

/**
 *
 * @author Edu
 */
public class Principal_Puntos_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //creo el objeto Puntos
        Guia7_extra_ej2.Clase_Puntos_ej2 Puntos = new Guia7_extra_ej2.Clase_Puntos_ej2();
        
        double retorno;
        
        Puntos.crearPuntos();
        
        retorno = Puntos.sumarDistancia();
        
        System.out.println("la distancia es " + retorno);
        
    }
    
}
