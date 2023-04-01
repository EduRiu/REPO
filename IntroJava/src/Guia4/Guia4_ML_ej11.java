/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Guia4_ML_ej11 {

    /*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: 
cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
(incluyendo a las vocales acentuadas) se mantienen sin cambios.
aeiou
@#$%*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

     */
    public static void main(String[] args) {
       
       
      
       
        Scanner frase_i = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");

        String frase = frase_i.nextLine();

        Trans(frase);

        
    }

    public static void Trans (String frase) {

        frase = frase.replace("a", "@");
        frase = frase.replace("A", "@");
        frase = frase.replace("e", "#");
        frase = frase.replace("E", "#");
        frase = frase.replace("i", "$");
        frase = frase.replace("I", "#");
        frase = frase.replace("o", "%");
        frase = frase.replace("O", "#");
        frase = frase.replace("u", "*");
        frase = frase.replace("U", "*");

        System.out.println(frase);

            
        
    }
    
}
