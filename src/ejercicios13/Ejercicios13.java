/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios13;

import java.util.Collection;

/**
 *
 * @author alumno
 */

public class Ejercicios13 {
    private static java.util.Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String seleccion = "";
        sc = new java.util.Scanner(System.in);
        do {
            
            seleccion = "";
            System.out.println("****************");
            System.out.println("*1. PArte 1    *");
            System.out.println("*2. Parte 2    *");
            System.out.println("*0. Salir      *");
            System.out.println("****************");
            seleccion = sc.nextLine();
            switch(seleccion){
                case "1":
                    Parte1.main(args);
                    break;
                case "2":
                    Parte2.main(args);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    
            }
            
        } while(!seleccion.equals("0"));
        
        
    }
    
}
