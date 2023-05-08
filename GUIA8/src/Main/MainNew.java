/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.CuentaBancariaNew;
import Servicios.CuentaBancariaServiciosNew;



/**
 *
 * @author Edu
 */
public class MainNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancariaServiciosNew objeto = new CuentaBancariaServiciosNew();
        
        CuentaBancariaNew cuenta = objeto.crear();
                                
        objeto.ingresarSaldo(cuenta);
        objeto.retirarSaldo(cuenta);
        objeto.extraccionRapida(cuenta);
        objeto.consultaSaldo(cuenta);
        objeto.consultaDatos(cuenta);
        
        CuentaBancariaNew cuenta2 = objeto.crear();
        objeto.ingresarSaldo(cuenta);
        objeto.retirarSaldo(cuenta);
        objeto.extraccionRapida(cuenta);
        objeto.consultaSaldo(cuenta);
        objeto.consultaDatos(cuenta);
        
        
       
        
        
        
                
                
    }
    
}
