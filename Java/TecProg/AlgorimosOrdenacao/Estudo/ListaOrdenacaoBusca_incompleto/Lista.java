package AlgorimosOrdenacao.Estudo.ListaOrdenacaoBusca_incompleto;

public class Lista implements InterfaceLista {

    Elemento inicial = null;
    int totalDeElementos = 0;

    @Override
    public void adicionarNoInicio(int dado) {
        Elemento novo = new Elemento(dado);

        novo.definirProximo(this.inicial);
        this.inicial = novo;
    }

    @Override
    public void removerDoFinal() {
        Elemento atual = this.inicial;
        Elemento anterior = null;

        if(atual != null) {
            while(atual.obterProximo() != null) {
                anterior = atual;
                atual = atual.obterProximo();
            }
            if(anterior != null) {
                anterior.definirProximo(null);
            } else {
                this.inicial = null;
            }
        }
    }

    @Override
    public int buscarDado(int dadoBuscado) {
        Elemento atual = this.inicial;

        while(atual != null) {
            if(dadoBuscado == atual.obterDado()) {
                return atual.obterDado();
            }
            atual = atual.obterProximo();
        }
        return -1;
    }
    
    @Override
    public String toString() {
        String elementos = new String();
        Elemento atual = this.inicial;

        while(atual != null) {
            elementos = elementos + atual.obterDado() + " ";
            atual = atual.obterProximo();
        }
        return "\nLista: [ " + elementos + "]";
        
    }

    @Override
    public void adicionarNoFinal(int dado) {
        Elemento novo = new Elemento(dado);
        Elemento atual = this.inicial;

        if(atual != null) {
            while(atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novo);
        } else {
            this.inicial = novo;
            //atual = novo;
        }
    }
}
