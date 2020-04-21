/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

import java.util.Scanner;


/**
 *
 * @author JM
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite o seu Nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a Sua Idade: ");
        int idade = teclado.nextInt();
        //String valor =  Integer.toString(idade);
        
        System.out.printf("Olá, %s a sua Idade é: %d \n", nome, idade);
      */  
      
        String valor = "30.5";
        //int idade = Integer.parseInt(valor);
        float idade = Float.parseFloat(valor);
        System.out.printf("A idade é: %.3f \n", idade);
        
    }
    
}
