package ProjetoOO.STeleMed.Financeiro;

public class Pagamento {
    private static int contadorIdPagamento = 1;
    private int idPagamento;
    private float valor;
    private String dataDePagamento = new String();
    private String status = new String();
    public Pagamento proximo; // Referência para o próximo pagamento na lista encadeada

    public Pagamento(float valor, String dataDePagamento, String status) {
        this.idPagamento = contadorIdPagamento++;
        this.valor = valor;
        this.dataDePagamento = dataDePagamento;
        this.status = status;
        this.proximo = null;
    }

    public int getIdPagamento() {
        return idPagamento;
    }
    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }
    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public Pagamento obterProximo() {
        return proximo;
    }
    public void definirProximo(Pagamento proximo) {
        this.proximo = proximo;
    }
}
