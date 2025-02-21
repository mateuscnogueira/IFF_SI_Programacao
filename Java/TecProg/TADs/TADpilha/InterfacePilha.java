package TADs.TADpilha;

public interface InterfacePilha {
    
    public void empilhar(int dado);

    public void desempilhar();

    public int obterTopo();

    public boolean verificarVazia();

    public int compararPilhas(PilhaEncadeada outraPilha);

    public String toString();
}
