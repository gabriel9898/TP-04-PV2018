/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07y08.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import punto07y08.dominio.Libro;

/**
 *
 * @author gabriel
 */
@ManagedBean
@RequestScoped
public class LibroBeans {

    private static ArrayList<Libro> ListaLibros= new ArrayList<Libro>(){};
    private List ListaAutor;
    private Libro libro;
    /**
     * Creates a new instance of LibroBeans
     */
    public LibroBeans() {
        libro = new Libro();
    }
    
    public void cargarLista(){
       ListaLibros.add(libro);
    }

    public ArrayList<Libro> getListaLibros() {
        return ListaLibros;
    }

    public void setListaLibros(ArrayList<Libro> ListaLibros) {
        this.ListaLibros = ListaLibros;
    }

    public List getListaAutor() {
        return ListaAutor;
    }

    public void setListaAutor(List ListaAutor) {
        this.ListaAutor = ListaAutor;
    }

    
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    
}
