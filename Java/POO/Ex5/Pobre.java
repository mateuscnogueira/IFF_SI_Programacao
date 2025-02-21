package POO.Ex5;

public class Pobre extends Pessoa {
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalha() {
        System.out.println("\nPobre fudido precisa trabalhar");
    }
}
