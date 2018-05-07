/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto06.dominio;

/**
 *
 * @author germa
 */
public class Auto {
    
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipodeCombustible;

    
    public Auto(String patente, String marca, String modelo, String color, String tipodeCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipodeCombustible = tipodeCombustible;
    }
    
    public Auto() {
    
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipodeCombustible() {
        return tipodeCombustible;
    }

    public void setTipodeCombustible(String tipodeCombustible) {
        this.tipodeCombustible = tipodeCombustible;
    }
    
    
    
    
}
