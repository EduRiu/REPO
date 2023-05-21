/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * 1. Diseñar un programa que lea una serie de valores numéricos enteros
     * desde el teclado y los guarde en un ArrayList de tipo Integer. La lectura
     * de números termina cuando se introduzca el valor -99. Este valor no se
     * guarda en el ArrayList. A continuación, el programa mostrará por pantalla
     * el número de valores que se han leído, su suma y su media (promedio).
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int aux;
       
        int suma=0;
        do {

            System.out.println("ingrese un numero");
            aux = leer.nextInt();

            if (aux == -99) {
                break;

            } else {
                lista.add(aux);
            }

        } while (true);
        
        for (Integer integer : lista) {
            
            suma += integer;
        }
        for (Integer integer : lista) {
            System.out.print(integer + " ");
        }
        System.out.println("la suma de los: " + lista.size() + "es: ");
        System.out.println("el promedio es: " + (suma/lista.size()));
        
    }

}
