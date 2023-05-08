/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class FraccionServicios {

    Scanner leer = new Scanner(System.in);
    Fraccion carga = new Fraccion();

    public void cargarDatos() {

        System.out.println("cargar numerador 1");
        carga.setF_1_n(leer.nextInt());

        System.out.println("cargar denominador 1");

        boolean salida = true;
       
        do {

            carga.setF_1_d(leer.nextInt());

            if (carga.getF_1_d() == 0) {
                System.out.println(" no se puede dividir por cero");
                System.out.println(" ingrese un nuevo denominador");
                salida = true;
            }
            
        } while (salida);

        System.out.println("cargar numerador 2");
        carga.setF_2_n(leer.nextInt());

        System.out.println("cargar denominador 2");
        boolean salida1 = true;
        do {
            carga.setF_2_d(leer.nextInt());
            System.out.println(" no se puede dividir por cero");
            System.out.println(" ingrese un nuevo denominador");
            salida = true;

        } while (salida1);

    }

    
    
    
    
    
    public void sumaFraccion() {
        int dT;
        int nT;

        nT = carga.getF_1_n() + carga.getF_2_n();
        dT = carga.getF_1_d() + carga.getF_2_d();

        System.out.println("la suma es:" + nT + " + " + dT);
        
        
        int a = 0;
        int b = 0;

        if (nT%2 == 0 && dT%2 == 0) {
            do{
                
              a =  nT /2;
              b =  dT/2;
              
            } while (a < 1 || b < 1);
        }
        
        System.out.println(a + b);
        

    }

    public void restaFraccion() {
        int dT;
        int nT;

        nT = carga.getF_1_n() - carga.getF_2_n();
        dT = carga.getF_1_d() * carga.getF_2_d();

        System.out.println("la suma es:" + nT + " + " + dT);

    }

    public void multiplicarFraccion() {
        int dT;
        int nT;

        nT = carga.getF_1_n() * carga.getF_2_n();
        dT = carga.getF_1_d() * carga.getF_2_d();

        System.out.println("la suma es:" + nT + " + " + dT);

    }

    public void dividirFraccion() {
        int dT;
        int nT;

        nT = carga.getF_1_n() * carga.getF_2_d();
        dT = carga.getF_1_d() * carga.getF_2_n();

        System.out.println("la suma es:" + nT + " + " + dT);

    }

    public void menuFraccion() {

        cargarDatos();

        System.out.println("Ingrese una opcion para trabajar");
        System.out.println("1 - SUMA");
        System.out.println("2 - RESTA");
        System.out.println("3 - MULTIPLICACION");
        System.out.println("4 - DIVISION");
        int eleccion = leer.nextInt();

        switch (eleccion) {
            case 1:
                sumaFraccion();
                break;
            case 2:
                restaFraccion();
                break;
            case 3:
                multiplicarFraccion();
                break;
            case 4:
                dividirFraccion();
                break;
            default:
                menuFraccion();
        }

    }

}
