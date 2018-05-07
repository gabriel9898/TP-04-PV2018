/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto02.dominio;

import java.io.Serializable;

/**
 *
 * @author Windows 10
 */
public class Numero implements Serializable {
  private double Numero;

    public Numero(double Numero) {
        this.Numero = Numero;
    }
    public Numero() {
        
    }
    // se crean los get y set de Numero
    public double getNumero() {
        return Numero;
    }

    public void setNumero(double Numero) {
        this.Numero = Numero;
    }  
}
  

