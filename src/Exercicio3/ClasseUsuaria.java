/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClasseUsuaria {
    
     public static void main(String[] args) {
         
         int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              Estrutura arr = new Estrutura(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradadouble = new Scanner (System.in);
              System.out.println("Bem Vindo ao Programa de Vetores!!!");
              
              for (int i = 1; i < 6; i++) {
                 System.out.println("Digite o nome do Animal " + i);
                 String nome = entrada.nextLine();
                 System.out.println("Digite a cor do(a) " + nome);
                 String cor = entrada.nextLine();
                 System.out.println("Digite o tamanho do(a) " + nome);
                 double tamanho = entradadouble.nextDouble();
                 arr.insert(nome, cor, tamanho);
              }
              
              System.out.println("Vamos ver se esta ordenado por nome:");
              
              arr.display();
              
              System.out.println("Muito bem! Vamos fazer uma busca binária de um nome? Digite:");
              
              int posicao = arr.findByName(entrada.nextLine());
              
              if (posicao != arr.size())
                    System.out.println("Encontrei na posicao " + posicao );
              else
                    System.out.println("Não encontrado");
              
              arr.inserttonSort();
              System.out.println("Acabei de ordenar os dados por tamanho, ok?");
              
              arr.display();
         
                                     
              arr.insertconSort();
              System.out.println("Acabei de ordenar os dados por cor, ok?");
              
              arr.display();
   
          }      
     }
