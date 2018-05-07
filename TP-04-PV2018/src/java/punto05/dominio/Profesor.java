/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto05.dominio;

import java.io.Serializable;

/**
 *
 * @author germa
 */
public class Profesor implements Serializable{
    
    private double Numero;
    private double Numero2;
    private int DNI;
    private String Nombre;
    private String Materia;
    
    public Profesor(double Numero) {
        this.Numero = Numero;
    }

    public Profesor(double Numero, double Numero2) {
        this.Numero = Numero;
        this.Numero2 = Numero2;
    }

    
    public Profesor() {
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }

    
    
    public double getNumero() {
        return Numero;
    }

    public void setNumero(double Numero) {
        this.Numero = Numero;
    }  

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }    
}
