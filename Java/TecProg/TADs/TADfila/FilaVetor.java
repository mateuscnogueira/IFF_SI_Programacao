package TADs.TADfila;

public class FilaVetor implements InterfaceFila {
    private int[] fila;
    private int inicial;
    private int ultimo;
    private int tamanho;

    public FilaVetor() {
        this.fila = new int[20];
        this.inicial = 0;
        this.ultimo = 0;
        this.tamanho = 0;
    }

    @Override
    public void adicionarElemento(int dado) {
        if (tamanho < 20) {
            fila[ultimo] = dado;
            ultimo = (ultimo + 1);
            tamanho++;
        } else {
            System.out.println("A fila está cheia, não é possível adicionar mais elementos.");
        }
    }

    @Override
    public void excluirElemento() {
        if (tamanho > 0) {
            inicial = (inicial + 1); 
            tamanho--;
        } else {
            System.out.println("A fila está vazia, não há elementos para excluir.");
        }
    }

    @Override
    public int obterPrimeiro() {
        if (tamanho > 0) {
            return fila[inicial];
        } else {
            System.out.println("A fila está vazia.");
            return -1; // Indicador de erro (fila vazia)
        }
    }

    @Override
    public boolean verificarVazia() {
        return tamanho == 0;
    }

    @Override
    public String toString() {
        String resultado = "Fila: ";
        if (tamanho > 0) {
            for (int i = inicial; i < ultimo; i++) {
                if (i > inicial) {
                    resultado += ", ";
                }
                resultado += fila[i];
            }
        }
        return resultado;
    }
}

