package br.com.gvitor.FControl.models;

public class Usuario {

    private int id;
    private String email;
    private String senha;
    private String cpf;

    public Usuario(int id, String email, String senha, String cpf){
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public Usuario(){}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
}
