package POO.aula3.quest1;

public class fatura {
        
    private String numero, descricao;
    private int quantidadeItem;
    private double preco, totalFatura;

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String n) {
        this.numero = n;
    }

    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String d) {
        this.descricao = d;
    }

    public int getQuantidadeItem() {
        return this.quantidadeItem;
    }
    public void setQuantidadeItem(int i) {
        this.quantidadeItem = i;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double p) {
        this.preco = p;
    }

    public double getTotalFatura() {
        return quantidadeItem*preco;
    }

    public fatura(String n, String d, int i, double p){
        this.numero = "n";
        this.descricao = d;
        this.quantidadeItem = i;
        this.preco = p;
    }
}
