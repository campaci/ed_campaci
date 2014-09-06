/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioAvancado;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuaria {
    public static void main(String[] args)
          {
              int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              Estrutura e = new Estrutura(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradaint = new Scanner (System.in);
              Scanner entradadouble = new Scanner (System.in);
              System.out.println("Bem Vindo ao Programa de Jogadores de Basquete!!!");
              
              for (int i = 1; i < 6; i++) {
                 System.out.println("Digite o nome " + i);
                 String nome = entrada.nextLine();
                 System.out.println("Digite a idade do(a) " + nome);
                 int idade = entradaint.nextInt();
                 System.out.println("Digite a altura do(a) " + nome);
                 double altura = entradadouble.nextDouble();
                 e.insert(nome, idade, altura);
              }

              System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma letra");

              if (!e.findAd(entrada.nextLine()))
                  System.out.println("Não encontrado nenhum nome!!");
              
              System.out.println("Digite um nome para buscar:");
              
              int posicao = e.findByName(entrada.nextLine());
              
              if (posicao != e.size())
                    System.out.println("Encontrei na posicao" + posicao );
              else
                    System.out.println("Não encontrado");
              
              System.out.println("Digite um nome ser removido:");
              
              if (e.delete(entrada.nextLine()))   
                    System.out.println("Removido!!!");
              else  
                   System.out.println("Não encontrado!!!");  
              
              e.display();
          }      
          
}