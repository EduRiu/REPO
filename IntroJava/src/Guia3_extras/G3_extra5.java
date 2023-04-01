/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_extras;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class G3_extra5 {

    /*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.

     */
    public static void main(String[] args) {
      
        System.out.println("Ingrese el plan");
        Scanner plan_i = new Scanner(System.in);
        String plan = plan_i.nextLine();
        plan = plan.toUpperCase();
        System.out.println("Ingrese el monto del tratamiento");
        Scanner costo_i = new Scanner(System.in);
        double costo = costo_i.nextDouble(); 
        
        
        switch (plan)
        {
           case "A":
               System.out.println("el tratamiennto para el plan A es $" + costo*.5);
               break;
           case "B":
               System.out.println("el tratamiennto para el plan B es $" + (costo-costo*.35));
               break;
           case "C":
               System.out.println("el tratamiennto para el plan C es $" + costo);
               break;
           default:
               System.out.println("No ingreso un plan correcto");
               
        }
        
        
        
        
        
    }
    
}
