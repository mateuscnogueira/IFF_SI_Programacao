package TADs.Estudo.Estudo_Pilha;

public class TestePilhaSequencial {
    public static void main(String[] args) {
        InterfacePilha pilha = new PilhaSequencial<Integer>();

        System.out.println("A pilha está vazia? " + pilha.verificarVazio());

        pilha.empilhar(40);
        pilha.empilhar(30);
        pilha.empilhar(20);
        pilha.empilhar(10);
        System.out.println(pilha);

        pilha.desempilhar();
        pilha.desempilhar();
        System.out.println(pilha);

        System.out.println("\nA pilha está vazia? " + pilha.verificarVazio());

        System.out.println("\nO elemento do topo é: " + pilha.obterTopo());
    }
}
