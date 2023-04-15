/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Edu
 */
public class Clase_Operaciones_ejercicio3 {
    
    /*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
    */
    
    
    private int numero1;
    private int numero2;
 
    
    //METODOS
    //a) Método constructor con todos los atributos pasados por parámetro.
    //insert->constructor

    public Clase_Operaciones_ejercicio3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //b) Método constructor sin los atributos pasados por parámetro.

    public Clase_Operaciones_ejercicio3() {
    }
    
    
    //c) Métodos get y set.

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    /*
Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
    */
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in); 

        System.out.println("ingrese el primer numero");
        this.setNumero1(leer.nextInt());
        
        System.out.println("ingrese el segundo numero");
        this.setNumero2(leer.nextInt());
        
        }
    /*
Método sumar(): calcular la suma de los números y devolver el
resultado al main.
    */
    
    public int sumar(){
     
    int suma = getNumero1() +  getNumero2();
    //System.out.println("despues de sumar " + getNumero1() + " + " + getNumero2() + " es " + suma); 
    return suma;
}
    
  /*
Método restar(): calcular la resta de los números y devolver el
resultado al main
 */  
 
    public int restar(){
        int resta = getNumero1() -  getNumero2();
        //System.out.println("la restar entre " + getNumero1() + " - " + getNumero2() + " es " + resta); 
        return resta;
    }
    
    
    /*
Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
    */
    
    public int multiplicar(){
        int multiplica = 0;
        
        if(getNumero1() == 0 || getNumero2() == 0){
            System.out.println("ERROR porquue uno de los numeros es 0");
            multiplica = 0;
        }
        else
        {
            multiplica = getNumero1() * getNumero2();
        }
        
        return multiplica;
    }
    /*
Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
    */
    
    public int dividir(){
        int dividir = 0;
        
        if (getNumero2() == 0) {
            System.out.println("ERROR porque no se puede divir por 0");
            dividir = 0;
            }
        else
        {
            dividir = getNumero1()/getNumero2();
        }
        return dividir;
    }
    
    
}
