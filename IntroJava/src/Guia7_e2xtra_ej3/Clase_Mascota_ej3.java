/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_e2xtra_ej3;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Mascota_ej3 {

    /*
3) Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y 
un método para mostrar por pantalla la información de la mascota.
Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
     */

    private String nombre;
    private int edad;
    private String tipo;
    private String raza;

    public Clase_Mascota_ej3() {
    }

    public Clase_Mascota_ej3(String nombre, int edad, String tipo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void cargarMascota() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre");
        this.nombre = leer.nextLine();

        System.out.println("ingrese edad");
        this.edad = leer.nextInt();

        System.out.println("ingrese tipo");
        this.tipo = leer.nextLine();

        System.out.println("ingrese raza");
        this.raza = leer.nextLine();

    }

    public void mostrarMascota() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Tipo:" + tipo);
        System.out.println("Raza:" + raza);
    }

    
    public void cumplirAnio(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + (edad + 1));
        System.out.println("Tipo:" + tipo);
        System.out.println("Raza:" + raza);
        
        
    }
    
}
