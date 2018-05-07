/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto03.dominio;

import java.io.Serializable;


/**
 *
 * @author german
 */
public class Calculadora implements Serializable{

    public double sumar(double numeroA, double numeroB){
        return numeroA + numeroB;
    }
    public double restar(double numeroA, double numeroB){
        return numeroA - numeroB;
    }
    public double multiplicar(double numeroA, double numeroB){
        return numeroA * numeroB;
    }
    public double dividir(double numeroA, double numeroB){
        return numeroA / numeroB;
    }
    public double potencia(double numeroA, double numeroB){
        return Math.pow(numeroA,numeroB) ;
    }
    
}
