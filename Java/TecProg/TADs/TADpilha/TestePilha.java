package TADs.TADpilha;

public class TestePilha {
    public static void main(String[] args) {
        InterfacePilha pilhaEncadeada = new PilhaEncadeada();

        /*comentario em bloco */
        
        pilhaEncadeada.empilhar(10);
        pilhaEncadeada.empilhar(20);
        pilhaEncadeada.empilhar(30);
        pilhaEncadeada.empilhar(40);
        pilhaEncadeada.empilhar(50);
        pilhaEncadeada.empilhar(60);
        pilhaEncadeada.empilhar(70);
        


        System.out.println("\n----- Após empilhar os dados -----");
        System.out.println(pilhaEncadeada);

        System.out.println("\n----- Após desempilhar 1 dado -----");
        pilhaEncadeada.desempilhar();
        System.out.println(pilhaEncadeada);

        System.out.println("\n----- Após desempilhar 3 dados -----");
        pilhaEncadeada.desempilhar();
        pilhaEncadeada.desempilhar();
        pilhaEncadeada.desempilhar();
        System.out.println(pilhaEncadeada);

        System.out.println("\n----- Obtenção do topo da pilha -----");
        System.out.println(pilhaEncadeada.obterTopo());

        System.out.println("\n----- Verificação se a pilha está vazia -----");
        pilhaEncadeada.verificarVazia();

        /*
        System.out.println("\n----- Após desempilhar 3 dados, nova verificação de vazia -----");
        pilhaEncadeada.desempilhar();
        
        pilhaEncadeada.desempilhar();
        pilhaEncadeada.desempilhar();
        pilhaEncadeada.verificarVazia();
        */

        PilhaEncadeada pilha2 = new PilhaEncadeada();

        pilha2.empilhar(10);
        pilha2.empilhar(20);
        pilha2.empilhar(30);

        int resultado = pilhaEncadeada.compararPilhas(pilha2);
        if(resultado == 1) {
            System.out.println("\nAs pilhas são iguais.");
        } else {
            System.out.println("\nAs pilhas não são iguais.");
        }

        pilha2.empilhar(40); // Modificando a segunda pilha

        resultado = pilhaEncadeada.compararPilhas(pilha2);
        if(resultado == 1) {
            System.out.println("\nAs pilhas são iguais.");
        } else {
            System.out.println("\nAs pilhas não são iguais.");
        }
    }
}
