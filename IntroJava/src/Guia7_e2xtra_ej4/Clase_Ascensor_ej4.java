/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_e2xtra_ej4;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Ascensor_ej4 {

    /*
    
4) Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado 
el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir 
y que modifique la propiedad "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. 
Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, 
y mostrando en pantalla el piso actual después de cada movimiento.
    
     */
    private int pisoActual = (int) (Math.random() * 10);
    private int pisoMaximo = 10;
    private int eleccion;

    public Clase_Ascensor_ej4() {
    }

    public Clase_Ascensor_ej4(int pisoActua, int pisoMaximo) {
        this.pisoActual = pisoActua;
        this.pisoMaximo = pisoMaximo;
    }

    public int getPisoActua() {
        return pisoActual;
    }

    public void setPisoActua(int pisoActua) {
        this.pisoActual = pisoActua;
    }

    public int getPisoMaximo() {
        return pisoMaximo;
    }

    public void setPisoMaximo(int pisoMaximo) {
        this.pisoMaximo = pisoMaximo;
    }

    public void subirPiso() {

        do {

            if (pisoActual >= pisoMaximo) {
                System.out.println("esta en el piso superior");
                break;
            } else {
                pisoActual++;
                System.out.println("SUBIENDO ˄ " + pisoActual);
            }
        } while (pisoActual < eleccion);

        System.out.println("<-- AHORA ESTA EN EL PISO" + pisoActual);
        irA();

    }

    public void bajarPiso() {

        do {
            if (pisoActual <= 0) {
                System.out.println("esta en planta baja");
                break;
            } else {
                pisoActual--;
                System.out.println("BAJANDO ˅ " + pisoActual);

            }

        } while (pisoActual > eleccion);

        System.out.println("<-- AHORA ESTA EN EL PISO" + pisoActual);
        irA();
    }

    public void irA() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Piso Actual " + pisoActual);
        System.out.println("-------------------------");

        System.out.println("Seleccionar piso");

        eleccion = leer.nextInt();

        if (eleccion > pisoActual) {

            subirPiso();

        } else if (eleccion < pisoActual) {
            bajarPiso();
        } else {
            System.out.println("Selecciono el mismo piso que el actual");
        }

    }

}
