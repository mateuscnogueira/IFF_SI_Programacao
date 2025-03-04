package ProjetoOO.STeleMed.Pacientes;

public class Elemento {
    private Paciente paciente;
    private Elemento proximo;

    public Elemento(Paciente paciente) {
        this.paciente = paciente;
        this.proximo = null;
    }

    public Paciente obterPaciente() {
        return paciente;
    }
    public void definirPacobterPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Elemento obterProximo() {
        return proximo;
    }
    public void definirProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}