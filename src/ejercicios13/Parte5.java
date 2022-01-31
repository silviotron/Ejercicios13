/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
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
        Set<Long> c = new HashSet<>();
        Set<Long> primos = new TreeSet<>();
        long num = -1;        
        do {            
            System.out.print("Introduce el numero maximo: ");
            if(sc.hasNextInt()){
                num = sc.nextInt();
            }
            sc.nextLine();
            
        } while (num < 0);
        for(long i = 2;i * i <= num; i ++) {
            if(!c.contains(i)){
                for (long j = i; i * j <= num; j++) {
                c.add(i * j);
                }
            }
        }
        for (long i = 2; i <= num; i++) {
            primos.add(i);
        }
        primos.removeAll(c);
        System.out.println(primos);
        System.out.println("total: " + primos.size());
//        for (long i = 2; i <= num; i++) {
//            if(!c.contains(i)){
//            primos.add(i);
//    
//            }
//        }
//        System.out.println(primos);
    }
    
}
