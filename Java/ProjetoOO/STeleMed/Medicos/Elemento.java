package ProjetoOO.STeleMed.Medicos;

public class Elemento {
    private Medico medico;
    private Elemento proximo;

    public Elemento(Medico medico) {
        this.medico = medico;
        this.proximo = null;
    }

    public Medico obterMedico() {
        return medico;
    }
    public void definirMedico(Medico medico) {
        this.medico = medico;
    }

    public Elemento obterProximo() {
        return proximo;
    }
    public void definirProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}