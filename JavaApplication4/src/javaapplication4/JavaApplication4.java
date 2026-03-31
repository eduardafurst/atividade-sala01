/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author 326120153
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador = 0;
        
        for (int i = 1; i <= 1000; i++) {
       
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                contador++;
            }
        }
        
        System.out.println("A quantidade de múltiplos de 2, 3 ou 5 entre 1 e 1000 é: " + contador);
    }
}
