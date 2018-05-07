/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto03.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto03.dominio.Calculadora;

/**
 *
 * @author germa
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    
    private double numeroA;
    private double numeroB;
    private String NomOperacion="";
    private Calculadora calculadora;    

    /**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
        calculadora = new Calculadora();
    }

    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }

    public String getNomOperacion() {
        return NomOperacion;
    }

    public void setNomOperacion(String NomOperacion) {
        this.NomOperacion = NomOperacion;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
    public double calcularOperacion(){
        if (NomOperacion.contains("Suma")){
            return calculadora.sumar(numeroA, numeroB);
        }else{
            if (NomOperacion.contains("Resta")){
                return calculadora.restar(numeroA, numeroB); 
            }else{
                if (NomOperacion.contains("Multiplicar")){
                    return calculadora.multiplicar(numeroA, numeroB); 
                }else{
                    if (NomOperacion.contains("Dividir")){
                            return calculadora.dividir(numeroA, numeroB);    
                    }else{
                        if (NomOperacion.contains("Potencia")){
                            return calculadora.potencia(numeroA, numeroB); 
                        }else{
                            return 0;
                        }
                    }
                }
            }
        }
    }    
}
