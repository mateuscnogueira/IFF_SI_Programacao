package p2_tp_mateusnogueira;

public class ListaPersonalidades implements ColecaoDePersonalidades {

    private Elemento inicial;
    private int totalDePersonalidades;

    public ListaPersonalidades() {
        this.inicial = null;
        this.totalDePersonalidades = 0;
    }

    public Elemento obterInicial() {
        return this.inicial;
    }

    @Override
    public void adicionarPersonalidade(Personalidade personalidade) {
        Elemento novo = new Elemento(personalidade);
        if (this.inicial == null) {
            this.inicial = novo;
        } else {
            Elemento atual = this.inicial;
            while (atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novo);
        }
        this.totalDePersonalidades++;
    }

    @Override
    public void excluirPersonalidade(String nome) {
        Elemento atual = this.inicial;
        Elemento anterior = null;

        while(atual.obterProximo() != null && atual.obterPersonalidade().obterNome() != nome) {
            anterior = atual;
            atual = atual.obterProximo();
        }
        if(atual.obterPersonalidade().obterNome() == nome) {
            if(anterior == null) {
                this.inicial = atual.obterProximo();
            } else {
                anterior.definirProximo(atual.obterProximo());
            }
        }
        this.totalDePersonalidades--;
    }

    @Override
    public Personalidade obterPersonalidade(int posicaoDaPersonalidade) {

        Elemento atual = this.inicial;
        int posicaoAtual = 0;

        while(atual.obterProximo() != null && posicaoAtual < posicaoDaPersonalidade) {
            atual = atual.obterProximo();
            posicaoAtual++;
        }

        return atual.obterPersonalidade();
    }

    @Override
    public int totalDePersonalidades() {
        return this.totalDePersonalidades;
    }

    @Override
    public void trocarPosicaoEntrePersonalidades(int posicaoDaPersonalidade1, int posicaoDaPersonalidade2) {
        Elemento atual1 = this.inicial;
        Elemento atual2 = this.inicial;
        int posicao1 = 0, posicao2 = 0;

        while (posicao1 < posicaoDaPersonalidade1 && atual1 != null) {
            atual1 = atual1.obterProximo();
            posicao1++;
        }

        while (posicao2 < posicaoDaPersonalidade2 && atual2 != null) {
            atual2 = atual2.obterProximo();
            posicao2++;
        }

        if (atual1 != null && atual2 != null) {
            Personalidade aux = atual1.obterPersonalidade();
            atual1.definirPersonalidade(atual2.obterPersonalidade());
            atual2.definirPersonalidade(aux);
        }
    }
    
    @Override
    public void alterarPersonalidade(int posicaoDaPersonalidade, Personalidade novaPersonalidade) {
        if (posicaoDaPersonalidade > 0) {
            Elemento atual = this.inicial;
            int posicaoAtual = 0;
            while (posicaoAtual < posicaoDaPersonalidade && atual != null) {
                atual = atual.obterProximo();
                posicaoAtual++;
            }

            if (atual != null) {
                atual.definirPersonalidade(novaPersonalidade);
            }
        } else {
            System.out.println("Posição inválida por ser menor que 0");
        }

    }

    @Override
    public void ordenarPersonalidade(Ordenador ordenador) {
        ordenador.ordenar(this);
    }
    
}
 
