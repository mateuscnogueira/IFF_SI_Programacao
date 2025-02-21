package POO.Informacoes;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Spoke", "Pitbull");
        Gato g1 = new Gato("Garfield", "Laranja");

        Rica r1 = new Rica(1000000000.00, "Cela", 22);
        Pobre p1 = new Pobre("Cleiton", 40);
        Miseravel m1 = new Miseravel("Jurandi", 36);

        System.out.println(c1.late());
        System.out.println(g1.mia());

        r1.fazCompras();
        p1.trabalha();
        m1.mendiga();
    }
}
