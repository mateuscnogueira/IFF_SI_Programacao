package ProjetoOO.STeleMed.Administradores;

public class Elemento {
    private Administrador administrador;
    private Elemento proximo;

    public Elemento(Administrador administrador) {
        this.administrador = administrador;
        this.proximo = null;
    }

    public Administrador obterAdministrador() {
        return administrador;
    }
    public void definirAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Elemento obterProximo() {
        return proximo;
    }
    public void definirProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}