package ProjetoOO.SistemaTelemedicina;

import java.util.Scanner;

abstract class Usuario {
    private int id_user;
    protected String nome = new String();
    protected String cpf = new String();
    protected String telefone = new String();
    protected String endereco = new String();
    protected String email = new String();
    protected String senha = new String();

    private static int contadorId = 0;

    public Usuario(String nome, String cpf, String telefone, String endereco, String email, String senha) {
        this.id_user = contadorId++;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    public int getId_user() {
        return id_user;
    }
    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public abstract void realizarLogin();
    
    public abstract String visualizarCadastros();
}
