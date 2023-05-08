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
public class NIF {
 
    private long DNI;
    private String verificador;

    public NIF() {
    }

    public NIF(long DNI, String verificador) {
        this.DNI = DNI;
        this.verificador = verificador;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getVerificador() {
        return verificador;
    }

    public void setVerificador(String verificador) {
        this.verificador = verificador;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", verificador=" + verificador + '}';
    }
    
    
    
    
    
    
}
