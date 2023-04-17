/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_extra_ej6;

/**
 *
 * @author Edu
 */
public class Clase_Rectangulo_ej6 {
    
    /*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
    */
    private int lado1;
    private int lado2;

    public Clase_Rectangulo_ej6() {
    }

    public Clase_Rectangulo_ej6(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    
    public void calcular_area(int numero1, int numero2){
        numero1 = 4;
        numero2 = 6;
        
        System.out.println("el area es " + numero1*numero2);
        
    }
    
    public void calcular_vacio_area(int numero1v, int numero2v)
    {
        System.out.println("el area es " + numero1v*numero2v);
    }
    
    
    
}
