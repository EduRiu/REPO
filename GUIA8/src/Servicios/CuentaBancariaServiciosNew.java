/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancariaNew;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class CuentaBancariaServiciosNew {

    private Scanner leer = new Scanner(System.in);

    //ahora, uso el objeto que creo en un metodo que retorna los datos al objeto creado
    public CuentaBancariaNew crear() {

        CuentaBancariaNew main = new CuentaBancariaNew();

        System.out.println("ingrese numero de cuenta");
        main.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese su DNI");
        main.setDniCliente(leer.nextLong());
        main.setSaldoCuenta(1000.00);
   
        System.out.println("su saldo de inicio es: " + main.getSaldoCuenta());
        return main;
    }

    public void ingresarSaldo(CuentaBancariaNew main) {
        System.out.println("INGRESO DE SALDO");
        System.out.println("cuanto dinero desea ingresar?");
        double ingreso = leer.nextDouble();
        main.setSaldoCuenta(main.getSaldoCuenta() + ingreso);

    }

    public void retirarSaldo(CuentaBancariaNew main) {
        System.out.println("RETIRO DE SALDO");
        System.out.println("Cuanto dinero desea retirar");
        double retiro = leer.nextDouble();

        if (main.getSaldoCuenta() > retiro) {
            main.setSaldoCuenta(main.getSaldoCuenta() - retiro);

        } else {
            System.out.println("saldo insuficiente");
            System.out.println("usted retira: " + main.getSaldoCuenta());
            main.setSaldoCuenta(0);
            System.out.println("ahora su saldo es:" + main.getSaldoCuenta());

        }

    }

    public void extraccionRapida(CuentaBancariaNew main) {
        System.out.println("EXTRACCION RAPIDA");
        System.out.println("Maxino dinero a retirar");
        System.out.println(main.getSaldoCuenta() * .2);

        System.out.println("cuanto desea retirar ");
        double rapida = leer.nextDouble();

        if (main.getSaldoCuenta() * .2 < rapida) {

            System.out.println("el monto ingresado excede el limite");
            System.out.println("retiro autorizado:" + main.getSaldoCuenta() * .2);

        } else {
            System.out.println("el monto a retira correcto");
            System.out.println("saldo de la cuenta:" + (main.getSaldoCuenta() - rapida));
            main.setSaldoCuenta((main.getSaldoCuenta() - rapida));
        }
    }

    public void consultaSaldo(CuentaBancariaNew main) {
        System.out.println("su saldo es: " + main.getSaldoCuenta());
   
    }

    public void consultaDatos(CuentaBancariaNew main){
        System.out.println("Numero de cuenta: " + main.getNumeroCuenta());
        System.out.println("Numero de documento: " + main.getDniCliente());
        System.out.println("Saldo de cuenta: " + main.getSaldoCuenta());
    }
    
    
}
