package p2_tp_mateusnogueira;

public class Elemento {
    private Personalidade personalidade;
    private Elemento proximo;

    public Elemento(Personalidade personalidade) {
        this.personalidade = personalidade;
        this.proximo = null;
    }

    public Personalidade obterPersonalidade() {
        return personalidade;
    }
    public void definirPersonalidade(Personalidade personalidade) {
        this.personalidade = personalidade;
    }

    public Elemento obterProximo() {
        return proximo;
    }
    public void definirProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
