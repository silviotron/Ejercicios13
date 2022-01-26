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
public class Parte4 {
    
    private static Set<Character> c;
    private static java.util.Scanner sc;    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Character> c = new HashSet<>();

        sc = new java.util.Scanner(System.in);
        System.out.print("Introduce las letras: ");
        String frase1 = sc.nextLine().toLowerCase();
        System.out.print("Introduce la frase: ");
        String frase2 = sc.nextLine().toLowerCase();
        frase1 = frase1.replaceAll("[^A-Za-z]", "");
        char[] array1 = frase1.toCharArray();
        char[] array2 = frase2.toCharArray();
        boolean condicion = true;
        for (int i = 0; i < array2.length; i++) {
            c.add(array2[i]);
            
        }
        for (int i = 0; i < array1.length; i++) {
            if(!c.contains(array1[i])){
                condicion = false;
            }
            
        }

        System.out.println(condicion
                ?frase1 + ", " + frase2 + ". La frase SI contiene al menos una vez todas las letras introducidas"
                :frase1 + ", " + frase2 + ". La frase NO contiene al menos una vez todas las letras introducidas");

    }
    
}
