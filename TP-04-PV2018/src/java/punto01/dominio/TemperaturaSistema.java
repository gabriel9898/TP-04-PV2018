/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto01.dominio;

import java.io.Serializable;

/**
 *
 * @author Sofia
 */
public class TemperaturaSistema implements Serializable {
    private int temperatura = 0;
    private String tipoTemperatura = "";

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipoTemperatura() {
        return tipoTemperatura;
    }

    public void setTipoTemperatura(String tipoTemperatura) {
        this.tipoTemperatura = tipoTemperatura;
    }
    
    public String convertirFahrenheit (){
        if (tipoTemperatura.compareTo("Grado Fahrenheit") == 0){
            return this.temperatura+" Fah";
        }else{
            if (tipoTemperatura.compareTo("Celsius") == 0){
                return ((this.temperatura*1.8)-32)+ " Fah";
            }else{
                if (tipoTemperatura.compareTo("Kelvin") == 0){ 
                    return (((this.temperatura-273.15)*1.8) +32 )+ " Fah";
                }else{
                    return "";
                }
            }
        }
    }
    
    public String convertirCelsius (){
        if (tipoTemperatura.compareTo("Grado Fahrenheit") == 0){
            return ((this.temperatura-32)/1.8)+" C";
        }else{
            if (tipoTemperatura.compareTo("Celsius") == 0){
                return this.temperatura + " C";
            }else{
                if (tipoTemperatura.compareTo("Kelvin") == 0){ 
                    return (this.temperatura-273.15)+ " C";
                }else{
                    return "";
                }
            }
        }
    }
    
    public String convertirKelvin (){
        if (tipoTemperatura.compareTo("Grado Fahrenheit") == 0){
            return (((this.temperatura-32)/1.8)+273.15)+" K";
        }else{
            if (tipoTemperatura.compareTo("Celsius") == 0){
                return (this.temperatura+273.15) + " K";
            }else{
                if (tipoTemperatura.compareTo("Kelvin") == 0){ 
                    return this.temperatura + " K";
                }else{
                    return "";
                }
            }
        }
    }
}

