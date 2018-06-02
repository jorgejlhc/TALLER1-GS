/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionsoftware;

/**
 *
 * @author lenovo-G40
 */
public class Texto {
    
    String texto;
    public Texto() {
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
         
    public int NumeroDeCaracteresConEspacios() {
        int caracteresconespacio = texto.length();
        return caracteresconespacio;
    }
    
    
    public int NumeroDeEspacios() {
        int numerodeespacios = texto.split(" ").length-1;
        return numerodeespacios;
    }
    
    public int NumeroDeCaracteresSinEspacios() {
        int caracteressinespacio = NumeroDeCaracteresConEspacios()-NumeroDeEspacios();
        return caracteressinespacio;
    }
    
    public int NumeroDePalabras() {
        int numerodeespacios = texto.split(" ").length;
        return numerodeespacios;
    }
}
