package TADs.TADpilha;

public class TestePilhaVetor {
    public static void main(String[] args) {
        InterfacePilha PilhaVetor = new PilhaVetor();
    
        /*comentario em bloco */
        
        PilhaVetor.empilhar(10);
        PilhaVetor.empilhar(20);
        PilhaVetor.empilhar(30);
        PilhaVetor.empilhar(40);
        PilhaVetor.empilhar(50);
        PilhaVetor.empilhar(60);
        PilhaVetor.empilhar(70);
    
        System.out.println("\n----- Após empilhar os dados -----");
        System.out.println(PilhaVetor);
    
        System.out.println("\n----- Após desempilhar 1 dado -----");
        PilhaVetor.desempilhar();
        System.out.println(PilhaVetor);
    
        System.out.println("\n----- Após desempilhar 3 dados -----");
        PilhaVetor.desempilhar();
        PilhaVetor.desempilhar();
        PilhaVetor.desempilhar();
        System.out.println(PilhaVetor);
    
        System.out.println("\n----- Obtenção do topo da pilha -----");
        System.out.println(PilhaVetor.obterTopo());
    
        System.out.println("\n----- Verificação se a pilha está vazia -----");
        PilhaVetor.verificarVazia();
    
        System.out.println("\n----- Após desempilhar 3 dados, nova verificação de vazia -----");
        PilhaVetor.desempilhar();
        PilhaVetor.desempilhar();
        PilhaVetor.desempilhar();
        PilhaVetor.verificarVazia();
    }
}
