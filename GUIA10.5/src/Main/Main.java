/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Pais;
import Servicio.PaisServicio;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Edu
 */
public class Main {

    /**
        Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
        usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
        conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
        si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
        los servicios en la clase correspondiente)
     */
    public static void main(String[] args) {
        
        
       TreeSet<Pais> pais = new TreeSet<>();
        
        PaisServicio main = new PaisServicio();
        
        main.cargarPais(pais);
        main.buscarYeliminar(pais);
        
        
        
        
    }
    
}
