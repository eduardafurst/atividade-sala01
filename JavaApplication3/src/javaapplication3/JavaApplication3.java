/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author 326120153
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   System.out.println("Múltiplos de 2, 3 e 5 entre 1 e 1000:\n");

        for (int i = 1; i <= 1000; i++) {
            
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("Número: " + i + " (Múltiplo comum)");
            } 
            
                System.out.print(i + " ");
            }
    }
    
}