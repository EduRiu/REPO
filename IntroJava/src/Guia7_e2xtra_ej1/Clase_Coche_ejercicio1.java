/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_e2xtra_ej1;
import java.util.Scanner;
/**
 *
 * @author Edu
 */
public class Clase_Coche_ejercicio1 {
    
    /*
Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
    */
    
    
    
    private String marca;
    private String modelo;
    private double precio;

    public Clase_Coche_ejercicio1() {
    }

    public Clase_Coche_ejercicio1(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public void crearCoche(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Marca de coche");
        this.marca = leer.nextLine();
        
        System.out.println("Modelo de coche");
        this.modelo = leer.nextLine();
        
        System.out.println("Precio de coche");
        this.precio = leer.nextDouble();
        
        
    }
    
    public void mostrarCoche(){
        System.out.println("el coche: " + this.marca);
        System.out.println("es modelo: " + this.modelo);
        System.out.println("Valor de la unidad:" + this.precio);
        
    }
    
    
    
}
