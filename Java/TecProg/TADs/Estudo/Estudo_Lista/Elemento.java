package TADs.Estudo.Estudo_Lista;

public class Elemento <T> {
    private T dado;
    private Elemento proximo;

    public Elemento(T dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public T obterDado() {
        return dado;
    }

    public void definirDado(T dado) {
        this.dado = dado;
    }

    public Elemento obterProximo() {
        return proximo;
    }

    public void definirProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
