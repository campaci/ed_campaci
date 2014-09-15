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
public class Estrutura {

    private Animal[] a;                 // cria a referência para um vetor do tipo Pessoa
    private int nElems;

    public Estrutura(int max) // método construtor
    {
        a = new Animal[max];                 // cria o vetor ...
        nElems = 0;                        // inicialmente sem itens ...
    }
    
     public int size() { 
          return nElems; 
     }
     
     public int findByName(String searchKey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getNome().equals(searchKey)) //mudamos aqui para comparar nome
            return curIn;              // encontrei!
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
             //O metodo compareTo do tipo String, retorna positivo se a primeira
             //String for maior que a segunda e negativo se for o contrário
            if(a[curIn].getNome().compareTo(searchKey) < 0) //mudamos aqui para comparar nome
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária()  
     
     
     public void insert(String n, String c, double t)    // insere o elemento no vetor
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
          //usamos aqui o metodo compareTo para String
          if (a[j].getNome().compareTo(n) > 0) //mudado
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      //Apos abrir um espaço no lugar certo, ele cria o nome objeto Pessoa na posição aberta!!!
      a[j] = new Animal(n, c, t);                  // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção
     
     public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         a[j].displayAnimal();
      }
     
     public void inserttonSort()
      {
      int in, out;

      for(out=1; out<nElems; out++)     // vamos rodar até o final do vetor
         {
         Animal temp = a[out];            // jogamos em uma variável (Pessoa) temporária o item marcado
         in = out;                      // inicializamos a variavel in, que ira receber o valor a esquerda
         while(in>0 && a[in-1].getTamanho() >= temp.getTamanho()) // enquanto o item a esquerda for maior que o marcado ...
                       
         {
            a[in] = a[in-1];            // ...nós fazemos eles pularem uma casa a direita
            --in;                       
            }                           // ... quando o item for menor, ele nao pula!
         a[in] = temp;                  // ...inserimos o valor marcado na posição que ficou "livre", ou seja,
                                        // onde estava o último item a esquerda maior que o marcado
         }  // end for
      }  // end insertionSort()
     
     public void insertconSort(String[] cor)
      {
      int in, out;

      for(out=1; out<nElems; out++)     // vamos rodar até o final do vetor
         {
         Animal temp = a[out];            // jogamos em uma variável (Animal) temporária o item marcado
         in = out;                      // inicializamos a variavel in, que ira receber o valor a esquerda
         while(in>0 && a[in-1].getCor().compareTo(cor) < 0) // enquanto o item a esquerda for maior que o marcado ...
                       
         {
            a[in] = a[in-1];            // ...nós fazemos eles pularem uma casa a direita
            --in;                       
            }                           // ... quando o item for menor, ele nao pula!
         a[in] = temp;                  // ...inserimos o valor marcado na posição que ficou "livre", ou seja,
                                        // onde estava o último item a esquerda maior que o marcado
         }  // end for
      }  // end insertionSort()
}
