package br.com.gvitor.FControl.models;

import br.com.gvitor.FControl.enums.ClassificacaoEnum;
import br.com.gvitor.FControl.enums.TipoEnum;
import java.util.Date;

public class Operacao {
    
    private Date data;
    private int id;
    private TipoEnum tipo;
    private ClassificacaoEnum classificacao;
    private double valorOperacao;
    private String titulo;
    private String descricao;
    private Conta conta;

    public Operacao(int id, TipoEnum tipo, ClassificacaoEnum classificacao, double valorOperacao, String titulo, String descricao, Conta conta){
        this.id = id;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.valorOperacao = valorOperacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.conta = conta;
    }

    public Operacao(){}

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setClassificacao(ClassificacaoEnum classificacao) {
        this.classificacao = classificacao;
    }

    public ClassificacaoEnum getClassificacao() {
        return classificacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }
}
