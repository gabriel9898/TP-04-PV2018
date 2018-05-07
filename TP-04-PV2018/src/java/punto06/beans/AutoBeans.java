/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto06.beans;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import punto06.dominio.Auto;

/**
 *
 * @author german
 */
@ManagedBean
@ViewScoped
public class AutoBeans {

    private ArrayList<Auto> ListaAuto= new ArrayList<Auto>(){};
    private Auto auto;
    private Auto autoSeleccionado;
    private String nuevapatente;
    private String nuevamarca;
    private String nuevoModelo;
    private String nuevocolor;
    private String nuevoTipoDeCombustible;
    
    /**
     * Creates a new instance of AutoBean
     */
    public AutoBeans() {        
        auto = new Auto();
        
        auto = new Auto("1", "chevrolet", "4X2", "rojo", "gasoil");
        ListaAuto.add(auto);
        
        auto = new Auto("2", "toyota", "4X2", "negro", "gasoil");
        ListaAuto.add(auto);
        
        auto = new Auto("3", "renault", "4X2", "blanco", "nafta");
        ListaAuto.add(auto);        
    }
    
    public ArrayList<Auto> getListaAuto() {
        return ListaAuto;
    }

    public void setListaAuto(ArrayList<Auto> ListaAuto) {
        this.ListaAuto = ListaAuto;
    }

    
    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Auto getAutoSeleccionado() {
        return autoSeleccionado;
    }

    public void setAutoSeleccionado(Auto autoSeleccionado) {
        this.autoSeleccionado = autoSeleccionado;
    }

    public String getNuevocolor() {
        return nuevocolor;
    }

    public void setNuevocolor(String nuevocolor) {
        this.nuevocolor = nuevocolor;
    }

    public String getNuevapatente() {
        return nuevapatente;
    }

    public void setNuevapatente(String nuevapatente) {
        this.nuevapatente = nuevapatente;
    }

    public String getNuevamarca() {
        return nuevamarca;
    }

    public void setNuevamarca(String nuevamarca) {
        this.nuevamarca = nuevamarca;
    }

    public String getNuevoModelo() {
        return nuevoModelo;
    }

    public void setNuevoModelo(String nuevoModelo) {
        this.nuevoModelo = nuevoModelo;
    }

    public String getNuevoTipoDeCombustible() {
        return nuevoTipoDeCombustible;
    }

    public void setNuevoTipoDeCombustible(String nuevoTipoDeCombustible) {
        this.nuevoTipoDeCombustible = nuevoTipoDeCombustible;
    }
    
    
    public void actualizar(RowEditEvent event){
        Auto a = (Auto) event.getObject();
        a.setPatente(nuevapatente);
        a.setMarca(nuevamarca);
        a.setModelo(nuevoModelo);
        a.setColor(nuevocolor);
        a.setTipodeCombustible(nuevoTipoDeCombustible);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Actualizado"));
    }
    
    public void cancelar(RowEditEvent event){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cancelado"));
    }
}
