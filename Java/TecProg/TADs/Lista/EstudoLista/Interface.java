package TADs.Lista.EstudoLista;

public interface Interface {
    
    public void adicionarInicio(int dado);

    public void adicionarFinal(int dado);

    public void adicionarMeio(int dado, int posicaoDesejada);

    public void removerInicio();

    public void removerFinal();

    public void removerMeio(int posicaoExclusao);

    public int obterDado(int dado);

    public String toString();
}
