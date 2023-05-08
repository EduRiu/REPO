/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class CadenaServicios {

    Scanner leer = new Scanner(System.in);
    Cadena cadena = new Cadena();

    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
     */
    public void crearFrase() {
        System.out.println("ingrese una frase");
        cadena.setFrase(leer.nextLine());
    }

    public int mostarVocales() {

        String mayuscula = cadena.getFrase().toUpperCase();
        int contador = 0;
        for (int i = 0; i < mayuscula.length(); i++) {

            if ((mayuscula.substring(i, i + 1)).equals("A")
                    || (mayuscula.substring(i, i + 1)).equals("E")
                    || (mayuscula.substring(i, i + 1)).equals("I")
                    || (mayuscula.substring(i, i + 1)).equals("O")
                    || (mayuscula.substring(i, i + 1)).equals("U")) {
                contador++;
            }

        }

        return contador;
    }

    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrse() {

        for (int i = cadena.getFrase().length(); i > 0; i--) {
            System.out.print(cadena.getFrase().substring(i - 1, i));
        }

    }

    /*
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

     */
    public int vecesRepetido() {
        int contador = 0;
        System.out.println("Que caracter quiere buscar");
        String letra = leer.next();

        for (int i = 0; i < cadena.getFrase().length(); i++) {

            if (cadena.getFrase().substring(i, i + 1).equals(letra)) {
                contador++;
            }

        }
        System.out.println("se repite: " + contador);
        return contador;
    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la 
    frase que compone la clase con otra nueva frase ingresada por el usuario
     */
    public boolean compararLongitud() {
        boolean retorno;
        System.out.println("ingrese una frase para comparar");
        String frase = leer.nextLine();

        if (cadena.getFrase().length() == frase.length()) {
            retorno = true;
        } else {
            retorno = false;
        }

        System.out.println(retorno);
        return retorno;
    }

    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase 
    Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrase() {

        System.out.println("ingrese una frase");
        String frase = leer.nextLine();

        System.out.println(cadena.getFrase() + " " + frase);

    }

    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
     */

    public void reemplazarLetra() {

        String[] vector = new String[cadena.getFrase().length()];
        System.out.println("ingrese letra que va a reemplzar por la 'a' ");
        String letra = leer.next();

        for (int i = 0; i < cadena.getFrase().length(); i++) {

            vector[i] = cadena.getFrase().substring(i, i + 1);

            if (vector[i].equals("a")) {
                vector[i] = letra;
            }
        }

        for (int i = 0; i < cadena.getFrase().length(); i++) {

            System.out.print(vector[i]);
        }

    }

    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa 
    el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contieneLetra() {
        boolean retorno = false;
       int contador = 0;
        String[] vector = new String[cadena.getFrase().length()];
        System.out.println("ingrese la letra que desea buscar");
        String letra = leer.nextLine();

        for (int i = 0; i < cadena.getFrase().length(); i++) {

            vector[i] = cadena.getFrase().substring(i, i + 1);

            if (vector[i].equals(letra)) {
                retorno = true;
                contador++;
                break;
                
            }

        }
        System.out.println("tiene la letra: " + letra + "? --->  " + retorno);
        return retorno;
    }

}
