package TADs.Estudo.Estudo_Lista;

public interface InterfaceLista<T> {

    public void adicionarInicio(T dado);

    public void adicionarFim(T dado);

    public void adicionarMeio(int posicaoInclusao, T dado);
	
	public boolean excluirInicio();
	
	public boolean excluirFim();
	
	public boolean excluirMeio(int posicaoExclusao);
	
	public void obterDado(int posicaoBuscada);
	
	public int obterTotalDeElementos();

    public String toString();
    
}
