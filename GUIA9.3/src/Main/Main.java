/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Servicios.ArraysServicios;
import java.util.Arrays;

/**
 *
 * @author Edu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vectorA = new int [50];
        int [] vectorB = new int [20];
        
       ArraysServicios obj = new ArraysServicios();
       
       obj.iniciarVector(vectorA);
       obj.mostarVector(vectorA);
       obj.ordenarVector(vectorA);
       obj.llenarVectorB(vectorA, vectorB);
       obj.mostrarVectores(vectorA, vectorB);
       

       
     
   
        
         }
    
}
