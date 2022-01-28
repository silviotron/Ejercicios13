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
public class Parte5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Set<Integer> c = new HashSet<>();
        Set<Integer> primos = new HashSet<>();
        int base = 2;
        int num = -1;        
        do {            
            System.out.print("Introduce el numero maximo: ");
            if(sc.hasNextInt()){
                num = sc.nextInt();
            }

        } while (num < 0);
        while(base * base <= num) {
            for (int i = base; base * i <= num; i++) {
            c.add(base * i);
            }
            base++;
        }
        for (int i = 2; i <= num; i++) {
            primos.add(i);
        }
        primos.removeAll(c);
        System.out.println(primos);
        
    }
    
}
