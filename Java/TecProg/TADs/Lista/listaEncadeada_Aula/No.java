package TADs.Lista.listaEncadeada_Aula;

public class No {
	private int dado;
	private No proximo;
	
	public No(int dado) {
		this.dado =  dado;
		this.proximo = null;
	}

	public int obterDado() {
		return dado;
	}

	public void definirDado(int dado) {
		this.dado = dado;
	}

	public No obterProximo() {
		return proximo;
	}

	public void definirProximo(No proximo) {
		this.proximo = proximo;
	}
	
}
