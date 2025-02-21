package TADs.Estudo.Estudo_Pilha;

public class TestePilhaEncadeada {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //limpar o terminal antes de rodar o cod

        InterfacePilha pilha = new PilhaEncadeada<Integer>();

        System.out.println("\n----Verificando vazio----");
        System.out.println("A pilha está vazia? " + pilha.verificarVazio());

        System.out.println("\n----Empilhando----");
        pilha.empilhar(40);
        pilha.empilhar(30);
        pilha.empilhar(20);
        pilha.empilhar(10);
        System.out.println(pilha);

        System.out.println("\n----Desempilhando----");
        pilha.desempilhar();
        pilha.desempilhar();
        System.out.println(pilha);

        System.out.println("\n----Obtendo o topo----");
        System.out.println("O elemento do topo é: " + pilha.obterTopo());

        System.out.println("\n----Verificando vazio----");
        System.out.println("A pilha está vazia? " + pilha.verificarVazio());
    }
}