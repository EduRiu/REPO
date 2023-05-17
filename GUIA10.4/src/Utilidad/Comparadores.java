/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Edu
 */
public class Comparadores {
    
    /*
                    DATAZO..!! POR DEFECTO TE LO ORDENA DE MENOR A MAYOR Y ALFA DE Z---- X --- Y---
                    PARA DARLO VUELTA O MULTIPLICAS EL RETURN POR -1 (RETURN ES INT) 
                    O DAS VUELTAS AL T--- T1
                    EJ:  return t1.getDuracion().compareTo(t.getDuracion()); ---POR DEFECTO
                    
                    EJ:  return t.getDuracion().compareTo(t1.getDuracion()); ---INVERSA
                    EJ:  return (t.getDuracion().compareTo(t1.getDuracion())*-1); ---INVERSA
    */  
    
    
    /*
    Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    pantalla.
    */
    public static Comparator<Pelicula> ordenarDuracionDescendente = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    /*
    Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    pantalla.
    */
    
    public static Comparator<Pelicula> ordenarDuracionAscendete = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return (t1.getDuracion().compareTo(t.getDuracion())*-1);
        }
    };
    
    /*
    Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    */
    
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return (t.getTitulo().compareTo(t1.getTitulo()));
        }
    };
    
    /*
    Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    */
    
    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return (t.getDirector().compareTo(t1.getDirector()));
        }
    };
    
}
