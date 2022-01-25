/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios13;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Parte2 {
        
    private static Set<String> c;
    private static java.util.Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> c = new HashSet<>();
        sc = new java.util.Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        String[] array = frase.split(" ");
        for (String palabra : array) {
            c.add(palabra.toLowerCase());
        }
        System.out.println(c);
        String palabra;
        do {            
            System.out.print("inserte una palabra o 0 para salir: ");
            palabra = sc.nextLine().toLowerCase();
            if(!palabra.equals("0")){
                System.out.println(c.contains(palabra)?palabra + " si existe":palabra + " no existe");
            
            }

        } while (!palabra.equals("0"));
    }
    
}
