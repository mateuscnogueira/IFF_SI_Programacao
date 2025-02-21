package POO.Festa;

public class Normal extends Ingresso{
    public Normal(double Valor) {
        super(Valor);
    }

    public void imprimirIngresso() {
        System.out.println("\nIngresso Normal");
        imprimirValor();
    }
}
