/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Edu
 */
public class CuentaBancariaNew {
    
   private int numeroCuenta;
   private long dniCliente;
   private double saldoCuenta;

    public CuentaBancariaNew() {
    }

    public CuentaBancariaNew(int numeroCuenta, long dniCliente, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoCuenta = saldoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancariaNew{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoCuenta=" + saldoCuenta + '}';
    }
    

    
    
    
}

   