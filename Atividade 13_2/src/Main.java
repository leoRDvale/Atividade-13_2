import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /* Criar uma aplicação para gerar 1000 números aleatórios de -9999 a 9999 e armazená-los  num vetor de 1000 posições. 
        * Faça a impressão desses números na sua ordem de geração. Crie uma lista duplamente encadeada e vá inserindo os números 
        * presentes no vetor na lista encadeada. Porém cada número deverá ser colocado na sua posição correta na lista duplamente 
        * encadeada, ou seja,  serão inseridos em ordem crescente na lista. Imprima lista em ordem crescente e depois em ordem decrescente. 
        *O vetor deve ser percorrido (o vetor não deve ser ordenado), e o número será inserido na posição correta na lista */

        Random rand = new Random();
        int[] vetor = new int[1000];
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("Vetor gerado:");
        for (int i = 0; i < 1000; i++) {
            vetor[i] = rand.nextInt(9999) - 9999;
            System.out.print(vetor[i] + " ");
            lista.inserirOrdenado(vetor[i]);
        }
        System.out.println("\n\nLista em ordem crescente:");
        lista.imprimirCrescente();

        System.out.println("\nLista em ordem decrescente:");
        lista.imprimirDecrescente();


        lista.removerPrimos();
        System.out.println("\nLista após remover números primos:");

        lista.imprimirCrescente();
    }
}

