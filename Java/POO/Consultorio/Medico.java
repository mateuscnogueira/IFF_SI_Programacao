package POO.Consultorio;

public class Medico {
    private String nome = new String();
    private String crm = new String();
    private Especialidade esp;

    public Medico(String nome, String crm, Especialidade especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.esp = especialidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEsp() {
        return esp;
    }
    public void setEsp(Especialidade esp) {
        this.esp = esp;
    }

}
