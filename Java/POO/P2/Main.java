package POO.P2;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Cliente c1 = new Cliente(01, null, null, null, null);
        Assinatura a1 = new Assinatura(null, "01/01/2002", 0, c1);
        
        c1.realizarCadastro();
        System.out.println(a1.cadastrarPlano(c1));
        a1.calcularPreco();
        a1.pagarPlano();
    }
}
