/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Edu
 */
public class PaisServicio {
 
    
    private Scanner leer;

    public PaisServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    public void cargarPais(TreeSet<Pais> pais){
        boolean seguir = false;
        do {            
            
            System.out.println("Ingrese un pais");
            String nombre = leer.nextLine();
            
            pais.add(new Pais(nombre));
            
            System.out.println("ingresa otro pais?");
            if (!"s".equals(leer.nextLine())) {
                seguir = false;
            } else {
                seguir = true;
            }
            
        } while (seguir);
            
              System.out.println("Los paises ingresados son: ");
              for (Pais pai : pais) {
                  System.out.println(pai);
        }
    }
    
    public void buscarYeliminar(TreeSet<Pais> pais){
        
        int tamañoIncial = pais.size();
        
        System.out.println("ingrese un pais para buscar y eliminar");
        String seleccion = leer.nextLine();
        
        Iterator<Pais> busqueda = pais.iterator();
        
        while (busqueda.hasNext()) {
            Pais next = busqueda.next();
            
            if (next.getPais().equals(seleccion)) {
                busqueda.remove();
            }
        }
        
        int tamañoRemover = pais.size();
        if (tamañoIncial == tamañoRemover) {
            System.out.println("el pais: " + seleccion + "no estaba en la lista" );
            System.out.println("no removio ningun pais");
        }
        else
        {
        System.out.println("el pais: " + seleccion + " ha sido removido");
        System.out.println("Los paises ahora son:");
        for (Pais pai : pais) {
            System.out.println(pai);
        }

        }
        
                
        
    }
    
    
    
    
    
}
