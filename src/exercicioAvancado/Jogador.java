/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioAvancado;

/**
 *
 * @author Aluno
 */
public class Jogador { 
   private String nome;
   private int idade;
   private double altura;
//--------------------------------------------------------------
   public Jogador(String n, int id, double alt)
      {                               // comentario aqui
      nome = n;
      idade = id;
      altura = alt;
      }
//--------------------------------------------------------------
   public void displayJogador()
      {
      System.out.println(" Nome  : " + nome);
      System.out.println(" Idade : " + idade);
      System.out.println(" Altura: " + altura);
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
   }  //