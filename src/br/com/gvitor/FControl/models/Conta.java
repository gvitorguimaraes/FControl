package br.com.gvitor.FControl.models;

public class Conta {

    private String banco;
    private int numConta;
    private double saldo;

    public Conta(String banco, int numConta, double saldo){
        this.banco = banco;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Conta(){}

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
