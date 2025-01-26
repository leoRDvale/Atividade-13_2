import java.util.Random;

public class Main {
    public static void main(String[] args) {

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

