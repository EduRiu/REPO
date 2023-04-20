/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_e2xtra_ej3;

/**
 *
 * @author Edu
 */
public class Principal_Mascota_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guia7_e2xtra_ej3.Clase_Mascota_ej3 mascota1 = new Guia7_e2xtra_ej3.Clase_Mascota_ej3();
        Guia7_e2xtra_ej3.Clase_Mascota_ej3 mascota2 = new Guia7_e2xtra_ej3.Clase_Mascota_ej3();
        Guia7_e2xtra_ej3.Clase_Mascota_ej3 mascota3 = new Guia7_e2xtra_ej3.Clase_Mascota_ej3();
        Guia7_e2xtra_ej3.Clase_Mascota_ej3 mascota4 = new Guia7_e2xtra_ej3.Clase_Mascota_ej3();
        
        System.out.println("ingrese las mascotas");
        mascota1.cargarMascota();
        //mascota2.cargarMascota();
        //mascota3.cargarMascota();
        //mascota4.cargarMascota();
        System.out.println("ahora mostramos la mascotas");        
        mascota1.mostrarMascota();
        //mascota2.mostrarMascota();
        //mascota3.mostrarMascota();
        //mascota4.mostrarMascota();
        System.out.println("ahora aumenta un año");
        mascota1.cumplirAnio();
        //mascota2.cumplirAnio();
        //mascota3.cumplirAnio();
        //mascota4.cumplirAnio();
        
    }
    
}
