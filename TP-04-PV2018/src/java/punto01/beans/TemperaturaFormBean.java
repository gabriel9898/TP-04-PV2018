/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto01.beans;

import punto01.dominio.TemperaturaSistema;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author Sofia Soto
 */
@ManagedBean
@RequestScoped
//se crea una clase llamada TemperaturaFormBean
public class TemperaturaFormBean {
    private TemperaturaSistema temperaturaSistema;
    
    /**
     * Creates a new instance of TemperaturaFormBean
     */
    public TemperaturaFormBean() {
        temperaturaSistema = new TemperaturaSistema();
    }

    /**
     * @return the temperaturaSistema
     */
    public TemperaturaSistema getTemperaturaSistema() {
        return temperaturaSistema; 
    }

    /**
     * @param temperaturaSistema the temperaturaSistema to set
     */
    public void setTemperaturaSistema(TemperaturaSistema temperaturaSistema) {
        this.temperaturaSistema = temperaturaSistema;
    }

    
    
    
    
}
