package POO.Corretora;

public class Main {
    public static void main(String[] args) {
        Novo n1 = new Novo(100000, "Tamandaré", 100000);
        Velho v1 = new Velho(30000, "Penha", 100000);

        n1.imprimirValorImovelNovo();
        v1.imprimirValorImovelVelho();
    }
}
