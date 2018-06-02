/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionsoftware;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorgejlhc
 */
public class GestionSoftware {
//Prueba cambio
    /**
     * @param args the command line arguments
     */
    
    
    private int ContarPalabras(String texto) {
        int palabas = texto.split(" ").length;
        return palabas;
    }
    
    private int NumeroDeCaracteresConEspacios(String texto) {
        int caracteresconespacio = texto.length();
        return caracteresconespacio;
    }
    
    
    private int NumeroDeEspacios(String texto) {
        int numerodeespacios = texto.split(" ").length-1;
        return numerodeespacios;
    }
    
    private int NumeroDeCaracteresSinEspacios(String texto) {
        int caracteressinespacio = NumeroDeCaracteresConEspacios(texto)-NumeroDeEspacios(texto);
        return caracteressinespacio;
    }
    
    private int NumeroDePalabras(String texto) {
        int numerodeespacios = texto.split(" ").length;
        return numerodeespacios;
    }
    
    public static void main(String args[]){
        GestionSoftware gs = new GestionSoftware();
        Scanner reader = new Scanner(System.in);
        String texto = "";   
        do {			
            try {
                    System.out.println("Ingrese un una cadena de texto.");
                    texto = reader.nextLine();
                    if(texto.isEmpty()){
                        System.out.println("La cadena de texto no puede estar vacia");
                        System.out.println("\n");
                        continue;
                    }
                    System.out.println("La cadena de texto es: " + texto);
                    
                    System.out.println("El numero de caracteres en la cadena, incluyendo los espacios es de : " + gs.NumeroDeCaracteresConEspacios(texto));
                    System.out.println("El numero de caracteres en la cadena, sin incluir los espacios es de : " + gs.NumeroDeCaracteresSinEspacios(texto));
                    System.out.println("El numero de espacios en la cadena es de : " + gs.NumeroDeEspacios(texto));
                    System.out.println("El numero de palabras en la cadena es de : " + gs.NumeroDePalabras(texto));
                    System.out.println("\n");
                } catch (InputMismatchException exe){
                  System.out.println("Caracter no valido");
                  System.out.println("\n");
                  reader.next();
                }
          } while (!"salir".equals(texto));
    }
    
}
