package POO.Ex5;

public class Vip extends Ingresso{
    private double adicionalVip;

    public Vip(double adicionalVip, double Valor) {
        super(Valor);
        this.adicionalVip = adicionalVip;
    }

    public double getadicionalVip() {
        return adicionalVip;
    }
    public void setadicionalVip(double adicionalVip) {
        this.adicionalVip = adicionalVip;
    }

    public double valorIngressoVIP() {
        return this.valor + this.adicionalVip;
    }

    public void imprimirIngressoVIP() {
        System.out.println("\nIngresso VIP " + "\nValor: " + valorIngressoVIP());
    }
}
