/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_extras;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class G5_extra6 {

    /*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y a medida que el usuario 
    las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
    Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
    Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
    Finalmente imprima por pantalla la sopa de letras creada.
    NotaPara resolver el ejercicio deberá investigar cómo se utilizan 
    las siguientes funciones de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[][] matriz = new String[20][20];

        System.out.println("cuantas palabras vas a ingresar?");
        int cantidad = leer.nextInt();
        String[] palabra = new String[cantidad];
        int[] random = new int[cantidad];
        String[] caracter = new String[5];

        matrizveinteporveinte(matriz, leer);
        //mostrar(matriz);
        generarvector(palabra, leer, cantidad);
        //mostrarvector(palabra);
        //crearvectorrandom(random, cantidad);
        //crearpalabraavector(palabra, cantidad, caracter);
        combinar(matriz, palabra, cantidad);
        mostrar(matriz);

    }

    //creo la matriz de 20 x 20
    //uso Integer.toString para convertir a enteros para poder sumar string
    public static void matrizveinteporveinte(String[][] matriz, Scanner leer) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = Integer.toString((int) (Math.random() * 10));
            }
        }
    }

    //muestro la matriz de 20 x 20
    public static void mostrar(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }

    //genero el vector con las palabras ingresadas con la comprobacion
    public static void generarvector(String[] palabra, Scanner leer, int cantidad) {
        System.out.println("INGRESE LAS PALABRAS");
        for (int i = 0; i < palabra.length; i++) {

            boolean salida = true;
            do {
                palabra[i] = leer.next();
                palabra[i] = palabra[i].toUpperCase();
                if (palabra[i].length() <= 5 && palabra[i].length() >= 3) {
                    System.out.println("palabra " + i + " ingresada correctamente");
                    salida = false;
                } else {
                    System.out.println("la palabra no cumple con los requisitos");
                }
            } while (salida);

        }
    }
    //muestro el vector generado (NO LO USO)
    public static void mostrarvector(String[] palabra) {
        for (String elemento : palabra) {
            System.out.println("{" + elemento + "}");
        }
    }
    //creo un vector random para las posiciones (NO LO USO)(descarte esta idea)
    public static void crearvectorrandom(int[] random, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            random[i] = (int) (Math.random() * 10);
            Arrays.sort(random);

        }

        for (int elementos : random) {
            System.out.println("( " + elementos + " )");
        }
    }

    //aca intente crea un vector con las letras de la palabra
    //casa --> caracter[a]{c,a,s,a} (NO LO USO) (descarte esta idea)    
    public static void crearpalabraavector(String[] palabra, int cantidad, String[] caracter) {
        int a = 0;
        do {
            int p = 0;
            p = palabra[a].length();

            a++;

            for (int i = 0; i < p; i++) {
                caracter[i] = palabra[i].substring(i, i++);
            }
        } while (cantidad > a);

        for (String elemento : palabra) {
            System.out.println(elemento);
        }
    }

    //busco con numero random la cardinalidad de la matriz (5,4) e igualo a la palabra del vector
    //dejo fijo x e incremento y en uno para desplazarme en forma horizontal
    public static void combinar(String[][] matriz, String[] palabra, int cantidad) {

        //int x = (int) (Math.random() * 10);
        //int y = (int) (Math.random() * 10);
        int i = 0;

        for (int a = 0; a < cantidad; a++) {
           
            int contador = 0;
          
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            
            
            int c = 0;
            int d = 1;
           
            do {
                
                System.out.println("palabra " + palabra[a]);
                matriz[x][y] = palabra[a].substring(c, d);
                y++;
                System.out.println(x + " " + y);
                System.out.println(" ");
               // System.out.println("i" + i);
                contador++;
               // System.out.println("contador" + contador);
                c = c + 1;
                d++;
            } while (palabra[a].length() > contador);

        }

    }
}
