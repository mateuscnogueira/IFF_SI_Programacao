package TADs.Estudo.Estudo_Pilha;

public interface InterfacePilha<T> {

    public void empilhar(T dado);

    public void desempilhar();

    public T obterTopo();

    public boolean verificarVazio();

    public String toString();
}
