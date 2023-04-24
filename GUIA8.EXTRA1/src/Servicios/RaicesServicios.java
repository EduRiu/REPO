/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidad.Raices;

/**
 *
 * @author Edu
 */
public class RaicesServicios {

    Raices raiz = new Raices();
    Scanner leer = new Scanner(System.in);

    public void cargarDatos(){
        
        System.out.println("valor de A");
        raiz.setA(leer.nextInt());
        System.out.println("valor de B");
        raiz.setB(leer.nextInt());
        System.out.println("valor de C");
        raiz.setC(leer.nextInt());
    }
    
    
    
    //Método getDiscriminante(): devuelve el valor del discriminante (double). 
    //El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    //Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
    
    
    public double getDiscriminante() {

        double retorno;

        retorno = (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
        return retorno;
        
           }

    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
    para que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices() {
        boolean raices = false;

        if (getDiscriminante() > 0) {

            raices = true;
        }

        return raices;

    }

    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
    para que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz() {

        boolean raiz = false;

        if (getDiscriminante() == 0) {
            raiz = true;
        }
        return raiz;
    }
    
    
    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones
    */
    
    public void obtenerRaices()
    {
        
        if(tieneRaices()  == true)
        {
            System.out.println("Tiene dos raices");
        }
                
        //(-b±√((b^2)-(4*a*c)))/(2*a);
               
        System.out.println( "la raiz a: " + ((raiz.getB()*-1) + ( ( Math.sqrt  ( Math.pow(raiz.getB(),2) - (4*raiz.getA()*raiz.getC()) )) ) /(2*raiz.getA())) );
        
        System.out.println( "la raiz b: " + ((raiz.getB()*-1) - ( ( Math.sqrt  ( Math.pow(raiz.getB(),2) - (4*raiz.getA()*raiz.getC()) )) ) /(2*raiz.getA())) );
        
    }
        
        
    
    
    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
    Es en el caso en que se tenga una única solución posible.
    */
    
    public void obtenerRaiz(){
        
        if(tieneRaiz() == true)
        {
            System.out.println("tiene una raiz");
        }
         System.out.println( "la raiz a: " + ( (raiz.getB()*-1) + ( ( Math.sqrt  ( Math.pow(raiz.getB(),2) - (4*raiz.getA()*raiz.getC()) )) ) /(2*raiz.getA())) );
    }
    
    
    /*
    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones 
    que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
    según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    */
    
    public void calcular(){
        cargarDatos();
        System.out.println(getDiscriminante());
        
        if (tieneRaices()  == true) {
            obtenerRaices();        }
        
        else if (tieneRaiz() ==  true) {
        obtenerRaiz();    
        }
        else
        {
        System.out.println("no tiene solucion");
        }   
 
    }
    
    
    /*
    Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
    */
    
    
    
    
}
