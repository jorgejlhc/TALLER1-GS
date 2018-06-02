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
 * @version 1.0
 * @since 02/06/2018
 */
public class GestionSoftware {
    
    
    /**
     * 
     * Este metodo recibe un String y retorna el numero de 
     * palabras separadas por un espacio (" ").
     * @param texto es el parametro del metodo ContarPalabras
     * @return int retorna la cantidad de palabras
     */
    private int ContarPalabras(String texto) {
        int palabas = texto.split(" ").length;
        return palabas;
    }
    
    /**
     * 
     * Este metodo cuenta los espacios. 
     * recibe un String y retorna el numero de
     * caracteres del String.
     * @param texto es el parametro del metodo NumeroDeCaracteresConEspacios
     * @return int retorna la cantidad de caracteres de un String
     */
    private int NumeroDeCaracteresConEspacios(String texto) {
        int caracteresconespacio = texto.length();
        return caracteresconespacio;
    }
    
    /**
     * 
     * Este metodo recibe un String y retorna el numero de
     * espacios del String.
     * @param texto es el parametro del metodo NumeroDeEspacios
     * @return int retorna la cantidad de espacios.
     */
    private int NumeroDeEspacios(String texto) {
        int numerodeespacios = texto.split(" ").length-1;
        return numerodeespacios;
    }
    /**
     * Este metodo recibe un String y retorna el numero de
     * caracteres sin espacio.
     * @param texto es el parametro del metodo NumeroDeCaracteresSinEspacios
     * @return int retorna la cantidad de caracteres sin espacios.
     */
    private int NumeroDeCaracteresSinEspacios(String texto) {
        int caracteressinespacio = NumeroDeCaracteresConEspacios(texto)-NumeroDeEspacios(texto);
        return caracteressinespacio;
    }
    /**
     * 
     * @param texto
     * @return 
     */
    private int NumeroDePalabras(String texto) {
        int numerodeespacios = texto.split(" ").length;
        return numerodeespacios;
    }
    
    /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */
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
