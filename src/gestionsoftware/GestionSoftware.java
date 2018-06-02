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

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]){
        
        Scanner reader = new Scanner(System.in);
        String texto = "";   
        do {			
            try {
                    int palabras = 0;
                    int caracteresConEspacios = 0;
                    int caracteresSinEspacios = 0;
                    int espacios = 0;
                    
                    System.out.println("Ingrese un una cadena de texto.");

                    texto = reader.nextLine();
                    //texto = "hola mundo ";
                    caracteresConEspacios = texto.length();                                                          
                    
                    System.out.println("La cadena de texto es: " + texto);
                    
                    
                    if(texto.isEmpty()){
                        System.out.println("La cadena de texto no puede estar vacia");
                        System.out.println("\n");
                        continue;
                    }
                   
                    
                    for(int i = 0; i < caracteresConEspacios; i++){
                      if (texto.charAt(i) == ' '){
                            espacios++;
                        } 
                      
                      //System.out.println("\n");
                    }
                    
                    caracteresSinEspacios = caracteresConEspacios - espacios;
                    
                    System.out.println("El numero de caracteres en la cadena, incluyendo los espacios es de : " + caracteresConEspacios);
                    System.out.println("El numero de caracteres en la cadena, sin incluir los espacios es de : " + caracteresSinEspacios);
                    System.out.println("El numero de espacios en la cadena es de : " + espacios);
                    System.out.println("\n");
                } catch (InputMismatchException exe){
                  System.out.println("Caracter no valido");
                  System.out.println("\n");
                  reader.next();
                }
          } while (!"salir".equals(texto));
    }
    
}
