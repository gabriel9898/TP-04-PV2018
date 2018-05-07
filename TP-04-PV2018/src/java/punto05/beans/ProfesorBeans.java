/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto05.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto05.dominio.Profesor;

/**
 *
 * @author germa
 */
@ManagedBean
@ViewScoped
public class ProfesorBeans implements Serializable{

    private static ArrayList<Profesor> lista= new ArrayList<Profesor>(){};
    private Profesor profesor;
    private Profesor profesorSeleccionado;

    /**
     * Creates a new instance of ProfesorBeans
     */
    public ProfesorBeans() {
        profesor = new Profesor();
        
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
     public void cargarLista(){
       //numero = new Profesor(num1,num2);
       lista.add(profesor);
    }

   
    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public static void setLista(ArrayList<Profesor> lista) {
        ProfesorBeans.lista = lista;
    }

    public Profesor getProfesorSeleccionado() {
        return profesorSeleccionado;
    }

    public void setProfesorSeleccionado(Profesor profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }

    public void seleccionarProfesor (Profesor profesor){
        this.setProfesorSeleccionado(profesor);
    }
    
}
