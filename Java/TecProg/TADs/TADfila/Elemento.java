package TADs.TADfila;

public class Elemento {
    private int dado;
    private Elemento proximo;

    public Elemento(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public int obterDado() {
		return dado;
	}

	public void definirDado(int dado) {
		this.dado = dado;
	}

	public Elemento obterProximo() {
		return proximo;
	}

	public void definirProximo(Elemento proximo) {
		this.proximo = proximo;
	}
}
