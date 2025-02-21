package TADs.TADfila;

public class FilaEncadeada implements InterfaceFila {

    Elemento inicial = null;
    Elemento ultimo = null;
    int totalDeElementos = 0;

    @Override
    public void adicionarElemento(int dado) {
        Elemento novo = new Elemento(dado);
        if(ultimo != null) {
            ultimo.definirProximo(novo);
        }
        ultimo = novo;
        if(inicial == null) {
            inicial = novo;
        }
        this.totalDeElementos++;
    }

    @Override
    public void excluirElemento() {
        if(inicial != null) {
            inicial = inicial.obterProximo();

            if(inicial == null) {
                ultimo = null;
            }
        } else {
            System.out.println("Fila vazia não possui elementos para exclusão");
        }
    }

    @Override
    public int obterPrimeiro() {
        if(inicial != null) {
            return inicial.obterDado();
        } else {
            System.out.println("Fila vazia");
            return -1;
        }
    }

    @Override
    public boolean verificarVazia() {
        return inicial == null;
    }

    @Override
    public String toString() {
        String resultado = "Fila: ";
        Elemento atual = inicial;

        while(atual != null) {

            resultado = resultado + atual.obterDado() + ", ";
            atual = atual.obterProximo();
        }
        return resultado;
    }


    
}
