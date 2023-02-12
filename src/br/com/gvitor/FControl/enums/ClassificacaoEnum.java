package br.com.gvitor.FControl.enums;

public enum ClassificacaoEnum {
    
    ALIMENTACAO("Alimentação"),
    TRANSPORTE("Transporte"),
    LAZER("Lazer"),
    BOLETOS("Boletos"),
    SAUDE("Saúde"),
    OUTROS("Outros");

    private String valor;

    ClassificacaoEnum(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
