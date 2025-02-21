package POO.Ex5;

public class Velho extends Imovel{
    private double desconto;

    public Velho(double desconto, String endereco, double preco) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void imprimirValorImovelVelho() {
        System.out.println("\nO valor do imóvel velho é: " + (this.preco - this.desconto));
    }
}
