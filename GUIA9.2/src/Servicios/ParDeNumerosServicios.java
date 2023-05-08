/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class ParDeNumerosServicios {

    private Scanner leer = new Scanner(System.in);
    ParDeNumeros objeto = new ParDeNumeros();

    /*
    Método mostrarValores que muestra cuáles son los dos números guardados.
     */
    public void mostrarNumeros() {

        System.out.println(objeto.getNum1());
        System.out.println(objeto.getNum2());
    }

    /*
    Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
     */
    public double devolverMayor() {

        double Maxretorno;
        /*
        if (objeto.getNum1() > objeto.getNum2()) {
            retorno = objeto.getNum1();
        } else {
            retorno = objeto.getNum2();

        }

         if (objeto.getNum1() == objeto.getNum2()) {

            mostrarNumeros();

        }
         */
        Maxretorno = Math.max(objeto.getNum1(), objeto.getNum2());
       
        return Maxretorno;
    }

    /*
    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
    Previamente se deben redondear ambos valores.
     */
    public double calcularPotencia() {

        double elevado = 0;

        double Min = Math.min(objeto.getNum1(), objeto.getNum2());

        elevado = Math.pow(devolverMayor(), Min);

        return Min;

    }

    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public double calculaRaiz() {

        double raiz = 0;

        raiz = Math.sqrt(Math.abs(calcularPotencia()));

        return raiz;
    }

}
