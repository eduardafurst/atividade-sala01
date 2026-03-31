/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 326120153
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            
            System.out.println("\n--- Tabuada do " + n + " ---");
            
            for (int i = 1; i <= 10; i++) {
                int resultado = n * i;
                System.out.printf("%d x %d = %d%n", n, i, resultado);
            }
            
            System.out.println("-----------------------");
        } else {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        }

        leitor.close();
    }
}