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
    public class Parte1 {
    private static Set<Integer> conjunto;
    private static java.util.Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        sc = new java.util.Scanner(System.in);
        int n = -2;
        do {            
            System.out.println("Inserte un número");
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n != -1){
                    if(!conjunto.add(n)){
                        System.out.println("no se ha podido insertar el numero: "+ n + ". el elemento ya existe");
                    }
                }
            }
            else{
                System.out.println("debe insertar un numero entero");
            }
            sc.nextLine();
            
        } while (n != -1);
    }
    
}
