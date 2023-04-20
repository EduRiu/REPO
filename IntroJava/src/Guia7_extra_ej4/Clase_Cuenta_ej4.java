/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_extra_ej4;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Clase_Cuenta_ej4 {
    
    /*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
    */
    
    
    
    private double saldo;
    private String titular;

    public Clase_Cuenta_ej4() {
    }

    public Clase_Cuenta_ej4(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
   public void usuarioCuenta(){
   
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese el saldo");
       this.saldo = leer.nextDouble();
      
       leer.nextLine();
       
       System.out.println("Titular");
       this.titular = leer.nextLine();
       
   }
    
   public void retiroDinero (){
       Scanner leer = new Scanner(System.in);
       
       double retiro;
       boolean salir = true;
       
       
       do{
       System.out.println("cuanto dinero desea retirar");
       retiro = leer.nextDouble();
       
       if (retiro > saldo) {
           System.out.println("No puede retirar esa cantidad");
           System.out.println("Saldo insuficiente");
           break;
       }
       else
       {
           saldo = saldo-retiro;
           System.out.println("Usuario " + titular + " su saldo es " + saldo);
          
       }
           System.out.println(" desea retirar nuevamente");
           System.out.println("N --> NO");
           System.out.println("S --> SI");
           if ("N".equals(leer.next())) {
               salir = false;
           }
           
           
       } while(salir);
       
       
       
       
   }
    
}
