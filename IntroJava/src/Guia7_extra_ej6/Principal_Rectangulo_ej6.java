/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_extra_ej6;

/**
 *
 * @author Edu
 */
public class Principal_Rectangulo_ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guia7_extra_ej6.Clase_Rectangulo_ej6 Rectangulo1 = new Guia7_extra_ej6.Clase_Rectangulo_ej6(0, 0);
        
        //yo asigne los numero en la clase
        Rectangulo1.calcular_area(0, 0);
        
        //aca los puse directo como parametros      
        Rectangulo1.calcular_vacio_area(4, 6);
        
        
        
    }
    
}
