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
public class Parte3 {
    
    private static Set<Character> c1;
    private static Set<Character> c2;
    private static java.util.Scanner sc;    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Character> c1 = new HashSet<>();
        Set<Character> c2 = new HashSet<>();
        sc = new java.util.Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase1 = sc.nextLine().toLowerCase().replaceAll("[^A-Za-z]", "");
        System.out.print("Introduce otra frase: ");
        String frase2 = sc.nextLine().toLowerCase().replaceAll("[^A-Za-z]", "");
        char[] array1 = frase1.toCharArray();
        char[] array2 = frase2.toCharArray();
        for (int i = 0; i < array1.length; i++) {
            c1.add(array1[i]);
            
        }
        for (int i = 0; i < array2.length; i++) {
            c2.add(array2[i]);
            
        }
        System.out.println(c1.equals(c2)?frase1 + " y " + frase2 + " contienen las mismas letras":frase1 + " y " + frase2 + " no contienen las mismas letras");

    }
    
}
