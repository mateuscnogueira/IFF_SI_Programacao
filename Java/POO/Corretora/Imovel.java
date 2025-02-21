package POO.Corretora;

public class Imovel {
    protected String endereco = new String();
    protected double preco;

    public Imovel(String endereo, double preco) {
        this.endereco = endereo;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
