package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Aluno (Campaci Software Corporation)
 */
public class Campaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
          String[] StringVetor = new String[5]; //Instanciando o vetor
          Scanner entrada = new Scanner (System.in); //Instanciando o objeto entrada do tipo Scanner
          boolean teste = false;
                    
          System.out.println("Você está executando o Programa de Vetores!!!");
          System.out.println("Digite o 1º nome: ");
          StringVetor[0] = entrada.nextLine();
          System.out.println("Digite o 2º nome: ");
          StringVetor[1] = entrada.nextLine();
          System.out.println("Digite o 3º nome: ");
          StringVetor[2] = entrada.nextLine();
          System.out.println("Digite o 4º nome: ");
          StringVetor[3] = entrada.nextLine();
          System.out.println("Digite o 5º nome: ");
          StringVetor[4] = entrada.nextLine();

          System.out.println("Agora com os nomes cadastrados, digite uma letra: ");
          String busca = entrada.nextLine(); //Pegar com o usuario a letra da busca
          
          for (int i = 0; i < 5; i++) {   //Varremos o vetor neste for ... 
             
            if (StringVetor[i].charAt(0) == busca.charAt(0)) { //Comparamos o primeiro caracter 
                System.out.println("Esse nome " + StringVetor[i] + " começa com a letra " + busca ); 
                teste = true;
            }
            }
          
           if (!teste) { //Se não haver nenhum nome essa letra, imprimimos isso ...
            System.out.println("Nenhum nome começa com a letra: " + busca);
           }
                  
      }  // termina o metodo main
    }
}
