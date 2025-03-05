package ProjetoOO.STeleMed.Financeiro;

public class PlanoDeSaude {
    private static int contadorIdPlano = 1;
    private int idPlano;
    private String nomePlano = new String();
    private String cobertura = new String();
    private double valor;
    public PlanoDeSaude proximo;

    public PlanoDeSaude(String nomePlano, String cobertura, double valor) {
        this.idPlano = contadorIdPlano++;
        this.nomePlano = nomePlano;
        this.cobertura = cobertura;
        this.valor = valor;
        this.proximo = null;
    }

    public int getIdPlano() {
        return idPlano;
    }
    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }
    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public PlanoDeSaude obterProximo() {
        return proximo;
    }
    public void definirProximo(PlanoDeSaude proximo) {
        this.proximo = proximo;
    }
}
