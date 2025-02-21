package POO.Ex5;

public class CamaroteInferior extends Vip {
    private String localizacao = new String();
    private double adicionalCamarote;

    public CamaroteInferior(String localizacao, double adicionalCamarote, double adicionalVip, double valor) {
        super(adicionalVip, valor);
        this.localizacao = localizacao;
        this.adicionalCamarote = adicionalCamarote;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.println("Localização: " + this.localizacao);
    }

    public double valorIngressoCamaroteInferior() {
        return this.valorIngressoVIP() + this.adicionalCamarote;
    }

    public void imprimirIngressoCamaroteInferior() {
        System.out.println("\nIngresso Camarote Inferior" + "\nValor: " + valorIngressoCamaroteInferior());
        imprimirLocalizacao();
    }
}
