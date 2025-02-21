package POO.Festa;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.println("Valor: " + this.valor);
    }

}
