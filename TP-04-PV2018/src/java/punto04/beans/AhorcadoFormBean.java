/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto04.beans;

import punto04.dominio.Ahorcado;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author gabriel
 */
@ManagedBean
@RequestScoped
public class AhorcadoFormBean {
    private static ArrayList<Ahorcado> letra = new ArrayList<Ahorcado>(){};
    private Ahorcado cad;
    private String cadena="vacio";
    private char caracter = '-';
    private static int Numintento = 5;
    private static String estado = "";
    /**
     * Creates a new instance of AhorcadoFormBean
     */
    public AhorcadoFormBean() {

    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getNumintento() {
        return Numintento;
    }

    public void setNumintento(int Numintento) {
        this.Numintento = Numintento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
   

    public void agregarLista (){
    //descompone la palabra y la va almacenando caracter por caracter en un arraylist   
        if (!cadena.contains("vacio")){
            letra = new ArrayList<>();
            for (int i=0;i<cadena.length();i++){
                if (cadena.charAt(i) == ' '){
                    cad = new Ahorcado(cadena.charAt(i),' ');
                    letra.add(cad);
                }else{
                    cad = new Ahorcado(cadena.charAt(i),'_');
                    letra.add(cad);
                }
            }  
            cadena="";
            Numintento=5;
            caracter='-';
        }
        
    }
    
    public String mostrarCadena (){
        //muestra la cadena almacenada en el arraylist
        String cadena1 = "";
        for (int i=0; i<=letra.size()-1;i++){
                cadena1 = cadena1 + letra.get(i).getGuion()+ " ";
        }
     return cadena1;
    }
    
    public void verificacionCaracter(){
        boolean bandera = false;
        //verifica si esta jugando todavia
        if ((!cadena.contains("vacio")) &&(estado.equals("Jugando"))){
            
                for (int i=0; i<=letra.size()-1;i++){
                    //recorre el arraylist para ver si esta el caracter ingresado
                    if (letra.get(i).getLetra()==caracter){
                        letra.get(i).setGuion(caracter);
                            bandera = true;
                    }
                }    
                //si no se encuentra el caracter ingresado se le descontara un punto
                if ((bandera == false && Numintento>0)){
                    this.Numintento = this.Numintento - 1;
                }
            
        }   
    }

    public String mostrarEstado(){
        // verifica el estado del juego
        String cadena1 = "";
        if (!cadena.contains("vacio")){
            if (Numintento <= 0){
               estado="Perdio";
                return estado;
            }else{
                for (int i=0; i<=letra.size()-1;i++){
                    cadena1 = cadena1 + letra.get(i).getLetra()+ " ";
                }
                if (cadena1.compareTo(mostrarCadena()) == 0 ) {
                    estado="Ganooooo!!!!!!";
                    return estado;
                }else{
                    estado="Jugando"; 
                    return estado;
                }
            }
        }else{
            return "";
        }
    }
}

