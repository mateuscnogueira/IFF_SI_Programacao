package POO.Festa;

public class CamaroteSuperior extends Vip{
    private double adicionalCamarote;
    
    public CamaroteSuperior(double adicionalCamarote, double adicionalVip, double valor) {
        super(adicionalVip, valor);
        this.adicionalCamarote = adicionalCamarote;
    }

    public double valorIngressoCamarote() {
        return this.valorIngressoVIP() + this.adicionalCamarote;
    }

    public void imprimirIngressoCamaroteSuperior() {
        System.out.println("\nIngresso Camarote Superior" + "\nValor: " + valorIngressoCamarote());
    }
}
