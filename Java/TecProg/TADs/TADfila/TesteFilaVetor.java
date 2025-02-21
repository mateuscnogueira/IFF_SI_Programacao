package TADs.TADfila;

public class TesteFilaVetor {
    public static void main(String[] args) {
        FilaVetor fila = new FilaVetor();

        fila.adicionarElemento(10);
        fila.adicionarElemento(20);
        fila.adicionarElemento(30);

        System.out.println(fila);

        System.out.println("Primeiro elemento: " + fila.obterPrimeiro());

        fila.excluirElemento();
        System.out.println("Após excluir um elemento: " + fila);

        fila.excluirElemento();
        fila.excluirElemento();
        System.out.println("Fila após excluir todos os elementos: " + fila);

        System.out.println("Fila está vazia? " + fila.verificarVazia());
    }
}

