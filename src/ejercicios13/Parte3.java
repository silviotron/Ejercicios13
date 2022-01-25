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
    
    private static Set<String> c1;
    private static Set<String> c2;
    private static java.util.Scanner sc;    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> c1 = new HashSet<>();
        Set<String> c2 = new HashSet<>();
        sc = new java.util.Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase1 = sc.nextLine();
        System.out.print("Introduce otra frase: ");
        String frase2 = sc.nextLine();
    }
    
}
