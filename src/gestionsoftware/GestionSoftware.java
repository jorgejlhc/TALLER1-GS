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
    

    public static void main(String args[]){
        Texto gs = new Texto();
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
                    gs.setTexto(texto);
                    System.out.println("El numero de caracteres en la cadena, incluyendo los espacios es de : " + gs.NumeroDeCaracteresConEspacios());
                     
                    System.out.println("\n");
                } catch (InputMismatchException exe){
                  System.out.println("Caracter no valido");
                  System.out.println("\n");
                  reader.next();
                }
          } while (!"salir".equals(texto));
    }
    
}
