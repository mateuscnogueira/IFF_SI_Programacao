package POO.P2;

abstract class Usuario {
    protected String nome = new String();
    protected String cpf = new String();
    protected String email = new String();
    protected String telefone = new String();

    public Usuario(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void fazerLogin() {
        // Implementação do login
    }

    public void fazerLogout() {
        // Implementação do logout
    }
}
