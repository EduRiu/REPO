/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.CuentaBancariaServicio;

/**
 *
 * @author Edu
 */
public class GUIA8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    CuentaBancariaServicio cuenta100 = new CuentaBancariaServicio();
    CuentaBancariaServicio cuenta101 = new CuentaBancariaServicio();
         
        
        
    cuenta100.crearCuenta();
    cuenta100.ingresarSaldo();
    cuenta100.retirarSaldo();
    cuenta100.extraccionRapida();
    cuenta100.consultaSaldo();
    cuenta100.consultaDatos();
            
     
    cuenta101.crearCuenta();
    cuenta101.ingresarSaldo();
    //cuenta101.retirarSaldo();
    //cuenta101.extraccionRapida();
    //cuenta101.consultaSaldo();
    //cuenta101.consultaDatos();
        
     cuenta100.consultaDatos();    
     
    }
    
}
