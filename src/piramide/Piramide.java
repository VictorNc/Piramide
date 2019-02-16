/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author Servers
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner piramide = new Scanner (System.in);
        System.out.println("Ingresa el tamaño de la piramide: ");
        int tam=piramide.nextInt();
        
        for (int i=0; i<tam; i++){
            for(int a=tam-i; a>0; a--){
                System.out.print("  ");
            }
            for (int b=0; b<i; b++){
                System.out.print("   *");
                
            }
            System.out.println("");
        }
        
    }
    
}
