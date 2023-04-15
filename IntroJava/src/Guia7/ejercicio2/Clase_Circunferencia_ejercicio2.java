/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Circunferencia_ejercicio2 {

    /*
    Declarar una clase llamada Circunferencia que tenga como atributo
    privado el radio de tipo real. A continuación, se deben crear los
    siguientes métodos:
     */
    private int radio;

    //constructo vacio para que no genere lio desde el main cuando
    //quiero crear el objeto
   public Clase_Circunferencia_ejercicio2() {
   }

    
    // a) Método constructor que inicialice el radio pasado como parámetro.
    public Clase_Circunferencia_ejercicio2(int radio) {
        this.radio = radio;
    }

    // b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    /*
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda
    en el atributo del objeto.
     */
    public void crearCirfunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");

        //aca hay que prestar atencion y poner el <setZ como la variable del mismo nombre
        //estamos inicializando
        
        this.setRadio(leer.nextInt());

    }

    /*
    d) Método area(): para calcular el área de la circunferencia (Area=〖
    π*radio〗^2).
     */

    public void area() {

        double area;
       
        System.out.println(radio + " radio");
        System.out.println(this.getRadio() + " this.getRadio()");
        System.out.println(this.radio + " this.");
        
      //  area = (radio * 3.14) * (this.getRadio() * 3.14);
        area = Math.PI*Math.pow(radio, 2);
        System.out.println("el area es " + area);

    }

    /*
    e) Método perimetro(): para calcular el perímetro
    (Perimetro=2*π*radio).
     */
    public void perimetro() {

        double perimetro;

        perimetro = 2 * 3.14 * this.radio;
        System.out.println("el perimeto es " + perimetro);

    }
}
