/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_extra_ej5;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Empleado_ej5 {
    
    /*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
    */

    private String Nombre;
    private int edad;
    private double salario;

    public Clase_Empleado_ej5() {
    }

    public Clase_Empleado_ej5(String Nombre, int edad, double salario) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public void calcularAumento(){
        
        int porcentaje;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nombre");
        this.Nombre = leer.nextLine();
        
        System.out.println("Ingrese edad");
        this.edad = leer.nextInt();
        
        System.out.println("Ingrese salario");
        this.salario = leer.nextDouble();
        
        
        if (edad >= 30) {
            
            porcentaje = 10;
            salario =  salario*1.1;
        }
        else
        {
           
            porcentaje = 5;
            salario = salario*1.05;
        }
        
        
        System.out.println("El empleado " + Nombre + " por tener " + edad + " años" + " tiene un aumento del " + porcentaje + "% y salario sera " + salario);
        
    }
    
    


    
}
