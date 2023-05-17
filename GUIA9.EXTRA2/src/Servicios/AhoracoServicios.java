/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class AhoracoServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String ingreso;
    int contadorIntentos = 0;

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
    Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
     */
    public void crearJuego(Ahorcado carga) {

        System.out.println("JUEGO DE AHORCADO");
        System.out.println("ingrese una palabra");
        String palabra = leer.nextLine();
        System.out.println("ingrese la cantidad de jugadas");
        int veces = leer.nextInt();

        char [] auxiliar = new char [palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            auxiliar[i] = palabra.charAt(i);

        }
        
        carga.setPalabraBuscada(auxiliar);
        carga.getPalabraBuscada().toString();
        carga.setPartidas(veces);
        contadorIntentos++;

    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length.
    */
    
    //public int longitud(Ahorcado carga)

    
    
}
