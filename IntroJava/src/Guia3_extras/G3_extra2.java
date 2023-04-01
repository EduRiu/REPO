/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_extras;

/**
 *
 * @author Edu
 */
public class G3_extra2 {

    /**
       Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
     * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, 
     * A tome el valor de D y D tome el valor de B. 
     * Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("las variables son");
        
        int a = 10;
        int b = 05;
        int c = 86;
        int d = 12;
        
        System.out.println("las variables son");
        System.out.println("a " + a + " b " + b + " c " + " d " + d);

        a = d;
        b = c;
        c = a;
        d = b;
        
        System.out.println("las nuevas variables son ");
        System.out.println("a " + a + " b " + b + " c " + " d " + d);
    }
    
}
