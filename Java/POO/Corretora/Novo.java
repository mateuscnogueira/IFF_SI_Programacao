package POO.Corretora;

public class Novo extends Imovel {
    private double adicional;

    public Novo(double adicional, String endereco, double preco) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void imprimirValorImovelNovo() {
        System.out.println("\nO valor do imóvel novo é: " + (this.preco + this.adicional));
    }
}
