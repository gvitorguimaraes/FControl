package br.com.gvitor.FControl.models;

import java.util.Date;

public class Perfil {
    
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private double saldoTotal;
    private double saldoSaidas;
    private double saldoEntradas;

    public Perfil(String nome, Date dataNascimento, String telefone, double saldoTotal, double saldoSaidas, double saldoEntradas){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.saldoTotal = saldoTotal;
        this.saldoSaidas = saldoSaidas;
        this.saldoEntradas = saldoEntradas;
    }

    public Perfil(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoSaidas(double saldoSaidas) {
        this.saldoSaidas = saldoSaidas;
    }

    public double getSaldoSaidas() {
        return saldoSaidas;
    }

    public void setSaldoEntradas(double saldoEntradas) {
        this.saldoEntradas = saldoEntradas;
    }

    public double getSaldoEntradas() {
        return saldoEntradas;
    }
}
