package AlgorimosOrdenacao.Estudo.ListaOrdenacaoBusca_incompleto;

public interface InterfaceLista {
    
    public void adicionarNoInicio(int dado);

    public void adicionarNoFinal(int dado);

    public void removerDoFinal();

    public int buscarDado(int dado);

    public String toString();
}
