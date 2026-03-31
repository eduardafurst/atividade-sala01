/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.sala01;

import java.util.Scanner;

/**
 *
 * @author 326120153
 */
public class ExercicioSala01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
        
        int n;

        System.out.print("Digite n: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
        
        entrada.close();
    }
}
