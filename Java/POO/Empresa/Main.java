package POO.Empresa;

public class Main {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("Mateus Nogueira");

        Administrativo a1 = new Administrativo(2000, "Noite", "008", "Romilton", "Administrativo");
        Tecnico t1 = new Tecnico(2000, "007", "Leandro", "Técnico");

        System.out.println(g1.exibirDados());

        System.out.println(a1.exibirDados());
        System.out.println(t1.exibirDados());
    }
}
