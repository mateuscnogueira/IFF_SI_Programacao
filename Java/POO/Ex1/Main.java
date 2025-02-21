package POO.Ex1;

public class Main {
    public static void main(String[] args) {
        funcionario f1 = new funcionario();

        f1.nome = "Mateus";
        f1.salario = 18000;
        f1.bonifica(2000);
        f1.demite();

        f1.mostra();
    }
}
