public class ListaDuplamenteEncadeada {
    private No cabeca;

    private static class No {
        int valor;
        No anterior;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }

    public ListaDuplamenteEncadeada() {
        cabeca = null;
    }

    public void inserirOrdenado(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null || cabeca.valor >= valor) {
            novoNo.proximo = cabeca;
            if (cabeca != null) {
                cabeca.anterior = novoNo;
            }
            cabeca = novoNo;
            return;
        }

        No atual = cabeca;
        while (atual.proximo != null && atual.proximo.valor < valor) {
            atual = atual.proximo;
        }

        novoNo.proximo = atual.proximo;
        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        }
        atual.proximo = novoNo;
        novoNo.anterior = atual;
    }

    public void imprimirCrescente() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirDecrescente() {
        No atual = cabeca;
        if (atual == null) return;

        // Vai até o último nó
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        // Imprime de trás para frente
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public boolean isPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void removerPrimos() {
        No atual = cabeca;
        while (atual != null) {
            if (isPrimo(atual.valor)) {
                // Remover nó atual
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    cabeca = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                }
            }
            atual = atual.proximo;
        }
    }
}
