/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5_extras;
import java.util.Scanner;
/**
 *
 * @author Edu
 */



/**
 *
 * @author Gerardo Construya un programa que lea 5 palabras de m�nimo 3 y hasta
 * 5 caracteres y, a medida que el usuario las va ingresando, construya una
 * �sopa de letras para ni�os� de tama�o de 20 x 20 caracteres. Las palabras se
 * ubicar�n todas en orden horizontal en una fila que ser� seleccionada de
 * manera aleatoria. Una vez concluida la ubicaci�n de las palabras, rellene los
 * espacios no utilizados con un n�mero aleatorio del 0 al 9. Finalmente imprima
 * por pantalla la sopa de letras creada. Nota: Para resolver el ejercicio
 * deber� investigar c�mo se utilizan las siguientes funciones de Java
 * substring(), Length() y Math.random().
 */
public class Ejercicio6 {

// Tama�o de la sopa de letras
    static final int TAMANIO = 20;

    public static void main(String[] args) {
        // Crear la sopa de letras vac�a
        char[][] sopa = new char[TAMANIO][TAMANIO];
        // Cargar las palabras y letras en la sopa de letras
        cargarSopa(sopa);
        // Imprimir la sopa de letras en la consola
        imprimirMatriz(sopa);
    }

    private static void cargarSopa(char[][] sopa) {

        // Se cargan las palabras ingresadas por el usuario en la sopa de letras
        cargarPalabras(sopa);
        // Se inicializa la sopa de letras con caracteres aleatorios
        inicializarSopa(sopa);
    }

    private static void cargarPalabras(char[][] sopa) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int random;
        int ingreso = 0;
        // Se recorre la sopa de letras de forma no lineal, avanzando en bloques de tama�o aleatorio
        for (int i = 0; i < sopa.length; i += (int) (Math.random() * 4) + 1) {
            // Se permite al usuario ingresar un m�ximo de 5 palabras
            if (ingreso < 5) {
                System.out.println("Ingrese una palabra");
                // Se lee la palabra ingresada por el usuario
                palabra = leer.next();
                // Se valida que la longitud de la palabra est� entre 3 y 5 caracteres
                while ((palabra.length() < 3) || (palabra.length() > 5)) {
                    System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                    palabra = leer.next();
                }
                // Se selecciona una posici�n aleatoria para colocar la palabra en la sopa de letras
                random = (int) (Math.random() * 14) + 1;
                // Se coloca la palabra en la sopa de letras en la posici�n seleccionada
                for (int j = 0; j < palabra.length(); j++) {
                    sopa[i][random + j] = palabra.toLowerCase().charAt(j);
                }
                // Se incrementa el contador de palabras ingresadas
                ingreso++;
            }
        }
    }

// Inicializa la matriz sopa con caracteres aleatorios del 0 al 9
    private static void inicializarSopa(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                if (sopa[i][j] == '\u0000') {
                    sopa[i][j] = String.valueOf((Math.random() * 9)).charAt(0);
                }
            }
        }
    }

// Imprime la matriz
    public static void imprimirMatriz(char[][] matriz) {
        // Recorre las filas
        for (int i = 0; i < matriz.length; i++) {
            // Recorre las columnas
            for (int j = 0; j < matriz[0].length; j++) {
                // Imprime el valor de la celda
                System.out.print("[" + matriz[i][j] + "]");
            }
            // Salto de l�nea para separar las filas
            System.out.println("");
        }
    }

}