package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author JM
 * Finalidade: Desenvolver conhecimentos em Tipos de Dados Primitivos, bem como 
 * Saída de Dados, utilização da condição IF encadeada.
 * Objetivo: Avaliação de Conhecimentos.
 * 
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a Primeira Nota: ");
        float nota1 = teclado.nextFloat();
        //System.out.printf("Sua nota é: %.1f \n", nota1);
        
        System.out.print("Digite a Segunda Nota: ");
        float nota2 = teclado.nextFloat();
        //System.out.printf("Sua nota é: %.1f \n",  nota2);
        
        System.out.print("Digite a Terceira Nota: ");
        float nota3 = teclado.nextFloat();
        //System.out.printf("Sua nota é: %.1f \n", nota3);
        
        float media = ((nota1 + nota2 + nota3 ) / 3);
        //Utilização na Saída de Dados format.
        System.out.format("A média de %s é: %.1f \n", nome, media);
      
        if((media >= 7) && (media <= 10)){
            System.out.printf("A Situação de %s é: APROVADO!!! \n", nome);
        }else
            if(media >= 4){
                   System.out.printf("A Situação de %s é: RECUPERAÇÃO!!! \n", nome); 
            }            
            else{
                    System.out.printf("A Situação de %s é: REPROVADO!!! \n", nome);
                    
                }
        //Utilização na Saída de Dados format.       
        System.out.format("Isso %s é consequência das suas escolhas, logo gerou a sua média %.1f \n", nome, media);
      
        
        
    }
    
}
