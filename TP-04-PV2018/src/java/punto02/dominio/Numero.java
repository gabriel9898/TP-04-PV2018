
package punto02.dominio;

import java.io.Serializable;

/**
 *
 * @author Sofia Soto
 */
public class Numero implements Serializable{
    private double Numero;

    public Numero(double Numero) {
        this.Numero = Numero;
    }
    public Numero() {
        
    }
    // se crean los get y set de Numero
    public double getNumero() {
        return Numero;
    }

    public void setNumero(double Numero) {
        this.Numero = Numero;
    }  
}
