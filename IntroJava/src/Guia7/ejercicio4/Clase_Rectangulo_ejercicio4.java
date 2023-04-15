/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Rectangulo_ejercicio4 {

    /*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
     */
    private int base;
    private int altura;

    //contructor vacio
    public Clase_Rectangulo_ejercicio4() {
    }

    //constructor con atributos
    public Clase_Rectangulo_ejercicio4(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //GET-SET
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //METODO-OPERACIONES
    public void crearRectangulo() {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese la base");
        this.setBase(leer.nextInt());

        leer.nextLine();

        System.out.println("ingrese la altura");
        this.setAltura(leer.nextInt());

    }

    public void Superficie() {

        System.out.println("La superficie es " + (getAltura() * getBase()));
    }

    public void Perimetro() {

        System.out.println("El perimetro es " + ((getAltura() + getBase())) * 2);
    }

    public void Dibujo() {

        for (int i = 0; i < getAltura(); i++) {
            for (int j = 0; j < getBase(); j++) {

                if (i == 0 || i == getAltura() - 1 || j == 0 || j == getBase() - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" A ");
                }

            }
            System.out.println("  ");
        }

    }

}
