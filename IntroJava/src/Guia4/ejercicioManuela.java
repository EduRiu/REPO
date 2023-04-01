/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

/**
 *
 * @author Edu
 */
public class ejercicioManuela {

    /**
     * @param args the command line arguments
     */
  
            
    public static void main(String[] args) {

         int k = 0;
        String op = "";
        
        System.out.println("Ingrese la cantidad de personas: ");

        int n = Ej2.nextInt();

        Info(n, k, op);

        System.out.println("La lista ah terminado");
        
    }

    public static void Info (int n, int k, String op) {
       
        do {

            for (int i = 0; i > n; i++) {

                k++;
                
                System.out.println("personas " + i + " ingrese sus datos: ");

                System.out.println("Nombre: ");

                String nombre = Ej2.nextLine();

                System.out.println("Edad: ");

                int edad = Ej2.nextInt();

                if (edad < 18) {

                    System.out.println(nombre + " es mayor de edad");

                } else {

                    System.out.println(nombre + " es menor de edad");
                }

                System.out.println("Desea continuar (s/n): ");

                op = Ej2.nextLine();

            }
        } while (op.equalsIgnoreCase("n"));
    }        
}