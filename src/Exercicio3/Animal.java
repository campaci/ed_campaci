/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author Aluno
 */
public class Animal {

    private String nome;
    private String cor;
    private double tamanho;

    public Animal(String n, String c, double t) {
        nome = n;
        cor = c;
        tamanho = t;
    }

    public void displayAnimal() {
        System.out.println(" Nome    : " + nome);
        System.out.println(" Cor     : " + cor);
        System.out.println(" Tamanho : " + tamanho);
    }
    
    public String getNome() { 
        return nome; 
    }
   
    public String getCor() {
        return cor;
    }
    
    public double getTamanho() {
        return tamanho;
    }
}
