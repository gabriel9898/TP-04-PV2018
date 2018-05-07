/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto02.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import punto02.dominio.Numero;

/**
 *
 * @author Windows 10
 */
@ManagedBean
@RequestScoped
    public class Lista implements Serializable{
    private static ArrayList<Numero> lista= new ArrayList<Numero>(){};
    private Numero numero;
    private int num1;
    
    /**
     * Creates a new instance of NumeroFormBean
     */
    public Lista() {
        
    }
    // carga de lista con los números
    //también la creación de los get y set de Lista,Numero y Num1
    
    public void cargarLista(){
       numero = new Numero(num1);
       lista.add(numero);
    }

   
    public ArrayList<Numero> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Numero> lista) {
        punto02.beans.Lista.lista = lista;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    // muestra del maximo 
    public double  mostrarMaximo (){
        double max;
        if (lista.isEmpty()){
            max=0;
        }else{
            max=lista.get(0).getNumero();
            for(int i = 0; i < lista.size(); i++){
                if(max<lista.get(i).getNumero()){
                    max=lista.get(i).getNumero();
                }
            }
        }
    return max;
    }
    // muestra del minimo 
    public double mostrarMinimo (){
        double min;
        if (lista.isEmpty()){
            min=0;
        }else{
            min=lista.get(0).getNumero();
            for(int i = 0; i < lista.size(); i++){
                if(min>lista.get(i).getNumero()){
                    min=lista.get(i).getNumero();
                }
            }
        }
    return min;
    }
    //calculo del promedio con los números ingresados por el usuario
    public double calcularPromedio(){
        double suma=0,div;
        if (lista.isEmpty()){
            suma=0;
            div=1;
        }else{
            for(int i = 0; i < lista.size(); i++){
                suma=suma + lista.get(i).getNumero();
            }
            div=lista.size();
        }
    return suma/div;
    }
    }
    

