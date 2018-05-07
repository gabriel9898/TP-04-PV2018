/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto01.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import punto01.dominio.TemperaturaSistema;

/**
 *
 * @author Sofia
 */
@ManagedBean
@RequestScoped
//se crea una clase llamada TemperaturaFormBean
public class TemperaturaFormBeans {
    private TemperaturaSistema temperaturaSistema;
    /**
     * Creates a new instance of TemperaturaFormBeans
     */
    public TemperaturaFormBeans() {
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
